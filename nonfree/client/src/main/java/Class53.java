import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class53 {

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "J")
	private final long aLong51;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile3;

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "J")
	private long aLong52;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class53(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong51 = arg2;
		this.aFile3 = arg0;
		this.aLong52 = 0L;
		@Pc(35) int local35 = this.aRandomAccessFile1.read();
		if (local35 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local35);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II[BI)V")
	public void method1238(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong51 < this.aLong52 + (long) arg0) {
			this.aRandomAccessFile1.seek(this.aLong51 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg2, arg0);
			this.aLong52 += arg0;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
	public void method1239() throws IOException {
		this.aRandomAccessFile1.close();
		this.aRandomAccessFile1 = null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)J")
	public long method1240() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I[BII)I")
	public int method1241(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local6 > 0) {
			this.aLong52 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)Ljava/io/File;")
	public File method1242() {
		return this.aFile3;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(JB)V")
	public void method1243(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong52 = arg0;
	}
}
