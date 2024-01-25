import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static526 {

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)Lclient!gaa;")
	public static Class108 method6818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class108 local7 = Static113.method8285(arg1);
		if (arg0 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass108Array1 == null || arg0 >= local7.aClass108Array1.length) {
			return null;
		} else {
			return local7.aClass108Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)I")
	public static int method6819(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Z)V")
	public static void method6820(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static170.aClass106ArrayArrayArray1 = Static185.aClass106ArrayArrayArray2;
			Static500.aClass274Array2 = Static524.aClass274Array3;
		} else {
			Static170.aClass106ArrayArrayArray1 = Static360.aClass106ArrayArrayArray3;
			Static500.aClass274Array2 = Static445.aClass274Array1;
		}
		Static626.anInt10336 = Static170.aClass106ArrayArrayArray1.length;
	}
}
