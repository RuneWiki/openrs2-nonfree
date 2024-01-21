import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class99 {

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "Ljava/io/File;")
	private final File aFile3;

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "J")
	private final long aLong248;

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "J")
	private long aLong249;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class99(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile3 = arg0;
		this.aLong248 = arg2;
		this.aLong249 = 0L;
		@Pc(39) int local39 = this.aRandomAccessFile1.read();
		if (local39 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local39);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
	public void method3404() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)Ljava/io/File;")
	public File method3405() {
		return this.aFile3;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(JB)V")
	public void method3406(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong249 = arg0;
	}

	@OriginalMember(owner = "client!wh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile3 + " not closed correctly using close(). Auto-closing instead. ");
			this.method3404();
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BI[BI)I")
	public int method3407(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(13) int local13 = this.aRandomAccessFile1.read(arg1, arg0, arg2);
		if (local13 > 0) {
			this.aLong249 += local13;
		}
		return local13;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)J")
	public long method3408() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II[BI)V")
	public void method3409(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong249 + (long) arg0 > this.aLong248) {
			this.aRandomAccessFile1.seek(this.aLong248 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg2, arg0);
			this.aLong249 += arg0;
		}
	}
}
