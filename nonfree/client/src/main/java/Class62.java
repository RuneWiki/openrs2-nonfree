import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class62 {

	@OriginalMember(owner = "client!me", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "J")
	private long aLong112;

	@OriginalMember(owner = "client!me", name = "d", descriptor = "Ljava/io/File;")
	private File aFile3;

	@OriginalMember(owner = "client!me", name = "b", descriptor = "J")
	private long aLong113;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class62(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong112 = arg2;
		this.aFile3 = arg0;
		this.aLong113 = 0L;
		@Pc(41) int local41 = this.aRandomAccessFile1.read();
		if (local41 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local41);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BII[B)V")
	public void method2304(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong112 < (long) arg1 + this.aLong113) {
			this.aRandomAccessFile1.seek(this.aLong112 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg0, arg1);
			this.aLong113 += arg1;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	public void method2305() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!me", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile3 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2305();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([BIII)I")
	public int method2306(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg2, arg1);
		if (local6 > 0) {
			this.aLong113 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)J")
	public long method2307() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(JZ)V")
	public void method2308(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong113 = arg0;
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(I)Ljava/io/File;")
	public File method2309() {
		return this.aFile3;
	}
}
