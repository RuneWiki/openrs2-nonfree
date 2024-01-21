import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class9 {

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "J")
	private long aLong21;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "J")
	private final long aLong20;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class9(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong21 = 0L;
		this.aLong20 = arg2;
		this.aFile1 = arg0;
		@Pc(39) int local39 = this.aRandomAccessFile1.read();
		if (local39 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local39);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IJ)V")
	public void method241(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong21 = arg0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(III[B)I")
	public int method242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg2, arg1, arg0);
		if (local6 > 0) {
			this.aLong21 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	public void method243() throws IOException {
		this.aRandomAccessFile1.close();
		this.aRandomAccessFile1 = null;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)J")
	public long method245() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(III[B)V")
	public void method246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if ((long) arg0 + this.aLong21 > this.aLong20) {
			this.aRandomAccessFile1.seek(this.aLong20 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg1, arg0);
			this.aLong21 += arg0;
		}
	}
}
