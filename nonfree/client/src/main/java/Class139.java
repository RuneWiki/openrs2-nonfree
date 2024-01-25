import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class139 {

	@OriginalMember(owner = "client!km", name = "a", descriptor = "J")
	private long aLong112;

	@OriginalMember(owner = "client!km", name = "b", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!km", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!km", name = "d", descriptor = "J")
	private long aLong113;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V")
	private Class139() {
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)V")
	public void method2897() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IBI[B)I")
	public int method2898(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(14) int local14 = this.aRandomAccessFile1.read(arg2, arg1, arg0);
		if (local14 > 0) {
			this.aLong113 += local14;
		}
		return local14;
	}

	@OriginalMember(owner = "client!km", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2897();
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IJ)V")
	public void method2899(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong113 = arg0;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(B)J")
	public long method2900() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method2901() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "([BZII)V")
	public void method2902(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong112 < (long) arg2 + this.aLong113) {
			this.aRandomAccessFile1.seek(this.aLong112);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong113 += arg2;
		}
	}
}
