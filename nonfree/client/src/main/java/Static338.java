import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!lw", name = "i", descriptor = "[Z")
	public static final boolean[] aBooleanArray36 = new boolean[200];

	@OriginalMember(owner = "client!lw", name = "j", descriptor = "[I")
	public static final int[] anIntArray438 = new int[64];

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)V")
	public static void method5184() {
		Static97.aClass81_14.method1602();
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIII)V")
	public static void method5186(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg1 * Static627.aClass5_Sub46_31.aClass11_Sub17_4.method5908() >> 8;
		if (local12 == 0 || arg0 == -1) {
			return;
		}
		if (!Static309.aBoolean451 && Static68.anInt1096 != -1 && Static533.method386() && !Static23.method487()) {
			Static476.aClass5_Sub16_Sub1_4 = Static605.method8432();
			@Pc(44) Class5_Sub16_Sub1 local44 = Static521.method7483(Static476.aClass5_Sub16_Sub1_4);
			Static178.method2708(local44);
		}
		Static228.method3581(arg0, local12, Static372.aClass384_96);
		Static451.method6701(255, -1);
		Static309.aBoolean451 = true;
	}
}
