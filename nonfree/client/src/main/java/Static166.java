import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!i", name = "a", descriptor = "Lclient!fb;")
	public static Class72 aClass72_1;

	@OriginalMember(owner = "client!i", name = "b", descriptor = "I")
	public static int anInt3528 = -1;

	@OriginalMember(owner = "client!i", name = "d", descriptor = "S")
	public static short aShort102 = 1;

	@OriginalMember(owner = "client!i", name = "g", descriptor = "Lclient!gp;")
	public static final Class87 aClass87_13 = new Class87(11, 4);

	@OriginalMember(owner = "client!i", name = "h", descriptor = "I")
	public static int anInt3532 = 1;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BC)Z")
	public static boolean method2897(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ZI)V")
	public static void method2898(@OriginalArg(1) int arg0) {
		if (!Static123.aClass21_Sub1_1.aBoolean77) {
			arg0 = -1;
		}
		if (arg0 == Static281.anInt5170) {
			return;
		}
		if (arg0 != -1) {
			@Pc(29) Class60 local29 = Static199.aClass112_2.method3003(arg0);
			@Pc(33) Class166 local33 = local29.method1415();
			if (local33 == null) {
				arg0 = -1;
			} else {
				Static295.aClass103_5.method2837(Static351.aCanvas6, new Point(local29.anInt1724, local29.anInt1731), local33.method3986(), local33.method3985(), local33.method3982());
				Static281.anInt5170 = arg0;
			}
		}
		if (arg0 == -1 && Static281.anInt5170 != -1) {
			Static295.aClass103_5.method2837(Static351.aCanvas6, new Point(), null, -1, -1);
			Static281.anInt5170 = -1;
		}
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(I)Z")
	public static boolean method2900() {
		if (Static260.aBoolean490) {
			try {
				Static462.method4867(Static295.aClass103_5.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(20) Throwable local20) {
			}
		}
		return false;
	}
}
