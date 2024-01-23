import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "Z")
	public static boolean aBoolean302;

	@OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
	public static int anInt4294;

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
	public static int anInt4286 = 0;

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "[I")
	public static int[] anIntArray456 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
	public static int anInt4292 = 0;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)V")
	public static void method3578(@OriginalArg(0) int arg0) {
		if (Static227.anInt4358 == 0) {
			Static46.aClass4_Sub6_Sub2_3.method2486(arg0);
		} else {
			Static287.anInt5392 = arg0;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "([BI)V")
	public static void method3579(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class4_Sub10 local10 = new Class4_Sub10(arg0);
		local10.anInt5713 = arg0.length - 2;
		Static143.anInt2748 = local10.method4653();
		Static223.aBooleanArray22 = new boolean[Static143.anInt2748];
		Static141.aByteArrayArray54 = new byte[Static143.anInt2748][];
		Static195.anIntArray402 = new int[Static143.anInt2748];
		Static110.anIntArray185 = new int[Static143.anInt2748];
		Static230.aByteArrayArray36 = new byte[Static143.anInt2748][];
		Static301.anIntArray643 = new int[Static143.anInt2748];
		Static187.anIntArray391 = new int[Static143.anInt2748];
		local10.anInt5713 = arg0.length - Static143.anInt2748 * 8 - 7;
		Static47.anInt889 = local10.method4653();
		Static105.anInt2162 = local10.method4653();
		@Pc(68) int local68 = (local10.method4666() & 0xFF) + 1;
		@Pc(78) int local78;
		for (local78 = 0; local78 < Static143.anInt2748; local78++) {
			Static195.anIntArray402[local78] = local10.method4653();
		}
		for (local78 = 0; local78 < Static143.anInt2748; local78++) {
			Static187.anIntArray391[local78] = local10.method4653();
		}
		for (local78 = 0; local78 < Static143.anInt2748; local78++) {
			Static110.anIntArray185[local78] = local10.method4653();
		}
		for (local78 = 0; local78 < Static143.anInt2748; local78++) {
			Static301.anIntArray643[local78] = local10.method4653();
		}
		local10.anInt5713 = arg0.length - Static143.anInt2748 * 8 - (local68 - 1) * 3 - 7;
		Static58.anIntArray85 = new int[local68];
		for (local78 = 1; local78 < local68; local78++) {
			Static58.anIntArray85[local78] = local10.method4655();
			if (Static58.anIntArray85[local78] == 0) {
				Static58.anIntArray85[local78] = 1;
			}
		}
		local10.anInt5713 = 0;
		for (local78 = 0; local78 < Static143.anInt2748; local78++) {
			@Pc(206) int local206 = Static110.anIntArray185[local78];
			@Pc(210) int local210 = Static301.anIntArray643[local78];
			@Pc(214) int local214 = local210 * local206;
			@Pc(217) byte[] local217 = new byte[local214];
			Static230.aByteArrayArray36[local78] = local217;
			@Pc(224) byte[] local224 = new byte[local214];
			@Pc(226) boolean local226 = false;
			Static141.aByteArrayArray54[local78] = local224;
			@Pc(234) int local234 = local10.method4666();
			@Pc(243) int local243;
			if ((local234 & 0x1) == 0) {
				for (local243 = 0; local243 < local214; local243++) {
					local217[local243] = local10.method4674();
				}
				if ((local234 & 0x2) != 0) {
					for (local243 = 0; local243 < local214; local243++) {
						@Pc(277) byte local277 = local224[local243] = local10.method4674();
						local226 |= local277 != -1;
					}
				}
			} else {
				local243 = 0;
				label98: while (true) {
					@Pc(303) int local303;
					if (local243 >= local206) {
						if ((local234 & 0x2) == 0) {
							break;
						}
						local243 = 0;
						while (true) {
							if (local243 >= local206) {
								break label98;
							}
							for (local303 = 0; local303 < local210; local303++) {
								@Pc(365) byte local365 = local224[local243 + local303 * local206] = local10.method4674();
								local226 |= local365 != -1;
							}
							local243++;
						}
					}
					for (local303 = 0; local303 < local210; local303++) {
						local217[local243 + local206 * local303] = local10.method4674();
					}
					local243++;
				}
			}
			Static223.aBooleanArray22[local78] = local226;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZII)V")
	public static void method3580(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static2.anIntArray2[arg0] = arg1;
		@Pc(20) Class4_Sub5 local20 = (Class4_Sub5) Static289.aClass85_25.method1845((long) arg0);
		if (local20 == null) {
			local20 = new Class4_Sub5(Static101.method1677() + 500L);
			Static289.aClass85_25.method1841(local20, (long) arg0);
		} else {
			local20.aLong17 = Static101.method1677() + 500L;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!fd;)V")
	public static void method3583(@OriginalArg(1) Class4_Sub10 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static93.anInt2580; local3++) {
			@Pc(14) int local14 = arg0.method4616();
			@Pc(18) int local18 = arg0.method4653();
			if (local18 == 65535) {
				local18 = -1;
			}
			if (Static75.aClass63_Sub1Array1[local14] != null) {
				Static75.aClass63_Sub1Array1[local14].anInt2023 = local18;
			}
		}
	}
}
