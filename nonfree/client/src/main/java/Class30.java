import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class30 {

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "J")
	private final long aLong54;

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "J")
	private long aLong55;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class30(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong54 = arg2;
		this.aFile1 = arg0;
		this.aLong55 = 0L;
		@Pc(41) int local41 = this.aRandomAccessFile1.read();
		if (local41 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local41);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)Ljava/io/File;")
	public File method1401() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BJ)V")
	public void method1402(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong55 = arg0;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
	public void method1403() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)J")
	public long method1404() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II[BI)V")
	public void method1405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		if (this.aLong54 < (long) arg0 + this.aLong55) {
			this.aRandomAccessFile1.seek(this.aLong54 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg1, arg0);
			this.aLong55 += arg0;
		}
	}

	@OriginalMember(owner = "client!gd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method1403();
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([BIII)I")
	public int method1406(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(10) int local10 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local10 > 0) {
			this.aLong55 += local10;
		}
		return local10;
	}
}
