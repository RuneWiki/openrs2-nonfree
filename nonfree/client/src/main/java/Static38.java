import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "Lclient!nk;")
	public static Class121 aClass121_88;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "S")
	public static short aShort25 = 32767;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!nk;Lclient!nk;)I")
	public static int method3320(@OriginalArg(1) Class121 arg0, @OriginalArg(2) Class121 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method3140(Static192.anInt3639)) {
			local5++;
		}
		if (arg0.method3140(Static178.anInt3426)) {
			local5++;
		}
		if (arg0.method3140(Static126.anInt1738)) {
			local5++;
		}
		if (arg1.method3140(Static192.anInt3639)) {
			local5++;
		}
		if (arg1.method3140(Static178.anInt3426)) {
			local5++;
		}
		if (arg1.method3140(Static126.anInt1738)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(III)J")
	public static long method3321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub33 local7 = Static105.aClass1_Sub33ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass36_1 == null ? 0L : local7.aClass36_1.aLong44;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZIIIZ)V")
	public static void method3323(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static225.method3497(0, arg1, arg0, arg2, arg3, Static96.aClass29_Sub1Array3.length - 1);
	}
}
