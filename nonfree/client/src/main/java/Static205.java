import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "Lclient!ej;")
	public static Class107 aClass107_1;

	@OriginalMember(owner = "client!gu", name = "g", descriptor = "Lclient!ha;")
	public static Class57 aClass57_5;

	@OriginalMember(owner = "client!gu", name = "i", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_38 = new Class387(14, 11);

	@OriginalMember(owner = "client!gu", name = "f", descriptor = "I")
	public static int anInt3334 = 0;

	@OriginalMember(owner = "client!gu", name = "e", descriptor = "Lclient!el;")
	public static final Class109 aClass109_73 = new Class109(119, -1);

	@OriginalMember(owner = "client!gu", name = "h", descriptor = "[I")
	public static final int[] anIntArray194 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIIIIII)V")
	public static void method2930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static257.method5458(arg2);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg2 - arg4;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg2;
		@Pc(29) int local29 = -arg2;
		@Pc(31) int local31 = local15;
		@Pc(34) int local34 = -local15;
		@Pc(36) int local36 = -1;
		@Pc(38) int local38 = -1;
		@Pc(42) int[] local42 = Static569.anIntArrayArray54[arg3];
		@Pc(47) int local47 = arg1 - local15;
		Static646.method7025(local42, arg1 - arg2, local47, arg0);
		@Pc(61) int local61 = arg1 + local15;
		Static646.method7025(local42, local47, local61, arg5);
		Static646.method7025(local42, local61, arg2 + arg1, arg0);
		while (local10 < local21) {
			local36 += 2;
			local38 += 2;
			local34 += local38;
			local29 += local36;
			if (local34 >= 0 && local31 >= 1) {
				Static326.anIntArray324[local31] = local10;
				local31--;
				local34 -= local31 << 1;
			}
			local10++;
			@Pc(130) int[] local130;
			@Pc(136) int[] local136;
			@Pc(140) int local140;
			@Pc(144) int local144;
			@Pc(149) int local149;
			@Pc(153) int local153;
			@Pc(157) int local157;
			if (local29 >= 0) {
				local21--;
				local29 -= local21 << 1;
				if (local21 < local15) {
					local130 = Static569.anIntArrayArray54[arg3 + local21];
					local136 = Static569.anIntArrayArray54[arg3 - local21];
					local140 = Static326.anIntArray324[local21];
					local144 = local10 + arg1;
					local149 = arg1 - local10;
					local153 = local140 + arg1;
					local157 = arg1 - local140;
					Static646.method7025(local130, local149, local157, arg0);
					Static646.method7025(local130, local157, local153, arg5);
					Static646.method7025(local130, local153, local144, arg0);
					Static646.method7025(local136, local149, local157, arg0);
					Static646.method7025(local136, local157, local153, arg5);
					Static646.method7025(local136, local153, local144, arg0);
				} else {
					local130 = Static569.anIntArrayArray54[local21 + arg3];
					local136 = Static569.anIntArrayArray54[arg3 - local21];
					local140 = arg1 + local10;
					local144 = arg1 - local10;
					Static646.method7025(local130, local144, local140, arg0);
					Static646.method7025(local136, local144, local140, arg0);
				}
			}
			local130 = Static569.anIntArrayArray54[local10 + arg3];
			local136 = Static569.anIntArrayArray54[arg3 - local10];
			local140 = local21 + arg1;
			local144 = arg1 - local21;
			if (local10 >= local15) {
				Static646.method7025(local130, local144, local140, arg0);
				Static646.method7025(local136, local144, local140, arg0);
			} else {
				local149 = local10 <= local31 ? local31 : Static326.anIntArray324[local10];
				local153 = arg1 + local149;
				local157 = arg1 - local149;
				Static646.method7025(local130, local144, local157, arg0);
				Static646.method7025(local130, local157, local153, arg5);
				Static646.method7025(local130, local153, local140, arg0);
				Static646.method7025(local136, local144, local157, arg0);
				Static646.method7025(local136, local157, local153, arg5);
				Static646.method7025(local136, local153, local140, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)V")
	public static void method2931(@OriginalArg(0) int arg0) {
		@Pc(16) Class5_Sub5_Sub6 local16 = Static478.method6972((long) arg0, 11);
		local16.method2686();
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lclient!nw;ZI[I)V")
	public static void method2933(@OriginalArg(0) Class8_Sub1_Sub3_Sub2_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(10) boolean local10;
		@Pc(12) int local12;
		if (arg0.anIntArray412 != null) {
			local10 = true;
			for (local12 = 0; local12 < arg0.anIntArray412.length; local12++) {
				if (arg0.anIntArray412[local12] != arg2[local12]) {
					local10 = false;
					break;
				}
			}
			if (local10 && arg0.anInt7023 != -1) {
				@Pc(54) Class165 local54 = Static158.aClass317_1.method7882(arg0.anInt7023, 100);
				@Pc(57) int local57 = local54.anInt3919;
				if (local57 == 1) {
					arg0.anInt7028 = 0;
					arg0.anInt7045 = arg1;
					arg0.anInt7046 = 0;
					arg0.anInt6979 = 1;
					arg0.anInt7006 = 0;
					if (!arg0.aBoolean540) {
						Static268.method4004(local54, arg0, arg0.anInt7028);
					}
				}
				if (local57 == 2) {
					arg0.anInt7046 = 0;
				}
			}
		}
		local10 = true;
		for (local12 = 0; local12 < arg2.length; local12++) {
			if (arg2[local12] != -1) {
				local10 = false;
			}
			if (arg0.anIntArray412 == null || arg0.anIntArray412[local12] == -1 || Static158.aClass317_1.method7882(arg2[local12], 100).anInt3910 >= Static158.aClass317_1.method7882(arg0.anIntArray412[local12], 100).anInt3910) {
				arg0.anInt7049 = arg0.anInt7050;
				arg0.anIntArray412 = arg2;
				arg0.anInt7045 = arg1;
			}
		}
		if (local10) {
			arg0.anInt7049 = arg0.anInt7050;
			arg0.anIntArray412 = arg2;
			arg0.anInt7045 = arg1;
		}
	}
}
