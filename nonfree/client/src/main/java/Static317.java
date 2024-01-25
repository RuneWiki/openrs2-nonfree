import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
	public static int anInt9286;

	@OriginalMember(owner = "client!lm", name = "w", descriptor = "Z")
	public static boolean aBoolean656 = false;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(III)Z")
	public static boolean method7576(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static359.method5652(arg0, arg1) | (arg1 & 0x60000) != 0 || Static481.method7140(arg1, arg0) || Static289.method4832(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "(I)I")
	public static int method7579() {
		return Static366.anInt6951;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIILclient!jb;Lclient!jb;)V")
	public static void method7580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class15_Sub1_Sub4 arg3, @OriginalArg(4) Class15_Sub1_Sub4 arg4) {
		@Pc(4) Class56 local4 = Static262.method4601(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass15_Sub1_Sub4_2 = arg3;
		local4.aClass15_Sub1_Sub4_1 = arg4;
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
}
