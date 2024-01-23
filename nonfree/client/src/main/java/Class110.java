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

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "J")
	private long aLong162;

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "J")
	private long aLong163;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)J")
	public long method2679() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)Ljava/io/File;")
	public File method2680() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V")
	public void method2681() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!mc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2681();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([BIIB)I")
	public int method2682(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(13) int local13 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local13 > 0) {
			this.aLong162 += local13;
		}
		return local13;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB[BI)V")
	public void method2683(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong162 + (long) arg0 <= this.aLong163) {
			this.aRandomAccessFile1.write(arg1, arg2, arg0);
			this.aLong162 += arg0;
		} else {
			this.aRandomAccessFile1.seek(this.aLong163);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(JB)V")
	public void method2684(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong162 = arg0;
	}
}
