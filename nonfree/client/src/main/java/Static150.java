import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!fo", name = "t", descriptor = "Lclient!jw;")
	public static Class2_Sub27 aClass2_Sub27_1;

	@OriginalMember(owner = "client!fo", name = "u", descriptor = "I")
	public static int anInt2432;

	@OriginalMember(owner = "client!fo", name = "r", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_38 = new Class349(0, 0);

	@OriginalMember(owner = "client!fo", name = "s", descriptor = "Lclient!cq;")
	public static final Class63 aClass63_15 = new Class63(6, 0, 4, 2);

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V")
	public static void method2077() {
		if (Static257.aClass2_Sub35_Sub1_1.method6053(Static226.anInt3318) || Static402.anInt6620 == Static487.anInt7738) {
			Static577.method7486(Static417.aClass162_17);
			if (Static241.anInt3998 != Static402.anInt6620) {
				Static498.method6450();
			}
		} else {
			Static412.method5556(Static79.anInt7835, 11, Static434.anInt6974, false);
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZBI)Ljava/lang/String;")
	public static String method2085(@OriginalArg(2) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static591.method7691(arg0);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "([BI)V")
	public static void method2087(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class2_Sub7 local10 = new Class2_Sub7(arg0);
		while (true) {
			@Pc(14) int local14 = local10.method4464();
			if (local14 == 0) {
				return;
			}
			if (local14 == 2) {
				Static33.anInt657 = local10.method4518();
			}
		}
	}
}
