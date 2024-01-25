import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "Lclient!kba;")
	public static Class189 aClass189_2;

	@OriginalMember(owner = "client!ii", name = "l", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_51 = new Class46(21, -1);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZI)V")
	public static void method3875(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static620.aClass5_Sub5_Sub16_2 != null) {
			Static482.anInt8212 = Static620.aClass5_Sub5_Sub16_2.anInt7401;
		} else {
			Static482.anInt8212 = -1;
		}
		Static620.aClass5_Sub5_Sub16_2 = null;
		Static135.aClass295_7 = null;
		Static353.anInt5917 = 0;
		Static608.aClass330_62 = null;
		Static620.method7129();
		Static620.aClass330_46.method7910();
		Static390.aClass28_11 = null;
		Static181.anInt3236 = -1;
		Static557.aClass57_9 = null;
		Static104.aClass57_4 = null;
		Static523.anInt8995 = -1;
		Static177.aClass57_6 = null;
		Static114.aClass57_5 = null;
		Static620.aClass378_4 = null;
		Static101.aClass57_3 = null;
		Static125.aClass57_2 = null;
		Static340.aClass57_7 = null;
		Static396.aClass57_8 = null;
		if (Static620.aClass42_4 != null) {
			Static620.aClass42_4.method943();
			Static620.aClass42_4.method944(64, 128);
		}
		if (Static620.aClass333_2 != null) {
			Static620.aClass333_2.method7938(64, 64);
		}
		if (Static620.aClass246_6 != null) {
			Static620.aClass246_6.method5490(64);
		}
		Static475.aClass370_1.method8788(64);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IFIIIIIIF[FI[F)V")
	public static void method3876(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float[] arg9, @OriginalArg(11) float[] arg10) {
		@Pc(9) int local9 = arg6 - arg7;
		@Pc(13) int local13 = arg0 - arg3;
		@Pc(17) int local17 = arg4 - arg5;
		@Pc(38) float local38 = arg9[1] * (float) local9 + arg9[0] * (float) local13 + arg9[2] * (float) local17;
		@Pc(59) float local59 = arg9[4] * (float) local9 + arg9[3] * (float) local13 + (float) local17 * arg9[5];
		@Pc(80) float local80 = arg9[6] * (float) local13 + arg9[7] * (float) local9 + (float) local17 * arg9[8];
		@Pc(96) float local96 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg8 != 1.0F) {
			local96 *= arg8;
		}
		@Pc(110) float local110 = local59 + arg1 + 0.5F;
		@Pc(117) float local117;
		if (arg2 == 1) {
			local117 = local96;
			local96 = -local110;
			local110 = local117;
		} else if (arg2 == 2) {
			local96 = -local96;
			local110 = -local110;
		} else if (arg2 == 3) {
			local117 = local96;
			local96 = local110;
			local110 = -local117;
		}
		arg10[0] = local96;
		arg10[1] = local110;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!ib;)V")
	public static void method3877(@OriginalArg(0) Class155 arg0) {
		Static348.aClass155_3 = arg0;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method3879(@OriginalArg(1) Class133 arg0) {
		if (Static491.anInt8293 < 2 && !Static285.aBoolean378 || Static443.aClass295_14 != null) {
			return;
		}
		@Pc(36) String local36;
		if (Static285.aBoolean378 && Static491.anInt8293 < 2) {
			local36 = Static493.aString96 + Static174.aClass120_32.method2690(Static266.anInt4796) + Static92.aString22 + " ->";
		} else if (Static59.aBoolean66 && Static45.aClass115_1.method2490(81) && Static491.anInt8293 > 2) {
			local36 = Static404.method6045(Static12.aClass5_Sub5_Sub15_1);
		} else {
			@Pc(54) Class5_Sub5_Sub15 local54 = Static12.aClass5_Sub5_Sub15_1;
			if (local54 == null) {
				return;
			}
			local36 = Static404.method6045(local54);
			@Pc(63) int[] local63 = null;
			if (Static155.method1877(local54.anInt6765)) {
				local63 = Static643.aClass275_2.method6641((int) local54.aLong172).anIntArray365;
			} else if (local54.anInt6766 != -1) {
				local63 = Static643.aClass275_2.method6641(local54.anInt6766).anIntArray365;
			} else if (Static390.method5792(local54.anInt6765)) {
				@Pc(87) Class5_Sub3 local87 = (Class5_Sub3) Static445.aClass273_29.method6581((long) local54.aLong172);
				if (local87 != null) {
					@Pc(92) Class4_Sub2_Sub1_Sub1_Sub2 local92 = local87.aClass4_Sub2_Sub1_Sub1_Sub2_1;
					@Pc(95) Class225 local95 = local92.aClass225_1;
					if (local95.anIntArray304 != null) {
						local95 = local95.method4990(Static301.aClass59_1);
					}
					if (local95 != null) {
						local63 = local95.anIntArray305;
					}
				}
			} else if (Static327.method4978(local54.anInt6765)) {
				@Pc(131) Class181 local131;
				if (local54.anInt6765 == 1006) {
					local131 = Static61.aClass246_7.method5497((int) local54.aLong172);
				} else {
					local131 = Static61.aClass246_7.method5497((int) (local54.aLong172 >>> 32 & 0x7FFFFFFFL));
				}
				if (local131.anIntArray235 != null) {
					local131 = local131.method4279(Static301.aClass59_1);
				}
				if (local131 != null) {
					local63 = local131.anIntArray238;
				}
			}
			if (local63 != null) {
				local36 = local36 + Static439.method6671(local63);
			}
		}
		if (Static491.anInt8293 > 2) {
			local36 = local36 + "<col=ffffff> / " + (Static491.anInt8293 - 2) + Static174.aClass120_25.method2690(Static266.anInt4796);
		}
		if (Static2.aClass295_1 != null) {
			@Pc(267) Class55 local267 = Static2.aClass295_1.method6985(arg0);
			if (local267 == null) {
				local267 = Static16.aClass55_1;
			}
			local267.method6009(Static2.aClass295_1.anInt8016, Static91.aRandom1, Static2.aClass295_1.anInt7957, local36, Static2.aClass295_1.anInt8006, Static497.anInt8629, Static236.aClass28Array10, Static494.anInt8308, Static2.aClass295_1.anInt7983, Static432.anIntArray401, Static528.anIntArray500, Static2.aClass295_1.anInt7985, Static338.anInt5733, Static2.aClass295_1.anInt7948);
			Static129.method1916(Static432.anIntArray401[0], Static432.anIntArray401[3], Static432.anIntArray401[2], Static432.anIntArray401[1]);
		} else if (Static188.aClass295_17 != null && Static156.aClass63_2 == Static550.aClass63_6) {
			@Pc(248) int local248 = Static16.aClass55_1.method6025(Static497.anInt8629, Static236.aClass28Array10, Static91.aRandom1, Static9.anInt207 + 4, Static528.anIntArray500, Static302.anInt5273 + 16, local36);
			Static129.method1916(Static9.anInt207 + 4, 16, Static485.aClass272_16.method6570(local36) + local248, Static302.anInt5273);
			return;
		}
	}
}
