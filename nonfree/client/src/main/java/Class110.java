import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class110 {

	@OriginalMember(owner = "client!k", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!k", name = "b", descriptor = "J")
	private long aLong105;

	@OriginalMember(owner = "client!k", name = "c", descriptor = "J")
	private long aLong106;

	@OriginalMember(owner = "client!k", name = "d", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V")
	private Class110() {
	}

	@OriginalMember(owner = "client!k", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method3079();
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
	public void method3079() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IZI[B)V")
	public void method3080(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong105 < this.aLong106 + (long) arg0) {
			this.aRandomAccessFile1.seek(this.aLong105);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg1, arg0);
			this.aLong106 += arg0;
		}
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(B)J")
	public long method3081() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BI[BI)I")
	public int method3082(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(13) int local13 = this.aRandomAccessFile1.read(arg1, arg0, arg2);
		if (local13 > 0) {
			this.aLong106 += local13;
		}
		return local13;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method3083() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(JB)V")
	public void method3084(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong106 = arg0;
	}
}
