import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static644 {

	@OriginalMember(owner = "client!vr", name = "D", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray10 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ZZLjava/lang/String;)V")
	public static void method8987(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(8) String local8 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(20) int local20 = arg0 ? 32768 : 0;
		@Pc(31) int local31 = (arg0 ? Static502.aClass259_2.anInt7220 : Static502.aClass259_2.anInt7216) + local20;
		for (@Pc(33) int local33 = local20; local33 < local31; local33++) {
			@Pc(40) Class5_Sub5_Sub1 local40 = Static502.aClass259_2.method6241(local33);
			if (local40.aBoolean60 && local40.method674().toLowerCase().indexOf(local8) != -1) {
				if (local13 >= 50) {
					Static539.aShortArray118 = null;
					Static450.anInt7749 = -1;
					return;
				}
				if (local11.length <= local13) {
					@Pc(77) short[] local77 = new short[local11.length * 2];
					for (@Pc(79) int local79 = 0; local79 < local13; local79++) {
						local77[local79] = local11[local79];
					}
					local11 = local77;
				}
				local11[local13++] = (short) local33;
			}
		}
		Static539.aShortArray118 = local11;
		Static418.anInt7221 = 0;
		Static450.anInt7749 = local13;
		@Pc(133) String[] local133 = new String[Static450.anInt7749];
		for (@Pc(135) int local135 = 0; local135 < Static450.anInt7749; local135++) {
			local133[local135] = Static502.aClass259_2.method6241(local11[local135]).method674();
		}
		Static183.method2675(local133, Static539.aShortArray118);
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(Ljava/lang/String;I)V")
	public static void method8989(@OriginalArg(0) String arg0) {
		if (!Static199.aBoolean706 || (Static382.anInt9821 & 0x18) == 0) {
			return;
		}
		@Pc(30) boolean local30 = false;
		@Pc(32) int local32 = Static116.anInt3318;
		@Pc(34) int[] local34 = Static88.anIntArray464;
		for (@Pc(36) int local36 = 0; local36 < local32; local36++) {
			@Pc(44) Class8_Sub1_Sub3_Sub2_Sub1 local44 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local34[local36]];
			if (local44.aString62 != null && local44.aString62.equalsIgnoreCase(arg0) && (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1 == local44 && (Static382.anInt9821 & 0x10) != 0 || local44 != null && (Static382.anInt9821 & 0x8) != 0)) {
				@Pc(87) Class5_Sub50 local87 = Static457.method6722(Static205.aClass387_38, Static80.aClass313_1);
				local87.aClass5_Sub23_Sub2_2.method8486(Static7.anInt85);
				local87.aClass5_Sub23_Sub2_2.method8492(Static395.anInt6753);
				local87.aClass5_Sub23_Sub2_2.method8480(Static400.anInt6886);
				local87.aClass5_Sub23_Sub2_2.method8502(0);
				local87.aClass5_Sub23_Sub2_2.method8514(local34[local36]);
				Static494.method7120(local87);
				local30 = true;
				Static597.method8258(true, 0, local44.anIntArray415[0], -2, local44.anIntArray414[0], 0, local44.method5993(), local44.method5993());
				break;
			}
		}
		if (!local30) {
			Static111.method1603(Static582.aClass335_22.method8349(Static323.anInt5795) + arg0);
		}
		if (Static199.aBoolean706) {
			Static179.method2592();
		}
	}

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "(III)Z")
	public static boolean method8990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}
