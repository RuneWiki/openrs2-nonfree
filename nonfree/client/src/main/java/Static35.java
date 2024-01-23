import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
	public static int anInt735;

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "F")
	public static float aFloat23;

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
	public static int anInt746 = 0;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZI)Lclient!le;")
	public static Class104 method636(@OriginalArg(1) int arg0) {
		@Pc(10) Class104 local10 = (Class104) Static214.aClass31_34.method852((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static30.aClass7_34.method253(Static10.method211(arg0), Static89.method1465(arg0));
		local10 = new Class104();
		local10.anInt2819 = arg0;
		if (local25 != null) {
			local10.method2354(new Class1_Sub18(local25));
		}
		local10.method2352();
		if (local10.aBoolean205) {
			local10.aBoolean202 = false;
			local10.anInt2810 = 0;
		}
		if (!Static183.aBoolean435 && local10.aBoolean210) {
			local10.aStringArray13 = null;
		}
		Static214.aClass31_34.method851(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
	public static void method638() {
		@Pc(3) int local3 = 0;
		for (@Pc(14) int local14 = 0; local14 < 104; local14++) {
			for (@Pc(19) int local19 = 0; local19 < 104; local19++) {
				if (Static165.method2521(local14, true, local19, Static130.aClass1_Sub19ArrayArrayArray1, local3)) {
					local3++;
				}
				if (local3 >= 512) {
					return;
				}
			}
		}
	}
}
