import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "Lclient!te;")
	public static final Class188 aClass188_9 = new Class188(64);

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "[I")
	public static final int[] anIntArray470 = new int[14];

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "[I")
	public static final int[] anIntArray471 = new int[2500];

	@OriginalMember(owner = "client!sl", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString211 = "Ok";

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!ir;I)V")
	public static void method4936(@OriginalArg(0) Class100 arg0) {
		Static205.anInt65 = arg0.method2304("p11_full");
		Static79.anInt5522 = arg0.method2304("p12_full");
		Static344.anInt6697 = arg0.method2304("b12_full");
		Static221.anInt4561 = arg0.method2304("hitmarks");
		Static7.anInt210 = arg0.method2304("hitbar_default");
		Static174.anInt3625 = arg0.method2304("timerbar_default");
		Static162.anInt2150 = arg0.method2304("headicons_pk");
		Static233.anInt4700 = arg0.method2304("headicons_prayer");
		Static197.anInt4049 = arg0.method2304("hint_headicons");
		Static178.anInt3701 = arg0.method2304("hint_mapmarkers");
		Static37.anInt6455 = arg0.method2304("mapflag");
		Static172.anInt3601 = arg0.method2304("cross");
		Static331.anInt6459 = arg0.method2304("mapdots");
		Static171.anInt3586 = arg0.method2304("scrollbar");
		Static19.anInt534 = arg0.method2304("name_icons");
		Static57.anInt1245 = arg0.method2304("floorshadows");
		Static132.anInt2760 = arg0.method2304("compass");
		Static343.anInt6682 = arg0.method2304("hint_mapedge");
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)V")
	public static void method4937() {
		if (Static11.aClass15_1 != null) {
			@Pc(7) Class15 local7 = Static11.aClass15_1;
			synchronized (Static11.aClass15_1) {
				Static11.aClass15_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method4938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = arg2;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21 = arg1 - arg3;
		@Pc(26) int local26 = arg2 - arg3;
		@Pc(30) int local30 = arg1 * arg1;
		@Pc(34) int local34 = arg2 * arg2;
		@Pc(38) int local38 = local21 * local21;
		@Pc(42) int local42 = local26 * local26;
		@Pc(46) int local46 = local34 << 1;
		@Pc(50) int local50 = local30 << 1;
		@Pc(54) int local54 = local42 << 1;
		@Pc(58) int local58 = local38 << 1;
		@Pc(62) int local62 = arg2 << 1;
		@Pc(66) int local66 = local26 << 1;
		@Pc(75) int local75 = local46 + (1 - local62) * local30;
		@Pc(83) int local83 = local34 - (local62 - 1) * local50;
		@Pc(91) int local91 = local54 + local38 * (1 - local66);
		@Pc(100) int local100 = local42 - local58 * (local66 - 1);
		@Pc(104) int local104 = local30 << 2;
		@Pc(108) int local108 = local34 << 2;
		@Pc(112) int local112 = local38 << 2;
		@Pc(116) int local116 = local42 << 2;
		@Pc(120) int local120 = local46 * 3;
		@Pc(126) int local126 = local50 * (local62 - 3);
		@Pc(130) int local130 = local54 * 3;
		@Pc(136) int local136 = local58 * (local66 - 3);
		@Pc(138) int local138 = local108;
		@Pc(144) int local144 = local104 * (arg2 - 1);
		@Pc(146) int local146 = local116;
		@Pc(152) int local152 = local112 * (local26 - 1);
		@Pc(156) int[] local156 = Static196.anIntArrayArray37[arg4];
		Static162.method1731(arg0 - local21, local156, arg0 - arg1, arg5);
		Static162.method1731(local21 + arg0, local156, arg0 - local21, arg6);
		Static162.method1731(arg1 + arg0, local156, arg0 + local21, arg5);
		while (local14 > 0) {
			@Pc(201) boolean local201 = local26 >= local14;
			if (local201) {
				if (local91 < 0) {
					while (local91 < 0) {
						local91 += local130;
						local100 += local146;
						local130 += local116;
						local146 += local116;
						local16++;
					}
				}
				if (local100 < 0) {
					local100 += local146;
					local91 += local130;
					local16++;
					local146 += local116;
					local130 += local116;
				}
				local100 += -local136;
				local91 += -local152;
				local152 -= local112;
				local136 -= local112;
			}
			if (local75 < 0) {
				while (local75 < 0) {
					local83 += local138;
					local75 += local120;
					local120 += local108;
					local138 += local108;
					local12++;
				}
			}
			if (local83 < 0) {
				local75 += local120;
				local83 += local138;
				local120 += local108;
				local12++;
				local138 += local108;
			}
			local75 += -local144;
			local83 += -local126;
			local14--;
			local144 -= local104;
			local126 -= local104;
			@Pc(341) int local341 = arg4 - local14;
			@Pc(345) int local345 = local14 + arg4;
			@Pc(349) int local349 = arg0 + local12;
			@Pc(354) int local354 = arg0 - local12;
			if (local201) {
				@Pc(378) int local378 = local16 + arg0;
				@Pc(383) int local383 = arg0 - local16;
				Static162.method1731(local383, Static196.anIntArrayArray37[local341], local354, arg5);
				Static162.method1731(local378, Static196.anIntArrayArray37[local341], local383, arg6);
				Static162.method1731(local349, Static196.anIntArrayArray37[local341], local378, arg5);
				Static162.method1731(local383, Static196.anIntArrayArray37[local345], local354, arg5);
				Static162.method1731(local378, Static196.anIntArrayArray37[local345], local383, arg6);
				Static162.method1731(local349, Static196.anIntArrayArray37[local345], local378, arg5);
			} else {
				Static162.method1731(local349, Static196.anIntArrayArray37[local341], local354, arg5);
				Static162.method1731(local349, Static196.anIntArrayArray37[local345], local354, arg5);
			}
		}
	}
}
