import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class99 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "J")
	private long aLong106;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "J")
	private long aLong107;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
	private Class99() {
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)Ljava/io/File;")
	public File method2721() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)J")
	public long method2722() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II[BB)V")
	public void method2723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		if (this.aLong106 < (long) arg1 + this.aLong107) {
			this.aRandomAccessFile1.seek(this.aLong106);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg0, arg1);
			this.aLong107 += arg1;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([BIII)I")
	public int method2724(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local6 > 0) {
			this.aLong107 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!jc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2725();
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
	public void method2725() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IJ)V")
	public void method2726(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong107 = arg0;
	}
}
