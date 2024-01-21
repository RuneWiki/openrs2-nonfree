import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!va", name = "c", descriptor = "I")
	public static int anInt2971;

	@OriginalMember(owner = "client!va", name = "d", descriptor = "[Lclient!de;")
	public static Class1_Sub1_Sub4_Sub1[] aClass1_Sub1_Sub4_Sub1Array11;

	@OriginalMember(owner = "client!va", name = "i", descriptor = "Lclient!oe;")
	public static Class56 aClass56_4;

	@OriginalMember(owner = "client!va", name = "n", descriptor = "Lclient!ta;")
	public static Class70 aClass70_12;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "[I")
	public static int[] anIntArray466 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!va", name = "b", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1430 = Static108.method1915("OFF");

	@OriginalMember(owner = "client!va", name = "e", descriptor = "I")
	public static int anInt2972 = 0;

	@OriginalMember(owner = "client!va", name = "k", descriptor = "I")
	public static int anInt2977 = 0;

	@OriginalMember(owner = "client!va", name = "l", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1431 = Static108.method1915("<col=00ffff>");

	@OriginalMember(owner = "client!va", name = "o", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1432 = aClass39_1430;

	@OriginalMember(owner = "client!va", name = "p", descriptor = "[Lclient!ua;")
	public static Class62_Sub1[] aClass62_Sub1Array1 = new Class62_Sub1[256];

	@OriginalMember(owner = "client!va", name = "r", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1433 = Static108.method1915("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!va", name = "t", descriptor = "I")
	public static int anInt2981 = 0;

	@OriginalMember(owner = "client!va", name = "u", descriptor = "I")
	public static int anInt2982 = -1;

	@OriginalMember(owner = "client!va", name = "v", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1434 = null;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Z[Lclient!kd;)[Lclient!kd;")
	public static Class39[] method2059(@OriginalArg(1) Class39[] arg0) {
		@Pc(13) Class39[] local13 = new Class39[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local13[local15] = Static30.method601(new Class39[] { Static69.method1226(local15), Static114.aClass39_1370 });
			if (arg0 != null && arg0[local15] != null) {
				local13[local15] = Static30.method601(new Class39[] { local13[local15], arg0[local15] });
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
	public static void method2060() {
		aClass1_Sub1_Sub4_Sub1Array11 = null;
		aClass39_1434 = null;
		aClass39_1431 = null;
		aClass56_4 = null;
		aClass39_1433 = null;
		aClass62_Sub1Array1 = null;
		aClass39_1430 = null;
		anIntArray466 = null;
		aClass70_12 = null;
		aClass39_1432 = null;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!kd;B)V")
	public static void method2061(@OriginalArg(0) Class39 arg0) {
		if (arg0 == null || arg0.method1175() == 0) {
			Static59.anInt1586 = 0;
			return;
		}
		@Pc(16) Class39 local16 = arg0;
		@Pc(18) int local18 = 0;
		@Pc(29) Class39[] local29 = new Class39[100];
		while (true) {
			@Pc(34) int local34 = local16.method1160();
			if (local34 == -1) {
				local16 = local16.method1183();
				if (local16.method1175() > 0) {
					local29[local18++] = local16.method1151();
				}
				Static59.anInt1586 = 0;
				label46: for (local34 = 0; local34 < Static117.anInt2912; local34++) {
					@Pc(94) Class1_Sub1_Sub17 local94 = Static8.method224(local34);
					if (local94.anInt2748 == -1 && local94.aClass39_1321 != null) {
						@Pc(107) Class39 local107 = local94.aClass39_1321.method1151();
						for (@Pc(109) int local109 = 0; local109 < local18; local109++) {
							if (local107.method1166(local29[local109]) == -1) {
								continue label46;
							}
						}
						Static68.aClass39Array20[Static59.anInt1586] = local107;
						Static59.anIntArray222[Static59.anInt1586] = local34;
						Static59.anInt1586++;
						if (Static68.aClass39Array20.length <= Static59.anInt1586) {
							return;
						}
					}
				}
				return;
			}
			@Pc(45) Class39 local45 = local16.method1173(local34, 0).method1183();
			if (local45.method1175() > 0) {
				local29[local18++] = local45.method1151();
			}
			local16 = local16.method1181(local34 + 1);
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IBIIIII)V")
	public static void method2062(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = 2048 - arg5 & 0x7FF;
		@Pc(21) int local21 = 2048 - arg1 & 0x7FF;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = arg2;
		@Pc(40) int local40;
		@Pc(36) int local36;
		@Pc(51) int local51;
		if (local10 != 0) {
			local36 = Class1_Sub1_Sub4_Sub2.anIntArray142[local10];
			local40 = Class1_Sub1_Sub4_Sub2.anIntArray138[local10];
			local51 = local36 * 0 - arg2 * local40 >> 16;
			local27 = local36 * arg2 + local40 * 0 >> 16;
			local25 = local51;
		}
		if (local21 != 0) {
			local36 = Class1_Sub1_Sub4_Sub2.anIntArray142[local21];
			local40 = Class1_Sub1_Sub4_Sub2.anIntArray138[local21];
			local51 = local36 * 0 + local40 * local27 >> 16;
			local27 = local27 * local36 - local40 * 0 >> 16;
			local23 = local51;
		}
		Static22.anInt763 = arg4 - local25;
		Static28.anInt2564 = arg3 - local23;
		Static62.anInt2932 = arg0 - local27;
		Static38.anInt1156 = arg1;
		Static104.anInt2640 = arg5;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
	public static void method2063() {
		Static81.method1387();
		Static97.method2187();
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (Static48.anInt1316 == 2 || Static48.anInt1316 == 5) {
			@Pc(27) byte[] local27 = Static70.aClass1_Sub1_Sub4_Sub1_33.aByteArray24;
			@Pc(29) int[] local29 = Static15.anIntArray326;
			local32 = local27.length;
			for (local34 = 0; local34 < local32; local34++) {
				if (local27[local34] == 0) {
					local29[local34] = 0;
				}
			}
			if (Static48.anInt1316 < 3) {
				Static67.aClass1_Sub1_Sub4_Sub4_4.method1523(0, 0, 33, 33, 25, 25, Static51.anInt1408, 256, Static21.anIntArray108, Static97.anIntArray480);
			}
			Static14.method295();
			return;
		}
		@Pc(76) int local76 = Static75.anInt1879 + Static51.anInt1408 & 0x7FF;
		local32 = 464 - Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2508 / 32;
		@Pc(91) int local91 = Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2521 / 32 + 48;
		Static34.aClass1_Sub1_Sub4_Sub4_3.method1523(25, 5, 146, 151, local91, local32, local76, Static39.anInt1165 + 256, Static121.anIntArray463, Static20.anIntArray106);
		for (local34 = 0; local34 < Static110.anInt2788; local34++) {
			local91 = Static86.anIntArray320[local34] * 4 + 2 - Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2521 / 32;
			local32 = Static99.anIntArray378[local34] * 4 + 2 - Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2508 / 32;
			Static31.method606(local91, local32, Static124.aClass1_Sub1_Sub4_Sub4Array12[local34]);
		}
		@Pc(158) int local158;
		for (@Pc(154) int local154 = 0; local154 < 104; local154++) {
			for (local158 = 0; local158 < 104; local158++) {
				@Pc(168) Class31 local168 = Static100.aClass31ArrayArrayArray1[Static9.anInt2983][local154][local158];
				if (local168 != null) {
					local32 = local158 * 4 + 2 - Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2508 / 32;
					local91 = local154 * 4 + 2 - Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2521 / 32;
					Static31.method606(local91, local32, Static24.aClass1_Sub1_Sub4_Sub4Array4[0]);
				}
			}
		}
		for (local158 = 0; local158 < Static20.anInt731; local158++) {
			@Pc(219) Class1_Sub1_Sub2_Sub1_Sub1 local219 = Static114.aClass1_Sub1_Sub2_Sub1_Sub1Array1[Static51.anIntArray192[local158]];
			if (local219 != null && local219.method1797()) {
				@Pc(228) Class1_Sub1_Sub5 local228 = local219.aClass1_Sub1_Sub5_1;
				if (local228 != null && local228.anIntArray130 != null) {
					local228 = local228.method514();
				}
				if (local228 != null && local228.aBoolean75 && local228.aBoolean76) {
					local32 = local219.anInt2508 / 32 - Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2508 / 32;
					local91 = local219.anInt2521 / 32 - Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2521 / 32;
					Static31.method606(local91, local32, Static24.aClass1_Sub1_Sub4_Sub4Array4[1]);
				}
			}
		}
		@Pc(333) int local333;
		@Pc(294) Class1_Sub1_Sub2_Sub1_Sub2 local294;
		for (@Pc(286) int local286 = 0; local286 < Static57.anInt1547; local286++) {
			local294 = Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1[Static12.anIntArray91[local286]];
			if (local294 != null && local294.method1797()) {
				local32 = local294.anInt2508 / 32 - Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2508 / 32;
				local91 = local294.anInt2521 / 32 - Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2521 / 32;
				@Pc(324) boolean local324 = false;
				@Pc(331) long local331 = local294.aClass39_1234.method1186();
				for (local333 = 0; local333 < Static12.anInt502; local333++) {
					if (local331 == Static45.aLongArray3[local333] && Static14.anIntArray93[local333] != 0) {
						local324 = true;
						break;
					}
				}
				@Pc(358) boolean local358 = false;
				if (Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2552 != 0 && local294.anInt2552 != 0 && local294.anInt2552 == Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2552) {
					local358 = true;
				}
				if (local324) {
					Static31.method606(local91, local32, Static24.aClass1_Sub1_Sub4_Sub4Array4[3]);
				} else if (local358) {
					Static31.method606(local91, local32, Static24.aClass1_Sub1_Sub4_Sub4Array4[4]);
				} else {
					Static31.method606(local91, local32, Static24.aClass1_Sub1_Sub4_Sub4Array4[2]);
				}
			}
		}
		if (Static58.anInt1564 != 0 && Static45.anInt1256 % 20 < 10) {
			if (Static58.anInt1564 == 1 && Static100.anInt2549 >= 0 && Static100.anInt2549 < Static114.aClass1_Sub1_Sub2_Sub1_Sub1Array1.length) {
				@Pc(444) Class1_Sub1_Sub2_Sub1_Sub1 local444 = Static114.aClass1_Sub1_Sub2_Sub1_Sub1Array1[Static100.anInt2549];
				if (local444 != null) {
					local91 = local444.anInt2521 / 32 - Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2521 / 32;
					local32 = local444.anInt2508 / 32 - Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2508 / 32;
					Static110.method1943(local91, local32, Static18.aClass1_Sub1_Sub4_Sub4Array3[1]);
				}
			}
			if (Static58.anInt1564 == 2) {
				local32 = (-Static103.anInt2610 + Static40.anInt1177) * 4 + 2 - Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2508 / 32;
				local91 = (Static69.anInt1768 - Static71.anInt1795) * 4 + 2 - Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2521 / 32;
				Static110.method1943(local91, local32, Static18.aClass1_Sub1_Sub4_Sub4Array3[1]);
			}
			if (Static58.anInt1564 == 10 && Static113.anInt2832 >= 0 && Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1.length > Static113.anInt2832) {
				local294 = Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1[Static113.anInt2832];
				if (local294 != null) {
					local91 = local294.anInt2521 / 32 - Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2521 / 32;
					local32 = local294.anInt2508 / 32 - Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2508 / 32;
					Static110.method1943(local91, local32, Static18.aClass1_Sub1_Sub4_Sub4Array3[1]);
				}
			}
		}
		if (Static35.anInt1069 != 0) {
			local91 = Static35.anInt1069 * 4 + 2 - Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2521 / 32;
			local32 = Static32.anInt684 * 4 + 2 - Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2508 / 32;
			Static31.method606(local91, local32, Static18.aClass1_Sub1_Sub4_Sub4Array3[0]);
		}
		Static15.method1503(97, 78, 3, 3, 16777215);
		if (Static48.anInt1316 >= 3) {
			@Pc(610) byte[] local610 = Static70.aClass1_Sub1_Sub4_Sub1_33.aByteArray24;
			@Pc(612) int[] local612 = Static15.anIntArray326;
			for (@Pc(614) int local614 = 0; local614 <= 33; local614++) {
				@Pc(621) int local621 = local614 * Static70.aClass1_Sub1_Sub4_Sub1_33.anInt869;
				for (local333 = 0; local333 <= 33; local333++) {
					if (local610[local621 + local333] == 0) {
						local612[local621 + local333] = 0;
					}
				}
			}
		} else {
			Static67.aClass1_Sub1_Sub4_Sub4_4.method1523(0, 0, 33, 33, 25, 25, Static51.anInt1408, 256, Static21.anIntArray108, Static97.anIntArray480);
		}
		Static14.method295();
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!nd;")
	public static RuntimeException_Sub1 method2064(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString2 = local9.aString2 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}
