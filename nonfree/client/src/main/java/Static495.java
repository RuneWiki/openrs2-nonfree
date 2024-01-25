import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static495 {

	@OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
	public static int anInt8540;

	@OriginalMember(owner = "client!ri", name = "q", descriptor = "Lclient!vs;")
	public static Class363 aClass363_5;

	@OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
	public static int anInt8541;

	@OriginalMember(owner = "client!ri", name = "n", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_125 = new Class200(66, 1);

	@OriginalMember(owner = "client!ri", name = "p", descriptor = "Lclient!vg;")
	public static final Class354 aClass354_1 = new Class354();

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(FFFIFIFF)F")
	public static float method7330(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6) {
		@Pc(15) float local15 = 0.0F;
		@Pc(19) float local19 = arg0 - arg5;
		@Pc(23) float local23 = arg2 - arg4;
		@Pc(28) float local28 = arg6 - arg1;
		@Pc(30) float local30 = 0.0F;
		@Pc(32) float local32 = 0.0F;
		@Pc(34) float local34 = 0.0F;
		while (local15 < 1.1F) {
			@Pc(42) float local42 = arg5 + local19 * local15;
			@Pc(48) float local48 = local23 * local15 + arg4;
			@Pc(54) float local54 = local28 * local15 + arg1;
			@Pc(59) int local59 = (int) local42 >> 9;
			@Pc(64) int local64 = (int) local54 >> 9;
			if (local59 > 0 && local64 > 0 && Static634.anInt10129 > local59 && local64 < Static638.anInt10172) {
				@Pc(88) int local88 = Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123;
				if (local88 < 3 && (Static513.aByteArrayArrayArray18[1][local59][local64] & 0x2) != 0) {
					local88++;
				}
				@Pc(114) int local114 = Static559.aClass51Array4[local88].method7839((int) local42, (int) local54);
				if ((float) local114 < local48) {
					if (arg3 >= 2) {
						return method7330(local42, local34, local48, arg3 - 1, local32, local30, local54) * 0.1F + local15 - 0.1F;
					}
					return local15;
				}
			}
			local30 = local42;
			local15 += 0.1F;
			local34 = local54;
			local32 = local48;
		}
		return -1.0F;
	}
}
