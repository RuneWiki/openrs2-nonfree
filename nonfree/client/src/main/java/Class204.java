import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class204 {

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "J")
	private long aLong166;

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "J")
	private long aLong167;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V", line = 1)
	private Class204() {
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V", line = 3)
	public void method5194() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(II[BZ)I", line = 19)
	public int method5195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		@Pc(11) int local11 = this.aRandomAccessFile1.read(arg2, arg1, arg0);
		if (local11 > 0) {
			this.aLong167 += local11;
		}
		return local11;
	}

	@OriginalMember(owner = "client!rl", name = "finalize", descriptor = "()V", line = 36)
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5194();
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I[BII)V", line = 49)
	public void method5196(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong166 < (long) arg1 + this.aLong167) {
			this.aRandomAccessFile1.seek(this.aLong166);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg2, arg1);
			this.aLong167 += arg1;
		}
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)J", line = 68)
	public long method5197() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IJ)V", line = 78)
	public void method5198(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong167 = arg0;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)Ljava/io/File;", line = 89)
	public File method5199() {
		return this.aFile1;
	}
}
