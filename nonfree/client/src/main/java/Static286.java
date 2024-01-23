import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!uo", name = "A", descriptor = "Lclient!ho;")
	public static Class3_Sub4_Sub12 aClass3_Sub4_Sub12_9;

	@OriginalMember(owner = "client!uo", name = "o", descriptor = "Lclient!lc;")
	public static Interface5 anInterface5_2 = null;

	@OriginalMember(owner = "client!uo", name = "r", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray37 = new String[200];

	@OriginalMember(owner = "client!uo", name = "t", descriptor = "[I")
	public static int[] anIntArray569 = new int[2];

	@OriginalMember(owner = "client!uo", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString205 = null;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!ph;B)V")
	public static void method4484(@OriginalArg(0) Class3_Sub15 arg0) {
		arg0.aBoolean386 = false;
		if (arg0.aClass3_Sub11_5 != null) {
			arg0.aClass3_Sub11_5.anInt4382 = 0;
		}
		for (@Pc(19) Class3_Sub15 local19 = arg0.method4559(); local19 != null; local19 = arg0.method4563()) {
			method4484(local19);
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIII)V")
	public static void method4485(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(4) Class3_Sub4_Sub7 local4 = Static34.method528(arg2, 11);
		local4.method971();
		local4.anInt1140 = arg0;
		local4.anInt1132 = arg1;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZI)V")
	public static void method4486(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(12) int local12 = Static56.anIntArray99[arg0];
		@Pc(16) int local16 = Static196.anIntArray438[arg0];
		@Pc(20) int local20 = Static259.aShortArray87[arg0];
		if (local20 >= 2000) {
			local20 -= 2000;
		}
		@Pc(30) long local30 = Static259.aLongArray12[arg0];
		@Pc(35) int local35 = (int) Static259.aLongArray12[arg0];
		@Pc(45) Class10_Sub5_Sub2 local45;
		if (local20 == 6) {
			local45 = Static110.aClass10_Sub5_Sub2Array1[local35];
			if (local45 != null) {
				Static313.anInt6126 = Static293.anInt5844;
				Static83.anInt1554 = 2;
				Static54.anInt1012 = Static7.anInt169;
				Static57.anInt1081 = 0;
				Static215.aClass3_Sub26_Sub1_2.method3958(231);
				Static215.aClass3_Sub26_Sub1_2.method3907(Static95.aBooleanArray39[82] ? 1 : 0);
				Static215.aClass3_Sub26_Sub1_2.method3892(local35);
				Static79.method1663(Static136.aClass10_Sub5_Sub1_1.anIntArray537[0], 0, 0, local45.method4186(), Static136.aClass10_Sub5_Sub1_1.anIntArray535[0], local12, 0, local45.method4186(), local16);
			}
		}
		@Pc(107) Class10_Sub5_Sub1 local107;
		if (local20 == 50) {
			local107 = Static52.aClass10_Sub5_Sub1Array1[local35];
			if (local107 != null) {
				Static313.anInt6126 = Static293.anInt5844;
				Static83.anInt1554 = 2;
				Static54.anInt1012 = Static7.anInt169;
				Static57.anInt1081 = 0;
				Static215.aClass3_Sub26_Sub1_2.method3958(180);
				Static215.aClass3_Sub26_Sub1_2.method3897(local35);
				Static215.aClass3_Sub26_Sub1_2.method3919(Static95.aBooleanArray39[82] ? 1 : 0);
				Static79.method1663(Static136.aClass10_Sub5_Sub1_1.anIntArray537[0], 0, 0, local107.method4186(), Static136.aClass10_Sub5_Sub1_1.anIntArray535[0], local12, 0, local107.method4186(), local16);
			}
		}
		if (local20 == 34) {
			Static83.anInt1554 = 2;
			Static57.anInt1081 = 0;
			Static54.anInt1012 = Static7.anInt169;
			Static313.anInt6126 = Static293.anInt5844;
			Static215.aClass3_Sub26_Sub1_2.method3958(117);
			Static215.aClass3_Sub26_Sub1_2.method3949(Static265.anInt5507);
			Static215.aClass3_Sub26_Sub1_2.method3940(Static244.anInt4948);
			Static215.aClass3_Sub26_Sub1_2.method3919(Static95.aBooleanArray39[82] ? 1 : 0);
			Static215.aClass3_Sub26_Sub1_2.method3940(Static101.anInt1844 + local12);
			Static215.aClass3_Sub26_Sub1_2.method3938(Static17.anInt332);
			Static215.aClass3_Sub26_Sub1_2.method3938(local16 + Static43.anInt798);
			Static215.aClass3_Sub26_Sub1_2.method3940((int) (local30 >>> 32) & Integer.MAX_VALUE);
			Static53.method5032(local16, local12, local30);
		}
		if (local20 == 11) {
			Static117.method1916();
		}
		if (local20 == 25) {
			Static54.anInt1012 = Static7.anInt169;
			Static57.anInt1081 = 0;
			Static313.anInt6126 = Static293.anInt5844;
			Static83.anInt1554 = 2;
			Static215.aClass3_Sub26_Sub1_2.method3958(46);
			Static215.aClass3_Sub26_Sub1_2.method3897(local35);
			Static215.aClass3_Sub26_Sub1_2.method3938(local12 + Static101.anInt1844);
			Static215.aClass3_Sub26_Sub1_2.method3919(Static95.aBooleanArray39[82] ? 1 : 0);
			Static215.aClass3_Sub26_Sub1_2.method3897(local16 + Static43.anInt798);
			Static79.method1663(Static136.aClass10_Sub5_Sub1_1.anIntArray537[0], 0, 0, 0, Static136.aClass10_Sub5_Sub1_1.anIntArray535[0], local12, 0, 0, local16);
		}
		if (local20 == 39) {
			Static57.anInt1081 = 0;
			Static313.anInt6126 = Static293.anInt5844;
			Static83.anInt1554 = 2;
			Static54.anInt1012 = Static7.anInt169;
			Static215.aClass3_Sub26_Sub1_2.method3958(154);
			Static215.aClass3_Sub26_Sub1_2.method3897(local35);
			Static215.aClass3_Sub26_Sub1_2.method3886(Static63.anInt1200);
			Static215.aClass3_Sub26_Sub1_2.method3897(Static296.anInt5869);
			Static215.aClass3_Sub26_Sub1_2.method3897(Static101.anInt1844 + local12);
			Static215.aClass3_Sub26_Sub1_2.method3892(Static43.anInt798 + local16);
			Static215.aClass3_Sub26_Sub1_2.method3912(Static95.aBooleanArray39[82] ? 1 : 0);
			Static79.method1663(Static136.aClass10_Sub5_Sub1_1.anIntArray537[0], 0, 0, 0, Static136.aClass10_Sub5_Sub1_1.anIntArray535[0], local12, 0, 0, local16);
		}
		if (local20 == 37) {
			local45 = Static110.aClass10_Sub5_Sub2Array1[local35];
			if (local45 != null) {
				Static57.anInt1081 = 0;
				Static313.anInt6126 = Static293.anInt5844;
				Static54.anInt1012 = Static7.anInt169;
				Static83.anInt1554 = 2;
				Static215.aClass3_Sub26_Sub1_2.method3958(123);
				Static215.aClass3_Sub26_Sub1_2.method3928(Static95.aBooleanArray39[82] ? 1 : 0);
				Static215.aClass3_Sub26_Sub1_2.method3938(local35);
				Static215.aClass3_Sub26_Sub1_2.method3897(Static296.anInt5869);
				Static215.aClass3_Sub26_Sub1_2.method3886(Static63.anInt1200);
				Static79.method1663(Static136.aClass10_Sub5_Sub1_1.anIntArray537[0], 0, 0, local45.method4186(), Static136.aClass10_Sub5_Sub1_1.anIntArray535[0], local12, 0, local45.method4186(), local16);
			}
		}
		if (local20 == 28) {
			Static83.anInt1554 = 2;
			Static313.anInt6126 = Static293.anInt5844;
			Static54.anInt1012 = Static7.anInt169;
			Static57.anInt1081 = 0;
			Static215.aClass3_Sub26_Sub1_2.method3958(152);
			Static215.aClass3_Sub26_Sub1_2.method3897(Static101.anInt1844 + local12);
			Static215.aClass3_Sub26_Sub1_2.method3892(Static43.anInt798 + local16);
			Static215.aClass3_Sub26_Sub1_2.method3919(Static95.aBooleanArray39[82] ? 1 : 0);
			Static215.aClass3_Sub26_Sub1_2.method3938(Integer.MAX_VALUE & (int) (local30 >>> 32));
			Static53.method5032(local16, local12, local30);
		}
		if (local20 == 44) {
			local107 = Static52.aClass10_Sub5_Sub1Array1[local35];
			if (local107 != null) {
				Static313.anInt6126 = Static293.anInt5844;
				Static57.anInt1081 = 0;
				Static54.anInt1012 = Static7.anInt169;
				Static83.anInt1554 = 2;
				Static215.aClass3_Sub26_Sub1_2.method3958(115);
				Static215.aClass3_Sub26_Sub1_2.method3919(Static95.aBooleanArray39[82] ? 1 : 0);
				Static215.aClass3_Sub26_Sub1_2.method3940(local35);
				Static79.method1663(Static136.aClass10_Sub5_Sub1_1.anIntArray537[0], 0, 0, local107.method4186(), Static136.aClass10_Sub5_Sub1_1.anIntArray535[0], local12, 0, local107.method4186(), local16);
			}
		}
		if (local20 == 41) {
			Static313.anInt6126 = Static293.anInt5844;
			Static57.anInt1081 = 0;
			Static54.anInt1012 = Static7.anInt169;
			Static83.anInt1554 = 2;
			Static215.aClass3_Sub26_Sub1_2.method3958(218);
			Static215.aClass3_Sub26_Sub1_2.method3938(Static101.anInt1844 + local12);
			Static215.aClass3_Sub26_Sub1_2.method3928(Static95.aBooleanArray39[82] ? 1 : 0);
			Static215.aClass3_Sub26_Sub1_2.method3938(local16 + Static43.anInt798);
			Static215.aClass3_Sub26_Sub1_2.method3892(Integer.MAX_VALUE & (int) (local30 >>> 32));
			Static53.method5032(local16, local12, local30);
		}
		if (local20 == 1) {
			local45 = Static110.aClass10_Sub5_Sub2Array1[local35];
			if (local45 != null) {
				Static313.anInt6126 = Static293.anInt5844;
				Static83.anInt1554 = 2;
				Static57.anInt1081 = 0;
				Static54.anInt1012 = Static7.anInt169;
				Static215.aClass3_Sub26_Sub1_2.method3958(239);
				Static215.aClass3_Sub26_Sub1_2.method3924(Static265.anInt5507);
				Static215.aClass3_Sub26_Sub1_2.method3912(Static95.aBooleanArray39[82] ? 1 : 0);
				Static215.aClass3_Sub26_Sub1_2.method3892(Static244.anInt4948);
				Static215.aClass3_Sub26_Sub1_2.method3940(Static17.anInt332);
				Static215.aClass3_Sub26_Sub1_2.method3938(local35);
				Static79.method1663(Static136.aClass10_Sub5_Sub1_1.anIntArray537[0], 0, 0, local45.method4186(), Static136.aClass10_Sub5_Sub1_1.anIntArray535[0], local12, 0, local45.method4186(), local16);
			}
		}
		if (local20 == 47) {
			Static215.aClass3_Sub26_Sub1_2.method3958(33);
			Static215.aClass3_Sub26_Sub1_2.method3938(local12);
			Static215.aClass3_Sub26_Sub1_2.method3940(local35);
			Static215.aClass3_Sub26_Sub1_2.method3949(local16);
			Static269.anInt5496 = 0;
			Static204.aClass151_11 = Static243.method4115(local16);
			Static225.anInt4367 = local12;
		}
		if (local20 == 1008 || local20 == 1004 || local20 == 1002 || local20 == 1003 || local20 == 1005) {
			Static161.method2655(local12, local20, local35);
		}
		if (local20 == 14) {
			local107 = Static52.aClass10_Sub5_Sub1Array1[local35];
			if (local107 != null) {
				Static313.anInt6126 = Static293.anInt5844;
				Static57.anInt1081 = 0;
				Static83.anInt1554 = 2;
				Static54.anInt1012 = Static7.anInt169;
				Static215.aClass3_Sub26_Sub1_2.method3958(169);
				Static215.aClass3_Sub26_Sub1_2.method3940(Static296.anInt5869);
				Static215.aClass3_Sub26_Sub1_2.method3944(Static63.anInt1200);
				Static215.aClass3_Sub26_Sub1_2.method3912(Static95.aBooleanArray39[82] ? 1 : 0);
				Static215.aClass3_Sub26_Sub1_2.method3938(local35);
				Static79.method1663(Static136.aClass10_Sub5_Sub1_1.anIntArray537[0], 0, 0, local107.method4186(), Static136.aClass10_Sub5_Sub1_1.anIntArray535[0], local12, 0, local107.method4186(), local16);
			}
		}
		if (local20 == 49) {
			if (local35 == 0) {
				Static44.method669(Static99.anInt1826, local12, local16);
			} else if (local35 == 1) {
				if (Static296.anInt5879 > 0 && Static95.aBooleanArray39[82] && Static95.aBooleanArray39[81]) {
					Static268.method4448(Static99.anInt1826, Static43.anInt798 + local16, local12 + Static101.anInt1844);
				} else {
					Static130.method2207(local16, 1, local12);
					Static215.aClass3_Sub26_Sub1_2.method3907(Static235.anInt4698);
					Static215.aClass3_Sub26_Sub1_2.method3907(Static130.anInt2466);
					Static215.aClass3_Sub26_Sub1_2.method3938((int) Static84.aFloat21);
					Static215.aClass3_Sub26_Sub1_2.method3907(57);
					if (Static25.anInt467 == 4) {
						Static215.aClass3_Sub26_Sub1_2.method3907(0);
						Static215.aClass3_Sub26_Sub1_2.method3907(0);
					} else {
						Static215.aClass3_Sub26_Sub1_2.method3907(Static241.anInt4889);
						Static215.aClass3_Sub26_Sub1_2.method3907(Static125.anInt2421);
					}
					Static215.aClass3_Sub26_Sub1_2.method3907(89);
					Static215.aClass3_Sub26_Sub1_2.method3938(Static136.aClass10_Sub5_Sub1_1.anInt5073);
					Static215.aClass3_Sub26_Sub1_2.method3938(Static136.aClass10_Sub5_Sub1_1.anInt5016);
					Static215.aClass3_Sub26_Sub1_2.method3907(Static195.anInt3816);
					Static215.aClass3_Sub26_Sub1_2.method3907(63);
					Static79.method1663(Static136.aClass10_Sub5_Sub1_1.anIntArray537[0], 0, 0, 0, Static136.aClass10_Sub5_Sub1_1.anIntArray535[0], local12, 0, 0, local16);
				}
			}
		}
		if (local20 == 24) {
			Static215.aClass3_Sub26_Sub1_2.method3958(181);
			Static215.aClass3_Sub26_Sub1_2.method3938(local35);
			Static215.aClass3_Sub26_Sub1_2.method3892(local12);
			Static215.aClass3_Sub26_Sub1_2.method3924(local16);
			Static269.anInt5496 = 0;
			Static204.aClass151_11 = Static243.method4115(local16);
			Static225.anInt4367 = local12;
		}
		if (local20 == 2 || local20 == 1007) {
			Static270.method4465(local12, local16, local35, Static103.aStringArray19[arg0]);
		}
		if (local20 == 59) {
			local45 = Static110.aClass10_Sub5_Sub2Array1[local35];
			if (local45 != null) {
				Static57.anInt1081 = 0;
				Static313.anInt6126 = Static293.anInt5844;
				Static83.anInt1554 = 2;
				Static54.anInt1012 = Static7.anInt169;
				Static215.aClass3_Sub26_Sub1_2.method3958(63);
				Static215.aClass3_Sub26_Sub1_2.method3940(local35);
				Static215.aClass3_Sub26_Sub1_2.method3912(Static95.aBooleanArray39[82] ? 1 : 0);
				Static79.method1663(Static136.aClass10_Sub5_Sub1_1.anIntArray537[0], 0, 0, local45.method4186(), Static136.aClass10_Sub5_Sub1_1.anIntArray535[0], local12, 0, local45.method4186(), local16);
			}
		}
		if (local20 == 23) {
			Static83.anInt1554 = 2;
			Static313.anInt6126 = Static293.anInt5844;
			Static57.anInt1081 = 0;
			Static54.anInt1012 = Static7.anInt169;
			Static215.aClass3_Sub26_Sub1_2.method3958(183);
			Static215.aClass3_Sub26_Sub1_2.method3907(Static95.aBooleanArray39[82] ? 1 : 0);
			Static215.aClass3_Sub26_Sub1_2.method3940(Static101.anInt1844 + local12);
			Static215.aClass3_Sub26_Sub1_2.method3892(local35);
			Static215.aClass3_Sub26_Sub1_2.method3940(local16 + Static43.anInt798);
			Static79.method1663(Static136.aClass10_Sub5_Sub1_1.anIntArray537[0], 0, 0, 0, Static136.aClass10_Sub5_Sub1_1.anIntArray535[0], local12, 0, 0, local16);
		}
		if (local20 == 17) {
			local107 = Static52.aClass10_Sub5_Sub1Array1[local35];
			if (local107 != null) {
				Static57.anInt1081 = 0;
				Static313.anInt6126 = Static293.anInt5844;
				Static83.anInt1554 = 2;
				Static54.anInt1012 = Static7.anInt169;
				Static215.aClass3_Sub26_Sub1_2.method3958(140);
				Static215.aClass3_Sub26_Sub1_2.method3892(local35);
				Static215.aClass3_Sub26_Sub1_2.method3919(Static95.aBooleanArray39[82] ? 1 : 0);
				Static79.method1663(Static136.aClass10_Sub5_Sub1_1.anIntArray537[0], 0, 0, local107.method4186(), Static136.aClass10_Sub5_Sub1_1.anIntArray535[0], local12, 0, local107.method4186(), local16);
			}
		}
		if (local20 == 4) {
			Static57.anInt1081 = 0;
			Static54.anInt1012 = Static7.anInt169;
			Static83.anInt1554 = 2;
			Static313.anInt6126 = Static293.anInt5844;
			Static215.aClass3_Sub26_Sub1_2.method3958(174);
			Static215.aClass3_Sub26_Sub1_2.method3924(Static265.anInt5507);
			Static215.aClass3_Sub26_Sub1_2.method3940(Static244.anInt4948);
			Static215.aClass3_Sub26_Sub1_2.method3938(Static43.anInt798 + local16);
			Static215.aClass3_Sub26_Sub1_2.method3940(local12 + Static101.anInt1844);
			Static215.aClass3_Sub26_Sub1_2.method3938(local35);
			Static215.aClass3_Sub26_Sub1_2.method3907(Static95.aBooleanArray39[82] ? 1 : 0);
			Static215.aClass3_Sub26_Sub1_2.method3897(Static17.anInt332);
			Static79.method1663(Static136.aClass10_Sub5_Sub1_1.anIntArray537[0], 0, 0, 0, Static136.aClass10_Sub5_Sub1_1.anIntArray535[0], local12, 0, 0, local16);
		}
		if (local20 == 48) {
			local107 = Static52.aClass10_Sub5_Sub1Array1[local35];
			if (local107 != null) {
				Static313.anInt6126 = Static293.anInt5844;
				Static57.anInt1081 = 0;
				Static83.anInt1554 = 2;
				Static54.anInt1012 = Static7.anInt169;
				Static215.aClass3_Sub26_Sub1_2.method3958(229);
				Static215.aClass3_Sub26_Sub1_2.method3897(local35);
				Static215.aClass3_Sub26_Sub1_2.method3907(Static95.aBooleanArray39[82] ? 1 : 0);
				Static79.method1663(Static136.aClass10_Sub5_Sub1_1.anIntArray537[0], 0, 0, local107.method4186(), Static136.aClass10_Sub5_Sub1_1.anIntArray535[0], local12, 0, local107.method4186(), local16);
			}
		}
		if (local20 == 8) {
			local107 = Static52.aClass10_Sub5_Sub1Array1[local35];
			if (local107 != null) {
				Static83.anInt1554 = 2;
				Static54.anInt1012 = Static7.anInt169;
				Static313.anInt6126 = Static293.anInt5844;
				Static57.anInt1081 = 0;
				Static215.aClass3_Sub26_Sub1_2.method3958(32);
				Static215.aClass3_Sub26_Sub1_2.method3940(local35);
				Static215.aClass3_Sub26_Sub1_2.method3919(Static95.aBooleanArray39[82] ? 1 : 0);
				Static79.method1663(Static136.aClass10_Sub5_Sub1_1.anIntArray537[0], 0, 0, local107.method4186(), Static136.aClass10_Sub5_Sub1_1.anIntArray535[0], local12, 0, local107.method4186(), local16);
			}
		}
		if (local20 == 12) {
			Static215.aClass3_Sub26_Sub1_2.method3958(73);
			Static215.aClass3_Sub26_Sub1_2.method3897(local12);
			Static215.aClass3_Sub26_Sub1_2.method3944(local16);
			Static215.aClass3_Sub26_Sub1_2.method3938(local35);
			Static269.anInt5496 = 0;
			Static204.aClass151_11 = Static243.method4115(local16);
			Static225.anInt4367 = local12;
		}
		if (local20 == 22) {
			local107 = Static52.aClass10_Sub5_Sub1Array1[local35];
			if (local107 != null) {
				Static57.anInt1081 = 0;
				Static83.anInt1554 = 2;
				Static313.anInt6126 = Static293.anInt5844;
				Static54.anInt1012 = Static7.anInt169;
				Static215.aClass3_Sub26_Sub1_2.method3958(156);
				Static215.aClass3_Sub26_Sub1_2.method3949(Static265.anInt5507);
				Static215.aClass3_Sub26_Sub1_2.method3892(local35);
				Static215.aClass3_Sub26_Sub1_2.method3892(Static244.anInt4948);
				Static215.aClass3_Sub26_Sub1_2.method3892(Static17.anInt332);
				Static215.aClass3_Sub26_Sub1_2.method3919(Static95.aBooleanArray39[82] ? 1 : 0);
				Static79.method1663(Static136.aClass10_Sub5_Sub1_1.anIntArray537[0], 0, 0, local107.method4186(), Static136.aClass10_Sub5_Sub1_1.anIntArray535[0], local12, 0, local107.method4186(), local16);
			}
		}
		if (local20 == 10) {
			local45 = Static110.aClass10_Sub5_Sub2Array1[local35];
			if (local45 != null) {
				Static54.anInt1012 = Static7.anInt169;
				Static57.anInt1081 = 0;
				Static313.anInt6126 = Static293.anInt5844;
				Static83.anInt1554 = 2;
				Static215.aClass3_Sub26_Sub1_2.method3958(136);
				Static215.aClass3_Sub26_Sub1_2.method3892(local35);
				Static215.aClass3_Sub26_Sub1_2.method3928(Static95.aBooleanArray39[82] ? 1 : 0);
				Static79.method1663(Static136.aClass10_Sub5_Sub1_1.anIntArray537[0], 0, 0, local45.method4186(), Static136.aClass10_Sub5_Sub1_1.anIntArray535[0], local12, 0, local45.method4186(), local16);
			}
		}
		if (local20 == 58 && Static259.aClass151_18 == null) {
			Static297.method1845(local16, local12);
			Static259.aClass151_18 = Static114.method5019(local12, local16);
			Static134.method3639(Static259.aClass151_18);
		}
		if (local20 == 1012) {
			Static54.anInt1012 = Static7.anInt169;
			Static83.anInt1554 = 2;
			Static57.anInt1081 = 0;
			Static313.anInt6126 = Static293.anInt5844;
			Static215.aClass3_Sub26_Sub1_2.method3958(211);
			Static215.aClass3_Sub26_Sub1_2.method3940(local35);
		}
		if (local20 == 30) {
			local45 = Static110.aClass10_Sub5_Sub2Array1[local35];
			if (local45 != null) {
				Static57.anInt1081 = 0;
				Static313.anInt6126 = Static293.anInt5844;
				Static54.anInt1012 = Static7.anInt169;
				Static83.anInt1554 = 2;
				Static215.aClass3_Sub26_Sub1_2.method3958(84);
				Static215.aClass3_Sub26_Sub1_2.method3919(Static95.aBooleanArray39[82] ? 1 : 0);
				Static215.aClass3_Sub26_Sub1_2.method3897(local35);
				Static79.method1663(Static136.aClass10_Sub5_Sub1_1.anIntArray537[0], 0, 0, local45.method4186(), Static136.aClass10_Sub5_Sub1_1.anIntArray535[0], local12, 0, local45.method4186(), local16);
			}
		}
		@Pc(1765) int local1765;
		@Pc(1745) Class151 local1745;
		if (local20 == 42) {
			Static215.aClass3_Sub26_Sub1_2.method3958(131);
			Static215.aClass3_Sub26_Sub1_2.method3944(local16);
			local1745 = Static243.method4115(local16);
			if (local1745.anIntArrayArray66 != null && local1745.anIntArrayArray66[0][0] == 5) {
				local1765 = local1745.anIntArrayArray66[0][1];
				Static161.anIntArray347[local1765] = 1 - Static161.anIntArray347[local1765];
				Static15.method3529(local1765);
			}
		}
		if (local20 == 5) {
			Static83.anInt1554 = 2;
			Static57.anInt1081 = 0;
			Static54.anInt1012 = Static7.anInt169;
			Static313.anInt6126 = Static293.anInt5844;
			Static215.aClass3_Sub26_Sub1_2.method3958(150);
			Static215.aClass3_Sub26_Sub1_2.method3892(Static101.anInt1844 + local12);
			Static215.aClass3_Sub26_Sub1_2.method3928(Static95.aBooleanArray39[82] ? 1 : 0);
			Static215.aClass3_Sub26_Sub1_2.method3940(local35);
			Static215.aClass3_Sub26_Sub1_2.method3940(local16 + Static43.anInt798);
			Static79.method1663(Static136.aClass10_Sub5_Sub1_1.anIntArray537[0], 0, 0, 0, Static136.aClass10_Sub5_Sub1_1.anIntArray535[0], local12, 0, 0, local16);
		}
		if (local20 == 19) {
			Static215.aClass3_Sub26_Sub1_2.method3958(144);
			Static215.aClass3_Sub26_Sub1_2.method3886(local16);
			Static215.aClass3_Sub26_Sub1_2.method3892(Static296.anInt5869);
			Static215.aClass3_Sub26_Sub1_2.method3940(local12);
			Static215.aClass3_Sub26_Sub1_2.method3886(Static63.anInt1200);
			Static215.aClass3_Sub26_Sub1_2.method3938(local35);
			Static269.anInt5496 = 0;
			Static204.aClass151_11 = Static243.method4115(local16);
			Static225.anInt4367 = local12;
		}
		if (local20 == 18) {
			Static83.anInt1554 = 2;
			Static57.anInt1081 = 0;
			Static313.anInt6126 = Static293.anInt5844;
			Static54.anInt1012 = Static7.anInt169;
			Static215.aClass3_Sub26_Sub1_2.method3958(200);
			Static215.aClass3_Sub26_Sub1_2.method3928(Static95.aBooleanArray39[82] ? 1 : 0);
			Static215.aClass3_Sub26_Sub1_2.method3924(Static63.anInt1200);
			Static215.aClass3_Sub26_Sub1_2.method3892((int) (local30 >>> 32) & Integer.MAX_VALUE);
			Static215.aClass3_Sub26_Sub1_2.method3892(Static296.anInt5869);
			Static215.aClass3_Sub26_Sub1_2.method3938(local16 + Static43.anInt798);
			Static215.aClass3_Sub26_Sub1_2.method3897(Static101.anInt1844 + local12);
			Static53.method5032(local16, local12, local30);
		}
		if (local20 == 20) {
			local1745 = Static114.method5019(local12, local16);
			if (local1745 != null) {
				Static178.method2939();
				@Pc(1962) Class3_Sub31 local1962 = Static42.method612(local1745);
				Static265.method4459(local12, local1745.anInt4788, local1962.method4788(), local16, local1745.anInt4781, local1962.anInt5833);
				Static153.anInt2895 = 0;
				Static26.aString14 = Static53.method5031(local1745);
				if (local1745.aBoolean328) {
					aString205 = local1745.aString167 + "<col=ffffff>";
				} else {
					aString205 = "<col=00ff00>" + local1745.aString169 + "<col=ffffff>";
				}
				if (Static26.aString14 == null) {
					Static26.aString14 = "Null";
				}
			}
			return;
		}
		if (local20 == 29) {
			local107 = Static52.aClass10_Sub5_Sub1Array1[local35];
			if (local107 != null) {
				Static57.anInt1081 = 0;
				Static54.anInt1012 = Static7.anInt169;
				Static313.anInt6126 = Static293.anInt5844;
				Static83.anInt1554 = 2;
				Static215.aClass3_Sub26_Sub1_2.method3958(207);
				Static215.aClass3_Sub26_Sub1_2.method3919(Static95.aBooleanArray39[82] ? 1 : 0);
				Static215.aClass3_Sub26_Sub1_2.method3892(local35);
				Static79.method1663(Static136.aClass10_Sub5_Sub1_1.anIntArray537[0], 0, 0, local107.method4186(), Static136.aClass10_Sub5_Sub1_1.anIntArray535[0], local12, 0, local107.method4186(), local16);
			}
		}
		if (local20 == 7) {
			Static215.aClass3_Sub26_Sub1_2.method3958(82);
			Static215.aClass3_Sub26_Sub1_2.method3892(local35);
			Static215.aClass3_Sub26_Sub1_2.method3924(local16);
			Static215.aClass3_Sub26_Sub1_2.method3940(local12);
			Static269.anInt5496 = 0;
			Static204.aClass151_11 = Static243.method4115(local16);
			Static225.anInt4367 = local12;
		}
		if (local20 == 26) {
			Static215.aClass3_Sub26_Sub1_2.method3958(4);
			Static215.aClass3_Sub26_Sub1_2.method3944(Static265.anInt5507);
			Static215.aClass3_Sub26_Sub1_2.method3944(local16);
			Static215.aClass3_Sub26_Sub1_2.method3938(local12);
			Static215.aClass3_Sub26_Sub1_2.method3892(Static244.anInt4948);
			Static215.aClass3_Sub26_Sub1_2.method3938(Static17.anInt332);
			Static215.aClass3_Sub26_Sub1_2.method3897(local35);
			Static269.anInt5496 = 0;
			Static204.aClass151_11 = Static243.method4115(local16);
			Static225.anInt4367 = local12;
		}
		if (local20 == 35) {
			local107 = Static52.aClass10_Sub5_Sub1Array1[local35];
			if (local107 != null) {
				Static54.anInt1012 = Static7.anInt169;
				Static57.anInt1081 = 0;
				Static83.anInt1554 = 2;
				Static313.anInt6126 = Static293.anInt5844;
				Static215.aClass3_Sub26_Sub1_2.method3958(68);
				Static215.aClass3_Sub26_Sub1_2.method3892(local35);
				Static215.aClass3_Sub26_Sub1_2.method3907(Static95.aBooleanArray39[82] ? 1 : 0);
				Static79.method1663(Static136.aClass10_Sub5_Sub1_1.anIntArray537[0], 0, 0, local107.method4186(), Static136.aClass10_Sub5_Sub1_1.anIntArray535[0], local12, 0, local107.method4186(), local16);
			}
		}
		if (local20 == 31) {
			local45 = Static110.aClass10_Sub5_Sub2Array1[local35];
			if (local45 != null) {
				Static83.anInt1554 = 2;
				Static57.anInt1081 = 0;
				Static54.anInt1012 = Static7.anInt169;
				Static313.anInt6126 = Static293.anInt5844;
				Static215.aClass3_Sub26_Sub1_2.method3958(232);
				Static215.aClass3_Sub26_Sub1_2.method3928(Static95.aBooleanArray39[82] ? 1 : 0);
				Static215.aClass3_Sub26_Sub1_2.method3897(local35);
				Static79.method1663(Static136.aClass10_Sub5_Sub1_1.anIntArray537[0], 0, 0, local45.method4186(), Static136.aClass10_Sub5_Sub1_1.anIntArray535[0], local12, 0, local45.method4186(), local16);
			}
		}
		if (local20 == 15) {
			Static215.aClass3_Sub26_Sub1_2.method3958(75);
			Static215.aClass3_Sub26_Sub1_2.method3897(local35);
			Static215.aClass3_Sub26_Sub1_2.method3892(local12);
			Static215.aClass3_Sub26_Sub1_2.method3944(local16);
			Static269.anInt5496 = 0;
			Static204.aClass151_11 = Static243.method4115(local16);
			Static225.anInt4367 = local12;
		}
		if (local20 == 57) {
			Static215.aClass3_Sub26_Sub1_2.method3958(252);
			Static215.aClass3_Sub26_Sub1_2.method3886(Static63.anInt1200);
			Static215.aClass3_Sub26_Sub1_2.method3924(local16);
			Static215.aClass3_Sub26_Sub1_2.method3897(local12);
			Static215.aClass3_Sub26_Sub1_2.method3897(Static296.anInt5869);
		}
		if (local20 == 1006) {
			Static313.anInt6126 = Static293.anInt5844;
			Static83.anInt1554 = 2;
			Static54.anInt1012 = Static7.anInt169;
			Static57.anInt1081 = 0;
			local45 = Static110.aClass10_Sub5_Sub2Array1[local35];
			if (local45 != null) {
				@Pc(2386) Class124 local2386 = local45.aClass124_1;
				if (local2386.anIntArray432 != null) {
					local2386 = local2386.method3191();
				}
				if (local2386 != null) {
					Static215.aClass3_Sub26_Sub1_2.method3958(198);
					Static215.aClass3_Sub26_Sub1_2.method3897(local2386.anInt3767);
				}
			}
		}
		if (local20 == 32) {
			if (local35 == 0) {
				Static250.anInt5136 = 1;
				Static44.method669(Static99.anInt1826, local12, local16);
			} else if (local35 == 1) {
				Static215.aClass3_Sub26_Sub1_2.method3958(7);
				Static215.aClass3_Sub26_Sub1_2.method3938(local12 + Static101.anInt1844);
				Static215.aClass3_Sub26_Sub1_2.method3949(Static63.anInt1200);
				Static215.aClass3_Sub26_Sub1_2.method3897(Static43.anInt798 + local16);
				Static215.aClass3_Sub26_Sub1_2.method3897(Static296.anInt5869);
			}
		}
		if (local20 == 36) {
			Static215.aClass3_Sub26_Sub1_2.method3958(131);
			Static215.aClass3_Sub26_Sub1_2.method3944(local16);
			local1745 = Static243.method4115(local16);
			if (local1745.anIntArrayArray66 != null && local1745.anIntArrayArray66[0][0] == 5) {
				local1765 = local1745.anIntArrayArray66[0][1];
				if (Static161.anIntArray347[local1765] != local1745.anIntArray508[0]) {
					Static161.anIntArray347[local1765] = local1745.anIntArray508[0];
					Static15.method3529(local1765);
				}
			}
		}
		if (local20 == 38) {
			Static57.anInt1081 = 0;
			Static54.anInt1012 = Static7.anInt169;
			Static83.anInt1554 = 2;
			Static313.anInt6126 = Static293.anInt5844;
			Static215.aClass3_Sub26_Sub1_2.method3958(187);
			Static215.aClass3_Sub26_Sub1_2.method3892(local12 + Static101.anInt1844);
			Static215.aClass3_Sub26_Sub1_2.method3928(Static95.aBooleanArray39[82] ? 1 : 0);
			Static215.aClass3_Sub26_Sub1_2.method3897(local35);
			Static215.aClass3_Sub26_Sub1_2.method3892(local16 + Static43.anInt798);
			Static79.method1663(Static136.aClass10_Sub5_Sub1_1.anIntArray537[0], 0, 0, 0, Static136.aClass10_Sub5_Sub1_1.anIntArray535[0], local12, 0, 0, local16);
		}
		if (local20 == 51) {
			Static215.aClass3_Sub26_Sub1_2.method3958(89);
			Static215.aClass3_Sub26_Sub1_2.method3938(local12);
			Static215.aClass3_Sub26_Sub1_2.method3886(local16);
			Static215.aClass3_Sub26_Sub1_2.method3892(local35);
			Static269.anInt5496 = 0;
			Static204.aClass151_11 = Static243.method4115(local16);
			Static225.anInt4367 = local12;
		}
		if (local20 == 1009) {
			local1745 = Static243.method4115(local16);
			if (local1745 == null || local1745.anIntArray515[local12] < 100000) {
				Static215.aClass3_Sub26_Sub1_2.method3958(104);
				Static215.aClass3_Sub26_Sub1_2.method3940(local35);
			} else {
				Static199.method3284(local1745.anIntArray515[local12] + " x " + Static133.method2309(local35).aString18);
			}
			Static269.anInt5496 = 0;
			Static204.aClass151_11 = Static243.method4115(local16);
			Static225.anInt4367 = local12;
		}
		if (local20 == 1010) {
			Static54.anInt1012 = Static7.anInt169;
			Static57.anInt1081 = 0;
			Static313.anInt6126 = Static293.anInt5844;
			Static83.anInt1554 = 2;
			Static215.aClass3_Sub26_Sub1_2.method3958(104);
			Static215.aClass3_Sub26_Sub1_2.method3940(local35);
		}
		if (local20 == 1001) {
			Static83.anInt1554 = 2;
			Static313.anInt6126 = Static293.anInt5844;
			Static57.anInt1081 = 0;
			Static54.anInt1012 = Static7.anInt169;
			Static215.aClass3_Sub26_Sub1_2.method3958(103);
			Static215.aClass3_Sub26_Sub1_2.method3938(local16 + Static43.anInt798);
			Static215.aClass3_Sub26_Sub1_2.method3892(Static101.anInt1844 + local12);
			Static215.aClass3_Sub26_Sub1_2.method3897((int) (local30 >>> 32) & Integer.MAX_VALUE);
			Static215.aClass3_Sub26_Sub1_2.method3912(Static95.aBooleanArray39[82] ? 1 : 0);
			Static53.method5032(local16, local12, local30);
		}
		if (local20 == 40) {
			local1745 = Static243.method4115(local16);
			@Pc(2783) boolean local2783 = true;
			if (local1745.anInt4797 > 0) {
				local2783 = Static273.method4497(local1745);
			}
			if (local2783) {
				Static215.aClass3_Sub26_Sub1_2.method3958(131);
				Static215.aClass3_Sub26_Sub1_2.method3944(local16);
			}
		}
		if (local20 == 33) {
			if (local35 == 0) {
				Static44.anInt829 = 1;
				Static44.method669(Static99.anInt1826, local12, local16);
			} else if (Static296.anInt5879 > 0 && Static95.aBooleanArray39[82] && Static95.aBooleanArray39[81]) {
				Static268.method4448(Static99.anInt1826, local16 + Static43.anInt798, Static101.anInt1844 - -local12);
			} else {
				Static215.aClass3_Sub26_Sub1_2.method3958(47);
				Static215.aClass3_Sub26_Sub1_2.method3897(Static101.anInt1844 + local12);
				Static215.aClass3_Sub26_Sub1_2.method3940(Static43.anInt798 + local16);
			}
		}
		if (local20 == 16) {
			Static178.method2939();
			local1745 = Static243.method4115(local16);
			Static244.anInt4948 = local35;
			Static265.anInt5507 = local16;
			Static17.anInt332 = local12;
			Static153.anInt2895 = 1;
			Static134.method3639(local1745);
			Static246.aString173 = "<col=ff9040>" + Static133.method2309(local35).aString18 + "<col=ffffff>";
			if (Static246.aString173 == null) {
				Static246.aString173 = "null";
			}
			return;
		}
		if (local20 == 3) {
			Static215.aClass3_Sub26_Sub1_2.method3958(182);
			Static215.aClass3_Sub26_Sub1_2.method3892(local12);
			Static215.aClass3_Sub26_Sub1_2.method3897(local35);
			Static215.aClass3_Sub26_Sub1_2.method3949(local16);
			Static269.anInt5496 = 0;
			Static204.aClass151_11 = Static243.method4115(local16);
			Static225.anInt4367 = local12;
		}
		if (local20 == 43) {
			Static215.aClass3_Sub26_Sub1_2.method3958(108);
			Static215.aClass3_Sub26_Sub1_2.method3924(local16);
			Static215.aClass3_Sub26_Sub1_2.method3940(local12);
			Static215.aClass3_Sub26_Sub1_2.method3940(local35);
			Static269.anInt5496 = 0;
			Static204.aClass151_11 = Static243.method4115(local16);
			Static225.anInt4367 = local12;
		}
		if (local20 == 45) {
			Static313.anInt6126 = Static293.anInt5844;
			Static54.anInt1012 = Static7.anInt169;
			Static83.anInt1554 = 2;
			Static57.anInt1081 = 0;
			Static215.aClass3_Sub26_Sub1_2.method3958(162);
			Static215.aClass3_Sub26_Sub1_2.method3892((int) (local30 >>> 32) & Integer.MAX_VALUE);
			Static215.aClass3_Sub26_Sub1_2.method3907(Static95.aBooleanArray39[82] ? 1 : 0);
			Static215.aClass3_Sub26_Sub1_2.method3897(Static101.anInt1844 + local12);
			Static215.aClass3_Sub26_Sub1_2.method3897(local16 + Static43.anInt798);
			Static53.method5032(local16, local12, local30);
		}
		if (local20 == 60) {
			Static313.anInt6126 = Static293.anInt5844;
			Static83.anInt1554 = 2;
			Static57.anInt1081 = 0;
			Static54.anInt1012 = Static7.anInt169;
			Static215.aClass3_Sub26_Sub1_2.method3958(221);
			Static215.aClass3_Sub26_Sub1_2.method3892(local16 + Static43.anInt798);
			Static215.aClass3_Sub26_Sub1_2.method3912(Static95.aBooleanArray39[82] ? 1 : 0);
			Static215.aClass3_Sub26_Sub1_2.method3897(local12 + Static101.anInt1844);
			Static215.aClass3_Sub26_Sub1_2.method3897(local35);
			Static79.method1663(Static136.aClass10_Sub5_Sub1_1.anIntArray537[0], 0, 0, 0, Static136.aClass10_Sub5_Sub1_1.anIntArray535[0], local12, 0, 0, local16);
		}
		if (local20 == 9) {
			Static215.aClass3_Sub26_Sub1_2.method3958(124);
			Static215.aClass3_Sub26_Sub1_2.method3938(local12);
			Static215.aClass3_Sub26_Sub1_2.method3897(local35);
			Static215.aClass3_Sub26_Sub1_2.method3949(local16);
			Static269.anInt5496 = 0;
			Static204.aClass151_11 = Static243.method4115(local16);
			Static225.anInt4367 = local12;
		}
		if (local20 == 21) {
			Static215.aClass3_Sub26_Sub1_2.method3958(201);
			Static215.aClass3_Sub26_Sub1_2.method3924(local16);
			Static215.aClass3_Sub26_Sub1_2.method3938(local12);
			Static215.aClass3_Sub26_Sub1_2.method3940(local35);
			Static269.anInt5496 = 0;
			Static204.aClass151_11 = Static243.method4115(local16);
			Static225.anInt4367 = local12;
		}
		if (local20 == 13) {
			local107 = Static52.aClass10_Sub5_Sub1Array1[local35];
			if (local107 != null) {
				Static83.anInt1554 = 2;
				Static57.anInt1081 = 0;
				Static313.anInt6126 = Static293.anInt5844;
				Static54.anInt1012 = Static7.anInt169;
				Static215.aClass3_Sub26_Sub1_2.method3958(175);
				Static215.aClass3_Sub26_Sub1_2.method3912(Static95.aBooleanArray39[82] ? 1 : 0);
				Static215.aClass3_Sub26_Sub1_2.method3938(local35);
				Static79.method1663(Static136.aClass10_Sub5_Sub1_1.anIntArray537[0], 0, 0, local107.method4186(), Static136.aClass10_Sub5_Sub1_1.anIntArray535[0], local12, 0, local107.method4186(), local16);
			}
		}
		if (local20 == 46) {
			Static313.anInt6126 = Static293.anInt5844;
			Static57.anInt1081 = 0;
			Static83.anInt1554 = 2;
			Static54.anInt1012 = Static7.anInt169;
			Static215.aClass3_Sub26_Sub1_2.method3958(148);
			Static215.aClass3_Sub26_Sub1_2.method3938(Integer.MAX_VALUE & (int) (local30 >>> 32));
			Static215.aClass3_Sub26_Sub1_2.method3912(Static95.aBooleanArray39[82] ? 1 : 0);
			Static215.aClass3_Sub26_Sub1_2.method3938(local16 + Static43.anInt798);
			Static215.aClass3_Sub26_Sub1_2.method3897(Static101.anInt1844 + local12);
			Static53.method5032(local16, local12, local30);
		}
		if (Static153.anInt2895 != 0) {
			Static153.anInt2895 = 0;
			Static134.method3639(Static243.method4115(Static265.anInt5507));
		}
		if (Static39.aBoolean56) {
			Static178.method2939();
		}
		if (Static204.aClass151_11 != null && Static269.anInt5496 == 0) {
			Static134.method3639(Static204.aClass151_11);
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIZIIIIII)V")
	public static void method4488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 == arg0 && arg2 == arg5 && arg1 == arg3 && arg6 == arg4) {
			Static173.method2864(arg1, arg4, arg0, arg7, arg5);
			return;
		}
		@Pc(36) int local36 = arg5;
		@Pc(38) int local38 = arg0;
		@Pc(42) int local42 = arg0 * 3;
		@Pc(46) int local46 = arg5 * 3;
		@Pc(50) int local50 = arg8 * 3;
		@Pc(54) int local54 = arg2 * 3;
		@Pc(58) int local58 = arg6 * 3;
		@Pc(62) int local62 = arg3 * 3;
		@Pc(71) int local71 = arg1 + local50 - arg0 - local62;
		@Pc(81) int local81 = arg4 + local54 - local58 - arg5;
		@Pc(90) int local90 = local42 + local62 - local50 - local50;
		@Pc(100) int local100 = local46 + local58 - local54 - local54;
		@Pc(104) int local104 = local54 - local46;
		@Pc(109) int local109 = local50 - local42;
		for (@Pc(111) int local111 = 128; local111 <= 4096; local111 += 128) {
			@Pc(122) int local122 = local111 * local111 >> 12;
			@Pc(128) int local128 = local111 * local122 >> 12;
			@Pc(132) int local132 = local122 * local90;
			@Pc(136) int local136 = local128 * local71;
			@Pc(140) int local140 = local128 * local81;
			@Pc(144) int local144 = local109 * local111;
			@Pc(148) int local148 = local104 * local111;
			@Pc(152) int local152 = local100 * local122;
			@Pc(162) int local162 = arg5 + (local148 + local152 + local140 >> 12);
			@Pc(173) int local173 = (local144 + local136 + local132 >> 12) + arg0;
			Static173.method2864(local173, local162, local38, arg7, local36);
			local38 = local173;
			local36 = local162;
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "()V")
	public static void method4489() {
		@Pc(3) int local3;
		@Pc(9) int local9;
		@Pc(14) int local14;
		if (Static92.aClass3_Sub25ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static92.aClass3_Sub25ArrayArrayArray3.length; local3++) {
				for (local9 = 0; local9 < Static295.anInt4973; local9++) {
					for (local14 = 0; local14 < Static307.anInt6023; local14++) {
						Static92.aClass3_Sub25ArrayArrayArray3[local3][local9][local14] = null;
					}
				}
			}
		}
		Static62.aClass3_Sub21ArrayArray2 = null;
		if (Static291.aClass3_Sub25ArrayArrayArray6 != null) {
			for (local3 = 0; local3 < Static291.aClass3_Sub25ArrayArrayArray6.length; local3++) {
				for (local9 = 0; local9 < Static295.anInt4973; local9++) {
					for (local14 = 0; local14 < Static307.anInt6023; local14++) {
						Static291.aClass3_Sub25ArrayArrayArray6[local3][local9][local14] = null;
					}
				}
			}
		}
		Static282.aClass3_Sub21ArrayArray3 = null;
		Static197.anInt5226 = 0;
		if (Static19.aClass134Array1 != null) {
			for (local3 = 0; local3 < Static197.anInt5226; local3++) {
				Static19.aClass134Array1[local3] = null;
			}
		}
		if (Static104.aClass85Array1 != null) {
			for (local3 = 0; local3 < Static51.anInt994; local3++) {
				Static104.aClass85Array1[local3] = null;
			}
			Static51.anInt994 = 0;
		}
		if (Static108.aClass85Array2 != null) {
			for (local3 = 0; local3 < Static108.aClass85Array2.length; local3++) {
				Static108.aClass85Array2[local3] = null;
			}
		}
	}
}
