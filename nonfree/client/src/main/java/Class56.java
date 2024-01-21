import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class56 {

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "J")
	private final long aLong86;

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "J")
	private long aLong85;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class56(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong86 = arg2;
		this.aFile1 = arg0;
		this.aLong85 = 0L;
		@Pc(37) int local37 = this.aRandomAccessFile1.read();
		if (local37 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local37);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I[BBI)I")
	public int method1779(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(12) int local12 = this.aRandomAccessFile1.read(arg1, arg0, arg2);
		if (local12 > 0) {
			this.aLong85 += local12;
		}
		return local12;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)J")
	public long method1780() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "([BIIB)V")
	public void method1781(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aLong85 + (long) arg2 > this.aLong86) {
			this.aRandomAccessFile1.seek(this.aLong86 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong85 += arg2;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method1782() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!mg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method1784();
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(JI)V")
	public void method1783(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong85 = arg0;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
	public void method1784() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}
}
