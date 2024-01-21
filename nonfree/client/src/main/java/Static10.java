import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!ai", name = "Ob", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!ai", name = "xb", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_67 = Static181.method2795("loc)3dat");

	@OriginalMember(owner = "client!ai", name = "yb", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_68 = Static181.method2795("Error loading your profile)3");

	@OriginalMember(owner = "client!ai", name = "Ab", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_69 = Static181.method2795("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!ai", name = "Hb", descriptor = "[I")
	public static final int[] anIntArray18 = new int[2048];

	@OriginalMember(owner = "client!ai", name = "Kb", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_70 = Static181.method2795("::");

	@OriginalMember(owner = "client!ai", name = "Lb", descriptor = "Lclient!qe;")
	public static Class83 aClass83_71 = aClass83_68;

	@OriginalMember(owner = "client!ai", name = "Mb", descriptor = "[Lclient!ka;")
	public static final Class54[] aClass54Array1 = new Class54[500];

	@OriginalMember(owner = "client!ai", name = "Qb", descriptor = "[I")
	public static final int[] anIntArray19 = new int[200];

	@OriginalMember(owner = "client!ai", name = "Tb", descriptor = "[I")
	public static final int[] anIntArray20 = new int[100];

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(III[[[II)V")
	public static void method274(@OriginalArg(3) int[][][] arg0) {
		Static135.anInt2895 = 4;
		Static35.anInt916 = 104;
		Static31.anInt825 = 104;
		Static203.aClass2_Sub23ArrayArrayArray1 = new Class2_Sub23[4][104][104];
		Static155.anIntArrayArrayArray8 = new int[4][105][105];
		Static27.anIntArrayArrayArray3 = arg0;
		Static154.method2372();
		Static80.anInt1786 = 25;
		Static58.aBooleanArrayArray1 = new boolean[Static80.anInt1786 + Static80.anInt1786 + 1][Static80.anInt1786 + Static80.anInt1786 + 1];
		Static190.aBooleanArrayArray2 = new boolean[Static80.anInt1786 + Static80.anInt1786 + 2][Static80.anInt1786 + Static80.anInt1786 + 2];
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I[S[Lclient!qe;)V")
	public static void method281(@OriginalArg(1) short[] arg0, @OriginalArg(2) Class83[] arg1) {
		Static7.method107(arg0, arg1.length - 1, arg1, 0);
	}

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "(Z)V")
	public static void method282() {
		if (Static131.aDouble11 < Static49.aDouble10) {
			Static131.aDouble11 += Static131.aDouble11 / 30.0D;
			if (Static49.aDouble10 < Static131.aDouble11) {
				Static131.aDouble11 = Static49.aDouble10;
			}
			Static140.method2273();
		} else if (Static49.aDouble10 < Static131.aDouble11) {
			Static131.aDouble11 -= Static131.aDouble11 / 30.0D;
			if (Static131.aDouble11 < Static49.aDouble10) {
				Static131.aDouble11 = Static49.aDouble10;
			}
			Static140.method2273();
		}
		if (Static113.anInt2598 == -1 || Static121.anInt2748 == -1) {
			return;
		}
		@Pc(53) int local53 = Static113.anInt2598 - Static143.anInt3007;
		if (local53 < 2 || local53 > 2) {
			local53 >>= 0x4;
		}
		Static143.anInt3007 += local53;
		@Pc(74) int local74 = Static121.anInt2748 - Static62.anInt1512;
		if (local74 < 2 || local74 > 2) {
			local74 >>= 0x4;
		}
		Static62.anInt1512 += local74;
		if (local53 == 0 && local74 == 0) {
			Static113.anInt2598 = -1;
			Static121.anInt2748 = -1;
		}
		Static140.method2273();
	}

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "(II)V")
	public static void method283(@OriginalArg(1) int arg0) {
		Static200.anInt3971 += arg0 * 128;
		@Pc(29) int local29;
		if (Static200.anInt3971 > Static44.anIntArray91.length) {
			Static200.anInt3971 -= Static44.anIntArray91.length;
			local29 = (int) (Math.random() * 12.0D);
			Static190.method2864(Static142.aClass29_Sub1Array2[local29]);
		}
		local29 = 0;
		@Pc(42) int local42 = arg0 * 128;
		@Pc(49) int local49 = (256 - arg0) * 128;
		@Pc(80) int local80;
		for (@Pc(55) int local55 = 0; local55 < local49; local55++) {
			local80 = Static166.anIntArray322[local29 + local42] - Static44.anIntArray91[Static200.anInt3971 + local29 & Static44.anIntArray91.length - 1] * arg0 / 6;
			if (local80 < 0) {
				local80 = 0;
			}
			Static166.anIntArray322[local29++] = local80;
		}
		@Pc(108) int local108;
		@Pc(110) int local110;
		@Pc(117) int local117;
		for (local80 = 256 - arg0; local80 < 256; local80++) {
			local108 = local80 * 128;
			for (local110 = 0; local110 < 128; local110++) {
				local117 = (int) (Math.random() * 100.0D);
				if (local117 < 50 && local110 > 10 && local110 < 118) {
					Static166.anIntArray322[local110 + local108] = 255;
				} else {
					Static166.anIntArray322[local110 + local108] = 0;
				}
			}
		}
		if (Static11.anInt375 > 0) {
			Static11.anInt375 -= arg0 * 4;
		}
		if (Static49.anInt1273 > 0) {
			Static49.anInt1273 -= arg0 * 4;
		}
		if (Static11.anInt375 == 0 && Static49.anInt1273 == 0) {
			local108 = (int) (Math.random() * (double) (2000 / arg0));
			if (local108 == 1) {
				Static49.anInt1273 = 1024;
			}
			if (local108 == 0) {
				Static11.anInt375 = 1024;
			}
		}
		for (local108 = 0; local108 < 256 - arg0; local108++) {
			Static84.anIntArray179[local108] = Static84.anIntArray179[local108 + arg0];
		}
		for (local110 = 256 - arg0; local110 < 256; local110++) {
			Static84.anIntArray179[local110] = (int) (Math.sin((double) Static98.anInt2128 / 14.0D) * 16.0D + Math.sin((double) Static98.anInt2128 / 15.0D) * 14.0D + Math.sin((double) Static98.anInt2128 / 16.0D) * 12.0D);
			Static98.anInt2128++;
		}
		Static18.anInt2018 += arg0;
		local117 = (arg0 + (Static13.anInt386 & 0x1)) / 2;
		if (local117 <= 0) {
			return;
		}
		@Pc(298) int local298;
		@Pc(305) int local305;
		for (@Pc(289) int local289 = 0; local289 < Static18.anInt2018 * 100; local289++) {
			local298 = (int) (Math.random() * 124.0D) + 2;
			local305 = (int) (Math.random() * 128.0D) + 128;
			Static166.anIntArray322[local298 + (local305 << 7)] = 192;
		}
		Static18.anInt2018 = 0;
		@Pc(333) int local333;
		@Pc(338) int local338;
		for (local298 = 0; local298 < 256; local298++) {
			local333 = local298 * 128;
			local305 = 0;
			for (local338 = -local117; local338 < 128; local338++) {
				if (local117 + local338 < 128) {
					local305 += Static166.anIntArray322[local117 + local333 + local338];
				}
				if (local338 - local117 - 1 >= 0) {
					local305 -= Static166.anIntArray322[local338 + local333 - local117 - 1];
				}
				if (local338 >= 0) {
					Static197.anIntArray377[local338 + local333] = local305 / (local117 * 2 + 1);
				}
			}
		}
		for (local305 = 0; local305 < 128; local305++) {
			local333 = 0;
			for (local338 = -local117; local338 < 256; local338++) {
				@Pc(419) int local419 = local338 * 128;
				if (local117 + local338 < 256) {
					local333 += Static197.anIntArray377[local305 + local419 + local117 * 128];
				}
				if (local338 - local117 - 1 >= 0) {
					local333 -= Static197.anIntArray377[local419 + local305 - (local117 + 1) * 128];
				}
				if (local338 >= 0) {
					Static166.anIntArray322[local419 + local305] = local333 / (local117 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "(II)I")
	public static int method286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
