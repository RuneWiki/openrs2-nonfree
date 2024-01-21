import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class77 {

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "J")
	private long aLong127;

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "Ljava/io/File;")
	private final File aFile3;

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "J")
	private final long aLong128;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class77(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong127 = 0L;
		this.aFile3 = arg0;
		this.aLong128 = arg2;
		@Pc(39) int local39 = this.aRandomAccessFile1.read();
		if (local39 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local39);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!sa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile3 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2432();
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
	public void method2432() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "([BIBI)V")
	public void method2433(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong128 < this.aLong127 + (long) arg2) {
			this.aRandomAccessFile1.seek(this.aLong128 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong127 += arg2;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I[BII)I")
	public int method2434(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg1, arg2, arg0);
		if (local6 > 0) {
			this.aLong127 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IJ)V")
	public void method2435(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong127 = arg0;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)Ljava/io/File;")
	public File method2436() {
		return this.aFile3;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)J")
	public long method2437() throws IOException {
		return this.aRandomAccessFile1.length();
	}
}
