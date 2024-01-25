import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kda")
public final class Class171 {

	@OriginalMember(owner = "client!kda", name = "h", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!kda", name = "j", descriptor = "J")
	private final long aLong145;

	@OriginalMember(owner = "client!kda", name = "f", descriptor = "J")
	private long aLong144;

	@OriginalMember(owner = "client!kda", name = "k", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class171(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong145 = arg2;
		this.aLong144 = 0L;
		this.aFile1 = arg0;
		@Pc(41) int local41 = this.aRandomAccessFile1.read();
		if (local41 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local41);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "([BIBI)I")
	public int method4930(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(15) int local15 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local15 > 0) {
			this.aLong144 += (long) local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IJ)V")
	public void method4931(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong144 = arg0;
	}

	@OriginalMember(owner = "client!kda", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method4934();
		}
	}

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "(I)V")
	public void method4934() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(B)J")
	public long method4935() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!kda", name = "c", descriptor = "(I)Ljava/io/File;")
	public File method4936() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "([BBII)V")
	public void method4937(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong145 < (long) arg2 + this.aLong144) {
			this.aRandomAccessFile1.seek(this.aLong145);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong144 += (long) arg2;
		}
	}
}
