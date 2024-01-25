import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!gj", name = "m", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_54 = new Class349(68, 3);

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZLclient!k;Lclient!et;)Lclient!nla;")
	public static Class262 method2950(@OriginalArg(1) Class203 arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		@Pc(16) Class262 local16 = new Class262(arg0);
		@Pc(20) int local20 = arg1.method8581(-17416);
		@Pc(32) boolean local32 = (local20 & 0x1) != 0;
		@Pc(41) boolean local41 = (local20 & 0x2) != 0;
		@Pc(50) boolean local50 = (local20 & 0x4) != 0;
		if (local32) {
			local16.anIntArray503[0] = arg1.method8552();
			local16.anIntArray505[0] = arg1.method8552();
			if (arg0.anInt4833 != -1 || arg0.anInt4863 != -1) {
				local16.anIntArray503[1] = arg1.method8552();
				local16.anIntArray505[1] = arg1.method8552();
			}
			if (arg0.anInt4867 != -1 || arg0.anInt4866 != -1) {
				local16.anIntArray503[2] = arg1.method8552();
				local16.anIntArray505[2] = arg1.method8552();
			}
		}
		@Pc(131) boolean local131 = (local20 & 0x8) != 0;
		if (local41) {
			local16.anIntArray507[0] = arg1.method8552();
			local16.anIntArray504[0] = arg1.method8552();
			if (arg0.anInt4862 != -1 || arg0.anInt4891 != -1) {
				local16.anIntArray507[1] = arg1.method8552();
				local16.anIntArray504[1] = arg1.method8552();
			}
		}
		@Pc(182) int local182;
		@Pc(185) int[] local185;
		@Pc(217) int local217;
		if (local50) {
			local182 = arg1.method8575();
			local185 = new int[] { local182 & 0xF, local182 >> 4 & 0xF, local182 >> 8 & 0xF, (local182 & 0xF76B) >> 12 };
			for (local217 = 0; local217 < 4; local217++) {
				if (local185[local217] != 15) {
					local16.aShortArray119[local185[local217]] = (short) arg1.method8575();
				}
			}
		}
		if (local131) {
			local182 = arg1.method8581(-17416);
			local185 = new int[] { local182 & 0xF, local182 >> 4 & 0xF };
			for (local217 = 0; local217 < 2; local217++) {
				if (local185[local217] != 15) {
					local16.aShortArray120[local185[local217]] = (short) arg1.method8575();
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method2951(@OriginalArg(0) String arg0) {
		@Pc(13) Class2_Sub33 local13 = Static522.method7382();
		local13.aClass2_Sub20_Sub2_1.method8584(Static630.aClass396_11.anInt10768);
		local13.aClass2_Sub20_Sub2_1.method8551(0);
		@Pc(28) int local28 = local13.aClass2_Sub20_Sub2_1.anInt9723;
		local13.aClass2_Sub20_Sub2_1.method8551(664);
		@Pc(37) int[] local37 = Static708.method9451(37, local13);
		@Pc(41) int local41 = local13.aClass2_Sub20_Sub2_1.anInt9723;
		local13.aClass2_Sub20_Sub2_1.method8541(arg0);
		local13.aClass2_Sub20_Sub2_1.method8584(Static414.anInt9485);
		local13.aClass2_Sub20_Sub2_1.anInt9723 += 7;
		local13.aClass2_Sub20_Sub2_1.method8544(local41, local13.aClass2_Sub20_Sub2_1.anInt9723, local37);
		local13.aClass2_Sub20_Sub2_1.method8564(local13.aClass2_Sub20_Sub2_1.anInt9723 - local28);
		Static487.aClass221_1.method5173(local13);
		Static128.anInt2134 = 0;
		Static122.anInt2071 = 0;
		Static306.anInt4661 = 1;
		Static563.anInt8850 = -3;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BI)Z")
	public static boolean method2952(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZIIIII)V")
	public static void method2953(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static67.method9535(Static617.anInt9501, arg3, Static519.anInt8267);
		@Pc(17) int local17 = Static67.method9535(Static617.anInt9501, arg4, Static519.anInt8267);
		@Pc(23) int local23 = Static67.method9535(Static8.anInt99, arg0, Static14.anInt206);
		@Pc(42) int local42 = Static67.method9535(Static8.anInt99, arg5, Static14.anInt206);
		@Pc(50) int local50 = Static67.method9535(Static617.anInt9501, arg3 + arg2, Static519.anInt8267);
		@Pc(59) int local59 = Static67.method9535(Static617.anInt9501, arg4 - arg2, Static519.anInt8267);
		for (@Pc(61) int local61 = local11; local61 < local50; local61++) {
			Static494.method7075(local23, arg1, local42, Static449.anIntArrayArray48[local61], 18601);
		}
		for (@Pc(83) int local83 = local17; local83 > local59; local83--) {
			Static494.method7075(local23, arg1, local42, Static449.anIntArrayArray48[local83], 18601);
		}
		@Pc(113) int local113 = Static67.method9535(Static8.anInt99, arg0 + arg2, Static14.anInt206);
		@Pc(122) int local122 = Static67.method9535(Static8.anInt99, arg5 - arg2, Static14.anInt206);
		for (@Pc(124) int local124 = local50; local124 <= local59; local124++) {
			@Pc(132) int[] local132 = Static449.anIntArrayArray48[local124];
			Static494.method7075(local23, arg1, local113, local132, 18601);
			Static494.method7075(local122, arg1, local42, local132, 18601);
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)V")
	public static void method2954() {
		Static442.aClass2_Sub23_Sub5_3.method7681();
		Static478.aClass2_Sub23_Sub5_4 = null;
		Static39.anInt535 = 1;
		Static24.aClass254_16 = null;
	}
}
