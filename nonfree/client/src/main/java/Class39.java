import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class39 {

	@OriginalMember(owner = "client!l", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "J")
	private final long aLong57;

	@OriginalMember(owner = "client!l", name = "c", descriptor = "J")
	private long aLong58;

	@OriginalMember(owner = "client!l", name = "d", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class39(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong57 = arg2;
		this.aLong58 = 0L;
		this.aFile1 = arg0;
		@Pc(39) int local39 = this.aRandomAccessFile1.read();
		if (local39 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local39);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)J")
	public long method1254() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(B)Ljava/io/File;")
	public File method1255() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
	public void method1256() throws IOException {
		this.aRandomAccessFile1.close();
		this.aRandomAccessFile1 = null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BI[BI)I")
	public int method1257(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg1, arg0, arg2);
		if (local6 > 0) {
			this.aLong58 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IJ)V")
	public void method1258(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong58 = arg0;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I[BIZ)V")
	public void method1259(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aLong58 + (long) arg2 > this.aLong57) {
			this.aRandomAccessFile1.seek(this.aLong57 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg0, arg2);
			this.aLong58 += arg2;
		}
	}

	@OriginalMember(owner = "client!l", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method1256();
		}
	}
}
