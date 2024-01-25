import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!cu", name = "eb", descriptor = "I")
	public static int anInt1262;

	@OriginalMember(owner = "client!cu", name = "ub", descriptor = "Lclient!oj;")
	public static Class48 aClass48_2;

	@OriginalMember(owner = "client!cu", name = "Kb", descriptor = "Lclient!qm;")
	public static Class194 aClass194_1;

	@OriginalMember(owner = "client!cu", name = "x", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_39 = new Class62(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!cu", name = "Ab", descriptor = "I")
	public static int anInt1275 = -1;

	@OriginalMember(owner = "client!cu", name = "Jb", descriptor = "I")
	public static int anInt1283 = 0;

	@OriginalMember(owner = "client!cu", name = "Lb", descriptor = "I")
	public static final int anInt1284 = 52;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method893(@OriginalArg(0) String arg0) {
		if (Static43.aClass163Array2 != null) {
			Static77.method1332(Static228.aClass183_66);
			Static76.aClass2_Sub24_Sub2_7.method5746(Static305.method6026(arg0));
			Static76.aClass2_Sub24_Sub2_7.method5772(arg0);
		}
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(B)V")
	public static void method899() {
		for (@Pc(8) int local8 = 0; local8 < 100; local8++) {
			Static93.aBooleanArray10[local8] = true;
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!cr;ILclient!oj;IIZI)V")
	public static void method901(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class48 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg4) {
			Static75.aClass27_8.method5318((Static7.anInt157 - Static75.aClass27_8.method5317()) / 2, (Static336.anInt6217 - Static75.aClass27_8.method5328()) / 2);
			Static200.aClass27_13.method5318((Static7.anInt157 - Static200.aClass27_13.method5317()) / 2, 18);
		}
		arg0.method4644(arg1, -1, Static336.anInt6217 / 2 - 26, Static7.anInt157 / 2, (Static85.aClass38_1 == Static255.aClass38_3 ? Static14.aClass62_10 : Static77.aClass62_51).method1389(Static200.anInt4144));
		@Pc(57) int local57 = Static336.anInt6217 / 2 - 18;
		arg2.method2534(Static7.anInt157 / 2 - 152, local57, 304, 34, arg5, 0);
		arg2.method2534(Static7.anInt157 / 2 - 151, local57 + 1, 302, 32, 0, 0);
		arg2.method2470(Static7.anInt157 / 2 - 150, local57 + 2, Static385.anInt7000 * 3, 30, arg3, 0);
		arg2.method2470(Static7.anInt157 / 2 + Static385.anInt7000 * 3 - 150, local57 + 2, 300 - Static385.anInt7000 * 3, 30, 0, 0);
		arg0.method4644(arg1, -1, Static336.anInt6217 / 2 + 4, Static7.anInt157 / 2, Static119.aString20);
	}
}
