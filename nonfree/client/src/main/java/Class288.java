import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pga")
public final class Class288 {

	@OriginalMember(owner = "client!pga", name = "m", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!pga", name = "j", descriptor = "J")
	private final long aLong261;

	@OriginalMember(owner = "client!pga", name = "e", descriptor = "J")
	private long aLong262;

	@OriginalMember(owner = "client!pga", name = "p", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class288(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong261 = arg2;
		this.aLong262 = 0L;
		this.aFile1 = arg0;
		@Pc(37) int local37 = this.aRandomAccessFile1.read();
		if (local37 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local37);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(B)J")
	public long method6776() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "([BIII)V")
	public void method6777(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if ((long) arg2 + this.aLong262 > this.aLong261) {
			this.aRandomAccessFile1.seek(this.aLong261);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong262 += (long) arg2;
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(BI[BI)I")
	public int method6778(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(18) int local18 = this.aRandomAccessFile1.read(arg1, arg2, arg0);
		if (local18 > 0) {
			this.aLong262 += (long) local18;
		}
		return local18;
	}

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "(I)Ljava/io/File;")
	public File method6779() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "(B)V")
	public void method6780() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!pga", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method6780();
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(JI)V")
	public void method6782(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong262 = arg0;
	}
}
