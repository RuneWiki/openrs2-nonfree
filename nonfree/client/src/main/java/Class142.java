import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class142 {

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "J")
	private long aLong111;

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "J")
	private long aLong112;

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "()V")
	private Class142() {
	}

	@OriginalMember(owner = "client!ko", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method3267();
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "([BIII)I")
	public int method3266(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local6 > 0) {
			this.aLong111 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V")
	public void method3267() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(II[BI)V")
	public void method3268(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong112 < (long) arg0 + this.aLong111) {
			this.aRandomAccessFile1.seek(this.aLong112);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg2, arg0);
			this.aLong111 += arg0;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)Ljava/io/File;")
	public File method3269() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)J")
	public long method3270() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(JI)V")
	public void method3271(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong111 = arg0;
	}
}
