import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!iq", name = "L", descriptor = "I")
	public static int anInt3529;

	@OriginalMember(owner = "client!iq", name = "db", descriptor = "Lclient!pg;")
	public static Class192 aClass192_1;

	@OriginalMember(owner = "client!iq", name = "K", descriptor = "I")
	public static int anInt3528 = 0;

	@OriginalMember(owner = "client!iq", name = "N", descriptor = "Lclient!dc;")
	public static final Class44 aClass44_25 = new Class44(8);

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!eq;IILclient!gs;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method2927(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class5 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static165.aClass66_8 = arg0;
		Static226.anInt5628 = arg1;
		Static185.aClass5_2 = arg3;
		Static285.aBoolean434 = Static165.aClass66_8.method5012() > 0;
		Static6.anInt253 = arg4 >> Static62.anInt1705;
		Static370.anInt6673 = arg6 >> Static62.anInt1705;
		Static332.anInt5784 = arg4;
		Static440.anInt7781 = arg6;
		Static32.anInt6598 = arg5;
		Static211.anInt3900 = Static6.anInt253 - Static195.anInt7212;
		if (Static211.anInt3900 < 0) {
			Static358.anInt6378 = -Static211.anInt3900;
			Static211.anInt3900 = 0;
		} else {
			Static358.anInt6378 = 0;
		}
		Static238.anInt4363 = Static370.anInt6673 - Static195.anInt7212;
		if (Static238.anInt4363 < 0) {
			Static53.anInt1469 = -Static238.anInt4363;
			Static238.anInt4363 = 0;
		} else {
			Static53.anInt1469 = 0;
		}
		Static163.anInt3256 = Static6.anInt253 + Static195.anInt7212;
		if (Static163.anInt3256 > Static229.anInt4189) {
			Static163.anInt3256 = Static229.anInt4189;
		}
		Static103.anInt2239 = Static370.anInt6673 + Static195.anInt7212;
		if (Static103.anInt2239 > Static61.anInt1698) {
			Static103.anInt2239 = Static61.anInt1698;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static195.anInt7212 + Static195.anInt7212 + 2; local74++) {
			for (local77 = 0; local77 < Static195.anInt7212 + Static195.anInt7212 + 2; local77++) {
				local84 = Static6.anInt253 + local74 - Static195.anInt7212;
				local90 = Static370.anInt6673 + local77 - Static195.anInt7212;
				if (local84 >= 0 && local90 >= 0 && local84 < Static229.anInt4189 && local90 < Static61.anInt1698) {
					@Pc(104) int local104 = local84 << Static62.anInt1705;
					@Pc(108) int local108 = local90 << Static62.anInt1705;
					@Pc(124) int local124 = Static87.aClass86Array2[Static87.aClass86Array2.length - 1].method6594(local84, local90) - (0x3E8 << Static62.anInt1705 - 7);
					@Pc(144) int local144 = Static288.aClass86Array3 == null ? Static87.aClass86Array2[0].method6594(local84, local90) + Static168.anInt3377 : Static288.aClass86Array3[0].method6594(local84, local90) + Static168.anInt3377;
					Static59.aBooleanArrayArray4[local74][local77] = Static165.aClass66_8.method5054(local104, local124, local108, local104, local144, local108);
				} else {
					Static59.aBooleanArrayArray4[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static195.anInt7212 + Static195.anInt7212 + 1; local77++) {
			for (local84 = 0; local84 < Static195.anInt7212 + Static195.anInt7212 + 1; local84++) {
				Static202.aBooleanArrayArray7[local77][local84] = Static59.aBooleanArrayArray4[local77][local84] || Static59.aBooleanArrayArray4[local77 + 1][local84] || Static59.aBooleanArrayArray4[local77][local84 + 1] || Static59.aBooleanArrayArray4[local77 + 1][local84 + 1];
			}
		}
		Static404.anIntArray497 = arg8;
		Static244.anIntArray543 = arg9;
		Static172.anIntArray217 = arg10;
		Static411.anIntArray506 = arg11;
		Static189.anIntArray231 = arg12;
		Static382.method3575();
		Static266.method1438();
		for (@Pc(260) Class57_Sub2 local260 = (Class57_Sub2) Static385.aClass111_8.method2688(); local260 != null; local260 = (Class57_Sub2) Static385.aClass111_8.method2690()) {
			local260.method5359();
			Static29.method713(local260);
		}
		if (Static285.aBoolean434) {
			for (local90 = 0; local90 < Static56.anInt1522; local90++) {
				Static411.aClass76Array1[local90].method1933(arg17, arg1);
			}
		}
		if (arg2 > 1) {
			Static165.aClass66_8.method5073(0);
			if (Static401.aClass120_1 == null || Static401.aClass120_1 instanceof Class120_Sub1) {
				Static401.aClass120_1 = new Class120_Sub2();
			}
		} else if (Static401.aClass120_1 == null || Static401.aClass120_1 instanceof Class120_Sub2) {
			Static401.aClass120_1 = new Class120_Sub1();
		}
		Static401.aClass120_1.method6076(arg2);
		Static401.aClass120_1.method6079();
		if (Static147.aClass101ArrayArrayArray1 != null) {
			Static35.method860(true);
			Static401.aClass120_1.method6077(22);
			Static195.method5949(arg2, null, 0, (byte) 0, arg15, arg16);
			Static401.aClass120_1.method6079();
			Static401.aClass120_1.method6077(23);
			Static35.method860(false);
		}
		Static195.method5949(arg2, arg7, arg13, arg14, arg15, arg16);
		Static401.aClass120_1.method6079();
		Static401.aClass120_1.method6080();
		Static401.aClass120_1.method6079();
		if (arg2 > 1) {
			Static165.aClass66_8.method5047(0);
		}
		Static165.aClass66_8.method5000(0, null);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIII)V")
	public static void method2929(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1) {
		Static172.anInt3442 = 0;
		Static165.anInt3313 = 0;
		Static152.anInt3132 = arg0;
		Static324.anInt5590 = arg1;
	}
}
