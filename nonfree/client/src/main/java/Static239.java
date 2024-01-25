import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "Z")
	public static boolean aBoolean298 = false;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIILclient!ya;I)Lclient!t;")
	public static Class116 method3206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class135 arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg2;
		@Pc(12) Class116 local12 = (Class116) Static242.aClass137_44.method2744(local6);
		if (local12 == null) {
			@Pc(34) Class166 local34 = Static305.method3992(arg2, Static8.aClass211_5);
			if (local34 == null) {
				return null;
			}
			if (local34.anInt4010 < 13) {
				local34.method3203();
			}
			local12 = arg4.method5391(local34, 2055, Static245.anInt4066, 64, 768);
			Static242.aClass137_44.method2732(local6, local12);
		}
		local12 = local12.method3123((byte) 2, 2055, true);
		if (arg1 != 0) {
			local12.Q(arg1);
		}
		if (arg5 != 0) {
			local12.Z(arg5);
		}
		if (arg0 != 0) {
			local12.R(arg0);
		}
		if (arg3 != 0) {
			local12.JA(0, arg3, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
	public static void method3207() {
		for (@Pc(15) Class4_Sub18 local15 = (Class4_Sub18) Static342.aClass244_34.method5263(); local15 != null; local15 = (Class4_Sub18) Static342.aClass244_34.method5271()) {
			if (local15.anInt3032 > 0) {
				local15.anInt3032--;
			}
			if (local15.anInt3032 != 0) {
				if (local15.anInt3034 > 0) {
					local15.anInt3034--;
				}
				if (local15.anInt3034 == 0 && local15.anInt3037 >= 1 && local15.anInt3031 >= 1 && Static337.anInt5497 - 2 >= local15.anInt3037 && Static282.anInt4644 - 2 >= local15.anInt3031 && (local15.anInt3042 < 0 || Static413.method5614(local15.anInt3035, local15.anInt3042))) {
					Static382.method5072(local15.anInt3038, local15.anInt3037, local15.anInt3036, -1, local15.anInt3028, local15.anInt3031, local15.anInt3042, local15.anInt3035);
					local15.anInt3034 = -1;
					if (local15.anInt3033 == local15.anInt3042 && local15.anInt3033 == -1) {
						local15.method6059();
					} else if (local15.anInt3033 == local15.anInt3042 && local15.anInt3029 == local15.anInt3038 && local15.anInt3040 == local15.anInt3035) {
						local15.method6059();
					}
				}
			} else if (local15.anInt3033 < 0 || Static413.method5614(local15.anInt3040, local15.anInt3033)) {
				Static382.method5072(local15.anInt3029, local15.anInt3037, local15.anInt3036, -1, local15.anInt3028, local15.anInt3031, local15.anInt3033, local15.anInt3040);
				local15.method6059();
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIB)Z")
	public static boolean method3208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static150.method2110(arg0, arg1) || Static293.method3831(arg0, arg1);
	}
}
