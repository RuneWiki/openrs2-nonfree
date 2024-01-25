import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class130 {

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "J")
	private long aLong112;

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "J")
	private long aLong113;

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
	private Class130() {
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BJ)V")
	public void method3569(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong113 = arg0;
	}

	@OriginalMember(owner = "client!mi", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method3574();
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "([BIII)V")
	public void method3570(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong113 + (long) arg1 > this.aLong112) {
			this.aRandomAccessFile1.seek(this.aLong112);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg2, arg1);
			this.aLong113 += arg1;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)Ljava/io/File;")
	public File method3571() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II[BI)I")
	public int method3572(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg1, arg2, arg0);
		if (local6 > 0) {
			this.aLong113 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)J")
	public long method3573() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
	public void method3574() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}
}
