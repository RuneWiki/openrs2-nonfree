import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!qa", name = "cb", descriptor = "I")
	public static int anInt1180 = -1;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
	public static void method1065() {
		Static49.anInt1353 = 1;
		Static518.anInt9045 = -1;
		if (Static303.aString67 == null) {
			Static554.method7903(35);
		} else {
			@Pc(20) Class6_Sub26 local20 = new Class6_Sub26(Static115.method2331(Static375.method5954(Static303.aString67)));
			@Pc(24) long local24 = local20.method4935();
			Static196.aLong84 = local20.method4935();
			Static482.method7331("", true, Static141.method2654(local24));
		}
	}
}
