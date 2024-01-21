import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!sd", name = "I", descriptor = "Lclient!md;")
	public static Class30 aClass30_16;

	@OriginalMember(owner = "client!sd", name = "fb", descriptor = "Lclient!tb;")
	public static Class44 aClass44_57;

	@OriginalMember(owner = "client!sd", name = "G", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1434 = Static33.method650("title_mute");

	@OriginalMember(owner = "client!sd", name = "S", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1439 = Static33.method650("wishes to duel with you)3");

	@OriginalMember(owner = "client!sd", name = "H", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1435 = aClass56_1439;

	@OriginalMember(owner = "client!sd", name = "J", descriptor = "Z")
	public static boolean aBoolean120 = false;

	@OriginalMember(owner = "client!sd", name = "L", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1436 = Static33.method650("Passwort: ");

	@OriginalMember(owner = "client!sd", name = "N", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1437 = Static33.method650("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!sd", name = "O", descriptor = "I")
	public static final int anInt2609 = 0;

	@OriginalMember(owner = "client!sd", name = "V", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1440 = Static33.method650("Private chat");

	@OriginalMember(owner = "client!sd", name = "P", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1438 = aClass56_1440;

	@OriginalMember(owner = "client!sd", name = "U", descriptor = "I")
	public static int anInt2613 = 0;

	@OriginalMember(owner = "client!sd", name = "X", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1441 = Static33.method650("Okay");

	@OriginalMember(owner = "client!sd", name = "Z", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1442 = Static33.method650(":");

	@OriginalMember(owner = "client!sd", name = "gb", descriptor = "[I")
	public static int[] anIntArray223 = new int[25];

	@OriginalMember(owner = "client!sd", name = "lb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1443 = Static33.method650("System)2Update in: ");

	@OriginalMember(owner = "client!sd", name = "mb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1444 = Static33.method650("An");

	@OriginalMember(owner = "client!sd", name = "ob", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1445 = Static33.method650("(U(Y");

	@OriginalMember(owner = "client!sd", name = "qb", descriptor = "Z")
	public static boolean aBoolean121 = false;

	@OriginalMember(owner = "client!sd", name = "rb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1446 = Static33.method650("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)V")
	public static void method1751() {
		aClass56_1436 = null;
		aClass56_1434 = null;
		aClass56_1435 = null;
		anIntArray223 = null;
		aClass56_1442 = null;
		aClass56_1443 = null;
		aClass56_1446 = null;
		aClass44_57 = null;
		aClass56_1445 = null;
		aClass30_16 = null;
		aClass56_1440 = null;
		aClass56_1438 = null;
		aClass56_1441 = null;
		aClass56_1439 = null;
		aClass56_1437 = null;
		aClass56_1444 = null;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)V")
	public static void method1752(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) long local10 = (long) (arg0 + (arg1 << 16));
		@Pc(16) Class3_Sub1_Sub14 local16 = (Class3_Sub1_Sub14) Static93.aClass2_10.method17(local10);
		if (local16 != null) {
			Static5.aClass68_1.method1734(local16);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIII)V")
	public static void method1753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static116.anInt2950 == arg2 && Static79.anInt2110 == arg0 && (Static14.anInt326 == arg1 || !Static77.aBoolean169)) {
			return;
		}
		Static116.anInt2950 = arg2;
		Static14.anInt326 = arg1;
		Static79.anInt2110 = arg0;
		if (!Static77.aBoolean169) {
			Static14.anInt326 = 0;
		}
		Static79.method1393(25);
		Static79.method1391(false, Static46.aClass56_1214, null);
		@Pc(53) int local53 = Static18.anInt497;
		Static18.anInt497 = arg2 * 8 - 48;
		@Pc(64) int local64 = Static18.anInt497 - local53;
		@Pc(66) int local66 = Static57.anInt1618;
		Static57.anInt1618 = (arg0 - 6) * 8;
		@Pc(79) int local79 = Static57.anInt1618 - local66;
		for (@Pc(83) int local83 = 0; local83 < 32768; local83++) {
			@Pc(89) Class3_Sub1_Sub2_Sub4_Sub2 local89 = Static33.aClass3_Sub1_Sub2_Sub4_Sub2Array1[local83];
			if (local89 != null) {
				for (@Pc(93) int local93 = 0; local93 < 10; local93++) {
					local89.anIntArray332[local93] -= local64;
					local89.anIntArray336[local93] -= local79;
				}
				local89.anInt3187 -= local64 * 128;
				local89.anInt3196 -= local79 * 128;
			}
		}
		for (@Pc(137) int local137 = 0; local137 < 2048; local137++) {
			@Pc(143) Class3_Sub1_Sub2_Sub4_Sub1 local143 = Static29.aClass3_Sub1_Sub2_Sub4_Sub1Array1[local137];
			if (local143 != null) {
				for (@Pc(147) int local147 = 0; local147 < 10; local147++) {
					local143.anIntArray332[local147] -= local64;
					local143.anIntArray336[local147] -= local79;
				}
				local143.anInt3187 -= local64 * 128;
				local143.anInt3196 -= local79 * 128;
			}
		}
		Static94.anInt2470 = arg1;
		@Pc(195) byte local195 = 104;
		@Pc(197) byte local197 = 1;
		@Pc(199) byte local199 = 0;
		@Pc(201) byte local201 = 0;
		if (local64 < 0) {
			local199 = 103;
			local195 = -1;
			local197 = -1;
		}
		Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.method2031(false, arg3, arg4);
		@Pc(220) byte local220 = 104;
		@Pc(222) byte local222 = 1;
		if (local79 < 0) {
			local201 = 103;
			local222 = -1;
			local220 = -1;
		}
		for (@Pc(232) int local232 = local199; local232 != local195; local232 += local197) {
			for (@Pc(236) int local236 = local201; local236 != local220; local236 += local222) {
				@Pc(242) int local242 = local64 + local232;
				@Pc(246) int local246 = local236 + local79;
				for (@Pc(248) int local248 = 0; local248 < 4; local248++) {
					if (local242 >= 0 && local246 >= 0 && local242 < 104 && local246 < 104) {
						Static8.aClass37ArrayArrayArray1[local248][local232][local236] = Static8.aClass37ArrayArrayArray1[local248][local242][local246];
					} else {
						Static8.aClass37ArrayArrayArray1[local248][local232][local236] = null;
					}
				}
			}
		}
		for (@Pc(316) Class3_Sub6 local316 = (Class3_Sub6) Static67.aClass37_11.method989(); local316 != null; local316 = (Class3_Sub6) Static67.aClass37_11.method990()) {
			local316.anInt954 -= local79;
			local316.anInt943 -= local64;
			if (local316.anInt943 < 0 || local316.anInt954 < 0 || local316.anInt943 >= 104 || local316.anInt954 >= 104) {
				local316.method2055();
			}
		}
		Static27.aBoolean43 = false;
		if (Static38.anInt1028 != 0) {
			Static75.anInt2022 -= local79;
			Static38.anInt1028 -= local64;
		}
		Static106.anInt2625 = 0;
		Static93.anInt2441 = -1;
		Static82.aClass37_10.method996();
		Static21.aClass37_4.method996();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIILclient!d;III[Lclient!wc;[BII)V")
	public static void method1754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class14 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class81[] arg6, @OriginalArg(8) byte[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(10) Class3_Sub2 local10 = new Class3_Sub2(arg7);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method311();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(27) int local27 = 0;
			while (true) {
				@Pc(33) int local33 = local10.method311();
				if (local33 == 0) {
					break;
				}
				local27 += local33 - 1;
				@Pc(47) int local47 = local27 >> 6 & 0x3F;
				@Pc(51) int local51 = local27 & 0x3F;
				@Pc(55) int local55 = local27 >> 12;
				@Pc(59) int local59 = local10.method270();
				@Pc(63) int local63 = local59 & 0x3;
				@Pc(67) int local67 = local59 >> 2;
				if (arg4 == local55 && arg5 <= local47 && arg5 + 8 > local47 && local51 >= arg8 && local51 < arg8 + 8) {
					@Pc(102) Class3_Sub1_Sub15 local102 = Static122.method1962(local12);
					@Pc(119) int local119 = arg0 + Static56.method1065(local63, local51 & 0x7, arg1, local102.anInt2743, local47 & 0x7, local102.anInt2745);
					@Pc(137) int local137 = arg9 + Static50.method901(local51 & 0x7, local63, local102.anInt2743, arg1, local47 & 0x7, local102.anInt2745);
					if (local119 > 0 && local137 > 0 && local119 < 103 && local137 < 103) {
						@Pc(155) Class81 local155 = null;
						@Pc(157) int local157 = arg2;
						if ((Static66.aByteArrayArrayArray3[1][local119][local137] & 0x2) == 2) {
							local157 = arg2 - 1;
						}
						if (local157 >= 0) {
							local155 = arg6[local157];
						}
						Static106.method1762(local137, local155, local63 + arg1 & 0x3, local67, arg2, local119, local12, arg3);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(12) Class3_Sub6 local12 = null;
		for (@Pc(17) Class3_Sub6 local17 = (Class3_Sub6) Static67.aClass37_11.method989(); local17 != null; local17 = (Class3_Sub6) Static67.aClass37_11.method990()) {
			if (arg7 == local17.anInt942 && local17.anInt943 == arg0 && arg2 == local17.anInt954 && local17.anInt958 == arg4) {
				local12 = local17;
				break;
			}
		}
		if (local12 == null) {
			local12 = new Class3_Sub6();
			local12.anInt954 = arg2;
			local12.anInt958 = arg4;
			local12.anInt943 = arg0;
			local12.anInt942 = arg7;
			Static52.method987(local12);
			Static67.aClass37_11.method985(local12);
		}
		local12.anInt955 = arg8;
		local12.anInt950 = arg3;
		local12.anInt949 = arg1;
		local12.anInt945 = arg5;
		local12.anInt947 = arg6;
	}
}
