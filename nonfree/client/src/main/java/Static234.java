import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!hr", name = "F", descriptor = "Lclient!pd;")
	public static final Class276 aClass276_3 = new Class276(1);

	@OriginalMember(owner = "client!hr", name = "N", descriptor = "Z")
	public static boolean aBoolean363 = false;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIIBIII)V")
	public static void method4232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg3 - arg5;
		@Pc(20) int local20 = arg0 - arg5;
		@Pc(24) int local24 = arg3 * arg3;
		@Pc(28) int local28 = arg0 * arg0;
		@Pc(32) int local32 = local15 * local15;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg0 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(69) int local69 = local24 * (1 - local56) + local40;
		@Pc(78) int local78 = local28 - (local56 - 1) * local44;
		@Pc(88) int local88 = (1 - local60) * local32 + local48;
		@Pc(109) int local109 = local36 - (local60 - 1) * local52;
		@Pc(113) int local113 = local24 << 2;
		@Pc(117) int local117 = local28 << 2;
		@Pc(121) int local121 = local32 << 2;
		@Pc(125) int local125 = local36 << 2;
		@Pc(129) int local129 = local40 * 3;
		@Pc(135) int local135 = (local56 - 3) * local44;
		@Pc(139) int local139 = local48 * 3;
		@Pc(145) int local145 = local52 * (local60 - 3);
		@Pc(147) int local147 = local117;
		@Pc(153) int local153 = (arg0 - 1) * local113;
		@Pc(155) int local155 = local125;
		@Pc(161) int local161 = (local20 - 1) * local121;
		@Pc(184) int local184;
		@Pc(193) int local193;
		@Pc(202) int local202;
		@Pc(211) int local211;
		if (Static427.anInt7845 <= arg2 && Static631.anInt10922 >= arg2) {
			@Pc(175) int[] local175 = Static186.anIntArrayArray12[arg2];
			local184 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg1 - arg3);
			local193 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg1 + arg3);
			local202 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg1 - local15);
			local211 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg1 + local15);
			Static567.method8614(local184, local202, local175, arg6);
			Static567.method8614(local202, local211, local175, arg4);
			Static567.method8614(local211, local193, local175, arg6);
		}
		while (local9 > 0) {
			@Pc(242) boolean local242 = local9 <= local20;
			if (local242) {
				if (local88 < 0) {
					while (local88 < 0) {
						local88 += local139;
						local109 += local155;
						local139 += local125;
						local11++;
						local155 += local125;
					}
				}
				if (local109 < 0) {
					local109 += local155;
					local88 += local139;
					local139 += local125;
					local11++;
					local155 += local125;
				}
				local109 += -local145;
				local88 += -local161;
				local145 -= local121;
				local161 -= local121;
			}
			if (local69 < 0) {
				while (local69 < 0) {
					local78 += local147;
					local69 += local129;
					local129 += local117;
					local7++;
					local147 += local117;
				}
			}
			if (local78 < 0) {
				local69 += local129;
				local78 += local147;
				local129 += local117;
				local7++;
				local147 += local117;
			}
			local78 += -local135;
			local69 += -local153;
			local9--;
			local135 -= local113;
			local153 -= local113;
			local184 = arg2 - local9;
			local193 = arg2 + local9;
			if (local193 >= Static427.anInt7845 && Static631.anInt10922 >= local184) {
				local202 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg1 + local7);
				local211 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg1 - local7);
				if (local242) {
					@Pc(417) int local417 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg1 + local11);
					@Pc(426) int local426 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg1 - local11);
					@Pc(433) int[] local433;
					if (local184 >= Static427.anInt7845) {
						local433 = Static186.anIntArrayArray12[local184];
						Static567.method8614(local211, local426, local433, arg6);
						Static567.method8614(local426, local417, local433, arg4);
						Static567.method8614(local417, local202, local433, arg6);
					}
					if (Static631.anInt10922 >= local193) {
						local433 = Static186.anIntArrayArray12[local193];
						Static567.method8614(local211, local426, local433, arg6);
						Static567.method8614(local426, local417, local433, arg4);
						Static567.method8614(local417, local202, local433, arg6);
					}
				} else {
					if (local184 >= Static427.anInt7845) {
						Static567.method8614(local211, local202, Static186.anIntArrayArray12[local184], arg6);
					}
					if (local193 <= Static631.anInt10922) {
						Static567.method8614(local211, local202, Static186.anIntArrayArray12[local193], arg6);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BIIIIII)V")
	public static void method4233(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static574.anInt10017 = arg4;
		Static475.anInt8500 = arg3;
		Static17.anInt8631 = arg1;
		Static236.anInt4713 = arg2;
		Static58.anInt1127 = arg0;
		Static607.anInt10630 = arg5;
	}
}
