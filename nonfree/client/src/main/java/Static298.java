import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!wl", name = "R", descriptor = "Lclient!uc;")
	public static Class164 aClass164_2 = new Class164();

	@OriginalMember(owner = "client!wl", name = "V", descriptor = "I")
	public static int anInt354 = 0;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!pf;B)I")
	public static int method256(@OriginalArg(0) Class36_Sub3_Sub1 arg0) {
		@Pc(16) int local16 = arg0.anInt4020;
		@Pc(20) Class12 local20 = arg0.method3105();
		if (local20.anInt423 == arg0.anInt4067) {
			local16 = arg0.anInt4036;
		} else if (local20.anInt421 == arg0.anInt4067 || local20.anInt399 == arg0.anInt4067 || local20.anInt413 == arg0.anInt4067 || arg0.anInt4067 == local20.anInt397) {
			local16 = arg0.anInt4032;
		} else if (local20.anInt408 == arg0.anInt4067 || local20.anInt386 == arg0.anInt4067 || local20.anInt416 == arg0.anInt4067 || arg0.anInt4067 == local20.anInt394) {
			local16 = arg0.anInt4046;
		}
		return local16;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIILclient!wd;ILclient!tk;)V")
	public static void method258(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class8_Sub1_Sub7 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class159 arg5) {
		if (arg3 == null) {
			return;
		}
		@Pc(15) int local15 = (int) Static82.aFloat20 + Static121.anInt2437 & 0x7FF;
		@Pc(27) int local27 = Math.max(arg5.anInt5123 / 2, arg5.anInt5121 / 2) + 10;
		@Pc(35) int local35 = arg0 * arg0 + arg2 * arg2;
		if (local27 * local27 < local35) {
			return;
		}
		@Pc(45) int local45 = Class68.anIntArray137[local15];
		@Pc(53) int local53 = local45 * 256 / (Static2.anInt12 + 256);
		@Pc(57) int local57 = Class68.anIntArray139[local15];
		@Pc(65) int local65 = local57 * 256 / (Static2.anInt12 + 256);
		@Pc(75) int local75 = local65 * arg2 + arg0 * local53 >> 16;
		@Pc(85) int local85 = arg0 * local65 - arg2 * local53 >> 16;
		if (Static116.aBoolean188) {
			((Class8_Sub1_Sub7_Sub2) arg3).method2822(arg5.anInt5123 / 2 + arg4 + local75 - arg3.anInt3611 / 2, -(arg3.anInt3610 / 2) + arg5.anInt5121 / 2 + arg1 + -local85, (Class8_Sub1_Sub7_Sub2) arg5.method3892(false));
		} else {
			((Class8_Sub1_Sub7_Sub1) arg3).method1648(arg5.anInt5123 / 2 + arg4 + local75 - arg3.anInt3611 / 2, -(arg3.anInt3610 / 2) + arg5.anInt5121 / 2 + (arg1 - local85), arg5.anIntArray410, arg5.anIntArray409);
		}
	}
}
