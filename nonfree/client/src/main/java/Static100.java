import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_793 = Static161.method2452("To play on this world move to a free area first)3");

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "Lclient!dc;")
	public static Class20 aClass20_792 = aClass20_793;

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_794 = Static161.method2452("Error loading your profile)3");

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_797 = Static161.method2452("Loading textures )2 ");

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "Lclient!dc;")
	public static Class20 aClass20_795 = aClass20_797;

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "Lclient!dc;")
	public static Class20 aClass20_796 = aClass20_794;

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "[I")
	public static final int[] anIntArray210 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
	public static int anInt2149 = 0;

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "[I")
	public static final int[] anIntArray211 = new int[32];

	@OriginalMember(owner = "client!kf", name = "r", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_798 = Static161.method2452("Starte 3D)2Softwarebibliothek)3");

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIII)V")
	public static void method1689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) int local5 = arg1 + arg5;
		@Pc(14) int local14 = arg0 - arg1;
		@Pc(19) int local19 = arg3 + arg1;
		@Pc(23) int local23 = arg2 - arg1;
		for (@Pc(25) int local25 = arg5; local25 < local5; local25++) {
			Static27.method409(arg2, arg4, Static9.anIntArrayArray1[local25], arg3);
		}
		for (@Pc(45) int local45 = arg0; local45 > local14; local45--) {
			Static27.method409(arg2, arg4, Static9.anIntArrayArray1[local45], arg3);
		}
		for (@Pc(67) int local67 = local5; local67 <= local14; local67++) {
			@Pc(73) int[] local73 = Static9.anIntArrayArray1[local67];
			Static27.method409(local19, arg4, local73, arg3);
			Static27.method409(arg2, arg4, local73, local23);
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZ)Lclient!t;")
	public static Class5_Sub2_Sub21 method1690(@OriginalArg(0) int arg0) {
		@Pc(6) Class5_Sub2_Sub21 local6 = (Class5_Sub2_Sub21) Static7.aClass8_6.method227((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static148.aClass23_55.method738(arg0, 5);
		local6 = new Class5_Sub2_Sub21();
		if (local20 != null) {
			local6.method2741(new Class5_Sub6(local20));
		}
		Static7.aClass8_6.method232((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)Lclient!ng;")
	public static Class47_Sub1 method1691() {
		@Pc(29) Class47_Sub1 local29 = new Class47_Sub1(Static58.anInt1319, Static140.anInt2921, Static146.anIntArray320[0], Static5.anIntArray10[0], Static153.anIntArray337[0], Static210.anIntArray84[0], Static191.aByteArrayArray9[0], Static3.anIntArray9);
		Static85.method1452();
		return local29;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V")
	public static void method1692() {
		for (@Pc(10) Class5_Sub2_Sub9 local10 = (Class5_Sub2_Sub9) Static166.aClass91_15.method2684(); local10 != null; local10 = (Class5_Sub2_Sub9) Static166.aClass91_15.method2678()) {
			@Pc(17) Class1_Sub7 local17 = local10.aClass1_Sub7_1;
			if (Static111.anInt2327 != local17.anInt3255 || local17.aBoolean143) {
				local10.method3207();
			} else if (Static177.anInt3533 >= local17.anInt3251) {
				local17.method2455(Static176.anInt3529);
				if (local17.aBoolean143) {
					local10.method3207();
				} else {
					Static77.method2443(local17.anInt3255, local17.anInt3261, local17.anInt3257, local17.anInt3259, 60, local17, 0, -1L, false);
				}
			}
		}
	}
}
