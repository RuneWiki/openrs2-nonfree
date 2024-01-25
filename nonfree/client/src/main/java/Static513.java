import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static513 {

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "Lclient!ne;")
	public static Class240 aClass240_7;

	@OriginalMember(owner = "client!ria", name = "h", descriptor = "[[B")
	public static byte[][] aByteArrayArray41;

	@OriginalMember(owner = "client!ria", name = "i", descriptor = "[Lclient!kw;")
	public static Class204[] aClass204Array1;

	@OriginalMember(owner = "client!ria", name = "b", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_108 = new Class100(45, 3);

	@OriginalMember(owner = "client!ria", name = "g", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_155 = new Class44(68, 6);

	@OriginalMember(owner = "client!ria", name = "j", descriptor = "I")
	public static int anInt9020 = 0;

	@OriginalMember(owner = "client!ria", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray32 = new String[100];

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(IIIII)V")
	public static void method7466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class14_Sub31 local6 = (Class14_Sub31) Static40.aClass262_7.method6318(); local6 != null; local6 = (Class14_Sub31) Static40.aClass262_7.method6311()) {
			Static661.method9135(arg1, arg0, arg2, arg3, local6);
		}
		@Pc(171) boolean local171;
		for (@Pc(31) Class14_Sub31 local31 = (Class14_Sub31) Static41.aClass262_5.method6318(); local31 != null; local31 = (Class14_Sub31) Static41.aClass262_5.method6311()) {
			@Pc(35) byte local35 = 1;
			@Pc(40) Class132 local40 = local31.aClass12_Sub2_Sub2_Sub1_Sub1_1.method2416();
			if (local31.aClass12_Sub2_Sub2_Sub1_Sub1_1.anInt2960 == -1 || local31.aClass12_Sub2_Sub2_Sub1_Sub1_1.aBoolean222) {
				local35 = 0;
			} else if (local40.anInt3652 == local31.aClass12_Sub2_Sub2_Sub1_Sub1_1.anInt2960 || local40.anInt3656 == local31.aClass12_Sub2_Sub2_Sub1_Sub1_1.anInt2960 || local40.anInt3648 == local31.aClass12_Sub2_Sub2_Sub1_Sub1_1.anInt2960 || local31.aClass12_Sub2_Sub2_Sub1_Sub1_1.anInt2960 == local40.anInt3657) {
				local35 = 2;
			} else if (local40.anInt3663 == local31.aClass12_Sub2_Sub2_Sub1_Sub1_1.anInt2960 || local40.anInt3628 == local31.aClass12_Sub2_Sub2_Sub1_Sub1_1.anInt2960 || local40.anInt3639 == local31.aClass12_Sub2_Sub2_Sub1_Sub1_1.anInt2960 || local31.aClass12_Sub2_Sub2_Sub1_Sub1_1.anInt2960 == local40.anInt3651) {
				local35 = 3;
			}
			if (local31.anInt5960 != local35) {
				@Pc(128) int local128 = Static55.method1185(local31.aClass12_Sub2_Sub2_Sub1_Sub1_1);
				@Pc(132) Class283 local132 = local31.aClass12_Sub2_Sub2_Sub1_Sub1_1.aClass283_1;
				if (local132.anIntArray638 != null) {
					local132 = local132.method7129(Static595.aClass241_1);
				}
				if (local132 == null || local128 == -1) {
					local31.anInt5975 = -1;
					local31.anInt5960 = local35;
					local31.aBoolean407 = false;
				} else if (local128 == local31.anInt5975 && local132.aBoolean614 == local31.aBoolean407) {
					local31.anInt5960 = local35;
					local31.anInt5958 = local132.anInt8623;
				} else {
					local171 = false;
					if (local31.aClass14_Sub5_Sub4_2 == null) {
						local171 = true;
					} else {
						local31.anInt5958 -= 512;
						if (local31.anInt5958 <= 0) {
							Static217.aClass14_Sub5_Sub3_1.method6029(local31.aClass14_Sub5_Sub4_2);
							local31.aClass14_Sub5_Sub4_2 = null;
							local171 = true;
						}
					}
					if (local171) {
						local31.aBoolean407 = local132.aBoolean614;
						local31.aClass14_Sub13_1 = null;
						local31.anInt5960 = local35;
						local31.anInt5975 = local128;
						local31.anInt5958 = local132.anInt8623;
						local31.aClass14_Sub14_Sub1_2 = null;
					}
				}
			}
			local31.anInt5968 = local31.aClass12_Sub2_Sub2_Sub1_Sub1_1.anInt10998;
			local31.anInt5971 = local31.aClass12_Sub2_Sub2_Sub1_Sub1_1.anInt10998 + (local31.aClass12_Sub2_Sub2_Sub1_Sub1_1.method2422() << 8);
			local31.anInt5973 = local31.aClass12_Sub2_Sub2_Sub1_Sub1_1.anInt11002;
			local31.anInt5969 = local31.aClass12_Sub2_Sub2_Sub1_Sub1_1.anInt11002 + (local31.aClass12_Sub2_Sub2_Sub1_Sub1_1.method2422() << 8);
			Static661.method9135(arg1, arg0, arg2, arg3, local31);
		}
		for (@Pc(293) Class14_Sub31 local293 = (Class14_Sub31) Static587.aClass187_83.method4079(); local293 != null; local293 = (Class14_Sub31) Static587.aClass187_83.method4084()) {
			@Pc(297) byte local297 = 1;
			@Pc(302) Class132 local302 = local293.aClass12_Sub2_Sub2_Sub1_Sub2_1.method2416();
			if (local293.aClass12_Sub2_Sub2_Sub1_Sub2_1.anInt2960 == -1 || local293.aClass12_Sub2_Sub2_Sub1_Sub2_1.aBoolean222) {
				local297 = 0;
			} else if (local302.anInt3652 == local293.aClass12_Sub2_Sub2_Sub1_Sub2_1.anInt2960 || local302.anInt3656 == local293.aClass12_Sub2_Sub2_Sub1_Sub2_1.anInt2960 || local293.aClass12_Sub2_Sub2_Sub1_Sub2_1.anInt2960 == local302.anInt3648 || local293.aClass12_Sub2_Sub2_Sub1_Sub2_1.anInt2960 == local302.anInt3657) {
				local297 = 2;
			} else if (local293.aClass12_Sub2_Sub2_Sub1_Sub2_1.anInt2960 == local302.anInt3663 || local293.aClass12_Sub2_Sub2_Sub1_Sub2_1.anInt2960 == local302.anInt3628 || local293.aClass12_Sub2_Sub2_Sub1_Sub2_1.anInt2960 == local302.anInt3639 || local293.aClass12_Sub2_Sub2_Sub1_Sub2_1.anInt2960 == local302.anInt3651) {
				local297 = 3;
			}
			if (local297 != local293.anInt5960) {
				@Pc(390) int local390 = Static368.method5530(local293.aClass12_Sub2_Sub2_Sub1_Sub2_1);
				if (local293.anInt5975 == local390 && local293.aClass12_Sub2_Sub2_Sub1_Sub2_1.aBoolean228 == local293.aBoolean407) {
					local293.anInt5960 = local297;
					local293.anInt5958 = local293.aClass12_Sub2_Sub2_Sub1_Sub2_1.anInt2992;
				} else {
					local171 = false;
					if (local293.aClass14_Sub5_Sub4_2 == null) {
						local171 = true;
					} else {
						local293.anInt5958 -= 512;
						if (local293.anInt5958 <= 0) {
							Static217.aClass14_Sub5_Sub3_1.method6029(local293.aClass14_Sub5_Sub4_2);
							local293.aClass14_Sub5_Sub4_2 = null;
							local171 = true;
						}
					}
					if (local171) {
						local293.aClass14_Sub14_Sub1_2 = null;
						local293.anInt5958 = local293.aClass12_Sub2_Sub2_Sub1_Sub2_1.anInt2992;
						local293.anInt5975 = local390;
						local293.anInt5960 = local297;
						local293.aClass14_Sub13_1 = null;
						local293.aBoolean407 = local293.aClass12_Sub2_Sub2_Sub1_Sub2_1.aBoolean228;
					}
				}
			}
			local293.anInt5968 = local293.aClass12_Sub2_Sub2_Sub1_Sub2_1.anInt10998;
			local293.anInt5971 = local293.aClass12_Sub2_Sub2_Sub1_Sub2_1.anInt10998 + (local293.aClass12_Sub2_Sub2_Sub1_Sub2_1.method2422() << 8);
			local293.anInt5973 = local293.aClass12_Sub2_Sub2_Sub1_Sub2_1.anInt11002;
			local293.anInt5969 = local293.aClass12_Sub2_Sub2_Sub1_Sub2_1.anInt11002 + (local293.aClass12_Sub2_Sub2_Sub1_Sub2_1.method2422() << 8);
			Static661.method9135(arg1, arg0, arg2, arg3, local293);
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(IIIB)I")
	public static int method7467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 4095 - arg2;
		} else if (local3 == 2) {
			return 4095 - arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(ILclient!so;)Lclient!gr;")
	public static Class133 method7468(@OriginalArg(1) Class14_Sub29 arg0) {
		@Pc(14) int local14 = arg0.method5878();
		return new Class133(local14);
	}

	@OriginalMember(owner = "client!ria", name = "b", descriptor = "(IIIII)V")
	public static void method7469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) int local5 = Static608.anInt10273;
		@Pc(7) int local7 = Static496.anInt8825;
		if (Static128.aBoolean202) {
			local5 += Static619.method8679();
			local7 += Static571.method8194();
		}
		@Pc(28) Class20 local28;
		if (Static538.anInt9253 == 1) {
			local28 = Static434.aClass20Array12[Static285.anInt4869 / 100];
			local28.method7399(local5 - 8, local7 + -8);
			Static357.method5407(local5 - 8, local7 + -8, local7 + local28.method7408() - 8, local28.method7394() + local5 + -8);
		}
		if (Static538.anInt9253 == 2) {
			local28 = Static434.aClass20Array12[Static285.anInt4869 / 100 + 4];
			local28.method7399(local5 - 8, local7 - 8);
			Static357.method5407(local5 - 8, local7 + -8, local28.method7408() + local7 - 8, local5 + -8 + local28.method7394());
		}
		Static429.method3774();
	}
}
