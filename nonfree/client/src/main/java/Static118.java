import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!hj", name = "m", descriptor = "I")
	public static int anInt2542;

	@OriginalMember(owner = "client!hj", name = "o", descriptor = "I")
	public static int anInt2543;

	@OriginalMember(owner = "client!hj", name = "r", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!hj", name = "s", descriptor = "[Lclient!lg;")
	public static Class60[] aClass60Array6;

	@OriginalMember(owner = "client!hj", name = "u", descriptor = "Lclient!wm;")
	public static Class78 aClass78_3;

	@OriginalMember(owner = "client!hj", name = "p", descriptor = "I")
	public static int anInt2544 = 0;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!fd;Lclient!vm;IZI)V")
	public static void method2105(@OriginalArg(0) Class72 arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg0.anInt1825 == 2) {
			for (@Pc(9) int local9 = arg3; local9 <= arg2; local9++) {
				@Pc(18) int local18 = arg0.anIntArray179[local9] - 1;
				if (local18 != -1) {
					@Pc(57) boolean local57;
					if (Static315.anInt1642 == 1 && local9 == Static165.anInt3377 && Static309.anInt6211 == arg0.anInt1830) {
						local57 = Static320.method5292(arg1, 0, null, arg0.anIntArray181[local9], arg0.anInt1811, 2, local18) == null;
						if (local57) {
							Static120.aClass130_52.method3510(new Class4_Sub15(local18, arg0.anIntArray181[local9], 2, 0, arg0.anInt1811, false));
						}
					} else {
						local57 = Static320.method5292(arg1, -13623264, null, arg0.anIntArray181[local9], arg0.anInt1811, 1, local18) == null;
						if (local57) {
							Static120.aClass130_52.method3510(new Class4_Sub15(local18, arg0.anIntArray181[local9], 1, -13623264, arg0.anInt1811, false));
						}
					}
				}
			}
		} else if (arg0.anInt1825 == 5) {
			@Pc(150) boolean local150 = Static320.method5292(arg1, arg0.anInt1872 | 0xFF000000, arg0.aBoolean151 ? Static110.aClass2_Sub2_Sub1_Sub1_1.aClass148_4 : null, arg0.anInt1807, arg0.anInt1811, arg0.anInt1842, arg0.lb) == null;
			if (local150) {
				Static120.aClass130_52.method3510(new Class4_Sub15(arg0.lb, arg0.anInt1807, arg0.anInt1842, arg0.anInt1872 | 0xFF000000, arg0.anInt1811, arg0.aBoolean151));
			}
		}
	}
}
