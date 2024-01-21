import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class54 {

	@OriginalMember(owner = "client!r", name = "r", descriptor = "[I")
	public static int[] anIntArray233 = new int[32];

	@OriginalMember(owner = "client!r", name = "b", descriptor = "I")
	public int anInt2326;

	@OriginalMember(owner = "client!r", name = "c", descriptor = "Lclient!k;")
	public Class6_Sub2_Sub3 aClass6_Sub2_Sub3_8;

	@OriginalMember(owner = "client!r", name = "e", descriptor = "I")
	public int anInt2328;

	@OriginalMember(owner = "client!r", name = "g", descriptor = "I")
	public int anInt2330;

	@OriginalMember(owner = "client!r", name = "p", descriptor = "I")
	public int anInt2338;

	@OriginalMember(owner = "client!r", name = "q", descriptor = "I")
	public int anInt2339;

	@OriginalMember(owner = "client!r", name = "m", descriptor = "I")
	public int anInt2335 = 0;

	@OriginalMember(owner = "client!r", name = "d", descriptor = "I")
	public int anInt2327 = 0;

	static {
		@Pc(9) int local9 = 2;
		for (@Pc(11) int local11 = 0; local11 < 32; local11++) {
			anIntArray233[local11] = local9 - 1;
			local9 += local9;
		}
	}
}
