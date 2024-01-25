import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!mq", name = "m", descriptor = "Lclient!ok;")
	public static Class18 aClass18_3;

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "Z")
	public static boolean aBoolean333 = false;

	@OriginalMember(owner = "client!mq", name = "k", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_93 = new Class85("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

	@OriginalMember(owner = "client!mq", name = "l", descriptor = "Lclient!vg;")
	public static Class201 aClass201_8 = null;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Z)I")
	public static int method3752() {
		return 2;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)V")
	public static void method3754(@OriginalArg(0) int arg0) {
		if (!Static351.aBoolean584) {
			arg0 = -1;
		}
		if (Static70.anInt1368 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(23) Class145 local23 = Static245.method4389(arg0);
			@Pc(27) Class100 local27 = local23.method4019();
			if (local27 == null) {
				arg0 = -1;
			} else {
				Static182.aClass139_5.method3872(Static102.aCanvas3, local27.method2682(), local27.method2671(), new Point(local23.anInt4346, local23.anInt4352), local27.method2684());
				Static70.anInt1368 = arg0;
			}
		}
		if (arg0 == -1 && Static70.anInt1368 != -1) {
			Static182.aClass139_5.method3872(Static102.aCanvas3, -1, -1, new Point(), null);
			Static70.anInt1368 = -1;
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZD)V")
	public static void method3756(@OriginalArg(1) double arg0) {
		if (Static110.aDouble1 == arg0) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			@Pc(23) int local23 = (int) (Math.pow((double) local11 / 255.0D, arg0) * 255.0D);
			Static43.anIntArray643[local11] = local23 > 255 ? 255 : local23;
		}
		Static110.aDouble1 = arg0;
	}
}
