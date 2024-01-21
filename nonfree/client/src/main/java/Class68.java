import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class68 {

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "J")
	private long aLong98;

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "Ljava/io/File;")
	private final File aFile3;

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "J")
	private final long aLong99;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class68(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong98 = 0L;
		this.aFile3 = arg0;
		this.aLong99 = arg2;
		@Pc(35) int local35 = this.aRandomAccessFile1.read();
		if (local35 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local35);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!qd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile3 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2092();
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z[BII)V")
	public void method2091(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong99 < this.aLong98 + (long) arg1) {
			this.aRandomAccessFile1.seek(this.aLong99 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg2, arg1);
			this.aLong98 += arg1;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
	public void method2092() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)J")
	public long method2093() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)Ljava/io/File;")
	public File method2094() {
		return this.aFile3;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BI[BI)I")
	public int method2095(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(11) int local11 = this.aRandomAccessFile1.read(arg1, arg0, arg2);
		if (local11 > 0) {
			this.aLong98 += local11;
		}
		return local11;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BJ)V")
	public void method2096(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong98 = arg0;
	}
}
