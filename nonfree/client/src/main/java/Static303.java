import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!pe", name = "P", descriptor = "[Lclient!dl;")
	public static Class54[] aClass54Array1;

	@OriginalMember(owner = "client!pe", name = "cb", descriptor = "[[B")
	public static byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(B)V")
	public static void method4478() {
		Static158.aBoolean260 = true;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILjava/awt/Canvas;)Lclient!rm;")
	public static Class3_Sub16 method4479(@OriginalArg(1) Canvas arg0) {
		try {
			@Pc(11) Class local11 = Class.forName("Class3_Sub16_Sub2");
			@Pc(15) Class3_Sub16 local15 = (Class3_Sub16) local11.getDeclaredConstructor().newInstance();
			local15.method5831(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class3_Sub16_Sub1 local26 = new Class3_Sub16_Sub1();
			local26.method5831(arg0);
			return local26;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZLclient!qa;)V")
	public static void method4481(@OriginalArg(1) Class75 arg0) {
		@Pc(5) int local5 = Static67.anInt1556;
		@Pc(7) int local7 = Static153.anInt3319;
		@Pc(9) int local9 = Static283.anInt5203;
		@Pc(13) int local13 = Static318.anInt3229 - 3;
		if (Static309.aClass22_15 == null || Static106.aClass22_4 == null) {
			if (Static20.aClass56_10.method1365(Static171.anInt3593) && Static20.aClass56_10.method1365(Static340.anInt6289)) {
				Static309.aClass22_15 = arg0.method2590(Static460.method3975(Static20.aClass56_10, Static171.anInt3593, 0));
				@Pc(42) Class166 local42 = Static460.method3975(Static20.aClass56_10, Static340.anInt6289, 0);
				Static106.aClass22_4 = arg0.method2590(local42);
				local42.method3983();
				Static433.aClass22_20 = arg0.method2590(local42);
			} else {
				arg0.NA(local5, local7, local9, 20, Static246.anInt2398 | 255 - Static230.anInt4398 << 24, 1);
			}
		}
		@Pc(86) int local86;
		@Pc(84) int local84;
		if (Static309.aClass22_15 != null && Static106.aClass22_4 != null) {
			local84 = (local9 - Static106.aClass22_4.UA() * 2) / Static309.aClass22_15.UA();
			for (local86 = 0; local86 < local84; local86++) {
				Static309.aClass22_15.method6074(local5 + Static106.aClass22_4.UA() + Static309.aClass22_15.UA() * local86, local7);
			}
			Static106.aClass22_4.method6074(local5, local7);
			Static433.aClass22_20.method6074(local5 + local9 - Static433.aClass22_20.UA(), local7);
		}
		Static399.aClass65_7.method5818(local7 + 14, local5 + 3, -1, -16777216 | Static250.anInt4693, Static309.aClass175_185.method4201(Static216.anInt4257));
		arg0.NA(local5, local7 + 20, local9, local13 - 20, 255 - Static230.anInt4398 << 24 | Static246.anInt2398, 1);
		local84 = Static155.aClass74_1.method1870();
		local86 = Static155.aClass74_1.method1865();
		@Pc(162) int local162 = 0;
		@Pc(182) int local182;
		for (@Pc(167) Class3_Sub38 local167 = (Class3_Sub38) Static374.aClass229_41.method5328(); local167 != null; local167 = (Class3_Sub38) Static374.aClass229_41.method5325()) {
			local182 = local7 + (Static169.anInt3551 + -1 - local162) * 16 + 20 + 13;
			if (local5 < local84 && local5 + local9 > local84 && local182 - 13 < local86 && local86 < local182 + 4 && local167.aBoolean452) {
				arg0.NA(local5, local182 - 12, local9, 16, 255 - Static353.anInt6333 << 24 | Static111.anInt7564, 1);
			}
			local162++;
		}
		if ((Static252.aClass22_12 == null || Static315.aClass22_17 == null || Static315.aClass22_16 == null) && Static20.aClass56_10.method1365(Static230.anInt4400) && Static20.aClass56_10.method1365(Static417.anInt7206) && Static20.aClass56_10.method1365(Static30.anInt827)) {
			@Pc(263) Class166 local263 = Static460.method3975(Static20.aClass56_10, Static417.anInt7206, 0);
			Static315.aClass22_17 = arg0.method2590(local263);
			local263.method3983();
			Static233.aClass22_10 = arg0.method2590(local263);
			Static252.aClass22_12 = arg0.method2590(Static460.method3975(Static20.aClass56_10, Static230.anInt4400, 0));
			@Pc(288) Class166 local288 = Static460.method3975(Static20.aClass56_10, Static30.anInt827, 0);
			Static315.aClass22_16 = arg0.method2590(local288);
			local288.method3983();
			Static84.aClass22_3 = arg0.method2590(local288);
		}
		@Pc(355) int local355;
		@Pc(319) int local319;
		if (Static252.aClass22_12 != null && Static315.aClass22_17 != null && Static315.aClass22_16 != null) {
			local182 = (local9 - Static315.aClass22_16.UA() * 2) / Static252.aClass22_12.UA();
			for (local319 = 0; local319 < local182; local319++) {
				Static252.aClass22_12.method6074(Static315.aClass22_16.UA() + local5 + Static252.aClass22_12.UA() * local319, -Static252.aClass22_12.qa() + local7 + local13);
			}
			local355 = (local13 - Static315.aClass22_16.qa() - 20) / Static315.aClass22_17.qa();
			for (@Pc(357) int local357 = 0; local357 < local355; local357++) {
				Static315.aClass22_17.method6074(local5, Static315.aClass22_17.qa() * local357 + local7 + 20);
				Static233.aClass22_10.method6074(local5 + local9 - Static233.aClass22_10.UA(), Static315.aClass22_17.qa() * local357 + 20 + local7);
			}
			Static315.aClass22_16.method6074(local5, local7 + local13 - Static315.aClass22_16.qa());
			Static84.aClass22_3.method6074(local5 + local9 - Static315.aClass22_16.UA(), -Static315.aClass22_16.qa() + local7 - -local13);
		}
		local162 = 0;
		for (@Pc(430) Class3_Sub38 local430 = (Class3_Sub38) Static374.aClass229_41.method5328(); local430 != null; local430 = (Class3_Sub38) Static374.aClass229_41.method5325()) {
			local319 = local7 + (-local162 + Static169.anInt3551 + -1) * 16 + 20 + 13;
			local355 = Static250.anInt4693 | 0xFF000000;
			if (local84 > local5 && local9 + local5 > local84 && local319 - 13 < local86 && local319 + 4 > local86 && local430.aBoolean452) {
				local355 = Static256.anInt4774 | 0xFF000000;
			}
			@Pc(490) int[] local490 = null;
			if (Static54.method1102(local430.anInt6532)) {
				local490 = Static89.aClass157_1.method3832((int) local430.aLong192).anIntArray434;
			} else if (local430.anInt6528 != -1) {
				local490 = Static89.aClass157_1.method3832(local430.anInt6528).anIntArray434;
			} else if (Static116.method5249(local430.anInt6532)) {
				@Pc(527) Class1_Sub3_Sub3_Sub2 local527 = Static451.aClass1_Sub3_Sub3_Sub2Array1[(int) local430.aLong192];
				if (local527 != null) {
					@Pc(532) Class47 local532 = local527.aClass47_1;
					if (local532.anIntArray134 != null) {
						local532 = local532.method1296(Static369.aClass11_1);
					}
					if (local532 != null) {
						local490 = local532.anIntArray137;
					}
				}
			} else if (Static34.method820(local430.anInt6532)) {
				@Pc(570) Class128 local570;
				if (local430.anInt6532 == 1004) {
					local570 = Static55.aClass25_1.method855((int) local430.aLong192);
				} else {
					local570 = Static55.aClass25_1.method855((int) (local430.aLong192 >>> 32 & 0x7FFFFFFFL));
				}
				if (local570.anIntArray307 != null) {
					local570 = local570.method3307(Static369.aClass11_1);
				}
				if (local570 != null) {
					local490 = local570.anIntArray303;
				}
			}
			@Pc(595) String local595 = Static262.method3968(local430);
			if (local490 != null) {
				local595 = local595 + Static39.method921(local490);
			}
			Static399.aClass65_7.method5802(Static270.aClass22Array21, Static184.anIntArray285, local5 + 3, local595, local355, local319);
			local162++;
			if (local430.aBoolean453) {
				Static55.aClass22_2.method6074(Static222.aClass179_10.method4385(local595) + local5 + 5, local319 - 12);
			}
		}
		Static9.method241(Static153.anInt3319, Static318.anInt3229, Static283.anInt5203, Static67.anInt1556);
	}
}
