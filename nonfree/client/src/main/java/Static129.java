import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!ge", name = "E", descriptor = "Lclient!gp;")
	public static Class91 aClass91_1;

	@OriginalMember(owner = "client!ge", name = "G", descriptor = "I")
	public static int anInt2330;

	@OriginalMember(owner = "client!ge", name = "C", descriptor = "I")
	public static final int anInt2329 = 1337;

	@OriginalMember(owner = "client!ge", name = "F", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!ge", name = "J", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray10 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZZ)V")
	public static void method1930(@OriginalArg(1) boolean arg0) {
		Static235.method3046(Static141.anInt2513, Static142.anInt2523, Static314.anInt5426, arg0);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method1932(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static201.anInt3382++;
		Static4.anInt64 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static154.anInt2668; local7 < Static289.anInt4757; local7++) {
			@Pc(12) Class270[][] local12 = Static309.aClass270ArrayArrayArray3[local7];
			for (local14 = Static267.anInt4409; local14 < Static232.anInt3747; local14++) {
				for (@Pc(17) int local17 = Static92.anInt1788; local17 < Static231.anInt3738; local17++) {
					@Pc(24) Class270 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static356.aBooleanArrayArray6[local14 + Static453.anInt7270 - Static352.anInt5986][local17 + Static453.anInt7270 - Static411.anInt6740] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean528 = true;
							local24.aBoolean529 = true;
							if (local24.aClass241_2 == null) {
								local24.aBoolean527 = false;
							} else {
								local24.aBoolean527 = true;
							}
							Static4.anInt64++;
						} else {
							local24.aBoolean528 = false;
							local24.aBoolean529 = false;
							local24.aByte99 = 0;
							if (local14 >= Static352.anInt5986 - 16 && local14 <= Static352.anInt5986 + 16 && local17 >= Static411.anInt6740 - 16 && local17 <= Static411.anInt6740 + 16 && (local24.aClass3_Sub2_3 != null || local24.aClass3_Sub2_2 != null || local24.aClass3_Sub3_2 != null || local24.aClass3_Sub3_3 != null || local24.aClass3_Sub5_2 != null || local24.aClass241_2 != null)) {
								Static460.aClass45_4.method5051(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static109.aClass162Array1 == Static345.aClass162Array3;
		for (local14 = Static154.anInt2668; local14 < Static289.anInt4757; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static307.aClass163_7.method5538() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static356.aBooleanArrayArray6.length;
				if (Static267.anInt4409 + Static356.aBooleanArrayArray6.length > Static169.anInt2876) {
					local172 -= Static267.anInt4409 + Static356.aBooleanArrayArray6.length - Static169.anInt2876;
				}
				@Pc(192) int local192 = Static356.aBooleanArrayArray6[0].length;
				if (Static92.anInt1788 + Static356.aBooleanArrayArray6[0].length > Static316.anInt5459) {
					local192 -= Static92.anInt1788 + Static356.aBooleanArrayArray6[0].length - Static316.anInt5459;
				}
				@Pc(213) int local213 = Static298.anInt168;
				while (true) {
					if (local213 >= local172) {
						Static460.aClass45_4.method5052(Static345.aClass162Array3[local14], local14, true, local161);
						break;
					}
					@Pc(220) int local220 = local213 + Static267.anInt4409 - Static298.anInt168;
					for (@Pc(222) int local222 = Static45.anInt813; local222 < local192; local222++) {
						Static19.aBooleanArrayArray1[local213][local222] = false;
						if (Static356.aBooleanArrayArray6[local213][local222]) {
							@Pc(241) int local241 = local222 + Static92.anInt1788 - Static45.anInt813;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static309.aClass270ArrayArrayArray3[local243][local220][local241] != null && Static309.aClass270ArrayArrayArray3[local243][local220][local241].aByte105 == local14) {
									Static19.aBooleanArrayArray1[local213][local222] = Static309.aClass270ArrayArrayArray3[local243][local220][local241].aBoolean528;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static460.aClass45_4.method5052(Static345.aClass162Array3[local14], local14, false, local161);
			}
			Static460.aClass45_4.method5059();
		}
		if (!Static366.method4809(true)) {
			Static366.method4809(false);
		}
	}
}
