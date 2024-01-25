import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mca")
public final class Class204 {

	@OriginalMember(owner = "client!mca", name = "m", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!mca", name = "e", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!mca", name = "h", descriptor = "J")
	private final long aLong151;

	@OriginalMember(owner = "client!mca", name = "c", descriptor = "J")
	private long aLong150;

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class204(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile1 = arg0;
		this.aLong151 = arg2;
		this.aLong150 = 0L;
		@Pc(39) int local39 = this.aRandomAccessFile1.read();
		if (local39 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local39);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Z)J")
	public long method4676() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)V")
	public void method4677() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(III[B)V")
	public void method4678(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong151 < this.aLong150 + (long) arg0) {
			this.aRandomAccessFile1.seek(this.aLong151);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg1, arg0);
			this.aLong150 += arg0;
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(JB)V")
	public void method4679(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong150 = arg0;
	}

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "(I)Ljava/io/File;")
	public File method4680() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!mca", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method4677();
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "([BIII)I")
	public int method4681(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(15) int local15 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local15 > 0) {
			this.aLong150 += local15;
		}
		return local15;
	}
}
