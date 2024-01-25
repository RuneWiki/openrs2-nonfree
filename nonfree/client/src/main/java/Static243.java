import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!po", name = "d", descriptor = "I")
	public static int anInt4977 = 0;

	@OriginalMember(owner = "client!po", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString52 = "";

	@OriginalMember(owner = "client!po", name = "r", descriptor = "Lclient!aq;")
	public static Class12 aClass12_14 = null;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(III)V")
	public static void method4380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class194 local7 = Static77.aClass194ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass17_Sub3_1 != null) {
			local7.aClass17_Sub3_1 = null;
		}
		if (local7.aClass17_Sub3_2 != null) {
			local7.aClass17_Sub3_2 = null;
		}
	}
}
