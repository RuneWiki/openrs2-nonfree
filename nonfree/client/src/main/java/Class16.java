import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class16 {

	@OriginalMember(owner = "client!da", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!da", name = "d", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "J")
	private long aLong11;

	@OriginalMember(owner = "client!da", name = "c", descriptor = "J")
	private final long aLong12;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class16(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile1 = arg0;
		this.aLong11 = 0L;
		this.aLong12 = arg2;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
	public void method345() throws IOException {
		this.aRandomAccessFile1.close();
		this.aRandomAccessFile1 = null;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B)Ljava/io/File;")
	public File method346() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IB[BI)I")
	public int method347(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(13) int local13 = this.aRandomAccessFile1.read(arg1, arg2, arg0);
		if (local13 > 0) {
			this.aLong11 += local13;
		}
		return local13;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(JI)V")
	public void method348(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong11 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Z[BII)V")
	public void method349(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong12 < (long) arg2 + this.aLong11) {
			this.aRandomAccessFile1.seek(this.aLong12 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong11 += arg2;
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(B)J")
	public long method350() throws IOException {
		return this.aRandomAccessFile1.length();
	}
}
