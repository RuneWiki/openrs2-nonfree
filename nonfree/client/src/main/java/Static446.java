import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V")
	public static void method6667() {
		if (Static189.aClass89_3 != null) {
			Static189.aClass89_3.method4209();
		}
		if (Static320.aClass89_5 != null) {
			Static320.aClass89_5.method4209();
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(BIIILclient!ts;)V")
	public static void method6668(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class330 arg3) {
		for (@Pc(18) Class3_Sub31 local18 = (Class3_Sub31) Static402.aClass216_51.method5457(); local18 != null; local18 = (Class3_Sub31) Static402.aClass216_51.method5458()) {
			if (arg2 == local18.anInt5940 && local18.anInt5941 == arg0 << 9 && arg1 << 9 == local18.anInt5937 && arg3.anInt9240 == local18.aClass330_1.anInt9240) {
				if (local18.aClass3_Sub3_Sub5_3 != null) {
					Static304.aClass3_Sub3_Sub3_3.method2976(local18.aClass3_Sub3_Sub5_3);
					local18.aClass3_Sub3_Sub5_3 = null;
				}
				if (local18.aClass3_Sub3_Sub5_4 != null) {
					Static304.aClass3_Sub3_Sub3_3.method2976(local18.aClass3_Sub3_Sub5_4);
					local18.aClass3_Sub3_Sub5_4 = null;
				}
				local18.method8682();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(II)V")
	public static void method6672(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub7_Sub5 local12 = Static138.method2377(3, arg0);
		local12.method1473();
	}
}
