import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class91 {

	@OriginalMember(owner = "client!em", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!em", name = "g", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!em", name = "l", descriptor = "J")
	private final long aLong74;

	@OriginalMember(owner = "client!em", name = "b", descriptor = "J")
	private long aLong73;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class91(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile1 = arg0;
		this.aLong74 = arg2;
		this.aLong73 = 0L;
		@Pc(39) int local39 = this.aRandomAccessFile1.read();
		if (local39 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local39);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(B)V")
	public void method1833() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(II[BI)V")
	public void method1834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		if (this.aLong74 < this.aLong73 + (long) arg0) {
			this.aRandomAccessFile1.seek(this.aLong74);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg1, arg0);
			this.aLong73 += arg0;
		}
	}

	@OriginalMember(owner = "client!em", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method1833();
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method1837() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(JB)V")
	public void method1838(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong73 = arg0;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIB[B)I")
	public int method1839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(10) int local10 = this.aRandomAccessFile1.read(arg2, arg1, arg0);
		if (local10 > 0) {
			this.aLong73 += local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(I)J")
	public long method1840() throws IOException {
		return this.aRandomAccessFile1.length();
	}
}
