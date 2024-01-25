import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "Lclient!rc;")
	public static Class285 aClass285_3;

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "[Lclient!nu;")
	public static Class230[] aClass230Array1 = new Class230[50];

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
	public static int anInt1976 = 0;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIZIZI)V")
	public static void method1686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static7.anInt6410 = arg5;
		Static91.anInt2548 = arg3;
		Static243.anInt5395 = arg2;
		Static330.anInt4197 = arg1;
		Static284.anInt5885 = arg0;
		if (arg4 && Static330.anInt4197 >= 100) {
			Static637.anInt10650 = Static7.anInt6410 * 512 + 256;
			Static377.anInt7114 = Static243.anInt5395 * 512 + 256;
			Static504.anInt8868 = Static177.method3098(Static377.anInt7114, Static637.anInt10650, Static128.anInt3428) - Static91.anInt2548;
		}
		Static427.anInt8005 = 2;
		Static621.anInt10407 = -1;
		Static460.anInt8416 = -1;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZI)V")
	public static void method1687(@OriginalArg(1) int arg0) {
		if (arg0 == Static435.anInt8191) {
			return;
		}
		if (arg0 == 13) {
			if (Static193.aString58 == null) {
				Static155.method3150(Static191.aString57, Static99.anInt2642, Static95.aString32);
			} else {
				Static539.method7630(Static99.anInt2642);
			}
		}
		if (arg0 != 13 && Static150.aClass240_1 != null) {
			Static150.aClass240_1.method6372();
			Static150.aClass240_1 = null;
		}
		if (arg0 == 3) {
			Static352.method5561(Static378.anInt7229 != Static212.anInt4965);
		}
		if (arg0 == 7) {
			Static42.method1336(Static524.anInt9099 != Static212.anInt4965);
		}
		if (arg0 == 5) {
			if (Static193.aString58 == null) {
				Static375.method4957(Static95.aString32, Static191.aString57);
			} else {
				Static519.method7412();
			}
		} else if (arg0 == 6) {
			if (Static193.aString58 == null) {
				Static155.method3150(Static191.aString57, Static99.anInt2642, Static95.aString32);
			} else {
				Static539.method7630(Static99.anInt2642);
			}
		} else if (arg0 == 9) {
			if (Static193.aString58 == null) {
				Static155.method3150(Static191.aString57, Static99.anInt2642, Static95.aString32);
			} else {
				Static539.method7630(Static99.anInt2642);
			}
		} else if (arg0 == 12) {
			if (Static193.aString58 == null) {
				Static375.method4957(Static95.aString32, Static191.aString57);
			} else {
				Static519.method7412();
			}
		}
		if (Static351.method5556(Static435.anInt8191)) {
			Static205.aClass237_57.anInt7642 = 2;
			Static154.aClass237_13.anInt7642 = 2;
			Static385.aClass237_139.anInt7642 = 2;
			Static498.aClass237_122.anInt7642 = 2;
			Static31.aClass237_10.anInt7642 = 2;
			Static626.aClass237_147.anInt7642 = 2;
			Static484.aClass237_117.anInt7642 = 2;
		}
		if (Static351.method5556(arg0)) {
			Static146.anInt3693 = 1;
			Static156.anInt3935 = 1;
			Static137.anInt3573 = 0;
			Static201.anInt4620 = 0;
			Static308.anInt6237 = 0;
			Static590.method8160(true);
			Static205.aClass237_57.anInt7642 = 1;
			Static154.aClass237_13.anInt7642 = 1;
			Static385.aClass237_139.anInt7642 = 1;
			Static498.aClass237_122.anInt7642 = 1;
			Static31.aClass237_10.anInt7642 = 1;
			Static626.aClass237_147.anInt7642 = 1;
			Static484.aClass237_117.anInt7642 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static591.method8170();
		}
		@Pc(239) boolean local239 = arg0 == 2 || Static330.method3429(arg0) || Static118.method5770(arg0);
		@Pc(256) boolean local256 = Static435.anInt8191 == 2 || Static330.method3429(Static435.anInt8191) || Static118.method5770(Static435.anInt8191);
		if (local256 != local239) {
			if (local239) {
				Static505.anInt8909 = Static282.anInt5836;
				if (Static155.aClass8_Sub25_6.aClass36_Sub6_3.method3331() == 0) {
					Static383.method6155();
				} else {
					Static425.method5122(Static155.aClass8_Sub25_6.aClass36_Sub6_3.method3331(), Static628.aClass237_148, Static282.anInt5836);
					Static117.method2615();
				}
				Static499.aClass113_3.method3334(false);
			} else {
				Static383.method6155();
				Static499.aClass113_3.method3334(true);
			}
		}
		if (Static351.method5556(arg0) || arg0 == 13) {
			Static171.aClass16_5.method6081();
		}
		Static435.anInt8191 = arg0;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
	public static void method1688() {
		Static246.anIntArray316 = Static557.method7815(0.4F);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIZZI)V")
	public static void method1690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		if (!arg2 && Static325.anInt6515 == arg1 && Static19.anInt3646 == arg0 && (Static591.anInt10125 == Static128.anInt3428 || Static155.aClass8_Sub25_6.aClass36_Sub13_1.method4838() == 1)) {
			return;
		}
		Static325.anInt6515 = arg1;
		Static591.anInt10125 = Static128.anInt3428;
		Static19.anInt3646 = arg0;
		if (Static155.aClass8_Sub25_6.aClass36_Sub13_1.method4838() == 1) {
			Static591.anInt10125 = 0;
		}
		method1687(arg3);
		Static500.method7268(Static634.aClass27_19, true, Static171.aClass16_5, Static121.aClass84_12.method2710(Static372.anInt7083), Static446.aClass345_13);
		@Pc(56) int local56 = Static628.anInt10493;
		@Pc(58) int local58 = Static594.anInt10160;
		Static628.anInt10493 = (Static325.anInt6515 - (Static372.anInt7082 >> 4)) * 8;
		Static594.anInt10160 = (Static19.anInt3646 - (Static218.anInt5023 >> 4)) * 8;
		Static16.aClass8_Sub5_Sub4_1 = Static110.method6399(Static325.anInt6515 * 8, Static19.anInt3646 * 8);
		Static246.aClass14_2 = null;
		@Pc(91) int local91 = Static628.anInt10493 - local56;
		@Pc(96) int local96 = Static594.anInt10160 - local58;
		@Pc(103) int local103;
		@Pc(116) int local116;
		@Pc(231) int local231;
		@Pc(178) int local178;
		if (arg3 == 11) {
			for (local103 = 0; local103 < Static438.anInt8226; local103++) {
				@Pc(109) Class8_Sub50 local109 = Static537.aClass8_Sub50Array1[local103];
				if (local109 != null) {
					@Pc(114) Class15_Sub1_Sub2_Sub2_Sub2 local114 = local109.aClass15_Sub1_Sub2_Sub2_Sub2_2;
					for (local116 = 0; local116 < 10; local116++) {
						local114.anIntArray435[local116] -= local91;
						local114.anIntArray436[local116] -= local96;
					}
					local114.anInt10298 -= local96 * 512;
					local114.anInt10301 -= local91 * 512;
				}
			}
		} else {
			Static59.anInt1906 = 0;
			@Pc(166) boolean local166 = false;
			@Pc(172) int local172 = (Static372.anInt7082 - 1) * 512;
			local178 = Static218.anInt5023 * 512 - 512;
			for (local116 = 0; local116 < Static438.anInt8226; local116++) {
				@Pc(186) Class8_Sub50 local186 = Static537.aClass8_Sub50Array1[local116];
				if (local186 != null) {
					@Pc(191) Class15_Sub1_Sub2_Sub2_Sub2 local191 = local186.aClass15_Sub1_Sub2_Sub2_Sub2_2;
					local191.anInt10298 -= local96 * 512;
					local191.anInt10301 -= local91 * 512;
					if (local191.anInt10301 >= 0 && local191.anInt10301 <= local172 && local191.anInt10298 >= 0 && local178 >= local191.anInt10298) {
						@Pc(229) boolean local229 = true;
						for (local231 = 0; local231 < 10; local231++) {
							local191.anIntArray435[local231] -= local91;
							local191.anIntArray436[local231] -= local96;
							if (local191.anIntArray435[local231] < 0 || Static372.anInt7082 <= local191.anIntArray435[local231] || local191.anIntArray436[local231] < 0 || local191.anIntArray436[local231] >= Static218.anInt5023) {
								local229 = false;
							}
						}
						if (local229) {
							Static620.anIntArray609[Static59.anInt1906++] = local191.anInt8075;
						} else {
							local191.method6702(null);
							local186.method8640();
							local166 = true;
						}
					} else {
						local191.method6702(null);
						local166 = true;
						local186.method8640();
					}
				}
			}
			if (local166) {
				Static438.anInt8226 = Static278.aClass253_20.method6592();
				Static278.aClass253_20.method6590(Static537.aClass8_Sub50Array1);
			}
		}
		for (local103 = 0; local103 < 2048; local103++) {
			@Pc(343) Class15_Sub1_Sub2_Sub2_Sub1 local343 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local103];
			if (local343 != null) {
				for (local178 = 0; local178 < 10; local178++) {
					local343.anIntArray435[local178] -= local91;
					local343.anIntArray436[local178] -= local96;
				}
				local343.anInt10298 -= local96 * 512;
				local343.anInt10301 -= local91 * 512;
			}
		}
		@Pc(393) Class319[] local393 = Static447.aClass319Array3;
		for (local178 = 0; local178 < local393.length; local178++) {
			@Pc(401) Class319 local401 = local393[local178];
			if (local401 != null) {
				local401.anInt9115 -= local91 * 512;
				local401.anInt9122 -= local96 * 512;
			}
		}
		for (@Pc(429) Class8_Sub44 local429 = (Class8_Sub44) Static41.aClass43_12.method1422(); local429 != null; local429 = (Class8_Sub44) Static41.aClass43_12.method1426()) {
			local429.anInt9150 -= local96;
			local429.anInt9146 -= local91;
			if (Static336.anInt6621 != 4 && (local429.anInt9146 < 0 || local429.anInt9150 < 0 || Static372.anInt7082 <= local429.anInt9146 || Static218.anInt5023 <= local429.anInt9150)) {
				local429.method8640();
			}
		}
		if (Static336.anInt6621 != 4) {
			for (@Pc(489) Class8_Sub26 local489 = (Class8_Sub26) Static567.aClass253_38.method6593(); local489 != null; local489 = (Class8_Sub26) Static567.aClass253_38.method6595()) {
				@Pc(497) int local497 = (int) (local489.aLong285 & 0x3FFFL);
				@Pc(502) int local502 = local497 - Static628.anInt10493;
				local231 = (int) (local489.aLong285 >> 14 & 0x3FFFL);
				@Pc(515) int local515 = local231 - Static594.anInt10160;
				if (local502 < 0 || local515 < 0 || Static372.anInt7082 <= local502 || local515 >= Static218.anInt5023) {
					local489.method8640();
				}
			}
		}
		if (Static370.anInt7031 != 0) {
			Static29.anInt1137 -= local96;
			Static370.anInt7031 -= local91;
		}
		Static252.method4535();
		if (arg3 != 11) {
			Static243.anInt5395 -= local96;
			Static637.anInt10650 -= local91 * 512;
			Static377.anInt7114 -= local96 * 512;
			Static7.anInt6410 -= local91;
			Static567.anInt9757 -= local96;
			Static345.anInt6703 -= local91;
			if (Math.abs(local91) > Static372.anInt7082 || Math.abs(local96) > Static218.anInt5023) {
				Static364.method5679();
			}
		} else if (Static427.anInt8005 == 4) {
			Static572.anInt9826 -= local96 * 512;
			Static427.anInt8006 -= local91 * 512;
			Static4.anInt24 -= local91 * 512;
			Static93.anInt2585 -= local96 * 512;
		} else {
			Static427.anInt8005 = 1;
			Static621.anInt10407 = -1;
			Static460.anInt8416 = -1;
		}
		Static607.method6375();
		Static551.method7733();
		Static272.aClass43_30.method1431();
		Static199.aClass43_27.method1431();
		Static330.aClass123_6.method3534();
		Static456.method6914();
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)V")
	public static void method1691(@OriginalArg(0) int arg0) {
		Static227.anInt5187 = arg0;
		Static18.anInt872 = -1;
		Static329.anInt6567 = -1;
		Static119.method2632();
	}
}
