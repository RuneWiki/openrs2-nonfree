import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class45 {

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "J")
	private long aLong74;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile3;

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "J")
	private final long aLong75;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class45(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong74 = 0L;
		this.aFile3 = arg0;
		this.aLong75 = arg2;
		@Pc(41) int local41 = this.aRandomAccessFile1.read();
		if (local41 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local41);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)J")
	public long method1132() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(JI)V")
	public void method1133(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong74 = arg0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[BIB)V")
	public void method1134(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aLong74 + (long) arg0 > this.aLong75) {
			this.aRandomAccessFile1.seek(this.aLong75 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg2, arg0);
			this.aLong74 += arg0;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
	public void method1135() throws IOException {
		this.aRandomAccessFile1.close();
		this.aRandomAccessFile1 = null;
	}

	@OriginalMember(owner = "client!kd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile3 + " not closed correctly using close(). Auto-closing instead. ");
			this.method1135();
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B[BII)I")
	public int method1137(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(14) int local14 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local14 > 0) {
			this.aLong74 += local14;
		}
		return local14;
	}
}
