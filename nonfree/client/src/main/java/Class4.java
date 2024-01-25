import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class4 {

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "J")
	private final long aLong6;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "J")
	private long aLong5;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class4(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile1 = arg0;
		this.aLong6 = arg2;
		this.aLong5 = 0L;
		@Pc(35) int local35 = this.aRandomAccessFile1.read();
		if (local35 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local35);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "([BIII)I")
	public int method79(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(17) int local17 = this.aRandomAccessFile1.read(arg0, arg2, arg1);
		if (local17 > 0) {
			this.aLong5 += (long) local17;
		}
		return local17;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method80() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BJ)V")
	public void method82(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong5 = arg0;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
	public void method84() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)J")
	public long method85() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "([BIII)V")
	public void method86(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong5 + (long) arg2 > this.aLong6) {
			this.aRandomAccessFile1.seek(this.aLong6);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong5 += (long) arg2;
		}
	}

	@OriginalMember(owner = "client!ac", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method84();
		}
	}
}
