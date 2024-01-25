import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!nq", name = "v", descriptor = "Lclient!im;")
	public static final Class140 aClass140_90 = new Class140(71, 0);

	@OriginalMember(owner = "client!nq", name = "A", descriptor = "I")
	public static int anInt5976 = 0;

	@OriginalMember(owner = "client!nq", name = "B", descriptor = "Lclient!im;")
	public static final Class140 aClass140_91 = new Class140(82, 5);

	@OriginalMember(owner = "client!nq", name = "C", descriptor = "I")
	public static int anInt5977 = 0;

	@OriginalMember(owner = "client!nq", name = "D", descriptor = "Lclient!im;")
	public static final Class140 aClass140_92 = new Class140(100, 17);

	@OriginalMember(owner = "client!nq", name = "E", descriptor = "[I")
	public static final int[] anIntArray600 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!nq", name = "F", descriptor = "I")
	public static int anInt5978 = 0;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIIZ)V")
	public static void method5062(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3 && arg0 == Static460.anInt7803 && arg1 == Static212.anInt4105 && (Static206.anInt4061 == Static501.anInt8491 || Static544.aClass1_Sub22_Sub1_1.method4662(Static374.anInt6861))) {
			return;
		}
		Static460.anInt7803 = arg0;
		Static212.anInt4105 = arg1;
		Static206.anInt4061 = Static501.anInt8491;
		if (Static544.aClass1_Sub22_Sub1_1.method4662(Static374.anInt6861)) {
			Static206.anInt4061 = 0;
		}
		Static85.method1463(arg2);
		Static489.method6714(Static190.aClass306_42.method7165(Static179.anInt3168), true, Static112.aClass67_3);
		@Pc(56) int local56 = Static470.anInt7897;
		@Pc(58) int local58 = Static534.anInt9007;
		Static470.anInt7897 = (Static460.anInt7803 - (Static459.anInt7799 >> 4)) * 8;
		Static534.anInt9007 = (Static212.anInt4105 - (Static482.anInt7990 >> 4)) * 8;
		Static489.aClass1_Sub1_Sub5_3 = Static118.method821(Static460.anInt7803 * 8, Static212.anInt4105 * 8);
		Static111.aClass53_3 = null;
		@Pc(96) int local96 = Static470.anInt7897 - local56;
		@Pc(101) int local101 = Static534.anInt9007 - local58;
		@Pc(122) int local122;
		@Pc(124) int local124;
		@Pc(180) int local180;
		@Pc(293) int local293;
		if (arg2 == 10) {
			for (local293 = 0; local293 < Static350.anInt6254; local293++) {
				@Pc(299) Class1_Sub17 local299 = Static177.aClass1_Sub17Array3[local293];
				if (local299 != null) {
					@Pc(304) Class49_Sub2_Sub2_Sub2 local304 = local299.aClass49_Sub2_Sub2_Sub2_2;
					for (local124 = 0; local124 < 10; local124++) {
						local304.anIntArray428[local124] -= local96;
						local304.anIntArray427[local124] -= local101;
					}
					local304.anInt7141 -= local101 * 512;
					local304.anInt7137 -= local96 * 512;
				}
			}
		} else {
			@Pc(108) boolean local108 = false;
			Static157.anInt4503 = 0;
			@Pc(116) int local116 = Static459.anInt7799 * 512 - 512;
			local122 = Static482.anInt7990 * 512 - 512;
			for (local124 = 0; local124 < Static350.anInt6254; local124++) {
				@Pc(130) Class1_Sub17 local130 = Static177.aClass1_Sub17Array3[local124];
				if (local130 != null) {
					@Pc(135) Class49_Sub2_Sub2_Sub2 local135 = local130.aClass49_Sub2_Sub2_Sub2_2;
					local135.anInt7141 -= local101 * 512;
					local135.anInt7137 -= local96 * 512;
					if (local135.anInt7137 >= 0 && local116 >= local135.anInt7137 && local135.anInt7141 >= 0 && local122 >= local135.anInt7141) {
						@Pc(178) boolean local178 = true;
						for (local180 = 0; local180 < 10; local180++) {
							local135.anIntArray428[local180] -= local96;
							local135.anIntArray427[local180] -= local101;
							if (local135.anIntArray428[local180] < 0 || Static459.anInt7799 <= local135.anIntArray428[local180] || local135.anIntArray427[local180] < 0 || Static482.anInt7990 <= local135.anIntArray427[local180]) {
								local178 = false;
							}
						}
						if (local178) {
							Static427.anIntArray711[Static157.anInt4503++] = local135.anInt4295;
						} else {
							local135.method3802(null);
							local130.method7525();
							local108 = true;
						}
					} else {
						local135.method3802(null);
						local108 = true;
						local130.method7525();
					}
				}
			}
			if (local108) {
				Static350.anInt6254 = Static380.aClass17_29.method742();
				Static380.aClass17_29.method739(Static177.aClass1_Sub17Array3);
			}
		}
		for (local293 = 0; local293 < 2048; local293++) {
			@Pc(360) Class49_Sub2_Sub2_Sub1 local360 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local293];
			if (local360 != null) {
				for (local122 = 0; local122 < 10; local122++) {
					local360.anIntArray428[local122] -= local96;
					local360.anIntArray427[local122] -= local101;
				}
				local360.anInt7141 -= local101 * 512;
				local360.anInt7137 -= local96 * 512;
			}
		}
		@Pc(412) Class268[] local412 = Static384.aClass268Array1;
		for (local122 = 0; local122 < local412.length; local122++) {
			@Pc(420) Class268 local420 = local412[local122];
			if (local420 != null) {
				local420.anInt7596 -= local101 * 512;
				local420.anInt7591 -= local96 * 512;
			}
		}
		for (@Pc(452) Class1_Sub36 local452 = (Class1_Sub36) Static191.aClass37_41.method977(); local452 != null; local452 = (Class1_Sub36) Static191.aClass37_41.method971()) {
			local452.anInt6235 -= local101;
			local452.anInt6239 -= local96;
			if (Static271.anInt5150 != 4 && (local452.anInt6239 < 0 || local452.anInt6235 < 0 || Static459.anInt7799 <= local452.anInt6239 || local452.anInt6235 >= Static482.anInt7990)) {
				local452.method7525();
			}
		}
		if (Static271.anInt5150 != 4) {
			for (@Pc(506) Class1_Sub26 local506 = (Class1_Sub26) Static255.aClass17_20.method735(); local506 != null; local506 = (Class1_Sub26) Static255.aClass17_20.method740()) {
				@Pc(514) int local514 = (int) (local506.aLong392 & 0x3FFFL);
				@Pc(519) int local519 = local514 - Static470.anInt7897;
				local180 = (int) (local506.aLong392 >> 14 & 0x3FFFL);
				@Pc(532) int local532 = local180 - Static534.anInt9007;
				if (local519 < 0 || local532 < 0 || Static459.anInt7799 <= local519 || Static482.anInt7990 <= local532) {
					local506.method7525();
				}
			}
		}
		if (Static364.anInt6445 != 0) {
			Static377.anInt6886 -= local101;
			Static364.anInt6445 -= local96;
		}
		Static533.method7376();
		if (arg2 != 10) {
			Static119.anInt2374 -= local101;
			Static516.anInt8682 -= local101 * 512;
			Static521.anInt8752 -= local101;
			Static488.anInt8138 -= local96;
			Static263.anInt5055 -= local96;
			Static522.anInt8770 -= local96 * 512;
			if (Math.abs(local96) > Static459.anInt7799 || Math.abs(local101) > Static482.anInt7990) {
				Static283.method4575();
			}
		} else if (Static448.anInt7701 == 4) {
			Static69.anInt1327 -= local101 * 512;
			Static88.anInt1782 -= local101 * 512;
			Static81.anInt1467 -= local96 * 512;
			Static308.anInt5706 -= local96 * 512;
		} else {
			Static448.anInt7701 = 1;
		}
		Static14.method427();
		Static359.method5344();
		Static266.aClass37_105.method967();
		Static522.aClass37_104.method967();
		Static265.aClass299_4.method7028();
		Static18.method493();
	}
}
