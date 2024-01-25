import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class137 {

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "J")
	private long aLong134;

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "J")
	private long aLong135;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "()V")
	private Class137() {
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)J")
	public long method3703() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "([BIII)I")
	public int method3704(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg2, arg1);
		if (local6 > 0) {
			this.aLong134 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ZJ)V")
	public void method3705(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong134 = arg0;
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "([BIII)V")
	public void method3706(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aLong135 < this.aLong134 + (long) arg1) {
			this.aRandomAccessFile1.seek(this.aLong135);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg2, arg1);
			this.aLong134 += arg1;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)Ljava/io/File;")
	public File method3707() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!kr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method3708();
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
	public void method3708() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}
}
