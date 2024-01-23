import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!ud", name = "bb", descriptor = "I")
	public static int anInt4361 = 0;

	@OriginalMember(owner = "client!ud", name = "eb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1498 = Static64.method1101("(U(Y");

	@OriginalMember(owner = "client!ud", name = "fb", descriptor = "Lclient!sf;")
	public static Class105 aClass105_21 = new Class105();

	@OriginalMember(owner = "client!ud", name = "gb", descriptor = "[I")
	public static int[] anIntArray328 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!mb;B)Z")
	public static boolean method3383(@OriginalArg(0) Class70 arg0) {
		return arg0.method3519(Static140.anInt3108);
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(II)I")
	public static int method3384(@OriginalArg(1) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(37) double local37 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(39) double local39 = local10;
		@Pc(41) double local41 = local10;
		if (local23 > local10) {
			local41 = local23;
		}
		if (local23 < local10) {
			local39 = local23;
		}
		if (local39 > local37) {
			local39 = local37;
		}
		if (local37 > local41) {
			local41 = local37;
		}
		@Pc(67) double local67 = 0.0D;
		@Pc(73) double local73 = (local41 + local39) / 2.0D;
		@Pc(75) double local75 = 0.0D;
		if (local41 != local39) {
			if (local10 == local41) {
				local67 = (local23 - local37) / (local41 - local39);
			} else if (local41 == local23) {
				local67 = (local37 - local10) / (local41 - local39) + 2.0D;
			} else if (local37 == local41) {
				local67 = (local10 - local23) / (-local39 + local41) + 4.0D;
			}
			if (local73 < 0.5D) {
				local75 = (local41 - local39) / (local41 + local39);
			}
			if (local73 >= 0.5D) {
				local75 = (local41 - local39) / ((2.0D - local41) - local39);
			}
		}
		local67 /= 6.0D;
		@Pc(162) int local162 = (int) (local67 * 256.0D);
		@Pc(167) int local167 = (int) (local73 * 256.0D);
		@Pc(172) int local172 = (int) (local75 * 256.0D);
		if (local172 < 0) {
			local172 = 0;
		} else if (local172 > 255) {
			local172 = 255;
		}
		if (local167 < 0) {
			local167 = 0;
		} else if (local167 > 255) {
			local167 = 255;
		}
		if (local167 > 243) {
			local172 >>= 0x4;
		} else if (local167 > 217) {
			local172 >>= 0x3;
		} else if (local167 > 192) {
			local172 >>= 0x2;
		} else if (local167 > 179) {
			local172 >>= 0x1;
		}
		return (local172 >> 5 << 7) + (local162 >> 2 << 10) + (local167 >> 1);
	}
}
