import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "Lclient!in;")
	public static Class157 aClass157_267;

	@OriginalMember(owner = "client!tn", name = "q", descriptor = "Z")
	public static boolean aBoolean684;

	@OriginalMember(owner = "client!tn", name = "r", descriptor = "[I")
	public static final int[] anIntArray643 = new int[2048];

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method8191(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static31.method765(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static604.anInt10620; local25++) {
			@Pc(31) String local31 = Static314.aStringArray29[local25];
			if (local31.startsWith("*")) {
				local31 = local31.substring(1);
			}
			local31 = Static31.method765(local31);
			if (local31 != null && local31.equals(local20)) {
				Static604.anInt10620--;
				for (@Pc(55) int local55 = local25; local55 < Static604.anInt10620; local55++) {
					Static314.aStringArray29[local55] = Static314.aStringArray29[local55 + 1];
					Static101.aStringArray15[local55] = Static101.aStringArray15[local55 + 1];
					Static199.anIntArray558[local55] = Static199.anIntArray558[local55 + 1];
					Static603.aStringArray33[local55] = Static603.aStringArray33[local55 + 1];
					Static433.anIntArray535[local55] = Static433.anIntArray535[local55 + 1];
					Static370.aBooleanArray17[local55] = Static370.aBooleanArray17[local55 + 1];
				}
				Static373.anInt7362 = Static7.anInt132;
				@Pc(120) Class2_Sub52 local120 = Static130.method3019(Static136.aClass94_31, Static361.aClass183_1);
				local120.aClass2_Sub11_Sub2_7.method8374(Static296.method5291(arg0));
				local120.aClass2_Sub11_Sub2_7.method8329(arg0);
				Static96.method2563(local120);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)V")
	public static void method8194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class100 local7 = Static395.aClass100ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static452.method7100(local7.aClass3_Sub1_Sub2_1);
		Static452.method7100(local7.aClass3_Sub1_Sub2_2);
		if (local7.aClass3_Sub1_Sub2_1 != null) {
			local7.aClass3_Sub1_Sub2_1 = null;
		}
		if (local7.aClass3_Sub1_Sub2_2 != null) {
			local7.aClass3_Sub1_Sub2_2 = null;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIIIIIIIZ)Z")
	public static boolean method8195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (!Static52.method1768(arg7, arg2, arg0)) {
			return false;
		}
		@Pc(15) int local15 = Static442.anIntArray540[1];
		@Pc(19) int local19 = Static442.anIntArray540[0];
		@Pc(23) int local23 = Static442.anIntArray540[2];
		if (!Static52.method1768(arg6, arg8, arg1)) {
			return false;
		}
		@Pc(35) int local35 = Static442.anIntArray540[0];
		@Pc(39) int local39 = Static442.anIntArray540[2];
		@Pc(43) int local43 = Static442.anIntArray540[1];
		if (Static52.method1768(arg5, arg4, arg3)) {
			@Pc(55) int local55 = Static442.anIntArray540[2];
			@Pc(64) int local64 = Static442.anIntArray540[1];
			@Pc(68) int local68 = Static442.anIntArray540[0];
			return Static597.method8779(local68, local15, local35, local55, local39, local43, local23, local19, local64);
		} else {
			return false;
		}
	}
}
