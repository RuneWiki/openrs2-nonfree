import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class308 {

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "J")
	private long aLong242;

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "J")
	private long aLong243;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "()V")
	private Class308() {
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)J")
	public long method7735() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IB[BI)V")
	public void method7736(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if ((long) arg0 + this.aLong242 > this.aLong243) {
			this.aRandomAccessFile1.seek(this.aLong243);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg2, arg0);
			this.aLong242 += arg0;
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "([BIII)I")
	public int method7737(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(14) int local14 = this.aRandomAccessFile1.read(arg0, arg2, arg1);
		if (local14 > 0) {
			this.aLong242 += local14;
		}
		return local14;
	}

	@OriginalMember(owner = "client!vr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method7739();
		}
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)Ljava/io/File;")
	public File method7738() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "(I)V")
	public void method7739() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(JI)V")
	public void method7740(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong242 = arg0;
	}
}
