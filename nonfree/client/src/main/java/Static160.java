import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
	public static int anInt3182;

	@OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
	public static int anInt3183;

	@OriginalMember(owner = "client!kd", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString125 = "Loaded sprites";

	@OriginalMember(owner = "client!kd", name = "H", descriptor = "I")
	public static int anInt3190 = 0;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)I")
	public static int method3019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >>> 24;
		@Pc(16) int local16 = 255 - local7;
		@Pc(34) int local34 = ((arg1 & 0xFF00) * local7 & 0xFF0000 | (arg1 & 0xFF00FF) * local7 & 0xFF00FF00) >>> 8;
		return ((local16 * (arg0 & 0xFF00) & 0xFF0000 | (arg0 & 0xFF00FF) * local16 & 0xFF00FF00) >>> 8) + local34;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)I")
	public static int method3021(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(53) double local53 = local14;
		if (local23 > local14) {
			local53 = local23;
		}
		if (local53 < local30) {
			local53 = local30;
		}
		@Pc(67) double local67 = 0.0D;
		@Pc(69) double local69 = 0.0D;
		@Pc(75) double local75 = (local32 + local53) / 2.0D;
		if (local32 != local53) {
			if (local75 < 0.5D) {
				local69 = (local53 - local32) / (local32 + local53);
			}
			if (local75 >= 0.5D) {
				local69 = (local53 - local32) / ((2.0D - local53) - local32);
			}
			if (local53 == local14) {
				local67 = (local23 - local30) / (local53 - local32);
			} else if (local23 == local53) {
				local67 = (local30 - local14) / (-local32 + local53) + 2.0D;
			} else if (local30 == local53) {
				local67 = (local14 - local23) / (-local32 + local53) + 4.0D;
			}
		}
		local67 /= 6.0D;
		@Pc(163) int local163 = (int) (local67 * 256.0D);
		@Pc(168) int local168 = (int) (local69 * 256.0D);
		@Pc(173) int local173 = (int) (local75 * 256.0D);
		if (local168 < 0) {
			local168 = 0;
		} else if (local168 > 255) {
			local168 = 255;
		}
		if (local173 < 0) {
			local173 = 0;
		} else if (local173 > 255) {
			local173 = 255;
		}
		if (local173 > 243) {
			local168 >>= 0x4;
		} else if (local173 > 217) {
			local168 >>= 0x3;
		} else if (local173 > 192) {
			local168 >>= 0x2;
		} else if (local173 > 179) {
			local168 >>= 0x1;
		}
		return (local173 >> 1) + ((local163 & 0xFF) >> 2 << 10) + (local168 >> 5 << 7);
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(BI)V")
	public static void method3022(@OriginalArg(1) int arg0) {
		Static143.anInt2803 = arg0;
		@Pc(15) Class140 local15 = Static159.aClass140_84;
		synchronized (Static159.aClass140_84) {
			Static159.aClass140_84.method3819();
		}
		local15 = Static145.aClass140_77;
		synchronized (Static145.aClass140_77) {
			Static145.aClass140_77.method3819();
		}
	}
}
