import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rv")
public final class Class220 {

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "J")
	private long aLong180;

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "J")
	private long aLong181;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "()V")
	private Class220() {
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(III[B)V")
	public void method4582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if ((long) arg0 + this.aLong180 > this.aLong181) {
			this.aRandomAccessFile1.seek(this.aLong181);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg1, arg0);
			this.aLong180 += arg0;
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)J")
	public long method4583() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!rv", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method4584();
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V")
	public void method4584() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IBI[B)I")
	public int method4585(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(11) int local11 = this.aRandomAccessFile1.read(arg2, arg0, arg1);
		if (local11 > 0) {
			this.aLong180 += local11;
		}
		return local11;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Z)Ljava/io/File;")
	public File method4586() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IJ)V")
	public void method4587(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong180 = arg0;
	}
}
