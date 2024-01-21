import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class51 {

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "J")
	private final long aLong83;

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "J")
	private long aLong84;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class51(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile1 = arg0;
		this.aLong83 = arg2;
		this.aLong84 = 0L;
		@Pc(35) int local35 = this.aRandomAccessFile1.read();
		if (local35 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local35);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IJ)V")
	public void method1862(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong84 = arg0;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)J")
	public long method1863() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)Ljava/io/File;")
	public File method1864() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!kh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method1865();
		}
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(B)V")
	public void method1865() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II[BB)I")
	public int method1866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		@Pc(14) int local14 = this.aRandomAccessFile1.read(arg2, arg0, arg1);
		if (local14 > 0) {
			this.aLong84 += local14;
		}
		return local14;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BII[B)V")
	public void method1867(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if ((long) arg1 + this.aLong84 > this.aLong83) {
			this.aRandomAccessFile1.seek(this.aLong83 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg0, arg1);
			this.aLong84 += arg1;
		}
	}
}
