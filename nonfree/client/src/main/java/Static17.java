import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "Lclient!fa;")
	public static Interface3 anInterface3_1;

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "[Lclient!f;")
	public static Class14[] aClass14Array5;

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "[[[Lclient!ru;")
	public static Class299[][][] aClass299ArrayArrayArray1;

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "Lclient!f;")
	public static Class14 aClass14_1;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!wp;I)Lclient!wp;")
	public static Class361 method245(@OriginalArg(0) Class361 arg0) {
		@Pc(6) Class361 local6 = Static71.method1530(arg0);
		if (local6 == null) {
			local6 = arg0.aClass361_18;
		}
		return local6;
	}
}
