import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class345 {

	@OriginalMember(owner = "client!td", name = "o", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!td", name = "l", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!td", name = "n", descriptor = "J")
	private final long aLong264;

	@OriginalMember(owner = "client!td", name = "g", descriptor = "J")
	private long aLong265;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class345(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile1 = arg0;
		this.aLong264 = arg2;
		this.aLong265 = 0L;
		@Pc(37) int local37 = this.aRandomAccessFile1.read();
		if (local37 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local37);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
	public void method8253() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(I)J")
	public long method8254() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(II[BI)I")
	public int method8256(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(10) int local10 = this.aRandomAccessFile1.read(arg1, arg2, arg0);
		if (local10 > 0) {
			this.aLong265 += (long) local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!td", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method8253();
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "([BZII)V")
	public void method8257(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if ((long) arg2 + this.aLong265 > this.aLong264) {
			this.aRandomAccessFile1.seek(this.aLong264);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong265 += (long) arg2;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method8258() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(JZ)V")
	public void method8259(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong265 = arg0;
	}
}
