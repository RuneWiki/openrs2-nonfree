import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class48 {

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "J")
	private long aLong57;

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "J")
	private long aLong58;

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method1172() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "([BBII)I")
	public int method1173(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg2, arg1);
		if (local6 > 0) {
			this.aLong58 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)V")
	public void method1174() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I[BII)V")
	public void method1175(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong57 >= this.aLong58 + (long) arg0) {
			this.aRandomAccessFile1.write(arg1, arg2, arg0);
			this.aLong58 += arg0;
		} else {
			this.aRandomAccessFile1.seek(this.aLong57);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)J")
	public long method1176() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IJ)V")
	public void method1177(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong58 = arg0;
	}

	@OriginalMember(owner = "client!eo", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method1174();
		}
	}
}
