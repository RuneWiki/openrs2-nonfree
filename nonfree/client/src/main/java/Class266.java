import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class266 {

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "J")
	private long aLong227;

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "J")
	private long aLong228;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
	private Class266() {
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)J")
	public long method5673() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V")
	public void method5674() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)Ljava/io/File;")
	public File method5675() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IJ)V")
	public void method5676(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong227 = arg0;
	}

	@OriginalMember(owner = "client!wi", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5674();
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I[BII)I")
	public int method5677(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg1, arg0, arg2);
		if (local6 > 0) {
			this.aLong227 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(III[B)V")
	public void method5678(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong228 < this.aLong227 + (long) arg1) {
			this.aRandomAccessFile1.seek(this.aLong228);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg0, arg1);
			this.aLong227 += arg1;
		}
	}
}
