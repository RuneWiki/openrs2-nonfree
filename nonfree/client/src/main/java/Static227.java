import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!wg", name = "Y", descriptor = "I")
	public static int anInt4778;

	@OriginalMember(owner = "client!wg", name = "Z", descriptor = "I")
	public static int anInt4779;

	@OriginalMember(owner = "client!wg", name = "hb", descriptor = "Lclient!mb;")
	public static Class70 aClass70_45;

	@OriginalMember(owner = "client!wg", name = "nb", descriptor = "D")
	public static double aDouble11;

	@OriginalMember(owner = "client!wg", name = "bb", descriptor = "[S")
	public static short[] aShortArray59 = new short[500];

	@OriginalMember(owner = "client!wg", name = "eb", descriptor = "I")
	public static int anInt4783 = 0;

	@OriginalMember(owner = "client!wg", name = "jb", descriptor = "I")
	public static int anInt4786 = 1;

	@OriginalMember(owner = "client!wg", name = "kb", descriptor = "[S")
	public static short[] aShortArray60 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(IIIII)V")
	public static void method3741(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static160.anInt3454 <= arg2 - arg1 && Static149.anInt3252 >= arg1 + arg2 && Static225.anInt4729 <= arg3 - arg1 && arg1 + arg3 <= Static122.anInt2710) {
			Static178.method3024(arg3, arg2, arg0, arg1);
		} else {
			Static5.method2796(arg1, arg0, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "(II)V")
	public static void method3742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class1_Sub7 local7 = Static22.aClass1_Sub7ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class1_Sub7 local28 = Static22.aClass1_Sub7ArrayArrayArray1[local9][arg0][arg1] = Static22.aClass1_Sub7ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.anInt1129--;
				for (@Pc(38) int local38 = 0; local38 < local28.anInt1124; local38++) {
					@Pc(44) Class83 local44 = local28.aClass83Array3[local38];
					if ((local44.aLong118 >> 29 & 0x3L) == 2L && local44.anInt3340 == arg0 && local44.anInt3336 == arg1) {
						local44.anInt3345--;
					}
				}
			}
		}
		if (Static22.aClass1_Sub7ArrayArrayArray1[0][arg0][arg1] == null) {
			Static22.aClass1_Sub7ArrayArrayArray1[0][arg0][arg1] = new Class1_Sub7(0, arg0, arg1);
		}
		Static22.aClass1_Sub7ArrayArrayArray1[0][arg0][arg1].aClass1_Sub7_1 = local7;
		Static22.aClass1_Sub7ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V")
	public static void method3743() {
		Static217.aClass53_29.method1498();
	}

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "(B)V")
	public static void method3744() {
		Static30.aClass53_17.method1498();
	}
}
