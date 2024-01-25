import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!io", name = "q", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_51 = new Class11(0, 4);

	@OriginalMember(owner = "client!io", name = "R", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_40 = new Class32("M", "M", "M", "M");

	@OriginalMember(owner = "client!io", name = "S", descriptor = "Lclient!or;")
	public static Class182 aClass182_5 = null;

	@OriginalMember(owner = "client!io", name = "T", descriptor = "Z")
	public static boolean aBoolean219 = false;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)V")
	public static void method2760() {
		Static183.aClass4ArrayArray1 = new Class4[Static233.aClass171_54.method3770()][];
		Static350.aBooleanArray22 = new boolean[Static233.aClass171_54.method3770()];
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IZIII)Lclient!ra;")
	public static Class2_Sub38 method2763(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class2_Sub38 local7 = new Class2_Sub38();
		local7.anInt4976 = arg0;
		local7.anInt4974 = arg2;
		Static12.aClass246_2.method5609(local7, (long) arg3);
		Static35.method641(arg0);
		@Pc(31) Class4 local31 = Static380.method5560(arg3);
		if (local31 != null) {
			Static51.method872(local31);
		}
		if (Static108.aClass4_26 != null) {
			Static51.method872(Static108.aClass4_26);
			Static108.aClass4_26 = null;
		}
		Static54.method3534();
		if (local31 != null) {
			Static35.method640(local31, !arg1);
		}
		if (!arg1) {
			Static256.method3998(arg0);
		}
		if (!arg1 && Static234.anInt4158 != -1) {
			Static55.method919(1, Static234.anInt4158);
		}
		return local7;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg5;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg1 - arg0;
		@Pc(21) int local21 = arg5 - arg0;
		@Pc(25) int local25 = arg1 * arg1;
		@Pc(29) int local29 = arg5 * arg5;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg5 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = (1 - local57) * local25 + local41;
		@Pc(79) int local79 = local29 - (local57 - 1) * local45;
		@Pc(88) int local88 = local49 + (1 - local61) * local33;
		@Pc(97) int local97 = local37 - (local61 - 1) * local53;
		@Pc(101) int local101 = local25 << 2;
		@Pc(105) int local105 = local29 << 2;
		@Pc(109) int local109 = local33 << 2;
		@Pc(113) int local113 = local37 << 2;
		@Pc(117) int local117 = local41 * 3;
		@Pc(135) int local135 = (local57 - 3) * local45;
		@Pc(139) int local139 = local49 * 3;
		@Pc(145) int local145 = (local61 - 3) * local53;
		@Pc(147) int local147 = local105;
		@Pc(153) int local153 = local101 * (arg5 - 1);
		@Pc(155) int local155 = local113;
		@Pc(161) int local161 = local109 * (local21 - 1);
		@Pc(165) int[] local165 = Static15.anIntArrayArray1[arg2];
		Static315.method4662(arg3 - local16, local165, arg3 - arg1, arg4);
		Static315.method4662(local16 + arg3, local165, arg3 - local16, arg6);
		Static315.method4662(arg1 + arg3, local165, arg3 + local16, arg4);
		while (local9 > 0) {
			@Pc(206) boolean local206 = local9 <= local21;
			if (local70 < 0) {
				while (local70 < 0) {
					local79 += local147;
					local70 += local117;
					local117 += local105;
					local147 += local105;
					local7++;
				}
			}
			if (local206) {
				if (local88 < 0) {
					while (local88 < 0) {
						local97 += local155;
						local88 += local139;
						local155 += local113;
						local139 += local113;
						local11++;
					}
				}
				if (local97 < 0) {
					local88 += local139;
					local97 += local155;
					local139 += local113;
					local155 += local113;
					local11++;
				}
				local88 += -local161;
				local97 += -local145;
				local161 -= local109;
				local145 -= local109;
			}
			if (local79 < 0) {
				local79 += local147;
				local70 += local117;
				local117 += local105;
				local147 += local105;
				local7++;
			}
			local70 += -local153;
			local79 += -local135;
			local9--;
			local153 -= local101;
			local135 -= local101;
			@Pc(342) int local342 = arg2 - local9;
			@Pc(346) int local346 = arg2 + local9;
			@Pc(351) int local351 = arg3 + local7;
			@Pc(356) int local356 = arg3 - local7;
			if (local206) {
				@Pc(380) int local380 = arg3 + local11;
				@Pc(385) int local385 = arg3 - local11;
				Static315.method4662(local385, Static15.anIntArrayArray1[local342], local356, arg4);
				Static315.method4662(local380, Static15.anIntArrayArray1[local342], local385, arg6);
				Static315.method4662(local351, Static15.anIntArrayArray1[local342], local380, arg4);
				Static315.method4662(local385, Static15.anIntArrayArray1[local346], local356, arg4);
				Static315.method4662(local380, Static15.anIntArrayArray1[local346], local385, arg6);
				Static315.method4662(local351, Static15.anIntArrayArray1[local346], local380, arg4);
			} else {
				Static315.method4662(local351, Static15.anIntArrayArray1[local342], local356, arg4);
				Static315.method4662(local351, Static15.anIntArrayArray1[local346], local356, arg4);
			}
		}
	}
}
