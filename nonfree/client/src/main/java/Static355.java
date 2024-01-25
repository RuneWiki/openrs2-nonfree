import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
	public static int anInt6373;

	@OriginalMember(owner = "client!sd", name = "t", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_114 = new Class36(14, 6);

	@OriginalMember(owner = "client!sd", name = "w", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_213 = new Class186(27, 3);

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V")
	public static void method4959() {
		@Pc(7) int local7 = Static58.anInt4352;
		@Pc(9) int[] local9 = Static144.anIntArray186;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class6_Sub2_Sub1_Sub1 local19 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local9[local11]];
			if (local19 != null && local19.anInt6133 > 0) {
				local19.anInt6133--;
				if (local19.anInt6133 == 0) {
					local19.aString56 = null;
				}
			}
		}
		for (@Pc(54) int local54 = 0; local54 < Static249.anInt4520; local54++) {
			@Pc(60) int local60 = Static128.anIntArray171[local54];
			@Pc(64) Class6_Sub2_Sub1_Sub2 local64 = Static176.aClass6_Sub2_Sub1_Sub2Array1[local60];
			if (local64 != null && local64.anInt6133 > 0) {
				local64.anInt6133--;
				if (local64.anInt6133 == 0) {
					local64.aString56 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIII[BI[B)V")
	public static void method4960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(14) int local14 = -(arg6 >> 2);
		@Pc(19) int local19 = -(arg6 & 0x3);
		for (@Pc(22) int local22 = -arg1; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local14; local26 < 0; local26++) {
				local30 = arg0++;
				arg7[local30] += arg5[arg2++];
				@Pc(42) int local42 = arg0++;
				arg7[local42] += arg5[arg2++];
				@Pc(54) int local54 = arg0++;
				arg7[local54] += arg5[arg2++];
				@Pc(66) int local66 = arg0++;
				arg7[local66] += arg5[arg2++];
			}
			for (@Pc(84) int local84 = local19; local84 < 0; local84++) {
				local30 = arg0++;
				arg7[local30] += arg5[arg2++];
			}
			arg2 += arg4;
			arg0 += arg3;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([Lclient!jb;ZI)V")
	public static void method4961(@OriginalArg(0) Class126[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(10) int local10 = 0; local10 < arg0.length; local10++) {
			@Pc(16) Class126 local16 = arg0[local10];
			if (local16 != null && local16.anInt3405 == arg1 && !Static55.method1119(local16)) {
				if (local16.anInt3426 == 0) {
					method4961(arg0, local16.anInt3397);
					if (local16.aClass126Array3 != null) {
						method4961(local16.aClass126Array3, local16.anInt3397);
					}
					@Pc(50) Class4_Sub4 local50 = (Class4_Sub4) Static391.aClass196_37.method4477((long) local16.anInt3397);
					if (local50 != null) {
						Static46.method4093(local50.anInt573);
					}
				}
				if (local16.anInt3426 == 6 && local16.anInt3468 != -1) {
					@Pc(73) Class233 local73 = Static269.aClass10_1.method286(local16.anInt3468);
					if (local73 != null) {
						local16.anInt3384 += Static4.anInt161;
						while (local16.anInt3384 > local73.anIntArray591[local16.anInt3455]) {
							local16.anInt3384 -= local73.anIntArray591[local16.anInt3455];
							local16.anInt3455++;
							if (local73.anIntArray593.length <= local16.anInt3455) {
								local16.anInt3455 -= local73.anInt6743;
								if (local16.anInt3455 < 0 || local16.anInt3455 >= local73.anIntArray593.length) {
									local16.anInt3455 = 0;
								}
							}
							local16.anInt3414 = local16.anInt3455 + 1;
							if (local16.anInt3414 >= local73.anIntArray593.length) {
								local16.anInt3414 -= local73.anInt6743;
								if (local16.anInt3414 < 0 || local16.anInt3414 >= local73.anIntArray593.length) {
									local16.anInt3414 = -1;
								}
							}
							Static430.method5524(local16);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)Lclient!ud;")
	public static Class239 method4962(@OriginalArg(0) int arg0) {
		@Pc(16) Class239[] local16 = Static178.method2598();
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(24) Class239 local24 = local16[local18];
			if (arg0 == local24.anInt6816) {
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIZI)V")
	public static void method4963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(19) int local19 = arg2;
		@Pc(23) int local23 = arg0 * arg0;
		@Pc(27) int local27 = arg2 * arg2;
		@Pc(31) int local31 = local27 << 1;
		@Pc(35) int local35 = local23 << 1;
		@Pc(39) int local39 = arg2 << 1;
		@Pc(48) int local48 = (1 - local39) * local23 + local31;
		@Pc(57) int local57 = local27 - (local39 - 1) * local35;
		@Pc(61) int local61 = local23 << 2;
		@Pc(65) int local65 = local27 << 2;
		@Pc(73) int local73 = local31 * 3;
		@Pc(81) int local81 = local35 * ((arg2 << 1) - 3);
		@Pc(87) int local87 = local65;
		@Pc(93) int local93 = (arg2 - 1) * local61;
		Static335.method4533(arg0 + arg1, arg3, arg1 - arg0, Static162.anIntArrayArray58[arg4]);
		while (local19 > 0) {
			if (local48 < 0) {
				while (local48 < 0) {
					local48 += local73;
					local57 += local87;
					local7++;
					local73 += local65;
					local87 += local65;
				}
			}
			if (local57 < 0) {
				local57 += local87;
				local48 += local73;
				local73 += local65;
				local7++;
				local87 += local65;
			}
			local57 += -local81;
			local48 += -local93;
			local93 -= local61;
			local19--;
			local81 -= local61;
			@Pc(182) int local182 = arg4 - local19;
			@Pc(186) int local186 = arg4 + local19;
			@Pc(190) int local190 = local7 + arg1;
			@Pc(195) int local195 = arg1 - local7;
			Static335.method4533(local190, arg3, local195, Static162.anIntArrayArray58[local182]);
			Static335.method4533(local190, arg3, local195, Static162.anIntArrayArray58[local186]);
		}
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
	public static void method4965() {
		Static430.method5524(Static15.aClass126_1);
		Static49.anInt1345++;
		if (Static41.aBoolean55 && Static343.aBoolean424) {
			@Pc(26) int local26 = Static284.aClass12_1.method4220();
			@Pc(30) int local30 = Static284.aClass12_1.method4219();
			local26 -= Static31.anInt729;
			local30 -= Static383.anInt6698;
			if (local26 < Static286.anInt5206) {
				local26 = Static286.anInt5206;
			}
			if (local30 < Static224.anInt4138) {
				local30 = Static224.anInt4138;
			}
			if (local26 + Static15.aClass126_1.anInt3421 > Static286.anInt5206 + Static171.aClass126_6.anInt3421) {
				local26 = Static171.aClass126_6.anInt3421 + Static286.anInt5206 - Static15.aClass126_1.anInt3421;
			}
			if (Static224.anInt4138 + Static171.aClass126_6.anInt3442 < Static15.aClass126_1.anInt3442 + local30) {
				local30 = Static171.aClass126_6.anInt3442 + Static224.anInt4138 - Static15.aClass126_1.anInt3442;
			}
			@Pc(115) int local115 = Static171.aClass126_6.anInt3458 + local26 - Static286.anInt5206;
			@Pc(124) int local124 = local30 + Static171.aClass126_6.anInt3444 - Static224.anInt4138;
			@Pc(187) Class4_Sub40 local187;
			if (Static284.aClass12_1.method4218()) {
				if (Static49.anInt1345 > Static15.aClass126_1.anInt3432) {
					@Pc(141) int local141 = local26 - Static20.anInt1992;
					@Pc(146) int local146 = local30 - Static150.anInt2845;
					if (local141 > Static15.aClass126_1.anInt3390 || local141 < -Static15.aClass126_1.anInt3390 || Static15.aClass126_1.anInt3390 < local146 || local146 < -Static15.aClass126_1.anInt3390) {
						Static236.aBoolean323 = true;
					}
				}
				if (Static15.aClass126_1.anObjectArray32 != null && Static236.aBoolean323) {
					local187 = new Class4_Sub40();
					local187.anObjectArray35 = Static15.aClass126_1.anObjectArray32;
					local187.anInt6868 = local115;
					local187.aClass126_16 = Static15.aClass126_1;
					local187.anInt6874 = local124;
					Static172.method2513(local187);
					return;
				}
			} else {
				if (Static236.aBoolean323) {
					Static1.method29();
					if (Static15.aClass126_1.anObjectArray25 != null) {
						local187 = new Class4_Sub40();
						local187.anObjectArray35 = Static15.aClass126_1.anObjectArray25;
						local187.aClass126_15 = Static218.aClass126_11;
						local187.anInt6874 = local124;
						local187.aClass126_16 = Static15.aClass126_1;
						local187.anInt6868 = local115;
						Static172.method2513(local187);
					}
					if (Static218.aClass126_11 != null && Static55.method1115(Static15.aClass126_1) != null) {
						Static249.method3419(Static15.aClass126_1, Static218.aClass126_11);
					}
				} else if ((Static424.anInt7121 == 1 || Static270.method3651()) && Static83.anInt1893 > 2) {
					Static301.method4176(Static150.anInt2845 + Static383.anInt6698, Static20.anInt1992 + Static31.anInt729);
				} else if (Static20.method1516()) {
					Static301.method4176(Static383.anInt6698 + Static150.anInt2845, Static20.anInt1992 + Static31.anInt729);
				}
				Static15.aClass126_1 = null;
			}
		} else if (Static49.anInt1345 > 1) {
			Static15.aClass126_1 = null;
		}
	}
}
