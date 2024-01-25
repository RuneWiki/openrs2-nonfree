import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static458 {

	@OriginalMember(owner = "client!qh", name = "K", descriptor = "I")
	public static int anInt8431 = 0;

	@OriginalMember(owner = "client!qh", name = "M", descriptor = "Lclient!eq;")
	public static final Class99 aClass99_62 = new Class99(16);

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(Z)Z")
	public static boolean method7145() {
		return Static127.aBoolean252;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILclient!eh;Lclient!eh;)V")
	public static void method7147(@OriginalArg(1) Class2 arg0, @OriginalArg(2) Class2 arg1) {
		if (arg0.aClass2_300 != null) {
			arg0.method9253();
		}
		arg0.aClass2_300 = arg1.aClass2_300;
		arg0.aClass2_299 = arg1;
		arg0.aClass2_300.aClass2_299 = arg0;
		arg0.aClass2_299.aClass2_300 = arg0;
	}
}
