import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!ct", name = "s", descriptor = "Z")
	public static boolean aBoolean144 = false;

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IB)Lclient!pj;")
	public static Class1_Sub2_Sub13 method1691(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub13 local10 = (Class1_Sub2_Sub13) Static100.aClass105_1.method2605((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static153.aClass69_32.method1888(0, arg0);
		if (local20 == null || local20.length <= 1) {
			return null;
		} else {
			local10 = Static325.method5584(local20);
			Static100.aClass105_1.method2600(local10, (long) arg0);
			return local10;
		}
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(II)V")
	public static void method1694(@OriginalArg(0) int arg0) {
		if (Static283.anInt5391 == 0) {
			Static518.aClass1_Sub4_Sub4_3.method7993(arg0);
		} else {
			Static382.anInt6788 = arg0;
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!et;Lclient!et;I)V")
	public static void method1695(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class91 arg1) {
		Static216.method3997(Static284.aClass252_81);
		Static259.aClass1_Sub17_Sub2_1.method4489(arg1.anInt2368);
		Static259.aClass1_Sub17_Sub2_1.method4459(arg1.anInt2391);
		Static259.aClass1_Sub17_Sub2_1.method4459(arg0.anInt2391);
		Static259.aClass1_Sub17_Sub2_1.method4488(arg0.anInt2368);
		Static259.aClass1_Sub17_Sub2_1.method4473(arg1.anInt2395);
		Static259.aClass1_Sub17_Sub2_1.method4506(arg0.anInt2395);
	}
}
