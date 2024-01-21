import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!f", name = "z", descriptor = "Lclient!qc;")
	public static Class15 aClass15_2;

	@OriginalMember(owner = "client!f", name = "Gc", descriptor = "[I")
	public static int[] anIntArray90;

	@OriginalMember(owner = "client!f", name = "Pc", descriptor = "I")
	public static int anInt801;

	@OriginalMember(owner = "client!f", name = "x", descriptor = "I")
	public static final int anInt737 = 0;

	@OriginalMember(owner = "client!f", name = "X", descriptor = "Lclient!ec;")
	public static Class22 aClass22_202 = Static60.method1113("m");

	@OriginalMember(owner = "client!f", name = "tb", descriptor = "[[I")
	public static int[][] anIntArrayArray5 = new int[104][104];

	@OriginalMember(owner = "client!f", name = "ec", descriptor = "Lclient!ec;")
	private static Class22 aClass22_207 = Static60.method1113("Please reload this page)3");

	@OriginalMember(owner = "client!f", name = "kc", descriptor = "[Lclient!ec;")
	public static Class22[] aClass22Array5 = new Class22[100];

	@OriginalMember(owner = "client!f", name = "Jc", descriptor = "Lclient!ec;")
	public static Class22 aClass22_209 = aClass22_207;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
	public static void method526() {
		aClass22_209 = null;
		aClass15_2 = null;
		aClass22_202 = null;
		anIntArrayArray5 = null;
		aClass22Array5 = null;
		aClass22_207 = null;
		anIntArray90 = null;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIII)V")
	public static void method527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class4_Sub19 local12 = (Class4_Sub19) Static30.aClass81_4.method2010((long) arg0);
		if (local12 == null) {
			local12 = new Class4_Sub19();
			Static30.aClass81_4.method2015((long) arg0, local12);
		}
		if (arg1 >= local12.anIntArray273.length) {
			@Pc(38) int[] local38 = new int[arg1 + 1];
			@Pc(43) int[] local43 = new int[arg1 + 1];
			for (@Pc(45) int local45 = 0; local45 < local12.anIntArray273.length; local45++) {
				local38[local45] = local12.anIntArray273[local45];
				local43[local45] = local12.anIntArray272[local45];
			}
			for (@Pc(71) int local71 = local12.anIntArray273.length; local71 < arg1; local71++) {
				local38[local71] = -1;
				local43[local71] = 0;
			}
			local12.anIntArray272 = local43;
			local12.anIntArray273 = local38;
		}
		local12.anIntArray273[arg1] = arg3;
		local12.anIntArray272[arg1] = arg2;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(JI)V")
	public static void method528(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < Static2.anInt9; local17++) {
			if (Static29.aLongArray1[local17] == arg0) {
				Static2.anInt9--;
				for (@Pc(35) int local35 = local17; local35 < Static2.anInt9; local35++) {
					Static12.aClass22Array1[local35] = Static12.aClass22Array1[local35 + 1];
					Static75.anIntArray199[local35] = Static75.anIntArray199[local35 + 1];
					Static29.aLongArray1[local35] = Static29.aLongArray1[local35 + 1];
					Static5.anIntArray6[local35] = Static5.anIntArray6[local35 + 1];
				}
				Static2.anInt14 = Static96.anInt2513;
				Static38.aClass4_Sub11_Sub1_1.method752(135);
				Static38.aClass4_Sub11_Sub1_1.method728(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!ea;II)Lclient!h;")
	public static Class4_Sub1_Sub2_Sub2 method535(@OriginalArg(0) int arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) int arg2) {
		return Static24.method397(arg2, arg1, arg0) ? Static67.method1169() : null;
	}
}
