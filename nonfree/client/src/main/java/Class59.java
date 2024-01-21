import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class59 {

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "J")
	private long aLong72;

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "J")
	private final long aLong73;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class59(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile1 = arg0;
		this.aLong72 = 0L;
		this.aLong73 = arg2;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(JB)V")
	public void method1755(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong72 = arg0;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method1756() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
	public void method1757() throws IOException {
		this.aRandomAccessFile1.close();
		this.aRandomAccessFile1 = null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[BBI)V")
	public void method1758(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong73 < this.aLong72 + (long) arg2) {
			this.aRandomAccessFile1.seek(this.aLong73 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg0, arg2);
			this.aLong72 += arg2;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[BII)I")
	public int method1759(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(13) int local13 = this.aRandomAccessFile1.read(arg0, arg2, arg1);
		if (local13 > 0) {
			this.aLong72 += local13;
		}
		return local13;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)J")
	public long method1760() throws IOException {
		return this.aRandomAccessFile1.length();
	}
}
