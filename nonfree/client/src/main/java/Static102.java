import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!ld", name = "w", descriptor = "I")
	public static int anInt2945;

	@OriginalMember(owner = "client!ld", name = "o", descriptor = "[I")
	public static final int[] anIntArray338 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ld", name = "q", descriptor = "[Lclient!ah;")
	public static final Class6[] aClass6Array1 = new Class6[5000];

	@OriginalMember(owner = "client!ld", name = "r", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_827 = Static158.method3034(" )2>");

	@OriginalMember(owner = "client!ld", name = "t", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_829 = Static158.method3034("Please enter your username)3");

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "Lclient!ob;")
	public static Class60 aClass60_828 = aClass60_829;

	@OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
	public static int anInt2944 = 0;

	@OriginalMember(owner = "client!ld", name = "v", descriptor = "[I")
	public static final int[] anIntArray339 = new int[100];

	@OriginalMember(owner = "client!ld", name = "y", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_830 = Static158.method3034("event_opbase");

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(III)J")
	public static long method2330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub17 local7 = Static118.aClass2_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass26_1 == null ? 0L : local7.aClass26_1.aLong49;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)I")
	public static int method2331(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(IIIIII)V")
	public static void method2332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static146.anInt3815 * 128) {
			arg0 = Static146.anInt3815 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static193.anInt4611 * 128) {
			arg2 = Static193.anInt4611 * 128 - 1;
		}
		Static183.anInt4437++;
		Static94.anInt2812 = Class2_Sub1_Sub7_Sub1.anIntArray133[arg3];
		Static108.anInt3076 = Class2_Sub1_Sub7_Sub1.anIntArray129[arg3];
		Static189.anInt4498 = Class2_Sub1_Sub7_Sub1.anIntArray133[arg4];
		Static135.anInt3581 = Class2_Sub1_Sub7_Sub1.anIntArray129[arg4];
		Static35.aBooleanArrayArray5 = Static1.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static18.anInt4397 = arg0;
		Static145.anInt3794 = arg1;
		Static36.anInt1081 = arg2;
		Static187.anInt4630 = arg0 / 128;
		Static71.anInt4244 = arg2 / 128;
		Static52.anInt1626 = arg5;
		Static177.anInt4315 = Static187.anInt4630 - Static12.anInt385;
		if (Static177.anInt4315 < 0) {
			Static177.anInt4315 = 0;
		}
		Static193.anInt4612 = Static71.anInt4244 - Static12.anInt385;
		if (Static193.anInt4612 < 0) {
			Static193.anInt4612 = 0;
		}
		Static63.anInt1930 = Static187.anInt4630 + Static12.anInt385;
		if (Static63.anInt1930 > Static146.anInt3815) {
			Static63.anInt1930 = Static146.anInt3815;
		}
		Static130.anInt3544 = Static71.anInt4244 + Static12.anInt385;
		if (Static130.anInt3544 > Static193.anInt4611) {
			Static130.anInt3544 = Static193.anInt4611;
		}
		Static142.method2879();
		Static74.anInt2287 = 0;
		@Pc(125) int local125;
		@Pc(128) int local128;
		for (@Pc(118) int local118 = Static152.anInt2807; local118 < Static98.anInt2864; local118++) {
			@Pc(123) Class2_Sub17[][] local123 = Static118.aClass2_Sub17ArrayArrayArray1[local118];
			for (local125 = Static177.anInt4315; local125 < Static63.anInt1930; local125++) {
				for (local128 = Static193.anInt4612; local128 < Static130.anInt3544; local128++) {
					@Pc(135) Class2_Sub17 local135 = local123[local125][local128];
					if (local135 != null) {
						if (local135.anInt3606 <= arg5 && (Static35.aBooleanArrayArray5[local125 + Static12.anInt385 - Static187.anInt4630][local128 + Static12.anInt385 - Static71.anInt4244] || Static100.anIntArrayArrayArray5[local118][local125][local128] - arg1 >= 2000)) {
							local135.aBoolean134 = true;
							local135.aBoolean135 = true;
							if (local135.anInt3604 > 0) {
								local135.aBoolean133 = true;
							} else {
								local135.aBoolean133 = false;
							}
							Static74.anInt2287++;
						} else {
							local135.aBoolean134 = false;
							local135.aBoolean135 = false;
							local135.anInt3602 = 0;
						}
					}
				}
			}
		}
		@Pc(227) int local227;
		@Pc(236) int local236;
		@Pc(241) int local241;
		@Pc(245) int local245;
		@Pc(223) int local223;
		for (@Pc(210) int local210 = Static152.anInt2807; local210 < Static98.anInt2864; local210++) {
			@Pc(215) Class2_Sub17[][] local215 = Static118.aClass2_Sub17ArrayArrayArray1[local210];
			for (local128 = -Static12.anInt385; local128 <= 0; local128++) {
				local223 = Static187.anInt4630 + local128;
				local227 = Static187.anInt4630 - local128;
				if (local223 >= Static177.anInt4315 || local227 < Static63.anInt1930) {
					for (local236 = -Static12.anInt385; local236 <= 0; local236++) {
						local241 = Static71.anInt4244 + local236;
						local245 = Static71.anInt4244 - local236;
						@Pc(257) Class2_Sub17 local257;
						if (local223 >= Static177.anInt4315) {
							if (local241 >= Static193.anInt4612) {
								local257 = local215[local223][local241];
								if (local257 != null && local257.aBoolean134) {
									Static120.method2571(local257, true);
								}
							}
							if (local245 < Static130.anInt3544) {
								local257 = local215[local223][local245];
								if (local257 != null && local257.aBoolean134) {
									Static120.method2571(local257, true);
								}
							}
						}
						if (local227 < Static63.anInt1930) {
							if (local241 >= Static193.anInt4612) {
								local257 = local215[local227][local241];
								if (local257 != null && local257.aBoolean134) {
									Static120.method2571(local257, true);
								}
							}
							if (local245 < Static130.anInt3544) {
								local257 = local215[local227][local245];
								if (local257 != null && local257.aBoolean134) {
									Static120.method2571(local257, true);
								}
							}
						}
						if (Static74.anInt2287 == 0) {
							Static27.aBoolean30 = false;
							return;
						}
					}
				}
			}
		}
		for (local125 = Static152.anInt2807; local125 < Static98.anInt2864; local125++) {
			@Pc(341) Class2_Sub17[][] local341 = Static118.aClass2_Sub17ArrayArrayArray1[local125];
			for (local223 = -Static12.anInt385; local223 <= 0; local223++) {
				local227 = Static187.anInt4630 + local223;
				local236 = Static187.anInt4630 - local223;
				if (local227 >= Static177.anInt4315 || local236 < Static63.anInt1930) {
					for (local241 = -Static12.anInt385; local241 <= 0; local241++) {
						local245 = Static71.anInt4244 + local241;
						@Pc(371) int local371 = Static71.anInt4244 - local241;
						@Pc(383) Class2_Sub17 local383;
						if (local227 >= Static177.anInt4315) {
							if (local245 >= Static193.anInt4612) {
								local383 = local341[local227][local245];
								if (local383 != null && local383.aBoolean134) {
									Static120.method2571(local383, false);
								}
							}
							if (local371 < Static130.anInt3544) {
								local383 = local341[local227][local371];
								if (local383 != null && local383.aBoolean134) {
									Static120.method2571(local383, false);
								}
							}
						}
						if (local236 < Static63.anInt1930) {
							if (local245 >= Static193.anInt4612) {
								local383 = local341[local236][local245];
								if (local383 != null && local383.aBoolean134) {
									Static120.method2571(local383, false);
								}
							}
							if (local371 < Static130.anInt3544) {
								local383 = local341[local236][local371];
								if (local383 != null && local383.aBoolean134) {
									Static120.method2571(local383, false);
								}
							}
						}
						if (Static74.anInt2287 == 0) {
							Static27.aBoolean30 = false;
							return;
						}
					}
				}
			}
		}
		Static27.aBoolean30 = false;
	}
}
