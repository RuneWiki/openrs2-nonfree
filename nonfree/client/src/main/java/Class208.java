import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class208 {

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "J")
	private long aLong168;

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "J")
	private long aLong169;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
	private Class208() {
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)Ljava/io/File;")
	public File method5700() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I[BIB)V")
	public void method5701(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if ((long) arg2 + this.aLong168 > this.aLong169) {
			this.aRandomAccessFile1.seek(this.aLong169);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg0, arg2);
			this.aLong168 += arg2;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)J")
	public long method5702() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!ob", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5704();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IJ)V")
	public void method5703(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong168 = arg0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
	public void method5704() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z[BII)I")
	public int method5705(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local6 > 0) {
			this.aLong168 += local6;
		}
		return local6;
	}
}
