import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "I")
	public static int anInt4460;

	@OriginalMember(owner = "client!jba", name = "l", descriptor = "I")
	public static int anInt4454 = 0;

	@OriginalMember(owner = "client!jba", name = "e", descriptor = "I")
	public static int anInt4456 = -1;

	@OriginalMember(owner = "client!jba", name = "g", descriptor = "Lclient!pia;")
	public static final Class291 aClass291_3 = new Class291();

	@OriginalMember(owner = "client!jba", name = "i", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_86 = new Class225(45, 6);

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "I")
	public static int anInt4461 = 0;

	@OriginalMember(owner = "client!jba", name = "k", descriptor = "Lclient!dka;")
	public static final Class85 aClass85_33 = new Class85(8);

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(BB)V")
	public static void method4064(@OriginalArg(0) byte arg0) {
		if (Static481.aByteArrayArrayArray17 == null) {
			Static481.aByteArrayArrayArray17 = new byte[4][Static426.anInt6942][Static280.anInt6752];
		}
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			for (@Pc(27) int local27 = 0; local27 < Static426.anInt6942; local27++) {
				for (@Pc(31) int local31 = 0; local31 < Static280.anInt6752; local31++) {
					Static481.aByteArrayArrayArray17[local23][local27][local31] = arg0;
				}
			}
		}
	}
}
