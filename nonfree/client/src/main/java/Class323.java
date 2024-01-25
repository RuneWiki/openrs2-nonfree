import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class323 {

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!wr", name = "h", descriptor = "J")
	private final long aLong284;

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "J")
	private long aLong283;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class323(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile1 = arg0;
		this.aLong284 = arg2;
		this.aLong283 = 0L;
		@Pc(35) int local35 = this.aRandomAccessFile1.read();
		if (local35 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local35);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)V")
	public void method7794() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I[BIZ)V")
	public void method7795(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aLong284 < (long) arg0 + this.aLong283) {
			this.aRandomAccessFile1.seek(this.aLong284);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg2, arg0);
			this.aLong283 += arg0;
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Z)Ljava/io/File;")
	public File method7796() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I[BII)I")
	public int method7797(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(15) int local15 = this.aRandomAccessFile1.read(arg1, arg0, arg2);
		if (local15 > 0) {
			this.aLong283 += local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IJ)V")
	public void method7798(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong283 = arg0;
	}

	@OriginalMember(owner = "client!wr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method7794();
		}
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(B)J")
	public long method7799() throws IOException {
		return this.aRandomAccessFile1.length();
	}
}
