import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!dfa", name = "A", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!dfa", name = "x", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_18 = new Class305(1, 1);

	@OriginalMember(owner = "client!dfa", name = "z", descriptor = "Lclient!k;")
	public static final Class187 aClass187_1 = new Class187("WTQA", "office", "_qa", 2);

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(II)I")
	public static int method2030(@OriginalArg(0) int arg0) {
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
		if (local12 < local21) {
			local44 = local21;
		}
		if (local28 > local44) {
			local44 = local28;
		}
		@Pc(58) double local58 = 0.0D;
		@Pc(60) double local60 = 0.0D;
		@Pc(66) double local66 = (local44 + local30) / 2.0D;
		if (local44 != local30) {
			if (local66 < 0.5D) {
				local60 = (local44 - local30) / (local44 + local30);
			}
			if (local66 >= 0.5D) {
				local60 = (local44 - local30) / (2.0D - local44 - local30);
			}
			if (local44 == local12) {
				local58 = (local21 - local28) / (local44 - local30);
			} else if (local44 == local21) {
				local58 = (local28 - local12) / (-local30 + local44) + 2.0D;
			} else if (local44 == local28) {
				local58 = (local12 - local21) / (-local30 + local44) + 4.0D;
			}
		}
		local58 /= 6.0D;
		@Pc(149) int local149 = (int) (local58 * 256.0D);
		@Pc(161) int local161 = (int) (local60 * 256.0D);
		if (local161 < 0) {
			local161 = 0;
		} else if (local161 > 255) {
			local161 = 255;
		}
		@Pc(179) int local179 = (int) (local66 * 256.0D);
		if (local179 < 0) {
			local179 = 0;
		} else if (local179 > 255) {
			local179 = 255;
		}
		if (local179 > 243) {
			local161 >>= 0x4;
		} else if (local179 > 217) {
			local161 >>= 0x3;
		} else if (local179 > 192) {
			local161 >>= 0x2;
		} else if (local179 > 179) {
			local161 >>= 0x1;
		}
		return (local161 >> 5 << 7) + ((local149 >> 2 & 0x3F) << 10) + (local179 >> 1);
	}
}
