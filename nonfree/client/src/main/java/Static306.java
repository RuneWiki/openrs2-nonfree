import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
	public static int anInt4491;

	@OriginalMember(owner = "client!lp", name = "m", descriptor = "F")
	public static float aFloat112;

	@OriginalMember(owner = "client!lp", name = "n", descriptor = "Lclient!wr;")
	public static Class363 aClass363_4;

	@OriginalMember(owner = "client!lp", name = "p", descriptor = "I")
	public static int anInt4493;

	@OriginalMember(owner = "client!lp", name = "o", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_137 = new Class235(67, 8);

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZ)V")
	public static void method3651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		Static38.aBoolean55 = Static402.aClass134_11.method6955() > 0;
		Static401.aBoolean564 = true;
		Static258.anInt4643 = arg1 >> Static351.anInt5832;
		Static312.anInt5339 = arg3 >> Static351.anInt5832;
		Static75.anInt9088 = arg1;
		Static108.anInt2137 = arg3;
		Static276.anInt4813 = arg2;
		Static562.anInt9353 = Static258.anInt4643 - Static240.anInt4447;
		if (Static562.anInt9353 < 0) {
			Static424.anInt7346 = -Static562.anInt9353;
			Static562.anInt9353 = 0;
		} else {
			Static424.anInt7346 = 0;
		}
		Static426.anInt7375 = Static312.anInt5339 - Static240.anInt4447;
		if (Static426.anInt7375 < 0) {
			Static304.anInt5269 = -Static426.anInt7375;
			Static426.anInt7375 = 0;
		} else {
			Static304.anInt5269 = 0;
		}
		Static513.anInt8697 = Static258.anInt4643 + Static240.anInt4447;
		if (Static513.anInt8697 > Static27.anInt373) {
			Static513.anInt8697 = Static27.anInt373;
		}
		Static425.anInt7370 = Static312.anInt5339 + Static240.anInt4447;
		if (Static425.anInt7370 > Static507.anInt8645) {
			Static425.anInt7370 = Static507.anInt8645;
		}
		@Pc(70) boolean[][] local70 = Static44.aBooleanArrayArray1;
		@Pc(72) boolean[][] local72 = Static228.aBooleanArrayArray2;
		@Pc(76) int local76;
		@Pc(79) int local79;
		@Pc(86) int local86;
		@Pc(92) int local92;
		if (Static401.aBoolean564) {
			for (local76 = 0; local76 < Static240.anInt4447 + Static240.anInt4447 + 2; local76++) {
				for (local79 = 0; local79 < Static240.anInt4447 + Static240.anInt4447 + 2; local79++) {
					local86 = Static258.anInt4643 + local76 - Static240.anInt4447;
					local92 = Static312.anInt5339 + local79 - Static240.anInt4447;
					if (local86 >= 0 && local92 >= 0 && local86 < Static27.anInt373 && local92 < Static507.anInt8645) {
						@Pc(106) int local106 = local86 << Static351.anInt5832;
						@Pc(110) int local110 = local92 << Static351.anInt5832;
						@Pc(127) int local127 = Static216.aClass47Array2[Static216.aClass47Array2.length - 1].method7545(local86, local92) - (0x3E8 << Static351.anInt5832 - 7);
						@Pc(149) int local149 = Static557.aClass47Array3 == null ? Static216.aClass47Array2[0].method7545(local86, local92) + Static379.anInt6307 : Static557.aClass47Array3[0].method7545(local86, local92) + Static379.anInt6307;
						Static228.aBooleanArrayArray2[local76][local79] = Static402.aClass134_11.O(local106, local127, local110, local106, local149, local110);
					} else {
						Static228.aBooleanArrayArray2[local76][local79] = false;
					}
				}
			}
			for (local79 = 0; local79 < Static240.anInt4447 + Static240.anInt4447 + 1; local79++) {
				for (local86 = 0; local86 < Static240.anInt4447 + Static240.anInt4447 + 1; local86++) {
					Static44.aBooleanArrayArray1[local79][local86] = Static228.aBooleanArrayArray2[local79][local86] || Static228.aBooleanArrayArray2[local79 + 1][local86] || Static228.aBooleanArrayArray2[local79][local86 + 1] || Static228.aBooleanArrayArray2[local79 + 1][local86 + 1];
				}
			}
			Static344.anIntArray468 = arg5;
			Static1.anIntArray4 = arg6;
			Static536.anIntArray681 = arg7;
			Static522.anIntArray670 = arg8;
			Static403.anIntArray541 = arg9;
			Static220.method3414(Static402.aClass134_11, arg10);
		} else {
			if (Static347.aBooleanArrayArray5 == null) {
				Static347.aBooleanArrayArray5 = new boolean[Static27.anInt373 + Static27.anInt373 + 1][Static507.anInt8645 + Static27.anInt373 + 1];
				for (local76 = 0; local76 < Static347.aBooleanArrayArray5.length; local76++) {
					for (local79 = 0; local79 < Static347.aBooleanArrayArray5[0].length; local79++) {
						Static347.aBooleanArrayArray5[local76][local79] = true;
					}
				}
			}
			Static228.aBooleanArrayArray2 = Static347.aBooleanArrayArray5;
			Static44.aBooleanArrayArray1 = Static347.aBooleanArrayArray5;
			Static562.anInt9353 = 0;
			Static426.anInt7375 = 0;
			Static513.anInt8697 = Static27.anInt373;
			Static425.anInt7370 = Static507.anInt8645;
			Static117.anInt2295 = 0;
		}
		Static86.method1501(Static402.aClass134_11);
		for (@Pc(322) Class8_Sub5 local322 = (Class8_Sub5) Static544.aClass209_9.method4194(); local322 != null; local322 = (Class8_Sub5) Static544.aClass209_9.method4191()) {
			local322.method7615();
			Static331.method4528(local322);
		}
		if (Static38.aBoolean55) {
			for (local79 = 0; local79 < Static369.anInt6129; local79++) {
				Static172.aClass79Array1[local79].method1665(arg14, arg0);
			}
		}
		if (Static514.aBoolean677) {
			Static41.anIntArray82 = Static402.aClass134_11.v();
			Static402.aClass134_11.oa(Static316.anIntArray424);
			local79 = (Static316.anIntArray424[2] - Static316.anIntArray424[0]) / Static477.anInt8065;
			for (local86 = 0; local86 < Static477.anInt8065 - 1; local86++) {
				Static397.anIntArray736[local86] = local79 * (local86 + 1) + Static592.anIntArray737[local86];
			}
			for (local92 = 0; local92 < Static218.aClass144Array1.length; local92++) {
				Static218.aClass144Array1[local92].method3248();
			}
		}
		if (Static23.aClass39ArrayArrayArray1 != null) {
			if (Static514.aBoolean677) {
				Static262.method3784(0);
			}
			Static98.method5017(true);
			Static402.aClass134_11.CA(-1, 1583160, 40, 127);
			Static105.method1724(true, arg4, arg10, arg11);
			if (Static514.aBoolean677) {
				Static539.method7373();
			}
			Static402.aClass134_11.L();
			Static98.method5017(false);
		}
		Static105.method1724(false, arg4, arg10, arg11);
		if (Static514.aBoolean677) {
			for (local79 = 0; local79 < Static175.anInt9133; local79++) {
				Static49.aBooleanArrayArrayArray1[local79] = Static587.aBooleanArrayArrayArray2[local79];
			}
			Static262.method3784(0);
			for (local86 = 0; local86 < Static218.aClass144Array1.length; local86++) {
				Static218.aClass144Array1[local86].method3248();
			}
		}
		if (Static514.aBoolean677) {
			Static539.method7373();
			for (local79 = 0; local79 < Static175.anInt9133; local79++) {
				Static587.aBooleanArrayArrayArray2[local79] = Static49.aBooleanArrayArrayArray1[local79];
			}
			if (Static503.anInt8607 == 2) {
				@Pc(505) int local505;
				if (Static569.aLongArray26[0] < Static569.aLongArray26[1]) {
					if (Static397.anIntArray736[0] + Static592.anIntArray737[0] > Static316.anIntArray424[0]) {
						local505 = Static592.anIntArray737[0]++;
					}
				} else if (Static569.aLongArray26[0] > Static569.aLongArray26[1] && Static397.anIntArray736[0] + Static592.anIntArray737[0] < Static316.anIntArray424[2]) {
					local505 = Static592.anIntArray737[0]--;
				}
			}
		}
		if (!Static401.aBoolean564) {
			Static44.aBooleanArrayArray1 = local70;
			Static228.aBooleanArrayArray2 = local72;
		}
		Static259.method3766();
	}
}
