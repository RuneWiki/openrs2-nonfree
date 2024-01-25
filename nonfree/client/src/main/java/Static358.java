import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "Lclient!gda;")
	public static Class126 aClass126_165;

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(BLclient!gda;)V")
	public static void method5234(@OriginalArg(1) Class126 arg0) {
		Static597.aClass126_271 = arg0;
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IILclient!mj;I)V")
	public static void method5235(@OriginalArg(1) int arg0, @OriginalArg(2) Class238 arg1, @OriginalArg(3) int arg2) {
		if (Static421.aBoolean472) {
			@Pc(21) Class22 local21 = Static110.anInt9539 == -1 ? null : Static612.aClass380_2.method8839(Static110.anInt9539);
			if (Static73.method1209(arg1).method1975() && (Static326.anInt4132 & 0x20) != 0 && (local21 == null || arg1.method5319(local21.anInt336, Static110.anInt9539) != local21.anInt336)) {
				Static467.method6573(arg1.anInt5986, 9, arg1.anInt5990, Static462.anInt7482, Static47.aString9 + " -> " + arg1.aString69, Static570.aString102, 0L, (long) (arg1.anInt5971 | arg1.anInt5986 << 0), arg1.anInt5971, false, false, true);
			}
		}
		@Pc(103) String local103;
		for (@Pc(94) int local94 = 9; local94 >= 5; local94--) {
			local103 = Static494.method6913(arg1, local94);
			if (local103 != null) {
				Static467.method6573(arg1.anInt5986, 1007, arg1.anInt5990, Static229.method3618(arg1, local94), arg1.aString69, local103, (long) (local94 + 1), (long) (arg1.anInt5986 << 0 | arg1.anInt5971), arg1.anInt5971, false, false, true);
			}
		}
		local103 = Static70.method1151(arg1);
		if (local103 != null) {
			Static467.method6573(arg1.anInt5986, 53, arg1.anInt5990, arg1.anInt6001, arg1.aString69, local103, 0L, (long) (arg1.anInt5971 | arg1.anInt5986 << 0), arg1.anInt5971, false, false, true);
		}
		for (@Pc(197) int local197 = 4; local197 >= 0; local197--) {
			@Pc(206) String local206 = Static494.method6913(arg1, local197);
			if (local206 != null) {
				Static467.method6573(arg1.anInt5986, 22, arg1.anInt5990, Static229.method3618(arg1, local197), arg1.aString69, local206, (long) (local197 + 1), (long) (arg1.anInt5971 | arg1.anInt5986 << 0), arg1.anInt5971, false, false, true);
			}
		}
		if (!Static73.method1209(arg1).method1973()) {
			return;
		}
		if (arg1.aString72 == null) {
			Static467.method6573(arg1.anInt5986, 48, arg1.anInt5990, -1, "", Static184.aClass131_11.method3168(Static375.anInt7800), 0L, (long) (arg1.anInt5986 << 0 | arg1.anInt5971), arg1.anInt5971, false, false, true);
		} else {
			Static467.method6573(arg1.anInt5986, 48, arg1.anInt5990, -1, "", arg1.aString72, 0L, (long) (arg1.anInt5971 | arg1.anInt5986 << 0), arg1.anInt5971, false, false, true);
		}
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(BI)I")
	public static int method5236(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
