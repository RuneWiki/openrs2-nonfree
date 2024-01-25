import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class84 {

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "J")
	private long aLong74;

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "J")
	private long aLong75;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
	private Class84() {
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
	public void method2413() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!hd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2413();
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IJ)V")
	public void method2414(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong75 = arg0;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)Ljava/io/File;")
	public File method2415() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)J")
	public long method2416() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "([BIII)V")
	public void method2417(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong74 < (long) arg2 + this.aLong75) {
			this.aRandomAccessFile1.seek(this.aLong74);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong75 += arg2;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z[BII)I")
	public int method2418(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(12) int local12 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local12 > 0) {
			this.aLong75 += local12;
		}
		return local12;
	}
}
