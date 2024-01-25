import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!laa")
public final class Class177 {

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "J")
	private long aLong201;

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "J")
	private long aLong202;

	@OriginalMember(owner = "client!laa", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!laa", name = "d", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!laa", name = "<init>", descriptor = "()V")
	private Class177() {
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(I[BII)I")
	public int method4406(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg1, arg2, arg0);
		if (local6 > 0) {
			this.aLong201 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method4407() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(BI[BI)V")
	public void method4408(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong202 < this.aLong201 + (long) arg0) {
			this.aRandomAccessFile1.seek(this.aLong202);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg2, arg0);
			this.aLong201 += arg0;
		}
	}

	@OriginalMember(owner = "client!laa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method4411();
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(JZ)V")
	public void method4409(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong201 = arg0;
	}

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "(I)J")
	public long method4410() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!laa", name = "c", descriptor = "(I)V")
	public void method4411() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}
}
