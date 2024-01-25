import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!el", name = "K", descriptor = "I")
	public static int anInt2888;

	@OriginalMember(owner = "client!el", name = "v", descriptor = "Lclient!ee;")
	public static final Class85 aClass85_1 = new Class85();

	@OriginalMember(owner = "client!el", name = "L", descriptor = "I")
	public static int anInt2889 = 999999;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(CB)Z")
	public static boolean method2373(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(III)Z")
	public static boolean method2374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class194 local15 = Static536.aClass146_4.method3721(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local15.method4708(arg0);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZ)V")
	public static void method2376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		Static239.aBoolean310 = Static68.aClass31_4.method8026() > 0;
		Static189.aBoolean281 = true;
		Static261.anInt5023 = arg1 >> Static385.anInt6657;
		Static216.anInt4499 = arg3 >> Static385.anInt6657;
		Static459.anInt8015 = arg1;
		Static466.anInt8096 = arg3;
		Static422.anInt7522 = arg2;
		Static61.anInt1673 = Static261.anInt5023 - Static219.anInt4585;
		if (Static61.anInt1673 < 0) {
			Static561.anInt9766 = -Static61.anInt1673;
			Static61.anInt1673 = 0;
		} else {
			Static561.anInt9766 = 0;
		}
		Static439.anInt7775 = Static216.anInt4499 - Static219.anInt4585;
		if (Static439.anInt7775 < 0) {
			Static288.anInt5391 = -Static439.anInt7775;
			Static439.anInt7775 = 0;
		} else {
			Static288.anInt5391 = 0;
		}
		Static586.anInt10185 = Static261.anInt5023 + Static219.anInt4585;
		if (Static586.anInt10185 > Static349.anInt6237) {
			Static586.anInt10185 = Static349.anInt6237;
		}
		Static430.anInt7618 = Static216.anInt4499 + Static219.anInt4585;
		if (Static430.anInt7618 > Static414.anInt7451) {
			Static430.anInt7618 = Static414.anInt7451;
		}
		@Pc(70) boolean[][] local70 = Static209.aBooleanArrayArray11;
		@Pc(72) boolean[][] local72 = Static290.aBooleanArrayArray6;
		@Pc(76) int local76;
		@Pc(79) int local79;
		@Pc(86) int local86;
		@Pc(92) int local92;
		if (Static189.aBoolean281) {
			for (local76 = 0; local76 < Static219.anInt4585 + Static219.anInt4585 + 2; local76++) {
				for (local79 = 0; local79 < Static219.anInt4585 + Static219.anInt4585 + 2; local79++) {
					local86 = Static261.anInt5023 + local76 - Static219.anInt4585;
					local92 = Static216.anInt4499 + local79 - Static219.anInt4585;
					if (local86 >= 0 && local92 >= 0 && local86 < Static349.anInt6237 && local92 < Static414.anInt7451) {
						@Pc(106) int local106 = local86 << Static385.anInt6657;
						@Pc(110) int local110 = local92 << Static385.anInt6657;
						@Pc(127) int local127 = Static420.aClass127Array6[Static420.aClass127Array6.length - 1].method7862(local92, local86) - (0x3E8 << Static385.anInt6657 - 7);
						@Pc(149) int local149 = Static108.aClass127Array5 == null ? Static420.aClass127Array6[0].method7862(local92, local86) + Static331.anInt6010 : Static108.aClass127Array5[0].method7862(local92, local86) + Static331.anInt6010;
						Static290.aBooleanArrayArray6[local76][local79] = Static68.aClass31_4.O(local106, local127, local110, local106, local149, local110);
					} else {
						Static290.aBooleanArrayArray6[local76][local79] = false;
					}
				}
			}
			for (local79 = 0; local79 < Static219.anInt4585 + Static219.anInt4585 + 1; local79++) {
				for (local86 = 0; local86 < Static219.anInt4585 + Static219.anInt4585 + 1; local86++) {
					Static209.aBooleanArrayArray11[local79][local86] = Static290.aBooleanArrayArray6[local79][local86] || Static290.aBooleanArrayArray6[local79 + 1][local86] || Static290.aBooleanArrayArray6[local79][local86 + 1] || Static290.aBooleanArrayArray6[local79 + 1][local86 + 1];
				}
			}
			Static25.anIntArray16 = arg5;
			Static285.anIntArray254 = arg6;
			Static240.anIntArray225 = arg7;
			Static504.anIntArray519 = arg8;
			Static446.anIntArray470 = arg9;
			Static495.method6686(arg10, Static68.aClass31_4);
		} else {
			if (Static35.aBooleanArrayArray1 == null) {
				Static35.aBooleanArrayArray1 = new boolean[Static349.anInt6237 + Static349.anInt6237 + 1][Static414.anInt7451 + Static349.anInt6237 + 1];
				for (local76 = 0; local76 < Static35.aBooleanArrayArray1.length; local76++) {
					for (local79 = 0; local79 < Static35.aBooleanArrayArray1[0].length; local79++) {
						Static35.aBooleanArrayArray1[local76][local79] = true;
					}
				}
			}
			Static290.aBooleanArrayArray6 = Static35.aBooleanArrayArray1;
			Static209.aBooleanArrayArray11 = Static35.aBooleanArrayArray1;
			Static61.anInt1673 = 0;
			Static439.anInt7775 = 0;
			Static586.anInt10185 = Static349.anInt6237;
			Static430.anInt7618 = Static414.anInt7451;
			Static473.anInt8222 = 0;
		}
		Static163.method1108(Static68.aClass31_4);
		for (@Pc(322) Class25_Sub10 local322 = (Class25_Sub10) Static545.aClass269_10.method5974(); local322 != null; local322 = (Class25_Sub10) Static545.aClass269_10.method5979()) {
			local322.method6959();
			Static464.method6363(local322);
		}
		if (Static239.aBoolean310) {
			for (local79 = 0; local79 < Static346.anInt6230; local79++) {
				Static196.aClass235Array1[local79].method5260(arg0, arg14);
			}
		}
		if (Static538.aBoolean626) {
			Static445.anIntArray468 = Static68.aClass31_4.v();
			Static68.aClass31_4.oa(Static88.anIntArray75);
			local79 = (Static88.anIntArray75[2] - Static88.anIntArray75[0]) / Static557.anInt6112;
			for (local86 = 0; local86 < Static557.anInt6112 - 1; local86++) {
				Static264.anIntArray238[local86] = local79 * (local86 + 1) + Static396.anIntArray393[local86];
			}
			for (local92 = 0; local92 < Static242.aClass176Array1.length; local92++) {
				Static242.aClass176Array1[local92].method4283();
			}
		}
		if (Static590.aClass333ArrayArrayArray3 != null) {
			if (Static538.aBoolean626) {
				Static386.method5378(0);
			}
			Static593.method8145(true);
			Static68.aClass31_4.CA(-1, 1583160, 40, 127);
			Static389.method6667(true, arg4, arg10, arg11);
			if (Static538.aBoolean626) {
				Static326.method4811();
			}
			Static68.aClass31_4.L();
			Static593.method8145(false);
		}
		Static389.method6667(false, arg4, arg10, arg11);
		if (Static538.aBoolean626) {
			for (local79 = 0; local79 < Static590.anInt10277; local79++) {
				Static540.aBooleanArrayArrayArray2[local79] = Static205.aBooleanArrayArrayArray1[local79];
			}
			Static386.method5378(0);
			for (local86 = 0; local86 < Static242.aClass176Array1.length; local86++) {
				Static242.aClass176Array1[local86].method4283();
			}
		}
		if (Static538.aBoolean626) {
			Static326.method4811();
			for (local79 = 0; local79 < Static590.anInt10277; local79++) {
				Static205.aBooleanArrayArrayArray1[local79] = Static540.aBooleanArrayArrayArray2[local79];
			}
			if (Static553.anInt9663 == 2) {
				@Pc(505) int local505;
				if (Static525.aLongArray14[0] < Static525.aLongArray14[1]) {
					if (Static264.anIntArray238[0] + Static396.anIntArray393[0] > Static88.anIntArray75[0]) {
						local505 = Static396.anIntArray393[0]++;
					}
				} else if (Static525.aLongArray14[0] > Static525.aLongArray14[1] && Static264.anIntArray238[0] + Static396.anIntArray393[0] < Static88.anIntArray75[2]) {
					local505 = Static396.anIntArray393[0]--;
				}
			}
		}
		if (!Static189.aBoolean281) {
			Static209.aBooleanArrayArray11 = local70;
			Static290.aBooleanArrayArray6 = local72;
		}
		Static23.method227();
	}
}
