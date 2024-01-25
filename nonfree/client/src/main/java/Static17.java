import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!aq", name = "k", descriptor = "Lclient!br;")
	public static Class42 aClass42_3;

	@OriginalMember(owner = "client!aq", name = "o", descriptor = "Lclient!jo;")
	public static Class168 aClass168_13;

	@OriginalMember(owner = "client!aq", name = "p", descriptor = "I")
	public static int anInt874;

	@OriginalMember(owner = "client!aq", name = "l", descriptor = "[I")
	public static final int[] anIntArray53 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!aq", name = "m", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZI)I")
	public static int method842(@OriginalArg(1) int arg0) {
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
		@Pc(46) double local46 = local14;
		if (local14 < local23) {
			local46 = local23;
		}
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local32 + local46) / 2.0D;
		if (local32 != local46) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / ((2.0D - local46) - local32);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
		}
		local60 /= 6.0D;
		@Pc(156) int local156 = (int) (local60 * 256.0D);
		@Pc(166) int local166 = (int) (local62 * 256.0D);
		@Pc(171) int local171 = (int) (local68 * 256.0D);
		if (local166 < 0) {
			local166 = 0;
		} else if (local166 > 255) {
			local166 = 255;
		}
		if (local171 < 0) {
			local171 = 0;
		} else if (local171 > 255) {
			local171 = 255;
		}
		if (local171 > 243) {
			local166 >>= 0x4;
		} else if (local171 > 217) {
			local166 >>= 0x3;
		} else if (local171 > 192) {
			local166 >>= 0x2;
		} else if (local171 > 179) {
			local166 >>= 0x1;
		}
		return (local171 >> 1) + (local166 >> 5 << 7) + ((local156 >> 2 & 0x3F) << 10);
	}
}
