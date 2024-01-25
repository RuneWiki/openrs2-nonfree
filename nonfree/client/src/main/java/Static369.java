import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!sc", name = "N", descriptor = "I")
	public static int anInt6265;

	@OriginalMember(owner = "client!sc", name = "P", descriptor = "I")
	public static int anInt6267;

	@OriginalMember(owner = "client!sc", name = "Q", descriptor = "Lclient!ot;")
	public static Class63 aClass63_1;

	@OriginalMember(owner = "client!sc", name = "O", descriptor = "I")
	public static int anInt6266 = 0;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!ia;III[Z)V")
	public static void method5155(@OriginalArg(0) Class3_Sub3_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static178.aClass55Array1 == Static349.aClass55Array3) {
			return;
		}
		@Pc(9) int local9 = Static182.aClass55Array2[arg1].R(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class55 local22 = Static182.aClass55Array2[local11];
				if (local22 != null) {
					local22.ia(arg0, arg2, local9 - local22.R(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}
}
