import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class54 {

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "J")
	private final long aLong79;

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "J")
	private long aLong80;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class54(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong79 = arg2;
		this.aFile1 = arg0;
		this.aLong80 = 0L;
		@Pc(35) int local35 = this.aRandomAccessFile1.read();
		if (local35 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local35);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)Ljava/io/File;")
	public File method1583() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)J")
	public long method1584() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II[BB)I")
	public int method1585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		@Pc(12) int local12 = this.aRandomAccessFile1.read(arg2, arg1, arg0);
		if (local12 > 0) {
			this.aLong80 += local12;
		}
		return local12;
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)V")
	public void method1586() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(JB)V")
	public void method1587(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong80 = arg0;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II[BI)V")
	public void method1588(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong79 < this.aLong80 + (long) arg2) {
			this.aRandomAccessFile1.seek(this.aLong79 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg0, arg2);
			this.aLong80 += arg2;
		}
	}

	@OriginalMember(owner = "client!oe", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method1586();
		}
	}
}
