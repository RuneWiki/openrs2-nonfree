import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!h", name = "bb", descriptor = "[Lclient!ai;")
	public static Class6[] aClass6Array14 = new Class6[100];

	@OriginalMember(owner = "client!h", name = "kb", descriptor = "[I")
	public static int[] anIntArray222 = new int[1000];

	@OriginalMember(owner = "client!h", name = "tb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_777 = Static38.method685("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!h", name = "Bb", descriptor = "[I")
	public static int[] anIntArray225 = new int[128];

	@OriginalMember(owner = "client!h", name = "Qb", descriptor = "[I")
	public static int[] anIntArray226 = new int[25];

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIILclient!dh;)V")
	public static void method1800(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub3_Sub5_Sub1_Sub1 arg2) {
		if (arg1 == arg2.anInt2658 && arg1 != -1) {
			@Pc(65) int local65 = Static129.method2790(arg1).anInt1689;
			if (local65 == 1) {
				arg2.anInt2660 = 0;
				arg2.anInt2682 = arg0;
				arg2.anInt2688 = 0;
				arg2.anInt2669 = 0;
			}
			if (local65 == 2) {
				arg2.anInt2660 = 0;
			}
		} else if (arg1 == -1 || arg2.anInt2658 == -1 || Static129.method2790(arg1).anInt1678 >= Static129.method2790(arg2.anInt2658).anInt1678) {
			arg2.anInt2682 = arg0;
			arg2.anInt2658 = arg1;
			arg2.anInt2669 = 0;
			arg2.anInt2660 = 0;
			arg2.anInt2694 = arg2.anInt2687;
			arg2.anInt2688 = 0;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Z[B)[B")
	public static byte[] method1801(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local6];
		Static184.method163(arg0, 0, local14, 0, local6);
		return local14;
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "(I)V")
	public static void method1805() {
		aClass6Array14 = null;
		anIntArray225 = null;
		aClass6_777 = null;
		anIntArray222 = null;
		anIntArray226 = null;
	}
}
