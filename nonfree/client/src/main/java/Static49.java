import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "Lclient!mv;")
	public static Class229 aClass229_31;

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "[Lclient!gq;")
	public static Class128[] aClass128Array2;

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "Lclient!ri;")
	public static final Class2_Sub41 aClass2_Sub41_2 = new Class2_Sub41(0, 0);

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V")
	public static void method2108() {
		if (!Static415.aBoolean102) {
			return;
		}
		while (true) {
			while (Static28.anInt486 < Static495.aClass86_Sub1Array2.length) {
				@Pc(25) Class86_Sub1 local25 = Static495.aClass86_Sub1Array2[Static28.anInt486];
				if (local25 != null && local25.anInt1988 == -1) {
					if (Static348.aClass2_Sub8_1 == null) {
						Static348.aClass2_Sub8_1 = Static330.aClass209_2.method4381(local25.aString24);
					}
					@Pc(49) int local49 = Static348.aClass2_Sub8_1.anInt991;
					if (local49 == -1) {
						return;
					}
					Static348.aClass2_Sub8_1 = null;
					local25.anInt1988 = local49;
					Static28.anInt486++;
				} else {
					Static28.anInt486++;
				}
			}
			return;
		}
	}
}
