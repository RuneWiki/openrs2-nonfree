import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!ce", name = "N", descriptor = "[I")
	public static int[] anIntArray35 = new int[500];

	@OriginalMember(owner = "client!ce", name = "O", descriptor = "Lclient!tg;")
	private static Class81 aClass81_200 = Static120.method2057("wave2:");

	@OriginalMember(owner = "client!ce", name = "Q", descriptor = "Lclient!tg;")
	private static Class81 aClass81_201 = Static120.method2057("Checking for updates )2 ");

	@OriginalMember(owner = "client!ce", name = "T", descriptor = "Lclient!tg;")
	public static Class81 aClass81_202 = Static120.method2057("Art");

	@OriginalMember(owner = "client!ce", name = "V", descriptor = "Lclient!tg;")
	public static Class81 aClass81_203 = aClass81_201;

	@OriginalMember(owner = "client!ce", name = "W", descriptor = "I")
	public static int anInt615 = -1;

	@OriginalMember(owner = "client!ce", name = "X", descriptor = "Lclient!tg;")
	public static Class81 aClass81_204 = Static120.method2057("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!ce", name = "Y", descriptor = "Lclient!tg;")
	public static Class81 aClass81_205 = aClass81_200;

	@OriginalMember(owner = "client!ce", name = "ab", descriptor = "Lclient!tg;")
	public static Class81 aClass81_206 = aClass81_200;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIII)V")
	public static void method527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static11.anInt651; local7++) {
			if (arg2 < Static175.anIntArray307[local7] + Static50.anIntArray98[local7] && Static175.anIntArray307[local7] < arg0 + arg2 && arg3 < Static171.anIntArray418[local7] + Static118.anIntArray280[local7] && Static171.anIntArray418[local7] < arg1 + arg3) {
				Static119.aBooleanArray14[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)V")
	public static void method528() {
		anIntArray35 = null;
		aClass81_201 = null;
		aClass81_202 = null;
		aClass81_200 = null;
		aClass81_204 = null;
		aClass81_203 = null;
		aClass81_205 = null;
		aClass81_206 = null;
	}
}
