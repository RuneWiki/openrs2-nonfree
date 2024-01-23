import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!ml", name = "i", descriptor = "Lclient!jg;")
	public static Class4_Sub2_Sub11 aClass4_Sub2_Sub11_9;

	@OriginalMember(owner = "client!ml", name = "o", descriptor = "[I")
	public static int[] anIntArray283;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString121 = "Loaded sprites";

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "[I")
	public static int[] anIntArray282 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!ml", name = "l", descriptor = "I")
	public static int anInt3406 = -2;

	@OriginalMember(owner = "client!ml", name = "m", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray9 = new int[2][][];

	@OriginalMember(owner = "client!ml", name = "n", descriptor = "[C")
	public static char[] aCharArray3 = new char[128];

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIII)V")
	public static void method2692(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(17) int local17 = arg4 + 1;
		Static190.method3151(arg3, Static253.anIntArrayArray34[arg4], arg0, arg1);
		@Pc(26) int local26 = arg2 - 1;
		Static190.method3151(arg3, Static253.anIntArrayArray34[arg2], arg0, arg1);
		for (@Pc(32) int local32 = local17; local32 <= local26; local32++) {
			@Pc(39) int[] local39 = Static253.anIntArrayArray34[local32];
			local39[arg1] = local39[arg3] = arg0;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method2694(@OriginalArg(1) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Z)I")
	public static int method2695() {
		return 2;
	}
}
