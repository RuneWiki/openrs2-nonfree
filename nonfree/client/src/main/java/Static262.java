import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "Lclient!e;")
	public static final Class58 aClass58_4 = new Class58(2);

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_160 = new Class214(92, 8);

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BIIIIIII)V")
	public static void method3373(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg3 - arg5;
		@Pc(20) int local20 = arg1 - arg5;
		@Pc(24) int local24 = arg3 * arg3;
		@Pc(28) int local28 = arg1 * arg1;
		@Pc(32) int local32 = local15 * local15;
		@Pc(40) int local40 = local20 * local20;
		@Pc(44) int local44 = local28 << 1;
		@Pc(48) int local48 = local24 << 1;
		@Pc(52) int local52 = local40 << 1;
		@Pc(56) int local56 = local32 << 1;
		@Pc(60) int local60 = arg1 << 1;
		@Pc(64) int local64 = local20 << 1;
		@Pc(73) int local73 = local44 + (1 - local60) * local24;
		@Pc(82) int local82 = local28 - local48 * (local60 - 1);
		@Pc(90) int local90 = local52 + local32 * (1 - local64);
		@Pc(99) int local99 = local40 - (local64 - 1) * local56;
		@Pc(103) int local103 = local24 << 2;
		@Pc(107) int local107 = local28 << 2;
		@Pc(111) int local111 = local32 << 2;
		@Pc(115) int local115 = local40 << 2;
		@Pc(119) int local119 = local44 * 3;
		@Pc(125) int local125 = local48 * (local60 - 3);
		@Pc(129) int local129 = local52 * 3;
		@Pc(135) int local135 = local56 * (local64 - 3);
		@Pc(137) int local137 = local107;
		@Pc(143) int local143 = local103 * (arg1 - 1);
		@Pc(145) int local145 = local115;
		@Pc(168) int local168;
		@Pc(176) int local176;
		@Pc(185) int local185;
		@Pc(194) int local194;
		if (Static74.anInt1413 <= arg0 && Static149.anInt7384 >= arg0) {
			@Pc(159) int[] local159 = Static106.anIntArrayArray46[arg0];
			local168 = Static63.method971(Static271.anInt4271, arg6 - arg3, Static13.anInt263);
			local176 = Static63.method971(Static271.anInt4271, arg3 + arg6, Static13.anInt263);
			local185 = Static63.method971(Static271.anInt4271, arg6 - local15, Static13.anInt263);
			local194 = Static63.method971(Static271.anInt4271, arg6 + local15, Static13.anInt263);
			Static298.method3891(local185, local168, local159, arg2);
			Static298.method3891(local194, local185, local159, arg4);
			Static298.method3891(local176, local194, local159, arg2);
		}
		@Pc(218) int local218 = (local20 - 1) * local111;
		while (local9 > 0) {
			@Pc(231) boolean local231 = local20 >= local9;
			if (local73 < 0) {
				while (local73 < 0) {
					local73 += local119;
					local82 += local137;
					local137 += local107;
					local119 += local107;
					local7++;
				}
			}
			if (local231) {
				if (local90 < 0) {
					while (local90 < 0) {
						local99 += local145;
						local90 += local129;
						local129 += local115;
						local145 += local115;
						local11++;
					}
				}
				if (local99 < 0) {
					local90 += local129;
					local99 += local145;
					local129 += local115;
					local11++;
					local145 += local115;
				}
				local90 += -local218;
				local99 += -local135;
				local218 -= local111;
				local135 -= local111;
			}
			if (local82 < 0) {
				local73 += local119;
				local82 += local137;
				local137 += local107;
				local119 += local107;
				local7++;
			}
			local73 += -local143;
			local82 += -local125;
			local143 -= local103;
			local125 -= local103;
			local9--;
			local168 = arg0 - local9;
			local176 = arg0 + local9;
			if (local176 >= Static74.anInt1413 && Static149.anInt7384 >= local168) {
				local185 = Static63.method971(Static271.anInt4271, arg6 + local7, Static13.anInt263);
				local194 = Static63.method971(Static271.anInt4271, arg6 - local7, Static13.anInt263);
				if (local231) {
					@Pc(406) int local406 = Static63.method971(Static271.anInt4271, local11 + arg6, Static13.anInt263);
					@Pc(414) int local414 = Static63.method971(Static271.anInt4271, arg6 - local11, Static13.anInt263);
					@Pc(421) int[] local421;
					if (local168 >= Static74.anInt1413) {
						local421 = Static106.anIntArrayArray46[local168];
						Static298.method3891(local414, local194, local421, arg2);
						Static298.method3891(local406, local414, local421, arg4);
						Static298.method3891(local185, local406, local421, arg2);
					}
					if (local176 <= Static149.anInt7384) {
						local421 = Static106.anIntArrayArray46[local176];
						Static298.method3891(local414, local194, local421, arg2);
						Static298.method3891(local406, local414, local421, arg4);
						Static298.method3891(local185, local406, local421, arg2);
					}
				} else {
					if (local168 >= Static74.anInt1413) {
						Static298.method3891(local185, local194, Static106.anIntArrayArray46[local168], arg2);
					}
					if (Static149.anInt7384 >= local176) {
						Static298.method3891(local185, local194, Static106.anIntArrayArray46[local176], arg2);
					}
				}
			}
		}
	}
}
