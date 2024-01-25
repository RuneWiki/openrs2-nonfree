import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(II)I")
	public static int method3918(@OriginalArg(0) int arg0) {
		@Pc(19) double local19 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(35) double local35 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(37) double local37 = local19;
		if (local28 < local19) {
			local37 = local28;
		}
		if (local35 < local37) {
			local37 = local35;
		}
		@Pc(51) double local51 = local19;
		if (local28 > local19) {
			local51 = local28;
		}
		if (local35 > local51) {
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
				local67 = (local51 - local37) / (2.0D - local51 - local37);
			}
			if (local19 == local51) {
				local65 = (local28 - local35) / (local51 - local37);
			} else if (local51 == local28) {
				local65 = (local35 - local19) / (-local37 + local51) + 2.0D;
			} else if (local51 == local35) {
				local65 = (local19 - local28) / (local51 - local37) + 4.0D;
			}
		}
		local65 /= 6.0D;
		@Pc(157) int local157 = (int) (local65 * 256.0D);
		@Pc(162) int local162 = (int) (local67 * 256.0D);
		if (local162 < 0) {
			local162 = 0;
		} else if (local162 > 255) {
			local162 = 255;
		}
		@Pc(177) int local177 = (int) (local73 * 256.0D);
		if (local177 < 0) {
			local177 = 0;
		} else if (local177 > 255) {
			local177 = 255;
		}
		if (local177 > 243) {
			local162 >>= 0x4;
		} else if (local177 > 217) {
			local162 >>= 0x3;
		} else if (local177 > 192) {
			local162 >>= 0x2;
		} else if (local177 > 179) {
			local162 >>= 0x1;
		}
		return (local162 >> 5 << 7) + ((local157 >> 2 & 0x3F) << 10) + (local177 >> 1);
	}
}
