import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class213 {

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "J")
	private long aLong324;

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "J")
	private long aLong325;

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
	private Class213() {
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "([BBII)I")
	public int method4945(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(11) int local11 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local11 > 0) {
			this.aLong324 += local11;
		}
		return local11;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
	public void method4946() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZI[BI)V")
	public void method4947(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if ((long) arg0 + this.aLong324 > this.aLong325) {
			this.aRandomAccessFile1.seek(this.aLong325);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg2, arg0);
			this.aLong324 += arg0;
		}
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)Ljava/io/File;")
	public File method4948() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!rh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method4946();
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)J")
	public long method4949() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BJ)V")
	public void method4950(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong324 = arg0;
	}
}
