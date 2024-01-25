import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "J")
	public static long aLong214;

	@OriginalMember(owner = "client!qfa", name = "f", descriptor = "I")
	public static final int anInt8305 = 2;

	@OriginalMember(owner = "client!qfa", name = "h", descriptor = "[I")
	public static final int[] anIntArray445 = new int[4096];

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Ljava/lang/String;CB)I")
	public static int method6860(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			if (arg1 == arg0.charAt(local12)) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ILclient!fh;)Ljava/lang/String;")
	public static String method6861(@OriginalArg(1) Class8_Sub5_Sub7 arg0) {
		if (arg0.aString43 == null || arg0.aString43.length() == 0) {
			return arg0.aString42 == null || arg0.aString42.length() <= 0 ? arg0.aString41 : arg0.aString41 + Static121.aClass84_32.method2710(Static372.anInt7083) + arg0.aString42;
		} else if (arg0.aString42 == null || arg0.aString42.length() <= 0) {
			return arg0.aString41 + Static121.aClass84_32.method2710(Static372.anInt7083) + arg0.aString43;
		} else {
			return arg0.aString41 + Static121.aClass84_32.method2710(Static372.anInt7083) + arg0.aString42 + Static121.aClass84_32.method2710(Static372.anInt7083) + arg0.aString43;
		}
	}
}
