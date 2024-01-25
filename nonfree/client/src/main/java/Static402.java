import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!nq", name = "o", descriptor = "I")
	public static int anInt6759;

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(II)V")
	public static void method5853(@OriginalArg(1) int arg0) {
		@Pc(17) Class5_Sub1_Sub18 local17 = Static123.method1827((long) arg0, 3);
		local17.method7444();
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method5854(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg8 != -65536) {
			method5854(91, -115, -90, 64, -112, 94, -109, 27, 106);
		}
		Static489.method6888(arg1, arg6, arg7, arg5, arg3, arg0, arg2, arg4, 0);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILclient!wq;)V")
	public static void method5855(@OriginalArg(1) Class5_Sub36 arg0) {
		for (@Pc(8) int local8 = 0; local8 < Static41.anInt698; local8++) {
			@Pc(16) int local16 = arg0.method7306();
			@Pc(20) int local20 = arg0.method7333();
			if (local20 == 65535) {
				local20 = -1;
			}
			if (Static186.aClass51_Sub1Array1[local16] != null) {
				Static186.aClass51_Sub1Array1[local16].anInt3943 = local20;
			}
		}
		anInt6759++;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BIIII)V")
	public static void method5857(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 - arg3 >= Static230.anInt3962 && Static463.anInt7530 >= arg0 + arg3 && arg2 - arg3 >= Static573.anInt8986 && arg3 + arg2 <= Static319.anInt5445) {
			Static319.method4900(arg1, arg2, arg3, arg0);
		} else {
			Static192.method6451(arg2, arg1, arg0, arg3);
		}
	}
}
