import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class132 {

	@OriginalMember(owner = "client!on", name = "a", descriptor = "J")
	private long aLong137;

	@OriginalMember(owner = "client!on", name = "b", descriptor = "J")
	private long aLong138;

	@OriginalMember(owner = "client!on", name = "c", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!on", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I[BIB)I")
	public int method3351(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg1, arg2, arg0);
		if (local6 > 0) {
			this.aLong137 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "([BIIB)V")
	public void method3352(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aLong138 >= (long) arg1 + this.aLong137) {
			this.aRandomAccessFile1.write(arg0, arg2, arg1);
			this.aLong137 += arg1;
		} else {
			this.aRandomAccessFile1.seek(this.aLong138);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!on", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method3356();
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(JI)V")
	public void method3353(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong137 = arg0;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(B)J")
	public long method3354() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method3355() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(B)V")
	public void method3356() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}
}
