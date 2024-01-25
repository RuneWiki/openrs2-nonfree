import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!hs", name = "g", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas7;

	@OriginalMember(owner = "client!hs", name = "m", descriptor = "[Lclient!eb;")
	public static Class85[] aClass85Array1;

	@OriginalMember(owner = "client!hs", name = "j", descriptor = "Lclient!fn;")
	public static final Class4_Sub17 aClass4_Sub17_1 = new Class4_Sub17(0, 0);

	@OriginalMember(owner = "client!hs", name = "k", descriptor = "[I")
	public static int[] anIntArray197 = new int[1];

	@OriginalMember(owner = "client!hs", name = "l", descriptor = "Lclient!kq;")
	public static final Class184 aClass184_6 = new Class184(5, 1);

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "(I)V")
	public static void method3281() {
		if (Static299.method4770(Static9.anInt758) || Static254.method4045(Static9.anInt758)) {
			Static404.method6134(Static534.anInt9775 >> 12, Static114.anInt2613 >> 12, 5000);
		} else {
			@Pc(20) int local20 = Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anIntArray206[0] >> 3;
			@Pc(27) int local27 = Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anIntArray207[0] >> 3;
			if (local20 >= 0 && local20 < Static338.anInt6508 >> 3 && local27 >= 0 && local27 < Static390.anInt7654 >> 3) {
				Static404.method6134(local20, local27, 5000);
			} else {
				Static404.method6134(Static338.anInt6508 >> 4, Static390.anInt7654 >> 4, 0);
			}
		}
		Static149.method2566();
		Static408.method6197();
		Static504.method7251();
		Static181.method2994();
	}
}
