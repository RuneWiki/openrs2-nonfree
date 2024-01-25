import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class312 {

	@OriginalMember(owner = "client!ro", name = "k", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!ro", name = "m", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!ro", name = "i", descriptor = "J")
	private long aLong240;

	@OriginalMember(owner = "client!ro", name = "g", descriptor = "J")
	private final long aLong239;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class312(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile1 = arg0;
		this.aLong240 = 0L;
		this.aLong239 = arg2;
		@Pc(39) int local39 = this.aRandomAccessFile1.read();
		if (local39 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local39);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V")
	public void method6838() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(II[BI)I")
	public int method6839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		@Pc(10) int local10 = this.aRandomAccessFile1.read(arg2, arg1, arg0);
		if (local10 > 0) {
			this.aLong240 += (long) local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ro", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method6838();
		}
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(II[BI)V")
	public void method6840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		if (this.aLong240 + (long) arg0 > this.aLong239) {
			this.aRandomAccessFile1.seek(this.aLong239);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg1, arg0);
			this.aLong240 += (long) arg0;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BJ)V")
	public void method6841(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong240 = arg0;
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)Ljava/io/File;")
	public File method6842() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "(I)J")
	public long method6844() throws IOException {
		return this.aRandomAccessFile1.length();
	}
}
