import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!wc", name = "Lb", descriptor = "Lclient!uc;")
	public static Class3_Sub1_Sub4_Sub3 aClass3_Sub1_Sub4_Sub3_47;

	@OriginalMember(owner = "client!wc", name = "ub", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1583 = Static75.method1216("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!wc", name = "yb", descriptor = "I")
	public static int anInt2823 = 0;

	@OriginalMember(owner = "client!wc", name = "Kb", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1587 = Static75.method1216("Loaded update list");

	@OriginalMember(owner = "client!wc", name = "Cb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1584 = aClass4_1587;

	@OriginalMember(owner = "client!wc", name = "Db", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1585 = Static75.method1216("Enter message to send to ");

	@OriginalMember(owner = "client!wc", name = "Gb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1586 = aClass4_1585;

	@OriginalMember(owner = "client!wc", name = "Hb", descriptor = "I")
	public static int anInt2829 = 0;

	@OriginalMember(owner = "client!wc", name = "Ob", descriptor = "I")
	public static volatile int anInt2834 = 0;

	@OriginalMember(owner = "client!wc", name = "Tb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1588 = Static75.method1216(":chalreq:");

	@OriginalMember(owner = "client!wc", name = "Ub", descriptor = "I")
	public static int anInt2839 = 0;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IJ)V")
	public static void method1922(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < Static28.anInt869; local12++) {
			if (arg0 == Static13.aLongArray6[local12]) {
				Static28.anInt869--;
				Static39.aBoolean74 = true;
				for (@Pc(32) int local32 = local12; local32 < Static28.anInt869; local32++) {
					Static13.aLongArray6[local32] = Static13.aLongArray6[local32 + 1];
				}
				Static5.aClass3_Sub4_Sub1_1.method464(45);
				Static5.aClass3_Sub4_Sub1_1.method456(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "(I)V")
	public static void method1923() {
		aClass4_1585 = null;
		aClass3_Sub1_Sub4_Sub3_47 = null;
		aClass4_1583 = null;
		aClass4_1584 = null;
		aClass4_1587 = null;
		aClass4_1588 = null;
		aClass4_1586 = null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIII)Lclient!ub;")
	public static Class3_Sub1_Sub4_Sub2 method1924(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class3_Sub1_Sub4_Sub2 local14;
		if (arg1 == 0) {
			local14 = (Class3_Sub1_Sub4_Sub2) Static94.aClass8_27.method195((long) arg0);
			if (local14 != null && arg2 != local14.anInt2576 && local14.anInt2576 != -1) {
				local14.method1930();
				local14 = null;
			}
			if (local14 != null) {
				return local14;
			}
		}
		@Pc(37) Class3_Sub1_Sub2 local37 = Static3.method1550(arg0);
		if (local37.anIntArray45 == null) {
			arg2 = -1;
		}
		if (arg2 > 1) {
			@Pc(47) int local47 = -1;
			for (@Pc(49) int local49 = 0; local49 < 10; local49++) {
				if (arg2 >= local37.anIntArray46[local49] && local37.anIntArray46[local49] != 0) {
					local47 = local37.anIntArray45[local49];
				}
			}
			if (local47 != -1) {
				local37 = Static3.method1550(local47);
			}
		}
		@Pc(85) Class3_Sub1_Sub1_Sub4 local85 = local37.method499(true, 1);
		if (local85 == null) {
			return null;
		}
		@Pc(91) Class3_Sub1_Sub4_Sub2 local91 = null;
		if (local37.anInt732 != -1) {
			local91 = method1924(local37.anInt743, -1, 10);
			if (local91 == null) {
				return null;
			}
		}
		@Pc(108) int[] local108 = Static50.anIntArray332;
		@Pc(110) int local110 = Static50.anInt2730;
		@Pc(112) int local112 = Static50.anInt2726;
		@Pc(114) int local114 = Static50.anInt2729;
		@Pc(116) int local116 = Static50.anInt2725;
		@Pc(118) int local118 = Static50.anInt2727;
		@Pc(120) int local120 = Static50.anInt2728;
		@Pc(122) int[] local122 = Static99.method1589();
		@Pc(124) int local124 = Static99.anInt2399;
		@Pc(126) int local126 = Static99.anInt2397;
		local14 = new Class3_Sub1_Sub4_Sub2(32, 32);
		Static50.method1844(local14.anIntArray325, 32, 32);
		Static82.anIntArray244 = Static99.method1592(Static82.anIntArray244);
		Static50.method1840(0, 0, 32, 32, 0);
		Static99.aBoolean200 = false;
		@Pc(151) int local151 = local37.anInt737;
		if (arg1 == -1) {
			local151 = (int) ((double) local151 * 1.5D);
		}
		if (arg1 > 0) {
			local151 = (int) ((double) local151 * 1.04D);
		}
		@Pc(185) int local185 = Class3_Sub1_Sub4_Sub1.anIntArray295[local37.anInt739] * local151 >> 16;
		@Pc(194) int local194 = local151 * Class3_Sub1_Sub4_Sub1.anIntArray298[local37.anInt739] >> 16;
		local85.method776();
		local85.method783(local37.anInt734, local37.anInt717, local37.anInt739, local37.anInt758, local185 + local85.anInt2808 / 2 + local37.anInt725, local37.anInt725 + local194);
		for (@Pc(223) int local223 = 31; local223 >= 0; local223--) {
			for (local194 = 31; local194 >= 0; local194--) {
				if (local14.anIntArray325[local223 + local194 * 32] == 0) {
					if (local223 > 0 && local14.anIntArray325[local194 * 32 + local223 - 1] > 1) {
						local14.anIntArray325[local223 + local194 * 32] = 1;
					} else if (local194 > 0 && local14.anIntArray325[local223 + (local194 - 1) * 32] > 1) {
						local14.anIntArray325[local194 * 32 + local223] = 1;
					} else if (local223 < 31 && local14.anIntArray325[local194 * 32 + local223 + 1] > 1) {
						local14.anIntArray325[local194 * 32 + local223] = 1;
					} else if (local194 < 31 && local14.anIntArray325[(local194 + 1) * 32 + local223] > 1) {
						local14.anIntArray325[local194 * 32 + local223] = 1;
					}
				}
			}
		}
		@Pc(361) int local361;
		if (arg1 > 0) {
			for (local361 = 31; local361 >= 0; local361--) {
				for (local194 = 31; local194 >= 0; local194--) {
					if (local14.anIntArray325[local361 + local194 * 32] == 0) {
						if (local361 > 0 && local14.anIntArray325[local194 * 32 + local361 - 1] == 1) {
							local14.anIntArray325[local361 + local194 * 32] = arg1;
						} else if (local194 > 0 && local14.anIntArray325[(local194 - 1) * 32 + local361] == 1) {
							local14.anIntArray325[local194 * 32 + local361] = arg1;
						} else if (local361 < 31 && local14.anIntArray325[local194 * 32 + local361 + 1] == 1) {
							local14.anIntArray325[local194 * 32 + local361] = arg1;
						} else if (local194 < 31 && local14.anIntArray325[local361 + (local194 + 1) * 32] == 1) {
							local14.anIntArray325[local361 + local194 * 32] = arg1;
						}
					}
				}
			}
		} else if (arg1 == 0) {
			for (local361 = 31; local361 >= 0; local361--) {
				for (local194 = 31; local194 >= 0; local194--) {
					if (local14.anIntArray325[local361 + local194 * 32] == 0 && local361 > 0 && local194 > 0 && local14.anIntArray325[local361 + local194 * 32 - 1 - 32] > 0) {
						local14.anIntArray325[local194 * 32 + local361] = 3153952;
					}
				}
			}
		}
		if (local37.anInt732 != -1) {
			local361 = local91.anInt2574;
			local91.anInt2574 = 32;
			@Pc(571) int local571 = local91.anInt2576;
			local91.anInt2576 = 32;
			local91.method1733(0, 0);
			local91.anInt2574 = local361;
			local91.anInt2576 = local571;
		}
		if (arg1 == 0) {
			Static94.aClass8_27.method199((long) arg0, local14);
		}
		Static50.method1844(local108, local110, local112);
		Static50.method1851(local118, local116, local114, local120);
		Static99.method1592(local122);
		Static99.anInt2399 = local124;
		Static99.anInt2397 = local126;
		Static99.method1595();
		local14.anInt2576 = arg2;
		if (local37.anInt748 == 1) {
			local14.anInt2574 = 33;
		} else {
			local14.anInt2574 = 32;
		}
		Static99.aBoolean200 = true;
		return local14;
	}

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "(I)V")
	public static void method1925() {
		if (anInt2839 > 0) {
			Static43.method802();
		} else {
			Static60.method1007(40);
			Static60.aClass31_5 = Static53.aClass31_6;
			Static53.aClass31_6 = null;
		}
	}
}
