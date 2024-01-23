import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class35 {

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "J")
	private long aLong37;

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "J")
	private long aLong38;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)J")
	public long method778() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
	public void method779() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!dd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method779();
		}
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)Ljava/io/File;")
	public File method780() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IJ)V")
	public void method781(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong38 = arg0;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(III[B)V")
	public void method782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if ((long) arg1 + this.aLong38 <= this.aLong37) {
			this.aRandomAccessFile1.write(arg2, arg0, arg1);
			this.aLong38 += arg1;
		} else {
			this.aRandomAccessFile1.seek(this.aLong37);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[BIZ)I")
	public int method783(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(10) int local10 = this.aRandomAccessFile1.read(arg1, arg2, arg0);
		if (local10 > 0) {
			this.aLong38 += local10;
		}
		return local10;
	}
}
