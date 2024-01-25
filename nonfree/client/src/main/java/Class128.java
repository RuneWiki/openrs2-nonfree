import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class128 {

	@OriginalMember(owner = "client!je", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!je", name = "b", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!je", name = "c", descriptor = "J")
	private long aLong108;

	@OriginalMember(owner = "client!je", name = "d", descriptor = "J")
	private long aLong109;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
	private Class128() {
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(III[B)V")
	public void method3089(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong108 < (long) arg0 + this.aLong109) {
			this.aRandomAccessFile1.seek(this.aLong108);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg1, arg0);
			this.aLong109 += arg0;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IJ)V")
	public void method3090(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong109 = arg0;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
	public void method3091() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(B)J")
	public long method3092() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II[BZ)I")
	public int method3093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		@Pc(11) int local11 = this.aRandomAccessFile1.read(arg2, arg1, arg0);
		if (local11 > 0) {
			this.aLong109 += local11;
		}
		return local11;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method3094() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!je", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method3091();
		}
	}
}
