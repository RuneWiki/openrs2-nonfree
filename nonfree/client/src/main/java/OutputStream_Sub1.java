import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class OutputStream_Sub1 extends OutputStream {

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "[B")
	public static byte[] aByteArray25 = new byte[32896];

	static {
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			for (@Pc(16) int local16 = 0; local16 <= local11; local16++) {
				aByteArray25[local9++] = (byte) (255.0D / Math.sqrt((double) ((float) (local16 * local16 + local11 * local11 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!ia", name = "write", descriptor = "(I)V")
	@Override
	public void write(@OriginalArg(0) int arg0) throws IOException {
		throw new IOException();
	}
}
