import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class129 {

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "J")
	private long aLong170;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "J")
	private long aLong171;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III[B)I")
	public int method3873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(14) int local14 = this.aRandomAccessFile1.read(arg2, arg1, arg0);
		if (local14 > 0) {
			this.aLong170 += local14;
		}
		return local14;
	}

	@OriginalMember(owner = "client!ub", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method3875();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IBI[B)V")
	public void method3874(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong170 + (long) arg0 > this.aLong171) {
			this.aRandomAccessFile1.seek(this.aLong171);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg1, arg0);
			this.aLong170 += arg0;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	public void method3875() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)J")
	public long method3876() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(JI)V")
	public void method3877(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong170 = arg0;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)Ljava/io/File;")
	public File method3878() {
		return this.aFile1;
	}
}
