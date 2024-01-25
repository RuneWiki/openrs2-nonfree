import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class237 {

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "J")
	private long aLong197;

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "J")
	private long aLong198;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "()V")
	private Class237() {
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)Ljava/io/File;")
	public File method5207() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(B[BII)V")
	public void method5208(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if ((long) arg1 + this.aLong197 > this.aLong198) {
			this.aRandomAccessFile1.seek(this.aLong198);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg2, arg1);
			this.aLong197 += arg1;
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I[BII)I")
	public int method5209(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(12) int local12 = this.aRandomAccessFile1.read(arg0, arg2, arg1);
		if (local12 > 0) {
			this.aLong197 += local12;
		}
		return local12;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZJ)V")
	public void method5210(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong197 = arg0;
	}

	@OriginalMember(owner = "client!vl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5212();
		}
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)J")
	public long method5211() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(B)V")
	public void method5212() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}
}
