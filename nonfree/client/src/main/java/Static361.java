import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!os", name = "l", descriptor = "I")
	public static int anInt6737;

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5626(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg0 < 128 || arg3 < 128 || (Static37.anInt7512 - 2) * 128 < arg0 || arg3 > (Static329.anInt6247 - 2) * 128) {
			Static147.anIntArray243[0] = Static147.anIntArray243[1] = -1;
			return;
		}
		@Pc(47) int local47 = Static443.method6717(arg0, arg3, arg4) - arg6;
		Static180.aClass91_5.TA(arg2, 0, 0);
		Static243.aClass42_4.method5855(Static180.aClass91_5);
		Static243.aClass42_4.IA(arg0, local47, arg3, Static147.anIntArray243);
		Static180.aClass91_5.TA(-arg2, 0, 0);
		Static243.aClass42_4.method5855(Static180.aClass91_5);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I[BII)[B")
	public static byte[] method5627(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static554.method3498(arg0, arg1, local6, 0, 32768);
		return local6;
	}
}
