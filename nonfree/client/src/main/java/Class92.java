import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class92 {

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "J")
	private long aLong89;

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "J")
	private long aLong90;

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
	private Class92() {
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)J")
	public long method2382() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)Ljava/io/File;")
	public File method2383() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!ih", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2387();
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "([BBII)I")
	public int method2384(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(12) int local12 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local12 > 0) {
			this.aLong90 += local12;
		}
		return local12;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IJ)V")
	public void method2385(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong90 = arg0;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZI[B)V")
	public void method2386(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong90 + (long) arg1 > this.aLong89) {
			this.aRandomAccessFile1.seek(this.aLong89);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg0, arg1);
			this.aLong90 += arg1;
		}
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V")
	public void method2387() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}
}
