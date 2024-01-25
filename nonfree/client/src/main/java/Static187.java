import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "I")
	public static int anInt3785;

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_77 = new Class180(28, 8);

	@OriginalMember(owner = "client!gda", name = "c", descriptor = "I")
	public static int anInt3786 = -2;

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(III)V")
	public static void method3459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class164 local7 = Static15.aClass164ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static346.method5177(local7.aClass28_Sub1_Sub4_2);
		Static346.method5177(local7.aClass28_Sub1_Sub4_1);
		if (local7.aClass28_Sub1_Sub4_2 != null) {
			local7.aClass28_Sub1_Sub4_2 = null;
		}
		if (local7.aClass28_Sub1_Sub4_1 != null) {
			local7.aClass28_Sub1_Sub4_1 = null;
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IIILclient!ie;)V")
	public static void method3461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class28_Sub1_Sub3 arg3) {
		@Pc(4) Class164 local4 = Static408.method5789(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass28_Sub1_Sub3_1 = arg3;
		@Pc(16) int local16 = Static121.aClass21Array2 == Static108.aClass21Array1 ? 1 : 0;
		if (arg3.method9281()) {
			if (arg3.method9287()) {
				arg3.aClass28_Sub1_23 = Static38.aClass28_Sub1Array5[local16];
				Static38.aClass28_Sub1Array5[local16] = arg3;
				return;
			}
			arg3.aClass28_Sub1_23 = Static539.aClass28_Sub1Array26[local16];
			Static539.aClass28_Sub1Array26[local16] = arg3;
			Static27.aBoolean42 = true;
			return;
		}
		arg3.aClass28_Sub1_23 = Static198.aClass28_Sub1Array37[local16];
		Static198.aClass28_Sub1Array37[local16] = arg3;
	}
}
