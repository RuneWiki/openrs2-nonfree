import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static548 {

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "F")
	public static float aFloat178;

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "Lclient!dfa;")
	public static final Class74 aClass74_63 = new Class74(16);

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_107 = new Class241(31, 2);

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!ig;Lclient!ig;)V")
	public static void method7755(@OriginalArg(1) Class6_Sub2 arg0, @OriginalArg(2) Class6_Sub2 arg1) {
		if (arg0.aClass6_Sub2_66 != null) {
			arg0.method8464();
		}
		arg0.aClass6_Sub2_65 = arg1.aClass6_Sub2_65;
		arg0.aClass6_Sub2_66 = arg1;
		arg0.aClass6_Sub2_66.aClass6_Sub2_65 = arg0;
		arg0.aClass6_Sub2_65.aClass6_Sub2_66 = arg0;
	}
}
