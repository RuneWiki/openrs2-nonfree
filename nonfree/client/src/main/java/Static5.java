import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
	public static int anInt146;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
	public static int anInt141 = 0;

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "Lclient!tl;")
	public static Class155 aClass155_1 = new Class155(32);

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString3 = "Use";

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
	public static int anInt145 = -1;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!kb;I)V")
	public static void method101(@OriginalArg(0) Class83 arg0) {
		Static290.aClass83_200 = arg0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)Lclient!fm;")
	public static Class58 method102(@OriginalArg(1) int arg0) {
		@Pc(10) Class58 local10 = (Class58) Static97.aClass155_45.method4358((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(29) byte[] local29 = Static192.aClass83_133.method2306(33, arg0);
		local10 = new Class58();
		if (local29 != null) {
			local10.method1424(arg0, new Class1_Sub16(local29));
		}
		Static97.aClass155_45.method4360((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg2 - arg1;
		@Pc(20) int local20 = arg0 - arg1;
		@Pc(24) int local24 = arg2 * arg2;
		@Pc(28) int local28 = local20 * local20;
		@Pc(32) int local32 = local16 * local16;
		@Pc(36) int local36 = local24 << 1;
		@Pc(40) int local40 = arg0 * arg0;
		@Pc(44) int local44 = local28 << 1;
		@Pc(48) int local48 = local32 << 1;
		@Pc(52) int local52 = local40 << 1;
		@Pc(56) int local56 = local20 << 1;
		@Pc(60) int local60 = arg0 << 1;
		@Pc(69) int local69 = local52 + (1 - local60) * local24;
		@Pc(78) int local78 = local40 - local36 * (local60 - 1);
		@Pc(87) int local87 = local44 + (1 - local56) * local32;
		@Pc(96) int local96 = local28 - (local56 - 1) * local48;
		@Pc(104) int local104 = local24 << 2;
		@Pc(108) int local108 = local32 << 2;
		@Pc(112) int local112 = local28 << 2;
		@Pc(116) int local116 = local40 << 2;
		@Pc(120) int local120 = local52 * 3;
		@Pc(126) int local126 = local36 * (local60 - 3);
		@Pc(130) int local130 = local44 * 3;
		@Pc(136) int local136 = (local56 - 3) * local48;
		@Pc(138) int local138 = local112;
		@Pc(140) int local140 = local116;
		@Pc(144) int[] local144 = Static57.anIntArrayArray9[arg4];
		@Pc(150) int local150 = (local20 - 1) * local108;
		Static89.method1538(local144, arg3 - local16, arg3 + -arg2, arg5);
		Static89.method1538(local144, arg3 + local16, -local16 + arg3, arg6);
		Static89.method1538(local144, arg2 + arg3, local16 + arg3, arg5);
		@Pc(189) int local189 = local104 * (arg0 - 1);
		while (local9 > 0) {
			if (local69 < 0) {
				while (local69 < 0) {
					local3++;
					local78 += local140;
					local140 += local116;
					local69 += local120;
					local120 += local116;
				}
			}
			if (local78 < 0) {
				local78 += local140;
				local140 += local116;
				local3++;
				local69 += local120;
				local120 += local116;
			}
			local78 += -local126;
			@Pc(252) boolean local252 = local20 >= local9;
			local9--;
			local69 += -local189;
			if (local252) {
				if (local87 < 0) {
					while (local87 < 0) {
						local96 += local138;
						local11++;
						local138 += local112;
						local87 += local130;
						local130 += local112;
					}
				}
				if (local96 < 0) {
					local11++;
					local96 += local138;
					local138 += local112;
					local87 += local130;
					local130 += local112;
				}
				local96 += -local136;
				local87 += -local150;
				local136 -= local108;
				local150 -= local108;
			}
			local126 -= local104;
			local189 -= local104;
			@Pc(338) int local338 = arg4 - local9;
			@Pc(342) int local342 = arg4 + local9;
			@Pc(346) int local346 = arg3 + local3;
			@Pc(351) int local351 = arg3 - local3;
			if (local252) {
				@Pc(358) int local358 = arg3 - local11;
				Static89.method1538(Static57.anIntArrayArray9[local338], local358, local351, arg5);
				@Pc(370) int local370 = local11 + arg3;
				Static89.method1538(Static57.anIntArrayArray9[local338], local370, local358, arg6);
				Static89.method1538(Static57.anIntArrayArray9[local338], local346, local370, arg5);
				Static89.method1538(Static57.anIntArrayArray9[local342], local358, local351, arg5);
				Static89.method1538(Static57.anIntArrayArray9[local342], local370, local358, arg6);
				Static89.method1538(Static57.anIntArrayArray9[local342], local346, local370, arg5);
			} else {
				Static89.method1538(Static57.anIntArrayArray9[local338], local346, local351, arg5);
				Static89.method1538(Static57.anIntArrayArray9[local342], local346, local351, arg5);
			}
		}
	}
}
