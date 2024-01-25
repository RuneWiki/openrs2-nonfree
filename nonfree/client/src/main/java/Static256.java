import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "F")
	public static float aFloat48;

	@OriginalMember(owner = "client!ms", name = "e", descriptor = "Lclient!ef;")
	public static final Class61 aClass61_7 = new Class61(9, 0, 4, 1);

	@OriginalMember(owner = "client!ms", name = "f", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_73 = new Class217(4, 3);

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Z)V")
	public static void method3777() {
		for (@Pc(15) Class3_Sub17 local15 = (Class3_Sub17) Static301.aClass243_16.method5208(); local15 != null; local15 = (Class3_Sub17) Static301.aClass243_16.method5203()) {
			if (local15.anInt2911 == -1) {
				local15.anInt2916 = 0;
				if (local15.anInt2917 >= 0 && local15.anInt2910 >= 0 && Static40.anInt1089 > local15.anInt2917 && local15.anInt2910 < Static44.anInt7276) {
					Static443.method3578(local15);
				}
			} else {
				local15.method5977();
			}
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
	public static void method3778() {
		if (Static254.anInt4793 == 5) {
			Static254.anInt4793 = 6;
		}
	}
}
