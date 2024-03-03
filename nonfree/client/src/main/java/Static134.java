import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIBZI)V", line = 3)
	public static void method2679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Class2_Sub2.aLong214 = 0L;
		@Pc(12) int local12 = Static135.method2694();
		if (arg1 == 3 || local12 == 3) {
			arg2 = true;
		}
		if (!Static177.aClass19_8.method2842()) {
			arg2 = true;
		}
		Static153.method3101(arg3, arg0, local12, arg1, arg2);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIB)V", line = 39)
	public static void method2681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class84.anInt2354 == 1) {
			Static239.method4428(Static31.aClass2_Sub5_2, arg1, arg0);
		} else if (Class84.anInt2354 == 2) {
			Static362.method6440(arg1, arg0);
		}
		Class84.anInt2354 = 0;
		Static31.aClass2_Sub5_2 = null;
	}
}
