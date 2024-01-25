import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!nm", name = "y", descriptor = "I")
	public static int anInt6906;

	@OriginalMember(owner = "client!nm", name = "B", descriptor = "F")
	public static float aFloat146;

	@OriginalMember(owner = "client!nm", name = "v", descriptor = "I")
	public static int anInt6903 = 0;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(BLclient!bda;)Z")
	public static boolean method6011(@OriginalArg(1) Interface2 arg0) {
		@Pc(18) Class330 local18 = Static370.aClass284_3.method6915(arg0.method7500());
		if (local18.anInt9201 == -1) {
			return true;
		} else {
			@Pc(30) Class64 local30 = Static383.aClass233_150.method5863(local18.anInt9201);
			return local30.anInt1735 == -1 ? true : local30.method1486();
		}
	}
}
