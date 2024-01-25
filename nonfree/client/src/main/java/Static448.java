import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
	public static int anInt7921;

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_126 = new Class98(76, 17);

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!vw;I)V")
	public static void method6317(@OriginalArg(0) Class6_Sub15 arg0) {
		arg0.aBoolean673 = false;
		if (arg0.aClass6_Sub6_5 != null) {
			arg0.aClass6_Sub6_5.anInt7690 = 0;
		}
		for (@Pc(26) Class6_Sub15 local26 = arg0.method7934(); local26 != null; local26 = arg0.method7937()) {
			method6317(local26);
		}
	}
}
