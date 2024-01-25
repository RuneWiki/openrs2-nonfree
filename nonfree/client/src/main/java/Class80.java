import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class80 {

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "J")
	private long aLong73;

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "J")
	private final long aLong74;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class80(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong73 = 0L;
		this.aFile1 = arg0;
		this.aLong74 = arg2;
		@Pc(37) int local37 = this.aRandomAccessFile1.read();
		if (local37 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local37);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IJ)V")
	public void method2117(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong73 = arg0;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
	public void method2118() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)J")
	public long method2120() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II[BI)I")
	public int method2121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		@Pc(10) int local10 = this.aRandomAccessFile1.read(arg2, arg0, arg1);
		if (local10 > 0) {
			this.aLong73 += (long) local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[BZI)V")
	public void method2122(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if ((long) arg0 + this.aLong73 > this.aLong74) {
			this.aRandomAccessFile1.seek(this.aLong74);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg2, arg0);
			this.aLong73 += (long) arg0;
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)Ljava/io/File;")
	public File method2123() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!ea", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2118();
		}
	}
}
