import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class220 {

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "J")
	private long aLong209;

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "J")
	private long aLong210;

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
	private Class220() {
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)Ljava/io/File;")
	public File method5185() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIZ[B)I")
	public int method5186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(11) int local11 = this.aRandomAccessFile1.read(arg2, arg1, arg0);
		if (local11 > 0) {
			this.aLong210 += local11;
		}
		return local11;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II[BI)V")
	public void method5187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		if ((long) arg0 + this.aLong210 > this.aLong209) {
			this.aRandomAccessFile1.seek(this.aLong209);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg1, arg0);
			this.aLong210 += arg0;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(JZ)V")
	public void method5188(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong210 = arg0;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)J")
	public long method5189() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(B)V")
	public void method5190() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!sf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5190();
		}
	}
}
