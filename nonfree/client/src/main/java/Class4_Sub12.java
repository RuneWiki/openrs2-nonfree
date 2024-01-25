import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public class Class4_Sub12 extends Class4 {

	@OriginalMember(owner = "client!fs", name = "s", descriptor = "[B")
	public static final byte[] aByteArray89 = new byte[32896];

	@OriginalMember(owner = "client!fs", name = "u", descriptor = "[I")
	public static final int[] anIntArray497;

	@OriginalMember(owner = "client!fs", name = "m", descriptor = "I")
	public int anInt6078;

	@OriginalMember(owner = "client!fs", name = "n", descriptor = "I")
	public int anInt6079;

	@OriginalMember(owner = "client!fs", name = "p", descriptor = "I")
	public int anInt6081;

	@OriginalMember(owner = "client!fs", name = "q", descriptor = "F")
	public float aFloat72;

	@OriginalMember(owner = "client!fs", name = "r", descriptor = "I")
	public int anInt6082;

	@OriginalMember(owner = "client!fs", name = "t", descriptor = "I")
	public int anInt6083;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(9) int local9 = 0; local9 <= local6; local9++) {
				aByteArray89[local4++] = (byte) (255.0D / Math.sqrt((double) ((float) (local6 * local6 + local9 * local9 + 65535) / 65535.0F)));
			}
		}
		anIntArray497 = new int[4096];
		for (local4 = 0; local4 < 4096; local4++) {
			anIntArray497[local4] = Static111.method2069(local4);
		}
	}
}
