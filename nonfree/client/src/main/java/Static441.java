import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!pca", name = "d", descriptor = "[Lclient!fs;")
	public static Class134[] aClass134Array11;

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "Z")
	public static boolean aBoolean587 = false;

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(III)Z")
	public static boolean method6512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Static667.method9176(arg1, arg2) & Static208.method7683(arg2, arg1);
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(II)V")
	public static void method6513(@OriginalArg(1) int arg0) {
		@Pc(10) Class5_Sub9 local10 = (Class5_Sub9) Static134.aClass291_12.method6993((long) arg0, 1);
		if (local10 != null) {
			local10.aClass272_Sub1_1.method6474();
			Static42.method1537(local10.aBoolean145, local10.anInt1440);
			local10.method9327(1);
		}
	}
}
