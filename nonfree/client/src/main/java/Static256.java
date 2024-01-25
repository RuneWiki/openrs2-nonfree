import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!jt", name = "g", descriptor = "[[B")
	public static byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_64 = new Class276(25, -2);

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "Z")
	public static boolean aBoolean474 = false;

	@OriginalMember(owner = "client!jt", name = "h", descriptor = "[I")
	public static final int[] anIntArray330 = new int[14];

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4563(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg4 - arg6;
		@Pc(20) int local20 = arg3 - arg6;
		@Pc(24) int local24 = arg4 * arg4;
		@Pc(28) int local28 = arg3 * arg3;
		@Pc(32) int local32 = local16 * local16;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg3 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(68) int local68 = local40 + (1 - local56) * local24;
		@Pc(77) int local77 = local28 - (local56 - 1) * local44;
		@Pc(87) int local87 = (1 - local60) * local32 + local48;
		@Pc(96) int local96 = local36 - local52 * (local60 - 1);
		@Pc(100) int local100 = local24 << 2;
		@Pc(104) int local104 = local28 << 2;
		@Pc(108) int local108 = local32 << 2;
		@Pc(112) int local112 = local36 << 2;
		@Pc(116) int local116 = local40 * 3;
		@Pc(122) int local122 = (local56 - 3) * local44;
		@Pc(126) int local126 = local48 * 3;
		@Pc(132) int local132 = (local60 - 3) * local52;
		@Pc(134) int local134 = local104;
		@Pc(140) int local140 = (arg3 - 1) * local100;
		@Pc(142) int local142 = local112;
		@Pc(152) int local152 = (local20 - 1) * local108;
		@Pc(156) int[] local156 = Static333.anIntArrayArray56[arg1];
		Static426.method6794(arg0 - local16, local156, arg0 - arg4, arg5);
		Static426.method6794(local16 + arg0, local156, arg0 - local16, arg2);
		Static426.method6794(arg0 + arg4, local156, local16 + arg0, arg5);
		while (local9 > 0) {
			@Pc(199) boolean local199 = local9 <= local20;
			if (local199) {
				if (local87 < 0) {
					while (local87 < 0) {
						local87 += local126;
						local96 += local142;
						local126 += local112;
						local11++;
						local142 += local112;
					}
				}
				if (local96 < 0) {
					local96 += local142;
					local87 += local126;
					local142 += local112;
					local11++;
					local126 += local112;
				}
				local96 += -local132;
				local87 += -local152;
				local152 -= local108;
				local132 -= local108;
			}
			if (local68 < 0) {
				while (local68 < 0) {
					local68 += local116;
					local77 += local134;
					local116 += local104;
					local134 += local104;
					local7++;
				}
			}
			if (local77 < 0) {
				local77 += local134;
				local68 += local116;
				local7++;
				local134 += local104;
				local116 += local104;
			}
			local77 += -local122;
			local68 += -local140;
			local9--;
			local140 -= local100;
			local122 -= local100;
			@Pc(336) int local336 = arg1 - local9;
			@Pc(340) int local340 = local9 + arg1;
			@Pc(344) int local344 = arg0 + local7;
			@Pc(349) int local349 = arg0 - local7;
			if (local199) {
				@Pc(373) int local373 = local11 + arg0;
				@Pc(378) int local378 = arg0 - local11;
				Static426.method6794(local378, Static333.anIntArrayArray56[local336], local349, arg5);
				Static426.method6794(local373, Static333.anIntArrayArray56[local336], local378, arg2);
				Static426.method6794(local344, Static333.anIntArrayArray56[local336], local373, arg5);
				Static426.method6794(local378, Static333.anIntArrayArray56[local340], local349, arg5);
				Static426.method6794(local373, Static333.anIntArrayArray56[local340], local378, arg2);
				Static426.method6794(local344, Static333.anIntArrayArray56[local340], local373, arg5);
			} else {
				Static426.method6794(local344, Static333.anIntArrayArray56[local336], local349, arg5);
				Static426.method6794(local344, Static333.anIntArrayArray56[local340], local349, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method4564(@OriginalArg(1) String arg0) {
		return Static30.method983(arg0);
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(BLclient!fd;)Lclient!pv;")
	public static Class260_Sub1_Sub1 method4566(@OriginalArg(1) Class3_Sub7 arg0) {
		@Pc(15) Class260_Sub1 local15 = Static309.method5149(arg0);
		@Pc(19) int local19 = arg0.method6525();
		return new Class260_Sub1_Sub1(local15.aClass100_11, local15.aClass237_11, local15.anInt9472, local15.anInt9473, local15.anInt9475, local15.anInt9476, local15.anInt9468, local15.anInt9478, local15.anInt9477, local15.anInt8147, local15.anInt8146, local15.anInt8145, local15.anInt8144, local15.anInt8148, local15.anInt8150, local19);
	}
}
