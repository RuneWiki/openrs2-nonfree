import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "Lclient!rv;")
	public static Class5_Sub15 aClass5_Sub15_5;

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(ILclient!ha;ZIIIII)V")
	public static void method3624(@OriginalArg(0) int arg0, @OriginalArg(1) Class143 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4) {
		arg1.method6252(arg0, arg4, -10660793, arg2, arg3);
		arg1.method6252(arg0 + 1, arg4 - -1, -16777216, 16, arg3 - 2);
		arg1.method6235(arg0 + 18, arg3 + -2, arg2 - 19, -16777216, arg4 - -1);
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
	public static void method3626() {
		@Pc(1) Class265 local1 = Static540.aClass265_59;
		synchronized (Static540.aClass265_59) {
			Static540.aClass265_59.method6573();
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(III)V")
	public static void method3627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class313 local7 = Static129.aClass313ArrayArrayArray7[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static65.method949(local7.aClass41_Sub1_Sub5_1);
		Static65.method949(local7.aClass41_Sub1_Sub5_2);
		if (local7.aClass41_Sub1_Sub5_1 != null) {
			local7.aClass41_Sub1_Sub5_1 = null;
		}
		if (local7.aClass41_Sub1_Sub5_2 != null) {
			local7.aClass41_Sub1_Sub5_2 = null;
		}
	}
}
