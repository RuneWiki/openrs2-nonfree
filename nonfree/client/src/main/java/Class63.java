import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public final class Class63 {

	@OriginalMember(owner = "client!cu", name = "g", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!cu", name = "i", descriptor = "J")
	private long aLong47;

	@OriginalMember(owner = "client!cu", name = "n", descriptor = "J")
	private final long aLong48;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class63(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong47 = 0L;
		this.aLong48 = arg2;
		this.aFile1 = arg0;
		@Pc(37) int local37 = this.aRandomAccessFile1.read();
		if (local37 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local37);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)V")
	public void method1174() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)J")
	public long method1175() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IBI[B)V")
	public void method1176(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong48 < (long) arg1 + this.aLong47) {
			this.aRandomAccessFile1.seek(this.aLong48);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg0, arg1);
			this.aLong47 += arg1;
		}
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(B)Ljava/io/File;")
	public File method1177() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!cu", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method1174();
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(I[BII)I")
	public int method1178(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(10) int local10 = this.aRandomAccessFile1.read(arg1, arg0, arg2);
		if (local10 > 0) {
			this.aLong47 += local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(JI)V")
	public void method1180(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong47 = arg0;
	}
}
