import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class8 {

	@OriginalMember(owner = "client!be", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!be", name = "b", descriptor = "J")
	private long aLong12;

	@OriginalMember(owner = "client!be", name = "c", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "J")
	private final long aLong11;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class8(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong12 = 0L;
		this.aFile1 = arg0;
		this.aLong11 = arg2;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II[BI)I")
	public int method262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg2, arg1, arg0);
		if (local6 > 0) {
			this.aLong12 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(B)Ljava/io/File;")
	public File method263() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)J")
	public long method264() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IJ)V")
	public void method265(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong12 = arg0;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V")
	public void method266() throws IOException {
		this.aRandomAccessFile1.close();
		this.aRandomAccessFile1 = null;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIZ[B)V")
	public void method267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong11 < (long) arg1 + this.aLong12) {
			this.aRandomAccessFile1.seek(this.aLong11 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg0, arg1);
			this.aLong12 += arg1;
		}
	}
}
