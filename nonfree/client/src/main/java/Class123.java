import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class123 {

	@OriginalMember(owner = "client!fi", name = "i", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!fi", name = "j", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "J")
	private final long aLong83;

	@OriginalMember(owner = "client!fi", name = "k", descriptor = "J")
	private long aLong84;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class123(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile1 = arg0;
		this.aLong83 = arg2;
		this.aLong84 = 0L;
		@Pc(39) int local39 = this.aRandomAccessFile1.read();
		if (local39 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local39);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method2761() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)J")
	public long method2762() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I[BII)V")
	public void method2763(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aLong83 < this.aLong84 + (long) arg2) {
			this.aRandomAccessFile1.seek(this.aLong83);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg0, arg2);
			this.aLong84 += (long) arg2;
		}
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V")
	public void method2764() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZJ)V")
	public void method2765(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong84 = arg0;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(B[BII)I")
	public int method2766(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(15) int local15 = this.aRandomAccessFile1.read(arg0, arg2, arg1);
		if (local15 > 0) {
			this.aLong84 += (long) local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!fi", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2764();
		}
	}
}
