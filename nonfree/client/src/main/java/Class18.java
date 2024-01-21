import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class18 {

	@OriginalMember(owner = "client!e", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "J")
	private final long aLong33;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile3;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "J")
	private long aLong34;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class18(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong33 = arg2;
		this.aFile3 = arg0;
		this.aLong34 = 0L;
		@Pc(37) int local37 = this.aRandomAccessFile1.read();
		if (local37 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local37);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)J")
	public long method477() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([BBII)I")
	public int method478(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(11) int local11 = this.aRandomAccessFile1.read(arg0, arg2, arg1);
		if (local11 > 0) {
			this.aLong34 += local11;
		}
		return local11;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZII[B)V")
	public void method479(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong33 < this.aLong34 + (long) arg1) {
			this.aRandomAccessFile1.seek(this.aLong33 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg0, arg1);
			this.aLong34 += arg1;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(JZ)V")
	public void method481(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong34 = arg0;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V")
	public void method482() throws IOException {
		this.aRandomAccessFile1.close();
		this.aRandomAccessFile1 = null;
	}
}
