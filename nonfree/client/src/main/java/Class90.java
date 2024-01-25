import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class90 {

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "J")
	private long aLong90;

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "J")
	private long aLong91;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
	private Class90() {
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(JZ)V")
	public void method2562(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong90 = arg0;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)Ljava/io/File;")
	public File method2563() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZI[B)V")
	public void method2564(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong91 < (long) arg0 + this.aLong90) {
			this.aRandomAccessFile1.seek(this.aLong91);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg1, arg0);
			this.aLong90 += arg0;
		}
	}

	@OriginalMember(owner = "client!ib", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2565();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
	public void method2565() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III[B)I")
	public int method2566(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(12) int local12 = this.aRandomAccessFile1.read(arg2, arg0, arg1);
		if (local12 > 0) {
			this.aLong90 += local12;
		}
		return local12;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)J")
	public long method2567() throws IOException {
		return this.aRandomAccessFile1.length();
	}
}
