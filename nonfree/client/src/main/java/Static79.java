import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!co", name = "O", descriptor = "D")
	public static double aDouble2;

	@OriginalMember(owner = "client!co", name = "W", descriptor = "Lclient!uh;")
	public static final Class341 aClass341_26 = new Class341();

	@OriginalMember(owner = "client!co", name = "fb", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_22 = new Class94(62, 3);

	@OriginalMember(owner = "client!co", name = "d", descriptor = "(B)I")
	public static int method2323() {
		if (Static65.aBoolean754) {
			return 6;
		} else if (Static74.aClass2_Sub6_Sub3_1 == null) {
			return 0;
		} else {
			@Pc(19) int local19 = Static74.aClass2_Sub6_Sub3_1.anInt2631;
			if (Static543.method8145(local19)) {
				return 1;
			} else if (Static396.method6492(local19)) {
				return 2;
			} else if (Static613.method8966(local19)) {
				return 3;
			} else if (Static299.method5338(local19)) {
				return 4;
			} else {
				return 5;
			}
		}
	}
}
