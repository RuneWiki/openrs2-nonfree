import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class268 {

	@OriginalMember(owner = "client!pk", name = "j", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!pk", name = "n", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!pk", name = "h", descriptor = "J")
	private final long aLong174;

	@OriginalMember(owner = "client!pk", name = "i", descriptor = "J")
	private long aLong175;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class268(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile1 = arg0;
		this.aLong174 = arg2;
		this.aLong175 = 0L;
		@Pc(35) int local35 = this.aRandomAccessFile1.read();
		if (local35 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local35);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(I[BII)V")
	public void method5810(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong174 < this.aLong175 + (long) arg1) {
			this.aRandomAccessFile1.seek(this.aLong174);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg2, arg1);
			this.aLong175 += arg1;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)J")
	public long method5812() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(I[BII)I")
	public int method5813(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(10) int local10 = this.aRandomAccessFile1.read(arg0, arg2, arg1);
		if (local10 > 0) {
			this.aLong175 += local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(BJ)V")
	public void method5815(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong175 = arg0;
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V")
	public void method5816() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!pk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5816();
		}
	}

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)Ljava/io/File;")
	public File method5817() {
		return this.aFile1;
	}
}
