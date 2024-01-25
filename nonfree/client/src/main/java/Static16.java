import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!ap", name = "q", descriptor = "I")
	public static int anInt656;

	@OriginalMember(owner = "client!ap", name = "m", descriptor = "Lclient!fea;")
	public static final Class87 aClass87_1 = new Class87();

	@OriginalMember(owner = "client!ap", name = "o", descriptor = "I")
	public static int anInt654 = 0;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IBIIII)V")
	public static void method670(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(13) int local13 = arg3 * arg3;
		@Pc(17) int local17 = arg1 * arg1;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg1 << 1;
		@Pc(37) int local37 = local13 * (1 - local29) + local21;
		@Pc(46) int local46 = local17 - (local29 - 1) * local25;
		@Pc(50) int local50 = local13 << 2;
		@Pc(54) int local54 = local17 << 2;
		@Pc(69) int local69 = local21 * 3;
		@Pc(77) int local77 = local25 * ((arg1 << 1) - 3);
		@Pc(83) int local83 = local54;
		Static257.method4540(Static68.anIntArrayArray24[arg2], arg0, arg4 - arg3, arg3 + arg4);
		@Pc(102) int local102 = local50 * (arg1 - 1);
		while (local9 > 0) {
			if (local37 < 0) {
				while (local37 < 0) {
					local46 += local83;
					local37 += local69;
					local69 += local54;
					local83 += local54;
					local7++;
				}
			}
			if (local46 < 0) {
				local37 += local69;
				local46 += local83;
				local83 += local54;
				local69 += local54;
				local7++;
			}
			local46 += -local77;
			local37 += -local102;
			local77 -= local50;
			local9--;
			local102 -= local50;
			@Pc(173) int local173 = arg2 - local9;
			@Pc(177) int local177 = arg2 + local9;
			@Pc(181) int local181 = local7 + arg4;
			@Pc(186) int local186 = arg4 - local7;
			Static257.method4540(Static68.anIntArrayArray24[local173], arg0, local186, local181);
			Static257.method4540(Static68.anIntArrayArray24[local177], arg0, local186, local181);
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IB)V")
	public static void method671(@OriginalArg(0) int arg0) {
		@Pc(13) Class3_Sub10_Sub16 local13 = Static362.method5701(arg0, 16);
		local13.method6212();
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method672(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local10 = (local10 << 5) + Static331.method5274(arg0.charAt(local17)) - local10;
		}
		return local10;
	}
}
