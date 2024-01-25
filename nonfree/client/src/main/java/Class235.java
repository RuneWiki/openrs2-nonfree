import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class235 {

	@OriginalMember(owner = "client!st", name = "a", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!st", name = "b", descriptor = "J")
	private long aLong204;

	@OriginalMember(owner = "client!st", name = "c", descriptor = "J")
	private long aLong205;

	@OriginalMember(owner = "client!st", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "()V")
	private Class235() {
	}

	@OriginalMember(owner = "client!st", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method4942();
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(JB)V")
	public void method4939(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong205 = arg0;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IB[BI)I")
	public int method4940(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(13) int local13 = this.aRandomAccessFile1.read(arg1, arg0, arg2);
		if (local13 > 0) {
			this.aLong205 += local13;
		}
		return local13;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(I)J")
	public long method4941() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(B)V")
	public void method4942() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(BII[B)V")
	public void method4943(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong204 < this.aLong205 + (long) arg1) {
			this.aRandomAccessFile1.seek(this.aLong204);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg0, arg1);
			this.aLong205 += arg1;
		}
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(B)Ljava/io/File;")
	public File method4944() {
		return this.aFile1;
	}
}
