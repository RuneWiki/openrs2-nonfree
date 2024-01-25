import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bja")
public final class OutputStream_Sub2 extends OutputStream {

	@OriginalMember(owner = "client!bja", name = "c", descriptor = "[B")
	public static final byte[] aByteArray13;

	static {
		@Pc(3) int local3 = 0;
		aByteArray13 = new byte[32896];
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			for (@Pc(11) int local11 = 0; local11 <= local8; local11++) {
				aByteArray13[local3++] = (byte) (255.0D / Math.sqrt((double) ((float) (local11 * local11 + local8 * local8 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!bja", name = "write", descriptor = "(I)V")
	@Override
	public void write(@OriginalArg(0) int arg0) throws IOException {
		throw new IOException();
	}
}
