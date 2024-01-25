import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
	public static int anInt10825;

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
	public static int anInt10826;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILclient!aka;IIII)V")
	public static void method9171(@OriginalArg(1) Class18 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 < 1 || arg2 < 1 || arg1 > Static491.anInt9856 - 2 || arg2 > Static393.anInt6574 - 2) {
			return;
		}
		if (Static441.aClass351ArrayArrayArray1 == null) {
			return;
		}
		@Pc(32) Interface18 local32 = Static577.aClass310_Sub1_2.method7927(arg3, arg2, arg1, arg4);
		if (local32 == null) {
			return;
		}
		if (local32 instanceof Class2_Sub1_Sub1_Sub2) {
			((Class2_Sub1_Sub1_Sub2) local32).method2796(arg0);
		} else if (local32 instanceof Class2_Sub1_Sub3_Sub2) {
			((Class2_Sub1_Sub3_Sub2) local32).method3561(arg0);
		} else if (local32 instanceof Class2_Sub1_Sub2_Sub2) {
			((Class2_Sub1_Sub2_Sub2) local32).method1885(arg0);
		} else if (local32 instanceof Class2_Sub1_Sub4_Sub1) {
			((Class2_Sub1_Sub4_Sub1) local32).method3963(arg0);
		}
	}
}
