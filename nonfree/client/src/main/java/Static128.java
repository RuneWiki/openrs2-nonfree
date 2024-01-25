import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!ig", name = "K", descriptor = "I")
	public static int anInt2364;

	@OriginalMember(owner = "client!ig", name = "cb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!ig", name = "ab", descriptor = "I")
	public static int anInt2379 = 0;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZI)V")
	public static void method1981(@OriginalArg(1) int arg0) {
		Static32.anInt584 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method1982(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static46.aClass117_19.method2684(Static230.anInt4634) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static6.aClass117_70.method2684(Static230.anInt4634) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IBI)V")
	public static void method1983(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class11_Sub4_Sub12 local13 = Static35.method512(15, 0);
		local13.method3858();
		local13.anInt4388 = arg0;
		local13.anInt4390 = arg1;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZII)V")
	public static void method1984(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class11_Sub6 local10 = Static158.method2534(arg1, arg0);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray48.length; local15++) {
				local10.anIntArray48[local15] = -1;
				local10.anIntArray46[local15] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!qa;I)V")
	public static void method1985(@OriginalArg(0) Class67_Sub3_Sub3_Sub2 arg0) {
		if (Static13.anInt245 >= 400 || Static156.aClass67_Sub3_Sub3_Sub2_2 == arg0) {
			return;
		}
		@Pc(38) String local38;
		@Pc(92) int local92;
		if (arg0.anInt5082 == 0) {
			@Pc(42) boolean local42 = true;
			if (Static156.aClass67_Sub3_Sub3_Sub2_2.anInt5104 != -1 && arg0.anInt5104 != -1) {
				@Pc(66) int local66 = arg0.anInt5095 < Static156.aClass67_Sub3_Sub3_Sub2_2.anInt5095 ? Static156.aClass67_Sub3_Sub3_Sub2_2.anInt5095 : arg0.anInt5095;
				@Pc(81) int local81 = Static156.aClass67_Sub3_Sub3_Sub2_2.anInt5104 >= arg0.anInt5104 ? arg0.anInt5104 : Static156.aClass67_Sub3_Sub3_Sub2_2.anInt5104;
				local92 = local81 + local66 * 10 / 100 + 5;
				@Pc(98) int local98 = Static156.aClass67_Sub3_Sub3_Sub2_2.anInt5095 - arg0.anInt5095;
				if (local98 < 0) {
					local98 = -local98;
				}
				if (local92 < local98) {
					local42 = false;
				}
			}
			@Pc(124) String local124 = Static68.anInt1264 == 1 ? Static184.aClass117_65.method2684(Static230.anInt4634) : Static214.aClass117_76.method2684(Static230.anInt4634);
			if (arg0.anInt5081 <= arg0.anInt5095) {
				local38 = arg0.method4385() + (local42 ? Static99.method617(arg0.anInt5095, Static156.aClass67_Sub3_Sub3_Sub2_2.anInt5095) : "<col=ffffff>") + " (" + local124 + arg0.anInt5095 + ")";
			} else {
				local38 = arg0.method4385() + (local42 ? Static99.method617(arg0.anInt5095, Static156.aClass67_Sub3_Sub3_Sub2_2.anInt5095) : "<col=ffffff>") + " (" + local124 + arg0.anInt5095 + "+" + (arg0.anInt5081 - arg0.anInt5095) + ")";
			}
		} else {
			local38 = arg0.method4385() + " (" + Static104.aClass117_39.method2684(Static230.anInt4634) + arg0.anInt5082 + ")";
		}
		if (!Static103.aBoolean118) {
			for (@Pc(234) int local234 = 7; local234 >= 0; local234--) {
				if (Static31.aStringArray3[local234] != null) {
					@Pc(242) short local242 = 0;
					if (Static68.anInt1264 == 0 && Static31.aStringArray3[local234].equalsIgnoreCase(Static182.aClass117_63.method2684(Static230.anInt4634))) {
						if (Static156.aClass67_Sub3_Sub3_Sub2_2.anInt5095 < arg0.anInt5095) {
							local242 = 2000;
						}
						if (Static156.aClass67_Sub3_Sub3_Sub2_2.anInt5106 != 0 && arg0.anInt5106 != 0) {
							if (arg0.anInt5106 == Static156.aClass67_Sub3_Sub3_Sub2_2.anInt5106) {
								local242 = 2000;
							} else {
								local242 = 0;
							}
						}
					} else if (Static190.aBooleanArray19[local234]) {
						local242 = 2000;
					}
					@Pc(305) short local305 = (short) (Static192.aShortArray74[local234] + local242);
					local92 = Static52.anIntArray372[local234] == -1 ? Static85.anInt1528 : Static52.anIntArray372[local234];
					Static87.method1252(0, 0, local305, "<col=ffffff>" + local38, local92, (long) arg0.anInt5038, Static31.aStringArray3[local234]);
				}
			}
		} else if ((Static335.anInt6393 & 0x8) != 0) {
			Static87.method1252(0, 0, 19, Static63.aString10 + " -> <col=ffffff>" + local38, Static320.anInt6202, (long) arg0.anInt5038, Static110.aString39);
		}
		for (@Pc(348) Class11_Sub14 local348 = (Class11_Sub14) Static119.aClass16_21.method193(); local348 != null; local348 = (Class11_Sub14) Static119.aClass16_21.method188()) {
			if (local348.anInt1765 == 23) {
				local348.aString17 = "<col=ffffff>" + local38;
				break;
			}
		}
	}
}
