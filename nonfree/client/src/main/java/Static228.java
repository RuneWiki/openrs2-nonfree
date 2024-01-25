import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!im", name = "i", descriptor = "I")
	public static int anInt4656;

	@OriginalMember(owner = "client!im", name = "h", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_151 = new Class123(10, -1);

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IBI)Z")
	public static boolean method3729(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static310.method4645(arg1, arg0) | (arg1 & 0x70000) != 0 || Static230.method3739(arg0, arg1);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IC)Z")
	public static boolean method3730(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "([Ljava/lang/String;I)V")
	public static void method3731(@OriginalArg(0) String[] arg0) {
		if (arg0.length <= 1) {
			Static527.aString267 = Static527.aString267 + arg0[0];
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			if (arg0[local13].startsWith("pause")) {
				@Pc(23) int local23 = 5;
				try {
					local23 = Integer.parseInt(arg0[local13].substring(6));
				} catch (@Pc(32) Exception local32) {
				}
				Static196.method3426("Pausing for " + local23 + " seconds...");
				Static510.anInt8803 = local13 + 1;
				Static368.aStringArray30 = arg0;
				Static224.aLong106 = (long) (local23 * 1000) + Static96.method2000();
				return;
			}
			Static527.aString267 = arg0[local13];
			Static492.method6623(false);
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(B)[Lclient!hw;")
	public static Class134[] method3732() {
		return new Class134[] { Static300.aClass134_3, Static549.aClass134_4, Static24.aClass134_1 };
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "()V")
	public static void method3734() {
		Static144.method2749(Static590.anInt10277);
	}
}
