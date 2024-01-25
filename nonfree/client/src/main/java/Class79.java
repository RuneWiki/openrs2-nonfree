import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class79 {

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!dq", name = "g", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!dq", name = "m", descriptor = "J")
	private long aLong47;

	@OriginalMember(owner = "client!dq", name = "l", descriptor = "J")
	private final long aLong46;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class79(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile1 = arg0;
		this.aLong47 = 0L;
		this.aLong46 = arg2;
		@Pc(41) int local41 = this.aRandomAccessFile1.read();
		if (local41 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local41);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(II[BI)V")
	public void method1660(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong47 + (long) arg2 > this.aLong46) {
			this.aRandomAccessFile1.seek(this.aLong46);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg0, arg2);
			this.aLong47 += arg2;
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IBI[B)I")
	public int method1661(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(15) int local15 = this.aRandomAccessFile1.read(arg2, arg1, arg0);
		if (local15 > 0) {
			this.aLong47 += local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!dq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method1662();
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V")
	public void method1662() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IJ)V")
	public void method1663(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong47 = arg0;
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(B)Ljava/io/File;")
	public File method1664() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)J")
	public long method1665() throws IOException {
		return this.aRandomAccessFile1.length();
	}
}
