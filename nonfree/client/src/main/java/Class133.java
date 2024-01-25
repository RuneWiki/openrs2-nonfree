import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class133 {

	@OriginalMember(owner = "client!in", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!in", name = "b", descriptor = "J")
	private long aLong106;

	@OriginalMember(owner = "client!in", name = "c", descriptor = "J")
	private long aLong107;

	@OriginalMember(owner = "client!in", name = "d", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V")
	private Class133() {
	}

	@OriginalMember(owner = "client!in", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method3306();
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V")
	public void method3306() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(BII[B)V")
	public void method3307(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong106 < this.aLong107 + (long) arg1) {
			this.aRandomAccessFile1.seek(this.aLong106);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg0, arg1);
			this.aLong107 += arg1;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(JZ)V")
	public void method3308(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong107 = arg0;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(I[BBI)I")
	public int method3309(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(14) int local14 = this.aRandomAccessFile1.read(arg1, arg2, arg0);
		if (local14 > 0) {
			this.aLong107 += local14;
		}
		return local14;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(B)Ljava/io/File;")
	public File method3310() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(B)J")
	public long method3311() throws IOException {
		return this.aRandomAccessFile1.length();
	}
}
