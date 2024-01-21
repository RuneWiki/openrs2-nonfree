import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class46 {

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "J")
	private final long aLong68;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "J")
	private long aLong69;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class46(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong68 = arg2;
		this.aLong69 = 0L;
		this.aFile1 = arg0;
		@Pc(35) int local35 = this.aRandomAccessFile1.read();
		if (local35 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local35);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)J")
	public long method1496() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!kc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method1501();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)Ljava/io/File;")
	public File method1497() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZ[BI)V")
	public void method1498(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if ((long) arg0 + this.aLong69 > this.aLong68) {
			this.aRandomAccessFile1.seek(this.aLong68 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg2, arg0);
			this.aLong69 += arg0;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BJ)V")
	public void method1499(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong69 = arg0;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "([BBII)I")
	public int method1500(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg2, arg1);
		if (local6 > 0) {
			this.aLong69 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
	public void method1501() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}
}
