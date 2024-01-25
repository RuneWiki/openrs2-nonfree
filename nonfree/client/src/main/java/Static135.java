import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!im", name = "i", descriptor = "Lclient!dp;")
	public static Class53 aClass53_140;

	@OriginalMember(owner = "client!im", name = "j", descriptor = "I")
	public static int anInt5752;

	@OriginalMember(owner = "client!im", name = "l", descriptor = "[I")
	public static final int[] anIntArray648 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!im", name = "t", descriptor = "[I")
	public static final int[] anIntArray649 = new int[25];

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(B[II)V")
	public static void method5226(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 31; local7 > 0; local7--) {
			@Pc(13) int local13 = local7 * 36;
			for (@Pc(15) int local15 = 35; local15 > 0; local15--) {
				if (arg0[local15 + local13] == 0 && arg0[local13 + local15 - 1 - 36] != 0) {
					arg0[local15 + local13] = arg1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIIII)V")
	public static void method5227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class151 local3 = new Class151();
		local3.anInt4102 = arg1 >> 7;
		local3.anInt4121 = arg2 >> 7;
		local3.anInt4120 = arg3 >> 7;
		local3.anInt4109 = arg4 >> 7;
		local3.anInt4122 = arg0;
		local3.anInt4117 = arg1;
		local3.anInt4112 = arg2;
		local3.anInt4103 = arg3;
		local3.anInt4116 = arg4;
		local3.anInt4113 = arg5;
		local3.anInt4118 = arg6;
		Static52.aClass151Array1[Static192.anInt3644++] = local3;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIII)V")
	public static void method5228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(13) int local13 = arg4 * arg4;
		@Pc(17) int local17 = arg2 * arg2;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg2 << 1;
		@Pc(37) int local37 = local13 * (1 - local29) + local21;
		@Pc(46) int local46 = local17 - (local29 - 1) * local25;
		@Pc(50) int local50 = local13 << 2;
		@Pc(54) int local54 = local17 << 2;
		@Pc(62) int local62 = local21 * 3;
		@Pc(70) int local70 = ((arg2 << 1) - 3) * local25;
		@Pc(76) int local76 = local54;
		@Pc(87) int local87 = (arg2 - 1) * local50;
		Static14.method247(arg4 + arg0, arg1, Static11.anIntArrayArray11[arg3], arg0 - arg4);
		while (local9 > 0) {
			if (local37 < 0) {
				while (local37 < 0) {
					local46 += local76;
					local37 += local62;
					local62 += local54;
					local7++;
					local76 += local54;
				}
			}
			if (local46 < 0) {
				local37 += local62;
				local46 += local76;
				local62 += local54;
				local76 += local54;
				local7++;
			}
			local37 += -local87;
			local46 += -local70;
			local87 -= local50;
			local9--;
			local70 -= local50;
			@Pc(174) int local174 = arg3 - local9;
			@Pc(178) int local178 = local9 + arg3;
			@Pc(182) int local182 = local7 + arg0;
			@Pc(187) int local187 = arg0 - local7;
			Static14.method247(local182, arg1, Static11.anIntArrayArray11[local174], local187);
			Static14.method247(local182, arg1, Static11.anIntArrayArray11[local178], local187);
		}
	}
}
