import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!j", name = "t", descriptor = "I")
	public static int anInt2126;

	@OriginalMember(owner = "client!j", name = "K", descriptor = "Lclient!eh;")
	private static Class28 aClass28_640 = Static170.method3101("wishes to trade with you)3");

	@OriginalMember(owner = "client!j", name = "s", descriptor = "Lclient!eh;")
	public static Class28 aClass28_633 = aClass28_640;

	@OriginalMember(owner = "client!j", name = "u", descriptor = "Lclient!eh;")
	public static Class28 aClass28_634 = Static170.method3101("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!j", name = "A", descriptor = "Lclient!eh;")
	public static Class28 aClass28_635 = Static170.method3101("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!j", name = "G", descriptor = "Lclient!eh;")
	private static Class28 aClass28_637 = Static170.method3101("green:");

	@OriginalMember(owner = "client!j", name = "E", descriptor = "Lclient!eh;")
	public static Class28 aClass28_636 = aClass28_637;

	@OriginalMember(owner = "client!j", name = "H", descriptor = "Lclient!eh;")
	public static Class28 aClass28_638 = aClass28_637;

	@OriginalMember(owner = "client!j", name = "J", descriptor = "Lclient!eh;")
	public static Class28 aClass28_639 = Static170.method3101("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!j", name = "M", descriptor = "Lclient!pa;")
	public static Class63 aClass63_11 = new Class63(64);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ZLclient!jh;Lclient!jh;)V")
	public static void method1645(@OriginalArg(1) Class3_Sub2_Sub2_Sub1_Sub1 arg0, @OriginalArg(2) Class3_Sub2_Sub2_Sub1_Sub1 arg1) {
		if (Static109.aBoolean138) {
			Static104.method2130(arg1, arg0);
			return;
		}
		if (Static137.anInt3514 == 0 || Static137.anInt3514 == 5) {
			arg0.method1787(Static176.aClass28_1465, 382, 225, 16777215, -1);
			Static147.method1777(230, 233, 304, 34, 9179409);
			Static147.method1777(231, 234, 302, 32, 0);
			Static147.method1775(232, 235, Static141.anInt3626 * 3, 30, 9179409);
			Static147.method1775(Static141.anInt3626 * 3 + 232, 235, 300 - Static141.anInt3626 * 3, 30, 0);
			arg0.method1787(Static140.aClass28_1185, 382, 256, 16777215, -1);
		}
		@Pc(117) short local117;
		@Pc(125) int local125;
		if (Static137.anInt3514 == 20) {
			Static55.aClass3_Sub2_Sub2_Sub3_1.method840(382 - Static55.aClass3_Sub2_Sub2_Sub3_1.anInt1013 / 2, -(Static55.aClass3_Sub2_Sub2_Sub3_1.anInt1014 / 2) + 271);
			local117 = 211;
			arg0.method1787(Static140.aClass28_1191, 382, 211, 16776960, 0);
			local125 = local117 + 15;
			arg0.method1787(Static140.aClass28_1180, 382, 226, 16776960, 0);
			@Pc(133) int local133 = local125 + 15;
			arg0.method1787(Static140.aClass28_1190, 382, 241, 16776960, 0);
			@Pc(141) int local141 = local133 + 15;
			@Pc(142) int local142 = local141 + 10;
			arg0.method1811(Static4.method96(new Class28[] { Static34.aClass28_346, Static10.method1786(Static140.aClass28_1189) }), 272, 266, 16777215, 0);
			@Pc(162) int local162 = local142 + 15;
			arg0.method1811(Static4.method96(new Class28[] { Static132.aClass28_1092, Static140.aClass28_1183.method923() }), 274, 281, 16777215, 0);
			@Pc(183) int local183 = local162 + 15;
		}
		if (Static137.anInt3514 == 10) {
			Static55.aClass3_Sub2_Sub2_Sub3_1.method840(202, 171);
			if (Static82.anInt2394 == 0) {
				local117 = 251;
				arg0.method1787(Static164.aClass28_1392, 382, 251, 16776960, 0);
				local125 = local117 + 30;
				Static156.aClass3_Sub2_Sub2_Sub3_3.method840(229, 271);
				arg0.method1810(Static65.aClass28_592, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
				Static156.aClass3_Sub2_Sub2_Sub3_3.method840(389, 271);
				arg0.method1810(Static95.aClass28_835, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (Static82.anInt2394 == 2) {
				local117 = 211;
				arg0.method1787(Static140.aClass28_1191, 382, 211, 16776960, 0);
				local125 = local117 + 15;
				arg0.method1787(Static140.aClass28_1180, 382, 226, 16776960, 0);
				local125 += 15;
				arg0.method1787(Static140.aClass28_1190, 382, 241, 16776960, 0);
				local125 += 15;
				local125 += 10;
				@Pc(380) boolean local380;
				if (Static122.anInt3160 == 0 && Static14.anInt481 % 40 < 20 && Static52.aBoolean85) {
					local380 = true;
				} else {
					local380 = false;
				}
				arg0.method1811(Static4.method96(new Class28[] { Static34.aClass28_346, Static10.method1786(Static140.aClass28_1189), local380 ? Static85.aClass28_785 : Static140.aClass28_1184 }), 272, 266, 16777215, 0);
				local125 += 15;
				if (Static122.anInt3160 == 1 && Static14.anInt481 % 40 < 20 && Static52.aBoolean85) {
					local380 = true;
				} else {
					local380 = false;
				}
				arg0.method1811(Static4.method96(new Class28[] { Static132.aClass28_1092, Static140.aClass28_1183.method923(), local380 ? Static85.aClass28_785 : Static140.aClass28_1184 }), 274, 281, 16777215, 0);
				Static156.aClass3_Sub2_Sub2_Sub3_3.method840(229, 301);
				local125 += 15;
				arg0.method1787(Static92.aClass28_1476, 302, 326, 16777215, 0);
				Static156.aClass3_Sub2_Sub2_Sub3_3.method840(389, 301);
				arg0.method1787(Static107.aClass28_893, 462, 326, 16777215, 0);
			} else if (Static82.anInt2394 == 3) {
				local117 = 236;
				arg0.method1787(Static47.aClass28_417, 382, 211, 16776960, 0);
				arg0.method1787(Static62.aClass28_569, 382, 236, 16777215, 0);
				local125 = local117 + 15;
				arg0.method1787(Static31.aClass28_325, 382, 251, 16777215, 0);
				local125 += 15;
				arg0.method1787(Static139.aClass28_1234, 382, 266, 16777215, 0);
				local125 += 15;
				arg0.method1787(Static77.aClass28_699, 382, 281, 16777215, 0);
				local125 += 15;
				Static156.aClass3_Sub2_Sub2_Sub3_3.method840(309, 301);
				arg0.method1787(Static107.aClass28_893, 382, 326, 16777215, 0);
			}
		}
		if (Static42.anInt1177 != 1) {
			if (Static72.anInt2142 > 0) {
				Static95.method2092(Static72.anInt2142);
				Static72.anInt2142 = 0;
			}
			Static155.method2950();
		}
		Static173.aClass3_Sub2_Sub2_Sub3Array10[Static157.aBoolean181 ? 1 : 0].method840(725, 463);
		if (Static137.anInt3514 <= 5 || Static140.anInt3584 == 2 || Static114.anInt2922 != 0) {
			return;
		}
		if (Static176.aClass3_Sub2_Sub2_Sub3_4 == null) {
			Static176.aClass3_Sub2_Sub2_Sub3_4 = Static154.method2921(Static140.aClass28_1184, Static84.aClass28_769, Static2.aClass7_Sub1_1);
			return;
		}
		Static176.aClass3_Sub2_Sub2_Sub3_4.method840(5, 463);
		arg0.method1787(Static4.method96(new Class28[] { Static26.aClass28_269, Static150.aClass28_1248, Static146.method2793(Static170.anInt4098) }), 55, 478, 16777215, 0);
		if (Static140.aClass82_1 == null) {
			arg1.method1787(Static5.aClass28_45, 55, 492, 16777215, 0);
		} else {
			arg1.method1787(Static137.aClass28_1149, 55, 492, 16777215, 0);
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!eh;IILclient!eh;BSJ)V")
	public static void method1646(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class28 arg3, @OriginalArg(5) short arg4, @OriginalArg(6) long arg5) {
		if (Static69.aBoolean112 || Static82.anInt2400 >= 500) {
			return;
		}
		Static145.aClass28Array22[Static82.anInt2400] = arg0;
		Static69.aClass28Array12[Static82.anInt2400] = arg3;
		Static21.aShortArray8[Static82.anInt2400] = arg4;
		Static149.aLongArray6[Static82.anInt2400] = arg5;
		Static8.anIntArray228[Static82.anInt2400] = arg2;
		Static46.anIntArray238[Static82.anInt2400] = arg1;
		Static82.anInt2400++;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(Z)Lclient!fb;")
	public static Class3_Sub2_Sub2_Sub4 method1647() {
		@Pc(12) Class3_Sub2_Sub2_Sub4 local12 = new Class3_Sub2_Sub2_Sub4();
		local12.anInt1176 = Static173.anIntArray690[0];
		local12.anInt1174 = Static59.anIntArray293[0];
		local12.anInt1171 = Static95.anIntArray452[0];
		local12.anInt1175 = Static83.anIntArray394[0];
		local12.anInt1172 = Static114.anInt2920;
		@Pc(39) byte[] local39 = Static59.aByteArrayArray41[0];
		local12.anInt1173 = Static172.anInt4139;
		@Pc(48) int local48 = local12.anInt1175 * local12.anInt1171;
		local12.anIntArray222 = new int[local48];
		for (@Pc(54) int local54 = 0; local54 < local48; local54++) {
			local12.anIntArray222[local54] = Static55.anIntArray272[local39[local54] & 0xFF];
		}
		Static82.method1880();
		return local12;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IB)V")
	public static void method1648(@OriginalArg(0) int arg0) {
		for (@Pc(4) Class3_Sub24 local4 = (Class3_Sub24) Static30.aClass87_3.method3203(); local4 != null; local4 = (Class3_Sub24) Static30.aClass87_3.method3199()) {
			if ((long) arg0 == (local4.aLong144 >> 48 & 0xFFFFL)) {
				local4.method3167();
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
	public static void method1649() {
		aClass28_634 = null;
		aClass28_633 = null;
		aClass28_640 = null;
		aClass28_639 = null;
		aClass28_635 = null;
		aClass28_638 = null;
		aClass28_636 = null;
		aClass63_11 = null;
		aClass28_637 = null;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IBI)V")
	public static void method1650(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static126.anInt3243 != 0 && arg1 != -1) {
			Static68.method1631(arg1, 0, Static61.aClass7_Sub1_8, Static126.anInt3243);
			Static61.aBoolean101 = true;
		}
	}
}
