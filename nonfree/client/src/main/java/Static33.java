import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bo", name = "N", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_16 = new Class57("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!bo", name = "P", descriptor = "[I")
	public static final int[] anIntArray56 = new int[25];

	@OriginalMember(owner = "client!bo", name = "Q", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_10 = new Class244(58, 8);

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V")
	public static void method523() {
		try {
			if (Static175.anInt3065 == 1) {
				@Pc(12) int local12 = Static69.aClass3_Sub8_Sub4_1.method2159();
				if (local12 > 0 && Static69.aClass3_Sub8_Sub4_1.method2134()) {
					local12 -= Static120.anInt2268;
					if (local12 < 0) {
						local12 = 0;
					}
					Static69.aClass3_Sub8_Sub4_1.method2157(local12);
					return;
				}
				Static69.aClass3_Sub8_Sub4_1.method2147();
				Static69.aClass3_Sub8_Sub4_1.method2160();
				if (Static48.aClass20_16 == null) {
					Static175.anInt3065 = 0;
				} else {
					Static175.anInt3065 = 2;
				}
				Static55.aClass231_1 = null;
				Static244.aClass3_Sub35_2 = null;
			}
		} catch (@Pc(61) Exception local61) {
			local61.printStackTrace();
			Static69.aClass3_Sub8_Sub4_1.method2147();
			Static55.aClass231_1 = null;
			Static244.aClass3_Sub35_2 = null;
			Static175.anInt3065 = 0;
			Static48.aClass20_16 = null;
		}
	}
}
