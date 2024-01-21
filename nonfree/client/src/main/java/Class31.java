import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class31 {

	@OriginalMember(owner = "client!he", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!he", name = "c", descriptor = "J")
	private final long aLong40;

	@OriginalMember(owner = "client!he", name = "b", descriptor = "J")
	private long aLong39;

	@OriginalMember(owner = "client!he", name = "d", descriptor = "Ljava/io/File;")
	private final File aFile3;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class31(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong40 = arg2;
		this.aLong39 = 0L;
		this.aFile3 = arg0;
		@Pc(41) int local41 = this.aRandomAccessFile1.read();
		if (local41 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local41);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I[BII)V")
	public void method800(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if ((long) arg0 + this.aLong39 > this.aLong40) {
			this.aRandomAccessFile1.seek(this.aLong40 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg2, arg0);
			this.aLong39 += arg0;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)J")
	public long method801() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V")
	public void method802() throws IOException {
		this.aRandomAccessFile1.close();
		this.aRandomAccessFile1 = null;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BJ)V")
	public void method803(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong39 = arg0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method804() {
		return this.aFile3;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I[BII)I")
	public int method805(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg1, arg2, arg0);
		if (local6 > 0) {
			this.aLong39 += local6;
		}
		return local6;
	}
}
