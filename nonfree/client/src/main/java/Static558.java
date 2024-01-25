import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static558 {

	@OriginalMember(owner = "client!si", name = "a", descriptor = "[I")
	public static int[] anIntArray591 = new int[4];

	@OriginalMember(owner = "client!si", name = "c", descriptor = "[I")
	public static final int[] anIntArray592 = new int[500];

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V")
	public static void method7884() {
		Static660.anInt10201 = Static228.aClass53_7.anInt811 + Static228.aClass53_7.anInt817 + 2;
		Static177.aStringArray14 = new String[500];
		Static207.anInt4156 = Static507.aClass53_16.anInt811 + Static507.aClass53_16.anInt817 + 2;
		for (@Pc(26) int local26 = 0; local26 < Static177.aStringArray14.length; local26++) {
			Static177.aStringArray14[local26] = "";
		}
		Static655.method8761(Static50.aClass43_1.method596(Static601.anInt9518));
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(B)I")
	public static int method7885() {
		@Pc(13) byte local13;
		if (Static532.anInt8714 < 96) {
			Static419.method6415();
			local13 = 1;
		} else {
			@Pc(18) int local18 = Static508.method3113(9714);
			if (local18 <= 100) {
				Static550.method7784();
				local13 = 4;
			} else if (local18 <= 500) {
				local13 = 3;
				Static610.method8412();
			} else if (local18 > 1000) {
				local13 = 1;
				Static419.method6415();
			} else {
				local13 = 2;
				Static680.method8955();
			}
		}
		if (Static687.aClass6_Sub44_33.aClass7_Sub19_1.method6431() != 0) {
			Static687.aClass6_Sub44_33.method7080(0, Static687.aClass6_Sub44_33.aClass7_Sub19_2);
			Static536.method7652(false, 0);
		}
		Static392.method6007();
		return local13;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!rfa;III)V")
	public static void method7887(@OriginalArg(0) Class60_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class243 local12;
		if (arg2 < Static230.anInt4470) {
			local12 = Static334.aClass243ArrayArrayArray2[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass60_Sub1_Sub2_1 != null && local12.aClass60_Sub1_Sub2_1.method7914()) {
				arg0.method7915(0, 0, local12.aClass60_Sub1_Sub2_1, true, Static234.anInt4537, Static277.aClass75_7);
			}
		}
		if (arg3 < Static230.anInt4470) {
			local12 = Static334.aClass243ArrayArrayArray2[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass60_Sub1_Sub2_1 != null && local12.aClass60_Sub1_Sub2_1.method7914()) {
				arg0.method7915(Static234.anInt4537, 0, local12.aClass60_Sub1_Sub2_1, true, 0, Static277.aClass75_7);
			}
		}
		if (arg2 < Static230.anInt4470 && arg3 < Static63.anInt777) {
			local12 = Static334.aClass243ArrayArrayArray2[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass60_Sub1_Sub2_1 != null && local12.aClass60_Sub1_Sub2_1.method7914()) {
				arg0.method7915(Static234.anInt4537, 0, local12.aClass60_Sub1_Sub2_1, true, Static234.anInt4537, Static277.aClass75_7);
			}
		}
		if (arg2 < Static230.anInt4470 && arg3 > 0) {
			local12 = Static334.aClass243ArrayArrayArray2[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass60_Sub1_Sub2_1 != null && local12.aClass60_Sub1_Sub2_1.method7914()) {
				arg0.method7915(-Static234.anInt4537, 0, local12.aClass60_Sub1_Sub2_1, true, Static234.anInt4537, Static277.aClass75_7);
			}
		}
	}
}
