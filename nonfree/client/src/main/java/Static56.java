import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "Z")
	public static boolean aBoolean102 = false;

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
	public static int anInt1149 = 0;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)Z")
	public static boolean method1071() {
		if (Static374.aBoolean489) {
			try {
				if ((Boolean) Static400.method4007(Static92.aClass53_2.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(26) Throwable local26) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)I")
	public static int method1074(@OriginalArg(0) int arg0) {
		@Pc(22) double local22 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(31) double local31 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(38) double local38 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(40) double local40 = local22;
		if (local22 > local31) {
			local40 = local31;
		}
		if (local40 > local38) {
			local40 = local38;
		}
		@Pc(54) double local54 = local22;
		if (local22 < local31) {
			local54 = local31;
		}
		if (local54 < local38) {
			local54 = local38;
		}
		@Pc(68) double local68 = 0.0D;
		@Pc(70) double local70 = 0.0D;
		@Pc(76) double local76 = (local40 + local54) / 2.0D;
		if (local40 != local54) {
			if (local76 < 0.5D) {
				local70 = (local54 - local40) / (local54 + local40);
			}
			if (local22 == local54) {
				local68 = (local31 - local38) / (local54 - local40);
			} else if (local31 == local54) {
				local68 = (local38 - local22) / (-local40 + local54) + 2.0D;
			} else if (local38 == local54) {
				local68 = (local22 - local31) / (-local40 + local54) + 4.0D;
			}
			if (local76 >= 0.5D) {
				local70 = (local54 - local40) / ((2.0D - local54) - local40);
			}
		}
		local68 /= 6.0D;
		@Pc(165) int local165 = (int) (local68 * 256.0D);
		@Pc(170) int local170 = (int) (local70 * 256.0D);
		if (local170 < 0) {
			local170 = 0;
		} else if (local170 > 255) {
			local170 = 255;
		}
		@Pc(189) int local189 = (int) (local76 * 256.0D);
		if (local189 < 0) {
			local189 = 0;
		} else if (local189 > 255) {
			local189 = 255;
		}
		if (local189 > 243) {
			local170 >>= 0x4;
		} else if (local189 > 217) {
			local170 >>= 0x3;
		} else if (local189 > 192) {
			local170 >>= 0x2;
		} else if (local189 > 179) {
			local170 >>= 0x1;
		}
		return (local189 >> 1) + ((local165 >> 2 & 0x3F) << 10) + (local170 >> 5 << 7);
	}
}
