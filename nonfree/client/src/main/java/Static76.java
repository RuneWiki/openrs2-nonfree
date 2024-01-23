import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "Lclient!nk;")
	public static Class121 aClass121_42;

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
	public static int anInt1574;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "[F")
	public static float[] aFloatArray5 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
	public static int anInt1571 = -1;

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "[S")
	public static short[] aShortArray29 = new short[256];

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIB)V")
	public static void method1483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1007) {
			Static200.method3228(10, arg0, arg1);
		} else if (arg2 == 1005) {
			Static200.method3228(11, arg0, arg1);
		} else if (arg2 == 1011) {
			Static200.method3228(12, arg0, arg1);
		} else if (arg2 == 1003) {
			Static200.method3228(13, arg0, arg1);
		} else if (arg2 == 1008) {
			Static200.method3228(14, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
	public static void method1484(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static105.aClass1_Sub33ArrayArrayArray2 = Static229.aClass1_Sub33ArrayArrayArray4;
			Static24.anIntArrayArrayArray2 = Static257.anIntArrayArrayArray15;
			Static15.aClass1_Sub31ArrayArray1 = Static167.aClass1_Sub31ArrayArray2;
		} else {
			Static105.aClass1_Sub33ArrayArrayArray2 = Static153.aClass1_Sub33ArrayArrayArray3;
			Static24.anIntArrayArrayArray2 = Static95.anIntArrayArrayArray5;
			Static15.aClass1_Sub31ArrayArray1 = Static297.aClass1_Sub31ArrayArray3;
		}
		Static312.anInt5729 = Static105.aClass1_Sub33ArrayArrayArray2.length;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZI)V")
	public static void method1485(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static46.anInt938 > 0) {
			Static242.method3804(Static46.anInt938);
			Static46.anInt938 = 0;
		}
		@Pc(24) int local24 = 0;
		@Pc(28) int local28 = arg1 * Static25.anInt420;
		@Pc(30) int local30 = 0;
		for (@Pc(32) int local32 = 1; local32 < 255; local32++) {
			@Pc(52) int local52 = Static179.anIntArray291[local32] * (256 - local32) / 256;
			if (local52 < 0) {
				local52 = 0;
			}
			local24 += local52;
			@Pc(62) int local62;
			for (local62 = local52; local62 < 128; local62++) {
				@Pc(72) int local72 = Static25.anIntArray27[local28++ + arg0];
				@Pc(77) int local77 = Static245.anIntArray392[local24++];
				if (local77 == 0) {
					Static162.aClass1_Sub2_Sub1_Sub2_2.anIntArray391[local30++] = local72;
				} else {
					@Pc(91) int local91 = 238 - local77;
					@Pc(95) int local95 = local77 + 18;
					local77 = Static189.anIntArray298[local77];
					if (local95 > 255) {
						local95 = 255;
					}
					if (local91 > 255) {
						local91 = 255;
					}
					Static162.aClass1_Sub2_Sub1_Sub2_2.anIntArray391[local30++] = (local95 * (local77 & 0xFF00) + local91 * (local72 & 0xFF00) & 0xFF0000) + (local91 * (local72 & 0xFF00FF) + (local77 & 0xFF00FF) * local95 & 0xFF00FF00) >> 8;
				}
			}
			for (local62 = 0; local62 < local52; local62++) {
				Static162.aClass1_Sub2_Sub1_Sub2_2.anIntArray391[local30++] = Static25.anIntArray27[local28++ + arg0];
			}
			local28 += Static25.anInt420 - 128;
		}
		if (Static156.aBoolean211) {
			Static119.method2125(Static162.aClass1_Sub2_Sub1_Sub2_2.anIntArray391, arg0, arg1, Static162.aClass1_Sub2_Sub1_Sub2_2.anInt4444, Static162.aClass1_Sub2_Sub1_Sub2_2.anInt4454);
		} else {
			Static162.aClass1_Sub2_Sub1_Sub2_2.method3845(arg0, arg1);
		}
	}
}
