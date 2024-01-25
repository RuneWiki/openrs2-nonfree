import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!se", name = "r", descriptor = "I")
	public static int anInt6389;

	@OriginalMember(owner = "client!se", name = "t", descriptor = "[Lclient!f;")
	public static Class3[] aClass3Array14;

	@OriginalMember(owner = "client!se", name = "e", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_85 = new Class242("Self", "Mich", "Moi", "Eu");

	@OriginalMember(owner = "client!se", name = "h", descriptor = "I")
	public static int anInt6380 = 16777215;

	@OriginalMember(owner = "client!se", name = "o", descriptor = "I")
	public static int anInt6386 = 0;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!qa;IILclient!ia;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method4974(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class116 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static42.aClass30_3 = arg0;
		Static17.anInt523 = arg1;
		Static398.aClass116_5 = arg3;
		Static412.aBoolean474 = Static42.aClass30_3.method4657() > 0;
		Static50.anInt1363 = arg4 >> Static372.anInt7558;
		Static354.anInt6362 = arg6 >> Static372.anInt7558;
		Static284.anInt5181 = arg4;
		Static113.anInt2415 = arg6;
		Static381.anInt6689 = arg5;
		Static127.anInt2572 = Static50.anInt1363 - Static116.anInt2459;
		if (Static127.anInt2572 < 0) {
			Static430.anInt7168 = -Static127.anInt2572;
			Static127.anInt2572 = 0;
		} else {
			Static430.anInt7168 = 0;
		}
		Static180.anInt3345 = Static354.anInt6362 - Static116.anInt2459;
		if (Static180.anInt3345 < 0) {
			Static312.anInt5608 = -Static180.anInt3345;
			Static180.anInt3345 = 0;
		} else {
			Static312.anInt5608 = 0;
		}
		Static59.anInt1569 = Static50.anInt1363 + Static116.anInt2459;
		if (Static59.anInt1569 > Static301.anInt5434) {
			Static59.anInt1569 = Static301.anInt5434;
		}
		Static65.anInt1629 = Static354.anInt6362 + Static116.anInt2459;
		if (Static65.anInt1629 > Static241.anInt4414) {
			Static65.anInt1629 = Static241.anInt4414;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static116.anInt2459 + Static116.anInt2459 + 2; local74++) {
			for (local77 = 0; local77 < Static116.anInt2459 + Static116.anInt2459 + 2; local77++) {
				local84 = Static50.anInt1363 + local74 - Static116.anInt2459;
				local90 = Static354.anInt6362 + local77 - Static116.anInt2459;
				if (local84 >= 0 && local90 >= 0 && local84 < Static301.anInt5434 && local90 < Static241.anInt4414) {
					@Pc(104) int local104 = local84 << Static372.anInt7558;
					@Pc(108) int local108 = local90 << Static372.anInt7558;
					@Pc(124) int local124 = Static422.aClass146Array3[Static422.aClass146Array3.length - 1].I(local84, local90) - (0x3E8 << Static372.anInt7558 - 7);
					@Pc(144) int local144 = Static117.aClass146Array1 == null ? Static422.aClass146Array3[0].I(local84, local90) + Static205.anInt3908 : Static117.aClass146Array1[0].I(local84, local90) + Static205.anInt3908;
					Static249.aBooleanArrayArray4[local74][local77] = Static42.aClass30_3.SA(local104, local124, local108, local104, local144, local108);
				} else {
					Static249.aBooleanArrayArray4[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static116.anInt2459 + Static116.anInt2459 + 1; local77++) {
			for (local84 = 0; local84 < Static116.anInt2459 + Static116.anInt2459 + 1; local84++) {
				Static282.aBooleanArrayArray5[local77][local84] = Static249.aBooleanArrayArray4[local77][local84] || Static249.aBooleanArrayArray4[local77 + 1][local84] || Static249.aBooleanArrayArray4[local77][local84 + 1] || Static249.aBooleanArrayArray4[local77 + 1][local84 + 1];
			}
		}
		Static90.anIntArray125 = arg8;
		Static146.anIntArray196 = arg9;
		Static81.anIntArray118 = arg10;
		Static149.anIntArray234 = arg11;
		Static391.anIntArray594 = arg12;
		Static391.method5274();
		Static157.method2329();
		for (@Pc(260) Class41_Sub6 local260 = (Class41_Sub6) Static43.aClass27_2.method730(); local260 != null; local260 = (Class41_Sub6) Static43.aClass27_2.method735()) {
			local260.method5818();
			Static385.method4427(local260);
		}
		if (Static412.aBoolean474) {
			for (local90 = 0; local90 < Static340.anInt6033; local90++) {
				Static200.aClass169Array1[local90].method3733(arg17, arg1);
			}
		}
		if (arg2 > 1) {
			Static42.aClass30_3.method4685(0);
			if (Static275.aClass16_1 == null || Static275.aClass16_1 instanceof Class16_Sub1) {
				Static275.aClass16_1 = new Class16_Sub2();
			}
		} else if (Static275.aClass16_1 == null || Static275.aClass16_1 instanceof Class16_Sub2) {
			Static275.aClass16_1 = new Class16_Sub1();
		}
		Static275.aClass16_1.method5256(arg2);
		Static275.aClass16_1.method5252();
		if (Static39.aClass53ArrayArrayArray3 != null) {
			Static171.method2497(true);
			Static275.aClass16_1.method5250(22);
			Static329.method4480(arg2, null, 0, (byte) 0, arg15, arg16);
			Static275.aClass16_1.method5252();
			Static275.aClass16_1.method5250(23);
			Static171.method2497(false);
		}
		Static329.method4480(arg2, arg7, arg13, arg14, arg15, arg16);
		Static275.aClass16_1.method5252();
		Static275.aClass16_1.method5257();
		Static275.aClass16_1.method5252();
		if (arg2 > 1) {
			Static42.aClass30_3.method4673(0);
		}
		Static42.aClass30_3.method4706(0, null);
	}
}
