import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!iq", name = "l", descriptor = "[J")
	public static long[] aLongArray12;

	@OriginalMember(owner = "client!iq", name = "f", descriptor = "[I")
	public static int[] anIntArray607 = new int[2];

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZLclient!mj;)V")
	public static void method6678(@OriginalArg(1) Class190 arg0) {
		Static505.aClass190_1 = arg0;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(I[Lclient!wca;B)V")
	public static void method6679(@OriginalArg(0) int arg0, @OriginalArg(1) Class310[] arg1) {
		for (@Pc(9) int local9 = 0; local9 < arg1.length; local9++) {
			@Pc(15) Class310 local15 = arg1[local9];
			if (local15 != null) {
				if (local15.anInt9220 == 0) {
					if (local15.aClass310Array2 != null) {
						method6679(arg0, local15.aClass310Array2);
					}
					@Pc(36) Class2_Sub9 local36 = (Class2_Sub9) Static110.aClass127_21.method3205((long) local15.anInt9226);
					if (local36 != null) {
						Static363.method1117(arg0, local36.anInt833);
					}
				}
				@Pc(55) Class2_Sub28 local55;
				if (arg0 == 0 && local15.anObjectArray22 != null) {
					local55 = new Class2_Sub28();
					local55.anObjectArray2 = local15.anObjectArray22;
					local55.aClass310_8 = local15;
					Static258.method4037(local55);
				}
				if (arg0 == 1 && local15.anObjectArray21 != null) {
					if (local15.anInt9170 >= 0) {
						@Pc(81) Class310 local81 = Static111.method2143(local15.anInt9226);
						if (local81 == null || local81.aClass310Array2 == null || local15.anInt9170 >= local81.aClass310Array2.length || local15 != local81.aClass310Array2[local15.anInt9170]) {
							continue;
						}
					}
					local55 = new Class2_Sub28();
					local55.aClass310_8 = local15;
					local55.anObjectArray2 = local15.anObjectArray21;
					Static258.method4037(local55);
				}
			}
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IZIIIII)V")
	public static void method6680(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static329.anInt3845 = arg5;
		Static212.anInt3814 = arg2;
		Static494.anInt8674 = arg4;
		Static278.anInt5109 = arg3;
		Static441.anInt8031 = arg0;
		if (arg1 && Static494.anInt8674 >= 100) {
			Static353.anInt5258 = Static329.anInt3845 * 128 + 64;
			Static187.anInt3432 = Static212.anInt3814 * 128 + 64;
			Static329.anInt3848 = Static200.method3233(Static208.anInt3742, Static187.anInt3432, Static353.anInt5258) - Static441.anInt8031;
		}
		Static427.anInt7875 = 2;
	}
}
