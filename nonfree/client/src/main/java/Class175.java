import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class175 {

	@OriginalMember(owner = "client!jn", name = "g", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!jn", name = "l", descriptor = "J")
	private long aLong155;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "J")
	private final long aLong154;

	@OriginalMember(owner = "client!jn", name = "i", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class175(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong155 = 0L;
		this.aLong154 = arg2;
		this.aFile1 = arg0;
		@Pc(35) int local35 = this.aRandomAccessFile1.read();
		if (local35 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local35);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!jn", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method4462();
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)J")
	public long method4458() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IJ)V")
	public void method4460(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong155 = arg0;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V")
	public void method4462() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)Ljava/io/File;")
	public File method4463() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IZI[B)V")
	public void method4464(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong155 + (long) arg0 > this.aLong154) {
			this.aRandomAccessFile1.seek(this.aLong154);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg1, arg0);
			this.aLong155 += arg0;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(III[B)I")
	public int method4466(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(15) int local15 = this.aRandomAccessFile1.read(arg2, arg1, arg0);
		if (local15 > 0) {
			this.aLong155 += local15;
		}
		return local15;
	}
}
