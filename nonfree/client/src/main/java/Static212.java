import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "[I")
	public static int[] anIntArray325;

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "[I")
	public static int[] anIntArray326;

	@OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
	public static int anInt4090 = 0;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
	public static void method3772() {
		@Pc(9) int local9 = Static311.anInt6287 * 128 + 64;
		@Pc(15) int local15 = Static88.anInt1903 * 128 + 64;
		@Pc(24) int local24 = Static138.method2745(Static182.anInt3603, local9, local15) - Static224.anInt4296;
		if (Static243.anInt679 >= 100) {
			Static287.anInt5819 = Static311.anInt6287 * 128 + 64;
			Static290.anInt5837 = Static88.anInt1903 * 128 + 64;
			Static163.anInt1495 = Static138.method2745(Static182.anInt3603, Static287.anInt5819, Static290.anInt5837) - Static224.anInt4296;
		} else {
			if (local9 > Static287.anInt5819) {
				Static287.anInt5819 += Static328.anInt6644 + Static243.anInt679 * (local9 - Static287.anInt5819) / 1000;
				if (Static287.anInt5819 > local9) {
					Static287.anInt5819 = local9;
				}
			}
			if (Static287.anInt5819 > local9) {
				Static287.anInt5819 -= Static328.anInt6644 + Static243.anInt679 * (Static287.anInt5819 - local9) / 1000;
				if (local9 > Static287.anInt5819) {
					Static287.anInt5819 = local9;
				}
			}
			if (local24 > Static163.anInt1495) {
				Static163.anInt1495 += Static328.anInt6644 + Static243.anInt679 * (local24 - Static163.anInt1495) / 1000;
				if (local24 < Static163.anInt1495) {
					Static163.anInt1495 = local24;
				}
			}
			if (local24 < Static163.anInt1495) {
				Static163.anInt1495 -= (Static163.anInt1495 - local24) * Static243.anInt679 / 1000 + Static328.anInt6644;
				if (Static163.anInt1495 < local24) {
					Static163.anInt1495 = local24;
				}
			}
			if (Static290.anInt5837 < local15) {
				Static290.anInt5837 += (local15 - Static290.anInt5837) * Static243.anInt679 / 1000 + Static328.anInt6644;
				if (Static290.anInt5837 > local15) {
					Static290.anInt5837 = local15;
				}
			}
			if (local15 < Static290.anInt5837) {
				Static290.anInt5837 -= Static243.anInt679 * (Static290.anInt5837 - local15) / 1000 + Static328.anInt6644;
				if (local15 > Static290.anInt5837) {
					Static290.anInt5837 = local15;
				}
			}
		}
		local9 = Static337.anInt6720 * 128 + 64;
		local15 = Static149.anInt3053 * 128 + 64;
		local24 = Static138.method2745(Static182.anInt3603, local9, local15) - Static289.anInt5821;
		@Pc(220) int local220 = local9 - Static287.anInt5819;
		@Pc(225) int local225 = local24 - Static163.anInt1495;
		@Pc(230) int local230 = local15 - Static290.anInt5837;
		@Pc(246) int local246 = (int) Math.sqrt((double) (local230 * local230 + local220 * local220));
		@Pc(257) int local257 = (int) (Math.atan2((double) local225, (double) local246) * 2607.5945876176133D) & 0x3FFF;
		if (local257 < 1024) {
			local257 = 1024;
		}
		@Pc(273) int local273 = (int) (-2607.5945876176133D * Math.atan2((double) local220, (double) local230)) & 0x3FFF;
		if (local257 > 3072) {
			local257 = 3072;
		}
		if (Static283.anInt5723 < local257) {
			Static283.anInt5723 += Static277.anInt5649 + Static265.anInt6826 * (local257 - Static283.anInt5723 >> 3) / 1000 << 3;
			if (Static283.anInt5723 > local257) {
				Static283.anInt5723 = local257;
			}
		}
		if (Static283.anInt5723 > local257) {
			Static283.anInt5723 -= Static277.anInt5649 + (Static283.anInt5723 - local257 >> 3) * Static265.anInt6826 / 1000 << 3;
			if (local257 > Static283.anInt5723) {
				Static283.anInt5723 = local257;
			}
		}
		@Pc(344) int local344 = local273 - Static291.anInt5883;
		if (local344 > 8192) {
			local344 -= 16384;
		}
		if (local344 < -8192) {
			local344 += 16384;
		}
		local344 >>= 0x3;
		if (local344 > 0) {
			Static291.anInt5883 += Static277.anInt5649 + local344 * Static265.anInt6826 / 1000 << 3;
			Static291.anInt5883 &= 0x3FFF;
		}
		if (local344 < 0) {
			Static291.anInt5883 -= Static265.anInt6826 * -local344 / 1000 + Static277.anInt5649 << 3;
			Static291.anInt5883 &= 0x3FFF;
		}
		@Pc(399) int local399 = local273 - Static291.anInt5883;
		if (local399 > 8192) {
			local399 -= 16384;
		}
		if (local399 < -8192) {
			local399 += 16384;
		}
		Static344.anInt6885 = 0;
		if (local399 < 0 && local344 > 0 || local399 > 0 && local344 < 0) {
			Static291.anInt5883 = local273;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)Lclient!kb;")
	public static Class107 method3773(@OriginalArg(1) int arg0) {
		@Pc(5) Class119 local5 = Static304.aClass119_185;
		@Pc(14) Class107 local14;
		synchronized (Static304.aClass119_185) {
			local14 = (Class107) Static304.aClass119_185.method3311((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static77.aClass191_49.method5459(Static281.method5073(arg0), Static283.method5091(arg0));
		local14 = new Class107();
		local14.anInt3285 = arg0;
		if (local34 != null) {
			local14.method3049(new Class2_Sub10(local34));
		}
		local14.method3048();
		@Pc(62) Class119 local62 = Static304.aClass119_185;
		synchronized (Static304.aClass119_185) {
			Static304.aClass119_185.method3308(local14, (long) arg0);
			return local14;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!on;I)V")
	public static void method3774(@OriginalArg(0) Class146 arg0) {
		@Pc(6) int local6 = arg0.anInt4440;
		if (local6 == 327) {
			arg0.anInt4424 = 150;
			arg0.anInt4461 = (int) (Math.sin((double) anInt4090 / 40.0D) * 256.0D) & 0x3FFF;
			arg0.anInt4426 = 5;
			arg0.anInt4415 = -1;
		} else if (local6 == 328) {
			if (Static41.aClass62_Sub1_Sub2_Sub2_2.aString48 == null) {
				arg0.anInt4415 = 0;
				arg0.anInt4439 = 0;
			} else {
				arg0.anInt4424 = 150;
				arg0.anInt4461 = (int) (Math.sin((double) anInt4090 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt4415 = 2047;
				arg0.anInt4426 = 5;
				arg0.anInt4439 = Static60.method1379(Static41.aClass62_Sub1_Sub2_Sub2_2.aString48);
				arg0.anInt4427 = Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5319;
				arg0.anInt4429 = Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5347;
				arg0.anInt4433 = 0;
				arg0.anInt4441 = Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5350;
			}
		}
	}
}
