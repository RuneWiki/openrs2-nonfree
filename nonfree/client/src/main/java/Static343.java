import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!qw", name = "g", descriptor = "F")
	public static float aFloat81;

	@OriginalMember(owner = "client!qw", name = "i", descriptor = "Lclient!th;")
	public static Class191_Sub1 aClass191_Sub1_3;

	@OriginalMember(owner = "client!qw", name = "e", descriptor = "Z")
	public static boolean aBoolean434 = true;

	@OriginalMember(owner = "client!qw", name = "h", descriptor = "I")
	public static int anInt5785 = 0;

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(III)V")
	public static void method4798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class162 local7 = Static294.aClass162ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 != null && local7.aClass11_Sub1_2 != null) {
			local7.aClass11_Sub1_2 = null;
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method4799(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 < 1 || arg3 < 1 || arg7 > Static193.anInt3853 - 2 || Static301.anInt5585 - 2 < arg3) {
			return;
		}
		@Pc(25) int local25 = arg0;
		if (arg0 < 3 && Static34.method498(arg7, arg3)) {
			local25 = arg0 + 1;
		}
		if (!Static157.aClass185_Sub1_1.method4639(Static192.anInt3828) && !Static404.method5662(arg7, local25, arg3, Static238.anInt4697)) {
			return;
		}
		if (Static294.aClass162ArrayArrayArray2 == null) {
			return;
		}
		Static272.aClass191_Sub1_1.method5581(arg4, Static335.aClass253Array1[arg0], arg3, arg7, arg0, Static30.aClass30_3);
		if (arg2 >= 0) {
			@Pc(69) boolean local69 = Static157.aClass185_Sub1_1.aBoolean400;
			Static157.aClass185_Sub1_1.aBoolean400 = true;
			Static272.aClass191_Sub1_1.method5582(arg0, arg2, Static335.aClass253Array1[arg0], arg7, local25, arg5, arg1, arg6, Static30.aClass30_3, arg3);
			Static157.aClass185_Sub1_1.aBoolean400 = local69;
		}
	}
}
