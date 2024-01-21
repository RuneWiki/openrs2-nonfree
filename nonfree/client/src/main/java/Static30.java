import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
	public static int anInt1075;

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
	public static int anInt1076;

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "[I")
	public static int[] anIntArray126;

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "J")
	public static long aLong28;

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
	public static int anInt1079;

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "Lclient!of;")
	public static Class58 aClass58_2 = new Class58();

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "Lclient!wd;")
	private static Class80 aClass80_362 = Static2.method59("glow3:");

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "Lclient!wd;")
	public static Class80 aClass80_361 = aClass80_362;

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "Lclient!wd;")
	public static Class80 aClass80_363 = aClass80_362;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)I")
	public static int method568(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return 127 - arg1;
		} else {
			arg1 = (arg0 & 0x7F) * arg1 / 128;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
	public static void method569() {
		if (Static68.aClass2_Sub1_Sub17_5 == null) {
			return;
		}
		@Pc(13) Class2_Sub1_Sub17 local13 = Static68.aClass2_Sub1_Sub17_5;
		@Pc(17) Class2_Sub1_Sub17 local17 = Static123.method1975(local13);
		if (local17 == null) {
			Static68.aClass2_Sub1_Sub17_5 = null;
			return;
		}
		Static48.anInt1506++;
		@Pc(28) int local28 = Static93.anInt2398;
		@Pc(30) int local30 = Static95.anInt2430;
		if (Static114.anInt2939 == 0) {
			local28 -= 4;
			local30 -= 4;
		}
		if (Static114.anInt2939 == 1) {
			local30 -= 205;
			local28 -= 553;
		}
		if (Static114.anInt2939 == 2) {
			local28 -= 17;
			local30 -= 357;
		}
		local28 -= Static80.anInt2030;
		local30 -= Static49.anInt1515;
		@Pc(58) int[] local58 = Static74.method1178(local17);
		if (local58[0] > local28) {
			local28 = local58[0];
		}
		@Pc(79) Class2_Sub1_Sub17 local79 = Static51.aClass2_Sub1_Sub17ArrayArray1[local13.anInt3022 >> 16][local13.anInt3008 & 0xFFFF];
		if (local17.anInt3020 + local58[0] < local28 - -local13.anInt3020) {
			local28 = local17.anInt3020 + local58[0] - local13.anInt3020;
		}
		@Pc(112) int local112 = local17.anInt3055 + local28 - local58[0];
		if (local30 < local58[1]) {
			local30 = local58[1];
		}
		if (local17.anInt3024 + local58[1] < local13.anInt3024 + local30) {
			local30 = local17.anInt3024 + local58[1] - local13.anInt3024;
		}
		@Pc(154) int local154 = local30 + local17.anInt3015 - local58[1];
		@Pc(158) int[] local158 = Static74.method1178(local79);
		@Pc(168) int local168 = local79.anInt3055 + local28 - local158[0];
		@Pc(179) int local179 = local30 + local79.anInt3015 - local158[1];
		@Pc(185) int local185 = local168 - local13.anInt3012;
		@Pc(191) int local191 = local179 - local13.anInt3037;
		if (local185 <= local13.anInt3009 && -local13.anInt3009 <= local185 && local191 <= local13.anInt3009 && local191 >= -local13.anInt3009 && !Static96.aBoolean181) {
			local154 -= local191;
			local112 -= local185;
		} else if (Static48.anInt1506 > local13.anInt3072 || Static96.aBoolean181) {
			Static96.aBoolean181 = true;
		} else {
			local112 -= local185;
			local154 -= local191;
		}
		if (Static68.aClass2_Sub1_Sub17_5.anObjectArray3 != null && Static96.aBoolean181) {
			Static40.method667(local13.anObjectArray3, null, 0, local154, local112, local13);
		}
		if (Static120.anInt3078 != 0) {
			return;
		}
		if (Static96.aBoolean181) {
			@Pc(298) Class2_Sub1_Sub17 local298 = Static27.method561(local154 + Static49.anInt1515, Static80.anInt2030 + local112, local13, local17);
			if (Static68.aClass2_Sub1_Sub17_5.anObjectArray5 != null) {
				Static40.method667(local13.anObjectArray5, local298, 0, local154, local112, local13);
			}
			if (local298 != null && Static44.method739(local13) != null) {
				Static120.aClass2_Sub17_Sub1_3.method1799(46);
				Static120.aClass2_Sub17_Sub1_3.method1785(local298.anInt3021);
				Static120.aClass2_Sub17_Sub1_3.method1765(local13.anInt3022);
				Static120.aClass2_Sub17_Sub1_3.method1745(local298.anInt3022);
				Static120.aClass2_Sub17_Sub1_3.method1785(local13.anInt3021);
			}
		} else {
			if (Static68.aClass2_Sub1_Sub17_5.anObjectArray16 != null) {
				Static40.method667(local13.anObjectArray16, null, 0, local154, local112, local13);
			}
			if ((Static81.anInt2040 == 1 || Static42.method686(Static103.anInt2679 - 1)) && Static103.anInt2679 > 2) {
				Static20.method485();
			} else if (Static103.anInt2679 > 0) {
				Static10.method168(Static103.anInt2679 - 1);
			}
		}
		Static68.aClass2_Sub1_Sub17_5 = null;
		return;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!ff;)I")
	public static int method570(@OriginalArg(1) Class11 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0.method385(Static64.aClass80_679, Static104.aClass80_1042)) {
			local1++;
		}
		if (arg0.method385(Static64.aClass80_679, Static5.aClass80_62)) {
			local1++;
		}
		if (arg0.method385(Static64.aClass80_679, Static92.aClass80_890)) {
			local1++;
		}
		if (arg0.method385(Static64.aClass80_679, Static124.aClass80_1196)) {
			local1++;
		}
		if (arg0.method385(Static64.aClass80_679, Static93.aClass80_926)) {
			local1++;
		}
		if (arg0.method385(Static64.aClass80_679, Static114.aClass80_1117)) {
			local1++;
		}
		if (arg0.method385(Static64.aClass80_679, Static86.aClass80_836)) {
			local1++;
		}
		if (arg0.method385(Static64.aClass80_679, Static45.aClass80_829)) {
			local1++;
		}
		if (arg0.method385(Static64.aClass80_679, Static70.aClass80_726)) {
			local1++;
		}
		if (arg0.method385(Static64.aClass80_679, Static66.aClass80_707)) {
			local1++;
		}
		if (arg0.method385(Static64.aClass80_679, Static127.aClass80_1210)) {
			local1++;
		}
		if (arg0.method385(Static64.aClass80_679, Static108.aClass80_1081)) {
			local1++;
		}
		if (arg0.method385(Static64.aClass80_679, Static89.aClass80_858)) {
			local1++;
		}
		if (arg0.method385(Static64.aClass80_679, Static42.aClass80_460)) {
			local1++;
		}
		if (arg0.method385(Static64.aClass80_679, Static118.aClass80_1165)) {
			local1++;
		}
		if (arg0.method385(Static64.aClass80_679, Static67.aClass80_716)) {
			local1++;
		}
		if (arg0.method385(Static64.aClass80_679, Static10.aClass80_139)) {
			local1++;
		}
		if (arg0.method385(Static64.aClass80_679, Static56.aClass80_616)) {
			local1++;
		}
		if (arg0.method385(Static64.aClass80_679, Static9.aClass80_123)) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(III)V")
	public static void method571(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class2_Sub1_Sub3 local9 = Static8.method132(arg1);
		@Pc(12) int local12 = local9.anInt257;
		@Pc(15) int local15 = local9.anInt259;
		@Pc(18) int local18 = local9.anInt256;
		@Pc(29) int local29 = Class66.anIntArray350[local18 - local15];
		if (arg0 < 0 || local29 < arg0) {
			arg0 = 0;
		}
		local29 <<= local15;
		Static15.anIntArray66[local12] = arg0 << local15 & local29 | Static15.anIntArray66[local12] & ~local29;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
	public static void method572() {
		aClass58_2 = null;
		aClass80_363 = null;
		aClass80_361 = null;
		anIntArray126 = null;
		aClass80_362 = null;
	}
}
