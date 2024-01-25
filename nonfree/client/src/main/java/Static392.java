import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!mfa", name = "h", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!mfa", name = "d", descriptor = "F")
	public static float aFloat109;

	@OriginalMember(owner = "client!mfa", name = "i", descriptor = "Z")
	public static boolean aBoolean549 = false;

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "I")
	public static int anInt6487 = -1;

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IIIIII)V")
	public static void method5832(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == arg2) {
			Static313.method4359(arg1, arg3, arg4, arg0);
		} else if (arg3 - arg0 >= Static8.anInt99 && arg0 + arg3 <= Static14.anInt206 && Static617.anInt9501 <= arg1 - arg2 && Static519.anInt8267 >= arg2 + arg1) {
			Static408.method6015(arg4, arg1, arg0, arg3, arg2);
		} else {
			Static657.method9029(arg2, arg4, arg0, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!mfa", name = "c", descriptor = "(III)I")
	public static int method5833(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static351.method4862(arg1 - 1, arg0 + -1) + Static351.method4862(arg1 + 1, arg0 + -1) + Static351.method4862(arg1 - 1, arg0 + 1) + Static351.method4862(arg1 + 1, arg0 + 1);
		@Pc(78) int local78 = Static351.method4862(arg1 - 1, arg0) + Static351.method4862(arg1 + 1, arg0) + Static351.method4862(arg1, arg0 - 1) + Static351.method4862(arg1, arg0 + 1);
		@Pc(83) int local83 = Static351.method4862(arg1, arg0);
		return local41 / 16 + local78 / 8 + local83 / 4;
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(ILclient!vi;)Z")
	public static boolean method5834(@OriginalArg(1) Interface25 arg0) {
		@Pc(18) Class81 local18 = Static148.aClass153_3.method3342(arg0.method8986());
		if (local18.anInt1877 == -1) {
			return true;
		} else {
			@Pc(32) Class46 local32 = Static591.aClass351_6.method8334(local18.anInt1877);
			return local32.anInt1011 == -1 ? true : local32.method909();
		}
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(III)Z")
	public static boolean method5837(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}
}
