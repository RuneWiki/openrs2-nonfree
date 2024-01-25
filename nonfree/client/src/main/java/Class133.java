import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class133 {

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "J")
	private long aLong108;

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "J")
	private long aLong109;

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "()V")
	private Class133() {
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method3019() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(JI)V")
	public void method3020(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong109 = arg0;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIB[B)V")
	public void method3021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong108 < this.aLong109 + (long) arg1) {
			this.aRandomAccessFile1.seek(this.aLong108);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg0, arg1);
			this.aLong109 += arg1;
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)J")
	public long method3022() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V")
	public void method3023() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!jo", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method3023();
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Z[BII)I")
	public int method3024(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg2, arg1);
		if (local6 > 0) {
			this.aLong109 += local6;
		}
		return local6;
	}
}
