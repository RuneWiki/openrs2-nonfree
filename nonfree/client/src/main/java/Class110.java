import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class110 {

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "J")
	private long aLong78;

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "J")
	private long aLong79;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
	private Class110() {
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "([BIII)V")
	public void method2355(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong79 < this.aLong78 + (long) arg1) {
			this.aRandomAccessFile1.seek(this.aLong79);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg2, arg1);
			this.aLong78 += arg1;
		}
	}

	@OriginalMember(owner = "client!hi", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2357();
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(JI)V")
	public void method2356(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong78 = arg0;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
	public void method2357() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)Ljava/io/File;")
	public File method2358() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "([BIBI)I")
	public int method2359(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local6 > 0) {
			this.aLong78 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)J")
	public long method2360() throws IOException {
		return this.aRandomAccessFile1.length();
	}
}
