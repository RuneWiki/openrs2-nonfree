import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!fq", name = "h", descriptor = "Lclient!kr;")
	public static Class46 aClass46_7;

	@OriginalMember(owner = "client!fq", name = "ab", descriptor = "I")
	public static int anInt2078;

	@OriginalMember(owner = "client!fq", name = "cb", descriptor = "I")
	public static int anInt2079;

	@OriginalMember(owner = "client!fq", name = "Fb", descriptor = "[Lclient!s;")
	public static Class105[] aClass105Array2;

	@OriginalMember(owner = "client!fq", name = "i", descriptor = "I")
	public static int anInt2051 = 0;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(BIIZ)I")
	public static int method1999(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(17) Class2_Sub21 local17 = Static238.method4329(arg2, arg1);
		if (local17 == null) {
			return -1;
		} else if (arg0 >= 0 && local17.anIntArray245.length > arg0) {
			return local17.anIntArray245[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IB)Z")
	public static boolean method2004(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(II)V")
	public static void method2006(@OriginalArg(0) int arg0) {
		Static75.anInt1406 = arg0;
		@Pc(7) Class107 local7 = Static88.aClass107_10;
		synchronized (Static88.aClass107_10) {
			Static88.aClass107_10.method3015();
		}
		local7 = Static224.aClass107_53;
		synchronized (Static224.aClass107_53) {
			Static224.aClass107_53.method3015();
		}
		local7 = Static356.aClass107_59;
		synchronized (Static356.aClass107_59) {
			Static356.aClass107_59.method3015();
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIIBLclient!mr;II)V")
	public static void method2008(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class1_Sub2_Sub3 arg2, @OriginalArg(6) int arg3) {
		Static30.method404(arg2.anInt6893, arg2.anInt6888, arg2.aByte77, arg0, arg1, 0, arg3);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lclient!iq;Z)V")
	public static void method2010(@OriginalArg(0) Class104 arg0) {
		Static212.aClass104_118 = arg0;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lclient!qn;III[Z)V")
	public static void method2012(@OriginalArg(0) Class2_Sub9_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static9.aClass105Array1 == Static121.aClass105Array3) {
			return;
		}
		@Pc(9) int local9 = aClass105Array2[arg1].method4452(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class105 local22 = aClass105Array2[local11];
				if (local22 != null) {
					local22.method4456(arg0, arg2, local9 - local22.method4452(arg2, arg3), arg3);
				}
			}
		}
	}
}
