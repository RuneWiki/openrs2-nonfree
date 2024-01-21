import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class63 {

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "Ljava/io/File;")
	private final File aFile3;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "J")
	private long aLong77;

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "J")
	private final long aLong78;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class63(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile3 = arg0;
		this.aLong77 = 0L;
		this.aLong78 = arg2;
		@Pc(39) int local39 = this.aRandomAccessFile1.read();
		if (local39 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local39);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
	public void method1379() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)J")
	public long method1380() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "([BBII)V")
	public void method1381(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong77 + (long) arg1 > this.aLong78) {
			this.aRandomAccessFile1.seek(this.aLong78 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg2, arg1);
			this.aLong77 += arg1;
		}
	}

	@OriginalMember(owner = "client!pf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile3 + " not closed correctly using close(). Auto-closing instead. ");
			this.method1379();
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(JB)V")
	public void method1382(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong77 = arg0;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBI[B)I")
	public int method1383(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(13) int local13 = this.aRandomAccessFile1.read(arg2, arg0, arg1);
		if (local13 > 0) {
			this.aLong77 += local13;
		}
		return local13;
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)Ljava/io/File;")
	public File method1384() {
		return this.aFile3;
	}
}
