import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class59 {

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "Ljava/io/File;")
	private final File aFile3;

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "J")
	private final long aLong56;

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "J")
	private long aLong57;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class59(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile3 = arg0;
		this.aLong56 = arg2;
		this.aLong57 = 0L;
		@Pc(39) int local39 = this.aRandomAccessFile1.read();
		if (local39 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local39);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	public void method1319() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[BIZ)V")
	public void method1320(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aLong57 + (long) arg0 > this.aLong56) {
			this.aRandomAccessFile1.seek(this.aLong56 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg2, arg0);
			this.aLong57 += arg0;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[BI)I")
	public int method1321(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg1, arg2, arg0);
		if (local6 > 0) {
			this.aLong57 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(JI)V")
	public void method1322(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong57 = arg0;
	}

	@OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile3 + " not closed correctly using close(). Auto-closing instead. ");
			this.method1319();
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)Ljava/io/File;")
	public File method1323() {
		return this.aFile3;
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)J")
	public long method1324() throws IOException {
		return this.aRandomAccessFile1.length();
	}
}
