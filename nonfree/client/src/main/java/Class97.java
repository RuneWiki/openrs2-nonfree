import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class97 {

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "J")
	private long aLong124;

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "J")
	private long aLong125;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)Ljava/io/File;")
	public File method2928() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(III[B)I")
	public int method2929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg2, arg0, arg1);
		if (local6 > 0) {
			this.aLong124 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZI[B)V")
	public void method2930(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong125 >= this.aLong124 + (long) arg0) {
			this.aRandomAccessFile1.write(arg2, arg1, arg0);
			this.aLong124 += arg0;
		} else {
			this.aRandomAccessFile1.seek(this.aLong125);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)V")
	public void method2931() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!ma", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2931();
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)J")
	public long method2932() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IJ)V")
	public void method2933(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong124 = arg0;
	}
}
