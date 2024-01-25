import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class108 {

	@OriginalMember(owner = "client!fn", name = "r", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "J")
	private long aLong57;

	@OriginalMember(owner = "client!fn", name = "h", descriptor = "J")
	private final long aLong58;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class108(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile1 = arg0;
		this.aLong57 = 0L;
		this.aLong58 = arg2;
		@Pc(35) int local35 = this.aRandomAccessFile1.read();
		if (local35 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local35);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method2445() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "([BIII)V")
	public void method2447(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong57 + (long) arg2 > this.aLong58) {
			this.aRandomAccessFile1.seek(this.aLong58);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong57 += arg2;
		}
	}

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "(I)J")
	public long method2449() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(JB)V")
	public void method2450(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong57 = arg0;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(BII[B)I")
	public int method2451(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(16) int local16 = this.aRandomAccessFile1.read(arg2, arg0, arg1);
		if (local16 > 0) {
			this.aLong57 += local16;
		}
		return local16;
	}

	@OriginalMember(owner = "client!fn", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2453();
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)V")
	public void method2453() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}
}
