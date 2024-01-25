import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class108 {

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "J")
	private long aLong102;

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "J")
	private long aLong103;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V")
	private Class108() {
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
	public void method2643() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!hl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2643();
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(JB)V")
	public void method2644(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong103 = arg0;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)J")
	public long method2645() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I[BII)I")
	public int method2646(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg1, arg0, arg2);
		if (local6 > 0) {
			this.aLong103 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)Ljava/io/File;")
	public File method2647() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "([BIII)V")
	public void method2648(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aLong102 < this.aLong103 + (long) arg2) {
			this.aRandomAccessFile1.seek(this.aLong102);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong103 += arg2;
		}
	}
}
