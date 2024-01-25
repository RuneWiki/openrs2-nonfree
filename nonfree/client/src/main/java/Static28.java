import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_17 = new Class56(67, 6);

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "I")
	public static int anInt515 = -1;

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "I")
	public static int anInt516 = 0;

	@OriginalMember(owner = "client!aw", name = "h", descriptor = "Z")
	public static boolean aBoolean48 = false;

	@OriginalMember(owner = "client!aw", name = "i", descriptor = "[Lclient!ej;")
	public static final Class3_Sub7_Sub6[] aClass3_Sub7_Sub6Array1 = new Class3_Sub7_Sub6[14];

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IB)I")
	public static int method463(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(35) double local35 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(37) double local37 = local14;
		if (local28 < local14) {
			local37 = local28;
		}
		if (local35 < local37) {
			local37 = local35;
		}
		@Pc(51) double local51 = local14;
		if (local14 < local28) {
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
				local67 = (local51 - local37) / (local37 + local51);
			}
			if (local14 == local51) {
				local65 = (local28 - local35) / (local51 - local37);
			} else if (local28 == local51) {
				local65 = (local35 - local14) / (-local37 + local51) + 2.0D;
			} else if (local35 == local51) {
				local65 = (local14 - local28) / (local51 - local37) + 4.0D;
			}
			if (local73 >= 0.5D) {
				local67 = (local51 - local37) / ((2.0D - local51) - local37);
			}
		}
		local65 /= 6.0D;
		@Pc(163) int local163 = (int) (local65 * 256.0D);
		@Pc(168) int local168 = (int) (local67 * 256.0D);
		if (local168 < 0) {
			local168 = 0;
		} else if (local168 > 255) {
			local168 = 255;
		}
		@Pc(184) int local184 = (int) (local73 * 256.0D);
		if (local184 < 0) {
			local184 = 0;
		} else if (local184 > 255) {
			local184 = 255;
		}
		if (local184 > 243) {
			local168 >>= 0x4;
		} else if (local184 > 217) {
			local168 >>= 0x3;
		} else if (local184 > 192) {
			local168 >>= 0x2;
		} else if (local184 > 179) {
			local168 >>= 0x1;
		}
		return (local168 >> 5 << 7) + (((local163 >> 2 & 0x3F) << 10) + (local184 >> 1));
	}
}
