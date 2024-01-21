import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class80 {

	@OriginalMember(owner = "client!u", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile3;

	@OriginalMember(owner = "client!u", name = "b", descriptor = "J")
	private long aLong220;

	@OriginalMember(owner = "client!u", name = "d", descriptor = "J")
	private final long aLong221;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class80(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile3 = arg0;
		this.aLong220 = 0L;
		this.aLong221 = arg2;
		@Pc(37) int local37 = this.aRandomAccessFile1.read();
		if (local37 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local37);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIB[B)V")
	public void method2556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if ((long) arg1 + this.aLong220 > this.aLong221) {
			this.aRandomAccessFile1.seek(this.aLong221 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg0, arg1);
			this.aLong220 += arg1;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)J")
	public long method2557() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(JI)V")
	public void method2558(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong220 = arg0;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I[BII)I")
	public int method2559(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(11) int local11 = this.aRandomAccessFile1.read(arg0, arg2, arg1);
		if (local11 > 0) {
			this.aLong220 += local11;
		}
		return local11;
	}

	@OriginalMember(owner = "client!u", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile3 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2561();
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(I)Ljava/io/File;")
	public File method2560() {
		return this.aFile3;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V")
	public void method2561() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}
}
