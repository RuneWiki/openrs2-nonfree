import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class41 {

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "J")
	private long aLong42;

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "J")
	private final long aLong41;

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class41(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong42 = 0L;
		this.aLong41 = arg2;
		this.aFile1 = arg0;
		@Pc(35) int local35 = this.aRandomAccessFile1.read();
		if (local35 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local35);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BJ)V")
	public void method1068(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong42 = arg0;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([BIIB)I")
	public int method1069(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg2, arg1);
		if (local6 > 0) {
			this.aLong42 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II[BB)V")
	public void method1070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		if ((long) arg1 + this.aLong42 > this.aLong41) {
			this.aRandomAccessFile1.seek(this.aLong41 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg0, arg1);
			this.aLong42 += arg1;
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
	public void method1072() throws IOException {
		this.aRandomAccessFile1.close();
		this.aRandomAccessFile1 = null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)J")
	public long method1073() throws IOException {
		return this.aRandomAccessFile1.length();
	}
}
