import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class66 {

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "J")
	private long aLong87;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile3;

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "J")
	private final long aLong88;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class66(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong87 = 0L;
		this.aFile3 = arg0;
		this.aLong88 = arg2;
		@Pc(35) int local35 = this.aRandomAccessFile1.read();
		if (local35 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local35);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!nh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile3 + " not closed correctly using close(). Auto-closing instead. ");
			this.method1839();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)J")
	public long method1838() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
	public void method1839() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(JI)V")
	public void method1840(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong87 = arg0;
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)Ljava/io/File;")
	public File method1841() {
		return this.aFile3;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(III[B)V")
	public void method1842(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if ((long) arg1 + this.aLong87 > this.aLong88) {
			this.aRandomAccessFile1.seek(this.aLong88 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg0, arg1);
			this.aLong87 += arg1;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I[BBI)I")
	public int method1843(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg1, arg2, arg0);
		if (local6 > 0) {
			this.aLong87 += local6;
		}
		return local6;
	}
}
