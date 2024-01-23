import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class68 {

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "Ljava/io/File;")
	private File aFile1;

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "J")
	private long aLong83;

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "J")
	private long aLong84;

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(II[BI)V")
	public void method1819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		if (this.aLong83 >= this.aLong84 + (long) arg0) {
			this.aRandomAccessFile1.write(arg2, arg1, arg0);
			this.aLong84 += arg0;
		} else {
			this.aRandomAccessFile1.seek(this.aLong83);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(II[BI)I")
	public int method1820(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg1, arg0, arg2);
		if (local6 > 0) {
			this.aLong84 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)J")
	public long method1821() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!hm", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method1824();
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)Ljava/io/File;")
	public File method1822() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(JI)V")
	public void method1823(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong84 = arg0;
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V")
	public void method1824() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}
}
