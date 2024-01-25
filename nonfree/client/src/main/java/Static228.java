import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!hga", name = "r", descriptor = "I")
	public static int anInt4189;

	@OriginalMember(owner = "client!hga", name = "n", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_75 = new Class359(128, 0);

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(III)Z")
	public static boolean method3553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIILclient!cda;Lclient!cda;)V")
	public static void method3555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class28_Sub1_Sub3 arg3, @OriginalArg(4) Class28_Sub1_Sub3 arg4) {
		@Pc(4) Class226 local4 = Static288.method4659(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass28_Sub1_Sub3_2 = arg3;
		local4.aClass28_Sub1_Sub3_1 = arg4;
		@Pc(19) int local19 = Static495.aClass109Array4 == Static111.aClass109Array3 ? 1 : 0;
		if (!arg3.method8963()) {
			arg3.aClass28_Sub1_23 = Static110.aClass28_Sub1Array1[local19];
			Static110.aClass28_Sub1Array1[local19] = arg3;
		} else if (arg3.method8965()) {
			arg3.aClass28_Sub1_23 = Static135.aClass28_Sub1Array2[local19];
			Static135.aClass28_Sub1Array2[local19] = arg3;
		} else {
			arg3.aClass28_Sub1_23 = Static654.aClass28_Sub1Array5[local19];
			Static654.aClass28_Sub1Array5[local19] = arg3;
			Static375.aBoolean591 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method8963()) {
			if (arg4.method8965()) {
				arg4.aClass28_Sub1_23 = Static135.aClass28_Sub1Array2[local19];
				Static135.aClass28_Sub1Array2[local19] = arg4;
				return;
			}
			arg4.aClass28_Sub1_23 = Static654.aClass28_Sub1Array5[local19];
			Static654.aClass28_Sub1Array5[local19] = arg4;
			Static375.aBoolean591 = true;
			return;
		}
		arg4.aClass28_Sub1_23 = Static110.aClass28_Sub1Array1[local19];
		Static110.aClass28_Sub1Array1[local19] = arg4;
	}
}
