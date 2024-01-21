import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class32 {

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "J")
	private final long aLong46;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "J")
	private long aLong45;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class32(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong46 = arg2;
		this.aFile1 = arg0;
		this.aLong45 = 0L;
		@Pc(41) int local41 = this.aRandomAccessFile1.read();
		if (local41 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local41);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!ia", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method858();
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II[BI)I")
	public int method855(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(11) int local11 = this.aRandomAccessFile1.read(arg1, arg2, arg0);
		if (local11 > 0) {
			this.aLong45 += local11;
		}
		return local11;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I[BII)V")
	public void method856(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aLong46 < this.aLong45 + (long) arg2) {
			this.aRandomAccessFile1.seek(this.aLong46 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg0, arg2);
			this.aLong45 += arg2;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(JZ)V")
	public void method857(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong45 = arg0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V")
	public void method858() throws IOException {
		this.aRandomAccessFile1.close();
		this.aRandomAccessFile1 = null;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)J")
	public long method859() throws IOException {
		return this.aRandomAccessFile1.length();
	}
}
