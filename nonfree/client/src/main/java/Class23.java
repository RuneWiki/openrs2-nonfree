import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class23 {

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "J")
	private long aLong37;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "J")
	private final long aLong36;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class23(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile1 = arg0;
		this.aLong37 = 0L;
		this.aLong36 = arg2;
		@Pc(37) int local37 = this.aRandomAccessFile1.read();
		if (local37 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local37);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!ec", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method662();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(JI)V")
	public void method658(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong37 = arg0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method659() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "([BIII)I")
	public int method660(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg2, arg1);
		if (local6 > 0) {
			this.aLong37 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)J")
	public long method661() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
	public void method662() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BII[B)V")
	public void method663(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong36 < (long) arg1 + this.aLong37) {
			this.aRandomAccessFile1.seek(this.aLong36 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg0, arg1);
			this.aLong37 += arg1;
		}
	}
}
