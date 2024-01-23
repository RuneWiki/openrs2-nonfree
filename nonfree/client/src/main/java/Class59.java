import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class59 {

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "J")
	private long aLong73;

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "J")
	private long aLong74;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class59(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong73 = 0L;
		this.aFile1 = arg0;
		this.aLong74 = arg2;
		@Pc(39) int local39 = this.aRandomAccessFile1.read();
		if (local39 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local39);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!kg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method1787();
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(JI)V")
	public void method1786(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong73 = arg0;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)V")
	public void method1787() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "([BIII)I")
	public int method1788(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(12) int local12 = this.aRandomAccessFile1.read(arg0, arg2, arg1);
		if (local12 > 0) {
			this.aLong73 += local12;
		}
		return local12;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(III[B)V")
	public void method1789(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong73 + (long) arg1 > this.aLong74) {
			this.aRandomAccessFile1.seek(this.aLong74 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg0, arg1);
			this.aLong73 += arg1;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method1790() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)J")
	public long method1791() throws IOException {
		return this.aRandomAccessFile1.length();
	}
}
