import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!l", name = "Ub", descriptor = "I")
	public static int anInt2728;

	@OriginalMember(owner = "client!l", name = "Kb", descriptor = "Lclient!qe;")
	private static Class78 aClass78_553 = Static199.method3560("OFF");

	@OriginalMember(owner = "client!l", name = "Jb", descriptor = "Lclient!qe;")
	public static Class78 aClass78_552 = aClass78_553;

	@OriginalMember(owner = "client!l", name = "Lb", descriptor = "[I")
	public static int[] anIntArray449 = new int[50];

	@OriginalMember(owner = "client!l", name = "Mb", descriptor = "Lclient!qe;")
	public static Class78 aClass78_554 = Static199.method3560("k");

	@OriginalMember(owner = "client!l", name = "Qb", descriptor = "Z")
	public static boolean aBoolean113 = true;

	@OriginalMember(owner = "client!l", name = "Tb", descriptor = "Lclient!qe;")
	private static Class78 aClass78_555 = Static199.method3560("Loading interfaces )2 ");

	@OriginalMember(owner = "client!l", name = "Yb", descriptor = "I")
	public static int anInt2732 = 0;

	@OriginalMember(owner = "client!l", name = "Zb", descriptor = "I")
	public static int anInt2733 = 0;

	@OriginalMember(owner = "client!l", name = "gc", descriptor = "Lclient!qe;")
	private static Class78 aClass78_558 = Static199.method3560("Type");

	@OriginalMember(owner = "client!l", name = "dc", descriptor = "Lclient!qe;")
	public static Class78 aClass78_556 = aClass78_558;

	@OriginalMember(owner = "client!l", name = "fc", descriptor = "Lclient!qe;")
	public static Class78 aClass78_557 = aClass78_555;

	@OriginalMember(owner = "client!l", name = "n", descriptor = "(II)V")
	public static void method2146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class2_Sub12 local7 = Static226.aClass2_Sub12ArrayArrayArray3[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class2_Sub12 local28 = Static226.aClass2_Sub12ArrayArrayArray3[local9][arg0][arg1] = Static226.aClass2_Sub12ArrayArrayArray3[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.anInt761--;
				for (@Pc(38) int local38 = 0; local38 < local28.anInt775; local38++) {
					@Pc(44) Class100 local44 = local28.aClass100Array3[local38];
					if ((local44.aLong169 >> 29 & 0x3L) == 2L && local44.anInt4529 == arg0 && local44.anInt4517 == arg1) {
						local44.anInt4516--;
					}
				}
			}
		}
		if (Static226.aClass2_Sub12ArrayArrayArray3[0][arg0][arg1] == null) {
			Static226.aClass2_Sub12ArrayArrayArray3[0][arg0][arg1] = new Class2_Sub12(0, arg0, arg1);
		}
		Static226.aClass2_Sub12ArrayArrayArray3[0][arg0][arg1].aClass2_Sub12_1 = local7;
		Static226.aClass2_Sub12ArrayArrayArray3[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BZ)V")
	public static void method2147() {
		@Pc(7) byte[][] local7 = Static150.aByteArrayArray10;
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static41.method565();
			for (@Pc(23) int local23 = 0; local23 < 13; local23++) {
				for (@Pc(27) int local27 = 0; local27 < 13; local27++) {
					@Pc(37) int local37 = Static128.anIntArrayArrayArray6[local17][local23][local27];
					if (local37 != -1) {
						@Pc(46) int local46 = local37 >> 24 & 0x3;
						@Pc(56) int local56 = local37 >> 1 & 0x3;
						@Pc(62) int local62 = local37 >> 3 & 0x7FF;
						@Pc(68) int local68 = local37 >> 14 & 0x3FF;
						@Pc(78) int local78 = local62 / 8 + (local68 / 8 << 8);
						for (@Pc(80) int local80 = 0; local80 < Static171.anIntArray653.length; local80++) {
							if (local78 == Static171.anIntArray653[local80] && local7[local80] != null) {
								Static169.method3103(local7[local80], local23 * 8, local56, (local68 & 0x7) * 8, Static202.aClass90Array1, local17, local46, (local62 & 0x7) * 8, local27 * 8);
								break;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(IZ)Lclient!gh;")
	public static Class2_Sub3_Sub11 method2150(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub3_Sub11 local10 = (Class2_Sub3_Sub11) Static147.aClass110_19.method3891((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static140.aClass72_195.method3197(arg0, 26);
		local10 = new Class2_Sub3_Sub11();
		if (local20 != null) {
			local10.method1229(new Class2_Sub23(local20));
		}
		Static147.aClass110_19.method3894(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!l", name = "o", descriptor = "(II)V")
	public static void method2151(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub3_Sub8_Sub1 local10;
		if (Static107.aClass2_Sub3_Sub8_5 == null) {
			local10 = new Class2_Sub3_Sub8_Sub1(512, 512);
		} else {
			local10 = (Class2_Sub3_Sub8_Sub1) Static107.aClass2_Sub3_Sub8_5;
		}
		@Pc(21) int[] local21 = local10.anIntArray470;
		@Pc(24) int local24 = local21.length;
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			local21[local26] = 1;
		}
		@Pc(56) int local56;
		@Pc(58) int local58;
		for (@Pc(42) int local42 = 1; local42 < 103; local42++) {
			local56 = (52736 - local42 * 512) * 4 + 24628;
			for (local58 = 1; local58 < 103; local58++) {
				if ((Static133.aByteArrayArrayArray10[arg0][local58][local42] & 0x18) == 0) {
					Static12.method226(local21, local56, arg0, local58, local42);
				}
				if (arg0 < 3 && (Static133.aByteArrayArrayArray10[arg0 + 1][local58][local42] & 0x8) != 0) {
					Static12.method226(local21, local56, arg0 + 1, local58, local42);
				}
				local56 += 4;
			}
		}
		local10.method2276();
		local56 = ((int) (Math.random() * 20.0D) + 228 << 16) + (((int) (Math.random() * 20.0D)) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		local58 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		@Pc(177) int local177;
		for (@Pc(168) int local168 = 1; local168 < 103; local168++) {
			for (local177 = 1; local177 < 103; local177++) {
				if ((Static133.aByteArrayArrayArray10[arg0][local177][local168] & 0x18) == 0) {
					Static60.method776(local177, local56, arg0, local58, local168);
				}
				if (arg0 < 3 && (Static133.aByteArrayArrayArray10[arg0 + 1][local177][local168] & 0x8) != 0) {
					Static60.method776(local177, local56, arg0 + 1, local58, local168);
				}
			}
		}
		Static67.anInt929 = 0;
		for (local177 = 0; local177 < 104; local177++) {
			for (@Pc(241) int local241 = 0; local241 < 104; local241++) {
				@Pc(248) long local248 = Static144.method2568(Static137.anInt3136, local177, local241);
				if (local248 != 0L) {
					@Pc(261) Class2_Sub3_Sub17 local261 = Static121.method3984((int) (local248 >>> 32) & Integer.MAX_VALUE);
					@Pc(264) int local264 = local261.anInt2391;
					@Pc(269) int local269;
					if (local261.anIntArray413 != null) {
						for (local269 = 0; local269 < local261.anIntArray413.length; local269++) {
							if (local261.anIntArray413[local269] != -1) {
								@Pc(285) Class2_Sub3_Sub17 local285 = Static121.method3984(local261.anIntArray413[local269]);
								if (local285.anInt2391 >= 0) {
									local264 = local285.anInt2391;
									break;
								}
							}
						}
					}
					if (local264 >= 0) {
						local269 = local177;
						@Pc(311) int local311 = local241;
						if (local264 != 22 && local264 != 29 && local264 != 34 && local264 != 36 && local264 != 46 && local264 != 47 && local264 != 48) {
							@Pc(347) int[][] local347 = Static202.aClass90Array1[Static137.anInt3136].anIntArrayArray41;
							for (@Pc(349) int local349 = 0; local349 < 10; local349++) {
								@Pc(356) int local356 = (int) (Math.random() * 4.0D);
								if (local356 == 0 && local269 > 0 && local269 > local177 - 3 && (local347[local269 - 1][local311] & 0x12C0108) == 0) {
									local269--;
								}
								if (local356 == 1 && local269 < 103 && local269 < local177 + 3 && (local347[local269 + 1][local311] & 0x12C0180) == 0) {
									local269++;
								}
								if (local356 == 2 && local311 > 0 && local241 - 3 < local311 && (local347[local269][local311 - 1] & 0x12C0102) == 0) {
									local311--;
								}
								if (local356 == 3 && local311 < 103 && local311 < local241 + 3 && (local347[local269][local311 + 1] & 0x12C0120) == 0) {
									local311++;
								}
							}
						}
						Static114.anIntArray435[Static67.anInt929] = local261.anInt2402;
						Static223.anIntArray783[Static67.anInt929] = local269;
						Static162.anIntArray625[Static67.anInt929] = local311;
						Static67.anInt929++;
					}
				}
			}
		}
		Static107.aClass2_Sub3_Sub8_5 = local10;
		Static160.aClass10_1.method2692();
	}
}
