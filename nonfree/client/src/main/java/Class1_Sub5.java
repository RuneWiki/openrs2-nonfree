import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!df", name = "t", descriptor = "[B")
	public static byte[] aByteArray20 = new byte[32896];

	@OriginalMember(owner = "client!df", name = "r", descriptor = "I")
	public int anInt1355;

	@OriginalMember(owner = "client!df", name = "x", descriptor = "I")
	public int anInt1358;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(9) int local9 = 0; local9 <= local6; local9++) {
				aByteArray20[local4++] = (byte) (255.0D / Math.sqrt((double) ((float) (local6 * local6 + local9 * local9 + 65535) / 65535.0F)));
			}
		}
	}
}
