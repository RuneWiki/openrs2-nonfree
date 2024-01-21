import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class20 {

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "J")
	private final long aLong44;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "J")
	private long aLong43;

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class20(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong44 = arg2;
		this.aLong43 = 0L;
		this.aFile1 = arg0;
		@Pc(39) int local39 = this.aRandomAccessFile1.read();
		if (local39 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local39);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!dg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method608();
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)J")
	public long method603() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(BJ)V")
	public void method604(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong43 = arg0;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II[BB)I")
	public int method605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg2, arg1, arg0);
		if (local6 > 0) {
			this.aLong43 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(III[B)V")
	public void method606(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong44 < (long) arg1 + this.aLong43) {
			this.aRandomAccessFile1.seek(this.aLong44 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg0, arg1);
			this.aLong43 += arg1;
		}
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)Ljava/io/File;")
	public File method607() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)V")
	public void method608() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}
}
