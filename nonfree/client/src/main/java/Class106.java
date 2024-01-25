import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class106 {

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "J")
	private long aLong105;

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "J")
	private long aLong106;

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
	private Class106() {
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BII[B)I")
	public int method2288(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(11) int local11 = this.aRandomAccessFile1.read(arg2, arg1, arg0);
		if (local11 > 0) {
			this.aLong105 += local11;
		}
		return local11;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(III[B)V")
	public void method2289(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong105 + (long) arg0 > this.aLong106) {
			this.aRandomAccessFile1.seek(this.aLong106);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg1, arg0);
			this.aLong105 += arg0;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
	public void method2290() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!ia", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2290();
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method2291() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)J")
	public long method2292() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(JI)V")
	public void method2293(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong105 = arg0;
	}
}
