import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
	public static int anInt3287;

	@OriginalMember(owner = "client!fn", name = "k", descriptor = "Lclient!wf;")
	public static final Class316 aClass316_16 = new Class316(5);

	@OriginalMember(owner = "client!fn", name = "p", descriptor = "I")
	public static int anInt3290 = 0;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!vp;BII)V")
	public static void method2957(@OriginalArg(0) Class309 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.aByte108 == 0) {
			arg0.anInt8777 = arg0.anInt8765;
		} else if (arg0.aByte108 == 1) {
			arg0.anInt8777 = arg0.anInt8765 + (arg1 - arg0.anInt8752) / 2;
		} else if (arg0.aByte108 == 2) {
			arg0.anInt8777 = arg1 - arg0.anInt8752 - arg0.anInt8765;
		} else if (arg0.aByte108 == 3) {
			arg0.anInt8777 = arg0.anInt8765 * arg1 >> 14;
		} else if (arg0.aByte108 == 4) {
			arg0.anInt8777 = (arg0.anInt8765 * arg1 >> 14) + (arg1 - arg0.anInt8752) / 2;
		} else {
			arg0.anInt8777 = arg1 - (arg0.anInt8765 * arg1 >> 14) - arg0.anInt8752;
		}
		if (arg0.aByte106 == 0) {
			arg0.anInt8744 = arg0.anInt8720;
		} else if (arg0.aByte106 == 1) {
			arg0.anInt8744 = arg0.anInt8720 + (arg2 - arg0.anInt8790) / 2;
		} else if (arg0.aByte106 == 2) {
			arg0.anInt8744 = arg2 - arg0.anInt8790 - arg0.anInt8720;
		} else if (arg0.aByte106 == 3) {
			arg0.anInt8744 = arg2 * arg0.anInt8720 >> 14;
		} else if (arg0.aByte106 == 4) {
			arg0.anInt8744 = (arg0.anInt8720 * arg2 >> 14) + (arg2 - arg0.anInt8790) / 2;
		} else {
			arg0.anInt8744 = arg2 - arg0.anInt8790 - (arg2 * arg0.anInt8720 >> 14);
		}
		if (!Static192.aBoolean246 || Static62.method1740(arg0).anInt9474 == 0 && arg0.anInt8802 != 0) {
			return;
		}
		if (arg0.anInt8744 < 0) {
			arg0.anInt8744 = 0;
		} else if (arg2 < arg0.anInt8790 + arg0.anInt8744) {
			arg0.anInt8744 = arg2 - arg0.anInt8790;
		}
		if (arg0.anInt8777 < 0) {
			arg0.anInt8777 = 0;
		} else if (arg0.anInt8752 + arg0.anInt8777 > arg1) {
			arg0.anInt8777 = arg1 - arg0.anInt8752;
			return;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZI)V")
	public static void method2961(@OriginalArg(0) boolean arg0) {
		if (Static453.aClass154_1 != null) {
			Static453.aClass154_1.method4020();
			Static453.aClass154_1 = null;
		}
		Static546.anInt9466 = 0;
		Static33.method1299();
		Static42.method1368();
		for (@Pc(21) int local21 = 0; local21 < 4; local21++) {
			Static70.aClass299Array1[local21].method7230();
		}
		Static165.method3262(false);
		System.gc();
		Static499.method7147();
		Static289.aBoolean391 = false;
		Static547.anInt9477 = -1;
		Static7.method228(true);
		Static358.anInt2386 = 0;
		Static517.anInt8716 = 0;
		Static324.anInt6132 = 0;
		Static198.anInt4113 = 0;
		Static492.anInt8390 = 0;
		Static184.anInt3932 = 0;
		for (@Pc(61) int local61 = 0; local61 < Static484.aClass28Array1.length; local61++) {
			Static484.aClass28Array1[local61] = null;
		}
		Static410.method6139();
		for (@Pc(75) int local75 = 0; local75 < 2048; local75++) {
			Static473.aClass47_Sub2_Sub3_Sub2Array1[local75] = null;
		}
		Static457.anInt7857 = 0;
		Static258.aClass174_15.method4423();
		Static198.anInt4112 = 0;
		Static528.aClass174_40.method4423();
		Static166.method3272();
		Static242.anInt1986 = 0;
		Static343.aClass286_1.method6997();
		Static41.method1360();
		Static233.method4004();
		Static246.aLong123 = 0L;
		Static515.aClass1_Sub36_2 = null;
		if (arg0) {
			Static265.method4401(11);
			return;
		}
		Static265.method4401(2);
		try {
			Static554.method4839(Static91.aClass182_2.anApplet1, "loggedout");
		} catch (@Pc(124) Throwable local124) {
		}
	}
}
