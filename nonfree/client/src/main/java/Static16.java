import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!am", name = "i", descriptor = "Lclient!ks;")
	public static Class47_Sub2_Sub3_Sub2 aClass47_Sub2_Sub3_Sub2_1;

	@OriginalMember(owner = "client!am", name = "e", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_3 = new Class186(72, 3);

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BI)Lclient!lt;")
	public static Class185 method805(@OriginalArg(1) int arg0) {
		@Pc(8) Class185[] local8 = Static508.method7305();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(24) Class185 local24 = local8[local10];
			if (local24.anInt5611 == arg0) {
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!cu;IILclient!cu;ZZI)I")
	public static int method807(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class50_Sub1 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		@Pc(10) int local10 = Static101.method2270(arg5, arg0, arg3, arg1);
		if (local10 != 0) {
			return arg5 ? -local10 : local10;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(33) int local33 = Static101.method2270(arg4, arg0, arg3, arg2);
			return arg4 ? -local33 : local33;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(III)V")
	public static void method808(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static43.method1389(arg1)) {
			Static495.method7107(arg0, Static352.aClass309ArrayArray2[arg1]);
		}
	}
}
