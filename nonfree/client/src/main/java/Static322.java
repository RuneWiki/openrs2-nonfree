import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!mf", name = "jc", descriptor = "Lclient!oa;")
	public static Class15 aClass15_10;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)V")
	public static void method5571(@OriginalArg(0) int arg0) {
		Static170.anInt9055 = arg0;
		Static402.aClass211_65.method5535();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZII)B")
	public static byte method5576(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)V")
	public static void method5584() {
		if (Static546.aClass15_16 == null) {
			return;
		}
		Static166.aClass134_4.method3232();
		Static442.method6915();
		Static23.method7146();
		Static134.method6550();
		Static513.method356();
		Static23.method7140();
		if (Static429.aClass140_1 != null) {
			Static429.aClass140_1.method3297();
		}
		Static76.method1769();
		Static247.method4472();
		Static198.method3346();
		Static1.method124();
		Static348.method2213(false);
		for (@Pc(43) int local43 = 0; local43 < 2048; local43++) {
			@Pc(48) Class2_Sub2_Sub1_Sub1 local48 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local43];
			if (local48 != null) {
				local48.aClass3_Sub25_3 = null;
				for (@Pc(55) int local55 = 0; local55 < local48.aClass21Array3.length; local55++) {
					local48.aClass21Array3[local55] = null;
				}
			}
		}
		for (@Pc(75) int local75 = 0; local75 < Static17.anInt6046; local75++) {
			@Pc(81) Class2_Sub2_Sub1_Sub2 local81 = Static60.aClass3_Sub46Array1[local75].aClass2_Sub2_Sub1_Sub2_2;
			if (local81 != null) {
				for (@Pc(85) int local85 = 0; local85 < local81.aClass21Array3.length; local85++) {
					local81.aClass21Array3[local85] = null;
				}
			}
		}
		Static574.aClass255_9 = null;
		Static202.aClass255_6 = null;
		Static546.aClass15_16.method5337();
		Static546.aClass15_16 = null;
	}
}
