import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qaa")
public final class Class281 {

	@OriginalMember(owner = "client!qaa", name = "g", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!qaa", name = "j", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!qaa", name = "e", descriptor = "J")
	private final long aLong250;

	@OriginalMember(owner = "client!qaa", name = "k", descriptor = "J")
	private long aLong251;

	@OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class281(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile1 = arg0;
		this.aLong250 = arg2;
		this.aLong251 = 0L;
		@Pc(41) int local41 = this.aRandomAccessFile1.read();
		if (local41 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local41);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Z)Ljava/io/File;")
	public File method6891() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ZII[B)V")
	public void method6892(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong250 < this.aLong251 + (long) arg0) {
			this.aRandomAccessFile1.seek(this.aLong250);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg1, arg0);
			this.aLong251 += (long) arg0;
		}
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)V")
	public void method6893() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!qaa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method6893();
		}
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "([BIII)I")
	public int method6895(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(16) int local16 = this.aRandomAccessFile1.read(arg0, arg2, arg1);
		if (local16 > 0) {
			this.aLong251 += (long) local16;
		}
		return local16;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(BJ)V")
	public void method6896(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong251 = arg0;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(B)J")
	public long method6898() throws IOException {
		return this.aRandomAccessFile1.length();
	}
}
