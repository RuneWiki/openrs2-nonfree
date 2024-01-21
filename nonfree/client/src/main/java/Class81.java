import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class81 {

	@OriginalMember(owner = "client!we", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!we", name = "c", descriptor = "J")
	private final long aLong96;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "J")
	private long aLong95;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "Ljava/io/File;")
	private final File aFile3;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class81(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong96 = arg2;
		this.aLong95 = 0L;
		this.aFile3 = arg0;
		@Pc(35) int local35 = this.aRandomAccessFile1.read();
		if (local35 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local35);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
	public void method2036() throws IOException {
		this.aRandomAccessFile1.close();
		this.aRandomAccessFile1 = null;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I[BII)I")
	public int method2037(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local6 > 0) {
			this.aLong95 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I[BBI)V")
	public void method2038(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if ((long) arg2 + this.aLong95 > this.aLong96) {
			this.aRandomAccessFile1.seek(this.aLong96 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg0, arg2);
			this.aLong95 += arg2;
		}
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(B)J")
	public long method2040() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(JI)V")
	public void method2041(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong95 = arg0;
	}
}
