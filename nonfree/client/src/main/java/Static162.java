import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!qg", name = "u", descriptor = "[I")
	public static int[] anIntArray648;

	@OriginalMember(owner = "client!qg", name = "C", descriptor = "I")
	public static int anInt4654;

	@OriginalMember(owner = "client!qg", name = "v", descriptor = "I")
	public static int anInt4652 = 0;

	@OriginalMember(owner = "client!qg", name = "w", descriptor = "Z")
	public static boolean aBoolean261 = false;

	@OriginalMember(owner = "client!qg", name = "x", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1625 = Static200.method3116("::autoshadow off");

	@OriginalMember(owner = "client!qg", name = "y", descriptor = "I")
	public static int anInt4653 = 0;

	@OriginalMember(owner = "client!qg", name = "z", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1626 = Static200.method3116("Location");

	@OriginalMember(owner = "client!qg", name = "B", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1627 = aClass60_1626;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BI)I")
	public static int method3435(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122 || arg0 >= 224 && arg0 <= 254 && arg0 != 247) {
			return arg0 - 32;
		} else if (arg0 == 255) {
			return 159;
		} else if (arg0 == 156) {
			return 140;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IBI)I")
	public static int method3436(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = 0;
		while (arg1 > 0) {
			arg1--;
			local10 = arg0 & 0x1 | local10 << 1;
			arg0 >>>= 0x1;
		}
		return local10;
	}
}
