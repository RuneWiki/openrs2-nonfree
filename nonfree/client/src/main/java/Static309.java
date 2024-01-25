import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!po", name = "L", descriptor = "F")
	public static float aFloat152;

	@OriginalMember(owner = "client!po", name = "O", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_184 = new Class186(71, 9);

	@OriginalMember(owner = "client!po", name = "R", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_185 = new Class186(16, 10);

	@OriginalMember(owner = "client!po", name = "S", descriptor = "Lclient!jr;")
	public static final Class132 aClass132_1 = new Class132();

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!oa;BLjava/lang/String;Z)V")
	public static void method4260(@OriginalArg(0) Class105 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		@Pc(21) int local21 = Static254.aClass215_7.method4969(250, null, arg1);
		@Pc(30) int local30 = Static254.aClass215_7.method4968(null, 250, arg1) * 13;
		Static16.aClass30_11.NA(6, 6, local21 + 4 + 4, local30 + 8, -16777216, 0);
		Static16.aClass30_11.method4645(6, 6, local21 + 4 + 4, local30 + 4 - -4, -1, 0);
		arg0.method5610(local30, -1, 0, 0, 1, null, null, -1, null, 10, 10, arg1, local21);
		Static436.method5629(local21 + 4 + 4, 6, local30 + 4 + 4, 6);
		if (arg2) {
			Static16.aClass30_11.method4704();
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIB)Z")
	public static boolean method4261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static10.method287(arg1, arg0) || Static74.method1341(arg0, arg1);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ICLjava/lang/String;)I")
	public static int method4263(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg1.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			if (arg0 == arg1.charAt(local12)) {
				local7++;
			}
		}
		return local7;
	}
}
