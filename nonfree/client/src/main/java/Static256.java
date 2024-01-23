import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!sg", name = "r", descriptor = "Lclient!ti;")
	public static Class1_Sub2_Sub20 aClass1_Sub2_Sub20_6;

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
	public static int anInt4632 = 0;

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
	public static volatile int anInt4633 = -1;

	@OriginalMember(owner = "client!sg", name = "j", descriptor = "S")
	public static short aShort35 = 256;

	@OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
	public static int anInt4643 = 0;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
	public static void method4054() {
		Static41.aClass1_Sub2_Sub1Array2 = null;
		Static310.aClass1_Sub2_Sub1Array9 = null;
		Static311.aClass1_Sub2_Sub1Array10 = null;
		Static17.aClass23Array1 = null;
		Static11.aClass1_Sub2_Sub6_1 = null;
		Static110.aClass1_Sub2_Sub1Array5 = null;
		Static140.aClass1_Sub2_Sub6_3 = null;
		Static294.aClass1_Sub2_Sub1Array8 = null;
		Static175.aClass1_Sub2_Sub1Array7 = null;
		Static84.aClass23Array3 = null;
		Static113.aClass1_Sub2_Sub1Array6 = null;
		Static64.aClass1_Sub2_Sub1Array4 = null;
		Static41.aClass1_Sub2_Sub1Array3 = null;
		Static34.aClass1_Sub2_Sub6_Sub1_4 = null;
		Static307.aClass1_Sub2_Sub6_4 = null;
		Static6.aClass1_Sub2_Sub1Array1 = null;
		Static243.aClass1_Sub2_Sub1_50 = null;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIII)I")
	public static int method4055(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg1) {
			return arg1;
		} else {
			@Pc(13) int local13 = 128 - arg0;
			@Pc(31) int local31 = local13 * (arg1 >>> 7 & 0x1FE01FE) + arg0 * (arg2 >>> 7 & 0x1FE01FE) & 0xFF00FF00;
			@Pc(45) int local45 = (arg1 & 0xFF00FF) * local13 + arg0 * (arg2 & 0xFF00FF) & 0xFF00FF00;
			return local31 + (local45 >> 7);
		}
	}
}
