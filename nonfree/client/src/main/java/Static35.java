import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "Lclient!jb;")
	public static Class25 aClass25_6;

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "Lclient!u;")
	public static Class74 aClass74_1;

	@OriginalMember(owner = "client!ga", name = "m", descriptor = "Z")
	public static boolean aBoolean36;

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "Lclient!eb;")
	public static Class17 aClass17_19 = new Class17(30);

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "Lclient!qf;")
	public static Class60 aClass60_462 = Static59.method1195("Passwort: ");

	@OriginalMember(owner = "client!ga", name = "k", descriptor = "Lclient!qf;")
	public static Class60 aClass60_463 = Static59.method1195("(U");

	@OriginalMember(owner = "client!ga", name = "l", descriptor = "Lclient!qf;")
	public static Class60 aClass60_464 = Static59.method1195("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!ga", name = "n", descriptor = "Lclient!qf;")
	public static Class60 aClass60_465 = Static59.method1195("0(U");

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
	public static int anInt1193 = 0;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)V")
	public static void method776() {
		Static112.aClass17_50.method646();
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)V")
	public static void method777() {
		aClass74_1 = null;
		aClass60_462 = null;
		aClass60_463 = null;
		aClass60_464 = null;
		aClass17_19 = null;
		aClass25_6 = null;
		aClass60_465 = null;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method778(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static6.aClass26_1);
		arg0.removeMouseMotionListener(Static6.aClass26_1);
		arg0.removeFocusListener(Static6.aClass26_1);
		Static14.anInt433 = 0;
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(Z)V")
	public static void method779() {
		@Pc(1) Object local1 = Static52.anObject3;
		synchronized (Static52.anObject3) {
			if (Static97.anInt2770 != 0) {
				Static97.anInt2770 = 1;
				try {
					Static52.anObject3.wait();
				} catch (@Pc(21) InterruptedException local21) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BI)I")
	public static int method780(@OriginalArg(1) int arg0) {
		@Pc(7) Class3_Sub1_Sub6 local7 = Static41.method942(arg0);
		@Pc(15) int local15 = local7.anInt1140;
		@Pc(18) int local18 = local7.anInt1154;
		@Pc(21) int local21 = local7.anInt1142;
		@Pc(27) int local27 = Class3_Sub1_Sub1_Sub3.anIntArray185[local15 - local18];
		return local27 & Static18.anIntArray80[local21] >> local18;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIIII)V")
	public static void method781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (Static21.method563(arg4)) {
			Static115.method2114(arg3, 0, -1, arg2, arg1, arg5, arg0, arg6, Static120.aClass3_Sub15ArrayArray1[arg4], 0);
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)V")
	public static void method782(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		local8[0] = arg0;
		@Pc(15) int[] local15 = new int[4];
		@Pc(22) int local22 = 1;
		local15[0] = arg1;
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			if (Static69.anIntArray219[local28] != arg0) {
				local8[local22] = Static69.anIntArray219[local28];
				local15[local22] = Static129.anIntArray391[local28];
				local22++;
			}
		}
		Static129.anIntArray391 = local15;
		Static69.anIntArray219 = local8;
		Static73.method1521(0, Static69.anIntArray219, Static129.anIntArray391, Static14.aClass18Array1.length - 1, Static14.aClass18Array1);
	}
}
