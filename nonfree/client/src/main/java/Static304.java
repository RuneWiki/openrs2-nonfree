import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!mi", name = "P", descriptor = "[I")
	public static int[] anIntArray414;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIIII)V")
	public static void method4951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class103 local3 = new Class103();
		local3.anInt3122 = arg1 >> Static193.anInt4311;
		local3.anInt3129 = arg2 >> Static193.anInt4311;
		local3.anInt3131 = arg3 >> Static193.anInt4311;
		local3.anInt3123 = arg4 >> Static193.anInt4311;
		local3.anInt3142 = arg0;
		local3.anInt3135 = arg1;
		local3.anInt3124 = arg2;
		local3.anInt3120 = arg3;
		local3.anInt3136 = arg4;
		local3.anInt3141 = arg5;
		local3.anInt3132 = arg6;
		Static176.aClass103Array2[Static127.anInt2935++] = local3;
	}

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "(I)V")
	public static void method4953() {
		Static271.aClass125_42.method3440();
	}
}
