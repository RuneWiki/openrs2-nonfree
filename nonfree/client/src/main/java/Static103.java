import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!re", name = "c", descriptor = "I")
	public static int anInt2317;

	@OriginalMember(owner = "client!re", name = "f", descriptor = "I")
	public static int anInt2318;

	@OriginalMember(owner = "client!re", name = "g", descriptor = "Lclient!la;")
	public static Class17 aClass17_31;

	@OriginalMember(owner = "client!re", name = "o", descriptor = "Lclient!la;")
	public static Class17 aClass17_32;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "Lclient!v;")
	public static Class76 aClass76_1087 = Static134.method2017("headicons_hint");

	@OriginalMember(owner = "client!re", name = "b", descriptor = "Lclient!v;")
	public static Class76 aClass76_1088 = Static134.method2017("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!re", name = "d", descriptor = "Lclient!v;")
	public static Class76 aClass76_1089 = Static134.method2017("Untersuchen");

	@OriginalMember(owner = "client!re", name = "e", descriptor = "Lclient!v;")
	public static Class76 aClass76_1090 = Static134.method2017("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!re", name = "h", descriptor = "Z")
	public static boolean aBoolean137 = false;

	@OriginalMember(owner = "client!re", name = "j", descriptor = "Lclient!v;")
	public static Class76 aClass76_1091 = Static134.method2017("Versteckt");

	@OriginalMember(owner = "client!re", name = "m", descriptor = "[[I")
	public static int[][] anIntArrayArray18 = new int[5][5000];

	@OriginalMember(owner = "client!re", name = "n", descriptor = "[Z")
	public static boolean[] aBooleanArray14 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

	@OriginalMember(owner = "client!re", name = "p", descriptor = "[I")
	public static int[] anIntArray322 = new int[5];

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)V")
	public static void method1596() {
		aClass76_1091 = null;
		anIntArray322 = null;
		aClass76_1088 = null;
		aClass76_1089 = null;
		aClass76_1090 = null;
		aClass76_1087 = null;
		aClass17_32 = null;
		anIntArrayArray18 = null;
		aBooleanArray14 = null;
		aClass17_31 = null;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
	public static void method1597() {
		@Pc(11) Class53 local11 = Static6.aClass53_1;
		synchronized (Static6.aClass53_1) {
			Static101.anInt2302 = Static130.anInt2771;
			@Pc(22) int local22;
			if (Static111.anInt2442 < 0) {
				for (local22 = 0; local22 < 112; local22++) {
					Static42.aBooleanArray7[local22] = false;
				}
				Static111.anInt2442 = Static81.anInt2006;
			} else {
				while (Static111.anInt2442 != Static81.anInt2006) {
					local22 = Static12.anIntArray36[Static81.anInt2006];
					Static81.anInt2006 = Static81.anInt2006 + 1 & 0x7F;
					if (local22 < 0) {
						Static42.aBooleanArray7[~local22] = false;
					} else {
						Static42.aBooleanArray7[local22] = true;
					}
				}
			}
			Static130.anInt2771 = Static17.anInt341;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIBII)V")
	public static void method1598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static54.aClass81_10.method1954(arg1, arg0, arg3);
		@Pc(23) int local23;
		@Pc(29) int local29;
		@Pc(33) int local33;
		@Pc(35) int local35;
		@Pc(58) int local58;
		@Pc(64) int local64;
		if (local11 != 0) {
			local23 = Static54.aClass81_10.method1982(arg1, arg0, arg3, local11);
			local29 = local23 >> 6 & 0x3;
			local33 = local23 & 0x1F;
			local35 = arg4;
			if (local11 > 0) {
				local35 = arg2;
			}
			@Pc(45) int[] local45 = Static104.aClass4_Sub4_Sub5_Sub2_4.anIntArray166;
			local58 = (103 - arg3) * 2048 + arg0 * 4 + 24624;
			local64 = local11 >> 14 & 0x7FFF;
			@Pc(68) Class4_Sub4_Sub8 local68 = Static104.method1600(local64);
			if (local68.anInt1485 == -1) {
				if (local33 == 0 || local33 == 2) {
					if (local29 == 0) {
						local45[local58] = local35;
						local45[local58 + 512] = local35;
						local45[local58 + 1024] = local35;
						local45[local58 + 1536] = local35;
					} else if (local29 == 1) {
						local45[local58] = local35;
						local45[local58 + 1] = local35;
						local45[local58 + 2] = local35;
						local45[local58 + 3] = local35;
					} else if (local29 == 2) {
						local45[local58 + 3] = local35;
						local45[local58 + 515] = local35;
						local45[local58 + 1027] = local35;
						local45[local58 + 1539] = local35;
					} else if (local29 == 3) {
						local45[local58 + 1536] = local35;
						local45[local58 + 1537] = local35;
						local45[local58 + 1536 + 2] = local35;
						local45[local58 + 1536 + 3] = local35;
					}
				}
				if (local33 == 3) {
					if (local29 == 0) {
						local45[local58] = local35;
					} else if (local29 == 1) {
						local45[local58 + 3] = local35;
					} else if (local29 == 2) {
						local45[local58 + 3 + 1536] = local35;
					} else if (local29 == 3) {
						local45[local58 + 1536] = local35;
					}
				}
				if (local33 == 2) {
					if (local29 == 3) {
						local45[local58] = local35;
						local45[local58 + 512] = local35;
						local45[local58 + 1024] = local35;
						local45[local58 + 1536] = local35;
					} else if (local29 == 0) {
						local45[local58] = local35;
						local45[local58 + 1] = local35;
						local45[local58 + 2] = local35;
						local45[local58 + 3] = local35;
					} else if (local29 == 1) {
						local45[local58 + 3] = local35;
						local45[local58 + 512 + 3] = local35;
						local45[local58 + 3 + 1024] = local35;
						local45[local58 + 1539] = local35;
					} else if (local29 == 2) {
						local45[local58 + 1536] = local35;
						local45[local58 + 1537] = local35;
						local45[local58 + 2 + 1536] = local35;
						local45[local58 + 3 + 1536] = local35;
					}
				}
			} else {
				@Pc(77) Class4_Sub4_Sub5_Sub4 local77 = Static30.aClass4_Sub4_Sub5_Sub4Array5[local68.anInt1485];
				if (local77 != null) {
					@Pc(90) int local90 = (local68.anInt1498 * 4 - local77.anInt2607) / 2;
					@Pc(101) int local101 = (local68.anInt1505 * 4 - local77.anInt2612) / 2;
					local77.method1836(arg0 * 4 + local90 + 48, (-arg3 + 104 + -local68.anInt1505) * 4 + 48 + local101);
				}
			}
		}
		local11 = Static54.aClass81_10.method1990(arg1, arg0, arg3);
		if (local11 != 0) {
			local23 = Static54.aClass81_10.method1982(arg1, arg0, arg3, local11);
			local29 = local23 >> 6 & 0x3;
			local33 = local23 & 0x1F;
			local35 = local11 >> 14 & 0x7FFF;
			@Pc(456) Class4_Sub4_Sub8 local456 = Static104.method1600(local35);
			@Pc(488) int local488;
			if (local456.anInt1485 != -1) {
				@Pc(465) Class4_Sub4_Sub5_Sub4 local465 = Static30.aClass4_Sub4_Sub5_Sub4Array5[local456.anInt1485];
				if (local465 != null) {
					local64 = (local456.anInt1498 * 4 - local465.anInt2607) / 2;
					local488 = (local456.anInt1505 * 4 - local465.anInt2612) / 2;
					local465.method1836(local64 + arg0 * 4 + 48, (104 - (arg3 + local456.anInt1505)) * 4 + 48 + local488);
				}
			} else if (local33 == 9) {
				local58 = 15658734;
				if (local11 > 0) {
					local58 = 15597568;
				}
				@Pc(523) int[] local523 = Static104.aClass4_Sub4_Sub5_Sub2_4.anIntArray166;
				local488 = arg0 * 4 + (52736 - arg3 * 512) * 4 + 24624;
				if (local29 == 0 || local29 == 2) {
					local523[local488 + 1536] = local58;
					local523[local488 + 1024 + 1] = local58;
					local523[local488 + 514] = local58;
					local523[local488 + 3] = local58;
				} else {
					local523[local488] = local58;
					local523[local488 + 1 + 512] = local58;
					local523[local488 + 2 + 1024] = local58;
					local523[local488 + 1539] = local58;
				}
			}
		}
		local11 = Static54.aClass81_10.method1966(arg1, arg0, arg3);
		if (local11 == 0) {
			return;
		}
		local23 = local11 >> 14 & 0x7FFF;
		@Pc(614) Class4_Sub4_Sub8 local614 = Static104.method1600(local23);
		if (local614.anInt1485 == -1) {
			return;
		}
		@Pc(624) Class4_Sub4_Sub5_Sub4 local624 = Static30.aClass4_Sub4_Sub5_Sub4Array5[local614.anInt1485];
		if (local624 != null) {
			local35 = (local614.anInt1498 * 4 - local624.anInt2607) / 2;
			@Pc(648) int local648 = (local614.anInt1505 * 4 - local624.anInt2612) / 2;
			local624.method1836(arg0 * 4 + local35 + 48, (-arg3 + 104 + -local614.anInt1505) * 4 + 48 - -local648);
			return;
		}
	}
}
