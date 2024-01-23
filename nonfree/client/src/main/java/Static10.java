import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
	public static int anInt104;

	@OriginalMember(owner = "client!ai", name = "F", descriptor = "[Z")
	public static boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!ai", name = "N", descriptor = "[Lclient!wd;")
	public static Class8_Sub1_Sub7[] aClass8_Sub1_Sub7Array3;

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
	public static int anInt94 = 5063219;

	@OriginalMember(owner = "client!ai", name = "z", descriptor = "I")
	public static int anInt114 = 0;

	@OriginalMember(owner = "client!ai", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString11 = "M";

	@OriginalMember(owner = "client!ai", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString12 = "cyan:";

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)Lclient!eg;")
	public static Class8_Sub1_Sub7_Sub1 method89() {
		@Pc(11) int local11 = Static135.anIntArray225[0] * Static92.anIntArray130[0];
		@Pc(15) byte[] local15 = Static232.aByteArrayArray15[0];
		@Pc(18) int[] local18 = new int[local11];
		for (@Pc(20) int local20 = 0; local20 < local11; local20++) {
			local18[local20] = Static147.anIntArray236[local15[local20] & 0xFF];
		}
		@Pc(54) Class8_Sub1_Sub7_Sub1 local54 = new Class8_Sub1_Sub7_Sub1(Static97.anInt1999, Static290.anInt5656, Static25.anIntArray45[0], Static225.anIntArray345[0], Static92.anIntArray130[0], Static135.anIntArray225[0], local18);
		Static147.method2386();
		return local54;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZI)I")
	public static int method90(@OriginalArg(1) int arg0) {
		@Pc(12) double local12 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = 0.0D;
		@Pc(32) double local32 = local21;
		if (local21 > local12) {
			local32 = local12;
		}
		if (local28 < local32) {
			local32 = local28;
		}
		@Pc(46) double local46 = local21;
		if (local12 > local21) {
			local46 = local12;
		}
		if (local28 > local46) {
			local46 = local28;
		}
		@Pc(65) double local65 = (local32 + local46) / 2.0D;
		@Pc(67) double local67 = 0.0D;
		if (local32 != local46) {
			if (local65 < 0.5D) {
				local67 = (local46 - local32) / (local32 + local46);
			}
			if (local65 >= 0.5D) {
				local67 = (local46 - local32) / (2.0D - local32 - local46);
			}
			if (local21 == local46) {
				local30 = (local12 - local28) / (local46 - local32);
			} else if (local12 == local46) {
				local30 = (local28 - local21) / (-local32 + local46) + 2.0D;
			} else if (local28 == local46) {
				local30 = (local21 - local12) / (local46 - local32) + 4.0D;
			}
		}
		@Pc(152) int local152 = (int) (local65 * 256.0D);
		if (local152 < 0) {
			local152 = 0;
		} else if (local152 > 255) {
			local152 = 255;
		}
		local30 /= 6.0D;
		@Pc(176) int local176 = (int) (local67 * 256.0D);
		@Pc(181) int local181 = (int) (local30 * 256.0D);
		if (local176 < 0) {
			local176 = 0;
		} else if (local176 > 255) {
			local176 = 255;
		}
		if (local152 > 243) {
			local176 >>= 0x4;
		} else if (local152 > 217) {
			local176 >>= 0x3;
		} else if (local152 > 192) {
			local176 >>= 0x2;
		} else if (local152 > 179) {
			local176 >>= 0x1;
		}
		return (local152 >> 1) + ((local181 >> 2 << 10) + (local176 >> 5 << 7));
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
	public static void method94() {
		Static183.aClass61_31.method1379();
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)V")
	public static void method100(@OriginalArg(0) int arg0) {
		@Pc(16) Class8_Sub1_Sub6 local16 = Static181.method2779(7, arg0);
		local16.method929();
	}
}
