import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class110 {

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "J")
	private long aLong130;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "J")
	private long aLong131;

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IJ)V")
	public void method3093(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong131 = arg0;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[BII)V")
	public void method3094(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong131 + (long) arg2 > this.aLong130) {
			this.aRandomAccessFile1.seek(this.aLong130);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg0, arg2);
			this.aLong131 += arg2;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)Ljava/io/File;")
	public File method3095() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)J")
	public long method3096() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!mc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method3098();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II[BI)I")
	public int method3097(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg1, arg0, arg2);
		if (local6 > 0) {
			this.aLong131 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
	public void method3098() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}
}
