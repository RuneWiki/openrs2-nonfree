import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
	public static int anInt2571;

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
	public static int anInt2572;

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString178 = "cyan:";

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)Lclient!am;")
	public static Class7_Sub1_Sub2 method2182(@OriginalArg(0) int arg0) {
		@Pc(10) Class7_Sub1_Sub2 local10 = (Class7_Sub1_Sub2) Static345.aClass154_9.method4079((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static108.aClass180_14.method4560(arg0, 11);
		local10 = new Class7_Sub1_Sub2();
		if (local20 != null) {
			local10.method195(new Class7_Sub3(local20));
		}
		Static345.aClass154_9.method4078(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
	public static void method2183(@OriginalArg(0) int arg0) {
		Static54.anInt1423 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static346.anInt6536; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static174.anInt3604; local6++) {
				if (Static229.aClass49ArrayArrayArray6[arg0][local3][local6] == null) {
					Static229.aClass49ArrayArrayArray6[arg0][local3][local6] = new Class49(arg0, local3, local6);
				}
			}
		}
	}
}
