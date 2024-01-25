import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
	public static int anInt7634;

	@OriginalMember(owner = "client!oo", name = "f", descriptor = "[I")
	public static final int[] anIntArray457 = new int[4096];

	@OriginalMember(owner = "client!oo", name = "h", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_146 = new Class126(4, 4);

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method6382(@OriginalArg(0) Class16 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static649.aBoolean735) {
			local7 = Static359.method5380();
			local9 = Static265.method7952();
		}
		Static416.method5963(arg0, Static108.anInt2244, Static464.anInt7952, Static467.anInt7972 + local9, local7 + Static567.anInt9059);
		Static243.aClass69_5.method7451(local9 + Static467.anInt7972 + 14, -10660793, -1, Static569.aClass335_25.method7694(Static319.anInt5939), Static567.anInt9059 + local7 + 3);
		@Pc(58) int local58 = Static542.aClass75_1.method8412() + local7;
		@Pc(64) int local64 = Static542.aClass75_1.method8405() + local9;
		@Pc(68) int local68;
		@Pc(90) int local90;
		if (Static548.aBoolean662) {
			local68 = 0;
			for (@Pc(126) Class3_Sub6_Sub20 local126 = (Class3_Sub6_Sub20) Static239.aClass258_3.method5934(); local126 != null; local126 = (Class3_Sub6_Sub20) Static239.aClass258_3.method5929()) {
				local90 = Static467.anInt7972 + local9 + local68 * 16 + 31;
				local68++;
				if (local126.anInt9677 == 1) {
					Static344.method5201((Class3_Sub6_Sub16) local126.aClass258_13.aClass3_Sub6_44.aClass3_Sub6_67, Static108.anInt2244, Static464.anInt7952, local9 + Static467.anInt7972, -1, Static567.anInt9059 + local7, -256, local58, local64, arg0, local90);
				} else {
					Static432.method6366(local64, Static467.anInt7972 + local9, local90, local58, local126, -1, Static464.anInt7952, Static108.anInt2244, arg0, local7 + Static567.anInt9059, -256);
				}
			}
			if (Static407.aClass3_Sub6_Sub20_1 != null) {
				Static416.method5963(arg0, Static505.anInt8464, Static274.anInt5127, Static226.anInt6457, Static382.anInt6708);
				Static243.aClass69_5.method7451(Static226.anInt6457 + 14, -10660793, -1, Static407.aClass3_Sub6_Sub20_1.aString123, Static382.anInt6708 + 3);
				local68 = 0;
				for (@Pc(227) Class3_Sub6_Sub16 local227 = (Class3_Sub6_Sub16) Static407.aClass3_Sub6_Sub20_1.aClass258_13.method5934(); local227 != null; local227 = (Class3_Sub6_Sub16) Static407.aClass3_Sub6_Sub20_1.aClass258_13.method5929()) {
					@Pc(238) int local238 = Static226.anInt6457 + local68 * 16 + 31;
					Static344.method5201(local227, Static505.anInt8464, Static274.anInt5127, Static226.anInt6457, -1, Static382.anInt6708, -256, local58, local64, arg0, local238);
					local68++;
				}
				Static48.method1275(Static505.anInt8464, Static382.anInt6708, Static226.anInt6457, Static274.anInt5127);
			}
		} else {
			local68 = 0;
			for (@Pc(73) Class3_Sub6_Sub16 local73 = (Class3_Sub6_Sub16) Static362.aClass193_32.method4457(); local73 != null; local73 = (Class3_Sub6_Sub16) Static362.aClass193_32.method4459()) {
				local90 = (Static37.anInt1104 - local68 - 1) * 16 + local9 + Static467.anInt7972 + 31;
				Static344.method5201(local73, Static108.anInt2244, Static464.anInt7952, local9 + Static467.anInt7972, -1, local7 + Static567.anInt9059, -256, local58, local64, arg0, local90);
				local68++;
			}
		}
		Static48.method1275(Static108.anInt2244, local7 + Static567.anInt9059, Static467.anInt7972 - -local9, Static464.anInt7952);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZLclient!ha;Lclient!gj;)V")
	public static void method6383(@OriginalArg(1) Class16 arg0, @OriginalArg(2) Class143 arg1) {
		@Pc(10) Class150[] local10 = Static683.method3282(arg1, Static200.anInt3602);
		Static13.aClass102Array1 = new Class102[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static13.aClass102Array1[local16] = arg0.method8132(local10[local16], true);
		}
		local10 = Static683.method3282(arg1, Static538.anInt8818);
		Static655.aClass102Array24 = new Class102[local10.length];
		for (@Pc(47) int local47 = 0; local47 < local10.length; local47++) {
			Static655.aClass102Array24[local47] = arg0.method8132(local10[local47], true);
		}
		local10 = Static683.method3282(arg1, Static521.anInt8695);
		Static544.aClass102Array21 = new Class102[local10.length];
		for (@Pc(74) int local74 = 0; local74 < local10.length; local74++) {
			Static544.aClass102Array21[local74] = arg0.method8132(local10[local74], true);
		}
		local10 = Static683.method3282(arg1, Static109.anInt2253);
		Static194.aClass102Array16 = new Class102[local10.length];
		for (@Pc(105) int local105 = 0; local105 < local10.length; local105++) {
			Static194.aClass102Array16[local105] = arg0.method8132(local10[local105], true);
		}
		local10 = Static683.method3282(arg1, Static302.anInt5504);
		Static373.aClass102Array19 = new Class102[local10.length];
		for (@Pc(132) int local132 = 0; local132 < local10.length; local132++) {
			Static373.aClass102Array19[local132] = arg0.method8132(local10[local132], true);
		}
		local10 = Static683.method3282(arg1, Static635.anInt9807);
		Static491.aClass102Array23 = new Class102[local10.length];
		for (@Pc(163) int local163 = 0; local163 < local10.length; local163++) {
			Static491.aClass102Array23[local163] = arg0.method8132(local10[local163], true);
		}
		local10 = Static683.method3282(arg1, Static453.anInt7752);
		Static280.aClass102Array14 = new Class102[local10.length];
		for (@Pc(194) int local194 = 0; local194 < local10.length; local194++) {
			Static280.aClass102Array14[local194] = arg0.method8132(local10[local194], true);
		}
		local10 = Static683.method3282(arg1, Static137.anInt2536);
		Static269.aClass102Array12 = new Class102[local10.length];
		for (@Pc(225) int local225 = 0; local225 < local10.length; local225++) {
			Static269.aClass102Array12[local225] = arg0.method8132(local10[local225], true);
		}
		local10 = Static683.method3282(arg1, Static304.anInt5557);
		Static55.aClass102Array4 = new Class102[local10.length];
		for (@Pc(256) int local256 = 0; local256 < local10.length; local256++) {
			Static55.aClass102Array4[local256] = arg0.method8132(local10[local256], true);
		}
		local10 = Static683.method3282(arg1, Static173.anInt3297);
		Static173.aClass102Array8 = new Class102[local10.length];
		for (@Pc(287) int local287 = 0; local287 < local10.length; local287++) {
			Static173.aClass102Array8[local287] = arg0.method8132(local10[local287], true);
		}
		local10 = Static683.method3282(arg1, Static616.anInt9561);
		Static583.aClass102Array22 = new Class102[local10.length];
		for (@Pc(318) int local318 = 0; local318 < local10.length; local318++) {
			Static583.aClass102Array22[local318] = arg0.method8132(local10[local318], true);
		}
		local10 = Static683.method3282(arg1, Static626.anInt9695);
		Static111.aClass102Array25 = new Class102[local10.length];
		for (@Pc(349) int local349 = 0; local349 < local10.length; local349++) {
			Static111.aClass102Array25[local349] = arg0.method8132(local10[local349], true);
		}
		Static169.aClass102_11 = arg0.method8132(Static683.method3275(arg1, Static610.anInt9524, 0), true);
		Static640.aClass102_39 = arg0.method8132(Static683.method3275(arg1, Static140.anInt2654, 0), true);
		local10 = Static683.method3282(arg1, Static512.anInt8559);
		Static250.aClass102Array11 = new Class102[local10.length];
		for (@Pc(392) int local392 = 0; local392 < local10.length; local392++) {
			Static250.aClass102Array11[local392] = arg0.method8132(local10[local392], true);
		}
	}
}
