import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class88 {

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "J")
	private long aLong119;

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "J")
	private final long aLong118;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile3;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class88(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong119 = 0L;
		this.aLong118 = arg2;
		this.aFile3 = arg0;
		@Pc(35) int local35 = this.aRandomAccessFile1.read();
		if (local35 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local35);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "([BIIZ)I")
	public int method2528(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(11) int local11 = this.aRandomAccessFile1.read(arg0, arg2, arg1);
		if (local11 > 0) {
			this.aLong119 += local11;
		}
		return local11;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
	public void method2529() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!ri", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile3 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2529();
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)Ljava/io/File;")
	public File method2530() {
		return this.aFile3;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)J")
	public long method2531() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II[BB)V")
	public void method2532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		if ((long) arg0 + this.aLong119 > this.aLong118) {
			this.aRandomAccessFile1.seek(this.aLong118 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg1, arg0);
			this.aLong119 += arg0;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(JI)V")
	public void method2533(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong119 = arg0;
	}
}
