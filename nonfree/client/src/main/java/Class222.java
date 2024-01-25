import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class222 {

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "J")
	private long aLong186;

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "J")
	private long aLong187;

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
	private Class222() {
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(II[BI)I")
	public int method4983(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg1, arg0, arg2);
		if (local6 > 0) {
			this.aLong187 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)J")
	public long method4984() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method4985() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!sh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method4988();
		}
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(II[BI)V")
	public void method4986(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong186 < (long) arg0 + this.aLong187) {
			this.aRandomAccessFile1.seek(this.aLong186);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg2, arg0);
			this.aLong187 += arg0;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IJ)V")
	public void method4987(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong187 = arg0;
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V")
	public void method4988() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}
}
