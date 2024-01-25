import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mea")
public final class Class214 {

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "J")
	private final long aLong189;

	@OriginalMember(owner = "client!mea", name = "n", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "client!mea", name = "m", descriptor = "J")
	private long aLong190;

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class214(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong189 = arg2;
		this.aFile1 = arg0;
		this.aLong190 = 0L;
		@Pc(35) int local35 = this.aRandomAccessFile1.read();
		if (local35 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local35);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(I)J")
	public long method5376() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "(I)Ljava/io/File;")
	public File method5377() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(I[BII)V")
	public void method5378(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong189 < this.aLong190 + (long) arg2) {
			this.aRandomAccessFile1.seek(this.aLong189);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg0, arg2);
			this.aLong190 += (long) arg2;
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(JB)V")
	public void method5379(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong190 = arg0;
	}

	@OriginalMember(owner = "client!mea", name = "c", descriptor = "(I)V")
	public void method5380() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(I[BIB)I")
	public int method5381(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(16) int local16 = this.aRandomAccessFile1.read(arg1, arg0, arg2);
		if (local16 > 0) {
			this.aLong190 += (long) local16;
		}
		return local16;
	}

	@OriginalMember(owner = "client!mea", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5380();
		}
	}
}
