import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!hl", name = "m", descriptor = "Lclient!id;")
	public static Class99 aClass99_4;

	@OriginalMember(owner = "client!hl", name = "q", descriptor = "[I")
	public static final int[] anIntArray358 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method2527(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static263.aClass202_1);
		arg0.removeMouseMotionListener(Static263.aClass202_1);
		arg0.removeFocusListener(Static263.aClass202_1);
		Static296.anInt5941 = 0;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZII)V")
	public static void method2528(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		try {
			if (arg1 != 0 && arg0) {
				Static128.aClass89_3 = Static219.method3871(0, Static203.anInterface6_4, Static116.aClass21_4, Static269.aCanvas4, 0);
				Static128.aClass89_3.method5405(0);
				@Pc(27) Class208 local27 = Static353.method2012(Static139.aClass180_36, Static49.anInt1349);
				@Pc(36) Class94 local36 = Static128.aClass89_3.method5483(local27, Static358.method1303(Static312.aClass180_89, Static49.anInt1349));
				Static227.method5321(local36, Static35.aString79, true);
				Static128.aClass89_3.method5392();
				Static282.method4683();
			}
			Static128.aClass89_3 = Static219.method3871(Static206.anInt4115, Static203.anInterface6_4, Static116.aClass21_4, Static269.aCanvas4, arg1);
			if (Static128.aClass89_3.method5473()) {
				@Pc(60) Class7_Sub14 local60 = Static128.aClass89_3.method5389();
				Static128.aClass89_3.method5464(local60);
			}
		} catch (@Pc(65) Throwable local65) {
			if (arg1 != 0) {
				arg1 = 0;
				Static128.aClass89_3 = Static219.method3871(Static206.anInt4115, Static203.anInterface6_4, Static116.aClass21_4, Static269.aCanvas4, 0);
			}
		}
		Static329.anInt6220 = arg1;
		Static175.method3279();
		if (!Static128.aClass89_3.method5458()) {
			Static55.anInt1454 = 1;
		}
		Static128.aClass89_3.method5400(Static55.anInt1454);
		Static128.aClass89_3.method5420(0);
		Static91.aClass70_12 = Static128.aClass89_3.method5438();
		Static65.aClass70_5 = Static128.aClass89_3.method5438();
		@Pc(111) int local111 = (int) ((double) Static15.anInt287 * 34.46D);
		if (Static128.aClass89_3.method5476()) {
			local111 += 128;
		}
		Static128.aClass89_3.method5457(50, local111);
		Static128.aClass89_3.method5460(!Static342.aBoolean471);
		if (Static128.aClass89_3.method5430()) {
			Static290.method4752(Static324.aBoolean451);
		}
		Static69.aBoolean126 = !Static105.method5089();
		Static191.method3450(Static128.aClass89_3, Static325.anInt6173 >> 3, Static15.anInt287 >> 3);
		Static198.method3548();
		Static35.aBoolean77 = false;
	}
}
