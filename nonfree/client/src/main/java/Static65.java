import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!cga", name = "P", descriptor = "Lclient!ii;")
	public static Class161 aClass161_1;

	@OriginalMember(owner = "client!cga", name = "Q", descriptor = "Lclient!ta;")
	public static Class91 aClass91_4;

	@OriginalMember(owner = "client!cga", name = "M", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_14 = new Class61(51, 3);

	@OriginalMember(owner = "client!cga", name = "O", descriptor = "Lclient!db;")
	public static final Class64 aClass64_67 = new Class64(11, 6);

	@OriginalMember(owner = "client!cga", name = "f", descriptor = "(I)V")
	public static void method1093() {
		Static102.anInt2531 = 0;
		@Pc(18) int local18 = (Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8934 >> 9) + Static373.anInt6695;
		@Pc(25) int local25 = (Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8929 >> 9) + Static6.anInt97;
		if (local18 >= 3053 && local18 <= 3156 && local25 >= 3056 && local25 <= 3136) {
			Static102.anInt2531 = 1;
		}
		if (local18 >= 3072 && local18 <= 3118 && local25 >= 9492 && local25 <= 9535) {
			Static102.anInt2531 = 1;
		}
		if (Static102.anInt2531 == 1 && local18 >= 3139 && local18 <= 3199 && local25 >= 3008 && local25 <= 3062) {
			Static102.anInt2531 = 0;
		}
	}
}
