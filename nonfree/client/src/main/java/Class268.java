import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class268 {

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "J")
	private long aLong224;

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "J")
	private final long aLong223;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class268(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong224 = 0L;
		this.aFile1 = arg0;
		this.aLong223 = arg2;
		@Pc(39) int local39 = this.aRandomAccessFile1.read();
		if (local39 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local39);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B[BII)I")
	public int method6508(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(16) int local16 = this.aRandomAccessFile1.read(arg0, arg2, arg1);
		if (local16 > 0) {
			this.aLong224 += (long) local16;
		}
		return local16;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
	public void method6511() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IJ)V")
	public void method6512(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong224 = arg0;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)J")
	public long method6514() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!ob", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method6511();
		}
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)Ljava/io/File;")
	public File method6515() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([BZII)V")
	public void method6517(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong223 < this.aLong224 + (long) arg1) {
			this.aRandomAccessFile1.seek(this.aLong223);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg2, arg1);
			this.aLong224 += (long) arg1;
		}
	}
}
