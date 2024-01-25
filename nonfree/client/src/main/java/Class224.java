import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class224 {

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "J")
	private long aLong186;

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "J")
	private long aLong187;

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "()V")
	private Class224() {
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Z)Ljava/io/File;")
	public File method5139() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(BI[BI)V")
	public void method5140(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong187 + (long) arg2 > this.aLong186) {
			this.aRandomAccessFile1.seek(this.aLong186);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg0, arg2);
			this.aLong187 += arg2;
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)V")
	public void method5141() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!sr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5141();
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "([BIII)I")
	public int method5142(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(13) int local13 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local13 > 0) {
			this.aLong187 += local13;
		}
		return local13;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(JZ)V")
	public void method5143(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong187 = arg0;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)J")
	public long method5144() throws IOException {
		return this.aRandomAccessFile1.length();
	}
}
