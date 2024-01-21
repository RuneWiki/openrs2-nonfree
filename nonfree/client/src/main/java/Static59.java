import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "Lclient!fe;")
	public static Class29 aClass29_28;

	@OriginalMember(owner = "client!jf", name = "p", descriptor = "[I")
	public static int[] anIntArray160;

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "Lclient!c;")
	public static Class12 aClass12_41 = new Class12(64);

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
	public static int anInt1553 = -1;

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "Lclient!ja;")
	public static Class39 aClass39_839 = Static28.method504("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
	public static int anInt1555 = 0;

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
	public static int anInt1556 = 0;

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
	public static int anInt1557 = 0;

	@OriginalMember(owner = "client!jf", name = "o", descriptor = "Lclient!ja;")
	public static Class39 aClass39_840 = Static28.method504("mn");

	@OriginalMember(owner = "client!jf", name = "r", descriptor = "Lclient!de;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!jf", name = "s", descriptor = "Lclient!ja;")
	public static Class39 aClass39_841 = Static28.method504("(U(Y");

	@OriginalMember(owner = "client!jf", name = "D", descriptor = "I")
	public static int anInt1568 = 0;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLclient!he;)Z")
	public static boolean method1047(@OriginalArg(1) Class4_Sub5 arg0) {
		if (arg0.anIntArray129 == null) {
			return false;
		}
		for (@Pc(20) int local20 = 0; local20 < arg0.anIntArray129.length; local20++) {
			@Pc(27) int local27 = Static117.method2039(local20, arg0);
			@Pc(32) int local32 = arg0.anIntArray124[local20];
			if (arg0.anIntArray129[local20] == 2) {
				if (local27 >= local32) {
					return false;
				}
			} else if (arg0.anIntArray129[local20] == 3) {
				if (local27 <= local32) {
					return false;
				}
			} else if (arg0.anIntArray129[local20] == 4) {
				if (local32 == local27) {
					return false;
				}
			} else if (local27 != local32) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BIIIII[Lclient!we;II[B)V")
	public static void method1048(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class81[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[] arg8) {
		for (@Pc(8) int local8 = 0; local8 < 8; local8++) {
			for (@Pc(12) int local12 = 0; local12 < 8; local12++) {
				if (arg2 + local8 > 0 && local8 + arg2 < 103 && local12 + arg4 > 0 && arg4 + local12 < 103) {
					arg5[arg1].anIntArrayArray29[local8 + arg2][local12 + arg4] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(75) Class4_Sub16 local75 = new Class4_Sub16(arg8);
		for (@Pc(77) int local77 = 0; local77 < 4; local77++) {
			for (@Pc(81) int local81 = 0; local81 < 64; local81++) {
				for (@Pc(85) int local85 = 0; local85 < 64; local85++) {
					if (arg0 == local77 && local81 >= arg6 && local81 < arg6 + 8 && local85 >= arg3 && arg3 + 8 > local85) {
						Static11.method223(arg7, arg1, local75, arg4 + Static1.method5(arg7, local81 & 0x7, local85 & 0x7), 0, 0, arg2 + Static14.method240(arg7, local81 & 0x7, local85 & 0x7));
					} else {
						Static11.method223(0, 0, local75, -1, 0, 0, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)Lclient!ic;")
	public static Class4_Sub2_Sub3_Sub1 method1050() {
		@Pc(3) Class4_Sub2_Sub3_Sub1 local3 = new Class4_Sub2_Sub3_Sub1();
		local3.anInt1341 = Static21.anIntArray61[0];
		local3.anInt1344 = Static16.anIntArray49[0];
		local3.anInt1345 = Static15.anInt375;
		local3.anInt1343 = Static51.anIntArray277[0];
		local3.anInt1342 = Static9.anInt291;
		@Pc(32) byte[] local32 = Static70.aByteArrayArray6[0];
		local3.anInt1340 = Static121.anIntArray320[0];
		@Pc(43) int local43 = local3.anInt1344 * local3.anInt1341;
		local3.anIntArray141 = new int[local43];
		for (@Pc(49) int local49 = 0; local49 < local43; local49++) {
			local3.anIntArray141[local49] = Static114.anIntArray308[local32[local49] & 0xFF];
		}
		Static120.method2049();
		return local3;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BII)Lclient!he;")
	public static Class4_Sub5 method1051(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class4_Sub5 local15 = Static54.method949(arg1);
		if (arg0 == -1) {
			return local15;
		} else if (local15 == null || local15.aClass4_Sub5Array1 == null || arg0 >= local15.aClass4_Sub5Array1.length) {
			return null;
		} else {
			return local15.aClass4_Sub5Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)Lclient!qe;")
	public static Class30 method1053() {
		try {
			return (Class30) Class.forName("Class30_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V")
	public static void method1057() {
		Static80.aClass4_Sub1_Sub1_2.method80();
		Static40.anInt1002 = 1;
		Static14.aClass20_10 = null;
	}

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)V")
	public static void method1058() {
		anIntArray160 = null;
		aClass39_840 = null;
		aClass12_41 = null;
		aClass39_839 = null;
		aClass29_28 = null;
		aClass39_841 = null;
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V")
	public static void method1059() {
		if (Static96.aBooleanArray11[98]) {
			Static116.anInt2894 += (12 - Static116.anInt2894) / 2;
		} else if (Static96.aBooleanArray11[99]) {
			Static116.anInt2894 += (-Static116.anInt2894 - 12) / 2;
		} else {
			Static116.anInt2894 /= 2;
		}
		if (Static96.aBooleanArray11[96]) {
			Static29.anInt762 += (-Static29.anInt762 - 24) / 2;
		} else if (Static96.aBooleanArray11[97]) {
			Static29.anInt762 += (24 - Static29.anInt762) / 2;
		} else {
			Static29.anInt762 /= 2;
		}
		Static53.anInt1401 += Static116.anInt2894 / 2;
		Static54.anInt1446 = Static54.anInt1446 + Static29.anInt762 / 2 & 0x7FF;
		@Pc(93) int local93 = Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2643 + Static62.anInt1628;
		@Pc(99) int local99 = Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2641 + Static84.anInt2098;
		if (Static42.anInt1059 - local93 < -500 || Static42.anInt1059 - local93 > 500 || Static21.anInt622 - local99 < -500 || Static21.anInt622 - local99 > 500) {
			Static42.anInt1059 = local93;
			Static21.anInt622 = local99;
		}
		@Pc(132) int local132 = 0;
		if (Static53.anInt1401 < 128) {
			Static53.anInt1401 = 128;
		}
		if (local99 != Static21.anInt622) {
			Static21.anInt622 += (local99 - Static21.anInt622) / 16;
		}
		@Pc(157) int local157 = Static21.anInt622 >> 7;
		if (Static53.anInt1401 > 383) {
			Static53.anInt1401 = 383;
		}
		if (local93 != Static42.anInt1059) {
			Static42.anInt1059 += (local93 - Static42.anInt1059) / 16;
		}
		@Pc(184) int local184 = Static42.anInt1059 >> 7;
		@Pc(190) int local190 = Static94.method1708(Static42.anInt1059, Static21.anInt622, Static131.anInt3202);
		@Pc(210) int local210;
		if (local184 > 3 && local157 > 3 && local184 < 100 && local157 < 100) {
			for (local210 = local184 - 4; local210 <= local184 + 4; local210++) {
				for (@Pc(216) int local216 = local157 - 4; local216 <= local157 + 4; local216++) {
					@Pc(220) int local220 = Static131.anInt3202;
					if (local220 < 3 && (Static131.aByteArrayArrayArray7[1][local210][local216] & 0x2) == 2) {
						local220++;
					}
					@Pc(248) int local248 = local190 - Static6.anIntArrayArrayArray1[local220][local210][local216];
					if (local132 < local248) {
						local132 = local248;
					}
				}
			}
		}
		local210 = local132 * 192;
		if (local210 > 98048) {
			local210 = 98048;
		}
		if (local210 < 32768) {
			local210 = 32768;
		}
		if (Static68.anInt1707 < local210) {
			Static68.anInt1707 += (local210 - Static68.anInt1707) / 24;
		} else if (Static68.anInt1707 > local210) {
			Static68.anInt1707 += (local210 - Static68.anInt1707) / 80;
			return;
		}
	}
}
