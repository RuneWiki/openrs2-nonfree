import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
	public static int anInt2719;

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "Lclient!wo;")
	public static final Class361 aClass361_34 = new Class361();

	@OriginalMember(owner = "client!ff", name = "n", descriptor = "Z")
	private static final boolean aBoolean198 = false;

	@OriginalMember(owner = "client!ff", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString28 = "";

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)Z")
	public static boolean method2296(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILclient!kba;Lclient!nu;IIIZLclient!tc;)V")
	public static void method2298(@OriginalArg(0) int arg0, @OriginalArg(1) Class20_Sub2_Sub4_Sub1_Sub1 arg1, @OriginalArg(2) Class20_Sub2_Sub4_Sub1_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class306 arg6) {
		@Pc(7) Class1_Sub30 local7 = new Class1_Sub30();
		local7.anInt5885 = arg5 << 9;
		local7.anInt5880 = arg0;
		local7.anInt5891 = arg4 << 9;
		if (arg6 != null) {
			local7.aClass306_1 = arg6;
			@Pc(143) int local143 = arg6.anInt8385;
			@Pc(146) int local146 = arg6.anInt8414;
			if (arg3 == 1 || arg3 == 3) {
				local146 = arg6.anInt8385;
				local143 = arg6.anInt8414;
			}
			local7.anInt5882 = arg6.anInt8393 << 9;
			local7.anInt5884 = arg4 + local143 << 9;
			local7.anInt5887 = arg6.anInt8386;
			local7.aBoolean422 = arg6.aBoolean616;
			local7.anInt5877 = arg6.anInt8381;
			local7.anInt5889 = arg6.anInt8366;
			local7.anInt5875 = local146 + arg5 << 9;
			local7.anIntArray377 = arg6.anIntArray572;
			local7.aBoolean423 = arg6.aBoolean617;
			local7.anInt5890 = arg6.anInt8364;
			if (arg6.anIntArray570 != null) {
				local7.aBoolean421 = true;
				local7.method4968();
			}
			if (local7.anIntArray377 != null) {
				local7.anInt5888 = (int) ((double) (local7.anInt5890 - local7.anInt5887) * Math.random()) + local7.anInt5887;
			}
			Static201.aClass361_70.method7855(local7);
		} else if (arg2 != null) {
			local7.aClass20_Sub2_Sub4_Sub1_Sub2_1 = arg2;
			@Pc(84) Class162 local84 = arg2.aClass162_1;
			if (local84.anIntArray267 != null) {
				local7.aBoolean421 = true;
				local84 = local84.method3802(Static121.aClass148_1);
			}
			if (local84 != null) {
				local7.anInt5875 = arg5 + local84.anInt4408 << 9;
				local7.anInt5884 = arg4 + local84.anInt4408 << 9;
				local7.anInt5877 = Static273.method4258(arg2);
				local7.anInt5882 = local84.anInt4422 << 9;
				local7.aBoolean423 = local84.aBoolean351;
				local7.anInt5889 = local84.anInt4410;
			}
			Static381.aClass361_69.method7855(local7);
		} else if (arg1 != null) {
			local7.aClass20_Sub2_Sub4_Sub1_Sub1_1 = arg1;
			local7.anInt5884 = arg1.method5349() + arg4 << 9;
			local7.anInt5875 = arg5 + arg1.method5349() << 9;
			local7.anInt5877 = Static269.method4224(arg1);
			local7.aBoolean423 = arg1.aBoolean376;
			local7.anInt5882 = arg1.anInt4920 << 9;
			local7.anInt5889 = arg1.anInt4950;
			Static332.aClass356_27.method7800((long) arg1.anInt6407, local7);
			return;
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
	public static void method2301() {
		if (Static198.anInt4017 != -1) {
			Static42.method1000(false, Static198.anInt4017, -1, -1);
			Static198.anInt4017 = -1;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZILclient!nu;)V")
	public static void method2303(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class20_Sub2_Sub4_Sub1_Sub2 arg1) {
		if (Static135.anInt2684 >= 400) {
			return;
		}
		@Pc(19) Class162 local19 = arg1.aClass162_1;
		if (local19.anIntArray267 != null) {
			local19 = local19.method3802(Static121.aClass148_1);
			if (local19 == null) {
				return;
			}
		}
		if (!local19.aBoolean349) {
			return;
		}
		@Pc(37) String local37 = local19.aString44;
		if (local19.anInt4396 != 0) {
			@Pc(56) String local56 = Static275.aClass230_2 == Static353.aClass230_3 ? Static103.aClass77_32.method1864(Static562.anInt9127) : Static103.aClass77_30.method1864(Static562.anInt9127);
			local37 = local37 + Static246.method7222(local19.anInt4396, Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt4922) + " (" + local56 + local19.anInt4396 + ")";
		}
		if (Static22.aBoolean43 && !arg0) {
			@Pc(93) Class105 local93 = Static397.anInt6847 == -1 ? null : Static88.aClass183_1.method4071(Static397.anInt6847);
			if ((Static434.anInt7646 & 0x2) != 0 && (local93 == null || local19.method3799(Static397.anInt6847, local93.anInt2858) != local93.anInt2858)) {
				Static374.method5440(true, -1, 19, Static559.aString92, false, (long) arg1.anInt6407, Static3.anInt71, 0, 0, Static264.aString51 + " -> <col=ffff00>" + local37);
			}
		}
		if (!arg0) {
			@Pc(140) String[] local140 = local19.aStringArray18;
			if (aBoolean198) {
				local140 = Static93.method1777(local140);
			}
			@Pc(150) int local150;
			if (local140 != null) {
				for (local150 = 4; local150 >= 0; local150--) {
					if (local140[local150] != null && (local19.aByte66 == 0 || !local140[local150].equalsIgnoreCase(Static103.aClass77_25.method1864(Static562.anInt9127)))) {
						@Pc(173) byte local173 = 0;
						@Pc(175) int local175 = Static183.anInt3713;
						if (local150 == 0) {
							local173 = 17;
						}
						if (local150 == 1) {
							local173 = 49;
						}
						if (local150 == 2) {
							local173 = 51;
						}
						if (local150 == 3) {
							local173 = 58;
						}
						if (local150 == 4) {
							local173 = 47;
						}
						if (local19.anInt4402 == local150) {
							local175 = local19.anInt4392;
						}
						if (local19.anInt4419 == local150) {
							local175 = local19.anInt4425;
						}
						Static374.method5440(true, -1, local173, local140[local150], false, (long) arg1.anInt6407, local140[local150].equalsIgnoreCase(Static103.aClass77_25.method1864(Static562.anInt9127)) ? local19.anInt4397 : local175, 0, 0, "<col=ffff00>" + local37);
					}
				}
			}
			if (local19.aByte66 == 1 && local140 != null) {
				for (local150 = 4; local150 >= 0; local150--) {
					if (local140[local150] != null && local140[local150].equalsIgnoreCase(Static103.aClass77_25.method1864(Static562.anInt9127))) {
						@Pc(294) short local294 = 0;
						if (local19.anInt4396 > Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt4922) {
							local294 = 2000;
						}
						@Pc(303) short local303 = 0;
						if (local150 == 0) {
							local303 = 17;
						}
						if (local150 == 1) {
							local303 = 49;
						}
						if (local150 == 2) {
							local303 = 51;
						}
						if (local150 == 3) {
							local303 = 58;
						}
						if (local150 == 4) {
							local303 = 47;
						}
						if (local303 != 0) {
							local303 += local294;
						}
						Static374.method5440(true, -1, local303, local140[local150], false, (long) arg1.anInt6407, local19.anInt4397, 0, 0, "<col=ffff00>" + local37);
					}
				}
			}
		}
		Static374.method5440(true, -1, 1010, Static103.aClass77_24.method1864(Static562.anInt9127), arg0, (long) arg1.anInt6407, Static326.anInt5841, 0, 0, "<col=ffff00>" + local37);
	}
}
