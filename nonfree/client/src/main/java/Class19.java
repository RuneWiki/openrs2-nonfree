import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class19 {

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "J")
	private final long aLong30;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class19(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile1 = arg0;
		this.aLong29 = 0L;
		this.aLong30 = arg2;
		@Pc(41) int local41 = this.aRandomAccessFile1.read();
		if (local41 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local41);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
	public void method658() throws IOException {
		this.aRandomAccessFile1.close();
		this.aRandomAccessFile1 = null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB[BI)I")
	public int method659(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg1, arg0, arg2);
		if (local6 > 0) {
			this.aLong29 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)J")
	public long method661() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(JB)V")
	public void method662(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong29 = arg0;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(III[B)V")
	public void method663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong29 + (long) arg0 > this.aLong30) {
			this.aRandomAccessFile1.seek(this.aLong30 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg1, arg0);
			this.aLong29 += arg0;
		}
	}

	@OriginalMember(owner = "client!ee", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method658();
		}
	}
}
