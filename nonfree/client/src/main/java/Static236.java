import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "Lclient!ug;")
	public static Class3_Sub26 aClass3_Sub26_6 = new Class3_Sub26(new byte[5000]);

	@OriginalMember(owner = "client!rf", name = "l", descriptor = "Lclient!fk;")
	public static Class56 aClass56_23 = new Class56();

	@OriginalMember(owner = "client!rf", name = "o", descriptor = "[I")
	public static int[] anIntArray507 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIII)V")
	public static void method3993(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= Static245.anInt6027 && Static111.anInt2039 >= arg1) {
			@Pc(24) int local24 = Static167.method2786(arg0, Static204.anInt4020, Static175.anInt3267);
			@Pc(30) int local30 = Static167.method2786(arg2, Static204.anInt4020, Static175.anInt3267);
			Static224.method4979(local24, local30, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
	public static void method3995() {
		for (@Pc(11) int local11 = -1; local11 < Static152.anInt2869; local11++) {
			@Pc(23) int local23;
			if (local11 == -1) {
				local23 = 2047;
			} else {
				local23 = Static102.anIntArray188[local11];
			}
			@Pc(33) Class10_Sub5_Sub1 local33 = Static52.aClass10_Sub5_Sub1Array1[local23];
			if (local33 != null) {
				Static252.method4274(local33.method4186(), local33);
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIILclient!qf;IJZ)Z")
	public static boolean method3997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class10 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return Static144.method4032(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}
}
