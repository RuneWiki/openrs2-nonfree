import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class55 {

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "J")
	private final long aLong93;

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "J")
	private long aLong94;

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "Ljava/io/File;")
	private final File aFile3;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class55(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong93 = arg2;
		this.aLong94 = 0L;
		this.aFile3 = arg0;
		@Pc(37) int local37 = this.aRandomAccessFile1.read();
		if (local37 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local37);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)J")
	public long method1614() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
	public void method1615() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)Ljava/io/File;")
	public File method1616() {
		return this.aFile3;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(JI)V")
	public void method1617(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong94 = arg0;
	}

	@OriginalMember(owner = "client!pe", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile3 + " not closed correctly using close(). Auto-closing instead. ");
			this.method1615();
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([BIZI)V")
	public void method1618(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if ((long) arg1 + this.aLong94 > this.aLong93) {
			this.aRandomAccessFile1.seek(this.aLong93 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg2, arg1);
			this.aLong94 += arg1;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B[BII)I")
	public int method1619(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(11) int local11 = this.aRandomAccessFile1.read(arg0, arg2, arg1);
		if (local11 > 0) {
			this.aLong94 += local11;
		}
		return local11;
	}
}
