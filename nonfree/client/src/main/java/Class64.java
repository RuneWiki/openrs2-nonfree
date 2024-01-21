import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class64 {

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "J")
	private long aLong67;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "J")
	private final long aLong66;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class64(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile1 = arg0;
		this.aLong67 = 0L;
		this.aLong66 = arg2;
		@Pc(37) int local37 = this.aRandomAccessFile1.read();
		if (local37 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local37);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!pc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method1384();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI[BI)V")
	public void method1381(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong67 + (long) arg2 > this.aLong66) {
			this.aRandomAccessFile1.seek(this.aLong66 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg0, arg2);
			this.aLong67 += arg2;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IJ)V")
	public void method1382(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong67 = arg0;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([BBII)I")
	public int method1383(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg2, arg1);
		if (local6 > 0) {
			this.aLong67 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
	public void method1384() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)J")
	public long method1385() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)Ljava/io/File;")
	public File method1386() {
		return this.aFile1;
	}
}
