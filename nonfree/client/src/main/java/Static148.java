import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!hk", name = "z", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!hk", name = "x", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_8 = new Class214(0, 15);

	@OriginalMember(owner = "client!hk", name = "y", descriptor = "J")
	public static long aLong93 = 0L;

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V")
	public static void method2441() {
		if (Static366.aClass18_2 != null) {
			Static366.aClass18_2.method5634();
		}
		if (Static151.aClass18_1 != null) {
			Static151.aClass18_1.method5634();
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "([BIII)Ljava/lang/String;")
	public static String method2444(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg1];
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg1; local17++) {
			@Pc(28) int local28 = arg0[arg2 + local17] & 0xFF;
			if (local28 != 0) {
				if (local28 >= 128 && local28 < 160) {
					@Pc(47) char local47 = Static407.aCharArray6[local28 - 128];
					if (local47 == '\u0000') {
						local47 = '?';
					}
					local28 = local47;
				}
				local8[local10++] = (char) local28;
			}
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BC)Z")
	public static boolean method2445(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
