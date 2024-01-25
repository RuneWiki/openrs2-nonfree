import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public final class Class39 {

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "J")
	private long aLong50;

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "J")
	private long aLong51;

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "()V")
	private Class39() {
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)J")
	public long method899() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(BJ)V")
	public void method900(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong51 = arg0;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIB[B)I")
	public int method901(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg2, arg0, arg1);
		if (local6 > 0) {
			this.aLong51 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(III[B)V")
	public void method902(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong50 < (long) arg0 + this.aLong51) {
			this.aRandomAccessFile1.seek(this.aLong50);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg1, arg0);
			this.aLong51 += arg0;
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V")
	public void method903() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)Ljava/io/File;")
	public File method904() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!cs", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method903();
		}
	}
}
