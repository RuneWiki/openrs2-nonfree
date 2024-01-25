import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class360 {

	@OriginalMember(owner = "client!vl", name = "i", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!vl", name = "n", descriptor = "J")
	private final long aLong265;

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "J")
	private long aLong264;

	@OriginalMember(owner = "client!vl", name = "j", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class360(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong265 = arg2;
		this.aLong264 = 0L;
		this.aFile1 = arg0;
		@Pc(39) int local39 = this.aRandomAccessFile1.read();
		if (local39 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local39);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)Ljava/io/File;")
	public File method8355() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(BJ)V")
	public void method8356(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong264 = arg0;
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)J")
	public long method8357() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IBI[B)I")
	public int method8358(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(16) int local16 = this.aRandomAccessFile1.read(arg2, arg1, arg0);
		if (local16 > 0) {
			this.aLong264 += (long) local16;
		}
		return local16;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)V")
	public void method8359() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!vl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method8359();
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "([BIII)V")
	public void method8361(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if ((long) arg2 + this.aLong264 > this.aLong265) {
			this.aRandomAccessFile1.seek(this.aLong265);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong264 += (long) arg2;
		}
	}
}
