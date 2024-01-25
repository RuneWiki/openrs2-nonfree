import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!kn", name = "j", descriptor = "Lclient!vb;")
	public static Class251 aClass251_6;

	@OriginalMember(owner = "client!kn", name = "n", descriptor = "Lclient!fi;")
	public static Class84 aClass84_1;

	@OriginalMember(owner = "client!kn", name = "o", descriptor = "[Lclient!kq;")
	public static final Class144[] aClass144Array1 = new Class144[2048];

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IBIIIIII)V")
	public static void method3189(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static47.anInt762 <= arg0 && arg6 <= Static60.anInt1086 && arg4 >= Static357.anInt6537 && arg1 <= Static85.anInt1517) {
			Static289.method3976(arg0, arg3, arg1, arg6, arg2, arg4, arg5);
		} else {
			Static426.method5748(arg6, arg5, arg4, arg2, arg3, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(B)Z")
	public static boolean method3190() {
		try {
			if (Static25.anInt424 == 2) {
				if (Static180.aClass1_Sub33_3 == null) {
					Static180.aClass1_Sub33_3 = Static461.method4741(Static289.aClass109_67, Static428.anInt7488, Static85.anInt1527);
					if (Static180.aClass1_Sub33_3 == null) {
						return false;
					}
				}
				if (Static24.aClass240_1 == null) {
					Static24.aClass240_1 = new Class240(Static406.aClass109_92, Static58.aClass109_22);
				}
				if (Static398.aClass1_Sub5_Sub4_4.method4461(Static379.aClass109_85, Static24.aClass240_1, Static180.aClass1_Sub33_3)) {
					Static398.aClass1_Sub5_Sub4_4.method4466();
					Static398.aClass1_Sub5_Sub4_4.method4473(Static105.anInt2081);
					Static398.aClass1_Sub5_Sub4_4.method4452(Static67.aBoolean107, Static180.aClass1_Sub33_3);
					Static289.aClass109_67 = null;
					Static24.aClass240_1 = null;
					Static180.aClass1_Sub33_3 = null;
					Static25.anInt424 = 0;
					return true;
				}
			}
		} catch (@Pc(61) Exception local61) {
			local61.printStackTrace();
			Static398.aClass1_Sub5_Sub4_4.method4484();
			Static289.aClass109_67 = null;
			Static24.aClass240_1 = null;
			Static25.anInt424 = 0;
			Static180.aClass1_Sub33_3 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
	public static void method3191() {
		for (@Pc(7) int local7 = 0; local7 < Static381.anInt436; local7++) {
			@Pc(13) Class239 local13 = Static426.aClass239Array1[local7];
			@Pc(15) boolean local15 = false;
			@Pc(215) int local215;
			if (local13.aClass1_Sub5_Sub2_4 == null) {
				local13.anInt7126--;
				if (local13.anInt7126 >= (local13.aByte98 == 2 ? -1500 : -10)) {
					if (local13.aByte98 == 1 && local13.aClass215_1 == null) {
						local13.aClass215_1 = Static463.method5099(Static453.aClass109_44, local13.anInt7128, 0);
						if (local13.aClass215_1 == null) {
							continue;
						}
						local13.anInt7126 += local13.aClass215_1.method5096();
					} else if (local13.aByte98 == 2 && (local13.aClass1_Sub29_1 == null || local13.aClass1_Sub6_Sub1_2 == null)) {
						if (local13.aClass1_Sub29_1 == null) {
							local13.aClass1_Sub29_1 = Static258.method3652(Static360.aClass109_80, local13.anInt7128);
						}
						if (local13.aClass1_Sub29_1 == null) {
							continue;
						}
						if (local13.aClass1_Sub6_Sub1_2 == null) {
							local13.aClass1_Sub6_Sub1_2 = local13.aClass1_Sub29_1.method3656(new int[] { 22050 });
							if (local13.aClass1_Sub6_Sub1_2 == null) {
								continue;
							}
						}
					}
					if (local13.anInt7126 < 0) {
						if (local13.anInt7121 == 0) {
							local215 = Static327.aClass230_Sub1_1.anInt7298 * local13.anInt7124 >> 8;
						} else {
							@Pc(124) int local124 = local13.anInt7121 >> 24 & 0x3;
							if (local124 == Static255.aClass47_Sub1_Sub5_Sub2_2.aByte97) {
								@Pc(135) int local135 = (local13.anInt7121 & 0xFF) << 7;
								@Pc(142) int local142 = local13.anInt7121 >> 16 & 0xFF;
								@Pc(152) int local152 = (local142 << 7) + 64 - Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7060;
								if (local152 < 0) {
									local152 = -local152;
								}
								@Pc(164) int local164 = local13.anInt7121 >> 8 & 0xFF;
								@Pc(174) int local174 = (local164 << 7) + 64 - Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7066;
								if (local174 < 0) {
									local174 = -local174;
								}
								@Pc(185) int local185 = local174 + local152 - 128;
								if (local185 > local135) {
									local13.anInt7126 = -99999;
									continue;
								}
								if (local185 < 0) {
									local185 = 0;
								}
								local215 = (local135 - local185) * Static327.aClass230_Sub1_1.anInt7306 * local13.anInt7124 / local135 >> 8;
							} else {
								local215 = 0;
							}
						}
						if (local215 > 0) {
							@Pc(233) Class1_Sub6_Sub1 local233 = null;
							if (local13.aByte98 == 1) {
								local233 = local13.aClass215_1.method5098().method537(Static139.aClass57_1);
							} else if (local13.aByte98 == 2) {
								local233 = local13.aClass1_Sub6_Sub1_2;
							}
							@Pc(261) Class1_Sub5_Sub2 local261 = local13.aClass1_Sub5_Sub2_4 = Static460.method2004(local233, local215);
							local261.method1972(local13.anInt7119 - 1);
							Static292.aClass1_Sub5_Sub1_2.method422(local261);
						}
					}
				} else {
					local15 = true;
				}
			} else if (!local13.aClass1_Sub5_Sub2_4.method5966()) {
				local15 = true;
			}
			if (local15) {
				Static381.anInt436--;
				for (local215 = local7; local215 < Static381.anInt436; local215++) {
					Static426.aClass239Array1[local215] = Static426.aClass239Array1[local215 + 1];
				}
				local7--;
			}
		}
		if (Static292.aBoolean390 && !Static210.method3169()) {
			if (Static327.aClass230_Sub1_1.anInt7311 != 0 && Static274.anInt4619 != -1) {
				Static195.method3033(Static327.aClass230_Sub1_1.anInt7311, Static274.anInt4619, Static297.aClass109_69);
			}
			Static292.aBoolean390 = false;
		} else if (Static327.aClass230_Sub1_1.anInt7311 != 0 && Static274.anInt4619 != -1 && !Static210.method3169()) {
			Static224.method3272(Static15.aClass254_11);
			Static201.aClass1_Sub14_Sub2_2.method4522(Static274.anInt4619);
			Static274.anInt4619 = -1;
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IILclient!tp;)Lclient!mo;")
	public static Class167 method3192(@OriginalArg(1) int arg0, @OriginalArg(2) Class47_Sub1 arg1) {
		@Pc(12) Class167 local12;
		if (Static321.aClass167_3 == null) {
			local12 = new Class167();
		} else {
			local12 = Static321.aClass167_3;
			Static321.aClass167_3 = Static321.aClass167_3.aClass167_2;
			local12.aClass167_2 = null;
			Static78.anInt1454--;
		}
		local12.anInt4346 = arg0;
		local12.aClass47_Sub1_2 = arg1;
		return local12;
	}
}
