import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fca")
public final class Class97 {

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "J")
	private long aLong93;

	@OriginalMember(owner = "client!fca", name = "c", descriptor = "J")
	private long aLong94;

	@OriginalMember(owner = "client!fca", name = "d", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "()V")
	private Class97() {
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(JB)V")
	public void method2496(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong94 = arg0;
	}

	@OriginalMember(owner = "client!fca", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2499();
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "([BIII)V")
	public void method2497(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong93 < (long) arg2 + this.aLong94) {
			this.aRandomAccessFile1.seek(this.aLong93);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong94 += arg2;
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method2498() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "(I)V")
	public void method2499() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!fca", name = "c", descriptor = "(I)J")
	public long method2500() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "([BIII)I")
	public int method2501(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(11) int local11 = this.aRandomAccessFile1.read(arg0, arg2, arg1);
		if (local11 > 0) {
			this.aLong94 += local11;
		}
		return local11;
	}
}
