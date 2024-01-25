import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!uk", name = "g", descriptor = "Lclient!tj;")
	public static Class193 aClass193_101;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
	public static int anInt6225 = 0;

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_228 = new Class198(30);

	@OriginalMember(owner = "client!uk", name = "l", descriptor = "J")
	public static long aLong198 = 0L;

	@OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
	public static int anInt6234 = 0;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IILclient!hl;)V")
	public static void method5274(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub1_Sub2 arg1) {
		@Pc(12) int local12 = -1;
		@Pc(14) int local14 = 0;
		if (arg1.anInt4958 > Static199.anInt4137) {
			Static333.method5389(arg1);
		} else if (arg1.anInt4922 < Static199.anInt4137) {
			Static29.method496(arg1, false);
			local12 = Static221.anInt2807;
			local14 = Static93.anInt2504;
		} else {
			Static98.method2237(arg1);
		}
		if (arg1.anInt6701 < 128 || arg1.anInt6702 < 128 || arg1.anInt6701 >= (Static350.anInt6637 - 1) * 128 || arg1.anInt6702 >= Static105.anInt2647 * 128 - 128) {
			arg1.anInt4972 = -1;
			arg1.anInt4922 = 0;
			arg1.anInt4958 = 0;
			arg1.anInt4954 = -1;
			arg1.anInt6701 = arg1.anIntArray415[0] * 128 + arg1.method4349() * 64;
			arg1.anInt6702 = arg1.anIntArray416[0] * 128 + arg1.method4349() * 64;
			arg1.method4333();
		}
		if (Static158.aClass8_Sub1_Sub2_Sub1_1 == arg1 && (arg1.anInt6701 < 1536 || arg1.anInt6702 < 1536 || (Static350.anInt6637 - 12) * 128 <= arg1.anInt6701 || Static105.anInt2647 * 128 - 1536 <= arg1.anInt6702)) {
			arg1.anInt4972 = -1;
			arg1.anInt4954 = -1;
			arg1.anInt4922 = 0;
			arg1.anInt4958 = 0;
			arg1.anInt6701 = arg1.anIntArray415[0] * 128 + arg1.method4349() * 64;
			arg1.anInt6702 = arg1.anIntArray416[0] * 128 + arg1.method4349() * 64;
			arg1.method4333();
		}
		@Pc(203) int local203 = Static95.method2222(arg1);
		Static227.method812(arg1, local14, local12, local203);
		Static195.method3689(arg1);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(BI)I")
	public static int method5275(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(40) double local40 = local14;
		if (local23 < local14) {
			local40 = local23;
		}
		if (local40 > local30) {
			local40 = local30;
		}
		@Pc(54) double local54 = local14;
		if (local23 > local14) {
			local54 = local23;
		}
		if (local30 > local54) {
			local54 = local30;
		}
		@Pc(68) double local68 = 0.0D;
		@Pc(70) double local70 = 0.0D;
		@Pc(76) double local76 = (local54 + local40) / 2.0D;
		if (local40 != local54) {
			if (local76 < 0.5D) {
				local70 = (local54 - local40) / (local54 + local40);
			}
			if (local76 >= 0.5D) {
				local70 = (local54 - local40) / (2.0D - local40 - local54);
			}
			if (local54 == local14) {
				local68 = (local23 - local30) / (local54 - local40);
			} else if (local23 == local54) {
				local68 = (local30 - local14) / (local54 - local40) + 2.0D;
			} else if (local54 == local30) {
				local68 = (local14 - local23) / (-local40 + local54) + 4.0D;
			}
		}
		local68 /= 6.0D;
		@Pc(166) int local166 = (int) (local68 * 256.0D);
		@Pc(171) int local171 = (int) (local70 * 256.0D);
		if (local171 < 0) {
			local171 = 0;
		} else if (local171 > 255) {
			local171 = 255;
		}
		@Pc(192) int local192 = (int) (local76 * 256.0D);
		if (local192 < 0) {
			local192 = 0;
		} else if (local192 > 255) {
			local192 = 255;
		}
		if (local192 > 243) {
			local171 >>= 0x4;
		} else if (local192 > 217) {
			local171 >>= 0x3;
		} else if (local192 > 192) {
			local171 >>= 0x2;
		} else if (local192 > 179) {
			local171 >>= 0x1;
		}
		return (local171 >> 5 << 7) + (((local166 >> 2 & 0x3F) << 10) + (local192 >> 1));
	}
}
