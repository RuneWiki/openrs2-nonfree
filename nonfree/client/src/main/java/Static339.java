import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
	public static int anInt6733;

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "Lclient!tq;")
	public static Class191 aClass191_217;

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "I")
	public static int anInt6735;

	@OriginalMember(owner = "client!vq", name = "f", descriptor = "I")
	public static int anInt6736 = 64;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)V")
	public static void method5841(@OriginalArg(1) int arg0) {
		Static180.anInt3594 = arg0;
		@Pc(7) Class119 local7 = Static102.aClass119_67;
		synchronized (Static102.aClass119_67) {
			Static102.aClass119_67.method3304();
		}
		local7 = Static214.aClass119_127;
		synchronized (Static214.aClass119_127) {
			Static214.aClass119_127.method3304();
		}
		local7 = Static101.aClass119_64;
		synchronized (Static101.aClass119_64) {
			Static101.aClass119_64.method3304();
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!ae;)V")
	public static void method5842(@OriginalArg(0) Class4 arg0) {
		for (@Pc(1) int local1 = Static71.anInt1580; local1 < Static37.anInt696; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static223.anInt4280; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static160.anInt3244; local7++) {
					@Pc(16) Class8 local16 = Static275.aClass8ArrayArrayArray4[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class62_Sub4 local21 = local16.aClass62_Sub4_2;
						@Pc(24) Class62_Sub4 local24 = local16.aClass62_Sub4_1;
						if (local21 != null && local21.method5564()) {
							Static262.method4743(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5564()) {
								Static262.method4743(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5570(false, 0, 0, local21, 0, arg0);
								local24.method5569();
							}
							local21.method5569();
						}
						for (@Pc(70) Class172 local70 = local16.aClass172_1; local70 != null; local70 = local70.aClass172_4) {
							@Pc(74) Class62_Sub1 local74 = local70.aClass62_Sub1_1;
							if (local74 != null && local74.method5564()) {
								Static262.method4743(arg0, local74, local1, local4, local7, local74.aShort86 + 1 - local74.aShort84, local74.aShort85 - local74.aShort83 + 1);
								local74.method5569();
							}
						}
						@Pc(111) Class62_Sub3 local111 = local16.aClass62_Sub3_1;
						if (local111 != null && local111.method5564()) {
							Static307.method5416(arg0, local111, local1, local4, local7);
							local111.method5569();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIIIIBI)V")
	public static void method5843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (Static265.method5886(arg4)) {
			Static303.method5321(-1, arg6, Static265.aClass146ArrayArray41[arg4], arg0, arg2, arg5, arg3, arg7, arg1);
		} else if (arg0 == -1) {
			for (@Pc(22) int local22 = 0; local22 < 100; local22++) {
				Static200.aBooleanArray29[local22] = true;
			}
		} else {
			Static200.aBooleanArray29[arg0] = true;
		}
	}
}
