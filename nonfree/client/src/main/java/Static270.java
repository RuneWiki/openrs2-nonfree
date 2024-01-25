import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static270 {

	@OriginalMember(owner = "client!ju", name = "k", descriptor = "I")
	public static int anInt4851;

	@OriginalMember(owner = "client!ju", name = "n", descriptor = "I")
	public static int anInt4854;

	@OriginalMember(owner = "client!ju", name = "t", descriptor = "Lclient!wk;")
	public static final Class376 aClass376_10 = new Class376(11, 7);

	@OriginalMember(owner = "client!ju", name = "B", descriptor = "I")
	public static int anInt4865 = 0;

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(III)V")
	public static void method4337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static150.anInt2604 == 1) {
			Static557.method8108(arg1, arg0, Static35.aClass5_Sub5_Sub15_2);
		} else if (Static150.anInt2604 == 2) {
			if (Static428.aBoolean526) {
				Static208.method3587(arg1 + Static88.method1487(), arg0 + Static584.method8436());
			} else {
				Static208.method3587(arg1, arg0);
			}
		}
		Static150.anInt2604 = 0;
		Static35.aClass5_Sub5_Sub15_2 = null;
	}
}
