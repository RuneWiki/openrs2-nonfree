import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!po", name = "q", descriptor = "Lclient!wu;")
	public static Class380 aClass380_102;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!ua;I)V")
	public static void method6016(@OriginalArg(0) Class2_Sub13 arg0) {
		if (arg0.aClass2_Sub1_6 != null) {
			arg0.aClass2_Sub1_6.anInt13 = 0;
		}
		arg0.aBoolean719 = false;
		for (@Pc(22) Class2_Sub13 local22 = arg0.method8178(); local22 != null; local22 = arg0.method8174()) {
			method6016(local22);
		}
	}
}
