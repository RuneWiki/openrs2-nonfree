import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class154 {

	@OriginalMember(owner = "client!me", name = "a", descriptor = "J")
	private long aLong119;

	@OriginalMember(owner = "client!me", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!me", name = "c", descriptor = "J")
	private long aLong120;

	@OriginalMember(owner = "client!me", name = "d", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
	private Class154() {
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)J")
	public long method3331() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(JI)V")
	public void method3332(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong119 = arg0;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIB[B)I")
	public int method3333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(11) int local11 = this.aRandomAccessFile1.read(arg2, arg0, arg1);
		if (local11 > 0) {
			this.aLong119 += local11;
		}
		return local11;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B)Ljava/io/File;")
	public File method3334() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(B)V")
	public void method3335() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZI[BI)V")
	public void method3336(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if ((long) arg0 + this.aLong119 > this.aLong120) {
			this.aRandomAccessFile1.seek(this.aLong120);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg2, arg0);
			this.aLong119 += arg0;
		}
	}

	@OriginalMember(owner = "client!me", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method3335();
		}
	}
}
