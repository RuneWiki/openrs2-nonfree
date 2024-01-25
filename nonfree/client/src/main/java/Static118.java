import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!eaa", name = "T", descriptor = "Lclient!wia;")
	public static Class386 aClass386_28;

	@OriginalMember(owner = "client!eaa", name = "rc", descriptor = "Lclient!uh;")
	public static final Class352 aClass352_4 = new Class352(8, 0, 4, 1);

	@OriginalMember(owner = "client!eaa", name = "Bc", descriptor = "I")
	public static int anInt2444 = 999999;

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lclient!st;)V")
	public static void method2069(@OriginalArg(0) Class328 arg0) {
		if (Static253.anInt4485 >= 65535) {
			return;
		}
		@Pc(6) Class14_Sub37 local6 = arg0.aClass14_Sub37_3;
		Static260.aClass328Array1[Static253.anInt4485] = arg0;
		Static526.aBooleanArray20[Static253.anInt4485] = false;
		Static253.anInt4485++;
		@Pc(21) int local21 = arg0.anInt9433;
		if (arg0.aBoolean662) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt9433;
		if (arg0.aBoolean663) {
			local29 = Static613.anInt10338 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method7826() + Static96.anInt2065 - local6.method7819() >> Static579.anInt9935;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method7826() + local6.method7819() - Static96.anInt2065 >> Static579.anInt9935;
			if (local73 >= Static55.anInt1384) {
				local73 = Static55.anInt1384 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray137[local41++];
				@Pc(105) int local105 = (local6.method7827() + Static96.anInt2065 - local6.method7819() >> Static579.anInt9935) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static28.anInt704) {
					local113 = Static28.anInt704 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static295.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static295.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static253.anInt4485;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static295.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static253.anInt4485 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static295.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static253.anInt4485 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static295.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static253.anInt4485 << 48;
					}
				}
			}
		}
	}
}
