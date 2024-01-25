import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!tm", name = "P", descriptor = "I")
	public static int anInt8744 = 0;

	@OriginalMember(owner = "client!tm", name = "S", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_140 = new Class98(9, 14);

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "(III)V")
	public static void method6951(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class6_Sub5_Sub8 local15 = Static49.method760(1, arg0);
		local15.method3256();
		local15.anInt3740 = arg1;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIII)I")
	public static int method6952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 >= arg2) {
			return arg0 < arg1 ? arg0 : arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "(II)V")
	public static void method6953(@OriginalArg(1) int arg0) {
		Static271.aLong100 = 1000000000L / (long) arg0;
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(B)V")
	public static void method6954() {
		Static333.anInt6355 = 0;
		for (@Pc(9) int local9 = 0; local9 < 2048; local9++) {
			Static76.aClass6_Sub12Array1[local9] = null;
			Static507.aByteArray104[local9] = 1;
			Static252.aClass83Array1[local9] = null;
		}
	}
}
