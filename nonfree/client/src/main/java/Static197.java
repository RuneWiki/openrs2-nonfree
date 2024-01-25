import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "[I")
	public static int[] anIntArray410;

	@OriginalMember(owner = "client!kr", name = "l", descriptor = "Lclient!di;")
	public static Class1_Sub7_Sub1 aClass1_Sub7_Sub1_3;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "[I")
	public static final int[] anIntArray408 = new int[200];

	@OriginalMember(owner = "client!kr", name = "k", descriptor = "Lclient!je;")
	public static Class117 aClass117_8 = null;

	@OriginalMember(owner = "client!kr", name = "t", descriptor = "Z")
	public static boolean aBoolean345 = false;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method2849(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(7) int local7 = Static331.anInt5548;
		@Pc(9) int[] local9 = Static345.anIntArray681;
		@Pc(11) boolean local11 = false;
		for (@Pc(19) int local19 = 0; local19 < local7; local19++) {
			@Pc(27) Class25_Sub1_Sub1_Sub1 local27 = Static225.aClass25_Sub1_Sub1_Sub1Array3[local9[local19]];
			if (local27 != null && local27 != Static321.aClass25_Sub1_Sub1_Sub1_2 && local27.aString6 != null && local27.aString6.equalsIgnoreCase(arg1)) {
				local11 = true;
				if (arg0 == 1) {
					Static177.method1119(Static335.aClass48_199);
					Static209.aClass1_Sub33_Sub2_2.method5154(0);
					Static209.aClass1_Sub33_Sub2_2.method5170(local9[local19]);
				} else if (arg0 == 4) {
					Static177.method1119(Static279.aClass48_172);
					Static209.aClass1_Sub33_Sub2_2.method5139(local9[local19]);
					Static209.aClass1_Sub33_Sub2_2.method5165(0);
				} else if (arg0 == 5) {
					Static177.method1119(Static5.aClass48_5);
					Static209.aClass1_Sub33_Sub2_2.method5161(0);
					Static209.aClass1_Sub33_Sub2_2.method5170(local9[local19]);
				} else if (arg0 == 6) {
					Static177.method1119(Static62.aClass48_35);
					Static209.aClass1_Sub33_Sub2_2.method5138(local9[local19]);
					Static209.aClass1_Sub33_Sub2_2.method5153(0);
				} else if (arg0 == 7) {
					Static177.method1119(Static317.aClass48_191);
					Static209.aClass1_Sub33_Sub2_2.method5153(0);
					Static209.aClass1_Sub33_Sub2_2.method5138(local9[local19]);
				}
				break;
			}
		}
		if (!local11) {
			Static118.method1733(Static132.aClass169_117.method3680(Static48.anInt952) + arg1);
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!je;I)V")
	public static void method2851(@OriginalArg(0) Class117 arg0) {
		if (arg0.anInt3064 != Static203.anInt3550) {
			return;
		}
		if (Static321.aClass25_Sub1_Sub1_Sub1_2.aString6 == null) {
			arg0.lb = 0;
			arg0.anInt3058 = 0;
			return;
		}
		arg0.anInt3036 = 150;
		arg0.anInt3109 = (int) (Math.sin((double) Static366.anInt5883 / 40.0D) * 256.0D) & 0x7FF;
		arg0.lb = Static43.anInt861;
		arg0.anInt3068 = 5;
		arg0.anInt3058 = Static309.method4596(Static321.aClass25_Sub1_Sub1_Sub1_2.aString6);
		arg0.anInt3088 = Static321.aClass25_Sub1_Sub1_Sub1_2.anInt2340;
		arg0.anInt3059 = Static321.aClass25_Sub1_Sub1_Sub1_2.anInt2332;
		arg0.anInt3044 = 0;
		arg0.anInt3057 = Static321.aClass25_Sub1_Sub1_Sub1_2.anInt2375;
	}
}
