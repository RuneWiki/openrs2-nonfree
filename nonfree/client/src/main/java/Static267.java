import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!jfa", name = "p", descriptor = "Lclient!gda;")
	public static Class126 aClass126_130;

	@OriginalMember(owner = "client!jfa", name = "m", descriptor = "Lclient!iha;")
	public static final Class168 aClass168_45 = new Class168(8);

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IZI)V")
	public static void method4322(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			@Pc(20) Class5_Sub41 local20 = Static647.method8905(Static438.aClass381_192, Static4.aClass389_17.aClass393_2);
			local20.aClass5_Sub36_Sub2_1.method7296(arg0);
			Static4.aClass389_17.method9079(local20);
		} else {
			Static247.method3961(Static573.aClass208_11, arg0, -1);
		}
	}
}
