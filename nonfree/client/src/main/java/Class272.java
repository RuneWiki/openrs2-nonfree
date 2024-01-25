import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class272 {

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!qq", name = "i", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "J")
	private long aLong212;

	@OriginalMember(owner = "client!qq", name = "g", descriptor = "J")
	private final long aLong213;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class272(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile1 = arg0;
		this.aLong212 = 0L;
		this.aLong213 = arg2;
		@Pc(41) int local41 = this.aRandomAccessFile1.read();
		if (local41 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local41);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "([BIII)V")
	public void method6170(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if ((long) arg2 + this.aLong212 > this.aLong213) {
			this.aRandomAccessFile1.seek(this.aLong213);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong212 += arg2;
		}
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)V")
	public void method6172() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!qq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method6172();
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)Ljava/io/File;")
	public File method6174() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(JI)V")
	public void method6175(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong212 = arg0;
	}

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(I)J")
	public long method6176() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(III[B)I")
	public int method6177(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(10) int local10 = this.aRandomAccessFile1.read(arg2, arg0, arg1);
		if (local10 > 0) {
			this.aLong212 += local10;
		}
		return local10;
	}
}
