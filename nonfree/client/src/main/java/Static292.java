import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(Z)V")
	public static void method4055() {
		@Pc(12) byte[] local12;
		if (Static26.anObject2 == null) {
			@Pc(5) Class112_Sub1_Sub2 local5 = new Class112_Sub1_Sub2();
			local12 = local5.method7426();
			Static26.anObject2 = Static508.method6908(local12);
		}
		if (Static25.anObject1 == null) {
			@Pc(27) Class112_Sub2_Sub2 local27 = new Class112_Sub2_Sub2();
			local12 = local27.method8635();
			Static25.anObject1 = Static508.method6908(local12);
		}
	}
}
