import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qia")
public final class Class285 {

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "[I")
	public static final int[] anIntArray641 = new int[256];

	@OriginalMember(owner = "client!qia", name = "i", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!qia", name = "c", descriptor = "J")
	private final long aLong232;

	@OriginalMember(owner = "client!qia", name = "b", descriptor = "J")
	private long aLong231;

	@OriginalMember(owner = "client!qia", name = "g", descriptor = "Ljava/io/File;")
	private final File aFile1;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(7) int local7 = local4;
			for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
				if ((local7 & 0x1) == 1) {
					local7 = local7 >>> 1 ^ 0xEDB88320;
				} else {
					local7 >>>= 0x1;
				}
			}
			anIntArray641[local4] = local7;
		}
	}

	@OriginalMember(owner = "client!qia", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class285(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong232 = arg2;
		this.aLong231 = 0L;
		this.aFile1 = arg0;
		@Pc(41) int local41 = this.aRandomAccessFile1.read();
		if (local41 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local41);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "([BBII)I")
	public int method7141(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(16) int local16 = this.aRandomAccessFile1.read(arg0, arg2, arg1);
		if (local16 > 0) {
			this.aLong231 += (long) local16;
		}
		return local16;
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(B)V")
	public void method7142() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!qia", name = "b", descriptor = "(I)Ljava/io/File;")
	public File method7145() {
		return this.aFile1;
	}

	@OriginalMember(owner = "client!qia", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method7142();
		}
	}

	@OriginalMember(owner = "client!qia", name = "b", descriptor = "(IJ)V")
	public void method7146(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong231 = arg0;
	}

	@OriginalMember(owner = "client!qia", name = "b", descriptor = "(B)J")
	public long method7147() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(III[B)V")
	public void method7148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if ((long) arg0 + this.aLong231 > this.aLong232) {
			this.aRandomAccessFile1.seek(this.aLong232);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg1, arg0);
			this.aLong231 += (long) arg0;
		}
	}
}
