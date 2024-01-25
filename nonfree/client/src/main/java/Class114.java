import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gba")
public final class Class114 {

	@OriginalMember(owner = "client!gba", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!gba", name = "d", descriptor = "J")
	private long aLong97;

	@OriginalMember(owner = "client!gba", name = "g", descriptor = "J")
	private final long aLong98;

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class114(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile1 = arg0;
		this.aLong97 = 0L;
		this.aLong98 = arg2;
		@Pc(37) int local37 = this.aRandomAccessFile1.read();
		if (local37 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local37);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(BJ)V")
	public void method2454(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong97 = arg0;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(B)J")
	public long method2455() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IBI[B)I")
	public int method2456(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(15) int local15 = this.aRandomAccessFile1.read(arg2, arg0, arg1);
		if (local15 > 0) {
			this.aLong97 += (long) local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(III[B)V")
	public void method2457(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if ((long) arg1 + this.aLong97 > this.aLong98) {
			this.aRandomAccessFile1.seek(this.aLong98);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg0, arg1);
			this.aLong97 += (long) arg1;
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method2459() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!gba", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2462();
		}
	}

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "(B)V")
	public void method2462() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}
}
