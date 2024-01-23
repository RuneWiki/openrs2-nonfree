import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "[I")
	public static int[] anIntArray30;

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "B")
	public static byte aByte2;

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "Z")
	public static boolean aBoolean38 = false;

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString29 = "M";

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "Lclient!td;")
	public static Class162 aClass162_1 = new Class162();

	@OriginalMember(owner = "client!bg", name = "n", descriptor = "Z")
	public static boolean aBoolean39 = false;

	@OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
	public static int anInt472 = 0;

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
	public static void method418() {
		if (Static65.anInt1462 == -1 || Static150.anInt3180 == -1) {
			return;
		}
		@Pc(23) int local23 = (Static103.anInt2241 * (Static11.anInt295 - Static191.anInt708) >> 16) + Static191.anInt708;
		@Pc(26) float[] local26 = new float[3];
		@Pc(30) int local30 = Static27.anInt579 * 2;
		Static103.anInt2241 += local23;
		if (Static103.anInt2241 < 65535) {
			Static124.aBoolean209 = false;
			Static199.aBoolean344 = false;
		} else {
			if (Static124.aBoolean209) {
				Static199.aBoolean344 = false;
			} else {
				Static199.aBoolean344 = true;
			}
			Static103.anInt2241 = 65535;
			Static124.aBoolean209 = true;
		}
		@Pc(62) float local62 = (float) Static103.anInt2241 / 65535.0F;
		@Pc(89) int local89;
		@Pc(79) int local79;
		@Pc(129) int local129;
		@Pc(97) int local97;
		@Pc(134) int local134;
		@Pc(143) int local143;
		@Pc(162) int local162;
		for (@Pc(64) int local64 = 0; local64 < 3; local64++) {
			local79 = Static206.anIntArrayArrayArray11[Static65.anInt1462][local30 + 1][local64] * 3;
			local89 = Static206.anIntArrayArrayArray11[Static65.anInt1462][local30][local64] * 3;
			local97 = Static206.anIntArrayArrayArray11[Static65.anInt1462][local30][local64];
			local129 = (Static206.anIntArrayArrayArray11[Static65.anInt1462][local30 + 2][local64] + Static206.anIntArrayArrayArray11[Static65.anInt1462][local30 + 2][local64] - Static206.anIntArrayArrayArray11[Static65.anInt1462][local30 + 3][local64]) * 3;
			local134 = local79 - local89;
			local143 = local129 + local89 - local79 * 2;
			local162 = Static206.anIntArrayArrayArray11[Static65.anInt1462][local30 + 2][local64] + local79 - local97 - local129;
			local26[local64] = local62 * ((float) local134 + local62 * ((float) local143 + (float) local162 * local62)) + (float) local97;
		}
		Static133.anInt2729 = (int) local26[1] * -1;
		Static271.anInt5632 = (int) local26[0] - Static125.anInt5772 * 128;
		@Pc(205) float[] local205 = new float[3];
		Static255.anInt5182 = (int) local26[2] - Static203.anInt4236 * 128;
		local89 = Static297.anInt6216 * 2;
		for (local79 = 0; local79 < 3; local79++) {
			local97 = Static206.anIntArrayArrayArray11[Static150.anInt3180][local89 + 1][local79] * 3;
			local129 = Static206.anIntArrayArrayArray11[Static150.anInt3180][local89][local79] * 3;
			local162 = local97 - local129;
			local134 = (Static206.anIntArrayArrayArray11[Static150.anInt3180][local89 + 2][local79] + Static206.anIntArrayArrayArray11[Static150.anInt3180][local89 + 2][local79] - Static206.anIntArrayArrayArray11[Static150.anInt3180][local89 + 3][local79]) * 3;
			@Pc(293) int local293 = local134 + local129 - local97 * 2;
			local143 = Static206.anIntArrayArrayArray11[Static150.anInt3180][local89][local79];
			@Pc(318) int local318 = local97 + Static206.anIntArrayArrayArray11[Static150.anInt3180][local89 + 2][local79] - local143 - local134;
			local205[local79] = ((float) local162 + (local62 * (float) local318 + (float) local293) * local62) * local62 + (float) local143;
		}
		@Pc(350) float local350 = local205[0] - local26[0];
		@Pc(360) float local360 = -1.0F * (local205[1] - local26[1]);
		@Pc(369) float local369 = local205[2] - local26[2];
		@Pc(379) double local379 = Math.sqrt((double) (local350 * local350 + local369 * local369));
		Static188.aFloat40 = (float) Math.atan2((double) local360, local379);
		Static226.aFloat20 = -((float) Math.atan2((double) local350, (double) local369));
		Static265.anInt5500 = (int) ((double) Static226.aFloat20 * 325.949D) & 0x7FF;
		Static210.anInt4376 = (int) ((double) Static188.aFloat40 * 325.949D) & 0x7FF;
	}
}
