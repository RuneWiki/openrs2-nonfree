import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class52 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "J")
	private final long aLong62;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "J")
	private long aLong61;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class52(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong62 = arg2;
		this.aLong61 = 0L;
		this.aFile1 = arg0;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)J")
	public long method1258() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)Ljava/io/File;")
	public File method1259() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB[BI)V")
	public void method1260(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong62 < (long) arg0 + this.aLong61) {
			this.aRandomAccessFile1.seek(this.aLong62 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg2, arg0);
			this.aLong61 += arg0;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[BII)I")
	public int method1261(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg1, arg0, arg2);
		if (local6 > 0) {
			this.aLong61 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IJ)V")
	public void method1262(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong61 = arg0;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(Z)V")
	public void method1263() throws IOException {
		this.aRandomAccessFile1.close();
		this.aRandomAccessFile1 = null;
	}
}
