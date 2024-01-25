import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class212 {

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "J")
	private long aLong247;

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "J")
	private long aLong248;

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
	private Class212() {
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(II[BI)V")
	public void method5530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		if (this.aLong248 < (long) arg1 + this.aLong247) {
			this.aRandomAccessFile1.seek(this.aLong248);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg0, arg1);
			this.aLong247 += arg1;
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)J")
	public long method5531() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "([BIIB)I")
	public int method5532(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(14) int local14 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local14 > 0) {
			this.aLong247 += local14;
		}
		return local14;
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V")
	public void method5533() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(JB)V")
	public void method5534(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong247 = arg0;
	}

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "(I)Ljava/io/File;")
	public File method5535() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!vk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5533();
		}
	}
}
