import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oaa")
public final class Class235 {

	@OriginalMember(owner = "client!oaa", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!oaa", name = "c", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!oaa", name = "j", descriptor = "J")
	private final long aLong182;

	@OriginalMember(owner = "client!oaa", name = "f", descriptor = "J")
	private long aLong181;

	@OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class235(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile1 = arg0;
		this.aLong182 = arg2;
		this.aLong181 = 0L;
		@Pc(37) int local37 = this.aRandomAccessFile1.read();
		if (local37 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local37);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ZJ)V")
	public void method5482(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong181 = arg0;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)J")
	public long method5483() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "(I)Ljava/io/File;")
	public File method5485() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "([BIII)V")
	public void method5486(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong182 < (long) arg1 + this.aLong181) {
			this.aRandomAccessFile1.seek(this.aLong182);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg2, arg1);
			this.aLong181 += arg1;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(B)V")
	public void method5488() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5488();
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "([BIBI)I")
	public int method5490(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(10) int local10 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local10 > 0) {
			this.aLong181 += local10;
		}
		return local10;
	}
}
