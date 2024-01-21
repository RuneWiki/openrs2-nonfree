import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class11 {

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "J")
	private final long aLong16;

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "J")
	private long aLong17;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class11(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile1 = arg0;
		this.aLong16 = arg2;
		this.aLong17 = 0L;
		@Pc(35) int local35 = this.aRandomAccessFile1.read();
		if (local35 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local35);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I[BII)V")
	public void method154(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong16 < (long) arg2 + this.aLong17) {
			this.aRandomAccessFile1.seek(this.aLong16 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong17 += arg2;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
	public void method155() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method156() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(JI)V")
	public void method157(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong17 = arg0;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)J")
	public long method158() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(III[B)I")
	public int method159(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg2, arg1, arg0);
		if (local6 > 0) {
			this.aLong17 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!ca", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method155();
		}
	}
}
