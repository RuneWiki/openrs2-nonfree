import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class39 {

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "Ljava/io/File;")
	private File aFile3;

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "J")
	private long aLong48;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "J")
	private long aLong47;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class39(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile3 = arg0;
		this.aLong48 = 0L;
		this.aLong47 = arg2;
		@Pc(35) int local35 = this.aRandomAccessFile1.read();
		if (local35 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local35);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!fi", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile3 + " not closed correctly using close(). Auto-closing instead. ");
			this.method1200();
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZ[BI)I")
	public int method1198(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg1, arg2, arg0);
		if (local6 > 0) {
			this.aLong48 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IJ)V")
	public void method1199(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong48 = arg0;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
	public void method1200() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method1201() {
		return this.aFile3;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)J")
	public long method1202() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I[BII)V")
	public void method1203(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aLong47 < (long) arg2 + this.aLong48) {
			this.aRandomAccessFile1.seek(this.aLong47 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg0, arg2);
			this.aLong48 += arg2;
		}
	}
}
