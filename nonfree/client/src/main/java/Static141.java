import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!j", name = "r", descriptor = "I")
	public static int anInt867 = 0;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!vk;B)I")
	public static int method931(@OriginalArg(0) Class1_Sub41 arg0) {
		@Pc(7) String local7 = Static137.method2638(arg0);
		@Pc(9) int[] local9 = null;
		if (Static295.method5059(arg0.anInt6339)) {
			local9 = Static241.method4285((int) arg0.aLong206).anIntArray228;
		} else if (Static171.method3408(arg0.anInt6339)) {
			@Pc(71) Class5_Sub3_Sub3_Sub2 local71 = Static169.aClass5_Sub3_Sub3_Sub2Array2[(int) arg0.aLong206];
			if (local71 != null) {
				local9 = local71.aClass122_1.anIntArray452;
			}
		} else if (Static210.method3850(arg0.anInt6339)) {
			if (arg0.anInt6339 == 1008) {
				local9 = Static126.method2405((int) arg0.aLong206).anIntArray695;
			} else {
				local9 = Static126.method2405((int) (arg0.aLong206 >>> 32 & 0x7FFFFFFFL)).anIntArray695;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static195.method3685(local9);
		}
		return Static180.aClass38_5.method1307(Static335.aClass90Array16, local7);
	}
}
