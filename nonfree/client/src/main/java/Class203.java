import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class203 {

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "J")
	private long aLong186;

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "J")
	private long aLong187;

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "()V")
	private Class203() {
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)J")
	public long method4991() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(JI)V")
	public void method4992(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong186 = arg0;
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)V")
	public void method4993() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(II[BI)I")
	public int method4994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		@Pc(14) int local14 = this.aRandomAccessFile1.read(arg2, arg0, arg1);
		if (local14 > 0) {
			this.aLong186 += local14;
		}
		return local14;
	}

	@OriginalMember(owner = "client!rq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method4993();
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Z)Ljava/io/File;")
	public File method4995() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(III[B)V")
	public void method4996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong187 < (long) arg0 + this.aLong186) {
			this.aRandomAccessFile1.seek(this.aLong187);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg1, arg0);
			this.aLong186 += arg0;
		}
	}
}
