import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!re", name = "t", descriptor = "Lclient!ud;")
	public static Class82_Sub1 aClass82_Sub1_14;

	@OriginalMember(owner = "client!re", name = "n", descriptor = "Lclient!tg;")
	private static Class81 aClass81_1129 = Static120.method2057("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!re", name = "d", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1126 = aClass81_1129;

	@OriginalMember(owner = "client!re", name = "e", descriptor = "Z")
	public static boolean aBoolean125 = false;

	@OriginalMember(owner = "client!re", name = "k", descriptor = "Lclient!tg;")
	private static Class81 aClass81_1128 = Static120.method2057("flash2:");

	@OriginalMember(owner = "client!re", name = "g", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1127 = aClass81_1128;

	@OriginalMember(owner = "client!re", name = "s", descriptor = "I")
	public static int anInt3163 = 0;

	@OriginalMember(owner = "client!re", name = "D", descriptor = "Lclient!tg;")
	private static Class81 aClass81_1135 = Static120.method2057("Click to switch");

	@OriginalMember(owner = "client!re", name = "v", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1130 = aClass81_1135;

	@OriginalMember(owner = "client!re", name = "C", descriptor = "Lclient!tg;")
	private static Class81 aClass81_1134 = Static120.method2057("Loaded sprites");

	@OriginalMember(owner = "client!re", name = "w", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1131 = aClass81_1134;

	@OriginalMember(owner = "client!re", name = "y", descriptor = "[I")
	public static int[] anIntArray334 = new int[500];

	@OriginalMember(owner = "client!re", name = "A", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1132 = Static120.method2057("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!re", name = "B", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1133 = aClass81_1128;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!ea;III)V")
	public static void method2426(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static118.anInt2616 >= 400) {
			return;
		}
		if (arg1.anIntArray81 != null) {
			arg1 = arg1.method766();
		}
		if (arg1 == null || !arg1.aBoolean36) {
			return;
		}
		@Pc(31) Class81 local31 = arg1.aClass81_352;
		if (arg1.anInt1017 != 0) {
			local31 = Static127.method2169(new Class81[] { local31, Static86.method1474(arg1.anInt1017, Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anInt1526), Static27.aClass81_252, Static139.aClass81_1075, Static149.method2548(arg1.anInt1017), Static38.aClass81_354 });
		}
		if (Static164.anInt3767 == 1) {
			Static175.method2242(Static7.aClass81_79, Static127.method2169(new Class81[] { Static132.aClass81_1033, Static44.aClass81_388, local31 }), arg2, (short) 17, arg0, (long) arg3);
		} else if (!Static184.aBoolean172) {
			@Pc(88) Class81[] local88 = arg1.aClass81Array4;
			if (Static88.aBoolean85) {
				local88 = Static98.method1639(local88);
			}
			@Pc(98) int local98;
			if (local88 != null) {
				for (local98 = 4; local98 >= 0; local98--) {
					if (local88[local98] != null && !local88[local98].method2811(Static81.aClass81_636)) {
						@Pc(117) byte local117 = 0;
						if (local98 == 0) {
							local117 = 41;
						}
						if (local98 == 1) {
							local117 = 34;
						}
						if (local98 == 2) {
							local117 = 19;
						}
						if (local98 == 3) {
							local117 = 14;
						}
						if (local98 == 4) {
							local117 = 48;
						}
						Static175.method2242(local88[local98], Static127.method2169(new Class81[] { Static103.aClass81_797, local31 }), arg2, local117, arg0, (long) arg3);
					}
				}
			}
			if (local88 != null) {
				for (local98 = 4; local98 >= 0; local98--) {
					if (local88[local98] != null && local88[local98].method2811(Static81.aClass81_636)) {
						@Pc(193) short local193 = 0;
						if (arg1.anInt1017 > Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anInt1526) {
							local193 = 2000;
						}
						@Pc(202) short local202 = 0;
						if (local98 == 0) {
							local202 = 41;
						}
						if (local98 == 1) {
							local202 = 34;
						}
						if (local98 == 2) {
							local202 = 19;
						}
						if (local98 == 3) {
							local202 = 14;
						}
						if (local98 == 4) {
							local202 = 48;
						}
						if (local202 != 0) {
							local202 += local193;
						}
						Static175.method2242(local88[local98], Static127.method2169(new Class81[] { Static103.aClass81_797, local31 }), arg2, local202, arg0, (long) arg3);
					}
				}
			}
			Static175.method2242(Static11.aClass81_223, Static127.method2169(new Class81[] { Static103.aClass81_797, local31 }), arg2, (short) 1004, arg0, (long) arg3);
			return;
		} else if ((Static93.anInt2064 & 0x2) == 2) {
			Static175.method2242(Static14.aClass81_127, Static127.method2169(new Class81[] { Static74.aClass81_617, Static44.aClass81_388, local31 }), arg2, (short) 49, arg0, (long) arg3);
			return;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II)Z")
	public static boolean method2427(@OriginalArg(1) int arg0) {
		if (Static53.aBooleanArray5[arg0]) {
			return true;
		} else if (Static106.aClass82_38.method2947(arg0)) {
			@Pc(28) int local28 = Static106.aClass82_38.method2966(arg0);
			if (local28 == 0) {
				Static53.aBooleanArray5[arg0] = true;
				return true;
			}
			if (Static131.aClass77ArrayArray1[arg0] == null) {
				Static131.aClass77ArrayArray1[arg0] = new Class77[local28];
			}
			for (@Pc(47) int local47 = 0; local47 < local28; local47++) {
				if (Static131.aClass77ArrayArray1[arg0][local47] == null) {
					@Pc(61) byte[] local61 = Static106.aClass82_38.method2942(local47, arg0);
					if (local61 != null) {
						Static131.aClass77ArrayArray1[arg0][local47] = new Class77();
						Static131.aClass77ArrayArray1[arg0][local47].anInt3231 = (arg0 << 16) + local47;
						if (local61[0] == -1) {
							Static131.aClass77ArrayArray1[arg0][local47].method2500(new Class1_Sub8(local61));
						} else {
							Static131.aClass77ArrayArray1[arg0][local47].method2495(new Class1_Sub8(local61));
						}
					}
				}
			}
			Static53.aBooleanArray5[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
	public static void method2428() {
		aClass81_1134 = null;
		aClass81_1127 = null;
		aClass81_1133 = null;
		aClass81_1135 = null;
		anIntArray334 = null;
		aClass81_1126 = null;
		aClass81_1131 = null;
		aClass81_1130 = null;
		aClass81_1129 = null;
		aClass82_Sub1_14 = null;
		aClass81_1128 = null;
		aClass81_1132 = null;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II[Lclient!rh;)V")
	public static void method2429(@OriginalArg(0) int arg0, @OriginalArg(2) Class77[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(21) Class77 local21 = arg1[local7];
			if (local21 != null) {
				if (local21.anInt3226 == 0) {
					if (local21.aClass77Array1 != null) {
						method2429(arg0, local21.aClass77Array1);
					}
					@Pc(42) Class1_Sub4 local42 = (Class1_Sub4) Static119.aClass5_8.method134((long) local21.anInt3231);
					if (local42 != null) {
						Static162.method2839(arg0, local42.anInt155);
					}
				}
				@Pc(61) Class1_Sub3 local61;
				if (arg0 == 0 && local21.anObjectArray11 != null) {
					local61 = new Class1_Sub3();
					local61.aClass77_1 = local21;
					local61.anObjectArray1 = local21.anObjectArray11;
					Static49.method870(local61);
				}
				if (arg0 == 1 && local21.anObjectArray14 != null) {
					if (local21.anInt3189 >= 0) {
						@Pc(88) Class77 local88 = Static41.method800(local21.anInt3231);
						if (local88 == null || local88.aClass77Array1 == null || local21.anInt3189 >= local88.aClass77Array1.length || local88.aClass77Array1[local21.anInt3189] != local21) {
							continue;
						}
					}
					local61 = new Class1_Sub3();
					local61.anObjectArray1 = local21.anObjectArray14;
					local61.aClass77_1 = local21;
					Static49.method870(local61);
				}
			}
		}
	}
}
