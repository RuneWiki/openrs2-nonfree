import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class116 {

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "J")
	private long aLong99;

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "J")
	private long aLong100;

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
	private Class116() {
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(JI)V")
	public void method3367(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong100 = arg0;
	}

	@OriginalMember(owner = "client!hd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method3371();
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B[BII)V")
	public void method3368(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong100 + (long) arg1 > this.aLong99) {
			this.aRandomAccessFile1.seek(this.aLong99);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg2, arg1);
			this.aLong100 += arg1;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(III[B)I")
	public int method3369(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg2, arg1, arg0);
		if (local6 > 0) {
			this.aLong100 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method3370() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
	public void method3371() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)J")
	public long method3372() throws IOException {
		return this.aRandomAccessFile1.length();
	}
}
