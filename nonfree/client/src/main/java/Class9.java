import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class9 {

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "J")
	private long aLong7;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "J")
	private final long aLong6;

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "Ljava/io/File;")
	private final File aFile3;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class9(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong7 = 0L;
		this.aLong6 = arg2;
		this.aFile3 = arg0;
		@Pc(41) int local41 = this.aRandomAccessFile1.read();
		if (local41 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local41);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)J")
	public long method150() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(JI)V")
	public void method151(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong7 = arg0;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(III[B)V")
	public void method152(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong6 < this.aLong7 + (long) arg0) {
			this.aRandomAccessFile1.seek(this.aLong6 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg1, arg0);
			this.aLong7 += arg0;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "([BIII)I")
	public int method153(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(12) int local12 = this.aRandomAccessFile1.read(arg0, arg2, arg1);
		if (local12 > 0) {
			this.aLong7 += local12;
		}
		return local12;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
	public void method154() throws IOException {
		this.aRandomAccessFile1.close();
		this.aRandomAccessFile1 = null;
	}
}
