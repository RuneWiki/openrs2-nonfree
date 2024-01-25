import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static584 {

	@OriginalMember(owner = "client!wi", name = "r", descriptor = "Lclient!oo;")
	public static Class247 aClass247_14;

	@OriginalMember(owner = "client!wi", name = "m", descriptor = "Z")
	public static boolean aBoolean846 = false;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!oa;IILclient!q;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method8299(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class255 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static338.aClass15_11 = arg0;
		Static236.anInt4895 = arg1;
		Static67.aClass255_10 = arg3;
		Static392.aBoolean641 = Static338.aClass15_11.method5329() > 0;
		Static342.anInt6991 = arg4 >> Static309.anInt6172;
		Static484.anInt9030 = arg6 >> Static309.anInt6172;
		Static238.anInt9925 = arg4;
		Static327.anInt6816 = arg6;
		Static562.anInt9990 = arg5;
		Static10.anInt363 = Static342.anInt6991 - Static403.anInt7929;
		if (Static10.anInt363 < 0) {
			Static187.anInt3745 = -Static10.anInt363;
			Static10.anInt363 = 0;
		} else {
			Static187.anInt3745 = 0;
		}
		Static123.anInt2876 = Static484.anInt9030 - Static403.anInt7929;
		if (Static123.anInt2876 < 0) {
			Static1.anInt63 = -Static123.anInt2876;
			Static123.anInt2876 = 0;
		} else {
			Static1.anInt63 = 0;
		}
		Static251.anInt5429 = Static342.anInt6991 + Static403.anInt7929;
		if (Static251.anInt5429 > Static223.anInt4520) {
			Static251.anInt5429 = Static223.anInt4520;
		}
		Static341.anInt6986 = Static484.anInt9030 + Static403.anInt7929;
		if (Static341.anInt6986 > Static416.anInt10065) {
			Static341.anInt6986 = Static416.anInt10065;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static403.anInt7929 + Static403.anInt7929 + 2; local74++) {
			for (local77 = 0; local77 < Static403.anInt7929 + Static403.anInt7929 + 2; local77++) {
				local84 = Static342.anInt6991 + local74 - Static403.anInt7929;
				local90 = Static484.anInt9030 + local77 - Static403.anInt7929;
				if (local84 >= 0 && local90 >= 0 && local84 < Static223.anInt4520 && local90 < Static416.anInt10065) {
					@Pc(104) int local104 = local84 << Static309.anInt6172;
					@Pc(108) int local108 = local90 << Static309.anInt6172;
					@Pc(124) int local124 = Static381.aClass4Array2[Static381.aClass4Array2.length - 1].JA(local84, local90) - (0x3E8 << Static309.anInt6172 - 7);
					@Pc(144) int local144 = Static495.aClass4Array4 == null ? Static381.aClass4Array2[0].JA(local84, local90) + Static480.anInt8971 : Static495.aClass4Array4[0].JA(local84, local90) + Static480.anInt8971;
					Static281.aBooleanArrayArray2[local74][local77] = Static338.aClass15_11.FA(local104, local124, local108, local104, local144, local108);
				} else {
					Static281.aBooleanArrayArray2[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static403.anInt7929 + Static403.anInt7929 + 1; local77++) {
			for (local84 = 0; local84 < Static403.anInt7929 + Static403.anInt7929 + 1; local84++) {
				Static331.aBooleanArrayArray3[local77][local84] = Static281.aBooleanArrayArray2[local77][local84] || Static281.aBooleanArrayArray2[local77 + 1][local84] || Static281.aBooleanArrayArray2[local77][local84 + 1] || Static281.aBooleanArrayArray2[local77 + 1][local84 + 1];
			}
		}
		Static20.anIntArray16 = arg8;
		Static494.anIntArray521 = arg9;
		Static379.anIntArray472 = arg10;
		Static257.anIntArray331 = arg11;
		Static494.anIntArray522 = arg12;
		Static196.method3330();
		Static405.method6588(Static338.aClass15_11);
		for (@Pc(261) Class55_Sub6 local261 = (Class55_Sub6) Static166.aClass134_4.method3233(); local261 != null; local261 = (Class55_Sub6) Static166.aClass134_4.method3230()) {
			local261.method7112();
			Static216.method3756(local261);
		}
		if (Static392.aBoolean641) {
			for (local90 = 0; local90 < Static464.anInt8684; local90++) {
				Static464.aClass212Array1[local90].method5548(arg1, arg17);
			}
		}
		if (arg2 > 1) {
			Static338.aClass15_11.method5340(0);
			if (Static415.aClass89_1 == null || Static415.aClass89_1 instanceof Class89_Sub1) {
				Static415.aClass89_1 = new Class89_Sub2();
			}
		} else if (Static415.aClass89_1 == null || Static415.aClass89_1 instanceof Class89_Sub2) {
			Static415.aClass89_1 = new Class89_Sub1();
		}
		Static415.aClass89_1.method3863(arg2);
		Static415.aClass89_1.method3864();
		if (Static191.aClass125ArrayArrayArray1 != null) {
			Static571.method8173(true);
			Static415.aClass89_1.method3862(22);
			Static372.method6077(arg2, null, 0, (byte) 0, arg15, arg16);
			Static415.aClass89_1.method3864();
			Static415.aClass89_1.method3862(23);
			Static571.method8173(false);
		}
		Static372.method6077(arg2, arg7, arg13, arg14, arg15, arg16);
		Static415.aClass89_1.method3864();
		Static415.aClass89_1.method3867();
		Static415.aClass89_1.method3864();
		if (arg2 > 1) {
			Static338.aClass15_11.method5317(0);
		}
		Static338.aClass15_11.method5353(0, null);
	}
}
