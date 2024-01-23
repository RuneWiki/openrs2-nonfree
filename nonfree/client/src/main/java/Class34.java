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

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "J")
	private long aLong42;

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "J")
	private long aLong43;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "Ljava/io/File;")
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
		this.aLong42 = 0L;
		this.aLong43 = arg2;
		this.aFile1 = arg0;
		@Pc(37) int local37 = this.aRandomAccessFile1.read();
		if (local37 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local37);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IBI[B)V")
	public void method1112(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong43 < (long) arg1 + this.aLong42) {
			this.aRandomAccessFile1.seek(this.aLong43 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg0, arg1);
			this.aLong42 += arg1;
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IJ)V")
	public void method1113(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong42 = arg0;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)Ljava/io/File;")
	public File method1114() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!fg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method1115();
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
	public void method1115() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(B)J")
	public long method1116() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BII[B)I")
	public int method1117(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg2, arg0, arg1);
		if (local6 > 0) {
			this.aLong42 += local6;
		}
		return local6;
	}
}
