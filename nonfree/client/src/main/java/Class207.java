import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class207 {

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "J")
	private long aLong200;

	@OriginalMember(owner = "client!rp", name = "d", descriptor = "J")
	private long aLong201;

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "()V")
	private Class207() {
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V")
	public void method4713() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!rp", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method4713();
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(II[BI)V")
	public void method4714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		if (this.aLong201 < this.aLong200 + (long) arg1) {
			this.aRandomAccessFile1.seek(this.aLong201);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg0, arg1);
			this.aLong200 += arg1;
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(II[BB)I")
	public int method4715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg2, arg0, arg1);
		if (local6 > 0) {
			this.aLong200 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)Ljava/io/File;")
	public File method4716() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(I)J")
	public long method4717() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(JI)V")
	public void method4718(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong200 = arg0;
	}
}
