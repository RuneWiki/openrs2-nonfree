import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!ida", name = "h", descriptor = "I")
	public static int anInt4389;

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "Lclient!mv;")
	public static final Class219 aClass219_11 = new Class219(11, 0, 1, 2);

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(ZI)I")
	public static int method3726(@OriginalArg(1) int arg0) {
		@Pc(12) double local12 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = local12;
		if (local12 > local21) {
			local30 = local21;
		}
		if (local28 < local30) {
			local30 = local28;
		}
		@Pc(44) double local44 = local12;
		if (local21 > local12) {
			local44 = local21;
		}
		if (local28 > local44) {
			local44 = local28;
		}
		@Pc(58) double local58 = 0.0D;
		@Pc(60) double local60 = 0.0D;
		@Pc(66) double local66 = (local30 + local44) / 2.0D;
		if (local44 != local30) {
			if (local66 < 0.5D) {
				local60 = (local44 - local30) / (local44 + local30);
			}
			if (local66 >= 0.5D) {
				local60 = (local44 - local30) / (2.0D - local30 - local44);
			}
			if (local12 == local44) {
				local58 = (local21 - local28) / (local44 - local30);
			} else if (local44 == local21) {
				local58 = (local28 - local12) / (-local30 + local44) + 2.0D;
			} else if (local28 == local44) {
				local58 = (local12 - local21) / (-local30 + local44) + 4.0D;
			}
		}
		local58 /= 6.0D;
		@Pc(154) int local154 = (int) (local58 * 256.0D);
		@Pc(159) int local159 = (int) (local60 * 256.0D);
		@Pc(164) int local164 = (int) (local66 * 256.0D);
		if (local159 < 0) {
			local159 = 0;
		} else if (local159 > 255) {
			local159 = 255;
		}
		if (local164 < 0) {
			local164 = 0;
		} else if (local164 > 255) {
			local164 = 255;
		}
		if (local164 > 243) {
			local159 >>= 0x4;
		} else if (local164 > 217) {
			local159 >>= 0x3;
		} else if (local164 > 192) {
			local159 >>= 0x2;
		} else if (local164 > 179) {
			local159 >>= 0x1;
		}
		return (local164 >> 1) + ((local154 >> 2 & 0x3F) << 10) + (local159 >> 5 << 7);
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(BII)Z")
	public static boolean method3730(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
