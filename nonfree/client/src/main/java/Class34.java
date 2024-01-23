import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class34 {

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "J")
	private long aLong52;

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "J")
	private long aLong53;

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class34(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong52 = arg2;
		this.aLong53 = 0L;
		this.aFile1 = arg0;
		@Pc(41) int local41 = this.aRandomAccessFile1.read();
		if (local41 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local41);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "([BIII)I")
	public int method944(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(12) int local12 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local12 > 0) {
			this.aLong53 += local12;
		}
		return local12;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(JB)V")
	public void method945(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong53 = arg0;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I[BII)V")
	public void method946(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong53 + (long) arg0 > this.aLong52) {
			this.aRandomAccessFile1.seek(this.aLong52 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg2, arg0);
			this.aLong53 += arg0;
		}
	}

	@OriginalMember(owner = "client!fg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method949();
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method947() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)J")
	public long method948() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(I)V")
	public void method949() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}
}
