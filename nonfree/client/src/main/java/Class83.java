import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class83 {

	@OriginalMember(owner = "client!t", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "Ljava/io/File;")
	private final File aFile3;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "J")
	private long aLong132;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "J")
	private final long aLong131;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class83(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile3 = arg0;
		this.aLong132 = 0L;
		this.aLong131 = arg2;
		@Pc(39) int local39 = this.aRandomAccessFile1.read();
		if (local39 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local39);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(B)J")
	public long method2931() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IJ)V")
	public void method2932(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong132 = arg0;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(III[B)I")
	public int method2933(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(12) int local12 = this.aRandomAccessFile1.read(arg2, arg1, arg0);
		if (local12 > 0) {
			this.aLong132 += local12;
		}
		return local12;
	}

	@OriginalMember(owner = "client!t", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile3 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2934();
		}
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(B)V")
	public void method2934() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(B[BII)V")
	public void method2935(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong131 < this.aLong132 + (long) arg2) {
			this.aRandomAccessFile1.seek(this.aLong131 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong132 += arg2;
		}
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(B)Ljava/io/File;")
	public File method2936() {
		return this.aFile3;
	}
}
