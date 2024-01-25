import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
	public static int anInt7466;

	@OriginalMember(owner = "client!vh", name = "o", descriptor = "Lclient!wp;")
	public static final Class273 aClass273_8 = new Class273();

	@OriginalMember(owner = "client!vh", name = "r", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_115 = new Class21("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIBI)V")
	public static void method6001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1003) {
			Static64.method1466(Static302.aClass131_6, arg1, arg0);
		} else if (arg2 == 1004) {
			Static64.method1466(Static364.aClass131_7, arg1, arg0);
		} else if (arg2 == 1011) {
			Static64.method1466(Static427.aClass131_9, arg1, arg0);
		} else if (arg2 == 1006) {
			Static64.method1466(Static400.aClass131_8, arg1, arg0);
		} else if (arg2 == 1009) {
			Static64.method1466(Static93.aClass131_3, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(II[I[IZ)V")
	public static void method6003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (arg0 <= arg1) {
			return;
		}
		@Pc(10) int local10 = (arg0 + arg1) / 2;
		@Pc(12) int local12 = arg1;
		@Pc(16) int local16 = arg3[local10];
		arg3[local10] = arg3[arg0];
		arg3[arg0] = local16;
		@Pc(30) int local30 = arg2[local10];
		arg2[local10] = arg2[arg0];
		arg2[arg0] = local30;
		@Pc(47) int local47 = local16 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(49) int local49 = arg1; local49 < arg0; local49++) {
			if (arg3[local49] < (local49 & local47) + local16) {
				@Pc(64) int local64 = arg3[local49];
				arg3[local49] = arg3[local12];
				arg3[local12] = local64;
				@Pc(78) int local78 = arg2[local49];
				arg2[local49] = arg2[local12];
				arg2[local12++] = local78;
			}
		}
		arg3[arg0] = arg3[local12];
		arg3[local12] = local16;
		arg2[arg0] = arg2[local12];
		arg2[local12] = local30;
		method6003(local12 - 1, arg1, arg2, arg3);
		method6003(arg0, local12 + 1, arg2, arg3);
	}
}
