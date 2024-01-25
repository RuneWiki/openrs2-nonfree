import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!sca", name = "h", descriptor = "[Lclient!pd;")
	public static Class15_Sub8[] aClass15_Sub8Array1;

	@OriginalMember(owner = "client!sca", name = "g", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_95 = new Class257(43, 3);

	@OriginalMember(owner = "client!sca", name = "i", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_121 = new Class71(120, 0);

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIILclient!v;Lclient!v;)V")
	public static void method7331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class15_Sub1_Sub5 arg3, @OriginalArg(4) Class15_Sub1_Sub5 arg4) {
		@Pc(4) Class56 local4 = Static262.method4601(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass15_Sub1_Sub5_1 = arg3;
		local4.aClass15_Sub1_Sub5_2 = arg4;
		@Pc(19) int local19 = Static34.aClass86Array5 == Static253.aClass86Array4 ? 1 : 0;
		if (!arg3.method8320()) {
			arg3.aClass15_Sub1_23 = Static16.aClass15_Sub1Array1[local19];
			Static16.aClass15_Sub1Array1[local19] = arg3;
		} else if (arg3.method8328()) {
			arg3.aClass15_Sub1_23 = Static351.aClass15_Sub1Array4[local19];
			Static351.aClass15_Sub1Array4[local19] = arg3;
		} else {
			arg3.aClass15_Sub1_23 = Static234.aClass15_Sub1Array3[local19];
			Static234.aClass15_Sub1Array3[local19] = arg3;
			Static147.aBoolean271 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method8320()) {
			if (arg4.method8328()) {
				arg4.aClass15_Sub1_23 = Static351.aClass15_Sub1Array4[local19];
				Static351.aClass15_Sub1Array4[local19] = arg4;
				return;
			}
			arg4.aClass15_Sub1_23 = Static234.aClass15_Sub1Array3[local19];
			Static234.aClass15_Sub1Array3[local19] = arg4;
			Static147.aBoolean271 = true;
			return;
		}
		arg4.aClass15_Sub1_23 = Static16.aClass15_Sub1Array1[local19];
		Static16.aClass15_Sub1Array1[local19] = arg4;
	}

	@OriginalMember(owner = "client!sca", name = "c", descriptor = "(I)Z")
	public static boolean method7335() {
		return Static548.anInt9471 > 0;
	}
}
