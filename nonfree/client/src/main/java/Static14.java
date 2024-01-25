import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "Lclient!fca;")
	public static final Class109 aClass109_1 = new Class109();

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
	public static int anInt463 = 0;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V")
	public static void method291(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = Static412.anInt575 - Static24.anInt646;
		if (local8 >= 100) {
			Static94.anInt2006 = -1;
			Static238.anInt4482 = -1;
			Static311.anInt5570 = 1;
			return;
		}
		@Pc(23) int local23 = (int) Static412.aFloat13;
		if (Static95.anInt2023 >> 8 > local23) {
			local23 = Static95.anInt2023 >> 8;
		}
		if (Static536.aBooleanArray39[4] && local23 < Static328.anIntArray425[4] + 128) {
			local23 = Static328.anIntArray425[4] + 128;
		}
		@Pc(56) int local56 = (int) Static447.aFloat233 + Static478.anInt8186 & 0x3FFF;
		Static133.method2289((local23 >> 3) * 3 + 600 << 2, Static264.anInt4870, local23, Static553.anInt9056, local56, arg0, Static524.method7217(Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8761, Static566.anInt9278, Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8764) - 200);
		@Pc(102) float local102 = 1.0F - (float) ((100 - local8) * (100 - local8) * (100 - local8)) / 1000000.0F;
		Static7.anInt337 = (int) ((float) Static465.anInt7977 + local102 * (float) (Static7.anInt337 - Static465.anInt7977));
		Static90.anInt1932 = (int) ((float) (Static90.anInt1932 - Static260.anInt4826) * local102 + (float) Static260.anInt4826);
		Static548.anInt8906 = (int) ((float) (Static548.anInt8906 - Static101.anInt2066) * local102 + (float) Static101.anInt2066);
		Static323.anInt6015 = (int) ((float) Static300.anInt4989 + (float) (Static323.anInt6015 - Static300.anInt4989) * local102);
		@Pc(154) int local154 = Static177.anInt3712 - Static506.anInt8458;
		if (local154 > 8192) {
			local154 -= 16384;
		} else if (local154 < -8192) {
			local154 += 16384;
		}
		Static177.anInt3712 = (int) ((float) Static506.anInt8458 + (float) local154 * local102);
		Static177.anInt3712 &= 0x3FFF;
	}
}
