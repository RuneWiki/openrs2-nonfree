import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!sq", name = "L", descriptor = "Lclient!iq;")
	public static Class104 aClass104_156;

	@OriginalMember(owner = "client!sq", name = "D", descriptor = "[I")
	public static final int[] anIntArray464 = new int[3];

	@OriginalMember(owner = "client!sq", name = "G", descriptor = "[J")
	public static final long[] aLongArray9 = new long[32];

	@OriginalMember(owner = "client!sq", name = "N", descriptor = "J")
	public static long aLong188 = 0L;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZLclient!dr;)V")
	public static void method5083(@OriginalArg(1) Class37 arg0) {
		if (Static223.aClass180_33.method4907() == 0) {
			return;
		}
		@Pc(56) Class2_Sub39 local56;
		if (Static114.anInt2421 == 0) {
			for (local56 = (Class2_Sub39) Static223.aClass180_33.method4919(); local56 != null; local56 = (Class2_Sub39) Static223.aClass180_33.method4916()) {
				Static310.aClass184_2.method5047(local56.aBoolean529 ? Static177.aClass1_Sub2_Sub3_Sub1_1.aClass217_1 : null, local56.anInt5989, Static295.aClass71_5, local56.anInt5997, arg0, local56.anInt5993, arg0, false, local56.anInt5996, false, local56.anInt5992);
				local56.method5723();
			}
			Static35.method5765();
			return;
		}
		if (Static98.aClass37_5 == null) {
			@Pc(26) Canvas local26 = new Canvas();
			local26.setSize(36, 32);
			Static98.aClass37_5 = Static67.method3720(local26, Static62.aClass179_2, 0, Static358.anInterface3_7, 0);
			Static135.aClass71_2 = Static98.aClass37_5.method3659(Static145.method2833(Static283.aClass104_148, Static344.anInt6693), Static368.method833(Static338.aClass104_184, Static344.anInt6693));
		}
		for (local56 = (Class2_Sub39) Static223.aClass180_33.method4919(); local56 != null; local56 = (Class2_Sub39) Static223.aClass180_33.method4916()) {
			Static310.aClass184_2.method5047(local56.aBoolean529 ? Static177.aClass1_Sub2_Sub3_Sub1_1.aClass217_1 : null, local56.anInt5989, Static135.aClass71_2, local56.anInt5997, arg0, local56.anInt5993, Static98.aClass37_5, false, local56.anInt5996, false, local56.anInt5992);
			local56.method5723();
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V")
	public static void method5085() {
		Static248.aClass107_30.method3015();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IZLclient!s;ILclient!dr;[Lclient!ek;)V")
	public static void method5088(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class105 arg2, @OriginalArg(4) Class37 arg3, @OriginalArg(5) Class61[] arg4) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		@Pc(31) int local31;
		if (!arg1) {
			for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
				for (local13 = 0; local13 < Static66.anInt1177; local13++) {
					for (local17 = 0; local17 < Static12.anInt213; local17++) {
						if ((Static243.aByteArrayArrayArray10[local9][local13][local17] & 0x1) != 0) {
							local31 = local9;
							if ((Static243.aByteArrayArrayArray10[1][local13][local17] & 0x2) != 0) {
								local31 = local9 - 1;
							}
							if (local31 >= 0) {
								arg4[local31].method1603(local17, local13);
							}
						}
					}
				}
			}
		}
		@Pc(73) int[][] local73 = new int[Static66.anInt1177][Static12.anInt213];
		for (local13 = 0; local13 < arg0; local13++) {
			for (local17 = 0; local17 < Static12.anInt213; local17++) {
				Static209.anIntArray531[local17] = 0;
				Static2.anIntArray5[local17] = 0;
				Static178.anIntArray529[local17] = 0;
				Static363.anIntArray536[local17] = 0;
				Static190.anIntArray481[local17] = 0;
			}
			for (local31 = -5; local31 < Static66.anInt1177; local31++) {
				@Pc(121) int local121;
				@Pc(134) int local134;
				@Pc(197) int local197;
				for (@Pc(115) int local115 = 0; local115 < Static12.anInt213; local115++) {
					local121 = local31 + 5;
					@Pc(178) int local178;
					if (Static66.anInt1177 > local121) {
						local134 = Static335.aByteArrayArrayArray13[local13][local121][local115] & 0xFF;
						if (local134 > 0) {
							@Pc(142) Class121 local142 = Static229.method4237(local134 - 1);
							Static209.anIntArray531[local115] += local142.anInt3851;
							Static2.anIntArray5[local115] += local142.anInt3854;
							Static178.anIntArray529[local115] += local142.anInt3858;
							Static363.anIntArray536[local115] += local142.anInt3853;
							local178 = Static190.anIntArray481[local115]++;
						}
					}
					local134 = local31 - 5;
					if (local134 >= 0) {
						local197 = Static335.aByteArrayArrayArray13[local13][local134][local115] & 0xFF;
						if (local197 > 0) {
							@Pc(205) Class121 local205 = Static229.method4237(local197 - 1);
							Static209.anIntArray531[local115] -= local205.anInt3851;
							Static2.anIntArray5[local115] -= local205.anInt3854;
							Static178.anIntArray529[local115] -= local205.anInt3858;
							Static363.anIntArray536[local115] -= local205.anInt3853;
							local178 = Static190.anIntArray481[local115]--;
						}
					}
				}
				if (local31 >= 0) {
					local121 = 0;
					local134 = 0;
					local197 = 0;
					@Pc(258) int local258 = 0;
					@Pc(260) int local260 = 0;
					for (@Pc(262) int local262 = -5; local262 < Static12.anInt213; local262++) {
						@Pc(268) int local268 = local262 + 5;
						if (local268 < Static12.anInt213) {
							local258 += Static363.anIntArray536[local268];
							local260 += Static190.anIntArray481[local268];
							local134 += Static2.anIntArray5[local268];
							local197 += Static178.anIntArray529[local268];
							local121 += Static209.anIntArray531[local268];
						}
						@Pc(309) int local309 = local262 - 5;
						if (local309 >= 0) {
							local134 -= Static2.anIntArray5[local309];
							local121 -= Static209.anIntArray531[local309];
							local197 -= Static178.anIntArray529[local309];
							local258 -= Static363.anIntArray536[local309];
							local260 -= Static190.anIntArray481[local309];
						}
						if (local262 >= 0 && local258 > 0 && local260 > 0) {
							local73[local31][local262] = Static271.method4701(local197 / local260, local121 * 256 / local258, local134 / local260);
						}
					}
				}
			}
			Static25.method330(Static12.anInt213, Static9.aClass105Array1[local13], Static182.aByteArrayArrayArray3[local13], local13, arg2, arg3, Static335.aByteArrayArrayArray13[local13], Static66.anInt1177, arg1, Static198.aByteArrayArrayArray8[local13], Static18.aByteArrayArrayArray1[local13], local73);
			Static335.aByteArrayArrayArray13[local13] = null;
			Static182.aByteArrayArrayArray3[local13] = null;
			Static18.aByteArrayArrayArray1[local13] = null;
			Static198.aByteArrayArrayArray8[local13] = null;
		}
		if (!arg1) {
			if (Static309.aBoolean544) {
				Static167.method3336();
			}
			if (Static222.anInt6836 != 0) {
				Static362.method5799();
			}
		}
		for (local17 = 0; local17 < arg0; local17++) {
			Static9.aClass105Array1[local17].method4446();
		}
	}
}
