import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!s", name = "a", descriptor = "Lclient!sm;")
	public static final Class311 aClass311_11 = new Class311("", 11);

	@OriginalMember(owner = "client!s", name = "i", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_121 = new Class130(84, 4);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method7829(@OriginalArg(0) String arg0) {
		if (Static469.aClass69Array1 != null) {
			@Pc(20) Class3_Sub14 local20 = Static139.method2308(Static525.aClass130_76, Static24.aClass233_1);
			local20.aClass3_Sub3_Sub2_2.method4220(Static161.method2888(arg0));
			local20.aClass3_Sub3_Sub2_2.method4241(arg0);
			Static562.method8096(local20);
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(II)V")
	public static void method7838(@OriginalArg(0) int arg0) {
		if (Static219.method3673(arg0)) {
			Static223.method3723(Static92.aClass279ArrayArray1[arg0], -1);
		}
	}
}
