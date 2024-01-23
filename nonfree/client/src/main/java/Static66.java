import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!g", name = "c", descriptor = "Lclient!ng;")
	public static Class82 aClass82_1;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "Lclient!lg;")
	public static Class73 aClass73_4;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "Lclient!o;")
	public static Class86 aClass86_3;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "Lclient!sc;")
	public static Class107 aClass107_432 = Static231.method3737("(Udns");

	@OriginalMember(owner = "client!g", name = "e", descriptor = "Lclient!sc;")
	public static Class107 aClass107_433 = Static231.method3737("<col=80ff00>");

	@OriginalMember(owner = "client!g", name = "l", descriptor = "[[I")
	public static int[][] anIntArrayArray21 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIBIII)V")
	public static void method1214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = arg3 * arg3;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(17) int local17 = arg1 * arg1;
		@Pc(21) int local21 = local17 << 1;
		@Pc(29) int local29 = arg1 << 1;
		@Pc(37) int local37 = local21 + local5 * (1 - local29);
		@Pc(41) int local41 = local5 << 1;
		@Pc(45) int local45 = local5 << 2;
		@Pc(54) int local54 = local17 - local41 * (local29 - 1);
		@Pc(58) int local58 = local17 << 2;
		@Pc(66) int local66 = local21 * 3;
		@Pc(72) int local72 = local58;
		@Pc(78) int local78 = local45 * (arg1 - 1);
		@Pc(92) int local92;
		@Pc(101) int local101;
		if (arg2 >= Static223.anInt4869 && Static47.anInt1057 >= arg2) {
			local92 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg3 + arg4);
			local101 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg4 - arg3);
			Static162.method2605(Static231.anIntArrayArray44[arg2], local101, arg0, local92);
		}
		@Pc(117) int local117 = local41 * ((arg1 << 1) - 3);
		while (local9 > 0) {
			local9--;
			if (local37 < 0) {
				while (local37 < 0) {
					local7++;
					local37 += local66;
					local66 += local58;
					local54 += local72;
					local72 += local58;
				}
			}
			if (local54 < 0) {
				local37 += local66;
				local7++;
				local66 += local58;
				local54 += local72;
				local72 += local58;
			}
			local54 += -local117;
			local117 -= local45;
			local92 = arg2 - local9;
			local37 += -local78;
			local78 -= local45;
			local101 = arg2 + local9;
			if (Static223.anInt4869 <= local101 && Static47.anInt1057 >= local92) {
				@Pc(210) int local210 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg4 + local7);
				@Pc(219) int local219 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg4 - local7);
				if (local92 >= Static223.anInt4869) {
					Static162.method2605(Static231.anIntArrayArray44[local92], local219, arg0, local210);
				}
				if (Static47.anInt1057 >= local101) {
					Static162.method2605(Static231.anIntArrayArray44[local101], local219, arg0, local210);
				}
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZZ)V")
	public static void method1215() {
		@Pc(7) byte[][] local7 = Static85.aByteArrayArray3;
		@Pc(16) int local16 = local7.length;
		@Pc(31) int local31;
		@Pc(41) int local41;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			local31 = (Static182.anIntArray343[local18] >> 8) * 64 - Static36.anInt764;
			local41 = (Static182.anIntArray343[local18] & 0xFF) * 64 - Static152.anInt3377;
			@Pc(45) byte[] local45 = local7[local18];
			if (local45 != null) {
				Static30.method587();
				Static215.method3500(local31, local41, (Static220.anInt4826 - 6) * 8, Static107.aClass60Array1, (Static123.anInt2686 - 6) * 8, local45);
			}
		}
		for (local31 = 0; local31 < local16; local31++) {
			@Pc(84) int local84 = (Static182.anIntArray343[local31] & 0xFF) * 64 - Static152.anInt3377;
			@Pc(88) byte[] local88 = local7[local31];
			local41 = (Static182.anIntArray343[local31] >> 8) * 64 - Static36.anInt764;
			if (local88 == null && Static220.anInt4826 < 800) {
				Static30.method587();
				for (@Pc(109) int local109 = 0; local109 < 4; local109++) {
					Static19.method373(local109, 64, 64, local41, local84);
				}
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!mj;BII)V")
	public static void method1216(@OriginalArg(0) Class5_Sub5_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt3048 == arg2 && arg2 != -1) {
			@Pc(83) Class96 local83 = Static2.method88(arg2);
			@Pc(86) int local86 = local83.anInt3659;
			if (local86 == 1) {
				arg0.anInt3047 = 0;
				arg0.anInt3013 = 0;
				arg0.anInt3023 = 0;
				arg0.anInt2996 = arg1;
				Static133.method2209(arg0.anInt3044, arg0.anInt3021, local83, false, arg0.anInt3023);
			}
			if (local86 == 2) {
				arg0.anInt3047 = 0;
				return;
			}
		} else if (arg2 == -1 || arg0.anInt3048 == -1 || Static2.method88(arg2).anInt3649 >= Static2.method88(arg0.anInt3048).anInt3649) {
			arg0.anInt3047 = 0;
			arg0.anInt3041 = arg0.anInt3006;
			arg0.anInt3013 = 0;
			arg0.anInt2996 = arg1;
			arg0.anInt3048 = arg2;
			arg0.anInt3023 = 0;
			if (arg0.anInt3048 != -1) {
				Static133.method2209(arg0.anInt3044, arg0.anInt3021, Static2.method88(arg0.anInt3048), false, arg0.anInt3023);
				return;
			}
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIZ)I")
	public static int method1217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(47) int local47 = Static190.method3082(arg1 + 45365, arg0 - -91923, 4) + (Static190.method3082(arg1 + 10294, arg0 + 37821, 2) - 128 >> 1) + (Static190.method3082(arg1, arg0, 1) + -128 >> 2) - 128;
		local47 = (int) ((double) local47 * 0.3D) + 35;
		if (local47 < 10) {
			local47 = 10;
		} else if (local47 > 60) {
			local47 = 60;
		}
		return local47;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
	public static void method1219() {
		@Pc(4) int local4 = Static156.aByteArrayArray6.length;
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			if (Static156.aByteArrayArray6[local10] != null) {
				@Pc(18) int local18 = -1;
				for (@Pc(20) int local20 = 0; local20 < Static87.anInt1910; local20++) {
					if (Static182.anIntArray343[local10] == Static156.anIntArray298[local20]) {
						local18 = local20;
						break;
					}
				}
				if (local18 == -1) {
					Static156.anIntArray298[Static87.anInt1910] = Static182.anIntArray343[local10];
					local18 = Static87.anInt1910++;
				}
				@Pc(59) Class1_Sub26 local59 = new Class1_Sub26(Static156.aByteArrayArray6[local10]);
				@Pc(61) int local61 = 0;
				while (local59.anInt4021 < Static156.aByteArrayArray6[local10].length && local61 < 511) {
					@Pc(73) int local73 = local61++ << 6 | local18;
					@Pc(77) int local77 = local59.method2964();
					@Pc(83) int local83 = local77 >> 7 & 0x3F;
					@Pc(87) int local87 = local77 & 0x3F;
					@Pc(91) int local91 = local77 >> 14;
					@Pc(104) int local104 = local83 + (Static182.anIntArray343[local10] >> 8) * 64 - Static36.anInt764;
					@Pc(117) int local117 = (Static182.anIntArray343[local10] & 0xFF) * 64 + local87 - Static152.anInt3377;
					@Pc(123) Class30 local123 = Static139.method2340(local59.method2964());
					if (Static33.aClass5_Sub5_Sub2Array1[local73] == null && (local123.aByte8 & 0x1) > 0 && Static166.anInt4347 == local91 && local104 >= 0 && local123.anInt961 + local104 < 104 && local117 >= 0 && local123.anInt961 + local117 < 104) {
						Static33.aClass5_Sub5_Sub2Array1[local73] = new Class5_Sub5_Sub2();
						@Pc(169) Class5_Sub5_Sub2 local169 = Static33.aClass5_Sub5_Sub2Array1[local73];
						Static37.anIntArray82[Static189.anInt4168++] = local73;
						local169.anInt3009 = Static128.anInt2802;
						local169.aClass30_1 = local123;
						local169.anInt2997 = local169.aClass30_1.anInt961;
						local169.anInt3035 = local169.aClass30_1.anInt967;
						local169.anInt3030 = local169.aClass30_1.anInt957;
						local169.anInt3007 = local169.aClass30_1.anInt985;
						local169.anInt3022 = local169.aClass30_1.anInt973;
						local169.anInt3020 = local169.aClass30_1.anInt983;
						local169.anInt3052 = local169.aClass30_1.anInt992;
						local169.anInt3037 = local169.aClass30_1.anInt977;
						local169.anInt3004 = local169.aClass30_1.anInt979;
						if (local169.anInt3004 == 0) {
							local169.anInt3040 = 0;
						}
						local169.method2311(local117, true, local104);
					}
				}
			}
		}
	}
}
