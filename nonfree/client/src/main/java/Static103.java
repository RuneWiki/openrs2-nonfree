import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "[I")
	public static int[] anIntArray97;

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "F")
	public static float aFloat71;

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
	public static int anInt2861 = 0;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)V")
	public static void method2428(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = Static384.anInt7234 - Static209.anInt4537;
		if (local16 >= 100) {
			Static594.anInt10048 = -1;
			Static214.anInt4587 = -1;
			Static554.anInt9497 = 1;
			return;
		}
		@Pc(29) int local29 = (int) Static532.aFloat179;
		if (local29 < Static86.anInt10555 >> 8) {
			local29 = Static86.anInt10555 >> 8;
		}
		if (Static388.aBooleanArray18[4] && Static203.anIntArray199[4] + 128 > local29) {
			local29 = Static203.anIntArray199[4] + 128;
		}
		@Pc(66) int local66 = Static141.anInt3352 + (int) Static595.aFloat184 & 0x3FFF;
		Static189.method3493(local66, (local29 >> 3) * 3 + 600 << 2, Static387.anInt7286, arg0, Static369.anInt7056, local29, Static150.method2982(Static86.anInt10575, Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10357, Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10360) - 200);
		@Pc(110) float local110 = 1.0F - (float) ((100 - local16) * (-local16 + 100) * (100 - local16)) / 1000000.0F;
		Static404.anInt4286 = (int) ((float) (Static404.anInt4286 - Static521.anInt9826) * local110 + (float) Static521.anInt9826);
		Static184.anInt4048 = (int) ((float) Static66.anInt2292 + (float) (Static184.anInt4048 - Static66.anInt2292) * local110);
		Static149.anInt3489 = (int) ((float) Static617.anInt10418 + local110 * (float) (Static149.anInt3489 - Static617.anInt10418));
		Static259.anInt6990 = (int) ((float) Static624.anInt10503 + (float) (Static259.anInt6990 - Static624.anInt10503) * local110);
		@Pc(163) int local163 = Static349.anInt6848 - Static171.anInt3806;
		if (local163 > 8192) {
			local163 -= 16384;
		} else if (local163 < -8192) {
			local163 += 16384;
		}
		Static349.anInt6848 = (int) ((float) Static171.anInt3806 + (float) local163 * local110);
		Static349.anInt6848 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V")
	public static void method2429() {
		@Pc(7) int local7 = Static6.anInt462;
		@Pc(17) int[] local17 = Static551.anIntArray503;
		for (@Pc(19) int local19 = 0; local19 < local7; local19++) {
			@Pc(27) Class9_Sub4_Sub2_Sub1_Sub2 local27 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local17[local19]];
			if (local27 != null) {
				Static143.method2825(local27, local27.method3620());
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIII)Lclient!eda;")
	public static Class6_Sub17 method2430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class6_Sub17 local13 = null;
		if (arg1 == 0) {
			local13 = Static330.method7824(Static447.aClass185_90, Static569.aClass134_2);
		}
		if (arg1 == 1) {
			local13 = Static330.method7824(Static201.aClass185_81, Static569.aClass134_2);
		}
		local13.aClass6_Sub8_Sub1_2.method8255(Static477.anInt8412 + arg2);
		local13.aClass6_Sub8_Sub1_2.method8255(Static227.anInt5049 + arg0);
		local13.aClass6_Sub8_Sub1_2.method8211(Static391.aClass91_1.method6224(82) ? 1 : 0);
		Static445.anInt8080 = arg0;
		Static473.anInt8390 = arg2;
		Static622.aBoolean830 = false;
		Static269.method8233();
		return local13;
	}
}
