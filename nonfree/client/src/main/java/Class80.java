import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class80 {

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile3;

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "J")
	private final long aLong109;

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "J")
	private long aLong110;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class80(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile3 = arg0;
		this.aLong109 = arg2;
		this.aLong110 = 0L;
		@Pc(39) int local39 = this.aRandomAccessFile1.read();
		if (local39 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local39);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I[BIB)V")
	public void method2320(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if ((long) arg0 + this.aLong110 > this.aLong109) {
			this.aRandomAccessFile1.seek(this.aLong109 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg2, arg0);
			this.aLong110 += arg0;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(III[B)I")
	public int method2321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(13) int local13 = this.aRandomAccessFile1.read(arg2, arg1, arg0);
		if (local13 > 0) {
			this.aLong110 += local13;
		}
		return local13;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
	public void method2322() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)Ljava/io/File;")
	public File method2323() {
		return this.aFile3;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(JI)V")
	public void method2324(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong110 = arg0;
	}

	@OriginalMember(owner = "client!pg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile3 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2322();
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)J")
	public long method2325() throws IOException {
		return this.aRandomAccessFile1.length();
	}
}
