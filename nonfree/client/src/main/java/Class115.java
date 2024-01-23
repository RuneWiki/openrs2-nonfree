import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class115 {

	@OriginalMember(owner = "client!n", name = "a", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!n", name = "b", descriptor = "J")
	private long aLong107;

	@OriginalMember(owner = "client!n", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!n", name = "d", descriptor = "J")
	private long aLong108;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)J")
	public long method2604() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)Ljava/io/File;")
	public File method2605() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ZJ)V")
	public void method2606(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong108 = arg0;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II[BI)I")
	public int method2607(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(13) int local13 = this.aRandomAccessFile1.read(arg1, arg0, arg2);
		if (local13 > 0) {
			this.aLong108 += local13;
		}
		return local13;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
	public void method2608() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "([BIIB)V")
	public void method2609(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if ((long) arg1 + this.aLong108 <= this.aLong107) {
			this.aRandomAccessFile1.write(arg0, arg2, arg1);
			this.aLong108 += arg1;
		} else {
			this.aRandomAccessFile1.seek(this.aLong107);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!n", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2608();
		}
	}
}
