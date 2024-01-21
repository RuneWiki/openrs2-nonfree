import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class48 {

	@OriginalMember(owner = "client!q", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "J")
	private final long aLong71;

	@OriginalMember(owner = "client!q", name = "d", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "J")
	private long aLong70;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class48(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong71 = arg2;
		this.aFile1 = arg0;
		this.aLong70 = 0L;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)Ljava/io/File;")
	public File method1467() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ZJ)V")
	public void method1468(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong70 = arg0;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
	public void method1469() throws IOException {
		this.aRandomAccessFile1.close();
		this.aRandomAccessFile1 = null;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "([BIIZ)V")
	public void method1470(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if ((long) arg2 + this.aLong70 > this.aLong71) {
			this.aRandomAccessFile1.seek(this.aLong71 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong70 += arg2;
		}
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(I)J")
	public long method1471() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(II[BI)I")
	public int method1472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg2, arg0, arg1);
		if (local6 > 0) {
			this.aLong70 += local6;
		}
		return local6;
	}
}
