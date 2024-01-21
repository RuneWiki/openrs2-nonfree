import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class87 {

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "J")
	private final long aLong141;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "J")
	private long aLong140;

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "Ljava/io/File;")
	private final File aFile3;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class87(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong141 = arg2;
		this.aLong140 = 0L;
		this.aFile3 = arg0;
		@Pc(41) int local41 = this.aRandomAccessFile1.read();
		if (local41 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local41);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(III[B)V")
	public void method2748(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong141 < (long) arg0 + this.aLong140) {
			this.aRandomAccessFile1.seek(this.aLong141 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg1, arg0);
			this.aLong140 += arg0;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BI[BI)I")
	public int method2749(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(13) int local13 = this.aRandomAccessFile1.read(arg1, arg2, arg0);
		if (local13 > 0) {
			this.aLong140 += local13;
		}
		return local13;
	}

	@OriginalMember(owner = "client!vh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile3 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2752();
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(JI)V")
	public void method2750(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong140 = arg0;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method2751() {
		return this.aFile3;
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
	public void method2752() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)J")
	public long method2753() throws IOException {
		return this.aRandomAccessFile1.length();
	}
}
