import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "[S")
	public static short[] aShortArray36;

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_28 = new Class241(41, 7);

	@OriginalMember(owner = "client!dia", name = "c", descriptor = "I")
	public static int anInt2062 = 100;

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(I)V")
	public static void method1984() {
		for (@Pc(7) int local7 = 0; local7 < Static37.anInt497; local7++) {
			@Pc(25) int local25 = Static667.method8846(Static37.anInt497, local7 + Static188.anInt3787) * Static585.anInt9330;
			for (@Pc(27) int local27 = 0; local27 < Static585.anInt9330; local27++) {
				@Pc(39) int local39 = Static667.method8846(Static585.anInt9330, local27 + Static6.anInt60) + local25;
				if (Static273.anIntArray276[local39] == Static20.anInt271) {
					Static25.anInterface24Array1[local39].method8828(0, 0, Static662.anInt10244, Static682.anInt10442, local27 * Static662.anInt10244, Static682.anInt10442 * local7);
				}
			}
		}
	}
}
