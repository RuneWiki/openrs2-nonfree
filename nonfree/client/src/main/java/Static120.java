import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!le", name = "a", descriptor = "Lclient!u;")
	public static Class97 aClass97_1 = new Class97();

	@OriginalMember(owner = "client!le", name = "d", descriptor = "I")
	public static int anInt2807 = 1;

	@OriginalMember(owner = "client!le", name = "e", descriptor = "[I")
	public static int[] anIntArray460 = new int[500];

	@OriginalMember(owner = "client!le", name = "f", descriptor = "Lclient!qe;")
	private static Class78 aClass78_562 = Static199.method3560(" has logged in)3");

	@OriginalMember(owner = "client!le", name = "g", descriptor = "Lclient!qe;")
	public static Class78 aClass78_563 = aClass78_562;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II)I")
	public static int method2212(@OriginalArg(1) int arg0) {
		@Pc(17) double local17 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(26) double local26 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(28) double local28 = local17;
		@Pc(35) double local35 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(37) double local37 = local17;
		if (local26 > local17) {
			local37 = local26;
		}
		if (local26 < local17) {
			local28 = local26;
		}
		if (local37 < local35) {
			local37 = local35;
		}
		if (local28 > local35) {
			local28 = local35;
		}
		@Pc(63) double local63 = 0.0D;
		@Pc(69) double local69 = (local37 + local28) / 2.0D;
		@Pc(71) double local71 = 0.0D;
		if (local28 != local37) {
			if (local69 < 0.5D) {
				local71 = (local37 - local28) / (local28 + local37);
			}
			if (local69 >= 0.5D) {
				local71 = (local37 - local28) / (2.0D - local37 - local28);
			}
			if (local37 == local17) {
				local63 = (local26 - local35) / (local37 - local28);
			} else if (local37 == local26) {
				local63 = (local35 - local17) / (-local28 + local37) + 2.0D;
			} else if (local35 == local37) {
				local63 = (local17 - local26) / (local37 - local28) + 4.0D;
			}
		}
		local63 /= 6.0D;
		@Pc(155) int local155 = (int) (local71 * 256.0D);
		if (local155 < 0) {
			local155 = 0;
		} else if (local155 > 255) {
			local155 = 255;
		}
		@Pc(172) int local172 = (int) (local63 * 256.0D);
		@Pc(177) int local177 = (int) (local69 * 256.0D);
		if (local177 < 0) {
			local177 = 0;
		} else if (local177 > 255) {
			local177 = 255;
		}
		if (local177 > 243) {
			local155 >>= 0x4;
		} else if (local177 > 217) {
			local155 >>= 0x3;
		} else if (local177 > 192) {
			local155 >>= 0x2;
		} else if (local177 > 179) {
			local155 >>= 0x1;
		}
		return (local172 >> 2 << 10) + (local155 >> 5 << 7) + (local177 >> 1);
	}
}
