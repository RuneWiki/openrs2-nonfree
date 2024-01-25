import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!haa", name = "i", descriptor = "I")
	public static int anInt4496;

	@OriginalMember(owner = "client!haa", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString57 = "";

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(BLclient!tp;)V")
	public static void method3621(@OriginalArg(1) Class331 arg0) {
		@Pc(7) Class331 local7 = Static222.method4170(arg0);
		@Pc(21) int local21;
		@Pc(19) int local19;
		if (local7 == null) {
			local19 = Static313.anInt6355;
			local21 = Static235.anInt5298;
		} else {
			local19 = local7.anInt9505;
			local21 = local7.anInt9553;
		}
		Static615.method8357(false, local21, local19, arg0);
		Static227.method4239(arg0, local19, local21);
	}
}
