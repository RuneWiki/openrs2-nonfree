import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static449 {

	@OriginalMember(owner = "client!rj", name = "B", descriptor = "[Lclient!ee;")
	public static Class85[] aClass85Array1;

	@OriginalMember(owner = "client!rj", name = "F", descriptor = "Lclient!xa;")
	public static Class71 aClass71_48;

	@OriginalMember(owner = "client!rj", name = "C", descriptor = "I")
	public static int anInt7947 = 0;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILclient!pea;Lclient!pea;)V")
	public static void method6332(@OriginalArg(1) Class6_Sub5 arg0, @OriginalArg(2) Class6_Sub5 arg1) {
		if (arg0.aClass6_Sub5_60 != null) {
			arg0.method7814();
		}
		arg0.aClass6_Sub5_59 = arg1.aClass6_Sub5_59;
		arg0.aClass6_Sub5_60 = arg1;
		arg0.aClass6_Sub5_60.aClass6_Sub5_59 = arg0;
		arg0.aClass6_Sub5_59.aClass6_Sub5_60 = arg0;
	}
}
