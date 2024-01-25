import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!gha", name = "h", descriptor = "Lclient!to;")
	public static Class358 aClass358_16;

	@OriginalMember(owner = "client!gha", name = "f", descriptor = "I")
	public static int anInt3339 = 0;

	@OriginalMember(owner = "client!gha", name = "e", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_60 = new Class225(88, 6);

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "I")
	public static int anInt3342 = 0;

	@OriginalMember(owner = "client!gha", name = "g", descriptor = "[C")
	public static final char[] aCharArray5 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(IIIZLclient!eg;)Z")
	public static boolean method2901(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class4_Sub2_Sub3 arg3) {
		if (!Static334.aBoolean436 || !Static11.aBoolean26) {
			return false;
		} else if (Static170.anInt2918 < 100) {
			return false;
		} else if (Static471.method6762(arg1, arg0, arg2)) {
			@Pc(31) int local31 = arg1 << Static260.anInt4053;
			@Pc(35) int local35 = arg2 << Static260.anInt4053;
			@Pc(45) int local45 = Static158.aClass133Array4[arg0].method8217(arg1, arg2) - 1;
			@Pc(58) int local58 = local45 + arg3.method8977(0);
			if (arg3.aShort120 == 1) {
				if (!Static159.method2362(local58, local45, local31, local35 + Static60.anInt1042, local35, local35, local31, local31, local58)) {
					return false;
				} else if (Static159.method2362(local45, local45, local31, Static60.anInt1042 + local35, local35, local35 + Static60.anInt1042, local31, local31, local58)) {
					Static437.anInt7125++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort120 == 2) {
				if (!Static159.method2362(local58, local45, local31, local35 + Static60.anInt1042, local35 - -Static60.anInt1042, Static60.anInt1042 + local35, local31, local31 + Static60.anInt1042, local58)) {
					return false;
				} else if (Static159.method2362(local58, local45, local31, Static60.anInt1042 + local35, local35 + Static60.anInt1042, local35 + Static60.anInt1042, Static60.anInt1042 + local31, Static60.anInt1042 + local31, local45)) {
					Static437.anInt7125++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort120 == 4) {
				if (!Static159.method2362(local58, local45, Static60.anInt1042 + local31, local35 - -Static60.anInt1042, local35, local35, local31 + Static60.anInt1042, local31 - -Static60.anInt1042, local58)) {
					return false;
				} else if (Static159.method2362(local45, local45, local31 + Static60.anInt1042, local35 + Static60.anInt1042, local35, Static60.anInt1042 + local35, Static60.anInt1042 + local31, local31 + Static60.anInt1042, local58)) {
					Static437.anInt7125++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort120 == 8) {
				if (!Static159.method2362(local58, local45, local31, local35, local35, local35, local31, Static60.anInt1042 + local31, local58)) {
					return false;
				} else if (Static159.method2362(local58, local45, local31, local35, local35, local35, local31 + Static60.anInt1042, local31 + Static60.anInt1042, local45)) {
					Static437.anInt7125++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort120 == 16) {
				if (Static719.method9571(local31, local45, Static328.anInt5032 + local35, Static328.anInt5032, Static328.anInt5032, local58)) {
					Static437.anInt7125++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort120 == 32) {
				if (Static719.method9571(local31 + Static328.anInt5032, local45, Static328.anInt5032 + local35, Static328.anInt5032, Static328.anInt5032, local58)) {
					Static437.anInt7125++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort120 == 64) {
				if (Static719.method9571(local31 + Static328.anInt5032, local45, local35, Static328.anInt5032, Static328.anInt5032, local58)) {
					Static437.anInt7125++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort120 != 128) {
				return true;
			} else if (Static719.method9571(local31, local45, local35, Static328.anInt5032, Static328.anInt5032, local58)) {
				Static437.anInt7125++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(FFIIIII[F[FIII)V")
	public static void method2902(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float[] arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(5) int local5 = arg3 - arg8;
		@Pc(13) int local13 = arg9 - arg2;
		@Pc(29) int local29 = arg10 - arg4;
		@Pc(50) float local50 = arg7[0] * (float) local13 + (float) local5 * arg7[1] + (float) local29 * arg7[2];
		@Pc(71) float local71 = arg7[5] * (float) local29 + arg7[3] * (float) local13 + (float) local5 * arg7[4];
		@Pc(92) float local92 = (float) local29 * arg7[8] + (float) local5 * arg7[7] + (float) local13 * arg7[6];
		@Pc(103) float local103 = (float) Math.atan2((double) local50, (double) local92) / 6.2831855F + 0.5F;
		if (arg1 != 1.0F) {
			local103 *= arg1;
		}
		@Pc(117) float local117 = arg0 + local71 + 0.5F;
		@Pc(138) float local138;
		if (arg5 == 1) {
			local138 = local103;
			local103 = -local117;
			local117 = local138;
		} else if (arg5 == 2) {
			local117 = -local117;
			local103 = -local103;
		} else if (arg5 == 3) {
			local138 = local103;
			local103 = local117;
			local117 = -local138;
		}
		arg6[1] = local117;
		arg6[0] = local103;
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method2903(@OriginalArg(0) Class145 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static392.aBoolean549) {
			local7 = Static637.method3733();
			local9 = Static400.method5900();
		}
		arg0.KA(local7, local9, local7 + Static151.anInt7983, local9 + 350);
		arg0.aa(local7, local9, Static151.anInt7983, 350, Static599.anInt9311 << 24 | 0x332277, 1);
		Static5.method72(local9 + 350, local9, Static151.anInt7983 + local7, local7);
		@Pc(53) int local53 = 350 / Static634.anInt9767;
		@Pc(66) int local66;
		if (Static646.anInt9910 > 0) {
			local66 = 346 - Static634.anInt9767 - 4;
			@Pc(77) int local77 = local53 * local66 / (local53 + Static646.anInt9910 - 1);
			@Pc(79) int local79 = 4;
			if (Static646.anInt9910 > 1) {
				local79 = (local66 - local77) * (-Static371.anInt5925 + Static646.anInt9910 - 1) / (Static646.anInt9910 - 1) + 4;
			}
			arg0.aa(local7 + Static151.anInt7983 - 16, local79 + local9, 12, local77, Static599.anInt9311 << 24 | 0x332277, 2);
			for (@Pc(121) int local121 = Static371.anInt5925; Static371.anInt5925 + local53 > local121 && local121 < Static646.anInt9910; local121++) {
				@Pc(130) String[] local130 = Static100.method1530(Static371.aStringArray22[local121], '\b');
				@Pc(139) int local139 = (Static151.anInt7983 - 8 - 16) / local130.length;
				for (@Pc(141) int local141 = 0; local141 < local130.length; local141++) {
					@Pc(150) int local150 = local139 * local141 + 8;
					arg0.KA(local150 + local7, local9, local139 + local7 + local150 - 8, local9 + 350);
					Static61.aClass68_1.method7882(local7 + local150, -1, Static133.method1959(local130[local141]), local9 + 350 - Static195.anInt3173 - Static175.aClass289_18.anInt7763 - Static634.anInt9767 * (-Static371.anInt5925 + local121) - 2, -16777216);
				}
			}
		}
		Static435.aClass68_11.method7884(local7 + Static151.anInt7983 - 25, "Build: 664", -1, local9 + 350 - 20, -16777216);
		arg0.KA(local7, local9, Static151.anInt7983 + local7, local9 - -350);
		arg0.method9641(local9 + 350 - Static195.anInt3173, -1, Static151.anInt7983, local7);
		Static387.aClass68_12.method7882(local7 + 10, -1, "--> " + Static133.method1959(Static570.aString99), local9 + 350 - Static277.aClass289_8.anInt7763 - 1, -16777216);
		if (!Static344.aBoolean451) {
			return;
		}
		local66 = -1;
		if (Static528.anInt8386 % 30 > 15) {
			local66 = 16777215;
		}
		arg0.method9634(local7 + Static277.aClass289_8.method6935("--> " + Static133.method1959(Static570.aString99).substring(0, Static135.anInt2247)) + 10, 12, local9 + 350 - Static277.aClass289_8.anInt7763 - 11, local66);
	}
}
