import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static574 {

	@OriginalMember(owner = "client!tia", name = "r", descriptor = "I")
	public static int anInt9618;

	@OriginalMember(owner = "client!tia", name = "l", descriptor = "I")
	public static int anInt9620;

	@OriginalMember(owner = "client!tia", name = "k", descriptor = "I")
	public static int anInt9622 = 0;

	@OriginalMember(owner = "client!tia", name = "s", descriptor = "I")
	public static int anInt9623 = 100;

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(Lclient!te;Lclient!te;Z)V")
	public static void method8244(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class8 arg1) {
		if (arg0.aClass8_67 != null) {
			arg0.method8893();
		}
		arg0.aClass8_67 = arg1.aClass8_67;
		arg0.aClass8_68 = arg1;
		arg0.aClass8_67.aClass8_68 = arg0;
		arg0.aClass8_68.aClass8_67 = arg0;
	}
}
