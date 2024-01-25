import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static134 {

	@OriginalMember(owner = "client!gp", name = "u", descriptor = "F")
	public static float aFloat15;

	@OriginalMember(owner = "client!gp", name = "C", descriptor = "[I")
	public static int[] anIntArray208;

	@OriginalMember(owner = "client!gp", name = "j", descriptor = "Lclient!oe;")
	public static final Class181 aClass181_22 = new Class181();

	@OriginalMember(owner = "client!gp", name = "J", descriptor = "I")
	public static int anInt2688 = -1;

	@OriginalMember(owner = "client!gp", name = "Q", descriptor = "I")
	public static int anInt2694 = -1;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(III)V")
	public static void method2309(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static337.aClass61_5 == Static147.aClass61_4) {
			if (Static394.method5261(arg1, false, 1, -2, 1, 0, arg0, 0)) {
				return;
			}
			Static394.method5261(arg1, false, 1, -3, 1, 0, arg0, 0);
		} else if (Static394.method5261(arg1, false, 1, -3, 1, 0, arg0, 0)) {
			return;
		} else {
			Static394.method5261(arg1, false, 1, -2, 1, 0, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)V")
	public static void method2316() {
		Static92.method1683();
		Static397.method5304(Static38.aClass135_Sub1_1.aBoolean367);
		Static229.aClass66_1 = Static432.method5742(0, Static77.aClass180_1, Static155.aCanvas4, 22050);
		Static229.aClass66_1.method5629(Static306.aClass1_Sub19_Sub4_3);
		Static253.aClass66_2 = Static432.method5742(1, Static77.aClass180_1, Static155.aCanvas4, 2048);
		Static253.aClass66_2.method5629(Static59.aClass1_Sub19_Sub2_1);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!rr;B)V")
	public static void method2317(@OriginalArg(0) Class215 arg0) {
		Static390.aClass215_1 = arg0;
	}
}
