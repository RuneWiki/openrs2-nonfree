import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "Lclient!vb;")
	public static final Class368 aClass368_2 = new Class368(3, -1);

	@OriginalMember(owner = "client!bl", name = "o", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_13 = new Class341(40, 3);

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)V")
	public static void method1070(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class2_Sub1_Sub5 local18 = Static653.method9595(19, (long) arg1 | (long) arg0 << 32);
		local18.method2489();
	}
}
