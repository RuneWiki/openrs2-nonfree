import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class333 {

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "J")
	private long aLong323;

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "J")
	private final long aLong324;

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class333(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong323 = 0L;
		this.aLong324 = arg2;
		this.aFile1 = arg0;
		@Pc(39) int local39 = this.aRandomAccessFile1.read();
		if (local39 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local39);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(B)Ljava/io/File;")
	public File method7953() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)J")
	public long method7954() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!sd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method7955();
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
	public void method7955() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([BIII)V")
	public void method7956(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong324 < this.aLong323 + (long) arg2) {
			this.aRandomAccessFile1.seek(this.aLong324);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong323 += (long) arg2;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IJ)V")
	public void method7957(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong323 = arg0;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(III[B)I")
	public int method7959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(10) int local10 = this.aRandomAccessFile1.read(arg2, arg0, arg1);
		if (local10 > 0) {
			this.aLong323 += (long) local10;
		}
		return local10;
	}
}
