import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class133 {

	@OriginalMember(owner = "client!hh", name = "l", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "J")
	private final long aLong89;

	@OriginalMember(owner = "client!hh", name = "n", descriptor = "J")
	private long aLong90;

	@OriginalMember(owner = "client!hh", name = "m", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class133(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong89 = arg2;
		this.aLong90 = 0L;
		this.aFile1 = arg0;
		@Pc(35) int local35 = this.aRandomAccessFile1.read();
		if (local35 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local35);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(JI)V")
	public void method2784(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong90 = arg0;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "([BIII)V")
	public void method2786(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong90 + (long) arg2 > this.aLong89) {
			this.aRandomAccessFile1.seek(this.aLong89);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong90 += arg2;
		}
	}

	@OriginalMember(owner = "client!hh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2788();
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "([BBII)I")
	public int method2787(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(10) int local10 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local10 > 0) {
			this.aLong90 += local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
	public void method2788() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)J")
	public long method2789() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)Ljava/io/File;")
	public File method2790() {
		return this.aFile1;
	}
}
