import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!baa")
public final class Class23 {

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!baa", name = "e", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!baa", name = "i", descriptor = "J")
	private long aLong16;

	@OriginalMember(owner = "client!baa", name = "k", descriptor = "J")
	private final long aLong17;

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class23(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile1 = arg0;
		this.aLong16 = 0L;
		this.aLong17 = arg2;
		@Pc(41) int local41 = this.aRandomAccessFile1.read();
		if (local41 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local41);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(IIB[B)I")
	public int method492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(10) int local10 = this.aRandomAccessFile1.read(arg2, arg1, arg0);
		if (local10 > 0) {
			this.aLong16 += local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)Ljava/io/File;")
	public File method493() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "(B)V")
	public void method495() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!baa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method495();
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(I[BII)V")
	public void method496(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aLong16 + (long) arg2 > this.aLong17) {
			this.aRandomAccessFile1.seek(this.aLong17);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg0, arg2);
			this.aLong16 += arg2;
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)J")
	public long method498() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(IJ)V")
	public void method499(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong16 = arg0;
	}
}
