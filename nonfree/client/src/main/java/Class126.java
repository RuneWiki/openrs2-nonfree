import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class126 {

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "J")
	private long aLong153;

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "J")
	private long aLong154;

	@OriginalMember(owner = "client!oe", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method3181();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)J")
	public long method3179() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)Ljava/io/File;")
	public File method3180() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
	public void method3181() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "([BIII)V")
	public void method3182(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if ((long) arg1 + this.aLong154 <= this.aLong153) {
			this.aRandomAccessFile1.write(arg0, arg2, arg1);
			this.aLong154 += arg1;
		} else {
			this.aRandomAccessFile1.seek(this.aLong153);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BJ)V")
	public void method3183(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong154 = arg0;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "([BIII)I")
	public int method3184(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local6 > 0) {
			this.aLong154 += local6;
		}
		return local6;
	}
}
