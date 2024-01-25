import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!mu", name = "v", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_74 = new Class179(75, 16);

	@OriginalMember(owner = "client!mu", name = "A", descriptor = "Z")
	public static boolean aBoolean420 = false;

	@OriginalMember(owner = "client!mu", name = "D", descriptor = "Z")
	public static boolean aBoolean421 = false;

	@OriginalMember(owner = "client!mu", name = "H", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray6 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(BII)Z")
	public static boolean method4883(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(BII)Z")
	public static boolean method4886(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
	public static void method4887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16, @OriginalArg(18) boolean arg17) {
		Static436.aBoolean530 = true;
		Static218.aBoolean734 = Static207.aClass95_6.method6994() > 0;
		Static63.aBoolean731 = true;
		Static566.anInt9234 = arg1 >> Static609.anInt9827;
		Static370.anInt5837 = arg3 >> Static609.anInt9827;
		Static23.anInt553 = arg1;
		Static516.anInt6572 = arg3;
		Static572.anInt9322 = arg2;
		Static65.anInt1178 = Static566.anInt9234 - Static335.anInt5343;
		if (Static65.anInt1178 < 0) {
			Static114.anInt2087 = -Static65.anInt1178;
			Static65.anInt1178 = 0;
		} else {
			Static114.anInt2087 = 0;
		}
		Static264.anInt4263 = Static370.anInt5837 - Static335.anInt5343;
		if (Static264.anInt4263 < 0) {
			Static446.anInt9077 = -Static264.anInt4263;
			Static264.anInt4263 = 0;
		} else {
			Static446.anInt9077 = 0;
		}
		Static85.anInt6703 = Static566.anInt9234 + Static335.anInt5343;
		if (Static85.anInt6703 > Static322.anInt5120) {
			Static85.anInt6703 = Static322.anInt5120;
		}
		Static326.anInt5206 = Static370.anInt5837 + Static335.anInt5343;
		if (Static326.anInt5206 > Class13_Sub1_Sub4_Sub1.lb) {
			Static326.anInt5206 = Class13_Sub1_Sub4_Sub1.lb;
		}
		@Pc(72) boolean[][] local72 = Static494.aBooleanArrayArray8;
		@Pc(74) boolean[][] local74 = Static186.aBooleanArrayArray5;
		@Pc(78) int local78;
		@Pc(81) int local81;
		@Pc(83) int local83;
		if (Static63.aBoolean731) {
			for (local78 = 0; local78 < Static335.anInt5343 + Static335.anInt5343 + 2; local78++) {
				local81 = 0;
				local83 = 0;
				for (@Pc(85) int local85 = 0; local85 < Static335.anInt5343 + Static335.anInt5343 + 2; local85++) {
					if (local85 > 1) {
						Static541.anIntArray603[local85 - 2] = local81;
					}
					local81 = local83;
					@Pc(103) int local103 = Static566.anInt9234 + local78 - Static335.anInt5343;
					@Pc(109) int local109 = Static370.anInt5837 + local85 - Static335.anInt5343;
					@Pc(123) int local123;
					if (local103 >= 0 && local109 >= 0 && local103 < Static322.anInt5120 && local109 < Class13_Sub1_Sub4_Sub1.lb) {
						local123 = local103 << Static609.anInt9827;
						@Pc(127) int local127 = local109 << Static609.anInt9827;
						@Pc(144) int local144 = Static462.aClass76Array3[Static462.aClass76Array3.length - 1].method7396(local109, local103) - (0x3E8 << Static609.anInt9827 - 7);
						@Pc(166) int local166 = Static313.aClass76Array1 == null ? Static462.aClass76Array3[0].method7396(local109, local103) + Static192.anInt3298 : Static313.aClass76Array1[0].method7396(local109, local103) + Static192.anInt3298;
						local83 = arg15 >= 0 ? Static207.aClass95_6.r(local123, local144, local127, local123, local166, local127, arg15) : Static207.aClass95_6.JA(local123, local144, local127, local123, local166, local127);
						Static186.aBooleanArrayArray5[local78][local85] = local83 == 0;
					} else {
						local83 = -1;
						Static186.aBooleanArrayArray5[local78][local85] = false;
					}
					if (local78 > 0 && local85 > 0) {
						local123 = Static541.anIntArray603[local85 - 1] & Static541.anIntArray603[local85] & local81 & local83;
						Static494.aBooleanArrayArray8[local78 - 1][local85 - 1] = local123 == 0;
					}
				}
				Static541.anIntArray603[Static335.anInt5343 + Static335.anInt5343] = local81;
				Static541.anIntArray603[Static335.anInt5343 + Static335.anInt5343 + 1] = local83;
			}
			if (arg15 >= 0) {
				Static436.aBoolean530 = false;
			} else {
				Static518.anIntArray580 = arg5;
				Static207.anIntArray227 = arg6;
				Static173.anIntArray687 = arg7;
				Static316.anIntArray345 = arg8;
				Static231.anIntArray259 = arg9;
				Static389.method5233(arg10, Static207.aClass95_6);
			}
		} else {
			if (Static178.aBooleanArrayArray4 == null) {
				Static178.aBooleanArrayArray4 = new boolean[Static322.anInt5120 + Static322.anInt5120 + 1][Class13_Sub1_Sub4_Sub1.lb + Static322.anInt5120 + 1];
			}
			for (local78 = 0; local78 < Static178.aBooleanArrayArray4.length; local78++) {
				for (local81 = 0; local81 < Static178.aBooleanArrayArray4[0].length; local81++) {
					Static178.aBooleanArrayArray4[local78][local81] = true;
				}
			}
			Static186.aBooleanArrayArray5 = Static178.aBooleanArrayArray4;
			Static494.aBooleanArrayArray8 = Static178.aBooleanArrayArray4;
			Static65.anInt1178 = 0;
			Static264.anInt4263 = 0;
			Static85.anInt6703 = Static322.anInt5120;
			Static326.anInt5206 = Class13_Sub1_Sub4_Sub1.lb;
			Static436.aBoolean530 = false;
		}
		Static295.method4069(Static207.aClass95_6);
		if (!Static219.aClass94_4.aBoolean167) {
			@Pc(349) Class171 local349 = Static219.aClass94_4.aClass171_3;
			for (@Pc(354) Class13_Sub6 local354 = (Class13_Sub6) local349.method3745(); local354 != null; local354 = (Class13_Sub6) local349.method3744()) {
				local354.method8394();
				Static448.method6100(local354);
			}
		}
		if (Static218.aBoolean734) {
			for (local78 = 0; local78 < Static389.anInt6119; local78++) {
				Static90.aClass367Array1[local78].method8220(arg14, arg0);
			}
		}
		if (Static268.aBoolean293) {
			Static201.anIntArray223 = Static207.aClass95_6.Y();
			Static207.aClass95_6.K(Static471.anIntArray545);
			local78 = (Static471.anIntArray545[2] - Static471.anIntArray545[0]) / Static453.anInt7261;
			for (local81 = 0; local81 < Static453.anInt7261 - 1; local81++) {
				Static154.anIntArray188[local81] = local78 * (local81 + 1) + Static584.anIntArray649[local81];
			}
			for (local83 = 0; local83 < Static498.aClass212Array1.length; local83++) {
				Static498.aClass212Array1[local83].method4411();
			}
		}
		if (Static253.aClass53ArrayArrayArray2 != null) {
			if (Static268.aBoolean293) {
				Static441.method5558(0);
			}
			Static643.method8627(true);
			Static207.aClass95_6.ra(-1, 1583160, 40, 127);
			Static639.method8584(true, arg4, arg10, arg11, arg15, arg16, arg17);
			if (Static268.aBoolean293) {
				Static635.method8481();
			}
			Static207.aClass95_6.pa();
			Static643.method8627(false);
		}
		Static639.method8584(false, arg4, arg10, arg11, arg15, arg16, arg17);
		if (Static268.aBoolean293) {
			for (local78 = 0; local78 < Static10.anInt139; local78++) {
				Static248.aBooleanArrayArrayArray2[local78] = Static215.aBooleanArrayArrayArray1[local78];
			}
			Static441.method5558(0);
			for (local81 = 0; local81 < Static498.aClass212Array1.length; local81++) {
				Static498.aClass212Array1[local81].method4411();
			}
		}
		if (Static268.aBoolean293) {
			Static635.method8481();
			for (local78 = 0; local78 < Static10.anInt139; local78++) {
				Static215.aBooleanArrayArrayArray1[local78] = Static248.aBooleanArrayArrayArray2[local78];
			}
			if (Static600.anInt9701 == 2) {
				@Pc(543) int local543;
				if (Static58.aLongArray4[0] < Static58.aLongArray4[1]) {
					if (Static154.anIntArray188[0] + Static584.anIntArray649[0] > Static471.anIntArray545[0]) {
						local543 = Static584.anIntArray649[0]++;
					}
				} else if (Static58.aLongArray4[0] > Static58.aLongArray4[1] && Static154.anIntArray188[0] + Static584.anIntArray649[0] < Static471.anIntArray545[2]) {
					local543 = Static584.anIntArray649[0]--;
				}
			}
		}
		if (!Static63.aBoolean731) {
			Static494.aBooleanArrayArray8 = local72;
			Static186.aBooleanArrayArray5 = local74;
		}
		Static20.method418();
	}
}
