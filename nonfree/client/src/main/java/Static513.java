import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static513 {

	@OriginalMember(owner = "client!vh", name = "k", descriptor = "Lclient!ip;")
	public static Class149 aClass149_5;

	@OriginalMember(owner = "client!vh", name = "V", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray38;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!gp;Lclient!gp;I)V")
	public static void method7094(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class117 arg1) {
		Static453.aClass117_189 = arg0;
		Static456.aClass117_191 = arg1;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/lang/String;Lclient!ra;ZI)V")
	public static void method7097(@OriginalArg(0) String arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(20) int local20 = Static73.aClass256_3.method6112(null, arg0, 250);
		@Pc(29) int local29 = Static73.aClass256_3.method6110(arg0, null, 250) * 13;
		Static110.aClass62_15.f(6, 6, local20 + 4 + 4, 4 + 4 + local29, -16777216, 0);
		Static110.aClass62_15.method7009(6, 6, local20 + 4 + 4, local29 + 4 + 4, -1, 0);
		arg1.method7208(null, -1, -1, local20, 10, 1, local29, null, 0, 10, null, 0, arg0);
		Static340.method5293(6, local29 + 4 + 4, 6, local20 + 4 + 4);
		if (arg2) {
			try {
				Static110.aClass62_15.method7030();
			} catch (@Pc(121) Exception_Sub1 local121) {
			}
		}
	}
}
