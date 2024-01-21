import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class78 {

	@OriginalMember(owner = "client!v", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!v", name = "b", descriptor = "Ljava/io/File;")
	private final File aFile3;

	@OriginalMember(owner = "client!v", name = "c", descriptor = "J")
	private final long aLong85;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "J")
	private long aLong84;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class78(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile3 = arg0;
		this.aLong85 = arg2;
		this.aLong84 = 0L;
		@Pc(35) int local35 = this.aRandomAccessFile1.read();
		if (local35 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local35);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
	public void method2041() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "([BZII)V")
	public void method2042(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong85 < this.aLong84 + (long) arg1) {
			this.aRandomAccessFile1.seek(this.aLong85 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg2, arg1);
			this.aLong84 += arg1;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I)J")
	public long method2043() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile3 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2041();
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BII[B)I")
	public int method2044(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg2, arg1, arg0);
		if (local6 > 0) {
			this.aLong84 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(JB)V")
	public void method2045(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong84 = arg0;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(I)Ljava/io/File;")
	public File method2046() {
		return this.aFile3;
	}
}
