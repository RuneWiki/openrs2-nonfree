import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class75 {

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "J")
	private final long aLong89;

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "J")
	private long aLong90;

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "Ljava/io/File;")
	private final File aFile3;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class75(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong89 = arg2;
		this.aLong90 = 0L;
		this.aFile3 = arg0;
		@Pc(39) int local39 = this.aRandomAccessFile1.read();
		if (local39 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local39);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
	public void method2153() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)Ljava/io/File;")
	public File method2154() {
		return this.aFile3;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(JI)V")
	public void method2155(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong90 = arg0;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I[BII)I")
	public int method2156(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(11) int local11 = this.aRandomAccessFile1.read(arg1, arg0, arg2);
		if (local11 > 0) {
			this.aLong90 += local11;
		}
		return local11;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)J")
	public long method2157() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BII[B)V")
	public void method2158(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if ((long) arg0 + this.aLong90 > this.aLong89) {
			this.aRandomAccessFile1.seek(this.aLong89 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg1, arg0);
			this.aLong90 += arg0;
		}
	}

	@OriginalMember(owner = "client!pa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile3 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2153();
		}
	}
}
