import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!nda", name = "cb", descriptor = "[Lclient!vw;")
	public static Class355[] aClass355Array1;

	@OriginalMember(owner = "client!nda", name = "db", descriptor = "I")
	public static int anInt6121;

	@OriginalMember(owner = "client!nda", name = "E", descriptor = "Lclient!kj;")
	public static final Class187 aClass187_12 = new Class187(0, 4);

	@OriginalMember(owner = "client!nda", name = "F", descriptor = "[I")
	public static final int[] anIntArray481 = new int[25];

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZ)V")
	public static void method5290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		Static21.aBoolean44 = Static482.aClass43_12.method7159() > 0;
		Static231.aBoolean340 = true;
		Static210.anInt4205 = arg1 >> Static458.anInt7508;
		Static12.anInt136 = arg3 >> Static458.anInt7508;
		Static93.anInt2300 = arg1;
		Static321.anInt5796 = arg3;
		Static311.anInt5621 = arg2;
		Static269.anInt5039 = Static210.anInt4205 - Static266.anInt4982;
		if (Static269.anInt5039 < 0) {
			Static383.anInt6590 = -Static269.anInt5039;
			Static269.anInt5039 = 0;
		} else {
			Static383.anInt6590 = 0;
		}
		Static115.anInt2655 = Static12.anInt136 - Static266.anInt4982;
		if (Static115.anInt2655 < 0) {
			Static17.anInt271 = -Static115.anInt2655;
			Static115.anInt2655 = 0;
		} else {
			Static17.anInt271 = 0;
		}
		Static498.anInt7923 = Static210.anInt4205 + Static266.anInt4982;
		if (Static498.anInt7923 > Static411.anInt6927) {
			Static498.anInt7923 = Static411.anInt6927;
		}
		Static191.anInt3711 = Static12.anInt136 + Static266.anInt4982;
		if (Static191.anInt3711 > Static157.anInt3168) {
			Static191.anInt3711 = Static157.anInt3168;
		}
		@Pc(70) boolean[][] local70 = Static356.aBooleanArrayArray5;
		@Pc(72) boolean[][] local72 = Static197.aBooleanArrayArray1;
		@Pc(76) int local76;
		@Pc(79) int local79;
		@Pc(86) int local86;
		@Pc(92) int local92;
		if (Static231.aBoolean340) {
			for (local76 = 0; local76 < Static266.anInt4982 + Static266.anInt4982 + 2; local76++) {
				for (local79 = 0; local79 < Static266.anInt4982 + Static266.anInt4982 + 2; local79++) {
					local86 = Static210.anInt4205 + local76 - Static266.anInt4982;
					local92 = Static12.anInt136 + local79 - Static266.anInt4982;
					if (local86 >= 0 && local92 >= 0 && local86 < Static411.anInt6927 && local92 < Static157.anInt3168) {
						@Pc(106) int local106 = local86 << Static458.anInt7508;
						@Pc(110) int local110 = local92 << Static458.anInt7508;
						@Pc(127) int local127 = Static374.aClass139Array17[Static374.aClass139Array17.length - 1].method6889(local86, local92) - (0x3E8 << Static458.anInt7508 - 7);
						@Pc(149) int local149 = Static168.aClass139Array22 == null ? Static374.aClass139Array17[0].method6889(local86, local92) + Static511.anInt8116 : Static168.aClass139Array22[0].method6889(local86, local92) + Static511.anInt8116;
						Static197.aBooleanArrayArray1[local76][local79] = Static482.aClass43_12.O(local106, local127, local110, local106, local149, local110);
					} else {
						Static197.aBooleanArrayArray1[local76][local79] = false;
					}
				}
			}
			for (local79 = 0; local79 < Static266.anInt4982 + Static266.anInt4982 + 1; local79++) {
				for (local86 = 0; local86 < Static266.anInt4982 + Static266.anInt4982 + 1; local86++) {
					Static356.aBooleanArrayArray5[local79][local86] = Static197.aBooleanArrayArray1[local79][local86] || Static197.aBooleanArrayArray1[local79 + 1][local86] || Static197.aBooleanArrayArray1[local79][local86 + 1] || Static197.aBooleanArrayArray1[local79 + 1][local86 + 1];
				}
			}
			Static311.anIntArray427 = arg5;
			Static226.anIntArray354 = arg6;
			Static8.anIntArray14 = arg7;
			Static334.anIntArray460 = arg8;
			Static189.anIntArray312 = arg9;
			Static368.method5481(arg10, Static482.aClass43_12);
		} else {
			if (Static513.aBooleanArrayArray7 == null) {
				Static513.aBooleanArrayArray7 = new boolean[Static411.anInt6927 + Static411.anInt6927 + 1][Static157.anInt3168 + Static411.anInt6927 + 1];
				for (local76 = 0; local76 < Static513.aBooleanArrayArray7.length; local76++) {
					for (local79 = 0; local79 < Static513.aBooleanArrayArray7[0].length; local79++) {
						Static513.aBooleanArrayArray7[local76][local79] = true;
					}
				}
			}
			Static197.aBooleanArrayArray1 = Static513.aBooleanArrayArray7;
			Static356.aBooleanArrayArray5 = Static513.aBooleanArrayArray7;
			Static269.anInt5039 = 0;
			Static115.anInt2655 = 0;
			Static498.anInt7923 = Static411.anInt6927;
			Static191.anInt3711 = Static157.anInt3168;
			Static123.anInt2786 = 0;
		}
		Static210.method3722(Static482.aClass43_12);
		for (@Pc(322) Class9_Sub2 local322 = (Class9_Sub2) Static120.aClass309_5.method6590(); local322 != null; local322 = (Class9_Sub2) Static120.aClass309_5.method6594()) {
			local322.method7465();
			Static501.method6757(local322);
		}
		if (Static21.aBoolean44) {
			for (local79 = 0; local79 < Static218.anInt4299; local79++) {
				Static569.aClass258Array1[local79].method5863(arg14, arg0);
			}
		}
		if (Static495.aBoolean622) {
			Static242.anIntArray364 = Static482.aClass43_12.v();
			Static482.aClass43_12.oa(Static47.anIntArray93);
			local79 = (Static47.anIntArray93[2] - Static47.anIntArray93[0]) / Static77.anInt1994;
			for (local86 = 0; local86 < Static77.anInt1994 - 1; local86++) {
				Static228.anIntArray130[local86] = local79 * (local86 + 1) + Static188.anIntArray309[local86];
			}
			for (local92 = 0; local92 < Static488.aClass313Array1.length; local92++) {
				Static488.aClass313Array1[local92].method6676();
			}
		}
		if (Static492.aClass63ArrayArrayArray3 != null) {
			if (Static495.aBoolean622) {
				Static363.method5458(0);
			}
			Static226.method3890(true);
			Static482.aClass43_12.CA(-1, 1583160, 40, 127);
			Static327.method5084(true, arg4, arg10, arg11);
			if (Static495.aBoolean622) {
				Static220.method3819();
			}
			Static482.aClass43_12.L();
			Static226.method3890(false);
		}
		Static327.method5084(false, arg4, arg10, arg11);
		if (Static495.aBoolean622) {
			for (local79 = 0; local79 < Static499.anInt7950; local79++) {
				Static48.aBooleanArrayArrayArray1[local79] = Static385.aBooleanArrayArrayArray2[local79];
			}
			Static363.method5458(0);
			for (local86 = 0; local86 < Static488.aClass313Array1.length; local86++) {
				Static488.aClass313Array1[local86].method6676();
			}
		}
		if (Static495.aBoolean622) {
			Static220.method3819();
			for (local79 = 0; local79 < Static499.anInt7950; local79++) {
				Static385.aBooleanArrayArrayArray2[local79] = Static48.aBooleanArrayArrayArray1[local79];
			}
			if (Static138.anInt2946 == 2) {
				@Pc(505) int local505;
				if (Static455.aLongArray12[0] < Static455.aLongArray12[1]) {
					if (Static228.anIntArray130[0] + Static188.anIntArray309[0] > Static47.anIntArray93[0]) {
						local505 = Static188.anIntArray309[0]++;
					}
				} else if (Static455.aLongArray12[0] > Static455.aLongArray12[1] && Static228.anIntArray130[0] + Static188.anIntArray309[0] < Static47.anIntArray93[2]) {
					local505 = Static188.anIntArray309[0]--;
				}
			}
		}
		if (!Static231.aBoolean340) {
			Static356.aBooleanArrayArray5 = local70;
			Static197.aBooleanArrayArray1 = local72;
		}
		Static339.method5175();
	}
}
