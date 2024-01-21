import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class70 {

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "Ljava/io/File;")
	private final File aFile3;

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "J")
	private final long aLong117;

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "J")
	private long aLong118;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class70(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile3 = arg0;
		this.aLong117 = arg2;
		this.aLong118 = 0L;
		@Pc(37) int local37 = this.aRandomAccessFile1.read();
		if (local37 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local37);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IJ)V")
	public void method2438(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong118 = arg0;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[BII)V")
	public void method2439(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong117 < (long) arg1 + this.aLong118) {
			this.aRandomAccessFile1.seek(this.aLong117 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg2, arg1);
			this.aLong118 += arg1;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)Ljava/io/File;")
	public File method2440() {
		return this.aFile3;
	}

	@OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile3 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2442();
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IB[BI)I")
	public int method2441(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(12) int local12 = this.aRandomAccessFile1.read(arg1, arg2, arg0);
		if (local12 > 0) {
			this.aLong118 += local12;
		}
		return local12;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	public void method2442() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)J")
	public long method2443() throws IOException {
		return this.aRandomAccessFile1.length();
	}
}
