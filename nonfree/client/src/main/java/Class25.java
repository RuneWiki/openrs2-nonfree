import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class25 {

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "J")
	private long aLong22;

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "J")
	private long aLong23;

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "()V")
	private Class25() {
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([BIII)V")
	public void method589(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong23 < this.aLong22 + (long) arg1) {
			this.aRandomAccessFile1.seek(this.aLong23);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg2, arg1);
			this.aLong22 += arg1;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)J")
	public long method590() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Z)Ljava/io/File;")
	public File method591() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!bt", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method594();
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II[BI)I")
	public int method592(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg1, arg2, arg0);
		if (local6 > 0) {
			this.aLong22 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BJ)V")
	public void method593(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong22 = arg0;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)V")
	public void method594() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}
}
