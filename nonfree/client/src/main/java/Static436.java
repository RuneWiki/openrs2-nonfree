import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
	public static int anInt7722 = -1;

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
	public static int anInt7724 = -1;

	@OriginalMember(owner = "client!wc", name = "v", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_407 = new Class123(58, -2);

	@OriginalMember(owner = "client!wc", name = "w", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_408 = new Class123(86, 8);

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(DB)V")
	public static void method6323(@OriginalArg(0) double arg0) {
		if (Static427.aDouble9 == arg0) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			@Pc(23) int local23 = (int) (Math.pow((double) local11 / 255.0D, arg0) * 255.0D);
			Static234.anIntArray329[local11] = local23 > 255 ? 255 : local23;
		}
		Static427.aDouble9 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ps;BILjava/awt/Canvas;)Lclient!eq;")
	public static Class66 method6325(@OriginalArg(0) Interface8 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2) {
		return new Class66_Sub1(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZ)V")
	public static void method6326(@OriginalArg(0) int arg0) {
		Static406.method6003();
		Static132.method2362();
		Static160.method2665(arg0, true);
		Static175.method2902(Static126.aClass66_5, Static350.aClass100_69, Static410.aClass100_89);
		Static281.method4261(Static126.aClass66_5, Static350.aClass100_69);
		Static35.method859(Static15.aClass87Array1);
		Static201.method3979();
		Static206.method3172();
		if (Static217.anInt3941 == 10) {
			Static192.method3048(false);
		} else if (Static217.anInt3941 == 30) {
			Static100.method1818(25);
			return;
		} else if (Static217.anInt3941 == 5) {
			Static36.method910(Static350.aClass100_69, Static126.aClass66_5);
			return;
		}
	}
}
