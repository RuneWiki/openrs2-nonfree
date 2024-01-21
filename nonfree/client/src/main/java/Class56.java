import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class56 {

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "J")
	private long aLong71;

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "J")
	private final long aLong70;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class56(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong71 = 0L;
		this.aFile1 = arg0;
		this.aLong70 = arg2;
		@Pc(41) int local41 = this.aRandomAccessFile1.read();
		if (local41 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local41);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[BII)I")
	public int method1742(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg1, arg2, arg0);
		if (local6 > 0) {
			this.aLong71 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B[BII)V")
	public void method1743(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if ((long) arg2 + this.aLong71 > this.aLong70) {
			this.aRandomAccessFile1.seek(this.aLong70 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong71 += arg2;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)J")
	public long method1744() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)Ljava/io/File;")
	public File method1745() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
	public void method1746() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!kd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method1746();
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(JB)V")
	public void method1747(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong71 = arg0;
	}
}
