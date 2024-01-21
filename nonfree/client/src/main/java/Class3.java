import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3 {

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "J")
	private final long aLong11;

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "J")
	private long aLong12;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class3(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile1 = arg0;
		this.aLong11 = arg2;
		this.aLong12 = 0L;
		@Pc(37) int local37 = this.aRandomAccessFile1.read();
		if (local37 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local37);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
	public void method100() throws IOException {
		this.aRandomAccessFile1.close();
		this.aRandomAccessFile1 = null;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II[BI)V")
	public void method101(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong11 < (long) arg0 + this.aLong12) {
			this.aRandomAccessFile1.seek(this.aLong11 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg2, arg0);
			this.aLong12 += arg0;
		}
	}

	@OriginalMember(owner = "client!ab", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method100();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(JI)V")
	public void method102(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong12 = arg0;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)J")
	public long method104() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "([BIZI)I")
	public int method105(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local6 > 0) {
			this.aLong12 += local6;
		}
		return local6;
	}
}
