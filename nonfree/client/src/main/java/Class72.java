import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class72 {

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "J")
	private final long aLong129;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "J")
	private long aLong130;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class72(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile1 = arg0;
		this.aLong129 = arg2;
		this.aLong130 = 0L;
		@Pc(35) int local35 = this.aRandomAccessFile1.read();
		if (local35 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local35);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)J")
	public long method1968() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IJ)V")
	public void method1969(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong130 = arg0;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III[B)I")
	public int method1970(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(12) int local12 = this.aRandomAccessFile1.read(arg2, arg0, arg1);
		if (local12 > 0) {
			this.aLong130 += local12;
		}
		return local12;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "([BIBI)V")
	public void method1971(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong130 + (long) arg2 > this.aLong129) {
			this.aRandomAccessFile1.seek(this.aLong129 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong130 += arg2;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
	public void method1972() throws IOException {
		this.aRandomAccessFile1.close();
		this.aRandomAccessFile1 = null;
	}
}
