import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!wh", name = "H", descriptor = "I")
	public static int anInt4450;

	@OriginalMember(owner = "client!wh", name = "n", descriptor = "[I")
	public static int[] anIntArray509 = new int[2];

	@OriginalMember(owner = "client!wh", name = "D", descriptor = "[Lclient!gj;")
	public static Class20_Sub3_Sub1[] aClass20_Sub3_Sub1Array1 = new Class20_Sub3_Sub1[2048];

	@OriginalMember(owner = "client!wh", name = "F", descriptor = "I")
	public static int anInt4448 = 0;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZI)V")
	public static void method3498(@OriginalArg(1) int arg0) {
		if (Static110.anIntArray235 == null || Static110.anIntArray235.length < arg0) {
			Static110.anIntArray235 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(II)I")
	public static int method3502(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local23;
		@Pc(34) double local34 = local23;
		if (local14 > local23) {
			local32 = local14;
		}
		if (local14 < local23) {
			local34 = local14;
		}
		if (local30 < local34) {
			local34 = local30;
		}
		@Pc(54) double local54 = 0.0D;
		if (local30 > local32) {
			local32 = local30;
		}
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local34 + local32) / 2.0D;
		if (local34 != local32) {
			if (local23 == local32) {
				local54 = (local14 - local30) / (local32 - local34);
			} else if (local14 == local32) {
				local54 = (local30 - local23) / (-local34 + local32) + 2.0D;
			} else if (local32 == local30) {
				local54 = (local23 - local14) / (-local34 + local32) + 4.0D;
			}
			if (local68 < 0.5D) {
				local62 = (local32 - local34) / (local32 + local34);
			}
			if (local68 >= 0.5D) {
				local62 = (local32 - local34) / (2.0D - local32 - local34);
			}
		}
		local54 /= 6.0D;
		@Pc(157) int local157 = (int) (local54 * 256.0D);
		@Pc(162) int local162 = (int) (local62 * 256.0D);
		@Pc(167) int local167 = (int) (local68 * 256.0D);
		if (local162 < 0) {
			local162 = 0;
		} else if (local162 > 255) {
			local162 = 255;
		}
		if (local167 < 0) {
			local167 = 0;
		} else if (local167 > 255) {
			local167 = 255;
		}
		if (local167 > 243) {
			local162 >>= 0x4;
		} else if (local167 > 217) {
			local162 >>= 0x3;
		} else if (local167 > 192) {
			local162 >>= 0x2;
		} else if (local167 > 179) {
			local162 >>= 0x1;
		}
		return (local167 >> 1) + (local157 >> 2 << 10) + (local162 >> 5 << 7);
	}
}
