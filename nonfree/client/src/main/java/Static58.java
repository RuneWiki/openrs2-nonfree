import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!c", name = "l", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_14 = new Class200(53, 4);

	@OriginalMember(owner = "client!c", name = "o", descriptor = "I")
	public static int anInt1583 = 0;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(II)V")
	public static void method1593(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub4_Sub12 local8 = Static556.method8018(8, arg0);
		local8.method3607();
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
	public static void method1595() {
		Static234.method3912();
		@Pc(18) int local18 = Static262.aClass3_Sub27_12.aClass21_Sub28_1.method8504();
		if (local18 == 2) {
			Static108.method2179(Static109.anInt2357, Static330.anInt6165, Static323.aClass5_9);
		} else if (local18 == 3) {
			Static408.method6492(Static109.anInt2357, Static575.anInt9465, Static323.aClass5_9, Static25.anInt7711, Static330.anInt6165);
		}
		if (Static262.aClass3_Sub27_12.aClass21_Sub28_1.method8506()) {
			Static312.method5142(Static364.aCanvas13);
		}
		if (Static323.aClass5_9 != null) {
			Static630.method8654();
		}
		Static279.aBoolean329 = Static262.aClass3_Sub27_12.aClass21_Sub28_1.method8504() != 0;
		Static219.aBoolean285 = Static262.aClass3_Sub27_12.aClass21_Sub28_1.method8506();
	}
}
