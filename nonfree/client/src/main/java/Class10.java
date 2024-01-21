import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class10 {

	@OriginalMember(owner = "client!be", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "J")
	private long aLong11;

	@OriginalMember(owner = "client!be", name = "c", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!be", name = "b", descriptor = "J")
	private final long aLong12;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class10(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong11 = 0L;
		this.aFile1 = arg0;
		this.aLong12 = arg2;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
	public void method286() throws IOException {
		this.aRandomAccessFile1.close();
		this.aRandomAccessFile1 = null;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)Ljava/io/File;")
	public File method287() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(JB)V")
	public void method288(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong11 = arg0;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "([BIIB)I")
	public int method289(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(14) int local14 = this.aRandomAccessFile1.read(arg0, arg2, arg1);
		if (local14 > 0) {
			this.aLong11 += local14;
		}
		return local14;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)J")
	public long method290() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZII[B)V")
	public void method291(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong12 < (long) arg0 + this.aLong11) {
			this.aRandomAccessFile1.seek(this.aLong12 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg1, arg0);
			this.aLong11 += arg0;
		}
	}
}
