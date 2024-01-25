import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "[Lclient!cma;")
	public static Class61[] aClass61Array1;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(JB)V")
	public static void method3852(@OriginalArg(0) long arg0) {
		Static280.aCalendar2.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)V")
	public static void method3855(@OriginalArg(0) int arg0) {
		if (!Static221.method3276(arg0)) {
			return;
		}
		@Pc(23) Class270[] local23 = Static172.aClass270ArrayArray2[arg0];
		for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
			@Pc(31) Class270 local31 = local23[local25];
			if (local31 != null && local31.aClass45_8 != null) {
				local31.aClass45_8.method6591();
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BLclient!ika;)Lclient!hi;")
	public static Class55_Sub2 method3856(@OriginalArg(1) Class3_Sub2 arg0) {
		return new Class55_Sub2(arg0.method2017(), arg0.method2017(), arg0.method2017(), arg0.method2017(), arg0.method2061(), arg0.method2061(), arg0.method2048(255));
	}
}
