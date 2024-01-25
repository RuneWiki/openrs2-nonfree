import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class286 {

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "J")
	private final long aLong238;

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "J")
	private long aLong239;

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class286(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong238 = arg2;
		this.aLong239 = 0L;
		this.aFile1 = arg0;
		@Pc(41) int local41 = this.aRandomAccessFile1.read();
		if (local41 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local41);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	public void method6820() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[BII)V")
	public void method6821(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong238 < (long) arg2 + this.aLong239) {
			this.aRandomAccessFile1.seek(this.aLong238);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg0, arg2);
			this.aLong239 += (long) arg2;
		}
	}

	@OriginalMember(owner = "client!qb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method6820();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[BZI)I")
	public int method6822(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(19) int local19 = this.aRandomAccessFile1.read(arg1, arg2, arg0);
		if (local19 > 0) {
			this.aLong239 += (long) local19;
		}
		return local19;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)J")
	public long method6823() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)Ljava/io/File;")
	public File method6825() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IJ)V")
	public void method6826(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong239 = arg0;
	}
}
