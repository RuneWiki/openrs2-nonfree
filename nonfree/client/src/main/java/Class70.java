import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class70 {

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "Ljava/io/File;")
	private final File aFile3;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "J")
	private final long aLong115;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "J")
	private long aLong114;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class70(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile3 = arg0;
		this.aLong115 = arg2;
		this.aLong114 = 0L;
		@Pc(41) int local41 = this.aRandomAccessFile1.read();
		if (local41 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local41);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BJ)V")
	public void method2737(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong114 = arg0;
	}

	@OriginalMember(owner = "client!sc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile3 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2740();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIB[B)I")
	public int method2738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg2, arg0, arg1);
		if (local6 > 0) {
			this.aLong114 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)J")
	public long method2739() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
	public void method2740() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)Ljava/io/File;")
	public File method2741() {
		return this.aFile3;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([BBII)V")
	public void method2742(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong115 < this.aLong114 + (long) arg2) {
			this.aRandomAccessFile1.seek(this.aLong115 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong114 += arg2;
		}
	}
}
