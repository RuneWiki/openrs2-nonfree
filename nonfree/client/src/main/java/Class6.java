import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class6 {

	@OriginalMember(owner = "client!af", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!af", name = "d", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "J")
	private long aLong7;

	@OriginalMember(owner = "client!af", name = "b", descriptor = "J")
	private final long aLong8;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class6(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile1 = arg0;
		this.aLong7 = 0L;
		this.aLong8 = arg2;
		@Pc(39) int local39 = this.aRandomAccessFile1.read();
		if (local39 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local39);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(B)J")
	public long method100() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "([BIII)V")
	public void method102(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aLong8 < (long) arg1 + this.aLong7) {
			this.aRandomAccessFile1.seek(this.aLong8 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg2, arg1);
			this.aLong7 += arg1;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(JI)V")
	public void method103(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong7 = arg0;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I[BIB)I")
	public int method104(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(12) int local12 = this.aRandomAccessFile1.read(arg1, arg0, arg2);
		if (local12 > 0) {
			this.aLong7 += local12;
		}
		return local12;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(B)V")
	public void method105() throws IOException {
		this.aRandomAccessFile1.close();
		this.aRandomAccessFile1 = null;
	}
}
