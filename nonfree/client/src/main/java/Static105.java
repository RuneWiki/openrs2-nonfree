import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "Ljava/awt/Graphics;")
	public static Graphics aGraphics2;

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
	public static int anInt2782;

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "Lclient!oa;")
	public static Class9 aClass9_27;

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
	public static int anInt2787;

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
	public static int anInt2783 = 0;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "Lclient!lc;")
	public static Class31 aClass31_948 = Static56.method1206("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "Z")
	public static boolean aBoolean154 = false;

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "Lclient!lc;")
	public static Class31 aClass31_949 = Static56.method1206("invback");

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "Lclient!lc;")
	public static Class31 aClass31_950 = Static56.method1206(" @yel@");

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "Lclient!lc;")
	public static Class31 aClass31_951 = Static56.method1206("p12_full");

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "Lclient!lc;")
	public static Class31 aClass31_952 = Static56.method1206("Enter message to send to ");

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "Lclient!lc;")
	public static Class31 aClass31_953 = Static56.method1206("(U4");

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/awt/Component;ILclient!kc;Lclient!kc;)V")
	public static void method1743(@OriginalArg(0) Component arg0, @OriginalArg(2) Class11 arg1, @OriginalArg(3) Class11 arg2) {
		if (Static8.aBoolean27) {
			return;
		}
		Static9.aClass9_2 = Static44.method1061(arg0, 265, 128);
		Static81.method1647();
		Static95.aClass9_26 = Static44.method1061(arg0, 265, 128);
		Static81.method1647();
		Static44.aClass9_13 = Static44.method1061(arg0, 171, 509);
		Static81.method1647();
		Static54.aClass9_14 = Static44.method1061(arg0, 132, 360);
		Static81.method1647();
		Static19.aClass9_8 = Static44.method1061(arg0, 200, 360);
		Static81.method1647();
		aClass9_27 = Static44.method1061(arg0, 238, 202);
		Static81.method1647();
		Static14.aClass9_7 = Static44.method1061(arg0, 238, 203);
		Static81.method1647();
		Static76.aClass9_21 = Static44.method1061(arg0, 94, 74);
		Static81.method1647();
		Static65.aClass9_17 = Static44.method1061(arg0, 94, 75);
		Static81.method1647();
		@Pc(77) byte[] local77 = arg1.method333(Static58.aClass31_688, Static7.aClass31_104);
		@Pc(83) Class2_Sub1_Sub3_Sub2 local83 = new Class2_Sub1_Sub3_Sub2(local77, arg0);
		Static9.aClass9_2.method861();
		local83.method468(0, 0);
		Static95.aClass9_26.method861();
		local83.method468(-637, 0);
		Static44.aClass9_13.method861();
		local83.method468(-128, 0);
		Static54.aClass9_14.method861();
		local83.method468(-202, -371);
		Static19.aClass9_8.method861();
		local83.method468(-202, -171);
		aClass9_27.method861();
		local83.method468(0, -265);
		Static14.aClass9_7.method861();
		local83.method468(-562, -265);
		Static76.aClass9_21.method861();
		local83.method468(-128, -171);
		Static65.aClass9_17.method861();
		local83.method468(-562, -171);
		@Pc(156) int[] local156 = new int[local83.anInt690];
		@Pc(162) int local162;
		@Pc(189) int local189;
		for (@Pc(158) int local158 = 0; local158 < local83.anInt686; local158++) {
			for (local162 = 0; local162 < local83.anInt690; local162++) {
				local156[local162] = local83.anIntArray89[local158 * local83.anInt690 + local83.anInt690 - local162 - 1];
			}
			for (local189 = 0; local189 < local83.anInt690; local189++) {
				local83.anIntArray89[local189 + local83.anInt690 * local158] = local156[local189];
			}
		}
		Static9.aClass9_2.method861();
		local83.method468(382, 0);
		Static95.aClass9_26.method861();
		local83.method468(-255, 0);
		Static44.aClass9_13.method861();
		local83.method468(254, 0);
		Static54.aClass9_14.method861();
		local83.method468(180, -371);
		Static19.aClass9_8.method861();
		local83.method468(180, -171);
		aClass9_27.method861();
		local83.method468(382, -265);
		Static14.aClass9_7.method861();
		local83.method468(-180, -265);
		Static76.aClass9_21.method861();
		local83.method468(254, -171);
		Static65.aClass9_17.method861();
		local83.method468(-180, -171);
		local83 = Static45.method1065(arg2, Static58.aClass31_685, Static58.aClass31_688);
		Static44.aClass9_13.method861();
		local83.method469(254 - local83.anInt690 / 2, 18);
		Static99.aClass2_Sub1_Sub3_Sub1_19 = Static8.method198(Static88.aClass31_818, arg2, Static58.aClass31_688);
		Static16.aClass2_Sub1_Sub3_Sub1_5 = Static8.method198(Static91.aClass31_855, arg2, Static58.aClass31_688);
		Static82.aClass2_Sub1_Sub3_Sub1Array4 = Static50.method337(Static58.aClass31_688, Static83.aClass31_807, arg2);
		Static64.aClass2_Sub1_Sub3_Sub2_2 = new Class2_Sub1_Sub3_Sub2(128, 265);
		Static69.aClass2_Sub1_Sub3_Sub2_6 = new Class2_Sub1_Sub3_Sub2(128, 265);
		for (local162 = 0; local162 < 33920; local162++) {
			Static64.aClass2_Sub1_Sub3_Sub2_2.anIntArray89[local162] = Static9.aClass9_2.anIntArray169[local162];
		}
		for (local189 = 0; local189 < 33920; local189++) {
			Static69.aClass2_Sub1_Sub3_Sub2_6.anIntArray89[local189] = Static95.aClass9_26.anIntArray169[local189];
		}
		Static12.anIntArray77 = new int[256];
		for (@Pc(373) int local373 = 0; local373 < 64; local373++) {
			Static12.anIntArray77[local373] = local373 * 262144;
		}
		for (@Pc(389) int local389 = 0; local389 < 64; local389++) {
			Static12.anIntArray77[local389 + 64] = local389 * 1024 + 16711680;
		}
		for (@Pc(409) int local409 = 0; local409 < 64; local409++) {
			Static12.anIntArray77[local409 + 128] = local409 * 4 + 16776960;
		}
		for (@Pc(427) int local427 = 0; local427 < 64; local427++) {
			Static12.anIntArray77[local427 + 192] = 16777215;
		}
		Static41.anIntArray242 = new int[256];
		for (@Pc(444) int local444 = 0; local444 < 64; local444++) {
			Static41.anIntArray242[local444] = local444 * 1024;
		}
		for (@Pc(458) int local458 = 0; local458 < 64; local458++) {
			Static41.anIntArray242[local458 + 64] = local458 * 4 + 65280;
		}
		for (@Pc(477) int local477 = 0; local477 < 64; local477++) {
			Static41.anIntArray242[local477 + 128] = local477 * 262144 + 65535;
		}
		for (@Pc(495) int local495 = 0; local495 < 64; local495++) {
			Static41.anIntArray242[local495 + 192] = 16777215;
		}
		Static98.anIntArray144 = new int[256];
		for (@Pc(512) int local512 = 0; local512 < 64; local512++) {
			Static98.anIntArray144[local512] = local512 * 4;
		}
		for (@Pc(526) int local526 = 0; local526 < 64; local526++) {
			Static98.anIntArray144[local526 + 64] = local526 * 262144 + 255;
		}
		for (@Pc(546) int local546 = 0; local546 < 64; local546++) {
			Static98.anIntArray144[local546 + 128] = local546 * 1024 + 16711935;
		}
		for (@Pc(564) int local564 = 0; local564 < 64; local564++) {
			Static98.anIntArray144[local564 + 192] = 16777215;
		}
		Static78.anIntArray320 = new int[32768];
		Static82.anIntArray326 = new int[256];
		Static4.anIntArray20 = new int[32768];
		Static63.method1323(null);
		Static58.aClass31_687 = Static58.aClass31_688;
		Static58.aClass31_690 = Static58.aClass31_688;
		Static92.anIntArray241 = new int[32768];
		Static64.anInt607 = 0;
		Static25.anIntArray122 = new int[32768];
		if (Static88.anInt2370 != 0) {
			Static79.method1442(Static88.anInt2370, Static21.aClass11_Sub1_7, Static87.aClass31_815, Static58.aClass31_688);
		}
		Static55.aClass30_2.method1164(false);
		Static8.aBoolean27 = true;
		Static49.aBoolean143 = true;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BII)V")
	public static void method1744(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < 100; local9++) {
			if (Static28.aClass31Array6[local9] != null) {
				@Pc(27) int local27 = Static59.anIntArray286[local9];
				@Pc(38) int local38 = Static38.anInt1428 + 70 + 4 - local7 * 14;
				if (local38 < -20) {
					break;
				}
				if (local27 == 0) {
					local7++;
				}
				@Pc(50) Class31 local50 = Static8.aClass31Array5[local9];
				if (local50 != null && local50.method1226(Static38.aClass31_518)) {
					local50 = local50.method1222(5);
				}
				if (local50 != null && local50.method1226(Static7.aClass31_102)) {
					local50 = local50.method1222(5);
				}
				if ((local27 == 1 || local27 == 2) && (local27 == 1 || Static78.anInt2283 == 0 || Static78.anInt2283 == 1 && Static59.method1282(local50))) {
					if (local38 - 14 < arg1 && arg1 <= local38 && !local50.method1199(Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.aClass31_612)) {
						if (Static67.anInt2204 >= 1) {
							Static17.method523(0, Static37.method974(new Class31[] { Static57.aClass31_928, local50 }), 11, 0, 0);
						}
						Static17.method523(0, Static37.method974(new Class31[] { Static48.aClass31_618, local50 }), 10, 0, 0);
						Static17.method523(0, Static37.method974(new Class31[] { Static13.aClass31_186, local50 }), 9, 0, 0);
					}
					local7++;
				}
				if ((local27 == 3 || local27 == 7) && Static100.anInt2732 == 0 && (local27 == 7 || Static12.anInt527 == 0 || Static12.anInt527 == 1 && Static59.method1282(local50))) {
					local7++;
					if (local38 - 14 < arg1 && arg1 <= local38) {
						if (Static67.anInt2204 >= 1) {
							Static17.method523(0, Static37.method974(new Class31[] { Static57.aClass31_928, local50 }), 11, 0, 0);
						}
						Static17.method523(0, Static37.method974(new Class31[] { Static48.aClass31_618, local50 }), 10, 0, 0);
						Static17.method523(0, Static37.method974(new Class31[] { Static13.aClass31_186, local50 }), 9, 0, 0);
					}
				}
				if (local27 == 4 && (Static92.anInt1560 == 0 || Static92.anInt1560 == 1 && Static59.method1282(local50))) {
					if (arg1 > local38 - 14 && local38 >= arg1) {
						Static17.method523(0, Static37.method974(new Class31[] { Static56.aClass31_665, local50 }), 2, 0, 0);
					}
					local7++;
				}
				if ((local27 == 5 || local27 == 6) && Static100.anInt2732 == 0 && Static12.anInt527 < 2) {
					local7++;
				}
				if (local27 == 8 && (Static92.anInt1560 == 0 || Static92.anInt1560 == 1 && Static59.method1282(local50))) {
					if (arg1 > local38 - 14 && arg1 <= local38) {
						Static17.method523(0, Static37.method974(new Class31[] { Static30.aClass31_427, local50 }), 25, 0, 0);
					}
					local7++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IBI)I")
	public static int method1745(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(42) int local42 = Static50.method331(arg1 - 1, arg0 - 1) + Static50.method331(arg1 + 1, arg0 + -1) + Static50.method331(arg1 - 1, arg0 + 1) + Static50.method331(arg1 - -1, arg0 + 1);
		@Pc(80) int local80 = Static50.method331(arg1 - 1, arg0) + Static50.method331(arg1 + 1, arg0) + Static50.method331(arg1, arg0 - 1) + Static50.method331(arg1, arg0 + 1);
		@Pc(85) int local85 = Static50.method331(arg1, arg0);
		return local85 / 4 + local80 / 8 + local42 / 16;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!kc;B)V")
	public static void method1746(@OriginalArg(0) Class11 arg0) {
		Static87.aClass11_18 = arg0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
	public static void method1747() {
		aClass31_949 = null;
		aClass9_27 = null;
		aGraphics2 = null;
		aClass31_948 = null;
		aClass31_951 = null;
		aClass31_950 = null;
		aClass31_952 = null;
		aClass31_953 = null;
	}
}
