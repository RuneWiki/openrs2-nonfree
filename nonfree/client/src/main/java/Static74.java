import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
	public static int anInt1843;

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray7;

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray8 = new String[100];

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(BI)Z")
	public static boolean method1330(@OriginalArg(1) int arg0) {
		return (-arg0 & arg0) == arg0;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)I")
	public static int method1331(@OriginalArg(1) int arg0) {
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
		if (local19 < local28) {
			local51 = local28;
		}
		if (local35 > local51) {
			local51 = local35;
		}
		@Pc(65) double local65 = 0.0D;
		@Pc(67) double local67 = 0.0D;
		@Pc(73) double local73 = (local37 + local51) / 2.0D;
		if (local51 != local37) {
			if (local73 < 0.5D) {
				local67 = (local51 - local37) / (local51 + local37);
			}
			if (local73 >= 0.5D) {
				local67 = (local51 - local37) / (2.0D - local51 - local37);
			}
			if (local19 == local51) {
				local65 = (local28 - local35) / (-local37 + local51);
			} else if (local51 == local28) {
				local65 = (local35 - local19) / (local51 - local37) + 2.0D;
			} else if (local51 == local35) {
				local65 = (local19 - local28) / (-local37 + local51) + 4.0D;
			}
		}
		local65 /= 6.0D;
		@Pc(160) int local160 = (int) (local65 * 256.0D);
		@Pc(165) int local165 = (int) (local67 * 256.0D);
		@Pc(170) int local170 = (int) (local73 * 256.0D);
		if (local165 < 0) {
			local165 = 0;
		} else if (local165 > 255) {
			local165 = 255;
		}
		if (local170 < 0) {
			local170 = 0;
		} else if (local170 > 255) {
			local170 = 255;
		}
		if (local170 > 243) {
			local165 >>= 0x4;
		} else if (local170 > 217) {
			local165 >>= 0x3;
		} else if (local170 > 192) {
			local165 >>= 0x2;
		} else if (local170 > 179) {
			local165 >>= 0x1;
		}
		return (local170 >> 1) + (local165 >> 5 << 7) + ((local160 >> 2 & 0x3F) << 10);
	}
}
