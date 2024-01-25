import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!le", name = "h", descriptor = "Lclient!mv;")
	public static Class229 aClass229_69;

	@OriginalMember(owner = "client!le", name = "o", descriptor = "Lclient!ew;")
	public static Class99 aClass99_5;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
	public static void method4350() {
		try {
			@Pc(14) int local14;
			if (Static25.anInt442 == 1) {
				local14 = Static84.aClass2_Sub3_Sub2_7.method2066();
				if (local14 > 0 && Static84.aClass2_Sub3_Sub2_7.method2050()) {
					local14 -= Static338.anInt5808;
					if (local14 < 0) {
						local14 = 0;
					}
					Static84.aClass2_Sub3_Sub2_7.method2059(local14);
					return;
				}
				Static84.aClass2_Sub3_Sub2_7.method2057();
				Static84.aClass2_Sub3_Sub2_7.method2068();
				if (Static467.aClass229_108 == null) {
					Static25.anInt442 = 0;
				} else {
					Static25.anInt442 = 2;
				}
				Static503.aClass2_Sub31_2 = null;
				Static185.aClass234_1 = null;
			}
			if (Static25.anInt442 == 3) {
				local14 = Static84.aClass2_Sub3_Sub2_7.method2066();
				if (Static268.anInt4384 > local14 && Static84.aClass2_Sub3_Sub2_7.method2050()) {
					local14 += Static410.anInt6683;
					if (Static268.anInt4384 < local14) {
						local14 = Static268.anInt4384;
					}
					Static84.aClass2_Sub3_Sub2_7.method2059(local14);
				} else {
					Static25.anInt442 = 0;
					Static410.anInt6683 = 0;
				}
			}
		} catch (@Pc(85) Exception local85) {
			local85.printStackTrace();
			Static84.aClass2_Sub3_Sub2_7.method2057();
			Static488.aClass2_Sub3_Sub2_5 = null;
			Static25.anInt442 = 0;
			Static467.aClass229_108 = null;
			Static503.aClass2_Sub31_2 = null;
			Static185.aClass234_1 = null;
		}
	}
}
