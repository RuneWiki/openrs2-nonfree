import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "Q", descriptor = "Lclient!sk;")
	public static final Class297 aClass297_1 = new Class297(1);

	@OriginalMember(owner = "client!a", name = "S", descriptor = "[I")
	public static final int[] anIntArray1 = new int[1000];

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(ZI)V")
	public static void method38(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = Static81.anInt1910 - Static179.anInt3213;
		if (local13 >= 100) {
			Static282.anInt5182 = -1;
			Static394.anInt6810 = -1;
			Static585.anInt9461 = 1;
			return;
		}
		@Pc(28) int local28 = (int) Static79.aFloat37;
		if (local28 < Static507.anInt8454 >> 8) {
			local28 = Static507.anInt8454 >> 8;
		}
		if (Static326.aBooleanArray16[4] && Static43.anIntArray44[4] + 128 > local28) {
			local28 = Static43.anIntArray44[4] + 128;
		}
		@Pc(65) int local65 = Static474.anInt1076 + (int) Static143.aFloat61 & 0x3FFF;
		Static407.method5757(Static536.anInt8844, local65, arg0, Static122.method2103(Static240.anInt4595, Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8796, Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8795) - 200, local28, Static82.anInt9165, (local28 >> 3) * 3 + 600 << 2);
		@Pc(110) float local110 = 1.0F - (float) ((100 - local13) * (-local13 + 100) * (100 - local13)) / 1000000.0F;
		Static350.anInt6168 = (int) (local110 * (float) (Static350.anInt6168 - Static505.anInt8442) + (float) Static505.anInt8442);
		Static216.anInt4203 = (int) (local110 * (float) (Static216.anInt4203 - Static194.anInt3959) + (float) Static194.anInt3959);
		Static124.anInt2517 = (int) ((float) Static259.anInt4765 + local110 * (float) (Static124.anInt2517 - Static259.anInt4765));
		Static333.anInt5940 = (int) ((float) Static509.anInt8462 + local110 * (float) (Static333.anInt5940 - Static509.anInt8462));
		@Pc(162) int local162 = Static202.anInt4065 - Static498.anInt8350;
		if (local162 > 8192) {
			local162 -= 16384;
		} else if (local162 < -8192) {
			local162 += 16384;
		}
		Static202.anInt4065 = (int) ((float) local162 * local110 + (float) Static498.anInt8350);
		Static202.anInt4065 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)I")
	public static int method40(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local14 < local23) {
			local46 = local23;
		}
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local46 + local32) / 2.0D;
		if (local32 != local46) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / ((2.0D - local46) - local32);
			}
		}
		local60 /= 6.0D;
		@Pc(157) int local157 = (int) (local60 * 256.0D);
		@Pc(162) int local162 = (int) (local62 * 256.0D);
		if (local162 < 0) {
			local162 = 0;
		} else if (local162 > 255) {
			local162 = 255;
		}
		@Pc(180) int local180 = (int) (local68 * 256.0D);
		if (local180 < 0) {
			local180 = 0;
		} else if (local180 > 255) {
			local180 = 255;
		}
		if (local180 > 243) {
			local162 >>= 0x4;
		} else if (local180 > 217) {
			local162 >>= 0x3;
		} else if (local180 > 192) {
			local162 >>= 0x2;
		} else if (local180 > 179) {
			local162 >>= 0x1;
		}
		return (local162 >> 5 << 7) + ((local157 & 0xFF) >> 2 << 10) + (local180 >> 1);
	}

	@OriginalMember(owner = "client!a", name = "f", descriptor = "(III)V")
	public static void method42(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub3_Sub1 local12 = Static374.method5445(12, arg0);
		local12.method491();
		local12.anInt548 = arg1;
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(B)V")
	public static void method43() {
		Static384.aClass10Array19 = null;
		Static523.aClass10Array25 = null;
		Static482.aClass10Array21 = null;
		Static344.aClass10Array16 = null;
		Static276.aClass10_18 = null;
		Static192.aClass10Array12 = null;
		Static30.aClass10Array1 = null;
		Static130.aClass10Array20 = null;
		Static260.aClass35_7 = null;
		Static114.aClass10Array9 = null;
		Static484.aClass10Array22 = null;
		Static492.aClass10Array23 = null;
		Static9.aClass10_4 = null;
		Static538.aClass10Array24 = null;
		Static21.aClass35_1 = null;
		Static78.aClass10Array8 = null;
		Static39.aClass10Array5 = null;
		Static443.aClass35_11 = null;
	}
}
