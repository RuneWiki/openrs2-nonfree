import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class99 {

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "J")
	private long aLong84;

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "J")
	private long aLong85;

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "()V")
	private Class99() {
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IBI[B)V")
	public void method2252(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong85 < this.aLong84 + (long) arg1) {
			this.aRandomAccessFile1.seek(this.aLong85);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg0, arg1);
			this.aLong84 += arg1;
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(JB)V")
	public void method2253(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong84 = arg0;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method2254() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!gq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2257();
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(II[BZ)I")
	public int method2255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		@Pc(12) int local12 = this.aRandomAccessFile1.read(arg2, arg0, arg1);
		if (local12 > 0) {
			this.aLong84 += local12;
		}
		return local12;
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)J")
	public long method2256() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)V")
	public void method2257() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}
}
