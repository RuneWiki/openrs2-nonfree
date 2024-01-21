import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!rb", name = "R", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1108 = Static120.method2057("sl_button");

	@OriginalMember(owner = "client!rb", name = "S", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1109 = Static120.method2057("");

	@OriginalMember(owner = "client!rb", name = "W", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1110 = Static120.method2057(")4l");

	@OriginalMember(owner = "client!rb", name = "X", descriptor = "I")
	public static int anInt3104 = 0;

	@OriginalMember(owner = "client!rb", name = "Y", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1111 = Static120.method2057("au");

	@OriginalMember(owner = "client!rb", name = "bb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1112 = Static120.method2057("Benutzername: ");

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)V")
	public static void method2391() {
		aClass81_1112 = null;
		aClass81_1108 = null;
		aClass81_1109 = null;
		aClass81_1111 = null;
		aClass81_1110 = null;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(IB)V")
	public static void method2392(@OriginalArg(0) int arg0) {
		if (Static112.anInt2525 == arg0) {
			return;
		}
		if (Static112.anInt2525 == 0) {
			Static113.method1996();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static121.anInt2702 = 0;
			Static38.anInt1014 = 0;
			Static112.anInt2523 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static113.aClass41_2 != null) {
			Static113.aClass41_2.method1340();
			Static113.aClass41_2 = null;
		}
		if (Static112.anInt2525 == 25) {
			Static108.anInt2415 = 0;
			Static104.anInt2270 = 0;
			Static126.anInt2770 = 1;
			Static120.anInt2671 = 1;
			Static172.anInt3995 = 0;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static29.method618(Static104.aClass82_Sub1_11, Static114.aCanvas3, Static111.aClass82_Sub1_12);
		} else {
			Static67.method1205();
		}
		Static112.anInt2525 = arg0;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IILjava/awt/Component;I)Lclient!nf;")
	public static Class34 method2393(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class34_Sub1");
			@Pc(15) Class34 local15 = (Class34) local6.getDeclaredConstructor().newInstance();
			local15.method1632(arg0, arg1, arg2);
			return local15;
		} catch (@Pc(26) Throwable local26) {
			@Pc(30) Class34_Sub2 local30 = new Class34_Sub2();
			local30.method1632(arg0, arg1, arg2);
			return local30;
		}
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(II)Z")
	public static boolean method2394(@OriginalArg(0) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}
}
