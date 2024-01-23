import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class105 {

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "J")
	private long aLong103;

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "J")
	private long aLong104;

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!kd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2246();
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(JB)V")
	public void method2241(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong104 = arg0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([BIII)I")
	public int method2242(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(11) int local11 = this.aRandomAccessFile1.read(arg0, arg2, arg1);
		if (local11 > 0) {
			this.aLong104 += local11;
		}
		return local11;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)J")
	public long method2243() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIZ[B)V")
	public void method2244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong103 >= (long) arg0 + this.aLong104) {
			this.aRandomAccessFile1.write(arg2, arg1, arg0);
			this.aLong104 += arg0;
		} else {
			this.aRandomAccessFile1.seek(this.aLong103);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)Ljava/io/File;")
	public File method2245() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
	public void method2246() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}
}
