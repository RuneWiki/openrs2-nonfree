import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class44 {

	@OriginalMember(owner = "client!bt", name = "k", descriptor = "[Lclient!hda;")
	public static final Class143[] aClass143Array1 = new Class143[5];

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "J")
	private final long aLong49;

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "J")
	private long aLong50;

	@OriginalMember(owner = "client!bt", name = "l", descriptor = "Ljava/io/File;")
	private final File aFile1;

	static {
		for (@Pc(4) int local4 = 0; local4 < aClass143Array1.length; local4++) {
			aClass143Array1[local4] = new Class143();
		}
	}

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class44(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong49 = arg2;
		this.aLong50 = 0L;
		this.aFile1 = arg0;
		@Pc(35) int local35 = this.aRandomAccessFile1.read();
		if (local35 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local35);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II[BI)I")
	public int method954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		@Pc(15) int local15 = this.aRandomAccessFile1.read(arg2, arg1, arg0);
		if (local15 > 0) {
			this.aLong50 += local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IJ)V")
	public void method955(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong50 = arg0;
	}

	@OriginalMember(owner = "client!bt", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method960();
		}
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(II[BI)V")
	public void method956(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong49 < this.aLong50 + (long) arg2) {
			this.aRandomAccessFile1.seek(this.aLong49);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg1, arg0, arg2);
			this.aLong50 += arg2;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(B)J")
	public long method957() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)Ljava/io/File;")
	public File method959() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(I)V")
	public void method960() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}
}
