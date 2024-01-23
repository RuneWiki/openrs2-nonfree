import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "[I")
	public static int[] anIntArray145 = new int[32];

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "Lclient!qc;")
	public static Class135 aClass135_4 = new Class135(4);

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "Lclient!qc;")
	public static Class135 aClass135_5 = new Class135(5);

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "[Z")
	public static boolean[] aBooleanArray16 = new boolean[5];

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
	public static int anInt1526 = -1;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZLjava/lang/String;C)I")
	public static int method1265(@OriginalArg(1) String arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			if (arg1 == arg0.charAt(local12)) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)Z")
	public static boolean method1267() {
		@Pc(6) Class94 local6 = Static57.aClass94_1;
		synchronized (Static57.aClass94_1) {
			if (Static61.anInt1302 == Static250.anInt4943) {
				return false;
			} else {
				Static49.anInt1134 = Static194.anIntArray359[Static61.anInt1302];
				Static125.aChar2 = Static194.aCharArray5[Static61.anInt1302];
				Static61.anInt1302 = Static61.anInt1302 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V")
	public static void method1268() {
		Static127.aClass135_13.method3317();
	}
}
