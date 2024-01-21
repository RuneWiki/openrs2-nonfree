import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class36 {

	@OriginalMember(owner = "client!k", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!k", name = "b", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!k", name = "c", descriptor = "J")
	private final long aLong39;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "J")
	private long aLong38;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class36(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile1 = arg0;
		this.aLong39 = arg2;
		this.aLong38 = 0L;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
	public void method887() throws IOException {
		this.aRandomAccessFile1.close();
		this.aRandomAccessFile1 = null;
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(I)J")
	public long method888() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(I)Ljava/io/File;")
	public File method889() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IJ)V")
	public void method890(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong38 = arg0;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II[BI)I")
	public int method891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg2, arg1, arg0);
		if (local6 > 0) {
			this.aLong38 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(B[BII)V")
	public void method892(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong38 + (long) arg1 > this.aLong39) {
			this.aRandomAccessFile1.seek(this.aLong39 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg2, arg1);
			this.aLong38 += arg1;
		}
	}
}
