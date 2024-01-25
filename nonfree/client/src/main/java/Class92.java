import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class92 {

	@OriginalMember(owner = "client!el", name = "m", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!el", name = "p", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!el", name = "d", descriptor = "J")
	private long aLong68;

	@OriginalMember(owner = "client!el", name = "c", descriptor = "J")
	private final long aLong67;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class92(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile1 = arg0;
		this.aLong68 = 0L;
		this.aLong67 = arg2;
		@Pc(41) int local41 = this.aRandomAccessFile1.read();
		if (local41 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local41);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "([BIII)V")
	public void method1839(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if ((long) arg1 + this.aLong68 > this.aLong67) {
			this.aRandomAccessFile1.seek(this.aLong67);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg2, arg1);
			this.aLong68 += arg1;
		}
	}

	@OriginalMember(owner = "client!el", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method1845();
		}
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "([BIII)I")
	public int method1843(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(10) int local10 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local10 > 0) {
			this.aLong68 += local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(B)Ljava/io/File;")
	public File method1844() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
	public void method1845() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "(I)J")
	public long method1846() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IJ)V")
	public void method1847(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong68 = arg0;
	}
}
