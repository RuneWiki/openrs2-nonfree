import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
	public static int anInt6153 = 0;

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "[Lclient!vb;")
	public static final Class6_Sub49[] aClass6_Sub49Array1 = new Class6_Sub49[1024];

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
	public static void method4988() {
		Static73.aClass234_4.method5463();
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V")
	public static void method4989() {
		@Pc(13) Class6_Sub41 local13 = (Class6_Sub41) Static43.aClass298_22.method6809();
		@Pc(21) boolean local21 = Static165.aClass97_8 != null || Static437.anInt7773 > 0;
		if (local21) {
			Static475.anInt8361 = 1;
		}
		if (Static9.aBoolean9 && Static184.aClass262_1.method6381(81) && Static384.anInt7048 > 2) {
			if (local21) {
				Static364.aClass6_Sub26_2 = (Class6_Sub26) Static408.aClass298_154.aClass6_246.aClass6_283.aClass6_283;
			} else {
				Static428.method6091(local13.method6480(), local13.method6487(), (Class6_Sub26) Static408.aClass298_154.aClass6_246.aClass6_283.aClass6_283);
			}
		} else if (local21) {
			Static364.aClass6_Sub26_2 = (Class6_Sub26) Static408.aClass298_154.aClass6_246.aClass6_283;
		} else {
			Static428.method6091(local13.method6480(), local13.method6487(), (Class6_Sub26) Static408.aClass298_154.aClass6_246.aClass6_283);
		}
	}
}
