import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!ic", name = "eb", descriptor = "I")
	public static int anInt3353;

	@OriginalMember(owner = "client!ic", name = "fb", descriptor = "[J")
	public static long[] aLongArray4;

	@OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
	public static int anInt3341 = 0;

	@OriginalMember(owner = "client!ic", name = "T", descriptor = "I")
	public static int anInt3346 = 0;

	@OriginalMember(owner = "client!ic", name = "V", descriptor = "Lclient!s;")
	public static final Class217 aClass217_77 = new Class217(89, 8);

	@OriginalMember(owner = "client!ic", name = "bb", descriptor = "I")
	public static int anInt3351 = 0;

	@OriginalMember(owner = "client!ic", name = "db", descriptor = "Lclient!mo;")
	public static final Class168 aClass168_14 = new Class168(4, 3);

	@OriginalMember(owner = "client!ic", name = "gb", descriptor = "Ljava/lang/String;")
	public static String aString26 = "";

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(IZ)V")
	public static void method2797(@OriginalArg(0) int arg0) {
		if (Static248.anInt4481 == arg0) {
			return;
		}
		Static2.anInt7 = Static17.anInt315 = Static391.anIntArray640[arg0];
		Static159.method2689();
		Static53.anIntArrayArray5 = new int[Static2.anInt7][Static17.anInt315];
		Static32.anIntArrayArrayArray1 = new int[4][Static2.anInt7 >> 3][Static17.anInt315 >> 3];
		Static215.anIntArrayArray38 = new int[Static2.anInt7][Static17.anInt315];
		for (@Pc(44) int local44 = 0; local44 < 4; local44++) {
			Static11.aClass220Array1[local44] = Static153.method2609(Static17.anInt315, Static2.anInt7);
		}
		Static255.aByteArrayArrayArray16 = new byte[4][Static2.anInt7][Static17.anInt315];
		Static305.method4245(Static17.anInt315, Static2.anInt7);
		Static198.method3141(Static17.anInt315 >> 3, Static412.aClass50_8, Static2.anInt7 >> 3);
		Static248.anInt4481 = arg0;
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)V")
	public static void method2799() {
		if (Static343.aBoolean375) {
			return;
		}
		Static82.method1545(Static345.aClass11ArrayArrayArray3);
		if (Static36.aClass11ArrayArrayArray1 != null) {
			Static82.method1545(Static36.aClass11ArrayArrayArray1);
		}
		Static343.aBoolean375 = true;
	}

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "(Z)V")
	public static void method2801() {
		if (Static262.anInt4662 != -1) {
			Static156.method2635(false, Static262.anInt4662, -1, -1);
			Static262.anInt4662 = -1;
		}
	}
}
