import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
	public static int anInt6445;

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "Lclient!hq;")
	public static Class116 aClass116_1;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
	public static void method5129() {
		if (Static307.anInt5537 == 2) {
			Static170.anInt3068 = 96;
			return;
		}
		try {
			@Pc(22) Method local22 = Runtime.class.getMethod("maxMemory");
			if (local22 != null) {
				try {
					@Pc(26) Runtime local26 = Runtime.getRuntime();
					@Pc(32) Long local32 = (Long) local22.invoke(local26, (Object[]) null);
					Static170.anInt3068 = (int) (local32 / 1048576L) + 1;
				} catch (@Pc(42) Throwable local42) {
				}
			}
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V")
	public static void method5130() {
		Static80.aBoolean428 = true;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
	public static void method5131() {
		if (Static42.aBoolean410) {
			return;
		}
		Static94.aBoolean395 = true;
		Static42.aBoolean410 = true;
		if (Static434.aClass165_Sub1_1.aBoolean290) {
			Static234.aFloat30 = (int) Static234.aFloat30 + 47 & 0xFFFFFFF0;
		} else {
			Static104.aFloat13 += (12.0F - Static104.aFloat13) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I")
	public static int method5132(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}
}
