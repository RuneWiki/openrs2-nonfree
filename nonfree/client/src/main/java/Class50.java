import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class50 {

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "J")
	private long aLong55;

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "J")
	private long aLong56;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I[BIB)I")
	public int method1250(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(13) int local13 = this.aRandomAccessFile1.read(arg1, arg2, arg0);
		if (local13 > 0) {
			this.aLong55 += local13;
		}
		return local13;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(B[BII)V")
	public void method1251(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong55 + (long) arg2 > this.aLong56) {
			this.aRandomAccessFile1.seek(this.aLong56);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong55 += arg2;
		}
	}

	@OriginalMember(owner = "client!fk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method1254();
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)J")
	public long method1252() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)Ljava/io/File;")
	public File method1253() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
	public void method1254() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(JB)V")
	public void method1255(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong55 = arg0;
	}
}
