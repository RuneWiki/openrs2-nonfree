import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static624 {

	@OriginalMember(owner = "client!tia", name = "c", descriptor = "Lclient!vf;")
	public static final Class390 aClass390_10 = new Class390(3, 2);

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(ZIB)V")
	public static void method6748(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg0) {
			@Pc(14) Class3_Sub29 local14 = Static507.method6901(Static397.aClass144_62, Static95.aClass292_2.aClass88_2);
			local14.aClass3_Sub2_Sub1_1.method2032(arg1);
			Static95.aClass292_2.method6855(local14);
		} else {
			Static540.method7162(Static432.aClass78_9, arg1, -1);
		}
	}
}
