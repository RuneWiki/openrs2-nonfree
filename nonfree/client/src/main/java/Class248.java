import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class248 {

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "J")
	private long aLong204;

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "J")
	private long aLong205;

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
	private Class248() {
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method6002() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IJ)V")
	public void method6003(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong205 = arg0;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
	public void method6004() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!wj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method6004();
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "([BIII)V")
	public void method6005(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aLong205 + (long) arg1 > this.aLong204) {
			this.aRandomAccessFile1.seek(this.aLong204);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg2, arg1);
			this.aLong205 += arg1;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I[BBI)I")
	public int method6006(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(12) int local12 = this.aRandomAccessFile1.read(arg1, arg0, arg2);
		if (local12 > 0) {
			this.aLong205 += local12;
		}
		return local12;
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)J")
	public long method6007() throws IOException {
		return this.aRandomAccessFile1.length();
	}
}
