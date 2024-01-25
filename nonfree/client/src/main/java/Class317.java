import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class317 {

	@OriginalMember(owner = "client!sr", name = "g", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!sr", name = "i", descriptor = "J")
	private long aLong227;

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "J")
	private final long aLong226;

	@OriginalMember(owner = "client!sr", name = "e", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class317(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong227 = 0L;
		this.aLong226 = arg2;
		this.aFile1 = arg0;
		@Pc(41) int local41 = this.aRandomAccessFile1.read();
		if (local41 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local41);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(BJ)V")
	public void method6330(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong227 = arg0;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(I[BBI)I")
	public int method6331(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(18) int local18 = this.aRandomAccessFile1.read(arg1, arg2, arg0);
		if (local18 > 0) {
			this.aLong227 += local18;
		}
		return local18;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method6332() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!sr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method6333();
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)V")
	public void method6333() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Z)J")
	public long method6334() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(II[BZ)V")
	public void method6335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		if (this.aLong226 < this.aLong227 + (long) arg1) {
			this.aRandomAccessFile1.seek(this.aLong226);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg0, arg1);
			this.aLong227 += arg1;
		}
	}
}
