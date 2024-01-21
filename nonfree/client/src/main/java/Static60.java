import java.awt.Component;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!k", name = "a", descriptor = "[I")
	public static int[] anIntArray221;

	@OriginalMember(owner = "client!k", name = "g", descriptor = "Lclient!kc;")
	public static Class22 aClass22_12;

	@OriginalMember(owner = "client!k", name = "b", descriptor = "Lclient!wd;")
	public static Class80 aClass80_632 = Static2.method59("sl_flags");

	@OriginalMember(owner = "client!k", name = "c", descriptor = "[[B")
	public static byte[][] aByteArrayArray6 = new byte[50][];

	@OriginalMember(owner = "client!k", name = "d", descriptor = "I")
	public static int anInt1770 = 0;

	@OriginalMember(owner = "client!k", name = "e", descriptor = "Lclient!wd;")
	public static Class80 aClass80_633 = Static2.method59("Nehmen");

	@OriginalMember(owner = "client!k", name = "m", descriptor = "Lclient!wd;")
	public static Class80 aClass80_634 = Static2.method59("Schlie-8en");

	@OriginalMember(owner = "client!k", name = "n", descriptor = "Lclient!wd;")
	public static Class80 aClass80_635 = Static2.method59("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!k", name = "p", descriptor = "[I")
	public static int[] anIntArray222 = new int[] { 0, 2, 0, 0, 0, 0, 0, 0, 0, 3, 4, 0, 0, 1, -1, 0, 0, 0, 0, 0, -1, -2, 0, 0, 8, 5, -2, -2, 0, -2, 0, 0, 0, 0, 0, 2, 0, 0, 6, 0, 6, 0, 0, 14, 0, 0, 1, 0, 0, 0, 0, 6, 0, 0, 8, 0, 0, 0, 0, 0, 5, 2, 0, 0, 0, 3, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 4, 0, 0, 6, 0, 0, 0, -1, 0, 0, 0, 6, 0, 5, 0, 0, 0, -1, 0, 0, 0, 10, 1, 0, 7, 0, 0, 0, 2, 0, 0, 2, 4, 0, 6, 0, 0, 0, 0, 0, 3, 0, 0, 0, 2, -2, 1, 0, 0, 0, 5, 2, 0, 0, 0, 0, 0, 0, 4, 0, 6, 0, 0, 6, 0, 0, 15, 0, 0, 6, 2, 0, 7, 10, 4, 0, -2, -2, 0, 0, 0, 0, 0, 0, -2, 0, 0, -1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 11, 0, -1, 0, 6, 0, 2, 0, 0, 0, 6, 0, -2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, -2, 1, 0, 0, 0, 0, 5, 0, 2, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 4, 0, 0, 0, 3, 0 };

	@OriginalMember(owner = "client!k", name = "q", descriptor = "Lclient!wd;")
	public static Class80 aClass80_636 = Static2.method59("weiss:");

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II)V")
	public static void method1047(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && !Static70.aBoolean132) {
			Static15.method251();
		} else if (arg0 != -1 && Static91.anInt2226 != arg0 && Static87.anInt2274 != 0 && !Static70.aBoolean132) {
			Static90.method1347(arg0, Static29.aClass11_Sub1_7, Static87.anInt2274, 0);
		}
		Static91.anInt2226 = arg0;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!ff;ILjava/awt/Component;Lclient!ff;)V")
	public static void method1048(@OriginalArg(0) Class11 arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) Class11 arg2) {
		if (Static51.aBoolean99) {
			return;
		}
		Static19.aClass22_4 = Static70.method1128(arg1, 503, 765);
		Static19.aClass22_4.method1068();
		Static99.method1900();
		@Pc(26) byte[] local26 = arg2.method388(Static65.aClass80_689, Static79.aClass80_788);
		Static45.aClass2_Sub1_Sub9_Sub1_8 = new Class2_Sub1_Sub9_Sub1(local26, arg1);
		Static127.aClass2_Sub1_Sub9_Sub1_9 = Static45.aClass2_Sub1_Sub9_Sub1_8.method814();
		Static21.aClass2_Sub1_Sub9_Sub3_19 = Static73.method1164(Static63.aClass80_675, arg0, Static79.aClass80_788);
		Static78.aClass2_Sub1_Sub9_Sub3_48 = Static73.method1164(Static61.aClass80_652, arg0, Static79.aClass80_788);
		Static70.aClass2_Sub1_Sub9_Sub3_41 = Static73.method1164(Static107.aClass80_1071, arg0, Static79.aClass80_788);
		Static40.aClass2_Sub1_Sub9_Sub3Array3 = Static40.method671(Static79.aClass80_788, arg0, Static122.aClass80_1189);
		Static50.aClass2_Sub1_Sub9_Sub3Array4 = Static40.method671(Static79.aClass80_788, arg0, Static33.aClass80_380);
		Static70.anIntArray247 = new int[256];
		for (@Pc(78) int local78 = 0; local78 < 64; local78++) {
			Static70.anIntArray247[local78] = local78 * 262144;
		}
		for (@Pc(94) int local94 = 0; local94 < 64; local94++) {
			Static70.anIntArray247[local94 + 64] = local94 * 1024 + 16711680;
		}
		for (@Pc(114) int local114 = 0; local114 < 64; local114++) {
			Static70.anIntArray247[local114 + 128] = local114 * 4 + 16776960;
		}
		for (@Pc(134) int local134 = 0; local134 < 64; local134++) {
			Static70.anIntArray247[local134 + 192] = 16777215;
		}
		Static97.anIntArray332 = new int[256];
		for (@Pc(151) int local151 = 0; local151 < 64; local151++) {
			Static97.anIntArray332[local151] = local151 * 1024;
		}
		for (@Pc(167) int local167 = 0; local167 < 64; local167++) {
			Static97.anIntArray332[local167 + 64] = local167 * 4 + 65280;
		}
		for (@Pc(187) int local187 = 0; local187 < 64; local187++) {
			Static97.anIntArray332[local187 + 128] = local187 * 262144 + 65535;
		}
		for (@Pc(205) int local205 = 0; local205 < 64; local205++) {
			Static97.anIntArray332[local205 + 192] = 16777215;
		}
		Static113.anIntArray381 = new int[256];
		for (@Pc(224) int local224 = 0; local224 < 64; local224++) {
			Static113.anIntArray381[local224] = local224 * 4;
		}
		for (@Pc(238) int local238 = 0; local238 < 64; local238++) {
			Static113.anIntArray381[local238 + 64] = local238 * 262144 + 255;
		}
		for (@Pc(258) int local258 = 0; local258 < 64; local258++) {
			Static113.anIntArray381[local258 + 128] = local258 * 1024 + 16711935;
		}
		for (@Pc(276) int local276 = 0; local276 < 64; local276++) {
			Static113.anIntArray381[local276 + 192] = 16777215;
		}
		anIntArray221 = new int[32768];
		Static64.anIntArray225 = new int[32768];
		Static4.anIntArray12 = new int[256];
		Static92.method1396(null);
		Static79.aClass80_786 = Static79.aClass80_788;
		Static79.aClass80_794 = Static79.aClass80_788;
		if (Static87.anInt2274 == 0) {
			Static22.aBoolean63 = true;
		} else {
			Static22.aBoolean63 = false;
		}
		Static56.anIntArray217 = new int[32768];
		Static70.anIntArray246 = new int[32768];
		Static124.anInt3137 = 0;
		Static82.aBoolean237 = false;
		if (Static22.aBoolean63) {
			Static107.method1824();
		} else {
			method1049(Static79.aClass80_788, Static29.aClass11_Sub1_7, Static123.aClass80_1192);
		}
		Static29.method567(false);
		Static51.aBoolean99 = true;
		Static82.aBoolean236 = true;
		Static45.aClass2_Sub1_Sub9_Sub1_8.method837(0, 0);
		Static127.aClass2_Sub1_Sub9_Sub1_9.method837(382, 0);
		Static21.aClass2_Sub1_Sub9_Sub3_19.method1494(382 - Static21.aClass2_Sub1_Sub9_Sub3_19.anInt2487 / 2, 18);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!wd;Lclient!ff;ZILclient!wd;I)V")
	private static void method1049(@OriginalArg(1) Class80 arg0, @OriginalArg(2) Class11 arg1, @OriginalArg(5) Class80 arg2) {
		@Pc(8) int local8 = arg1.method378(arg2);
		@Pc(14) int local14 = arg1.method391(local8, arg0);
		Static90.method1347(local8, arg1, 255, local14);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!hb;IIB)V")
	public static void method1050(@OriginalArg(0) Class2_Sub1_Sub9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) int local16 = arg2 * arg2 + arg1 * arg1;
		if (local16 <= 4225 || local16 >= 90000) {
			Static87.method1409(arg0, arg1, arg2);
			return;
		}
		@Pc(31) int local31 = Static124.anInt3139 + Static92.anInt2272 & 0x7FF;
		@Pc(35) int local35 = Class2_Sub1_Sub9_Sub2.anIntArray202[local31];
		@Pc(43) int local43 = local35 * 256 / (Static108.anInt2879 + 256);
		@Pc(47) int local47 = Class2_Sub1_Sub9_Sub2.anIntArray198[local31];
		@Pc(55) int local55 = local47 * 256 / (Static108.anInt2879 + 256);
		@Pc(65) int local65 = local55 * arg2 + local43 * arg1 >> 16;
		@Pc(75) int local75 = local55 * arg1 - local43 * arg2 >> 16;
		@Pc(81) double local81 = Math.atan2((double) local65, (double) local75);
		@Pc(87) int local87 = (int) (Math.sin(local81) * 63.0D);
		@Pc(93) int local93 = (int) (Math.cos(local81) * 57.0D);
		Static83.aClass2_Sub1_Sub9_Sub1_6.method820(local87 + 94 + 4 - 10, -local93 + -20 + 83, local81);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IZ)V")
	public static void method1051(@OriginalArg(1) boolean arg0) {
		if (Static9.aClass74_1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && Static9.aClass74_1.anEventQueue1.peekEvent() != null; local11++) {
			Static62.method1070(1L);
		}
		if (arg0) {
			Static9.aClass74_1.anEventQueue1.postEvent(new ActionEvent(Static119.aCanvas2, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
	public static void method1052() {
		aClass80_636 = null;
		aClass80_633 = null;
		anIntArray221 = null;
		aClass80_632 = null;
		aByteArrayArray6 = null;
		aClass80_634 = null;
		aClass22_12 = null;
		anIntArray222 = null;
		aClass80_635 = null;
	}
}
