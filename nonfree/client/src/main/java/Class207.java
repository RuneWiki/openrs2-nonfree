import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class207 {

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "J")
	private long aLong218;

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "J")
	private long aLong219;

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
	private Class207() {
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)J")
	public long method5332() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!vk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5336();
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "([BIBI)I")
	public int method5333(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg2, arg1);
		if (local6 > 0) {
			this.aLong218 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)Ljava/io/File;")
	public File method5334() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(JI)V")
	public void method5335(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong218 = arg0;
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V")
	public void method5336() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "([BBII)V")
	public void method5337(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong219 < this.aLong218 + (long) arg2) {
			this.aRandomAccessFile1.seek(this.aLong219);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong218 += arg2;
		}
	}
}
