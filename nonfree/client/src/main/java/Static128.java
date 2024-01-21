import java.awt.Graphics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
	public static int anInt3266;

	@OriginalMember(owner = "client!qd", name = "j", descriptor = "[Lclient!fb;")
	public static Class3_Sub2_Sub2_Sub4[] aClass3_Sub2_Sub2_Sub4Array6;

	@OriginalMember(owner = "client!qd", name = "s", descriptor = "Lclient!dd;")
	public static Class19 aClass19_5;

	@OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
	public static int anInt3275;

	@OriginalMember(owner = "client!qd", name = "x", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray36;

	@OriginalMember(owner = "client!qd", name = "l", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1074 = Static170.method3101("Malformed login packet)3");

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1071 = aClass28_1074;

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1072 = Static170.method3101(" )2> ");

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1073 = Static170.method3101("(Z");

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1075 = Static170.method3101("");

	@OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
	public static int anInt3274 = 0;

	@OriginalMember(owner = "client!qd", name = "u", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1076 = Static170.method3101("runes");

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!eh;IIB)V")
	public static void method2512(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class33 local8 = Static27.method739(arg0, arg2);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray4 != null) {
			@Pc(18) Class3_Sub6 local18 = new Class3_Sub6();
			local18.anObjectArray2 = local8.anObjectArray4;
			local18.aClass28_355 = arg1;
			local18.aClass33_3 = local8;
			local18.anInt1083 = arg3;
			Static163.method3014(local18);
		}
		@Pc(36) boolean local36 = true;
		if (local8.anInt1477 > 0) {
			local36 = Static62.method1463(local8);
		}
		if (!local36 || !Static78.method1812(Static4.method97(local8), arg3 - 1)) {
			return;
		}
		if (arg3 == 1) {
			Static51.aClass3_Sub8_Sub1_2.method1559(154);
			Static51.aClass3_Sub8_Sub1_2.method1547(arg0);
			Static51.aClass3_Sub8_Sub1_2.method1531(arg2);
		}
		if (arg3 == 2) {
			Static51.aClass3_Sub8_Sub1_2.method1559(147);
			Static51.aClass3_Sub8_Sub1_2.method1547(arg0);
			Static51.aClass3_Sub8_Sub1_2.method1531(arg2);
		}
		if (arg3 == 3) {
			Static51.aClass3_Sub8_Sub1_2.method1559(92);
			Static51.aClass3_Sub8_Sub1_2.method1547(arg0);
			Static51.aClass3_Sub8_Sub1_2.method1531(arg2);
		}
		if (arg3 == 4) {
			Static51.aClass3_Sub8_Sub1_2.method1559(216);
			Static51.aClass3_Sub8_Sub1_2.method1547(arg0);
			Static51.aClass3_Sub8_Sub1_2.method1531(arg2);
		}
		if (arg3 == 5) {
			Static51.aClass3_Sub8_Sub1_2.method1559(11);
			Static51.aClass3_Sub8_Sub1_2.method1547(arg0);
			Static51.aClass3_Sub8_Sub1_2.method1531(arg2);
		}
		if (arg3 == 6) {
			Static51.aClass3_Sub8_Sub1_2.method1559(130);
			Static51.aClass3_Sub8_Sub1_2.method1547(arg0);
			Static51.aClass3_Sub8_Sub1_2.method1531(arg2);
		}
		if (arg3 == 7) {
			Static51.aClass3_Sub8_Sub1_2.method1559(173);
			Static51.aClass3_Sub8_Sub1_2.method1547(arg0);
			Static51.aClass3_Sub8_Sub1_2.method1531(arg2);
		}
		if (arg3 == 8) {
			Static51.aClass3_Sub8_Sub1_2.method1559(77);
			Static51.aClass3_Sub8_Sub1_2.method1547(arg0);
			Static51.aClass3_Sub8_Sub1_2.method1531(arg2);
		}
		if (arg3 == 9) {
			Static51.aClass3_Sub8_Sub1_2.method1559(132);
			Static51.aClass3_Sub8_Sub1_2.method1547(arg0);
			Static51.aClass3_Sub8_Sub1_2.method1531(arg2);
		}
		if (arg3 == 10) {
			Static51.aClass3_Sub8_Sub1_2.method1559(64);
			Static51.aClass3_Sub8_Sub1_2.method1547(arg0);
			Static51.aClass3_Sub8_Sub1_2.method1531(arg2);
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!ig;ZI)V")
	public static void method2514(@OriginalArg(0) Class38 arg0, @OriginalArg(1) boolean arg1) {
		if (Static121.aClass38_2 != null) {
			try {
				Static121.aClass38_2.method1632();
			} catch (@Pc(12) Exception local12) {
			}
			Static121.aClass38_2 = null;
		}
		Static121.aClass38_2 = arg0;
		Static92.method3170(arg1);
		Static26.aClass3_Sub2_Sub6_1 = null;
		Static43.aClass3_Sub8_2 = null;
		Static172.aClass3_Sub8_4.anInt1948 = 0;
		Static23.anInt605 = 0;
		while (true) {
			@Pc(38) Class3_Sub2_Sub6 local38 = (Class3_Sub2_Sub6) Static34.aClass87_4.method3203();
			if (local38 == null) {
				while (true) {
					local38 = (Class3_Sub2_Sub6) Static47.aClass87_6.method3203();
					if (local38 == null) {
						if (Static117.aByte7 != 0) {
							try {
								@Pc(92) Class3_Sub8 local92 = new Class3_Sub8(4);
								local92.method1550(4);
								local92.method1550(Static117.aByte7);
								local92.method1531(0);
								Static121.aClass38_2.method1633(4, local92.aByteArray19);
							} catch (@Pc(115) IOException local115) {
								try {
									Static121.aClass38_2.method1632();
								} catch (@Pc(120) Exception local120) {
								}
								Static121.aClass38_2 = null;
								Static44.anInt3938++;
							}
						}
						Static163.anInt3953 = 0;
						Static50.aLong48 = Static176.method3161();
						return;
					}
					Static131.aClass88_2.method3204(local38);
					Static106.aClass87_9.method3200(local38.aLong144, local38);
					Static75.anInt2242++;
					Static131.anInt3324--;
				}
			}
			Static42.aClass87_5.method3200(local38.aLong144, local38);
			Static74.anInt2213++;
			Static61.anInt1844--;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BI)Lclient!eh;")
	public static Class28 method2515(@OriginalArg(1) int arg0) {
		@Pc(7) Class28 local7 = new Class28();
		local7.anInt1118 = 0;
		local7.aByteArray15 = new byte[arg0];
		return local7;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "([Lclient!dg;IIIII[B)V")
	public static void method2516(@OriginalArg(0) Class21[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5) {
		@Pc(11) int local11;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
				for (local11 = 0; local11 < 64; local11++) {
					if (local7 + arg1 > 0 && arg1 + local7 < 103 && local11 + arg3 > 0 && arg3 + local11 < 103) {
						arg0[local3].anIntArrayArray12[local7 + arg1][local11 + arg3] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(86) Class3_Sub8 local86 = new Class3_Sub8(arg5);
		for (local11 = 0; local11 < 4; local11++) {
			for (@Pc(92) int local92 = 0; local92 < 64; local92++) {
				for (@Pc(96) int local96 = 0; local96 < 64; local96++) {
					Static178.method3188(local86, arg4, local96 + arg3, 0, arg2, local11, arg1 + local92);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
	public static void method2517() {
		aClass19_5 = null;
		aClass3_Sub2_Sub2_Sub4Array6 = null;
		aClass28_1075 = null;
		anIntArrayArrayArray36 = null;
		aClass28_1071 = null;
		aClass28_1074 = null;
		aClass28_1072 = null;
		aClass28_1073 = null;
		aClass28_1076 = null;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZZLclient!eh;)V")
	public static void method2519(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class28 arg1) {
		@Pc(18) int local18 = Static41.aClass3_Sub2_Sub2_Sub1_Sub1_1.method1785(arg1, 250);
		@Pc(25) int local25 = Static41.aClass3_Sub2_Sub2_Sub1_Sub1_1.method1799(arg1, 250) * 13;
		Static147.method1775(6, 6, local18 + 4 + 4, local25 - -4 + 4, 0);
		Static147.method1777(6, 6, local18 + 4 + 4, local25 + 4 + 4, 16777215);
		Static41.aClass3_Sub2_Sub2_Sub1_Sub1_1.method1810(arg1, 10, 10, local18, local25, 16777215, -1, 1, 1, 0);
		Static23.method618(6, local18 + 4 + 4, local25 + 8, 6);
		if (!arg0) {
			Static122.method2455(local18, local25, 10, 10);
			return;
		}
		try {
			@Pc(115) Graphics local115 = Static41.aCanvas1.getGraphics();
			Static68.aClass70_1.method2797(local115);
		} catch (@Pc(123) Exception local123) {
			Static41.aCanvas1.repaint();
		}
	}
}
