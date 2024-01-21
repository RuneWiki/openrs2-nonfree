import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!o", name = "b", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1158 = Static56.method972("Login");

	@OriginalMember(owner = "client!o", name = "c", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1159 = Static56.method972("Regelversto-8 melden");

	@OriginalMember(owner = "client!o", name = "u", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1167 = Static56.method972("Continue");

	@OriginalMember(owner = "client!o", name = "d", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1160 = aClass5_1167;

	@OriginalMember(owner = "client!o", name = "e", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1161 = aClass5_1158;

	@OriginalMember(owner = "client!o", name = "x", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1169 = Static56.method972("Existing user");

	@OriginalMember(owner = "client!o", name = "f", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1162 = aClass5_1169;

	@OriginalMember(owner = "client!o", name = "l", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1165 = Static56.method972("shake:");

	@OriginalMember(owner = "client!o", name = "g", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1163 = aClass5_1165;

	@OriginalMember(owner = "client!o", name = "i", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1164 = Static56.method972("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!o", name = "k", descriptor = "I")
	public static int anInt2556 = 0;

	@OriginalMember(owner = "client!o", name = "v", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1168 = Static56.method972("Off");

	@OriginalMember(owner = "client!o", name = "m", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1166 = aClass5_1168;

	@OriginalMember(owner = "client!o", name = "n", descriptor = "I")
	public static int anInt2557 = 0;

	@OriginalMember(owner = "client!o", name = "p", descriptor = "[I")
	public static int[] anIntArray298 = new int[128];

	@OriginalMember(owner = "client!o", name = "r", descriptor = "I")
	public static int anInt2560 = 0;

	@OriginalMember(owner = "client!o", name = "w", descriptor = "I")
	public static int anInt2563 = 0;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
	public static void method1689() {
		aClass5_1168 = null;
		aClass5_1161 = null;
		aClass5_1167 = null;
		aClass5_1158 = null;
		aClass5_1160 = null;
		aClass5_1169 = null;
		aClass5_1162 = null;
		anIntArray298 = null;
		aClass5_1166 = null;
		aClass5_1159 = null;
		aClass5_1165 = null;
		aClass5_1163 = null;
		aClass5_1164 = null;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "([Lclient!h;I[BBIII)V")
	public static void method1690(@OriginalArg(0) Class30[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 64; local11++) {
				for (local15 = 0; local15 < 64; local15++) {
					if (arg3 + local11 > 0 && local11 + arg3 < 103 && local15 + arg1 > 0 && local15 + arg1 < 103) {
						arg0[local7].anIntArrayArray9[arg3 + local11][arg1 + local15] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(90) Class3_Sub6 local90 = new Class3_Sub6(arg2);
		for (local15 = 0; local15 < 4; local15++) {
			for (@Pc(100) int local100 = 0; local100 < 64; local100++) {
				for (@Pc(104) int local104 = 0; local104 < 64; local104++) {
					Static82.method1308(local90, 0, arg5, local104 + arg1, arg4, local100 + arg3, local15);
				}
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V")
	public static void method1692(@OriginalArg(0) int arg0) {
		if (!Static79.method1278()) {
			return;
		}
		if (Static43.aBoolean60) {
			Static109.anInt2873 = arg0;
		} else {
			Static83.method1326(arg0);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
	public static void method1693() {
		for (@Pc(7) int local7 = 0; local7 < Static83.anInt2051; local7++) {
			@Pc(13) int local13 = Static78.anIntArray224[local7];
			@Pc(17) Class3_Sub1_Sub1_Sub1_Sub2 local17 = Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local13];
			@Pc(21) int local21 = Static75.aClass3_Sub6_Sub1_2.method1587();
			if ((local21 & 0x80) != 0) {
				local21 += Static75.aClass3_Sub6_Sub1_2.method1587() << 8;
			}
			Static94.method387(local17, local13, local21);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!bf;)V")
	public static void method1694(@OriginalArg(1) Class11 arg0) {
		Static43.aClass11_25 = arg0;
		Static90.anInt2310 = Static43.aClass11_25.method1875(16);
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V")
	public static void method1697() {
		try {
			@Pc(2) Graphics local2 = Static62.aCanvas1.getGraphics();
			Static32.aClass2_5.method1322(local2, 4, 4);
		} catch (@Pc(15) Exception local15) {
			Static62.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!o", name = "d", descriptor = "(B)V")
	public static void method1698() {
		Static78.method1270(0, false, null);
	}
}
