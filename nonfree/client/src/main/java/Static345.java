import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "[Lclient!qo;")
	public static Class41_Sub7[] aClass41_Sub7Array1;

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
	public static int anInt6197;

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "I")
	public static int anInt6198 = 765;

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(B)V")
	public static void method5206() {
		Static404.aClass3_6.method41();
		Static247.aClass269_3.method6618();
		Static670.aClass83_2.method1834();
		Static400.aClass140_4.method2847();
		Static58.aClass230_1.method5295();
		Static259.aClass135_1.method2780();
		Static459.aClass128_2.method2684();
		Static312.aClass179_1.method3797();
		Static480.aClass298_2.method7193();
		Static532.aClass260_1.method6450();
		Static126.aClass388_1.method8584();
		Static233.aClass172_1.method3618();
		Static40.aClass161_1.method3453();
		Static299.aClass218_1.method5160();
		Static135.aClass250_1.method5940();
		Static522.aClass282_2.method6903();
		Static117.aClass64_1.method1291();
		Static1.aClass286_5.method7025();
		Static80.aClass118_1.method2461();
		Static205.aClass363_1.method8238();
		Static402.aClass290_1.method7071();
		Static239.aClass115_2.method2373();
		Static568.method7799();
		Static553.method7613();
		Static87.method1314();
		Static145.method2181();
		Static262.method3626();
		Static405.aClass265_44.method6573();
		Static395.aClass265_41.method6573();
		Static301.aClass265_28.method6573();
		Static35.aClass265_2.method6573();
		Static497.aClass265_56.method6573();
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IBIIIIIIII)V")
	public static void method5208(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg2 < 512 || arg6 < 512 || (Static124.anInt2150 - 2) * 512 < arg2 || arg6 > Static64.anInt1015 * 512 - 1024) {
			Static340.anIntArray352[0] = Static340.anIntArray352[1] = -1;
			return;
		}
		@Pc(45) int local45 = Static161.method1246(arg3, arg6, arg2) - arg5;
		if (Static305.aBoolean315) {
			Static611.method8212(true);
		} else {
			Static108.aClass56_4.method8390(arg1, 0, 0);
			Static563.aClass143_13.method6222(Static108.aClass56_4);
		}
		if (Static426.aBoolean555) {
			Static563.aClass143_13.HA(arg2, local45, arg6, Static663.anInt10391, Static340.anIntArray352);
		} else {
			Static563.aClass143_13.da(arg2, local45, arg6, Static340.anIntArray352);
		}
		if (Static305.aBoolean315) {
			Static58.method877();
		} else {
			Static108.aClass56_4.method8390(-arg1, 0, 0);
			Static563.aClass143_13.method6222(Static108.aClass56_4);
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!iw;II)V")
	public static void method5209(@OriginalArg(0) Class5_Sub15_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) boolean local15 = arg0.method3702(1) == 1;
		if (local15) {
			Static450.anIntArray436[Static74.anInt1181++] = arg1;
		}
		@Pc(30) int local30 = arg0.method3702(2);
		@Pc(34) Class41_Sub1_Sub1_Sub3_Sub2 local34 = Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[arg1];
		if (local30 != 0) {
			@Pc(148) int local148;
			@Pc(153) int local153;
			@Pc(158) int local158;
			if (local30 == 1) {
				local148 = arg0.method3702(3);
				local153 = local34.anIntArray528[0];
				local158 = local34.anIntArray527[0];
				if (local148 == 0) {
					local153--;
					local158--;
				} else if (local148 == 1) {
					local158--;
				} else if (local148 == 2) {
					local153++;
					local158--;
				} else if (local148 == 3) {
					local153--;
				} else if (local148 == 4) {
					local153++;
				} else if (local148 == 5) {
					local158++;
					local153--;
				} else if (local148 == 6) {
					local158++;
				} else if (local148 == 7) {
					local158++;
					local153++;
				}
				if (local15) {
					local34.aBoolean695 = true;
					local34.anInt9539 = local158;
					local34.anInt9549 = local153;
				} else {
					local34.method7939(local158, local153, Static209.aByteArray29[arg1]);
				}
			} else if (local30 == 2) {
				local148 = arg0.method3702(4);
				local153 = local34.anIntArray528[0];
				local158 = local34.anIntArray527[0];
				if (local148 == 0) {
					local153 -= 2;
					local158 -= 2;
				} else if (local148 == 1) {
					local153--;
					local158 -= 2;
				} else if (local148 == 2) {
					local158 -= 2;
				} else if (local148 == 3) {
					local158 -= 2;
					local153++;
				} else if (local148 == 4) {
					local158 -= 2;
					local153 += 2;
				} else if (local148 == 5) {
					local153 -= 2;
					local158--;
				} else if (local148 == 6) {
					local158--;
					local153 += 2;
				} else if (local148 == 7) {
					local153 -= 2;
				} else if (local148 == 8) {
					local153 += 2;
				} else if (local148 == 9) {
					local153 -= 2;
					local158++;
				} else if (local148 == 10) {
					local158++;
					local153 += 2;
				} else if (local148 == 11) {
					local153 -= 2;
					local158 += 2;
				} else if (local148 == 12) {
					local158 += 2;
					local153--;
				} else if (local148 == 13) {
					local158 += 2;
				} else if (local148 == 14) {
					local158 += 2;
					local153++;
				} else if (local148 == 15) {
					local153 += 2;
					local158 += 2;
				}
				if (local15) {
					local34.anInt9539 = local158;
					local34.aBoolean695 = true;
					local34.anInt9549 = local153;
				} else {
					local34.method7939(local158, local153, Static209.aByteArray29[arg1]);
				}
			} else {
				local148 = arg0.method3702(1);
				@Pc(391) int local391;
				@Pc(401) int local401;
				@Pc(412) int local412;
				@Pc(419) int local419;
				if (local148 == 0) {
					local153 = arg0.method3702(12);
					local158 = local153 >> 10;
					local391 = local153 >> 5 & 0x1F;
					if (local391 > 15) {
						local391 -= 32;
					}
					local401 = local153 & 0x1F;
					if (local401 > 15) {
						local401 -= 32;
					}
					local412 = local34.anIntArray528[0] + local391;
					local419 = local34.anIntArray527[0] + local401;
					if (local15) {
						local34.aBoolean695 = true;
						local34.anInt9549 = local412;
						local34.anInt9539 = local419;
					} else {
						local34.method7939(local419, local412, Static209.aByteArray29[arg1]);
					}
					local34.aByte149 = local34.aByte150 = (byte) (local158 + local34.aByte149 & 0x3);
					if (Static488.method7149(local412, local419)) {
						local34.aByte150++;
					}
					if (Static177.anInt2910 == arg1) {
						if (Static458.anInt7955 != local34.aByte149) {
							Static677.aBoolean794 = true;
						}
						Static458.anInt7955 = local34.aByte149;
					}
				} else {
					local153 = arg0.method3702(30);
					local158 = local153 >> 28;
					local391 = local153 >> 14 & 0x3FFF;
					local401 = local153 & 0x3FFF;
					local412 = (local34.anIntArray528[0] + Static454.anInt7910 + local391 & 0x3FFF) - Static454.anInt7910;
					local419 = (local401 + local34.anIntArray527[0] + Static48.anInt750 & 0x3FFF) - Static48.anInt750;
					if (local15) {
						local34.anInt9539 = local419;
						local34.aBoolean695 = true;
						local34.anInt9549 = local412;
					} else {
						local34.method7939(local419, local412, Static209.aByteArray29[arg1]);
					}
					local34.aByte149 = local34.aByte150 = (byte) (local34.aByte149 + local158 & 0x3);
					if (Static488.method7149(local412, local419)) {
						local34.aByte150++;
					}
					if (arg1 == Static177.anInt2910) {
						Static458.anInt7955 = local34.aByte149;
					}
				}
			}
		} else if (local15) {
			local34.aBoolean695 = false;
		} else if (Static177.anInt2910 == arg1) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(61) Class177 local61 = Static105.aClass177Array1[arg1] = new Class177();
			local61.anInt4233 = (local34.anIntArray528[0] + Static454.anInt7910 >> 6 << 14) + (local34.aByte149 << 28) + (Static48.anInt750 - -local34.anIntArray527[0] >> 6);
			if (local34.anInt9545 == -1) {
				local61.anInt4235 = local34.aClass165_7.method3503();
			} else {
				local61.anInt4235 = local34.anInt9545;
			}
			local61.aBoolean282 = local34.aBoolean697;
			local61.anInt4236 = local34.anInt9452;
			local61.aBoolean283 = local34.aBoolean698;
			if (local34.anInt9560 > 0) {
				Static574.method7842(local34);
			}
			Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[arg1] = null;
			if (arg0.method3702(1) != 0) {
				Static499.method7241(arg1, arg0);
			}
		}
	}
}
