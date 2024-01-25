import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!ks", name = "h", descriptor = "[Lclient!l;")
	public static Class143[] aClass143Array6;

	@OriginalMember(owner = "client!ks", name = "n", descriptor = "Lclient!fr;")
	public static Class81 aClass81_1;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "I")
	public static int anInt3976 = 0;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ZI)I")
	public static int method3355(@OriginalArg(1) int arg0) {
		@Pc(12) double local12 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = local12;
		if (local21 < local12) {
			local30 = local21;
		}
		if (local30 > local28) {
			local30 = local28;
		}
		@Pc(44) double local44 = local12;
		if (local21 > local12) {
			local44 = local21;
		}
		if (local44 < local28) {
			local44 = local28;
		}
		@Pc(58) double local58 = 0.0D;
		@Pc(60) double local60 = 0.0D;
		@Pc(66) double local66 = (local30 + local44) / 2.0D;
		if (local30 != local44) {
			if (local66 < 0.5D) {
				local60 = (local44 - local30) / (local44 + local30);
			}
			if (local12 == local44) {
				local58 = (local21 - local28) / (local44 - local30);
			} else if (local21 == local44) {
				local58 = (local28 - local12) / (local44 - local30) + 2.0D;
			} else if (local44 == local28) {
				local58 = (local12 - local21) / (local44 - local30) + 4.0D;
			}
			if (local66 >= 0.5D) {
				local60 = (local44 - local30) / ((2.0D - local44) - local30);
			}
		}
		local58 /= 6.0D;
		@Pc(157) int local157 = (int) (local58 * 256.0D);
		@Pc(162) int local162 = (int) (local60 * 256.0D);
		@Pc(167) int local167 = (int) (local66 * 256.0D);
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
		return (local162 >> 5 << 7) + ((local157 & 0xFF) >> 2 << 10) + (local167 >> 1);
	}
}
