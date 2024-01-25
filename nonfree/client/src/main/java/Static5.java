import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!aca", name = "w", descriptor = "Lclient!sm;")
	public static final Class311 aClass311_4 = new Class311("", 13);

	@OriginalMember(owner = "client!aca", name = "B", descriptor = "F")
	public static float aFloat84 = 1.0F;

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(Lclient!qk;ZI)V")
	public static void method3192(@OriginalArg(0) Class279 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(15) int local15 = arg0.anInt8219 == 0 ? arg0.anInt8153 : arg0.anInt8219;
		@Pc(27) int local27 = arg0.anInt8131 == 0 ? arg0.anInt8141 : arg0.anInt8131;
		Static388.method6233(arg0.anInt8185, arg1, local15, Static92.aClass279ArrayArray1[arg0.anInt8185 >> 16], local27);
		if (arg0.aClass279Array2 != null) {
			Static388.method6233(arg0.anInt8185, arg1, local15, arg0.aClass279Array2, local27);
		}
		@Pc(64) Class3_Sub29 local64 = (Class3_Sub29) Static356.aClass280_29.method7107((long) arg0.anInt8185);
		if (local64 != null) {
			Static188.method3219(local27, arg1, local64.anInt4601, local15);
		}
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method3194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class77 local7 = Static330.aClass77ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class128 local13 = local7.aClass128_1; local13 != null; local13 = local13.aClass128_2) {
			@Pc(17) Class4_Sub1_Sub2 local17 = local13.aClass4_Sub1_Sub2_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort118 == arg1 && local17.aShort116 == arg2) {
				Static371.method6017(local17, false);
				return;
			}
		}
	}
}
