import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!qn", name = "v", descriptor = "I")
	public static final int anInt7677 = -1;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IZZIIII)V")
	public static void method6724(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 >= arg4) {
			return;
		}
		@Pc(13) int local13 = (arg3 + arg4) / 2;
		@Pc(15) int local15 = arg3;
		@Pc(19) Class362_Sub1 local19 = Static537.aClass362_Sub1Array1[local13];
		Static537.aClass362_Sub1Array1[local13] = Static537.aClass362_Sub1Array1[arg4];
		Static537.aClass362_Sub1Array1[arg4] = local19;
		for (@Pc(31) int local31 = arg3; local31 < arg4; local31++) {
			if (Static411.method6041(arg1, arg0, local19, arg5, arg2, Static537.aClass362_Sub1Array1[local31]) <= 0) {
				@Pc(47) Class362_Sub1 local47 = Static537.aClass362_Sub1Array1[local31];
				Static537.aClass362_Sub1Array1[local31] = Static537.aClass362_Sub1Array1[local15];
				Static537.aClass362_Sub1Array1[local15++] = local47;
			}
		}
		Static537.aClass362_Sub1Array1[arg4] = Static537.aClass362_Sub1Array1[local15];
		Static537.aClass362_Sub1Array1[local15] = local19;
		method6724(arg0, arg1, arg2, arg3, local15 - 1, arg5);
		method6724(arg0, arg1, arg2, local15 + 1, arg4, arg5);
	}
}
