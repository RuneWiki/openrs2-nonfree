import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class67 {

	@OriginalMember(owner = "client!md", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!md", name = "d", descriptor = "J")
	private long aLong139;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile3;

	@OriginalMember(owner = "client!md", name = "c", descriptor = "J")
	private final long aLong138;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class67(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong139 = 0L;
		this.aFile3 = arg0;
		this.aLong138 = arg2;
		@Pc(35) int local35 = this.aRandomAccessFile1.read();
		if (local35 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local35);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
	public void method1871() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Z[BII)I")
	public int method1872(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(12) int local12 = this.aRandomAccessFile1.read(arg0, arg2, arg1);
		if (local12 > 0) {
			this.aLong139 += local12;
		}
		return local12;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)J")
	public long method1873() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)Ljava/io/File;")
	public File method1874() {
		return this.aFile3;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "([BIII)V")
	public void method1875(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aLong138 < this.aLong139 + (long) arg2) {
			this.aRandomAccessFile1.seek(this.aLong138 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong139 += arg2;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BJ)V")
	public void method1876(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong139 = arg0;
	}

	@OriginalMember(owner = "client!md", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile3 + " not closed correctly using close(). Auto-closing instead. ");
			this.method1871();
		}
	}
}
