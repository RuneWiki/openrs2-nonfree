import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!cp", name = "M", descriptor = "I")
	public static int anInt1569;

	@OriginalMember(owner = "client!cp", name = "N", descriptor = "Lclient!wk;")
	public static Class264 aClass264_7;

	@OriginalMember(owner = "client!cp", name = "B", descriptor = "Lclient!hh;")
	public static Class108 aClass108_3 = null;

	@OriginalMember(owner = "client!cp", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString18 = null;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Z)Lclient!qi;")
	public static Class173 method1173() {
		try {
			return new Class173_Sub2();
		} catch (@Pc(13) Throwable local13) {
			try {
				return (Class173) Class.forName("Class173_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class173_Sub3();
			}
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(BIIIIIII)V")
	public static void method1174(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg6;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg1 - arg5;
		@Pc(21) int local21 = arg6 - arg5;
		@Pc(25) int local25 = arg1 * arg1;
		@Pc(29) int local29 = arg6 * arg6;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg6 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local41 + local25 * (1 - local57);
		@Pc(79) int local79 = local29 - (local57 - 1) * local45;
		@Pc(89) int local89 = (1 - local61) * local33 + local49;
		@Pc(98) int local98 = local37 - (local61 - 1) * local53;
		@Pc(102) int local102 = local25 << 2;
		@Pc(106) int local106 = local29 << 2;
		@Pc(110) int local110 = local33 << 2;
		@Pc(114) int local114 = local37 << 2;
		@Pc(118) int local118 = local41 * 3;
		@Pc(124) int local124 = local45 * (local57 - 3);
		@Pc(128) int local128 = local49 * 3;
		@Pc(134) int local134 = (local61 - 3) * local53;
		@Pc(136) int local136 = local106;
		@Pc(142) int local142 = local102 * (arg6 - 1);
		@Pc(144) int local144 = local114;
		@Pc(155) int local155 = (local21 - 1) * local110;
		@Pc(182) int local182;
		@Pc(190) int local190;
		@Pc(199) int local199;
		@Pc(207) int local207;
		if (Static388.anInt6740 <= arg0 && Static387.anInt6727 >= arg0) {
			@Pc(173) int[] local173 = Static162.anIntArrayArray58[arg0];
			local182 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg2 - arg1);
			local190 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg1 + arg2);
			local199 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg2 - local16);
			local207 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, local16 + arg2);
			Static335.method4533(local199, arg4, local182, local173);
			Static335.method4533(local207, arg3, local199, local173);
			Static335.method4533(local190, arg4, local207, local173);
		}
		while (local9 > 0) {
			@Pc(234) boolean local234 = local21 >= local9;
			if (local70 < 0) {
				while (local70 < 0) {
					local70 += local118;
					local79 += local136;
					local7++;
					local136 += local106;
					local118 += local106;
				}
			}
			if (local234) {
				if (local89 < 0) {
					while (local89 < 0) {
						local98 += local144;
						local89 += local128;
						local11++;
						local144 += local114;
						local128 += local114;
					}
				}
				if (local98 < 0) {
					local98 += local144;
					local89 += local128;
					local144 += local114;
					local11++;
					local128 += local114;
				}
				local98 += -local134;
				local89 += -local155;
				local134 -= local110;
				local155 -= local110;
			}
			if (local79 < 0) {
				local79 += local136;
				local70 += local118;
				local7++;
				local118 += local106;
				local136 += local106;
			}
			local70 += -local142;
			local79 += -local124;
			local124 -= local102;
			local142 -= local102;
			local9--;
			local182 = arg0 - local9;
			local190 = local9 + arg0;
			if (local190 >= Static388.anInt6740 && Static387.anInt6727 >= local182) {
				local199 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, local7 + arg2);
				local207 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg2 - local7);
				if (local234) {
					@Pc(442) int local442 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg2 + local11);
					@Pc(451) int local451 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg2 - local11);
					@Pc(462) int[] local462;
					if (local182 >= Static388.anInt6740) {
						local462 = Static162.anIntArrayArray58[local182];
						Static335.method4533(local451, arg4, local207, local462);
						Static335.method4533(local442, arg3, local451, local462);
						Static335.method4533(local199, arg4, local442, local462);
					}
					if (local190 <= Static387.anInt6727) {
						local462 = Static162.anIntArrayArray58[local190];
						Static335.method4533(local451, arg4, local207, local462);
						Static335.method4533(local442, arg3, local451, local462);
						Static335.method4533(local199, arg4, local442, local462);
					}
				} else {
					if (local182 >= Static388.anInt6740) {
						Static335.method4533(local199, arg4, local207, Static162.anIntArrayArray58[local182]);
					}
					if (Static387.anInt6727 >= local190) {
						Static335.method4533(local199, arg4, local207, Static162.anIntArrayArray58[local190]);
					}
				}
			}
		}
	}
}
