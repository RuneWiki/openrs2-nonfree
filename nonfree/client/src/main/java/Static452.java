import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "F")
	public static float aFloat156;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "Ljava/lang/Object;")
	public static Object anObject20;

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "Lclient!si;")
	public static final Class338 aClass338_41 = new Class338(64);

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method6701(@OriginalArg(0) String arg0) {
		if (Static303.aClass101Array1 == null) {
			return;
		}
		@Pc(19) Class400 local19 = Static81.method1057();
		@Pc(25) Class3_Sub48 local25 = Static89.method1200(Static495.aClass286_83, local19.aClass399_2);
		local25.aClass3_Sub28_Sub2_1.method5329(Static605.method8305(arg0));
		local25.aClass3_Sub28_Sub2_1.method5283(arg0);
		local19.method9223(local25);
	}
}
