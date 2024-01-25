import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class117 {

	@OriginalMember(owner = "client!le", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "J")
	private long aLong127;

	@OriginalMember(owner = "client!le", name = "c", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!le", name = "d", descriptor = "J")
	private long aLong128;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
	private Class117() {
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(III[B)V")
	public void method3256(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong128 + (long) arg0 > this.aLong127) {
			this.aRandomAccessFile1.seek(this.aLong127);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg1, arg0);
			this.aLong128 += arg0;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(JI)V")
	public void method3257(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong128 = arg0;
	}

	@OriginalMember(owner = "client!le", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method3260();
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)Ljava/io/File;")
	public File method3258() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)J")
	public long method3259() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
	public void method3260() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "([BBII)I")
	public int method3261(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local6 > 0) {
			this.aLong128 += local6;
		}
		return local6;
	}
}
