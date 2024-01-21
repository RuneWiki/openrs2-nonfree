import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class53 {

	@OriginalMember(owner = "client!o", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!o", name = "d", descriptor = "J")
	private final long aLong60;

	@OriginalMember(owner = "client!o", name = "b", descriptor = "J")
	private long aLong59;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class53(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile1 = arg0;
		this.aLong60 = arg2;
		this.aLong59 = 0L;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)J")
	public long method1171() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)Ljava/io/File;")
	public File method1172() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(III[B)V")
	public void method1173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong60 < this.aLong59 + (long) arg1) {
			this.aRandomAccessFile1.seek(this.aLong60 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg0, arg1);
			this.aLong59 += arg1;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I[BII)I")
	public int method1174(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg1, arg0, arg2);
		if (local6 > 0) {
			this.aLong59 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
	public void method1175() throws IOException {
		this.aRandomAccessFile1.close();
		this.aRandomAccessFile1 = null;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IJ)V")
	public void method1176(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong59 = arg0;
	}
}
