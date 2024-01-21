import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!wd", name = "Uc", descriptor = "Lclient!md;")
	public static Class30 aClass30_18;

	@OriginalMember(owner = "client!wd", name = "Kc", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1732 = Static33.method650("AUS");

	@OriginalMember(owner = "client!wd", name = "Nc", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1733 = Static33.method650("sl_arrows");

	@OriginalMember(owner = "client!wd", name = "Pc", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1734 = Static33.method650("This computers address has been blocked");

	@OriginalMember(owner = "client!wd", name = "Tc", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1735 = Static33.method650("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!wd", name = "Yc", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1736 = aClass56_1735;

	@OriginalMember(owner = "client!wd", name = "Zc", descriptor = "I")
	public static int anInt3209 = 0;

	@OriginalMember(owner = "client!wd", name = "ad", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1737 = aClass56_1734;

	@OriginalMember(owner = "client!wd", name = "fd", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1738 = Static33.method650("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!wd", name = "gd", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1739 = Static33.method650("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!oa;ILclient!oa;Lclient!tb;)[Lclient!id;")
	public static Class3_Sub1_Sub1_Sub2[] method2037(@OriginalArg(0) Class56 arg0, @OriginalArg(2) Class56 arg1, @OriginalArg(3) Class44 arg2) {
		@Pc(4) int local4 = arg2.method1148(arg1);
		@Pc(10) int local10 = arg2.method1136(arg0, local4);
		return Static14.method249(arg2, local4, local10);
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)Lclient!na;")
	public static Class3_Sub1_Sub9 method2038(@OriginalArg(1) int arg0) {
		@Pc(6) Class3_Sub1_Sub9 local6 = (Class3_Sub1_Sub9) Static125.aClass52_58.method1342((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static110.aClass44_61.method1146(3, arg0);
		local6 = new Class3_Sub1_Sub9();
		if (local20 != null) {
			local6.method1362(new Class3_Sub2(local20));
		}
		Static125.aClass52_58.method1344(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "(I)V")
	public static void method2039() {
		for (@Pc(3) int local3 = 0; local3 < Static60.anInt1776; local3++) {
			@Pc(14) int local14 = Static79.anIntArray186[local3];
			@Pc(18) Class3_Sub1_Sub2_Sub4_Sub1 local18 = Static29.aClass3_Sub1_Sub2_Sub4_Sub1Array1[local14];
			@Pc(22) int local22 = Static31.aClass3_Sub2_Sub1_3.method270();
			if ((local22 & 0x40) != 0) {
				local22 += Static31.aClass3_Sub2_Sub1_3.method270() << 8;
			}
			Static119.method1930(local14, local18, local22);
		}
	}

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "(I)V")
	public static void method2040() {
		Static116.aByteArrayArray10 = null;
		Static47.anIntArray96 = null;
		Static51.anIntArray103 = null;
		Static69.anIntArray161 = null;
		Static76.anIntArray179 = null;
		Static69.anIntArray163 = null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BII[B)Lclient!oa;")
	public static Class56 method2041(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(17) Class56 local17 = new Class56();
		local17.aByteArray29 = new byte[arg0];
		local17.anInt2171 = 0;
		for (@Pc(26) int local26 = arg1; local26 < arg1 + arg0; local26++) {
			if (arg2[local26] != 0) {
				local17.aByteArray29[local17.anInt2171++] = arg2[local26];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(Z)V")
	public static void method2042() {
		if (Static86.anInt2355 == 2) {
			Static109.method1144(Static108.anInt2715 * 2, (Static68.anInt1869 - Static57.anInt1618 << 7) + Static79.anInt2102, Static62.anInt1803 + (-Static18.anInt497 + Static75.anInt2024 << 7));
			if (Static94.anInt2473 > -1 && Static98.anInt2566 % 20 < 10) {
				Static102.aClass3_Sub1_Sub1_Sub2Array65[0].method967(Static94.anInt2473 - 12, Static49.anInt1492 + -28);
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "(B)V")
	public static void method2043() {
		Static45.aClass52_27.method1346();
	}

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "(B)V")
	public static void method2044() {
		aClass30_18 = null;
		aClass56_1735 = null;
		aClass56_1736 = null;
		aClass56_1734 = null;
		aClass56_1738 = null;
		aClass56_1732 = null;
		aClass56_1737 = null;
		aClass56_1733 = null;
		aClass56_1739 = null;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(Z)V")
	public static void method2045() {
		Static70.aClass37_9 = new Class37();
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(Z)V")
	public static void method2046() {
		try {
			if (Static30.aClass46_1 == null) {
				Static30.aClass46_1 = new Class46(Static8.aClass43_1, Static84.method1524(new Class56[] { Static111.aClass56_1549, Static122.aClass56_1642, Static98.aClass56_1403 }).method1444());
			} else {
				@Pc(32) byte[] local32 = Static30.aClass46_1.method1205();
				if (local32 != null) {
					@Pc(39) Class3_Sub2 local39 = new Class3_Sub2(local32);
					Static124.anInt3085 = local39.method276();
					Static16.aClass75Array1 = new Class75[Static124.anInt3085];
					for (@Pc(48) int local48 = 0; local48 < Static124.anInt3085; local48++) {
						@Pc(58) Class75 local58 = Static16.aClass75Array1[local48] = new Class75();
						@Pc(62) int local62 = local39.method276();
						local58.anInt2973 = local62 & 0x7FFF;
						local58.aBoolean161 = (local62 & 0x8000) != 0;
						local58.aClass56_1619 = local39.method301();
						local58.anInt2975 = local39.method315();
						local58.anInt2969 = local48;
						local58.anInt2970 = Static13.method243(local58.aClass56_1619);
					}
					Static32.method646(Static84.anIntArray193, Static83.anIntArray191, 0, Static16.aClass75Array1.length - 1, Static16.aClass75Array1);
					Static29.aBoolean46 = true;
					Static30.aClass46_1 = null;
				}
			}
		} catch (@Pc(122) Exception local122) {
			Static30.aClass46_1 = null;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!tb;Lclient!tb;I)V")
	public static void method2047(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class44 arg1) {
		Static117.aClass44_65 = arg1;
		Static23.aClass44_13 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "(I)V")
	public static void method2049() {
		if (Static77.aBoolean169 && Static94.anInt2470 != Static14.anInt326) {
			Static105.method1753(Static79.anInt2110, Static94.anInt2470, Static116.anInt2950, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0], Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0]);
		} else if (Static93.anInt2441 != Static94.anInt2470) {
			Static93.anInt2441 = Static94.anInt2470;
			Static96.method1687(Static94.anInt2470);
		}
	}
}
