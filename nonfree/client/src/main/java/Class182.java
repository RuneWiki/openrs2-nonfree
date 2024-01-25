import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class182 {

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "J")
	private final long aLong144;

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "J")
	private long aLong145;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class182(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong144 = arg2;
		this.aFile1 = arg0;
		this.aLong145 = 0L;
		@Pc(37) int local37 = this.aRandomAccessFile1.read();
		if (local37 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local37);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)J")
	public long method4765() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "([BBII)V")
	public void method4767(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong144 < this.aLong145 + (long) arg1) {
			this.aRandomAccessFile1.seek(this.aLong144);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg2, arg1);
			this.aLong145 += (long) arg1;
		}
	}

	@OriginalMember(owner = "client!ji", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method4769();
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(JB)V")
	public void method4768(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong145 = arg0;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V")
	public void method4769() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)Ljava/io/File;")
	public File method4771() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(II[BI)I")
	public int method4773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		@Pc(10) int local10 = this.aRandomAccessFile1.read(arg2, arg0, arg1);
		if (local10 > 0) {
			this.aLong145 += (long) local10;
		}
		return local10;
	}
}
