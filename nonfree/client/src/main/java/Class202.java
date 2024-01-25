import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class202 {

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "J")
	private long aLong176;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "J")
	private long aLong177;

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
	private Class202() {
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IJ)V")
	public void method4939(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong176 = arg0;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
	public void method4940() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!sb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method4940();
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)J")
	public long method4941() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIZ[B)I")
	public int method4942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg2, arg1, arg0);
		if (local6 > 0) {
			this.aLong176 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)Ljava/io/File;")
	public File method4943() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[BIZ)V")
	public void method4944(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aLong177 < this.aLong176 + (long) arg2) {
			this.aRandomAccessFile1.seek(this.aLong177);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg0, arg2);
			this.aLong176 += arg2;
		}
	}
}
