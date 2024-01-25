import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static594 {

	@OriginalMember(owner = "client!uda", name = "x", descriptor = "Lclient!lq;")
	public static Class224 aClass224_12;

	@OriginalMember(owner = "client!uda", name = "n", descriptor = "[I")
	public static int[] anIntArray552 = new int[1];

	@OriginalMember(owner = "client!uda", name = "p", descriptor = "I")
	public static int anInt10008 = 0;

	@OriginalMember(owner = "client!uda", name = "w", descriptor = "I")
	public static int anInt10010 = -60;

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIIIBI)V")
	public static void method8605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static604.anInt10083 < arg1 || arg2 < Static456.anInt7815) {
			return;
		}
		@Pc(28) boolean local28;
		if (arg3 < Static642.anInt10429) {
			local28 = false;
			arg3 = Static642.anInt10429;
		} else if (Static456.anInt7806 < arg3) {
			local28 = false;
			arg3 = Static456.anInt7806;
		} else {
			local28 = true;
		}
		@Pc(52) boolean local52;
		if (arg0 < Static642.anInt10429) {
			arg0 = Static642.anInt10429;
			local52 = false;
		} else if (Static456.anInt7806 >= arg0) {
			local52 = true;
		} else {
			local52 = false;
			arg0 = Static456.anInt7806;
		}
		if (Static456.anInt7815 <= arg1) {
			Static646.method7025(Static569.anIntArrayArray54[arg1++], arg3, arg0, arg4);
		} else {
			arg1 = Static456.anInt7815;
		}
		if (arg2 <= Static604.anInt10083) {
			Static646.method7025(Static569.anIntArrayArray54[arg2--], arg3, arg0, arg4);
		} else {
			arg2 = Static604.anInt10083;
		}
		@Pc(119) int local119;
		if (local28 && local52) {
			for (local119 = arg1; local119 <= arg2; local119++) {
				@Pc(181) int[] local181 = Static569.anIntArrayArray54[local119];
				local181[arg3] = local181[arg0] = arg4;
			}
		} else if (local28) {
			for (local119 = arg1; local119 <= arg2; local119++) {
				Static569.anIntArrayArray54[local119][arg3] = arg4;
			}
		} else if (local52) {
			for (local119 = arg1; local119 <= arg2; local119++) {
				Static569.anIntArrayArray54[local119][arg0] = arg4;
			}
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(BLclient!ib;)Lclient!uca;")
	public static Class341 method8606(@OriginalArg(1) Class5_Sub23 arg0) {
		@Pc(7) String local7 = arg0.method8497();
		@Pc(14) Class219 local14 = Static67.method1093()[arg0.method8529()];
		@Pc(21) Class368 local21 = Static290.method4382()[arg0.method8529()];
		@Pc(25) int local25 = arg0.method8516();
		@Pc(29) int local29 = arg0.method8516();
		@Pc(33) int local33 = arg0.method8529();
		@Pc(46) int local46 = arg0.method8529();
		@Pc(50) int local50 = arg0.method8529();
		@Pc(54) int local54 = arg0.method8519();
		@Pc(58) int local58 = arg0.method8519();
		@Pc(62) int local62 = arg0.method8527();
		@Pc(66) int local66 = arg0.method8527();
		@Pc(70) int local70 = arg0.method8527();
		return new Class341(local7, local14, local21, local25, local29, local33, local46, local50, local54, local58, local62, local66, local70);
	}
}
