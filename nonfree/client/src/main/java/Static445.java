import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!pg", name = "o", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_70 = new Class305(17, 7);

	@OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
	public static final int anInt7653 = -1;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIIII)V")
	public static void method6462(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static106.anInt2266 <= arg0 && Static669.anInt10712 >= arg1 && arg2 >= Static639.anInt10384 && Static496.anInt8305 >= arg3) {
			Static566.method7771(arg0, arg4, arg6, arg1, arg3, arg2, arg5);
		} else {
			Static571.method7885(arg4, arg3, arg5, arg1, arg2, arg6, arg0);
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!mc;I)V")
	public static void method6465(@OriginalArg(0) Class5_Sub41 arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static443.anInt7640; local12++) {
			@Pc(18) int local18 = arg0.method7812();
			@Pc(22) int local22 = arg0.method7860();
			if (local22 == 65535) {
				local22 = -1;
			}
			if (Static192.aClass6_Sub1Array1[local18] != null) {
				Static192.aClass6_Sub1Array1[local18].anInt53 = local22;
			}
		}
	}
}
