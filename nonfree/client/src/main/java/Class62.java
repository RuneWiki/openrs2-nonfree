import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class62 {

	@OriginalMember(owner = "client!cr", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!cr", name = "m", descriptor = "J")
	private final long aLong39;

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!cr", name = "i", descriptor = "J")
	private long aLong38;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class62(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong39 = arg2;
		this.aFile1 = arg0;
		this.aLong38 = 0L;
		@Pc(35) int local35 = this.aRandomAccessFile1.read();
		if (local35 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local35);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)J")
	public long method1253() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIB[B)I")
	public int method1254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(10) int local10 = this.aRandomAccessFile1.read(arg2, arg0, arg1);
		if (local10 > 0) {
			this.aLong38 += (long) local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)V")
	public void method1255() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!cr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method1255();
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Z)Ljava/io/File;")
	public File method1256() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(III[B)V")
	public void method1259(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong39 < this.aLong38 + (long) arg1) {
			this.aRandomAccessFile1.seek(this.aLong39);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg0, arg1);
			this.aLong38 += (long) arg1;
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(JB)V")
	public void method1261(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong38 = arg0;
	}
}
