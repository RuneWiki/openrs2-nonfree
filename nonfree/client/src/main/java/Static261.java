import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!rh", name = "q", descriptor = "Lclient!rh;")
	public static Class1_Sub31_Sub3 aClass1_Sub31_Sub3_2;

	@OriginalMember(owner = "client!rh", name = "P", descriptor = "I")
	public static int anInt5376 = 0;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!nj;I)Lclient!sa;")
	public static Class49_Sub4 method4698(@OriginalArg(0) Class1_Sub21 arg0) {
		return new Class49_Sub4(arg0.method5691(), arg0.method5691(), arg0.method5691(), arg0.method5691(), arg0.method5705(), arg0.method5705(), arg0.method5720());
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg6;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg1 - arg3;
		@Pc(20) int local20 = arg6 - arg3;
		@Pc(24) int local24 = arg1 * arg1;
		@Pc(28) int local28 = arg6 * arg6;
		@Pc(32) int local32 = local16 * local16;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg6 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(73) int local73 = local24 * (1 - local56) + local40;
		@Pc(82) int local82 = local28 - local44 * (local56 - 1);
		@Pc(91) int local91 = (1 - local60) * local32 + local48;
		@Pc(99) int local99 = local36 - (local60 - 1) * local52;
		@Pc(103) int local103 = local24 << 2;
		@Pc(107) int local107 = local28 << 2;
		@Pc(111) int local111 = local32 << 2;
		@Pc(115) int local115 = local36 << 2;
		@Pc(119) int local119 = local40 * 3;
		@Pc(125) int local125 = local44 * (local56 - 3);
		@Pc(129) int local129 = local48 * 3;
		@Pc(135) int local135 = (local60 - 3) * local52;
		@Pc(137) int local137 = local107;
		@Pc(143) int local143 = local103 * (arg6 - 1);
		@Pc(145) int local145 = local115;
		@Pc(151) int local151 = (local20 - 1) * local111;
		@Pc(174) int local174;
		@Pc(182) int local182;
		@Pc(191) int local191;
		@Pc(199) int local199;
		if (arg5 >= Static41.anInt1131 && Static165.anInt3409 >= arg5) {
			@Pc(165) int[] local165 = Static319.anIntArrayArray31[arg5];
			local174 = Static54.method1088(Static60.anInt1399, arg4 - arg1, Static138.anInt6334);
			local182 = Static54.method1088(Static60.anInt1399, arg1 + arg4, Static138.anInt6334);
			local191 = Static54.method1088(Static60.anInt1399, arg4 - local16, Static138.anInt6334);
			local199 = Static54.method1088(Static60.anInt1399, local16 + arg4, Static138.anInt6334);
			Static244.method5351(local174, local191, local165, arg0);
			Static244.method5351(local191, local199, local165, arg2);
			Static244.method5351(local199, local182, local165, arg0);
		}
		while (local9 > 0) {
			@Pc(226) boolean local226 = local20 >= local9;
			if (local226) {
				if (local91 < 0) {
					while (local91 < 0) {
						local99 += local145;
						local91 += local129;
						local11++;
						local129 += local115;
						local145 += local115;
					}
				}
				if (local99 < 0) {
					local99 += local145;
					local91 += local129;
					local129 += local115;
					local145 += local115;
					local11++;
				}
				local91 += -local151;
				local99 += -local135;
				local135 -= local111;
				local151 -= local111;
			}
			if (local73 < 0) {
				while (local73 < 0) {
					local82 += local137;
					local73 += local119;
					local137 += local107;
					local7++;
					local119 += local107;
				}
			}
			if (local82 < 0) {
				local82 += local137;
				local73 += local119;
				local137 += local107;
				local119 += local107;
				local7++;
			}
			local73 += -local143;
			local82 += -local125;
			local125 -= local103;
			local143 -= local103;
			local9--;
			local174 = arg5 - local9;
			local182 = arg5 + local9;
			if (local182 >= Static41.anInt1131 && Static165.anInt3409 >= local174) {
				local191 = Static54.method1088(Static60.anInt1399, arg4 + local7, Static138.anInt6334);
				local199 = Static54.method1088(Static60.anInt1399, arg4 - local7, Static138.anInt6334);
				if (local226) {
					@Pc(407) int local407 = Static54.method1088(Static60.anInt1399, local11 + arg4, Static138.anInt6334);
					@Pc(416) int local416 = Static54.method1088(Static60.anInt1399, arg4 - local11, Static138.anInt6334);
					@Pc(423) int[] local423;
					if (Static41.anInt1131 <= local174) {
						local423 = Static319.anIntArrayArray31[local174];
						Static244.method5351(local199, local416, local423, arg0);
						Static244.method5351(local416, local407, local423, arg2);
						Static244.method5351(local407, local191, local423, arg0);
					}
					if (Static165.anInt3409 >= local182) {
						local423 = Static319.anIntArrayArray31[local182];
						Static244.method5351(local199, local416, local423, arg0);
						Static244.method5351(local416, local407, local423, arg2);
						Static244.method5351(local407, local191, local423, arg0);
					}
				} else {
					if (Static41.anInt1131 <= local174) {
						Static244.method5351(local199, local191, Static319.anIntArrayArray31[local174], arg0);
					}
					if (Static165.anInt3409 >= local182) {
						Static244.method5351(local199, local191, Static319.anIntArrayArray31[local182], arg0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!lm;I)V")
	public static void method4713(@OriginalArg(0) Class134 arg0) {
		Static41.aClass134_21 = arg0;
		Static41.aClass134_21.method3020(35);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ljava/lang/Object;ZB)[B")
	public static byte[] method4721(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return arg1 ? Static211.method3860(local13) : local13;
		} else if (arg0 instanceof Class58) {
			@Pc(27) Class58 local27 = (Class58) arg0;
			return local27.method1251();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)V")
	public static void method4723() {
		for (@Pc(14) Class1_Sub23 local14 = (Class1_Sub23) Static271.aClass14_28.method302(); local14 != null; local14 = (Class1_Sub23) Static271.aClass14_28.method313()) {
			if (local14.anInt3761 > 0) {
				local14.anInt3761--;
			}
			if (local14.anInt3761 != 0) {
				if (local14.anInt3753 > 0) {
					local14.anInt3753--;
				}
				if (local14.anInt3753 == 0 && local14.anInt3746 >= 1 && local14.anInt3755 >= 1 && Static43.anInt1151 - 2 >= local14.anInt3746 && Static260.anInt5348 - 2 >= local14.anInt3755 && (local14.anInt3757 < 0 || Static215.method3990(local14.anInt3757, local14.anInt3752))) {
					Static102.method1600(local14.anInt3747, -1, local14.anInt3752, local14.anInt3749, local14.anInt3757, local14.anInt3746, local14.anInt3755, local14.anInt3754);
					local14.anInt3753 = -1;
					if (local14.anInt3750 == local14.anInt3757 && local14.anInt3750 == -1) {
						local14.method5796();
					} else if (local14.anInt3757 == local14.anInt3750 && local14.anInt3754 == local14.anInt3760 && local14.anInt3752 == local14.anInt3751) {
						local14.method5796();
					}
				}
			} else if (local14.anInt3750 < 0 || Static215.method3990(local14.anInt3750, local14.anInt3751)) {
				Static102.method1600(local14.anInt3747, -1, local14.anInt3751, local14.anInt3749, local14.anInt3750, local14.anInt3746, local14.anInt3755, local14.anInt3760);
				local14.method5796();
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILclient!ps;)Lclient!ps;")
	public static Class163 method4724(@OriginalArg(1) Class163 arg0) {
		@Pc(6) Class163 local6 = Static40.method845(arg0);
		if (local6 == null) {
			local6 = arg0.aClass163_15;
		}
		return local6;
	}
}
