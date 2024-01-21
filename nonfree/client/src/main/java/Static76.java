import java.awt.Component;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!na", name = "b", descriptor = "Ljava/awt/Image;")
	public static Image anImage3;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "I")
	public static int anInt1935 = 0;

	@OriginalMember(owner = "client!na", name = "d", descriptor = "Lclient!v;")
	public static Class76 aClass76_830 = Static134.method2017("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!na", name = "e", descriptor = "Lclient!v;")
	public static Class76 aClass76_831 = Static134.method2017(")4lang)4de");

	@OriginalMember(owner = "client!na", name = "z", descriptor = "Z")
	public static boolean aBoolean119 = false;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILjava/awt/Component;ZI)Lclient!vd;")
	public static Class43 method1378(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class43_Sub2");
			@Pc(10) Class43 local10 = (Class43) local6.getDeclaredConstructor().newInstance();
			local10.method1904(arg0, arg2, arg1);
			return local10;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class43_Sub1 local28 = new Class43_Sub1();
			local28.method1904(arg0, arg2, arg1);
			return local28;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZJ)V")
	public static void method1382(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(12) InterruptedException local12) {
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZLclient!v;ILclient!v;ILclient!la;I)V")
	public static void method1385(@OriginalArg(1) Class76 arg0, @OriginalArg(3) Class76 arg1, @OriginalArg(5) Class17 arg2) {
		@Pc(14) int local14 = arg2.method299(arg1);
		@Pc(20) int local20 = arg2.method298(arg0, local14);
		Static28.method379(local20, local14, arg2, 255);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!dd;I)V")
	public static void method1389(@OriginalArg(0) Class4_Sub8 arg0) {
		@Pc(6) int local6 = arg0.anInt458;
		if (local6 == 324) {
			if (Static56.anInt1472 == -1) {
				Static35.anInt981 = arg0.anInt485;
				Static56.anInt1472 = arg0.anInt511;
			}
			if (Static87.aClass26_4.aBoolean57) {
				arg0.anInt511 = Static56.anInt1472;
			} else {
				arg0.anInt511 = Static35.anInt981;
			}
		} else if (local6 == 325) {
			if (Static56.anInt1472 == -1) {
				Static56.anInt1472 = arg0.anInt511;
				Static35.anInt981 = arg0.anInt485;
			}
			if (Static87.aClass26_4.aBoolean57) {
				arg0.anInt511 = Static35.anInt981;
			} else {
				arg0.anInt511 = Static56.anInt1472;
			}
		} else if (local6 == 327) {
			arg0.anInt509 = 150;
			arg0.anInt470 = (int) (Math.sin((double) Static78.anInt1981 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt516 = 0;
			arg0.anInt530 = 5;
		} else if (local6 == 328) {
			arg0.anInt509 = 150;
			arg0.anInt470 = (int) (Math.sin((double) Static78.anInt1981 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt530 = 5;
			arg0.anInt516 = 1;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!v;I)I")
	public static int method1391(@OriginalArg(0) Class76 arg0) {
		if (Static55.anInt1445 == 1) {
			return 7;
		} else if (arg0.method1869(Static38.aClass76_468)) {
			return 1;
		} else if (arg0.method1869(Static39.aClass76_479)) {
			return 1;
		} else if (arg0.method1869(Static91.aClass76_955)) {
			return 2;
		} else if (arg0.method1869(Static58.aClass76_638)) {
			return 2;
		} else if (arg0.method1869(Static132.aClass76_1319)) {
			return 3;
		} else if (arg0.method1869(Static62.aClass76_675)) {
			return 4;
		} else if (arg0.method1869(Static62.aClass76_673)) {
			return 4;
		} else if (arg0.method1869(Static121.aClass76_1233)) {
			return 5;
		} else if (arg0.method1869(Static24.aClass76_205)) {
			return 6;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(Z)V")
	public static void method1392() {
		aClass76_831 = null;
		aClass76_830 = null;
		anImage3 = null;
	}
}
