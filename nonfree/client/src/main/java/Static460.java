import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!wm", name = "B", descriptor = "F")
	public static float aFloat99;

	@OriginalMember(owner = "client!wm", name = "Q", descriptor = "Lclient!ci;")
	public static Class38 aClass38_94;

	@OriginalMember(owner = "client!wm", name = "r", descriptor = "I")
	public static int anInt7831 = 500;

	@OriginalMember(owner = "client!wm", name = "E", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_122 = new Class21("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

	@OriginalMember(owner = "client!wm", name = "T", descriptor = "I")
	public static int anInt7848 = 0;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIIIII)V")
	public static void method6237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(14) int local14 = arg3;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21 = arg5 - arg1;
		@Pc(26) int local26 = arg3 - arg1;
		@Pc(30) int local30 = arg5 * arg5;
		@Pc(34) int local34 = arg3 * arg3;
		@Pc(38) int local38 = local21 * local21;
		@Pc(42) int local42 = local26 * local26;
		@Pc(46) int local46 = local34 << 1;
		@Pc(50) int local50 = local30 << 1;
		@Pc(54) int local54 = local42 << 1;
		@Pc(58) int local58 = local38 << 1;
		@Pc(62) int local62 = arg3 << 1;
		@Pc(66) int local66 = local26 << 1;
		@Pc(76) int local76 = (1 - local62) * local30 + local46;
		@Pc(85) int local85 = local34 - (local62 - 1) * local50;
		@Pc(93) int local93 = (1 - local66) * local38 + local54;
		@Pc(101) int local101 = local42 - local58 * (local66 - 1);
		@Pc(105) int local105 = local30 << 2;
		@Pc(109) int local109 = local34 << 2;
		@Pc(113) int local113 = local38 << 2;
		@Pc(117) int local117 = local42 << 2;
		@Pc(121) int local121 = local46 * 3;
		@Pc(127) int local127 = local50 * (local62 - 3);
		@Pc(131) int local131 = local54 * 3;
		@Pc(137) int local137 = local58 * (local66 - 3);
		@Pc(139) int local139 = local109;
		@Pc(145) int local145 = (arg3 - 1) * local105;
		@Pc(147) int local147 = local117;
		@Pc(170) int local170;
		@Pc(178) int local178;
		@Pc(187) int local187;
		@Pc(198) int local198;
		if (Static162.anInt1715 <= arg0 && Static55.anInt1319 >= arg0) {
			@Pc(161) int[] local161 = Static400.anIntArrayArray54[arg0];
			local170 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg4 - arg5);
			local178 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg5 + arg4);
			local187 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg4 - local21);
			local198 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg4 + local21);
			Static236.method3990(local187, local170, local161, arg2);
			Static236.method3990(local198, local187, local161, arg6);
			Static236.method3990(local178, local198, local161, arg2);
		}
		@Pc(224) int local224 = local113 * (local26 - 1);
		while (local14 > 0) {
			@Pc(237) boolean local237 = local26 >= local14;
			if (local76 < 0) {
				while (local76 < 0) {
					local76 += local121;
					local85 += local139;
					local121 += local109;
					local139 += local109;
					local7++;
				}
			}
			if (local237) {
				if (local93 < 0) {
					while (local93 < 0) {
						local93 += local131;
						local101 += local147;
						local16++;
						local147 += local117;
						local131 += local117;
					}
				}
				if (local101 < 0) {
					local93 += local131;
					local101 += local147;
					local131 += local117;
					local147 += local117;
					local16++;
				}
				local93 += -local224;
				local101 += -local137;
				local137 -= local113;
				local224 -= local113;
			}
			if (local85 < 0) {
				local85 += local139;
				local76 += local121;
				local139 += local109;
				local7++;
				local121 += local109;
			}
			local76 += -local145;
			local85 += -local127;
			local127 -= local105;
			local145 -= local105;
			local14--;
			local170 = arg0 - local14;
			local178 = local14 + arg0;
			if (Static162.anInt1715 <= local178 && local170 <= Static55.anInt1319) {
				local187 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg4 + local7);
				local198 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg4 - local7);
				if (local237) {
					@Pc(444) int local444 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg4 + local16);
					@Pc(455) int local455 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg4 - local16);
					@Pc(466) int[] local466;
					if (Static162.anInt1715 <= local170) {
						local466 = Static400.anIntArrayArray54[local170];
						Static236.method3990(local455, local198, local466, arg2);
						Static236.method3990(local444, local455, local466, arg6);
						Static236.method3990(local187, local444, local466, arg2);
					}
					if (Static55.anInt1319 >= local178) {
						local466 = Static400.anIntArrayArray54[local178];
						Static236.method3990(local455, local198, local466, arg2);
						Static236.method3990(local444, local455, local466, arg6);
						Static236.method3990(local187, local444, local466, arg2);
					}
				} else {
					if (Static162.anInt1715 <= local170) {
						Static236.method3990(local187, local198, Static400.anIntArrayArray54[local170], arg2);
					}
					if (Static55.anInt1319 >= local178) {
						Static236.method3990(local187, local198, Static400.anIntArrayArray54[local178], arg2);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method6241(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static315.method4358(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static401.anInt7085; local25++) {
			@Pc(31) String local31 = Static225.aStringArray20[local25];
			if (local31.startsWith("*")) {
				local31 = local31.substring(1);
			}
			local31 = Static315.method4358(local31);
			if (local31 != null && local31.equals(local20)) {
				Static401.anInt7085--;
				for (@Pc(55) int local55 = local25; local55 < Static401.anInt7085; local55++) {
					Static225.aStringArray20[local55] = Static225.aStringArray20[local55 + 1];
					Static146.aStringArray15[local55] = Static146.aStringArray15[local55 + 1];
					Static244.aStringArray22[local55] = Static244.aStringArray22[local55 + 1];
					Static253.aStringArray23[local55] = Static253.aStringArray23[local55 + 1];
					Static295.aBooleanArray106[local55] = Static295.aBooleanArray106[local55 + 1];
				}
				Static368.anInt6378 = Static446.anInt7635;
				Static448.method6134(Static207.aClass212_58);
				Static457.aClass4_Sub20_Sub1_5.method4590(Static316.method4760(arg0));
				Static457.aClass4_Sub20_Sub1_5.method4599(arg0);
				return;
			}
		}
	}
}
