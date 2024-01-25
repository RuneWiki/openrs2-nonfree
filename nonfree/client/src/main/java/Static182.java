import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!li", name = "g", descriptor = "I")
	public static int anInt3706;

	@OriginalMember(owner = "client!li", name = "b", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_126 = new Class217(39, -1);

	@OriginalMember(owner = "client!li", name = "d", descriptor = "I")
	public static int anInt3704 = 0;

	@OriginalMember(owner = "client!li", name = "f", descriptor = "[I")
	public static final int[] anIntArray283 = new int[8];

	@OriginalMember(owner = "client!li", name = "j", descriptor = "I")
	public static int anInt3709 = 0;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILclient!ge;)V")
	public static void method3458(@OriginalArg(1) Class1_Sub7_Sub2 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method2166();
		@Pc(18) int local18;
		@Pc(46) int local46;
		for (@Pc(12) int local12 = 0; local12 < Static99.anInt2276; local12++) {
			local18 = Static238.anIntArray382[local12];
			if ((Static25.aByteArray21[local18] & 0x1) == 0) {
				if (local7 > 0) {
					Static25.aByteArray21[local18] = (byte) (Static25.aByteArray21[local18] | 0x2);
					local7--;
				} else {
					local46 = arg0.method2169(1);
					if (local46 == 0) {
						local7 = Static228.method4269(arg0);
						Static25.aByteArray21[local18] = (byte) (Static25.aByteArray21[local18] | 0x2);
					} else {
						Static244.method4552(local18, arg0);
					}
				}
			}
		}
		arg0.method2167();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method2166();
		@Pc(129) int local129;
		for (local18 = 0; local18 < Static99.anInt2276; local18++) {
			local46 = Static238.anIntArray382[local18];
			if ((Static25.aByteArray21[local46] & 0x1) != 0) {
				if (local7 > 0) {
					Static25.aByteArray21[local46] = (byte) (Static25.aByteArray21[local46] | 0x2);
					local7--;
				} else {
					local129 = arg0.method2169(1);
					if (local129 == 0) {
						local7 = Static228.method4269(arg0);
						Static25.aByteArray21[local46] = (byte) (Static25.aByteArray21[local46] | 0x2);
					} else {
						Static244.method4552(local46, arg0);
					}
				}
			}
		}
		arg0.method2167();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method2166();
		@Pc(211) int local211;
		for (local46 = 0; local46 < Static331.anInt6245; local46++) {
			local129 = Static352.anIntArray142[local46];
			if ((Static25.aByteArray21[local129] & 0x1) != 0) {
				if (local7 > 0) {
					Static25.aByteArray21[local129] = (byte) (Static25.aByteArray21[local129] | 0x2);
					local7--;
				} else {
					local211 = arg0.method2169(1);
					if (local211 == 0) {
						local7 = Static228.method4269(arg0);
						Static25.aByteArray21[local129] = (byte) (Static25.aByteArray21[local129] | 0x2);
					} else if (Static83.method1777(arg0, local129)) {
						Static25.aByteArray21[local129] = (byte) (Static25.aByteArray21[local129] | 0x2);
					}
				}
			}
		}
		arg0.method2167();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method2166();
		for (local129 = 0; local129 < Static331.anInt6245; local129++) {
			local211 = Static352.anIntArray142[local129];
			if ((Static25.aByteArray21[local211] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static25.aByteArray21[local211] = (byte) (Static25.aByteArray21[local211] | 0x2);
				} else {
					@Pc(301) int local301 = arg0.method2169(1);
					if (local301 == 0) {
						local7 = Static228.method4269(arg0);
						Static25.aByteArray21[local211] = (byte) (Static25.aByteArray21[local211] | 0x2);
					} else if (Static83.method1777(arg0, local211)) {
						Static25.aByteArray21[local211] = (byte) (Static25.aByteArray21[local211] | 0x2);
					}
				}
			}
		}
		arg0.method2167();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static99.anInt2276 = 0;
		Static331.anInt6245 = 0;
		for (local211 = 1; local211 < 2048; local211++) {
			Static25.aByteArray21[local211] = (byte) (Static25.aByteArray21[local211] >> 1);
			@Pc(369) Class11_Sub2_Sub6_Sub1 local369 = Static275.aClass11_Sub2_Sub6_Sub1Array1[local211];
			if (local369 == null) {
				Static352.anIntArray142[Static331.anInt6245++] = local211;
			} else {
				Static238.anIntArray382[Static99.anInt2276++] = local211;
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)I")
	public static int method3459() {
		try {
			if (Static257.anInt1057 == 0) {
				if (Static183.method3462() - 5000L < Static124.aLong99) {
					return 0;
				}
				Static5.aClass121_1 = Static227.aClass75_5.method2359(Static306.aString54, Static225.anInt4520);
				Static236.aLong166 = Static183.method3462();
				Static257.anInt1057 = 1;
			}
			if (Static183.method3462() > Static236.aLong166 + 30000L) {
				return Static345.method5749(1000);
			}
			@Pc(83) int local83;
			@Pc(121) int local121;
			if (Static257.anInt1057 == 1) {
				if (Static5.aClass121_1.anInt3693 == 2) {
					return Static345.method5749(1001);
				}
				if (Static5.aClass121_1.anInt3693 != 1) {
					return -1;
				}
				Static165.aClass76_2 = new Class76((Socket) Static5.aClass121_1.anObject2, Static227.aClass75_5);
				Static5.aClass121_1 = null;
				local83 = 0;
				if (Static12.aBoolean15) {
					local83 = Static171.anInt3576;
				}
				Static339.aClass1_Sub7_Sub2_4.anInt2219 = 0;
				Static339.aClass1_Sub7_Sub2_4.method2121(Static204.aClass103_9.anInt3138);
				Static339.aClass1_Sub7_Sub2_4.method2115(local83);
				Static165.aClass76_2.method2376(Static339.aClass1_Sub7_Sub2_4.anInt2219, Static339.aClass1_Sub7_Sub2_4.aByteArray41);
				if (Static284.aClass48_12 != null) {
					Static284.aClass48_12.method1834();
				}
				if (Static61.aClass48_4 != null) {
					Static61.aClass48_4.method1834();
				}
				local121 = Static165.aClass76_2.method2379();
				if (Static284.aClass48_12 != null) {
					Static284.aClass48_12.method1834();
				}
				if (Static61.aClass48_4 != null) {
					Static61.aClass48_4.method1834();
				}
				if (local121 != 0) {
					return Static345.method5749(local121);
				}
				Static257.anInt1057 = 2;
			}
			if (Static257.anInt1057 == 2) {
				if (Static165.aClass76_2.method2387() < 2) {
					return -1;
				}
				Static81.anInt1820 = Static165.aClass76_2.method2379();
				Static81.anInt1820 <<= 0x8;
				Static81.anInt1820 += Static165.aClass76_2.method2379();
				Static131.aByteArray48 = new byte[Static81.anInt1820];
				Static12.anInt280 = 0;
				Static257.anInt1057 = 3;
			}
			if (Static257.anInt1057 != 3) {
				return -1;
			}
			local83 = Static165.aClass76_2.method2387();
			if (local83 < 1) {
				return -1;
			}
			if (Static81.anInt1820 - Static12.anInt280 < local83) {
				local83 = Static81.anInt1820 - Static12.anInt280;
			}
			Static165.aClass76_2.method2384(Static12.anInt280, local83, Static131.aByteArray48);
			Static12.anInt280 += local83;
			if (Static12.anInt280 < Static81.anInt1820) {
				return -1;
			} else if (Static69.method1569(Static131.aByteArray48)) {
				Static164.aClass135_Sub1Array2 = new Class135_Sub1[Static242.anInt4948];
				local121 = 0;
				for (@Pc(232) int local232 = Static276.anInt5384; local232 <= Static43.anInt5304; local232++) {
					@Pc(238) Class135_Sub1 local238 = Static265.method4811(local232);
					if (local238 != null) {
						Static164.aClass135_Sub1Array2[local121++] = local238;
					}
				}
				Static51.anInt1312 = 0;
				Static331.aClass1_Sub12_3 = null;
				Static165.aClass76_2.method2377();
				Static165.aClass76_2 = null;
				Static131.aByteArray48 = null;
				Static257.anInt1057 = 0;
				Static41.anInt984 = 0;
				Static124.aLong99 = Static183.method3462();
				return 0;
			} else {
				return Static345.method5749(1002);
			}
		} catch (@Pc(270) IOException local270) {
			return Static345.method5749(1003);
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIII)V")
	public static void method3460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static269.anInt3321 / (float) Static269.anInt3324;
		@Pc(11) int local11 = arg2;
		@Pc(18) int local18 = arg1;
		if (local9 < 1.0F) {
			local18 = (int) ((float) arg2 * local9);
		} else {
			local11 = (int) ((float) arg1 / local9);
		}
		@Pc(45) int local45 = arg0 - (arg2 - local11) / 2;
		@Pc(54) int local54 = arg3 - (arg1 - local18) / 2;
		Static207.anInt4093 = local45 * Static269.anInt3324 / local11;
		Static286.anInt5852 = -1;
		Static299.anInt4033 = Static269.anInt3321 - Static269.anInt3321 * local54 / local18;
		Static253.anInt5163 = -1;
		Static229.method4278();
	}
}
