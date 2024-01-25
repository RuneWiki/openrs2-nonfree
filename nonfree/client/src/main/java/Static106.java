import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!dh", name = "Q", descriptor = "Lclient!rl;")
	public static final Class317 aClass317_10 = new Class317(4);

	@OriginalMember(owner = "client!dh", name = "F", descriptor = "I")
	public static int anInt1837 = 1;

	@OriginalMember(owner = "client!dh", name = "N", descriptor = "[I")
	public static int[] anIntArray105 = new int[1];

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!ec;I)V")
	public static void method1763(@OriginalArg(0) Class14_Sub1 arg0) {
		if (arg0.aClass14_Sub19_6 != null) {
			arg0.aClass14_Sub19_6.anInt7679 = 0;
		}
		arg0.aBoolean766 = false;
		for (@Pc(18) Class14_Sub1 local18 = arg0.method9316(); local18 != null; local18 = arg0.method9320()) {
			method1763(local18);
		}
	}
}
