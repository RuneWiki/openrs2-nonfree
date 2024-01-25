import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!ifa", name = "k", descriptor = "[I")
	public static final int[] anIntArray335 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ifa", name = "n", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_35 = new Class181(72, 16);

	@OriginalMember(owner = "client!ifa", name = "o", descriptor = "[I")
	public static final int[] anIntArray336 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!ifa", name = "p", descriptor = "I")
	public static int anInt3977 = 100;

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "([Lclient!hu;I)V")
	public static void method3612(@OriginalArg(0) Class44[] arg0) {
		Static81.anInt1374 = arg0.length;
		Static394.anIntArray545 = new int[Static81.anInt1374 + 10];
		Static158.aClass44Array7 = new Class44[Static81.anInt1374 + 10];
		Static655.method4106(arg0, 0, Static158.aClass44Array7, 0, Static81.anInt1374);
		for (@Pc(26) int local26 = 0; local26 < Static81.anInt1374; local26++) {
			Static394.anIntArray545[local26] = Static158.aClass44Array7[local26].method5325();
		}
		for (@Pc(49) int local49 = Static81.anInt1374; local49 < Static158.aClass44Array7.length; local49++) {
			Static394.anIntArray545[local49] = 12;
		}
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILclient!ha;IIIB)V")
	public static void method3614(@OriginalArg(1) Class126 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		Static512.aClass126_22 = arg0;
		Static504.aClass117_7 = Static512.aClass126_22.method6998();
		Static573.aClass117_9 = Static512.aClass126_22.method6998();
		Static142.aClass117_8 = Static512.aClass126_22.method6998();
		Static262.anInt4378 = 100;
		Static453.anInt7627 = 0;
		Static583.anIntArray754 = null;
		Static311.anInterface16Array1 = null;
		Static503.anInt3942 = 100;
		Static27.method539(arg1, arg2);
		Static4.anInt33 = -1;
		Static363.anInt6417 = -1;
		Static129.anInt6333 = -1;
	}
}
