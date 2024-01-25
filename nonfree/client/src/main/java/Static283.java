import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!ir", name = "s", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_130 = new Class349(5, -1);

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "I")
	public static int anInt8842 = 0;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(12) Class2_Sub46 local12 = null;
		for (@Pc(17) Class2_Sub46 local17 = (Class2_Sub46) Static237.aClass60_235.method1226(7); local17 != null; local17 = (Class2_Sub46) Static237.aClass60_235.method1228()) {
			if (local17.anInt7506 == arg2 && local17.anInt7501 == arg0 && arg4 == local17.anInt7498 && local17.anInt7508 == arg6) {
				local12 = local17;
				break;
			}
		}
		if (local12 == null) {
			local12 = new Class2_Sub46();
			local12.anInt7508 = arg6;
			local12.anInt7506 = arg2;
			local12.anInt7498 = arg4;
			local12.anInt7501 = arg0;
			if (arg0 >= 0 && arg4 >= 0 && arg0 < Static426.anInt6942 && arg4 < Static280.anInt6752) {
				Static80.method1204(local12);
			}
			Static237.aClass60_235.method1233(local12);
		}
		local12.aBoolean653 = true;
		local12.anInt7510 = arg3;
		local12.anInt7505 = arg5;
		local12.anInt7507 = arg1;
		local12.aBoolean652 = false;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILclient!ha;Lclient!oh;III)V")
	public static void method7820(@OriginalArg(0) int arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) Class273 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(3) int local3 = 7; local3 >= 0; local3--) {
			for (@Pc(9) int local9 = 127; local9 >= 0; local9--) {
				Static669.method9116(false, true);
				@Pc(33) int local33 = local9 & 0x7F | (arg3 & 0x3F) << 10 | (local3 & 0x7) << 7;
				@Pc(37) int local37 = Static555.anIntArray633[local33];
				Static503.method2433(false, true);
				arg1.aa((local9 * arg2.anInt7402 >> 7) + arg0, arg4 + ((-local3 + 7) * arg2.anInt7385 >> 3), (arg2.anInt7402 >> 7) + 1, (arg2.anInt7385 >> 3) + 1, local37, 0);
			}
		}
		if (false) {
			method7819(116, -72, -24, -31, -52, -30, -39);
		}
	}
}
