import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
	public static int anInt5659;

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
	public static int anInt5658 = 0;

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_215 = new Class137(61, 8);

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
	public static void method4405() {
		Static369.aClass250ArrayArray5 = new Class250[Static142.aClass113_47.method2272()][];
		Static11.aClass250ArrayArray1 = new Class250[Static142.aClass113_47.method2272()][];
		Static332.aBooleanArray26 = new boolean[Static142.aClass113_47.method2272()];
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
	public static void method4406() {
		if (Static98.anInt1721 == 10 || Static98.anInt1721 == 28) {
			Static305.method3976(Static278.anInt4391 >> 10, Static8.anInt7337 >> 10, 5000);
		} else {
			@Pc(29) int local29 = Static239.aClass20_Sub3_Sub3_Sub1_1.anIntArray370[0] >> 3;
			@Pc(36) int local36 = Static239.aClass20_Sub3_Sub3_Sub1_1.anIntArray369[0] >> 3;
			if (local29 >= 0 && Static425.anInt6922 >> 3 > local29 && local36 >= 0 && Static251.anInt4072 >> 3 > local36) {
				Static305.method3976(local29, local36, 5000);
			} else {
				Static305.method3976(Static425.anInt6922 >> 4, Static251.anInt4072 >> 4, 0);
			}
		}
		Static283.method3694();
		Static284.method3698();
		Static82.method1242();
		Static102.method1464();
	}
}
