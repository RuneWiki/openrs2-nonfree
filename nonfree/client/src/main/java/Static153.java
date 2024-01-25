import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!hn", name = "K", descriptor = "I")
	public static int anInt2913;

	@OriginalMember(owner = "client!hn", name = "A", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_90 = new Class186(102, 6);

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)V")
	public static void method2272() {
		if (Static73.anInt1749 == 10 || Static73.anInt1749 == 28) {
			Static34.method636(5000, Static254.anInt4614 >> 10, Static30.anInt696 >> 10);
		} else {
			@Pc(27) int local27 = Static375.aClass6_Sub2_Sub1_Sub1_3.anIntArray536[0] >> 3;
			@Pc(34) int local34 = Static375.aClass6_Sub2_Sub1_Sub1_3.anIntArray537[0] >> 3;
			if (local27 >= 0 && Static126.anInt2569 >> 3 > local27 && local34 >= 0 && local34 < Static190.anInt3697 >> 3) {
				Static34.method636(5000, local27, local34);
			} else {
				Static34.method636(0, Static126.anInt2569 >> 4, Static190.anInt3697 >> 4);
			}
		}
		Static446.method5730();
		Static48.method1020();
		Static204.method2941();
		Static353.method4953();
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZI)Z")
	public static boolean method2273(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static114.method1814(arg1, arg0) & Static267.method3633(arg0, arg1);
	}
}
