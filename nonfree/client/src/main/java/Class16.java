import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class16 {

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "J")
	private final long aLong31;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V", line = 3)
	public void method362() throws IOException {
		this.aRandomAccessFile1.close();
		this.aRandomAccessFile1 = null;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BII[B)V", line = 17)
	public void method363(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong32 + (long) arg1 > this.aLong31) {
			this.aRandomAccessFile1.seek(this.aLong31 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg0, arg1);
			this.aLong32 += arg1;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "([BIII)I", line = 34)
	public int method364(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg2, arg1);
		if (local6 > 0) {
			this.aLong32 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)J", line = 50)
	public long method365() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)Ljava/io/File;", line = 60)
	public File method366() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IJ)V", line = 70)
	public void method367(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong32 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 82)
	public Class16(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong31 = arg2;
		this.aFile1 = arg0;
		this.aLong32 = 0L;
	}
}
