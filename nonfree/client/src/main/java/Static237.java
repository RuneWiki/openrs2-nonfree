import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!jba", name = "w", descriptor = "I")
	public static int anInt4304;

	@OriginalMember(owner = "client!jba", name = "y", descriptor = "I")
	public static int anInt4306;

	@OriginalMember(owner = "client!jba", name = "z", descriptor = "I")
	public static int anInt4307;

	@OriginalMember(owner = "client!jba", name = "u", descriptor = "Lclient!of;")
	public static final Class230 aClass230_29 = new Class230(7, 7);

	@OriginalMember(owner = "client!jba", name = "v", descriptor = "Lclient!su;")
	public static final Class298 aClass298_93 = new Class298();

	@OriginalMember(owner = "client!jba", name = "x", descriptor = "I")
	public static int anInt4305 = 0;

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Ljava/lang/String;ILclient!ta;Z)V")
	public static void method3695(@OriginalArg(0) String arg0, @OriginalArg(2) Class82 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(22) int local22 = Static166.aClass202_9.method4974(arg0, 250, null);
		@Pc(31) int local31 = Static166.aClass202_9.method4976(arg0, 250, null) * 13;
		Static554.aClass90_12.C(6, 6, local22 + 4 + 4, local31 + 4 + 4, -16777216, 0);
		Static554.aClass90_12.method7494(6, 6, local22 + 4 + 4, local31 + 8, -1, 0);
		arg1.method7878(1, null, arg0, local31, null, 0, 1, local22, -1, null, -1, 10, 10, 0);
		Static368.method5431(local31 + 4 + 4, 6, local22 + 4 + 4, 6);
		if (arg2) {
			try {
				Static554.aClass90_12.method7508();
			} catch (@Pc(121) Exception_Sub1 local121) {
			}
		}
	}
}
