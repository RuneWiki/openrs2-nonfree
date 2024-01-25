import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!laa", name = "c", descriptor = "I")
	public static int anInt9555 = 0;

	@OriginalMember(owner = "client!laa", name = "e", descriptor = "Lclient!g;")
	public static final Class110 aClass110_26 = new Class110(1);

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(II)I")
	public static int method8226(@OriginalArg(1) int arg0) {
		@Pc(19) double local19 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(35) double local35 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(37) double local37 = local19;
		if (local19 > local28) {
			local37 = local28;
		}
		if (local37 > local35) {
			local37 = local35;
		}
		@Pc(51) double local51 = local19;
		if (local28 > local19) {
			local51 = local28;
		}
		if (local51 < local35) {
			local51 = local35;
		}
		@Pc(65) double local65 = 0.0D;
		@Pc(67) double local67 = 0.0D;
		@Pc(73) double local73 = (local51 + local37) / 2.0D;
		if (local37 != local51) {
			if (local73 < 0.5D) {
				local67 = (local51 - local37) / (local37 + local51);
			}
			if (local73 >= 0.5D) {
				local67 = (local51 - local37) / (2.0D - local37 - local51);
			}
			if (local51 == local19) {
				local65 = (local28 - local35) / (local51 - local37);
			} else if (local51 == local28) {
				local65 = (local35 - local19) / (-local37 + local51) + 2.0D;
			} else if (local35 == local51) {
				local65 = (local19 - local28) / (local51 - local37) + 4.0D;
			}
		}
		local65 /= 6.0D;
		@Pc(164) int local164 = (int) (local65 * 256.0D);
		@Pc(169) int local169 = (int) (local67 * 256.0D);
		if (local169 < 0) {
			local169 = 0;
		} else if (local169 > 255) {
			local169 = 255;
		}
		@Pc(188) int local188 = (int) (local73 * 256.0D);
		if (local188 < 0) {
			local188 = 0;
		} else if (local188 > 255) {
			local188 = 255;
		}
		if (local188 > 243) {
			local169 >>= 0x4;
		} else if (local188 > 217) {
			local169 >>= 0x3;
		} else if (local188 > 192) {
			local169 >>= 0x2;
		} else if (local188 > 179) {
			local169 >>= 0x1;
		}
		return (local188 >> 1) + (((local164 & 0xFF) >> 2 << 10) + (local169 >> 5 << 7));
	}
}
