import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "Lclient!da;")
	public static Class69 aClass69_2;

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
	public static int anInt2964;

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "Z")
	public static boolean aBoolean232 = true;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
	public static void method2717() {
		for (@Pc(7) int local7 = 0; local7 < Static228.anInt2286; local7++) {
			@Pc(13) Class303 local13 = Static631.aClass303Array2[local7];
			@Pc(15) boolean local15 = false;
			@Pc(138) int local138;
			if (local13.aClass3_Sub9_Sub2_4 == null) {
				local13.anInt8507--;
				if (local13.anInt8507 >= (local13.method7193() ? -1500 : -10)) {
					if (local13.aByte109 == 1 && local13.aClass36_1 == null) {
						local13.aClass36_1 = Static681.method1237(Static571.aClass143_129, local13.anInt8509, 0);
						if (local13.aClass36_1 == null) {
							continue;
						}
						local13.anInt8507 += local13.aClass36_1.method1234();
					} else if (local13.method7193() && (local13.aClass3_Sub51_3 == null || local13.aClass3_Sub12_Sub1_4 == null)) {
						if (local13.aClass3_Sub51_3 == null) {
							local13.aClass3_Sub51_3 = Static570.method7700(Static375.aClass143_92, local13.anInt8509);
						}
						if (local13.aClass3_Sub51_3 == null) {
							continue;
						}
						if (local13.aClass3_Sub12_Sub1_4 == null) {
							local13.aClass3_Sub12_Sub1_4 = local13.aClass3_Sub51_3.method7708(new int[] { 22050 });
							if (local13.aClass3_Sub12_Sub1_4 == null) {
								continue;
							}
						}
					}
					if (local13.anInt8507 < 0) {
						@Pc(115) int local115 = 8192;
						if (local13.anInt8502 == 0) {
							local138 = local13.anInt8508 * (local13.aByte109 == 3 ? Static227.aClass3_Sub15_11.aClass17_Sub3_1.method741() : Static227.aClass3_Sub15_11.aClass17_Sub3_4.method741()) >> 2;
						} else {
							@Pc(128) int local128 = local13.anInt8502 >> 24 & 0x3;
							if (local128 == Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142) {
								@Pc(147) int local147 = (local13.anInt8502 & 0xFF) << 9;
								@Pc(153) int local153 = Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.method8625() << 8;
								@Pc(160) int local160 = local13.anInt8502 >> 16 & 0xFF;
								@Pc(172) int local172 = local153 + (local160 << 9) + 256 - Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10108;
								@Pc(179) int local179 = local13.anInt8502 >> 8 & 0xFF;
								@Pc(191) int local191 = local153 + (local179 << 9) + 256 - Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10109;
								@Pc(199) int local199 = Math.abs(local172) + Math.abs(local191) - 512;
								if (local147 < local199) {
									local13.anInt8507 = -99999;
									continue;
								}
								if (local199 < 0) {
									local199 = 0;
								}
								local138 = (local147 - local199) * Static227.aClass3_Sub15_11.aClass17_Sub3_5.method741() * local13.anInt8508 / local147 >> 2;
								if (local13.aClass23_Sub2_18 != null && local13.aClass23_Sub2_18 instanceof Class23_Sub2_Sub1) {
									@Pc(242) Class23_Sub2_Sub1 local242 = (Class23_Sub2_Sub1) local13.aClass23_Sub2_18;
									@Pc(245) short local245 = local242.aShort123;
									@Pc(248) short local248 = local242.aShort124;
								}
								if (local172 != 0 || local191 != 0) {
									@Pc(275) int local275 = -Static206.anInt3821 - (int) (Math.atan2((double) local172, (double) local191) * 2607.5945876176133D) - 4096 & 0x3FFF;
									if (local275 > 8192) {
										local275 = 16384 - local275;
									}
									@Pc(292) int local292;
									if (local199 <= 0) {
										local292 = 8192;
									} else if (local199 >= 4096) {
										local292 = 16384;
									} else {
										local292 = (8192 - local199) / 4096 + 8192;
									}
									local115 = (16384 - local292 >> 1) + local292 * local275 / 8192;
								}
							} else {
								local138 = 0;
							}
						}
						if (local138 > 0) {
							@Pc(351) Class3_Sub12_Sub1 local351 = null;
							if (local13.aByte109 == 1) {
								local351 = local13.aClass36_1.method1235().method7244(Static46.aClass334_1);
							} else if (local13.method7193()) {
								local351 = local13.aClass3_Sub12_Sub1_4;
							}
							@Pc(381) Class3_Sub9_Sub2 local381 = local13.aClass3_Sub9_Sub2_4 = Static684.method3727(local351, local13.anInt8504, local138, local115);
							local381.method3730(local13.anInt8503 - 1);
							Static557.aClass3_Sub9_Sub1_2.method1419(local381);
						}
					}
				} else {
					local15 = true;
				}
			} else if (!local13.aClass3_Sub9_Sub2_4.method8771()) {
				local15 = true;
			}
			if (local15) {
				Static228.anInt2286--;
				for (local138 = local7; local138 < Static228.anInt2286; local138++) {
					Static631.aClass303Array2[local138] = Static631.aClass303Array2[local138 + 1];
				}
				local7--;
			}
		}
		if (Static666.aBoolean755 && !Static160.method2734()) {
			if (Static227.aClass3_Sub15_11.aClass17_Sub3_2.method741() != 0 && Static149.anInt2812 != -1) {
				if (Static344.aClass3_Sub9_Sub5_1 == null) {
					Static507.method7179(Static149.anInt2812, Static510.aClass143_118, Static227.aClass3_Sub15_11.aClass17_Sub3_2.method741());
				} else {
					Static487.method6992(Static227.aClass3_Sub15_11.aClass17_Sub3_2.method741(), Static149.anInt2812, Static510.aClass143_118, Static344.aClass3_Sub9_Sub5_1);
				}
			}
			Static344.aClass3_Sub9_Sub5_1 = null;
			Static666.aBoolean755 = false;
		} else if (Static227.aClass3_Sub15_11.aClass17_Sub3_2.method741() != 0 && Static149.anInt2812 != -1 && !Static160.method2734()) {
			@Pc(512) Class3_Sub44 local512 = Static275.method5689(Static312.aClass376_78, Static540.aClass282_4);
			local512.aClass3_Sub17_Sub2_3.method4854(Static149.anInt2812);
			Static616.method8089(local512);
			Static149.anInt2812 = -1;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "([Lclient!kh;IB)V")
	public static void method2719(@OriginalArg(0) Class208[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(14) Class208 local14 = arg0[local3];
			if (local14 != null) {
				if (local14.anInt5643 == 0) {
					if (local14.aClass208Array20 != null) {
						method2719(local14.aClass208Array20, arg1);
					}
					@Pc(38) Class3_Sub28 local38 = (Class3_Sub28) Static222.aClass62_21.method1682((long) local14.anInt5653);
					if (local38 != null) {
						Static325.method5063(arg1, local38.anInt5252);
					}
				}
				@Pc(54) Class3_Sub13 local54;
				if (arg1 == 0 && local14.anObjectArray19 != null) {
					local54 = new Class3_Sub13();
					local54.aClass208_2 = local14;
					local54.anObjectArray1 = local14.anObjectArray19;
					Static543.method7498(local54);
				}
				if (arg1 == 1 && local14.anObjectArray22 != null) {
					if (local14.anInt5608 >= 0) {
						@Pc(80) Class208 local80 = Static676.method8728(local14.anInt5653);
						if (local80 == null || local80.aClass208Array20 == null || local14.anInt5608 >= local80.aClass208Array20.length || local14 != local80.aClass208Array20[local14.anInt5608]) {
							continue;
						}
					}
					local54 = new Class3_Sub13();
					local54.aClass208_2 = local14;
					local54.anObjectArray1 = local14.anObjectArray22;
					Static543.method7498(local54);
				}
			}
		}
	}
}
