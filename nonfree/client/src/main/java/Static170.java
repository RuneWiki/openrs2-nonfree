import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!ko", name = "w", descriptor = "Lclient!mo;")
	public static Class143 aClass143_70;

	@OriginalMember(owner = "client!ko", name = "K", descriptor = "Lclient!mp;")
	public static Class30 aClass30_6;

	@OriginalMember(owner = "client!ko", name = "s", descriptor = "I")
	public static int anInt3527 = 0;

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)Lclient!ia;")
	public static Class89 method3321() {
		try {
			return (Class89) Class.forName("Class89_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!mo;BLclient!mo;Lclient!mo;Lclient!mo;)V")
	public static void method3322(@OriginalArg(0) Class143 arg0, @OriginalArg(2) Class143 arg1, @OriginalArg(3) Class143 arg2, @OriginalArg(4) Class143 arg3) {
		Static297.aClass143_103 = arg2;
		Static54.aClass143_39 = arg0;
		Static74.aClass143_99 = arg3;
		Static49.aClass143_36 = arg1;
		Static182.aClass146ArrayArray1 = new Class146[Static74.aClass143_99.method3747()][];
		Static90.aBooleanArray6 = new boolean[Static74.aClass143_99.method3747()];
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)V")
	public static void method3330() {
		if (Static210.aBoolean276) {
			return;
		}
		Static210.aBoolean276 = true;
		if (Static61.aBoolean94) {
			Static94.aFloat42 = (int) Static94.aFloat42 + 191 & 0xFFFFFF80;
		} else {
			Static214.aFloat83 += (24.0F - Static214.aFloat83) / 2.0F;
		}
		Static72.aBoolean114 = true;
	}
}
