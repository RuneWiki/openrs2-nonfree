import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_33 = new Class131(43, -1);

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "Z")
	public static boolean aBoolean41 = false;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
	public static void method822() {
		Static232.aClass1_Sub1_Sub1_2.anInt5056 = 0;
		Static95.anInt1785 = 0;
		Static264.aClass237_82 = null;
		Static79.anInt1568 = 0;
		Static329.aClass237_97 = null;
		Static283.anInt4985 = 0;
		Static411.aClass237_119 = null;
		Static85.aClass237_23 = null;
		Static173.aClass1_Sub1_Sub1_1.anInt5056 = 0;
		Static180.method2776();
		Static26.method3179();
		for (@Pc(31) int local31 = 0; local31 < 2048; local31++) {
			Static311.aClass26_Sub2_Sub2_Sub1Array1[local31] = null;
		}
		Static196.aClass26_Sub2_Sub2_Sub1_1 = null;
		for (@Pc(45) int local45 = 0; local45 < Static410.aClass26_Sub2_Sub2_Sub2Array1.length; local45++) {
			@Pc(51) Class26_Sub2_Sub2_Sub2 local51 = Static410.aClass26_Sub2_Sub2_Sub2Array1[local45];
			if (local51 != null) {
				local51.anInt7090 = -1;
			}
		}
		Static82.method1410();
		Static310.anInt5540 = 1;
		Static455.method4431(30);
		for (@Pc(75) int local75 = 0; local75 < 100; local75++) {
			Static22.aBooleanArray12[local75] = true;
		}
		Static296.method2398();
		Static228.aLong129 = 0L;
		Static175.aClass1_Sub25_2 = null;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIII)V")
	public static void method824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static51.anIntArrayArray28 != null) {
			Static51.anIntArrayArray28[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static242.aByteArrayArray83 != null) {
			Static242.aByteArrayArray83[arg0][arg1] = (byte) (arg3 >> 3);
		}
		if (Static403.aByteArrayArray135 != null) {
			Static403.aByteArrayArray135[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(IIIII)V")
	public static void method825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 < arg0) {
			Static217.method3280(Static59.anIntArrayArray34[arg3], arg1, arg2, arg0);
		} else {
			Static217.method3280(Static59.anIntArrayArray34[arg3], arg0, arg2, arg1);
		}
	}
}
