import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class113 {

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "J")
	private long aLong91;

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "J")
	private long aLong92;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "()V")
	private Class113() {
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method2302() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(JB)V")
	public void method2303(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong91 = arg0;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I[BII)V")
	public void method2304(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong92 < this.aLong91 + (long) arg2) {
			this.aRandomAccessFile1.seek(this.aLong92);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg0, arg2);
			this.aLong91 += arg2;
		}
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(I[BII)I")
	public int method2305(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg1, arg0, arg2);
		if (local6 > 0) {
			this.aLong91 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)J")
	public long method2306() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!jp", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2307();
		}
	}

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "(I)V")
	public void method2307() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}
}
