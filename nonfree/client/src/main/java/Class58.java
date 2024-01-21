import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class58 {

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "J")
	private long aLong71;

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "J")
	private final long aLong70;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class58(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong71 = 0L;
		this.aLong70 = arg2;
		this.aFile1 = arg0;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)J")
	public long method1708() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(Z)V")
	public void method1709() throws IOException {
		this.aRandomAccessFile1.close();
		this.aRandomAccessFile1 = null;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "([BIBI)I")
	public int method1710(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local6 > 0) {
			this.aLong71 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)Ljava/io/File;")
	public File method1711() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BJ)V")
	public void method1712(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong71 = arg0;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II[BI)V")
	public void method1713(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong70 < this.aLong71 + (long) arg2) {
			this.aRandomAccessFile1.seek(this.aLong70 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg0, arg2);
			this.aLong71 += arg2;
		}
	}
}
