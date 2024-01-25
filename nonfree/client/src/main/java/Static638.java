import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static638 {

	@OriginalMember(owner = "client!vj", name = "t", descriptor = "I")
	public static int anInt10397;

	@OriginalMember(owner = "client!vj", name = "p", descriptor = "[Lclient!oe;")
	public static Class264[] aClass264Array2;

	@OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
	public static int anInt10399;

	@OriginalMember(owner = "client!vj", name = "z", descriptor = "F")
	public static float aFloat211;

	@OriginalMember(owner = "client!vj", name = "v", descriptor = "I")
	public static int anInt10402;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZLclient!dp;)Z")
	public static boolean method8820(@OriginalArg(1) Interface9 arg0) {
		@Pc(10) Class354 local10 = Static528.aClass243_3.method5556(arg0.method8364());
		if (local10.anInt9418 == -1) {
			return true;
		} else {
			@Pc(24) Class376 local24 = Static201.aClass97_3.method1927(local10.anInt9418);
			return local24.anInt10342 == -1 ? true : local24.method8778();
		}
	}
}
