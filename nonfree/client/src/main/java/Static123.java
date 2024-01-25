import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!eca", name = "w", descriptor = "J")
	public static long aLong80 = -1L;

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lclient!he;I)Z")
	public static boolean method2347(@OriginalArg(0) Interface11 arg0) {
		@Pc(10) Class277 local10 = Static652.aClass267_4.method6682(arg0.method9221());
		if (local10.anInt7713 == -1) {
			return true;
		} else {
			@Pc(30) Class194 local30 = Static370.aClass377_4.method9048(local10.anInt7713);
			return local30.anInt5324 == -1 ? true : local30.method4871();
		}
	}
}
