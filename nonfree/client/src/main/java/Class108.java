import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class108 {

	@OriginalMember(owner = "client!im", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!im", name = "b", descriptor = "J")
	private long aLong69;

	@OriginalMember(owner = "client!im", name = "c", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!im", name = "d", descriptor = "J")
	private long aLong70;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V")
	private Class108() {
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
	public void method2207() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!im", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2207();
		}
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(I)Ljava/io/File;")
	public File method2208() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Z[BII)V")
	public void method2209(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong70 < (long) arg1 + this.aLong69) {
			this.aRandomAccessFile1.seek(this.aLong70);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg2, arg1);
			this.aLong69 += arg1;
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(B)J")
	public long method2210() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "([BIII)I")
	public int method2211(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(13) int local13 = this.aRandomAccessFile1.read(arg0, arg2, arg1);
		if (local13 > 0) {
			this.aLong69 += local13;
		}
		return local13;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IJ)V")
	public void method2212(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong69 = arg0;
	}
}
