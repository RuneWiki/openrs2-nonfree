import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!vn", name = "m", descriptor = "[I")
	public static int[] anIntArray654;

	@OriginalMember(owner = "client!vn", name = "C", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!vn", name = "u", descriptor = "Ljava/lang/String;")
	public static final String aString253 = "glow1:";

	@OriginalMember(owner = "client!vn", name = "G", descriptor = "[I")
	public static final int[] anIntArray657 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)V")
	public static void method5582() {
		Static245.aClass37_20.method920(5);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZI)I")
	public static int method5583(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(51) double local51 = local14;
		if (local23 > local14) {
			local51 = local23;
		}
		if (local51 < local30) {
			local51 = local30;
		}
		@Pc(65) double local65 = 0.0D;
		@Pc(67) double local67 = 0.0D;
		@Pc(73) double local73 = (local32 + local51) / 2.0D;
		if (local32 != local51) {
			if (local73 < 0.5D) {
				local67 = (local51 - local32) / (local32 + local51);
			}
			if (local51 == local14) {
				local65 = (local23 - local30) / (local51 - local32);
			} else if (local23 == local51) {
				local65 = (local30 - local14) / (-local32 + local51) + 2.0D;
			} else if (local30 == local51) {
				local65 = (local14 - local23) / (-local32 + local51) + 4.0D;
			}
			if (local73 >= 0.5D) {
				local67 = (local51 - local32) / (2.0D - local51 - local32);
			}
		}
		local65 /= 6.0D;
		@Pc(163) int local163 = (int) (local65 * 256.0D);
		@Pc(168) int local168 = (int) (local67 * 256.0D);
		@Pc(173) int local173 = (int) (local73 * 256.0D);
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
		return ((local163 >> 2 & 0x3F) << 10) + (local168 >> 5 << 7) + (local173 >> 1);
	}
}
