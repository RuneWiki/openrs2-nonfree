import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class70 {

	@OriginalMember(owner = "client!he", name = "a", descriptor = "J")
	private long aLong77;

	@OriginalMember(owner = "client!he", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!he", name = "c", descriptor = "J")
	private long aLong78;

	@OriginalMember(owner = "client!he", name = "d", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)J")
	public long method1686() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!he", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method1687();
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
	public void method1687() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "([BIBI)V")
	public void method1688(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong78 >= (long) arg1 + this.aLong77) {
			this.aRandomAccessFile1.write(arg0, arg2, arg1);
			this.aLong77 += arg1;
		} else {
			this.aRandomAccessFile1.seek(this.aLong78);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BII[B)I")
	public int method1689(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(13) int local13 = this.aRandomAccessFile1.read(arg2, arg1, arg0);
		if (local13 > 0) {
			this.aLong77 += local13;
		}
		return local13;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(JI)V")
	public void method1690(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong77 = arg0;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)Ljava/io/File;")
	public File method1691() {
		return this.aFile1;
	}
}
