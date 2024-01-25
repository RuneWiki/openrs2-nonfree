import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rv")
public final class Class320 {

	@OriginalMember(owner = "client!rv", name = "p", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "J")
	private long aLong281;

	@OriginalMember(owner = "client!rv", name = "j", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!rv", name = "l", descriptor = "J")
	private final long aLong280;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class320(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong281 = 0L;
		this.aFile1 = arg0;
		this.aLong280 = arg2;
		@Pc(41) int local41 = this.aRandomAccessFile1.read();
		if (local41 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local41);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(I)J")
	public long method7686() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BJ)V")
	public void method7687(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong281 = arg0;
	}

	@OriginalMember(owner = "client!rv", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method7693();
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(I[BII)V")
	public void method7688(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aLong280 < this.aLong281 + (long) arg0) {
			this.aRandomAccessFile1.seek(this.aLong280);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg2, arg0);
			this.aLong281 += (long) arg0;
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)Ljava/io/File;")
	public File method7691() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)V")
	public void method7693() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(I[BIB)I")
	public int method7695(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(10) int local10 = this.aRandomAccessFile1.read(arg1, arg2, arg0);
		if (local10 > 0) {
			this.aLong281 += (long) local10;
		}
		return local10;
	}
}
