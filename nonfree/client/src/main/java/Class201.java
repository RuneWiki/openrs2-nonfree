import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class201 {

	@OriginalMember(owner = "client!um", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!um", name = "b", descriptor = "J")
	private long aLong199;

	@OriginalMember(owner = "client!um", name = "c", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!um", name = "d", descriptor = "J")
	private long aLong200;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V")
	private Class201() {
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
	public void method5359() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(B)Ljava/io/File;")
	public File method5360() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(JB)V")
	public void method5361(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong200 = arg0;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(II[BI)I")
	public int method5362(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(12) int local12 = this.aRandomAccessFile1.read(arg1, arg2, arg0);
		if (local12 > 0) {
			this.aLong200 += local12;
		}
		return local12;
	}

	@OriginalMember(owner = "client!um", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5359();
		}
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(I)J")
	public long method5363() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(II[BI)V")
	public void method5364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		if (this.aLong199 < this.aLong200 + (long) arg0) {
			this.aRandomAccessFile1.seek(this.aLong199);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg1, arg0);
			this.aLong200 += arg0;
		}
	}
}
