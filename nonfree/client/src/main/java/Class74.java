import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class74 {

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "J")
	private final long aLong135;

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "J")
	private long aLong136;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile3;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class74(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong135 = arg2;
		this.aLong136 = 0L;
		this.aFile3 = arg0;
		@Pc(41) int local41 = this.aRandomAccessFile1.read();
		if (local41 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local41);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
	public void method3174() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I[BBI)V")
	public void method3175(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if ((long) arg2 + this.aLong136 > this.aLong135) {
			this.aRandomAccessFile1.seek(this.aLong135 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg0, arg2);
			this.aLong136 += arg2;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method3176() {
		return this.aFile3;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)J")
	public long method3177() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZII[B)I")
	public int method3178(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(12) int local12 = this.aRandomAccessFile1.read(arg2, arg0, arg1);
		if (local12 > 0) {
			this.aLong136 += local12;
		}
		return local12;
	}

	@OriginalMember(owner = "client!tc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile3 + " not closed correctly using close(). Auto-closing instead. ");
			this.method3174();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(JZ)V")
	public void method3179(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong136 = arg0;
	}
}
