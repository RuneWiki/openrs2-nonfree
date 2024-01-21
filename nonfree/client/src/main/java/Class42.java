import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class42 {

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "J")
	private long aLong59;

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "J")
	private final long aLong58;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class42(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong59 = 0L;
		this.aFile1 = arg0;
		this.aLong58 = arg2;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBI[B)I")
	public int method1212(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg2, arg0, arg1);
		if (local6 > 0) {
			this.aLong59 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method1213() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)J")
	public long method1214() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II[BI)V")
	public void method1215(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong58 < (long) arg2 + this.aLong59) {
			this.aRandomAccessFile1.seek(this.aLong58 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg0, arg2);
			this.aLong59 += arg2;
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
	public void method1216() throws IOException {
		this.aRandomAccessFile1.close();
		this.aRandomAccessFile1 = null;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(JI)V")
	public void method1217(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong59 = arg0;
	}
}
