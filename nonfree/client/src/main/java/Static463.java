import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static463 {

	@OriginalMember(owner = "client!om", name = "q", descriptor = "Lclient!lba;")
	public static Class218 aClass218_36 = new Class218(8);

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(Z)V")
	public static void method6693(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static632.aClass311ArrayArrayArray3 = Static564.aClass311ArrayArrayArray1;
			Static158.aClass133Array4 = Static685.aClass133Array5;
		} else {
			Static632.aClass311ArrayArrayArray3 = Static618.aClass311ArrayArrayArray2;
			Static158.aClass133Array4 = Static126.aClass133Array1;
		}
		Static97.anInt1761 = Static632.aClass311ArrayArrayArray3.length;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(II)Z")
	public static boolean method6694(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}
}
