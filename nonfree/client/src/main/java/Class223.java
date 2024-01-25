import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class223 {

	@OriginalMember(owner = "client!lm", name = "l", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!lm", name = "j", descriptor = "J")
	private final long aLong164;

	@OriginalMember(owner = "client!lm", name = "i", descriptor = "J")
	private long aLong165;

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class223(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong164 = arg2;
		this.aLong165 = 0L;
		this.aFile1 = arg0;
		@Pc(41) int local41 = this.aRandomAccessFile1.read();
		if (local41 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local41);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZII[B)I")
	public int method5087(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(10) int local10 = this.aRandomAccessFile1.read(arg2, arg0, arg1);
		if (local10 > 0) {
			this.aLong165 += (long) local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)Ljava/io/File;")
	public File method5088() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BJ)V")
	public void method5089(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong165 = arg0;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)J")
	public long method5090() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V")
	public void method5092() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(III[B)V")
	public void method5093(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if ((long) arg0 + this.aLong165 > this.aLong164) {
			this.aRandomAccessFile1.seek(this.aLong164);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg1, arg0);
			this.aLong165 += (long) arg0;
		}
	}

	@OriginalMember(owner = "client!lm", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5092();
		}
	}
}
