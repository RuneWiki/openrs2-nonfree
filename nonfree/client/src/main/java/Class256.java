import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class256 {

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "J")
	private long aLong209;

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "J")
	private long aLong210;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
	private Class256() {
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZJ)V")
	public void method5386(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong209 = arg0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II[BZ)I")
	public int method5387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg2, arg0, arg1);
		if (local6 > 0) {
			this.aLong209 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
	public void method5388() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)J")
	public long method5389() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method5390() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "([BIII)V")
	public void method5391(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong209 + (long) arg2 > this.aLong210) {
			this.aRandomAccessFile1.seek(this.aLong210);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong209 += arg2;
		}
	}

	@OriginalMember(owner = "client!ve", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5388();
		}
	}
}
