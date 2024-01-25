import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static467 {

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "Lclient!wu;")
	public static final Class394 aClass394_129 = new Class394("", 10);

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
	public static int anInt7867 = 0;

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
	public static int anInt7868 = 0;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BZ)V")
	public static void method6657(@OriginalArg(1) boolean arg0) {
		@Pc(5) int local5 = Static550.anInt9008;
		@Pc(7) int local7 = Static358.anInt6492;
		if (arg0 && Static632.aBoolean877) {
			local5 <<= 0x1;
			local7 = -local5;
		}
		Static208.aClass65_7.f(local7, local5);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIILclient!si;Lclient!si;)V")
	public static void method6658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class28_Sub1_Sub5 arg3, @OriginalArg(4) Class28_Sub1_Sub5 arg4) {
		@Pc(4) Class226 local4 = Static288.method4659(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass28_Sub1_Sub5_2 = arg3;
		local4.aClass28_Sub1_Sub5_1 = arg4;
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
