import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static452 {

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "[Lclient!ac;")
	public static Class5[] aClass5Array12;

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "D")
	public static double aDouble50;

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "J")
	public static long aLong208;

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
	public static int anInt8205;

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "Lclient!kha;")
	public static Class181 aClass181_87;

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_104 = new Class218(116, 1);

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
	public static int anInt8206 = 0;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLclient!aca;)I")
	public static int method6823(@OriginalArg(1) Class6 arg0) {
		if (Static312.aClass6_13 == arg0) {
			return 9216;
		} else if (arg0 == Static48.aClass6_3) {
			return 34065;
		} else if (arg0 == Static149.aClass6_7) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
