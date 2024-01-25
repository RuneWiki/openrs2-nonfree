import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!pn", name = "N", descriptor = "I")
	public static int anInt8097;

	@OriginalMember(owner = "client!pn", name = "P", descriptor = "Lclient!hu;")
	public static Class150 aClass150_6;

	@OriginalMember(owner = "client!pn", name = "S", descriptor = "Lclient!ok;")
	public static Class262 aClass262_48;

	@OriginalMember(owner = "client!pn", name = "O", descriptor = "Lclient!ef;")
	public static final Class87 aClass87_5 = new Class87();

	@OriginalMember(owner = "client!pn", name = "R", descriptor = "I")
	public static int anInt8099 = 0;

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(II)Z")
	public static boolean method6748(@OriginalArg(0) int arg0) {
		if (arg0 == 46 || arg0 == 60 || arg0 == 50 || arg0 == 53 || arg0 == 22) {
			return true;
		} else {
			return arg0 == 48 || arg0 == 1001;
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZB)V")
	public static void method6749() {
		@Pc(14) Class14_Sub19 local14 = Static286.method4081(Static205.aClass394_1, Static362.aClass100_91);
		Static576.method8234(local14);
		for (@Pc(30) Class14_Sub32 local30 = (Class14_Sub32) Static547.aClass187_69.method4079(); local30 != null; local30 = (Class14_Sub32) Static547.aClass187_69.method4084()) {
			if (!local30.method9314()) {
				local30 = (Class14_Sub32) Static547.aClass187_69.method4079();
				if (local30 == null) {
					break;
				}
			}
			if (local30.anInt6350 == 0) {
				Static446.method6502(local30, true, true);
			}
		}
		if (Static354.aClass230_5 != null) {
			Static634.method8860(Static354.aClass230_5);
			Static354.aClass230_5 = null;
		}
	}
}
