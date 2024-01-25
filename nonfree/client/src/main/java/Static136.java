import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!gv", name = "F", descriptor = "[Z")
	public static final boolean[] aBooleanArray10 = new boolean[200];

	@OriginalMember(owner = "client!gv", name = "G", descriptor = "I")
	public static int anInt2491 = 0;

	@OriginalMember(owner = "client!gv", name = "H", descriptor = "I")
	public static int anInt2492 = -1;

	@OriginalMember(owner = "client!gv", name = "I", descriptor = "I")
	public static int anInt2493 = -1;

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lclient!qa;B)V")
	public static void method2091(@OriginalArg(0) Class121 arg0) {
		if (Static264.aBoolean355) {
			Static436.method5832(arg0);
		} else {
			Static340.method4900(arg0);
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lclient!qa;IILclient!ia;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method2094(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class43 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static74.aClass121_3 = arg0;
		Static113.anInt2183 = arg1;
		Static323.aClass43_3 = arg3;
		Static144.aBoolean211 = Static74.aClass121_3.method4572() > 0;
		Static59.anInt1066 = arg4 >> Static58.anInt1051;
		Static161.anInt2868 = arg6 >> Static58.anInt1051;
		Static81.anInt1480 = arg4;
		Static150.anInt2703 = arg6;
		Static374.anInt6749 = arg5;
		Static210.anInt3764 = Static59.anInt1066 - Static370.anInt7659;
		if (Static210.anInt3764 < 0) {
			Static322.anInt4032 = -Static210.anInt3764;
			Static210.anInt3764 = 0;
		} else {
			Static322.anInt4032 = 0;
		}
		Static194.anInt7614 = Static161.anInt2868 - Static370.anInt7659;
		if (Static194.anInt7614 < 0) {
			Static157.anInt2829 = -Static194.anInt7614;
			Static194.anInt7614 = 0;
		} else {
			Static157.anInt2829 = 0;
		}
		Static72.anInt1361 = Static59.anInt1066 + Static370.anInt7659;
		if (Static72.anInt1361 > Static251.anInt4344) {
			Static72.anInt1361 = Static251.anInt4344;
		}
		Static345.anInt6297 = Static161.anInt2868 + Static370.anInt7659;
		if (Static345.anInt6297 > Static219.anInt3872) {
			Static345.anInt6297 = Static219.anInt3872;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static370.anInt7659 + Static370.anInt7659 + 2; local74++) {
			for (local77 = 0; local77 < Static370.anInt7659 + Static370.anInt7659 + 2; local77++) {
				local84 = Static59.anInt1066 + local74 - Static370.anInt7659;
				local90 = Static161.anInt2868 + local77 - Static370.anInt7659;
				if (local84 >= 0 && local90 >= 0 && local84 < Static251.anInt4344 && local90 < Static219.anInt3872) {
					@Pc(104) int local104 = local84 << Static58.anInt1051;
					@Pc(108) int local108 = local90 << Static58.anInt1051;
					@Pc(124) int local124 = Static60.aClass70Array1[Static60.aClass70Array1.length - 1].I(local84, local90) - (0x3E8 << Static58.anInt1051 - 7);
					@Pc(144) int local144 = Static315.aClass70Array3 == null ? Static60.aClass70Array1[0].I(local84, local90) + Static297.anInt4985 : Static315.aClass70Array3[0].I(local84, local90) + Static297.anInt4985;
					Static418.aBooleanArrayArray11[local74][local77] = Static74.aClass121_3.SA(local104, local124, local108, local104, local144, local108);
				} else {
					Static418.aBooleanArrayArray11[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static370.anInt7659 + Static370.anInt7659 + 1; local77++) {
			for (local84 = 0; local84 < Static370.anInt7659 + Static370.anInt7659 + 1; local84++) {
				Static6.aBooleanArrayArray3[local77][local84] = Static418.aBooleanArrayArray11[local77][local84] || Static418.aBooleanArrayArray11[local77 + 1][local84] || Static418.aBooleanArrayArray11[local77][local84 + 1] || Static418.aBooleanArrayArray11[local77 + 1][local84 + 1];
			}
		}
		Static353.anIntArray470 = arg8;
		Static375.anIntArray572 = arg9;
		Static164.anIntArray222 = arg10;
		Static94.anIntArray91 = arg11;
		Static148.anIntArray548 = arg12;
		Static27.method381();
		Static4.method125();
		for (@Pc(260) Class36_Sub1 local260 = (Class36_Sub1) Static249.aClass242_3.method5503(); local260 != null; local260 = (Class36_Sub1) Static249.aClass242_3.method5506()) {
			local260.method5131();
			Static230.method3355(local260);
		}
		if (Static144.aBoolean211) {
			for (local90 = 0; local90 < Static121.anInt2306; local90++) {
				Static352.aClass253Array1[local90].method5772(arg17, arg1);
			}
		}
		if (arg2 > 1) {
			Static74.aClass121_3.method4632(0);
			if (Static68.aClass143_1 == null || Static68.aClass143_1 instanceof Class143_Sub2) {
				Static68.aClass143_1 = new Class143_Sub1();
			}
		} else if (Static68.aClass143_1 == null || Static68.aClass143_1 instanceof Class143_Sub1) {
			Static68.aClass143_1 = new Class143_Sub2();
		}
		Static68.aClass143_1.method5052(arg2);
		Static68.aClass143_1.method5054();
		if (Static33.aClass137ArrayArrayArray1 != null) {
			Static197.method3043(true);
			Static68.aClass143_1.method5053(22);
			Static411.method5584(arg2, null, 0, (byte) 0, arg15, arg16);
			Static68.aClass143_1.method5054();
			Static68.aClass143_1.method5053(23);
			Static197.method3043(false);
		}
		Static411.method5584(arg2, arg7, arg13, arg14, arg15, arg16);
		Static68.aClass143_1.method5054();
		Static68.aClass143_1.method5057();
		Static68.aClass143_1.method5054();
		if (arg2 > 1) {
			Static74.aClass121_3.method4609(0);
		}
		Static74.aClass121_3.method4591(0, null);
	}
}
