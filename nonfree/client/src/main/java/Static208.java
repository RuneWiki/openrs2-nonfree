import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "[Lclient!ir;")
	public static final Class1_Sub2_Sub9[] aClass1_Sub2_Sub9Array2 = new Class1_Sub2_Sub9[14];

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIZIIIIIII)V")
	public static void method3310(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg4 < 128 || arg0 < 128 || Static195.anInt3537 * 128 - 256 < arg4 || Static118.anInt2419 * 128 - 256 < arg0) {
			Static262.anIntArray406[0] = Static262.anIntArray406[1] = -1;
			return;
		}
		@Pc(61) int local61 = Static301.method4312(arg2, arg4, arg0) - arg1;
		Static260.aClass33_4.o(arg6, 0, 0);
		Static415.aClass39_11.ea(Static260.aClass33_4);
		Static415.aClass39_11.X(arg4, local61, arg0, Static262.anIntArray406);
		Static260.aClass33_4.o(-arg6, 0, 0);
		Static415.aClass39_11.ea(Static260.aClass33_4);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIII)V")
	public static void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static38.aClass135_Sub1_1.anInt5110 != 0 && arg0 != 0 && Static259.anInt4646 < 50 && arg1 != -1) {
			Static113.aClass74Array1[Static259.anInt4646++] = new Class74((byte) 2, arg1, arg0, arg2, arg3, 0);
		}
	}
}
