import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class354 {

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "[F")
	public static final float[] aFloatArray68 = new float[16384];

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "[F")
	public static final float[] aFloatArray69 = new float[16384];

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "J")
	private long aLong288;

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "J")
	private final long aLong289;

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "Ljava/io/File;")
	private final File aFile1;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray69[local9] = (float) Math.sin(local7 * (double) local9);
			aFloatArray68[local9] = (float) Math.cos((double) local9 * local7);
		}
	}

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class354(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong288 = 0L;
		this.aLong289 = arg2;
		this.aFile1 = arg0;
		@Pc(37) int local37 = this.aRandomAccessFile1.read();
		if (local37 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local37);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)J")
	public long method8081() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!wc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method8089();
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II[BI)I")
	public int method8083(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(10) int local10 = this.aRandomAccessFile1.read(arg1, arg2, arg0);
		if (local10 > 0) {
			this.aLong288 += local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(JB)V")
	public void method8084(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong288 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([BIII)V")
	public void method8086(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if ((long) arg1 + this.aLong288 > this.aLong289) {
			this.aRandomAccessFile1.seek(this.aLong289);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg2, arg1);
			this.aLong288 += arg1;
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)Ljava/io/File;")
	public File method8087() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(Z)V")
	public void method8089() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}
}
