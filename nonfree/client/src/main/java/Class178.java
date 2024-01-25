import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class178 {

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "J")
	private long aLong155;

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "J")
	private long aLong156;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
	private Class178() {
	}

	@OriginalMember(owner = "client!oh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method3779();
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(III[B)I")
	public int method3777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg2, arg0, arg1);
		if (local6 > 0) {
			this.aLong156 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(JB)V")
	public void method3778(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong156 = arg0;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
	public void method3779() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)J")
	public long method3780() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)Ljava/io/File;")
	public File method3781() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB[BI)V")
	public void method3782(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if ((long) arg0 + this.aLong156 > this.aLong155) {
			this.aRandomAccessFile1.seek(this.aLong155);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg2, arg0);
			this.aLong156 += arg0;
		}
	}
}
