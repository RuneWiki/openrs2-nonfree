import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
	public static int anInt5156;

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "[I")
	public static int[] anIntArray524;

	@OriginalMember(owner = "client!lf", name = "l", descriptor = "Lclient!kr;")
	public static Class171 aClass171_83;

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "Lclient!vda;")
	public static final Class299 aClass299_5 = new Class299();

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "Lclient!gn;")
	public static final Class110 aClass110_4 = new Class110();

	@OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
	public static int anInt5158 = 0;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/String;BILjava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V")
	public static void method4464(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) Class50 local9 = Static313.aClass50Array1[99];
		for (@Pc(15) int local15 = 99; local15 > 0; local15--) {
			Static313.aClass50Array1[local15] = Static313.aClass50Array1[local15 - 1];
		}
		if (local9 == null) {
			local9 = new Class50(arg1, arg6, arg3, arg0, arg4, arg5, arg2);
		} else {
			local9.method1245(arg2, arg6, arg1, arg5, arg3, arg0, arg4);
		}
		Static313.aClass50Array1[0] = local9;
		Static412.anInt6560 = Static164.anInt2967;
		Static301.anInt5567++;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIII)I")
	public static int method4466(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 4095 - arg0;
		} else {
			return 4095 - arg1;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)Z")
	public static boolean method4467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x70000) != 0 | Static530.method7340(arg0, arg1) || Static399.method6031(arg0, arg1);
	}
}
