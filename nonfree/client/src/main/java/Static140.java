import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static140 {

	@OriginalMember(owner = "client!gq", name = "R", descriptor = "Lclient!qs;")
	public static Class211 aClass211_37;

	@OriginalMember(owner = "client!gq", name = "U", descriptor = "Lclient!pu;")
	public static Class203 aClass203_19;

	@OriginalMember(owner = "client!gq", name = "cb", descriptor = "Lclient!qs;")
	public static Class211 aClass211_38;

	@OriginalMember(owner = "client!gq", name = "P", descriptor = "I")
	public static int anInt3082 = 0;

	@OriginalMember(owner = "client!gq", name = "V", descriptor = "[I")
	public static final int[] anIntArray316 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!gq", name = "W", descriptor = "[I")
	public static final int[] anIntArray317 = new int[13];

	@OriginalMember(owner = "client!gq", name = "X", descriptor = "I")
	public static int anInt3084 = -1;

	@OriginalMember(owner = "client!gq", name = "Z", descriptor = "I")
	public static int anInt3086 = 0;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)Z")
	public static boolean method2263(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IFFF)F")
	public static float method2264(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return (arg2 - arg1) * arg0 + arg1;
	}
}
