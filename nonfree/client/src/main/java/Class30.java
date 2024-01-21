import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class30 {

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "J")
	private final long aLong39;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "J")
	private long aLong38;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class30(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong39 = arg2;
		this.aFile1 = arg0;
		this.aLong38 = 0L;
		@Pc(37) int local37 = this.aRandomAccessFile1.read();
		if (local37 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local37);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
	public void method969() throws IOException {
		this.aRandomAccessFile1.close();
		this.aRandomAccessFile1 = null;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(JB)V")
	public void method971(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong38 = arg0;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II[BI)I")
	public int method972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg2, arg0, arg1);
		if (local6 > 0) {
			this.aLong38 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([BIII)V")
	public void method973(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong39 < (long) arg2 + this.aLong38) {
			this.aRandomAccessFile1.seek(this.aLong39 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong38 += arg2;
		}
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)J")
	public long method974() throws IOException {
		return this.aRandomAccessFile1.length();
	}
}
