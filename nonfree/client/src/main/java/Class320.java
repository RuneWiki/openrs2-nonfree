import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class320 {

	@OriginalMember(owner = "client!so", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!so", name = "b", descriptor = "J")
	private final long aLong233;

	@OriginalMember(owner = "client!so", name = "d", descriptor = "J")
	private long aLong234;

	@OriginalMember(owner = "client!so", name = "k", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class320(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong233 = arg2;
		this.aLong234 = 0L;
		this.aFile1 = arg0;
		@Pc(37) int local37 = this.aRandomAccessFile1.read();
		if (local37 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local37);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "([BIBI)I")
	public int method7904(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(10) int local10 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local10 > 0) {
			this.aLong234 += local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Z)V")
	public void method7905() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(BII[B)V")
	public void method7906(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if ((long) arg1 + this.aLong234 > this.aLong233) {
			this.aRandomAccessFile1.seek(this.aLong233);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg0, arg1);
			this.aLong234 += arg1;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method7908() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IJ)V")
	public void method7909(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong234 = arg0;
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(B)J")
	public long method7910() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!so", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method7905();
		}
	}
}
