import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class70 {

	@OriginalMember(owner = "client!en", name = "a", descriptor = "J")
	private long aLong61;

	@OriginalMember(owner = "client!en", name = "b", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!en", name = "c", descriptor = "J")
	private long aLong62;

	@OriginalMember(owner = "client!en", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "()V")
	private Class70() {
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I[BII)V")
	public void method1441(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if ((long) arg1 + this.aLong62 > this.aLong61) {
			this.aRandomAccessFile1.seek(this.aLong61);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg2, arg1);
			this.aLong62 += arg1;
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method1442() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V")
	public void method1443() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(JI)V")
	public void method1444(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong62 = arg0;
	}

	@OriginalMember(owner = "client!en", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method1443();
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(II[BI)I")
	public int method1445(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg1, arg0, arg2);
		if (local6 > 0) {
			this.aLong62 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(I)J")
	public long method1446() throws IOException {
		return this.aRandomAccessFile1.length();
	}
}
