import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class31 {

	@OriginalMember(owner = "client!bi", name = "p", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!bi", name = "k", descriptor = "J")
	private long aLong26;

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "J")
	private final long aLong25;

	@OriginalMember(owner = "client!bi", name = "n", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class31(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong26 = 0L;
		this.aLong25 = arg2;
		this.aFile1 = arg0;
		@Pc(37) int local37 = this.aRandomAccessFile1.read();
		if (local37 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local37);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IJ)V")
	public void method1001(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong26 = arg0;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)J")
	public long method1003() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BI[BI)I")
	public int method1004(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(10) int local10 = this.aRandomAccessFile1.read(arg1, arg0, arg2);
		if (local10 > 0) {
			this.aLong26 += local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "([BIBI)V")
	public void method1005(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong25 < this.aLong26 + (long) arg1) {
			this.aRandomAccessFile1.seek(this.aLong25);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg2, arg1);
			this.aLong26 += arg1;
		}
	}

	@OriginalMember(owner = "client!bi", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method1007();
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V")
	public void method1007() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)Ljava/io/File;")
	public File method1008() {
		return this.aFile1;
	}
}
