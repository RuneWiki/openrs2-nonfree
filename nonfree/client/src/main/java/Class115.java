import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class115 {

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "J")
	private long aLong141;

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "J")
	private long aLong142;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
	public void method3060() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!nn", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method3060();
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(BII[B)V")
	public void method3061(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong141 < this.aLong142 + (long) arg1) {
			this.aRandomAccessFile1.seek(this.aLong141);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg0, arg1);
			this.aLong142 += arg1;
		}
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)J")
	public long method3062() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "(I)Ljava/io/File;")
	public File method3063() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(II[BB)I")
	public int method3064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg2, arg1, arg0);
		if (local6 > 0) {
			this.aLong142 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(JZ)V")
	public void method3065(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong142 = arg0;
	}
}
