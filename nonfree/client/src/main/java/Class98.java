import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class98 {

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "J")
	private long aLong85;

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "J")
	private long aLong86;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
	private Class98() {
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(III[B)V")
	public void method2221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong86 + (long) arg1 > this.aLong85) {
			this.aRandomAccessFile1.seek(this.aLong85);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg0, arg1);
			this.aLong86 += arg1;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method2222() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(III[B)I")
	public int method2223(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg2, arg1, arg0);
		if (local6 > 0) {
			this.aLong86 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!hh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2224();
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
	public void method2224() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)J")
	public long method2225() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IJ)V")
	public void method2226(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong86 = arg0;
	}
}
