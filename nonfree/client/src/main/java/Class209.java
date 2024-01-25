import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class209 {

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "J")
	private long aLong213;

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "J")
	private long aLong214;

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "()V")
	private Class209() {
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I[BIZ)V")
	public void method5625(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aLong213 + (long) arg0 > this.aLong214) {
			this.aRandomAccessFile1.seek(this.aLong214);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg2, arg0);
			this.aLong213 += arg0;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method5626() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I[BII)I")
	public int method5627(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local6 > 0) {
			this.aLong213 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!vn", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5628();
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V")
	public void method5628() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(B)J")
	public long method5629() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(JZ)V")
	public void method5630(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong213 = arg0;
	}
}
