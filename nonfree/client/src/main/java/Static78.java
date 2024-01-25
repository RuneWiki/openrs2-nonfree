import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!f", name = "A", descriptor = "I")
	public static int anInt6343;

	@OriginalMember(owner = "client!f", name = "r", descriptor = "I")
	public static int anInt6335 = 0;

	@OriginalMember(owner = "client!f", name = "t", descriptor = "I")
	public static int anInt6337 = 0;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BII)V")
	public static void method5349(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class7_Sub1_Sub15 local8 = Static315.method5104(5, arg1);
		local8.method4790();
		local8.anInt5687 = arg0;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(CB)Z")
	public static boolean method5352(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZILclient!ap;)V")
	public static void method5353(@OriginalArg(1) int arg0, @OriginalArg(2) Class7_Sub3 arg1) {
		if (Static134.aClass77_6 == null) {
			return;
		}
		try {
			Static134.aClass77_6.method1871(0L);
			Static134.aClass77_6.method1875(arg1.aByteArray33, arg0, 24);
		} catch (@Pc(23) Exception local23) {
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIII)V")
	public static void method5354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static29.aClass7_Sub3_Sub2_1.anInt3005 = 0;
		Static29.aClass7_Sub3_Sub2_1.method2735(20);
		Static29.aClass7_Sub3_Sub2_1.method2735(arg3);
		Static29.aClass7_Sub3_Sub2_1.method2735(arg0);
		Static29.aClass7_Sub3_Sub2_1.method2788(arg2);
		Static29.aClass7_Sub3_Sub2_1.method2788(arg1);
		Static221.anInt4403 = 0;
		Static339.anInt6449 = 1;
		Static80.anInt2113 = 0;
		Static353.anInt2411 = -3;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!sb;)V")
	public static void method5355(@OriginalArg(1) Class22_Sub2_Sub1 arg0) {
		if (arg0 instanceof Class22_Sub2_Sub1_Sub2) {
			@Pc(9) Class22_Sub2_Sub1_Sub2 local9 = (Class22_Sub2_Sub1_Sub2) arg0;
			if (local9.aClass174_1 != null) {
				Static341.method5543(local9);
			}
		} else if (arg0 instanceof Class22_Sub2_Sub1_Sub1) {
			method5356((Class22_Sub2_Sub1_Sub1) arg0);
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BLclient!cc;)V")
	public static void method5356(@OriginalArg(1) Class22_Sub2_Sub1_Sub1 arg0) {
		if (Static33.anInt735 >= 400 || Static252.aClass22_Sub2_Sub1_Sub1_4 == arg0) {
			return;
		}
		@Pc(134) String local134;
		@Pc(69) int local69;
		if (arg0.anInt1033 == 0) {
			@Pc(18) boolean local18 = true;
			if (Static252.aClass22_Sub2_Sub1_Sub1_4.anInt1006 != -1 && arg0.anInt1006 != -1) {
				@Pc(43) int local43 = Static252.aClass22_Sub2_Sub1_Sub1_4.anInt1020 > arg0.anInt1020 ? Static252.aClass22_Sub2_Sub1_Sub1_4.anInt1020 : arg0.anInt1020;
				@Pc(58) int local58 = arg0.anInt1006 > Static252.aClass22_Sub2_Sub1_Sub1_4.anInt1006 ? Static252.aClass22_Sub2_Sub1_Sub1_4.anInt1006 : arg0.anInt1006;
				local69 = local43 * 10 / 100 + local58 + 5;
				@Pc(76) int local76 = Static252.aClass22_Sub2_Sub1_Sub1_4.anInt1020 - arg0.anInt1020;
				if (local76 < 0) {
					local76 = -local76;
				}
				if (local76 > local69) {
					local18 = false;
				}
			}
			@Pc(95) String local95 = Static345.anInt6530 == 1 ? Static304.aString376 : Static289.aString162;
			if (arg0.anInt1017 <= arg0.anInt1020) {
				local134 = arg0.method818() + (local18 ? Static81.method1750(Static252.aClass22_Sub2_Sub1_Sub1_4.anInt1020, arg0.anInt1020) : "<col=ffffff>") + " (" + local95 + arg0.anInt1020 + ")";
			} else {
				local134 = arg0.method818() + (local18 ? Static81.method1750(Static252.aClass22_Sub2_Sub1_Sub1_4.anInt1020, arg0.anInt1020) : "<col=ffffff>") + " (" + local95 + arg0.anInt1020 + "+" + (arg0.anInt1017 - arg0.anInt1020) + ")";
			}
		} else {
			local134 = arg0.method818() + " (" + Static102.aString166 + arg0.anInt1033 + ")";
		}
		if (Static127.anInt2799 == 1) {
			Static198.method3544(0, Static232.anInt4617, Static256.aString313, (long) arg0.anInt5115, Static205.aString266 + " -> <col=ffffff>" + local134, 3, 0);
		} else if (!Static253.aBoolean361) {
			for (@Pc(203) int local203 = 7; local203 >= 0; local203--) {
				if (Static135.aStringArray31[local203] != null) {
					@Pc(211) short local211 = 0;
					if (Static345.anInt6530 == 0 && Static135.aStringArray31[local203].equalsIgnoreCase(Static161.aString221)) {
						if (arg0.anInt1020 > Static252.aClass22_Sub2_Sub1_Sub1_4.anInt1020) {
							local211 = 2000;
						}
						if (Static252.aClass22_Sub2_Sub1_Sub1_4.anInt1026 != 0 && arg0.anInt1026 != 0) {
							if (Static252.aClass22_Sub2_Sub1_Sub1_4.anInt1026 == arg0.anInt1026) {
								local211 = 2000;
							} else {
								local211 = 0;
							}
						}
					} else if (Static299.aBooleanArray28[local203]) {
						local211 = 2000;
					}
					@Pc(268) short local268 = (short) (Static174.aShortArray61[local203] + local211);
					local69 = Static49.anIntArray204[local203] == -1 ? Static56.anInt1465 : Static49.anIntArray204[local203];
					Static198.method3544(0, local69, Static135.aStringArray31[local203], (long) arg0.anInt5115, "<col=ffffff>" + local134, local268, 0);
				}
			}
		} else if ((Static72.anInt1772 & 0x8) != 0) {
			Static198.method3544(0, Static301.anInt5782, Static85.aString150, (long) arg0.anInt5115, Static277.aString348 + " -> <col=ffffff>" + local134, 48, 0);
		}
		for (@Pc(379) Class7_Sub32 local379 = (Class7_Sub32) Static76.aClass74_8.method1793(); local379 != null; local379 = (Class7_Sub32) Static76.aClass74_8.method1798()) {
			if (local379.anInt5229 == 51) {
				local379.aString330 = "<col=ffffff>" + local134;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "f", descriptor = "(B)V")
	public static void method5357() {
		for (@Pc(5) int local5 = 0; local5 < Static84.anInt2190; local5++) {
			@Pc(10) Class184 local10 = Static243.method4200(local5);
			if (local10 != null && local10.anInt5649 == 0) {
				Static183.anIntArray506[local5] = 0;
				Static212.anIntArray579[local5] = 0;
			}
		}
		Static118.aClass10_52 = new Class10(16);
	}
}
