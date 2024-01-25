import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class148 {

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!hr", name = "q", descriptor = "J")
	private final long aLong116;

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!hr", name = "n", descriptor = "J")
	private long aLong115;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class148(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong116 = arg2;
		this.aFile1 = arg0;
		this.aLong115 = 0L;
		@Pc(35) int local35 = this.aRandomAccessFile1.read();
		if (local35 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local35);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method3368() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!hr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method3377();
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(II[BI)I")
	public int method3370(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(14) int local14 = this.aRandomAccessFile1.read(arg1, arg2, arg0);
		if (local14 > 0) {
			this.aLong115 += local14;
		}
		return local14;
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)J")
	public long method3371() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IJ)V")
	public void method3372(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong115 = arg0;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(I[BBI)V")
	public void method3373(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong116 < this.aLong115 + (long) arg0) {
			this.aRandomAccessFile1.seek(this.aLong116);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg2, arg0);
			this.aLong115 += arg0;
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Z)V")
	public void method3377() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}
}
