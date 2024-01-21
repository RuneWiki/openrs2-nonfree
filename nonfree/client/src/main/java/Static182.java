import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!w", name = "i", descriptor = "[Lclient!bg;")
	public static Class1_Sub2_Sub1_Sub4[] aClass1_Sub2_Sub1_Sub4Array6;

	@OriginalMember(owner = "client!w", name = "k", descriptor = "[Lclient!ba;")
	public static Class1_Sub2_Sub1_Sub3[] aClass1_Sub2_Sub1_Sub3Array3;

	@OriginalMember(owner = "client!w", name = "K", descriptor = "Lclient!e;")
	public static Class16 aClass16_3;

	@OriginalMember(owner = "client!w", name = "P", descriptor = "I")
	private static int anInt944;

	@OriginalMember(owner = "client!w", name = "f", descriptor = "I")
	public static int anInt914 = 2;

	@OriginalMember(owner = "client!w", name = "l", descriptor = "I")
	public static int anInt918 = -1;

	@OriginalMember(owner = "client!w", name = "u", descriptor = "Lclient!dd;")
	public static Class13 aClass13_314 = Static161.method2971("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!w", name = "w", descriptor = "Lclient!dd;")
	public static Class13 aClass13_315 = Static161.method2971("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!w", name = "G", descriptor = "I")
	public static int anInt937 = -1;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B)I")
	public static int method791() {
		return Static47.anInt3276++;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!gi;B)V")
	public static void method793(@OriginalArg(0) Class1_Sub2_Sub2_Sub2 arg0) {
		if (Static78.anInt2168 == arg0.anInt2573 || arg0.anInt2553 == -1 || arg0.anInt2585 != 0 || arg0.anInt2551 + 1 > Static142.method2538(arg0.anInt2553).anIntArray155[arg0.anInt2590]) {
			@Pc(41) int local41 = arg0.anInt2573 - arg0.anInt2588;
			@Pc(46) int local46 = Static78.anInt2168 - arg0.anInt2588;
			@Pc(57) int local57 = arg0.anInt2595 * 128 + arg0.anInt2583 * 64;
			@Pc(67) int local67 = arg0.anInt2583 * 64 + arg0.anInt2592 * 128;
			@Pc(77) int local77 = arg0.anInt2583 * 64 + arg0.anInt2578 * 128;
			@Pc(87) int local87 = arg0.anInt2583 * 64 + arg0.anInt2548 * 128;
			arg0.anInt2596 = (local57 * (local41 - local46) + local87 * local46) / local41;
			arg0.anInt2606 = (local67 * (local41 - local46) + local77 * local46) / local41;
		}
		if (arg0.anInt2601 == 0) {
			arg0.anInt2555 = 1024;
		}
		if (arg0.anInt2601 == 1) {
			arg0.anInt2555 = 1536;
		}
		arg0.anInt2559 = 0;
		if (arg0.anInt2601 == 2) {
			arg0.anInt2555 = 0;
		}
		if (arg0.anInt2601 == 3) {
			arg0.anInt2555 = 512;
		}
		arg0.anInt2560 = arg0.anInt2555;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(B)V")
	public static void method794() {
		aClass1_Sub2_Sub1_Sub4Array6 = null;
		aClass16_3 = null;
		aClass13_314 = null;
		aClass13_315 = null;
		aClass1_Sub2_Sub1_Sub3Array3 = null;
	}
}
