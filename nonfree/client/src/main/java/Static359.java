import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "F")
	public static float aFloat75 = 1.0F;

	@OriginalMember(owner = "client!sd", name = "v", descriptor = "[I")
	public static final int[] anIntArray464 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!lf;Lclient!lf;B)V")
	public static void method5093(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1) {
		if (arg1.aClass3_262 != null) {
			arg1.method5987();
		}
		arg1.aClass3_262 = arg0.aClass3_262;
		arg1.aClass3_261 = arg0;
		arg1.aClass3_262.aClass3_261 = arg1;
		arg1.aClass3_261.aClass3_262 = arg1;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIZII)V")
	public static void method5095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static210.anInt7501 / (float) Static210.anInt7495;
		@Pc(11) int local11 = arg2;
		@Pc(13) int local13 = arg3;
		if (local9 < 1.0F) {
			local13 = (int) ((float) arg2 * local9);
		} else {
			local11 = (int) ((float) arg3 / local9);
		}
		@Pc(44) int local44 = arg0 - (arg3 - local13) / 2;
		@Pc(53) int local53 = arg1 - (arg2 - local11) / 2;
		Static372.anInt1537 = Static210.anInt7501 - Static210.anInt7501 * local44 / local13;
		Static336.anInt6190 = -1;
		Static189.anInt3807 = local53 * Static210.anInt7495 / local11;
		Static293.anInt3444 = -1;
		Static220.method3501();
	}
}
