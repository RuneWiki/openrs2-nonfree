import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class45 {

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "J")
	private final long aLong73;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "J")
	private long aLong72;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class45(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile1 = arg0;
		this.aLong73 = arg2;
		this.aLong72 = 0L;
		@Pc(39) int local39 = this.aRandomAccessFile1.read();
		if (local39 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local39);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)Ljava/io/File;")
	public File method1836() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
	public void method1837() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II[BI)I")
	public int method1838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg2, arg1, arg0);
		if (local6 > 0) {
			this.aLong72 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "([BIBI)V")
	public void method1839(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong73 < this.aLong72 + (long) arg1) {
			this.aRandomAccessFile1.seek(this.aLong73 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg2, arg1);
			this.aLong72 += arg1;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(JB)V")
	public void method1840(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong72 = arg0;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)J")
	public long method1841() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!kc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method1837();
		}
	}
}
