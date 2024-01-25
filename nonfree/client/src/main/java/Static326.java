import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!laa", name = "e", descriptor = "Lclient!cc;")
	public static Class49_Sub1 aClass49_Sub1_1;

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(III)I")
	public static int method4643(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(45) int local45 = Static456.method6141(arg0 + 91923, 4, arg1 + 45365) + (Static456.method6141(arg0 + 37821, 2, arg1 + 10294) + -128 >> 1) + (Static456.method6141(arg0, 1, arg1) + -128 >> 2) - 128;
		local45 = (int) ((double) local45 * 0.3D) + 35;
		if (local45 < 10) {
			local45 = 10;
		} else if (local45 > 60) {
			local45 = 60;
		}
		return local45;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIIIII)V")
	public static void method4644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12 = arg1 + 1;
		Static578.method7640(arg3, arg0, arg4, Static276.anIntArrayArray32[arg1]);
		@Pc(21) int local21 = arg2 - 1;
		Static578.method7640(arg3, arg0, arg4, Static276.anIntArrayArray32[arg2]);
		for (@Pc(29) int local29 = local12; local29 <= local21; local29++) {
			@Pc(35) int[] local35 = Static276.anIntArrayArray32[local29];
			local35[arg0] = local35[arg4] = arg3;
		}
	}

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "(I)Ljava/lang/String;")
	public static String method4646() {
		return Static532.aBoolean580 || Static562.aClass3_Sub5_Sub18_7 == null ? "" : Static562.aClass3_Sub5_Sub18_7.aString105;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4648(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg0 - arg4;
		@Pc(20) int local20 = arg1 - arg4;
		@Pc(24) int local24 = arg0 * arg0;
		@Pc(28) int local28 = arg1 * arg1;
		@Pc(32) int local32 = local16 * local16;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg1 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(70) int local70 = local24 * (1 - local56) + local40;
		@Pc(79) int local79 = local28 - local44 * (local56 - 1);
		@Pc(88) int local88 = local48 + local32 * (1 - local60);
		@Pc(96) int local96 = local36 - (local60 - 1) * local52;
		@Pc(100) int local100 = local24 << 2;
		@Pc(104) int local104 = local28 << 2;
		@Pc(113) int local113 = local32 << 2;
		@Pc(117) int local117 = local36 << 2;
		@Pc(121) int local121 = local40 * 3;
		@Pc(127) int local127 = (local56 - 3) * local44;
		@Pc(131) int local131 = local48 * 3;
		@Pc(137) int local137 = (local60 - 3) * local52;
		@Pc(139) int local139 = local104;
		@Pc(145) int local145 = (arg1 - 1) * local100;
		@Pc(147) int local147 = local117;
		@Pc(165) int local165;
		@Pc(174) int local174;
		@Pc(183) int local183;
		@Pc(191) int local191;
		if (arg6 >= Static617.anInt6260 && Static229.anInt4089 >= arg6) {
			@Pc(157) int[] local157 = Static276.anIntArrayArray32[arg6];
			local165 = Static166.method2620(arg5 - arg0, Static629.anInt10412, Static300.anInt5091);
			local174 = Static166.method2620(arg5 + arg0, Static629.anInt10412, Static300.anInt5091);
			local183 = Static166.method2620(arg5 - local16, Static629.anInt10412, Static300.anInt5091);
			local191 = Static166.method2620(local16 + arg5, Static629.anInt10412, Static300.anInt5091);
			Static578.method7640(arg2, local165, local183, local157);
			Static578.method7640(arg3, local183, local191, local157);
			Static578.method7640(arg2, local191, local174, local157);
		}
		@Pc(215) int local215 = local113 * (local20 - 1);
		while (local9 > 0) {
			@Pc(228) boolean local228 = local20 >= local9;
			if (local228) {
				if (local88 < 0) {
					while (local88 < 0) {
						local96 += local147;
						local88 += local131;
						local147 += local117;
						local131 += local117;
						local11++;
					}
				}
				if (local96 < 0) {
					local96 += local147;
					local88 += local131;
					local147 += local117;
					local11++;
					local131 += local117;
				}
				local96 += -local137;
				local88 += -local215;
				local137 -= local113;
				local215 -= local113;
			}
			if (local70 < 0) {
				while (local70 < 0) {
					local79 += local139;
					local70 += local121;
					local139 += local104;
					local7++;
					local121 += local104;
				}
			}
			if (local79 < 0) {
				local70 += local121;
				local79 += local139;
				local121 += local104;
				local139 += local104;
				local7++;
			}
			local70 += -local145;
			local79 += -local127;
			local145 -= local100;
			local127 -= local100;
			local9--;
			local165 = arg6 - local9;
			local174 = arg6 + local9;
			if (local174 >= Static617.anInt6260 && Static229.anInt4089 >= local165) {
				local183 = Static166.method2620(arg5 + local7, Static629.anInt10412, Static300.anInt5091);
				local191 = Static166.method2620(arg5 - local7, Static629.anInt10412, Static300.anInt5091);
				if (local228) {
					@Pc(430) int local430 = Static166.method2620(local11 + arg5, Static629.anInt10412, Static300.anInt5091);
					@Pc(438) int local438 = Static166.method2620(arg5 - local11, Static629.anInt10412, Static300.anInt5091);
					@Pc(449) int[] local449;
					if (local165 >= Static617.anInt6260) {
						local449 = Static276.anIntArrayArray32[local165];
						Static578.method7640(arg2, local191, local438, local449);
						Static578.method7640(arg3, local438, local430, local449);
						Static578.method7640(arg2, local430, local183, local449);
					}
					if (Static229.anInt4089 >= local174) {
						local449 = Static276.anIntArrayArray32[local174];
						Static578.method7640(arg2, local191, local438, local449);
						Static578.method7640(arg3, local438, local430, local449);
						Static578.method7640(arg2, local430, local183, local449);
					}
				} else {
					if (local165 >= Static617.anInt6260) {
						Static578.method7640(arg2, local191, local183, Static276.anIntArrayArray32[local165]);
					}
					if (local174 <= Static229.anInt4089) {
						Static578.method7640(arg2, local191, local183, Static276.anIntArrayArray32[local174]);
					}
				}
			}
		}
	}
}
