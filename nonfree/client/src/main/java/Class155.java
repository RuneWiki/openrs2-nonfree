import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class155 {

	@OriginalMember(owner = "client!ip", name = "h", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!ip", name = "e", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!ip", name = "k", descriptor = "J")
	private final long aLong96;

	@OriginalMember(owner = "client!ip", name = "m", descriptor = "J")
	private long aLong97;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class155(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile1 = arg0;
		this.aLong96 = arg2;
		this.aLong97 = 0L;
		@Pc(41) int local41 = this.aRandomAccessFile1.read();
		if (local41 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local41);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z[BII)I")
	public int method4074(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(10) int local10 = this.aRandomAccessFile1.read(arg0, arg2, arg1);
		if (local10 > 0) {
			this.aLong97 += local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)J")
	public long method4076() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
	public void method4077() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(JI)V")
	public void method4078(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong97 = arg0;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(II[BI)V")
	public void method4079(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong96 < this.aLong97 + (long) arg0) {
			this.aRandomAccessFile1.seek(this.aLong96);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg2, arg0);
			this.aLong97 += arg0;
		}
	}

	@OriginalMember(owner = "client!ip", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method4077();
		}
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(B)Ljava/io/File;")
	public File method4080() {
		return this.aFile1;
	}
}
