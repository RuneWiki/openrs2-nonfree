import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!we", name = "a", descriptor = "I")
	public static int anInt5468;

	@OriginalMember(owner = "client!we", name = "i", descriptor = "Lclient!hc;")
	public static Class51 aClass51_84;

	@OriginalMember(owner = "client!we", name = "k", descriptor = "I")
	public static int anInt5472;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "Z")
	public static boolean aBoolean280 = false;

	@OriginalMember(owner = "client!we", name = "e", descriptor = "[I")
	public static int[] anIntArray466 = new int[25];

	@OriginalMember(owner = "client!we", name = "f", descriptor = "[B")
	public static byte[] aByteArray64 = new byte[520];

	@OriginalMember(owner = "client!we", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString386 = "You can't add yourself to your own ignore list.";

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II)V")
	public static void method4153(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			Static4.method73();
		} else if (arg0 == 2) {
			Static77.method1514();
		} else if (arg0 == 3) {
			Static80.method1628();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IILclient!ai;II)V")
	public static void method4154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class9_Sub1_Sub1 arg2, @OriginalArg(3) int arg3) {
		if (Static83.aClass9_Sub1_Sub1_1 == arg2 || Static230.anInt5417 >= 400) {
			return;
		}
		@Pc(126) String local126;
		if (arg2.anInt357 == 0) {
			@Pc(18) boolean local18 = true;
			if (Static83.aClass9_Sub1_Sub1_1.anInt365 != -1 && arg2.anInt365 != -1) {
				@Pc(41) int local41 = Static83.aClass9_Sub1_Sub1_1.anInt356 > arg2.anInt356 ? Static83.aClass9_Sub1_Sub1_1.anInt356 : arg2.anInt356;
				@Pc(52) int local52 = Static83.aClass9_Sub1_Sub1_1.anInt365 >= arg2.anInt365 ? arg2.anInt365 : Static83.aClass9_Sub1_Sub1_1.anInt365;
				@Pc(59) int local59 = Static83.aClass9_Sub1_Sub1_1.anInt356 - arg2.anInt356;
				if (local59 < 0) {
					local59 = -local59;
				}
				@Pc(74) int local74 = local41 * 10 / 100 + local52 + 5;
				if (local59 > local74) {
					local18 = false;
				}
			}
			@Pc(86) String local86 = Static68.anInt1404 == 1 ? Static158.aString241 : Static165.aString253;
			if (arg2.anInt359 <= arg2.anInt356) {
				local126 = arg2.method184() + (local18 ? Static170.method2960(Static83.aClass9_Sub1_Sub1_1.anInt356, arg2.anInt356) : "<col=ffffff>") + " (" + local86 + arg2.anInt356 + ")";
			} else {
				local126 = arg2.method184() + (local18 ? Static170.method2960(Static83.aClass9_Sub1_Sub1_1.anInt356, arg2.anInt356) : "<col=ffffff>") + " (" + local86 + arg2.anInt356 + "+" + (arg2.anInt359 - arg2.anInt356) + ")";
			}
		} else {
			local126 = arg2.method184() + " (" + Static224.aString351 + arg2.anInt357 + ")";
		}
		@Pc(253) int local253;
		if (Static183.anInt5174 == 1) {
			Static199.method3319(Static255.anInt5424, (long) arg1, arg0, Static197.aString146, Static199.aString296 + " -> <col=ffffff>" + local126, (short) 39, arg3);
		} else if (!Static88.aBoolean138) {
			for (local253 = 7; local253 >= 0; local253--) {
				if (Static85.aStringArray15[local253] != null) {
					@Pc(263) short local263 = 0;
					if (Static68.anInt1404 == 0 && Static85.aStringArray15[local253].equalsIgnoreCase(Static131.aString52)) {
						if (arg2.anInt356 > Static83.aClass9_Sub1_Sub1_1.anInt356) {
							local263 = 2000;
						}
						if (Static83.aClass9_Sub1_Sub1_1.anInt362 != 0 && arg2.anInt362 != 0) {
							if (arg2.anInt362 == Static83.aClass9_Sub1_Sub1_1.anInt362) {
								local263 = 2000;
							} else {
								local263 = 0;
							}
						}
					} else if (Static129.aBooleanArray11[local253]) {
						local263 = 2000;
					}
					@Pc(317) short local317 = Static174.aShortArray54[local253];
					@Pc(322) short local322 = (short) (local317 + local263);
					Static199.method3319(Static10.anIntArray36[local253], (long) arg1, arg0, Static85.aStringArray15[local253], "<col=ffffff>" + local126, local322, arg3);
				}
			}
		} else if ((Static8.anInt152 & 0x8) != 0) {
			Static199.method3319(Static167.anInt3914, (long) arg1, arg0, Static106.aString183, Static120.aString194 + " -> <col=ffffff>" + local126, (short) 57, arg3);
		}
		for (local253 = 0; local253 < Static230.anInt5417; local253++) {
			if (Static57.aShortArray26[local253] == 9) {
				Static174.aStringArray33[local253] = "<col=ffffff>" + local126;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
	public static void method4155() {
		Static79.anIntArray165 = null;
		Static202.anIntArray345 = null;
		Static102.anIntArray201 = null;
		Static233.anIntArray438 = null;
		Static11.aByteArrayArray1 = null;
		Static218.anIntArray382 = null;
	}
}
