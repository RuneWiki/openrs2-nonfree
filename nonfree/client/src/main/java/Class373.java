import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class373 {

	@OriginalMember(owner = "client!vm", name = "m", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!vm", name = "r", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!vm", name = "h", descriptor = "J")
	private long aLong293;

	@OriginalMember(owner = "client!vm", name = "p", descriptor = "J")
	private final long aLong294;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class373(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile1 = arg0;
		this.aLong293 = 0L;
		this.aLong294 = arg2;
		@Pc(37) int local37 = this.aRandomAccessFile1.read();
		if (local37 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local37);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)J")
	public long method8635() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I[BIZ)I")
	public int method8637(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(10) int local10 = this.aRandomAccessFile1.read(arg1, arg2, arg0);
		if (local10 > 0) {
			this.aLong293 += (long) local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "([BIBI)V")
	public void method8638(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if ((long) arg1 + this.aLong293 > this.aLong294) {
			this.aRandomAccessFile1.seek(this.aLong294);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg2, arg1);
			this.aLong293 += (long) arg1;
		}
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)Ljava/io/File;")
	public File method8640() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(B)V")
	public void method8641() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!vm", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method8641();
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BJ)V")
	public void method8644(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong293 = arg0;
	}
}
