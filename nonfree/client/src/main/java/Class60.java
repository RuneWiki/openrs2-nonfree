import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class60 {

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "J")
	private final long aLong74;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "J")
	private long aLong73;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class60(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong74 = arg2;
		this.aFile1 = arg0;
		this.aLong73 = 0L;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I[BII)V")
	public void method1653(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aLong73 + (long) arg2 > this.aLong74) {
			this.aRandomAccessFile1.seek(this.aLong74 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg0, arg2);
			this.aLong73 += arg2;
		}
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(I[BII)I")
	public int method1654(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg2, arg1);
		if (local6 > 0) {
			this.aLong73 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(JI)V")
	public void method1655(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong73 = arg0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)J")
	public long method1656() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)Ljava/io/File;")
	public File method1657() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)V")
	public void method1658() throws IOException {
		this.aRandomAccessFile1.close();
		this.aRandomAccessFile1 = null;
	}
}
