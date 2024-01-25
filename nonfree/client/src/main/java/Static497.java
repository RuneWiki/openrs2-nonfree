import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static497 {

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "Lclient!em;")
	public static final Class83 aClass83_110 = new Class83(93, 10);

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIB)V")
	public static void method4591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static2.anInt71 != 0) {
			if (arg0 >= 0) {
				Static527.anIntArray557[arg0] = arg1;
			} else {
				for (@Pc(31) int local31 = 0; local31 < 16; local31++) {
					Static527.anIntArray557[local31] = arg1;
				}
			}
		}
		Static54.aClass1_Sub6_Sub2_2.method3522(arg0, arg1);
	}
}
