import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vba")
public final class Class337 {

	@OriginalMember(owner = "client!vba", name = "j", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!vba", name = "l", descriptor = "J")
	private final long aLong255;

	@OriginalMember(owner = "client!vba", name = "c", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!vba", name = "h", descriptor = "J")
	private long aLong254;

	@OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class337(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong255 = arg2;
		this.aFile1 = arg0;
		this.aLong254 = 0L;
		@Pc(37) int local37 = this.aRandomAccessFile1.read();
		if (local37 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local37);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(JI)V")
	public void method7962(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong254 = arg0;
	}

	@OriginalMember(owner = "client!vba", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method7966();
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(III[B)I")
	public int method7964(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(17) int local17 = this.aRandomAccessFile1.read(arg2, arg0, arg1);
		if (local17 > 0) {
			this.aLong254 += local17;
		}
		return local17;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(I[BII)V")
	public void method7965(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aLong254 + (long) arg2 > this.aLong255) {
			this.aRandomAccessFile1.seek(this.aLong255);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg0, arg2);
			this.aLong254 += arg2;
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(B)V")
	public void method7966() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "(I)Ljava/io/File;")
	public File method7968() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!vba", name = "c", descriptor = "(I)J")
	public long method7969() throws IOException {
		return this.aRandomAccessFile1.length();
	}
}
