import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!nk;B)V", line = 3)
	public static void method1626(@OriginalArg(0) Class161 arg0) {
		@Pc(7) Class161 local7 = Static7.method6466(arg0);
		@Pc(13) int local13;
		@Pc(11) int local11;
		if (local7 == null) {
			local11 = Static161.anInt3295;
			local13 = Static231.anInt4656;
		} else {
			local11 = local7.anInt4255;
			local13 = local7.anInt4242;
		}
		Static346.method6257(local11, local13, false, arg0);
		Static264.method4940(arg0, local13, local11);
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(III)I", line = 967)
	public static int method1634(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Class190.anIntArray367[arg0 & 0x3] : 256;
	}
}
