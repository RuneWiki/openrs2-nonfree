import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
	public static int anInt2576 = -1;

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
	public static int anInt2580 = 0;

	@OriginalMember(owner = "client!hd", name = "w", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_49 = new Class93(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!hd", name = "A", descriptor = "[[S")
	public static final short[][] aShortArrayArray3 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BIIILclient!jh;)V")
	public static void method2492(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class96 arg3) {
		for (@Pc(15) Class2_Sub7 local15 = (Class2_Sub7) Static47.aClass216_17.method5992(); local15 != null; local15 = (Class2_Sub7) Static47.aClass216_17.method6000()) {
			if (local15.anInt540 == arg1 && local15.anInt534 == arg2 * 128 && arg0 * 128 == local15.anInt539 && local15.aClass96_1.anInt3132 == arg3.anInt3132) {
				if (local15.aClass2_Sub3_Sub2_2 != null) {
					Static313.aClass2_Sub3_Sub1_2.method365(local15.aClass2_Sub3_Sub2_2);
					local15.aClass2_Sub3_Sub2_2 = null;
				}
				if (local15.aClass2_Sub3_Sub2_1 != null) {
					Static313.aClass2_Sub3_Sub1_2.method365(local15.aClass2_Sub3_Sub2_1);
					local15.aClass2_Sub3_Sub2_1 = null;
				}
				local15.method5945();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
	public static void method2493() {
		Static214.aClass4_9.method4249(Static146.aFloat40, Static32.aFloat29, Static311.aFloat76);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)I")
	public static int method2494() {
		if (Static42.aBoolean84) {
			return 0;
		} else if (Static257.method4680()) {
			return Static148.aBoolean262 ? 2 : 1;
		} else {
			return 1;
		}
	}
}
