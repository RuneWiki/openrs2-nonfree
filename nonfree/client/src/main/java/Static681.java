import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static681 {

	@OriginalMember(owner = "client!wn", name = "p", descriptor = "I")
	public static int anInt11083 = 0;

	@OriginalMember(owner = "client!wn", name = "q", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_281 = new Class160(54, 4);

	@OriginalMember(owner = "client!wn", name = "l", descriptor = "I")
	public static int anInt11091 = -1;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(FBFF)F")
	public static float method9394(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return (arg0 - arg2) * arg1 + arg2;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIIIII)V")
	public static void method9396(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static468.anInt7895 <= arg4 && arg0 <= Static382.anInt6719 && Static410.anInt7068 <= arg5 && arg2 <= Static281.anInt5188) {
			if (arg1 == 1) {
				Static330.method5119(arg3, arg0, arg5, arg4, arg2);
			} else {
				Static193.method8387(arg0, arg2, arg1, arg4, arg5, arg3);
			}
		} else if (arg1 == 1) {
			Static546.method8869(arg5, arg4, arg2, arg0, arg3);
		} else {
			Static669.method9280(arg0, arg2, arg1, 4, arg5, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)I")
	public static int method9397(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static496.anInt8374 - 1; local3++) {
			if (arg0 < Static634.anIntArray557[local3] + Static510.anIntArray460[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static496.anInt8374 - 1;
		}
		return local1;
	}
}
