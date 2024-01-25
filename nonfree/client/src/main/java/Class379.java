import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ww")
public final class Class379 {

	@OriginalMember(owner = "client!ww", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!ww", name = "n", descriptor = "J")
	private long aLong284;

	@OriginalMember(owner = "client!ww", name = "m", descriptor = "J")
	private final long aLong283;

	@OriginalMember(owner = "client!ww", name = "i", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class379(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong284 = 0L;
		this.aLong283 = arg2;
		this.aFile1 = arg0;
		@Pc(39) int local39 = this.aRandomAccessFile1.read();
		if (local39 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local39);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(B)J")
	public long method8627() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "(B)V")
	public void method8628() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(II[BI)V")
	public void method8632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		if ((long) arg1 + this.aLong284 > this.aLong283) {
			this.aRandomAccessFile1.seek(this.aLong283);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg0, arg1);
			this.aLong284 += arg1;
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(JB)V")
	public void method8633(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong284 = arg0;
	}

	@OriginalMember(owner = "client!ww", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method8628();
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "([BIBI)I")
	public int method8634(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(10) int local10 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local10 > 0) {
			this.aLong284 += local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ww", name = "c", descriptor = "(B)Ljava/io/File;")
	public File method8636() {
		return this.aFile1;
	}
}
