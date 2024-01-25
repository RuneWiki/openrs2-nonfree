import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!ts", name = "d", descriptor = "Lclient!kr;")
	public static Class118 aClass118_3;

	@OriginalMember(owner = "client!ts", name = "g", descriptor = "F")
	public static float aFloat59;

	@OriginalMember(owner = "client!ts", name = "j", descriptor = "I")
	public static int anInt4878;

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "Z")
	public static boolean aBoolean404 = false;

	@OriginalMember(owner = "client!ts", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString47 = "";

	@OriginalMember(owner = "client!ts", name = "k", descriptor = "[I")
	public static final int[] anIntArray443 = new int[50];

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IZ)I")
	public static int method4312(@OriginalArg(0) int arg0) {
		@Pc(17) double local17 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(26) double local26 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(33) double local33 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(35) double local35 = local17;
		if (local26 < local17) {
			local35 = local26;
		}
		if (local35 > local33) {
			local35 = local33;
		}
		@Pc(49) double local49 = local17;
		if (local26 > local17) {
			local49 = local26;
		}
		if (local49 < local33) {
			local49 = local33;
		}
		@Pc(63) double local63 = 0.0D;
		@Pc(65) double local65 = 0.0D;
		@Pc(71) double local71 = (local49 + local35) / 2.0D;
		if (local49 != local35) {
			if (local71 < 0.5D) {
				local65 = (local49 - local35) / (local35 + local49);
			}
			if (local17 == local49) {
				local63 = (local26 - local33) / (local49 - local35);
			} else if (local26 == local49) {
				local63 = (local33 - local17) / (-local35 + local49) + 2.0D;
			} else if (local33 == local49) {
				local63 = (local17 - local26) / (-local35 + local49) + 4.0D;
			}
			if (local71 >= 0.5D) {
				local65 = (local49 - local35) / ((2.0D - local49) - local35);
			}
		}
		local63 /= 6.0D;
		@Pc(157) int local157 = (int) (local63 * 256.0D);
		@Pc(162) int local162 = (int) (local65 * 256.0D);
		@Pc(167) int local167 = (int) (local71 * 256.0D);
		if (local162 < 0) {
			local162 = 0;
		} else if (local162 > 255) {
			local162 = 255;
		}
		if (local167 < 0) {
			local167 = 0;
		} else if (local167 > 255) {
			local167 = 255;
		}
		if (local167 > 243) {
			local162 >>= 0x4;
		} else if (local167 > 217) {
			local162 >>= 0x3;
		} else if (local167 > 192) {
			local162 >>= 0x2;
		} else if (local167 > 179) {
			local162 >>= 0x1;
		}
		return (local167 >> 1) + ((local157 >> 2 & 0x3F) << 10) + (local162 >> 5 << 7);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)V")
	public static void method4336(@OriginalArg(0) int arg0) {
		Static320.anInt6195 = arg0;
		Static191.anInt3783 = 3;
		Static73.anInt1412 = -1;
		Static229.anInt4619 = 100;
	}
}
