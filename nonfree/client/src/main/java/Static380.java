import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "B")
	public static byte aByte95;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)I")
	public static int method5723(@OriginalArg(0) int arg0) {
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
		if (local28 > local44) {
			local44 = local28;
		}
		@Pc(58) double local58 = 0.0D;
		@Pc(61) double local61 = (double) 0;
		@Pc(67) double local67 = (local44 + local30) / 2.0D;
		if (local30 != local44) {
			if (local67 < 0.5D) {
				local61 = (local44 - local30) / (local30 + local44);
			}
			if (local12 == local44) {
				local58 = (local21 - local28) / (local44 - local30);
			} else if (local44 == local21) {
				local58 = (local28 - local12) / (-local30 + local44) + 2.0D;
			} else if (local28 == local44) {
				local58 = (local12 - local21) / (local44 - local30) + 4.0D;
			}
			if (local67 >= 0.5D) {
				local61 = (local44 - local30) / (2.0D - local44 - local30);
			}
		}
		local58 /= 6.0D;
		@Pc(155) int local155 = (int) (local58 * 256.0D);
		@Pc(160) int local160 = (int) (local61 * 256.0D);
		if (local160 < 0) {
			local160 = 0;
		} else if (local160 > 255) {
			local160 = 255;
		}
		@Pc(178) int local178 = (int) (local67 * 256.0D);
		if (local178 < 0) {
			local178 = 0;
		} else if (local178 > 255) {
			local178 = 255;
		}
		if (local178 > 243) {
			local160 >>= 0x4;
		} else if (local178 > 217) {
			local160 >>= 0x3;
		} else if (local178 > 192) {
			local160 >>= 0x2;
		} else if (local178 > 179) {
			local160 >>= 0x1;
		}
		return (local178 >> 1) + (local160 >> 5 << 7) + ((local155 >> 2 & 0x3F) << 10);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
	public static void method5724() {
		@Pc(7) int[] local7 = new int[Static570.aClass267_2.anInt7871];
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < Static570.aClass267_2.anInt7871; local11++) {
			@Pc(17) Class245 local17 = Static570.aClass267_2.method6597(local11);
			if (local17.anInt7449 >= 0 || local17.anInt7483 >= 0) {
				local7[local9++] = local11;
			}
		}
		Static420.anIntArray514 = new int[local9];
		for (@Pc(41) int local41 = 0; local41 < local9; local41++) {
			Static420.anIntArray514[local41] = local7[local41];
		}
	}
}
