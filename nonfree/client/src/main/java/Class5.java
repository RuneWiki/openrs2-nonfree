import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class5 {

	@OriginalMember(owner = "client!af", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!af", name = "b", descriptor = "J")
	private long aLong4;

	@OriginalMember(owner = "client!af", name = "c", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!af", name = "d", descriptor = "J")
	private long aLong5;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(B)Ljava/io/File;")
	public File method207() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)J")
	public long method208() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(Z)V")
	public void method209() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!af", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method209();
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IJ)V")
	public void method210(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong4 = arg0;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I[BII)I")
	public int method211(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local6 > 0) {
			this.aLong4 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BI[BI)V")
	public void method212(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong5 >= this.aLong4 + (long) arg0) {
			this.aRandomAccessFile1.write(arg1, arg2, arg0);
			this.aLong4 += arg0;
		} else {
			this.aRandomAccessFile1.seek(this.aLong5);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		}
	}
}
