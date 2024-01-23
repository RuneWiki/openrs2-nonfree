import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
	public static int anInt4509;

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
	public static int anInt4511;

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "Lclient!qc;")
	public static Class135 aClass135_26 = new Class135(500);

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
	public static int anInt4510 = 0;

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "Lclient!qc;")
	public static Class135 aClass135_27 = new Class135(64);

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!km;ILclient!km;II)Lclient!bn;")
	public static Class1_Sub2_Sub1_Sub2 method3557(@OriginalArg(0) Class91 arg0, @OriginalArg(2) Class91 arg1, @OriginalArg(3) int arg2) {
		return Static240.method3698(0, arg2, arg0) ? Static82.method1389(arg1.method2495(arg2, 0)) : null;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/lang/String;Lclient!km;I)Lclient!jn;")
	public static Class82 method3559(@OriginalArg(0) String arg0, @OriginalArg(1) Class91 arg1) {
		@Pc(6) int local6 = arg1.method2504(arg0);
		if (local6 == -1) {
			return new Class82(0);
		}
		@Pc(32) int[] local32 = arg1.method2494(local6);
		@Pc(38) Class82 local38 = new Class82(local32.length);
		for (@Pc(40) int local40 = 0; local40 < local38.anInt2893; local40++) {
			@Pc(55) Class1_Sub11 local55 = new Class1_Sub11(arg1.method2495(local6, local32[local40]));
			local38.aStringArray38[local40] = local55.method2629();
			local38.aByteArray44[local40] = local55.method2663();
			local38.anIntArray262[local40] = local55.method2643();
			local38.anIntArray264[local40] = local55.method2643();
		}
		return local38;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V")
	public static void method3560() {
		if (Static197.aClass14_Sub2_Sub1_2 != null && Static197.aClass14_Sub2_Sub1_2.anInt4680 - (Static197.aClass14_Sub2_Sub1_2.method3656() - 1) * 64 >> 7 == Static45.anInt1101 && Static197.aClass14_Sub2_Sub1_2.anInt4630 - (Static197.aClass14_Sub2_Sub1_2.method3656() - 1) * 64 >> 7 == Static44.anInt1074) {
			Static45.anInt1101 = 0;
		}
		@Pc(46) int local46;
		for (local46 = 0; local46 < 104; local46++) {
			for (@Pc(51) int local51 = 0; local51 < 104; local51++) {
				Static225.anIntArrayArray28[local46][local51] = 0;
			}
		}
		for (local46 = 0; local46 < Static278.anInt5374; local46++) {
			@Pc(87) Class14_Sub2_Sub1 local87 = Static98.aClass14_Sub2_Sub1Array1[Static17.anIntArray444[local46]];
			if (local87 != null) {
				local87.aBoolean357 = false;
			}
		}
		for (local46 = 0; local46 < Static233.anInt4582; local46++) {
			@Pc(112) Class14_Sub2_Sub2 local112 = Static254.aClass14_Sub2_Sub2Array1[Static281.anIntArray464[local46]];
			if (local112 != null) {
				local112.aBoolean357 = false;
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIII)V")
	public static void method3561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 >= Static224.anInt4436 && arg2 <= Static68.anInt1451 && arg4 >= Static297.anInt5619 && arg3 <= Static49.anInt1129) {
			Static25.method525(arg0, arg2, arg1, arg4, arg3);
		} else {
			Static186.method3093(arg4, arg1, arg0, arg3, arg2);
		}
	}
}
