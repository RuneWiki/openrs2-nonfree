import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class49 {

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "J")
	private final long aLong60;

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "J")
	private long aLong61;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class49(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile1 = arg0;
		this.aLong60 = arg2;
		this.aLong61 = 0L;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method1449() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II[BI)I")
	public int method1450(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(13) int local13 = this.aRandomAccessFile1.read(arg1, arg0, arg2);
		if (local13 > 0) {
			this.aLong61 += local13;
		}
		return local13;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
	public void method1451() throws IOException {
		this.aRandomAccessFile1.close();
		this.aRandomAccessFile1 = null;
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)J")
	public long method1452() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "([BIIB)V")
	public void method1453(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aLong60 < this.aLong61 + (long) arg1) {
			this.aRandomAccessFile1.seek(this.aLong60 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg2, arg1);
			this.aLong61 += arg1;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZJ)V")
	public void method1454(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong61 = arg0;
	}
}
