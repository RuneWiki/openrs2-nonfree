import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "Lclient!lga;")
	public static Class223 aClass223_39;

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "Lclient!em;")
	public static Class60_Sub1_Sub1_Sub3_Sub1 aClass60_Sub1_Sub1_Sub3_Sub1_1;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "F")
	public static float aFloat71;

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "[I")
	public static int[] anIntArray209 = new int[3];

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIZ)V")
	public static void method3668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(7) int local7 = arg1; local7 <= arg0; local7++) {
			Static367.method5559(-7, arg4, arg3, Static36.anIntArrayArray4[local7], arg2);
		}
		if (false) {
			anIntArray209 = null;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZII)V")
	public static void method3669(@OriginalArg(1) boolean arg0) {
		if (22050 > 48000) {
			throw new IllegalArgumentException();
		}
		Static30.aBoolean32 = arg0;
		Static337.anInt5758 = 2;
		Static90.anInt9479 = 22050;
	}
}
