import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!ov", name = "q", descriptor = "[Lclient!nb;")
	public static Class28_Sub1_Sub1[] aClass28_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!ov", name = "o", descriptor = "Lclient!tm;")
	public static final Class338 aClass338_171 = new Class338();

	@OriginalMember(owner = "client!ov", name = "r", descriptor = "Z")
	public static boolean aBoolean515 = false;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIILclient!kp;Lclient!kp;)V")
	public static void method6284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class28_Sub1_Sub4 arg3, @OriginalArg(4) Class28_Sub1_Sub4 arg4) {
		@Pc(4) Class164 local4 = Static408.method5789(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass28_Sub1_Sub4_2 = arg3;
		local4.aClass28_Sub1_Sub4_1 = arg4;
		@Pc(19) int local19 = Static121.aClass21Array2 == Static108.aClass21Array1 ? 1 : 0;
		if (!arg3.method9281()) {
			arg3.aClass28_Sub1_23 = Static198.aClass28_Sub1Array37[local19];
			Static198.aClass28_Sub1Array37[local19] = arg3;
		} else if (arg3.method9287()) {
			arg3.aClass28_Sub1_23 = Static38.aClass28_Sub1Array5[local19];
			Static38.aClass28_Sub1Array5[local19] = arg3;
		} else {
			arg3.aClass28_Sub1_23 = Static539.aClass28_Sub1Array26[local19];
			Static539.aClass28_Sub1Array26[local19] = arg3;
			Static27.aBoolean42 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method9281()) {
			if (arg4.method9287()) {
				arg4.aClass28_Sub1_23 = Static38.aClass28_Sub1Array5[local19];
				Static38.aClass28_Sub1Array5[local19] = arg4;
				return;
			}
			arg4.aClass28_Sub1_23 = Static539.aClass28_Sub1Array26[local19];
			Static539.aClass28_Sub1Array26[local19] = arg4;
			Static27.aBoolean42 = true;
			return;
		}
		arg4.aClass28_Sub1_23 = Static198.aClass28_Sub1Array37[local19];
		Static198.aClass28_Sub1Array37[local19] = arg4;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(ZI)V")
	public static void method6285(@OriginalArg(0) boolean arg0) {
		for (@Pc(6) Class3_Sub8 local6 = (Class3_Sub8) Static134.aClass338_72.method8177(); local6 != null; local6 = (Class3_Sub8) Static134.aClass338_72.method8168()) {
			if (local6.aClass3_Sub1_Sub1_1 != null) {
				Static313.aClass3_Sub1_Sub2_1.method931(local6.aClass3_Sub1_Sub1_1);
				local6.aClass3_Sub1_Sub1_1 = null;
			}
			if (local6.aClass3_Sub1_Sub1_2 != null) {
				Static313.aClass3_Sub1_Sub2_1.method931(local6.aClass3_Sub1_Sub1_2);
				local6.aClass3_Sub1_Sub1_2 = null;
			}
			local6.method9380();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(55) Class3_Sub8 local55 = (Class3_Sub8) Static120.aClass338_66.method8177(); local55 != null; local55 = (Class3_Sub8) Static120.aClass338_66.method8168()) {
			if (local55.aClass3_Sub1_Sub1_1 != null) {
				Static313.aClass3_Sub1_Sub2_1.method931(local55.aClass3_Sub1_Sub1_1);
				local55.aClass3_Sub1_Sub1_1 = null;
			}
			local55.method9380();
		}
		for (@Pc(82) Class3_Sub8 local82 = (Class3_Sub8) Static533.aClass83_35.method2375(); local82 != null; local82 = (Class3_Sub8) Static533.aClass83_35.method2370()) {
			if (local82.aClass3_Sub1_Sub1_1 != null) {
				Static313.aClass3_Sub1_Sub2_1.method931(local82.aClass3_Sub1_Sub1_1);
				local82.aClass3_Sub1_Sub1_1 = null;
			}
			local82.method9380();
		}
	}
}
