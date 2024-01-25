import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class82 {

	@OriginalMember(owner = "client!dq", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!dq", name = "d", descriptor = "J")
	private final long aLong66;

	@OriginalMember(owner = "client!dq", name = "j", descriptor = "J")
	private long aLong67;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class82(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile1 = arg0;
		this.aLong66 = arg2;
		this.aLong67 = 0L;
		@Pc(37) int local37 = this.aRandomAccessFile1.read();
		if (local37 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local37);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method2005() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(III[B)V")
	public void method2007(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if ((long) arg1 + this.aLong67 > this.aLong66) {
			this.aRandomAccessFile1.seek(this.aLong66);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg0, arg1);
			this.aLong67 += (long) arg1;
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Z[BII)I")
	public int method2008(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(15) int local15 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local15 > 0) {
			this.aLong67 += (long) local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)J")
	public long method2009() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!dq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2011();
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(JZ)V")
	public void method2010(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong67 = arg0;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Z)V")
	public void method2011() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}
}
