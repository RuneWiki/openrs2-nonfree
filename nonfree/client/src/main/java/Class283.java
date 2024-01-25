import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class283 {

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!rg", name = "l", descriptor = "J")
	private final long aLong342;

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "J")
	private long aLong341;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class283(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile1 = arg0;
		this.aLong342 = arg2;
		this.aLong341 = 0L;
		@Pc(41) int local41 = this.aRandomAccessFile1.read();
		if (local41 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local41);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!rg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method6494();
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(JB)V")
	public void method6488(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong341 = arg0;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(III[B)I")
	public int method6490(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(10) int local10 = this.aRandomAccessFile1.read(arg2, arg1, arg0);
		if (local10 > 0) {
			this.aLong341 += local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)J")
	public long method6491() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)Ljava/io/File;")
	public File method6492() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II[BI)V")
	public void method6493(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong342 < this.aLong341 + (long) arg2) {
			this.aRandomAccessFile1.seek(this.aLong342);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg0, arg2);
			this.aLong341 += arg2;
		}
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)V")
	public void method6494() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}
}
