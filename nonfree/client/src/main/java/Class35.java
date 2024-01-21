import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class35 {

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "J")
	private final long aLong58;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "J")
	private long aLong59;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class35(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong58 = arg2;
		this.aFile1 = arg0;
		this.aLong59 = 0L;
		@Pc(37) int local37 = this.aRandomAccessFile1.read();
		if (local37 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local37);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!hh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method1286();
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)J")
	public long method1281() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)Ljava/io/File;")
	public File method1282() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(JI)V")
	public void method1283(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong59 = arg0;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I[BII)I")
	public int method1284(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg1, arg2, arg0);
		if (local6 > 0) {
			this.aLong59 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I[BII)V")
	public void method1285(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if ((long) arg2 + this.aLong59 > this.aLong58) {
			this.aRandomAccessFile1.seek(this.aLong58 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong59 += arg2;
		}
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)V")
	public void method1286() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}
}
