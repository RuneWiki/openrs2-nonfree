import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!nn", name = "s", descriptor = "Lclient!gd;")
	public static Class61 aClass61_30 = new Class61(64);

	@OriginalMember(owner = "client!nn", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString125 = "";

	@OriginalMember(owner = "client!nn", name = "v", descriptor = "I")
	public static int anInt3530 = 0;

	@OriginalMember(owner = "client!nn", name = "w", descriptor = "Lclient!wn;")
	public static Class182 aClass182_22 = new Class182();

	@OriginalMember(owner = "client!nn", name = "x", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray53 = null;

	@OriginalMember(owner = "client!nn", name = "y", descriptor = "I")
	public static int anInt3531 = 0;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!bc;IIIIIIZ)V")
	public static void method2751(@OriginalArg(0) Class14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(3) int local3 = arg0.anIntArray22.length;
		@Pc(5) int local5;
		@Pc(15) int local15;
		@Pc(22) int local22;
		@Pc(29) int local29;
		@Pc(39) int local39;
		for (local5 = 0; local5 < local3; local5++) {
			local15 = arg0.anIntArray22[local5] - Static228.anInt4644;
			local22 = arg0.anIntArray27[local5] - Static256.anInt5058;
			local29 = arg0.anIntArray23[local5] - Static64.anInt1382;
			local39 = local29 * arg3 + local15 * arg4 >> 16;
			@Pc(49) int local49 = local29 * arg4 - local15 * arg3 >> 16;
			@Pc(61) int local61 = local22 * arg2 - local49 * arg1 >> 16;
			@Pc(71) int local71 = local22 * arg1 + local49 * arg2 >> 16;
			if (local71 < 50) {
				return;
			}
			if (arg0.anIntArray25 != null) {
				Static18.anIntArray20[local5] = local39;
				Static18.anIntArray24[local5] = local61;
				Static18.anIntArray33[local5] = local71;
			}
			Static18.anIntArray28[local5] = Static96.anInt1997 + (local39 << 9) / local71;
			Static18.anIntArray29[local5] = Static96.anInt1995 + (local61 << 9) / local71;
		}
		Static96.anInt1994 = 0;
		local3 = arg0.anIntArray21.length;
		for (local5 = 0; local5 < local3; local5++) {
			local15 = arg0.anIntArray21[local5];
			local22 = arg0.anIntArray30[local5];
			local29 = arg0.anIntArray32[local5];
			local39 = Static18.anIntArray28[local15];
			@Pc(148) int local148 = Static18.anIntArray28[local22];
			@Pc(152) int local152 = Static18.anIntArray28[local29];
			@Pc(156) int local156 = Static18.anIntArray29[local15];
			@Pc(160) int local160 = Static18.anIntArray29[local22];
			@Pc(164) int local164 = Static18.anIntArray29[local29];
			if ((local39 - local148) * (local164 - local160) - (local156 - local160) * (local152 - local148) > 0) {
				if (Static299.aBoolean481 && Static195.method2229(Static214.anInt4400 + Static96.anInt1997, Static89.anInt1906 + Static96.anInt1995, local156, local160, local164, local39, local148, local152)) {
					Static23.anInt621 = arg5;
					Static101.anInt2132 = arg6;
				}
				if (!Static116.aBoolean188 && !arg7) {
					Static96.aBoolean142 = false;
					if (local39 < 0 || local148 < 0 || local152 < 0 || local39 > Static96.anInt1996 || local148 > Static96.anInt1996 || local152 > Static96.anInt1996) {
						Static96.aBoolean142 = true;
					}
					if (arg0.anIntArray25 == null || arg0.anIntArray25[local5] == -1) {
						if (arg0.anIntArray31[local5] != 12345678) {
							Static96.method1532(local156, local160, local164, local39, local148, local152, arg0.anIntArray31[local5], arg0.anIntArray34[local5], arg0.anIntArray26[local5]);
						}
					} else if (!Static198.aBoolean317) {
						@Pc(373) int local373 = Static96.anInterface4_1.method1259(arg0.anIntArray25[local5]);
						Static96.method1532(local156, local160, local164, local39, local148, local152, Static164.method2609(local373, arg0.anIntArray31[local5]), Static164.method2609(local373, arg0.anIntArray34[local5]), Static164.method2609(local373, arg0.anIntArray26[local5]));
					} else if (arg0.aBoolean31) {
						Static96.method1537(local156, local160, local164, local39, local148, local152, arg0.anIntArray31[local5], arg0.anIntArray34[local5], arg0.anIntArray26[local5], Static18.anIntArray20[0], Static18.anIntArray20[1], Static18.anIntArray20[3], Static18.anIntArray24[0], Static18.anIntArray24[1], Static18.anIntArray24[3], Static18.anIntArray33[0], Static18.anIntArray33[1], Static18.anIntArray33[3], arg0.anIntArray25[local5]);
					} else {
						Static96.method1537(local156, local160, local164, local39, local148, local152, arg0.anIntArray31[local5], arg0.anIntArray34[local5], arg0.anIntArray26[local5], Static18.anIntArray20[local15], Static18.anIntArray20[local22], Static18.anIntArray20[local29], Static18.anIntArray24[local15], Static18.anIntArray24[local22], Static18.anIntArray24[local29], Static18.anIntArray33[local15], Static18.anIntArray33[local22], Static18.anIntArray33[local29], arg0.anIntArray25[local5]);
					}
				}
			}
		}
	}
}
