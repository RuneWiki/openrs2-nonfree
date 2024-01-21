import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class42 {

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "J")
	private long aLong54;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile3;

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "J")
	private final long aLong55;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class42(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong54 = 0L;
		this.aFile3 = arg0;
		this.aLong55 = arg2;
		@Pc(41) int local41 = this.aRandomAccessFile1.read();
		if (local41 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local41);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)Ljava/io/File;")
	public File method1144() {
		return this.aFile3;
	}

	@OriginalMember(owner = "client!lb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile3 + " not closed correctly using close(). Auto-closing instead. ");
			this.method1149();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BJ)V")
	public void method1145(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong54 = arg0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[BII)I")
	public int method1146(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(11) int local11 = this.aRandomAccessFile1.read(arg1, arg0, arg2);
		if (local11 > 0) {
			this.aLong54 += local11;
		}
		return local11;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)J")
	public long method1147() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([BIII)V")
	public void method1148(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if ((long) arg2 + this.aLong54 > this.aLong55) {
			this.aRandomAccessFile1.seek(this.aLong55 + 1L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong54 += arg2;
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
	public void method1149() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}
}
