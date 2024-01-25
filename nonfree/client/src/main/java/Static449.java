import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static449 {

	@OriginalMember(owner = "client!of", name = "v", descriptor = "[[I")
	public static int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!of", name = "n", descriptor = "[Lclient!mv;")
	public static Class252[] aClass252Array4;

	@OriginalMember(owner = "client!of", name = "s", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_105 = new Class349(35, -1);

	@OriginalMember(owner = "client!of", name = "o", descriptor = "Z")
	public static boolean aBoolean616 = false;

	@OriginalMember(owner = "client!of", name = "l", descriptor = "I")
	public static int anInt7290 = 0;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(II)V")
	public static void method6569(@OriginalArg(0) int arg0) {
		for (@Pc(7) Class2 local7 = Static345.aClass218_24.method5092(); local7 != null; local7 = Static345.aClass218_24.method5096()) {
			if ((local7.aLong352 >> 48 & 0xFFFFL) == (long) arg0) {
				local7.method9872();
			}
		}
	}
}
