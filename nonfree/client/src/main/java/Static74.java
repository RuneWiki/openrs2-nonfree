import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!cia", name = "p", descriptor = "[I")
	public static int[] anIntArray611 = null;

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "([BZI)V")
	public static void method7151(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		if (Static24.aClass2_Sub17_1 == null) {
			Static24.aClass2_Sub17_1 = new Class2_Sub17(20000);
		}
		Static24.aClass2_Sub17_1.method2873(0, arg0, arg0.length);
		if (!arg1) {
			return;
		}
		Static597.method8406(Static24.aClass2_Sub17_1.aByteArray26);
		Static537.aClass362_Sub1Array1 = new Class362_Sub1[Static24.anInt502];
		@Pc(36) int local36 = 0;
		for (@Pc(38) int local38 = Static455.anInt9458; local38 <= Static528.anInt3398; local38++) {
			@Pc(44) Class362_Sub1 local44 = Static640.method8786(local38);
			if (local44 != null) {
				Static537.aClass362_Sub1Array1[local36++] = local44;
			}
		}
		Static495.aBoolean720 = false;
		Static180.aLong94 = Static48.method1203();
		Static24.aClass2_Sub17_1 = null;
	}

	@OriginalMember(owner = "client!cia", name = "b", descriptor = "(B)V")
	public static void method7156() {
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub27_2, 1);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub27_1, 1);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub29_2, 1);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub29_1, 1);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub21_1, 1);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub6_1, 1);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub16_1, 0);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub24_1, 0);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub3_1, 0);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub18_1, 0);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub2_1, 0);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub20_1, 0);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub17_1, 0);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub23_1, 0);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub7_1, 0);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub7_2, 0);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub13_1, 0);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub4_1, 0);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub26_1, 0);
		Static449.method6406();
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub10_1, 2);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub5_1, 2);
		Static350.method5257();
		Static350.method5258();
		Static35.aBoolean69 = true;
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(IIIILclient!he;)Z")
	public static boolean method7158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class16_Sub1_Sub2 arg3) {
		if (!Static79.aBoolean178 || !Static294.aBoolean394) {
			return false;
		} else if (Static111.anInt2390 < 100) {
			return false;
		} else if (Static213.method3543(arg2, arg0, arg1)) {
			@Pc(36) int local36 = arg0 << Static326.anInt5713;
			@Pc(40) int local40 = arg1 << Static326.anInt5713;
			@Pc(50) int local50 = Static511.aClass91Array3[arg2].method7447(arg1, arg0) - 1;
			@Pc(57) int local57 = local50 + arg3.method6980();
			if (arg3.aShort89 == 1) {
				if (!Static33.method735(local36, local40 + Static519.anInt8387, local57, local36, local36, local40, local57, local40, local50)) {
					return false;
				} else if (Static33.method735(local36, Static519.anInt8387 + local40, local57, local36, local36, Static519.anInt8387 + local40, local50, local40, local50)) {
					Static25.anInt8653++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort89 == 2) {
				if (!Static33.method735(local36 + Static519.anInt8387, local40 - -Static519.anInt8387, local57, local36, local36, Static519.anInt8387 + local40, local57, local40 + Static519.anInt8387, local50)) {
					return false;
				} else if (Static33.method735(Static519.anInt8387 + local36, local40 + Static519.anInt8387, local50, local36, Static519.anInt8387 + local36, local40 + Static519.anInt8387, local57, Static519.anInt8387 + local40, local50)) {
					Static25.anInt8653++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort89 == 4) {
				if (!Static33.method735(Static519.anInt8387 + local36, local40 - -Static519.anInt8387, local57, local36 + Static519.anInt8387, Static519.anInt8387 + local36, local40, local57, local40, local50)) {
					return false;
				} else if (Static33.method735(local36 + Static519.anInt8387, local40 - -Static519.anInt8387, local57, Static519.anInt8387 + local36, local36 + Static519.anInt8387, local40 + Static519.anInt8387, local50, local40, local50)) {
					Static25.anInt8653++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort89 == 8) {
				if (!Static33.method735(local36 + Static519.anInt8387, local40, local57, local36, local36, local40, local57, local40, local50)) {
					return false;
				} else if (Static33.method735(Static519.anInt8387 + local36, local40, local50, local36, Static519.anInt8387 + local36, local40, local57, local40, local50)) {
					Static25.anInt8653++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort89 == 16) {
				if (Static149.method2635(local50, local40 + Static620.anInt10145, local36, Static620.anInt10145, local57, Static620.anInt10145)) {
					Static25.anInt8653++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort89 == 32) {
				if (Static149.method2635(local50, Static620.anInt10145 + local40, Static620.anInt10145 + local36, Static620.anInt10145, local57, Static620.anInt10145)) {
					Static25.anInt8653++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort89 == 64) {
				if (Static149.method2635(local50, local40, Static620.anInt10145 + local36, Static620.anInt10145, local57, Static620.anInt10145)) {
					Static25.anInt8653++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort89 != 128) {
				return true;
			} else if (Static149.method2635(local50, local40, local36, Static620.anInt10145, local57, Static620.anInt10145)) {
				Static25.anInt8653++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(BIILclient!ria;)V")
	public static void method7159(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class303 arg2) {
		if (Static351.aClass303_13 != null || Static113.aBoolean192 || (arg2 == null || Static394.method5830(arg2) == null)) {
			return;
		}
		Static351.aClass303_13 = arg2;
		Static373.aClass303_14 = Static394.method5830(arg2);
		Static521.anInt8409 = arg0;
		Static474.anInt7662 = arg1;
		Static610.aBoolean726 = false;
		Static450.anInt7360 = 0;
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(BIIIIIIIII)V")
	public static void method7160(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 == arg7 && arg3 == arg8 && arg6 == arg4 && arg0 == arg5) {
			Static89.method6082(arg5, arg2, arg4, arg1, arg3);
			return;
		}
		@Pc(31) int local31 = arg2;
		@Pc(33) int local33 = arg3;
		@Pc(37) int local37 = arg2 * 3;
		@Pc(41) int local41 = arg3 * 3;
		@Pc(45) int local45 = arg7 * 3;
		@Pc(49) int local49 = arg8 * 3;
		@Pc(53) int local53 = arg6 * 3;
		@Pc(57) int local57 = arg0 * 3;
		@Pc(66) int local66 = local45 + arg4 - local53 - arg2;
		@Pc(75) int local75 = arg5 + local49 - local57 - arg3;
		@Pc(85) int local85 = local53 + local37 - local45 - local45;
		@Pc(95) int local95 = local57 + local41 - local49 - local49;
		@Pc(99) int local99 = local45 - local37;
		@Pc(104) int local104 = local49 - local41;
		for (@Pc(106) int local106 = 128; local106 <= 4096; local106 += 128) {
			@Pc(114) int local114 = local106 * local106 >> 12;
			@Pc(120) int local120 = local114 * local106 >> 12;
			@Pc(124) int local124 = local120 * local66;
			@Pc(128) int local128 = local120 * local75;
			@Pc(132) int local132 = local114 * local85;
			@Pc(136) int local136 = local114 * local95;
			@Pc(140) int local140 = local99 * local106;
			@Pc(144) int local144 = local106 * local104;
			@Pc(154) int local154 = (local140 + local132 + local124 >> 12) + arg2;
			@Pc(164) int local164 = (local128 + local136 + local144 >> 12) + arg3;
			Static89.method6082(local164, local31, local154, arg1, local33);
			local31 = local154;
			local33 = local164;
		}
	}
}
