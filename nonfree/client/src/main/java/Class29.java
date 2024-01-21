import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class29 {

	@OriginalMember(owner = "client!id", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "J")
	private long aLong51;

	@OriginalMember(owner = "client!id", name = "d", descriptor = "J")
	private final long aLong52;

	@OriginalMember(owner = "client!id", name = "c", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class29(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong51 = 0L;
		this.aLong52 = arg2;
		this.aFile1 = arg0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(JB)V")
	public void method908(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong51 = arg0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)J")
	public long method909() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I[BBI)I")
	public int method910(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg1, arg2, arg0);
		if (local6 > 0) {
			this.aLong51 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)Ljava/io/File;")
	public File method911() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(B)V")
	public void method912() throws IOException {
		this.aRandomAccessFile1.close();
		this.aRandomAccessFile1 = null;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "([BIII)V")
	public void method913(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong52 < this.aLong51 + (long) arg2) {
			this.aRandomAccessFile1.seek(this.aLong52 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong51 += arg2;
		}
	}
}
