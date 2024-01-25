import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static571 {

	@OriginalMember(owner = "client!tg", name = "o", descriptor = "D")
	public static double aDouble21;

	@OriginalMember(owner = "client!tg", name = "q", descriptor = "[Lclient!gp;")
	public static Class131[] aClass131Array1;

	@OriginalMember(owner = "client!tg", name = "j", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_169 = new Class44(77, -1);

	@OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
	public static int anInt9832 = 0;

	@OriginalMember(owner = "client!tg", name = "p", descriptor = "[C")
	public static final char[] aCharArray5 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "(I)I")
	public static int method8194() {
		return Static453.anInt7941 == 1 ? Static256.anInt4522 : 0;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!av;ZI)V")
	public static void method8197(@OriginalArg(0) Class12_Sub2_Sub2_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		if (Static313.anInt9044 >= 400) {
			return;
		}
		@Pc(12) Class283 local12 = arg0.aClass283_1;
		@Pc(15) String local15 = arg0.aString8;
		if (local12.anIntArray638 != null) {
			local12 = local12.method7129(Static595.aClass241_1);
			if (local12 == null) {
				return;
			}
			local15 = local12.aString84;
		}
		if (!local12.aBoolean618) {
			return;
		}
		if (arg0.anInt682 != 0) {
			@Pc(49) String local49 = Static630.aClass77_8 == Static635.aClass77_9 ? Static514.aClass303_32.method7473(Static232.anInt4258) : Static514.aClass303_30.method7473(Static232.anInt4258);
			local15 = local15 + Static150.method2370(Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt2995, arg0.anInt682) + " (" + local49 + arg0.anInt682 + ")";
		}
		if (Static238.aBoolean302 && !arg1) {
			@Pc(86) Class341 local86 = Static597.anInt10147 == -1 ? null : Static217.aClass90_1.method2122(Static597.anInt10147);
			if ((Static156.anInt3080 & 0x2) != 0 && (local86 == null || local12.method7134(local86.anInt9931, Static597.anInt10147) != local86.anInt9931)) {
				Static261.method3780((long) arg0.anInt2945, -1, true, Static639.aString114 + " -> <col=ffff00>" + local15, false, Static275.anInt4778, false, 0, (long) arg0.anInt2945, 0, Static139.aString30, 45);
			}
		}
		if (!arg1) {
			@Pc(140) String[] local140 = local12.aStringArray31;
			if (Static452.aBoolean545) {
				local140 = Static158.method2550(local140);
			}
			@Pc(150) int local150;
			if (local140 != null) {
				for (local150 = 4; local150 >= 0; local150--) {
					if (local140[local150] != null && (local12.aByte122 == 0 || !local140[local150].equalsIgnoreCase(Static514.aClass303_25.method7473(Static232.anInt4258)))) {
						@Pc(173) byte local173 = 0;
						@Pc(175) int local175 = Static334.anInt6334;
						if (local150 == 0) {
							local173 = 25;
						}
						if (local150 == 1) {
							local173 = 44;
						}
						if (local150 == 2) {
							local173 = 10;
						}
						if (local150 == 3) {
							local173 = 16;
						}
						if (local150 == local12.anInt8634) {
							local175 = local12.anInt8643;
						}
						if (local150 == 4) {
							local173 = 58;
						}
						if (local12.anInt8647 == local150) {
							local175 = local12.anInt8640;
						}
						Static261.method3780((long) arg0.anInt2945, -1, true, "<col=ffff00>" + local15, false, local140[local150].equalsIgnoreCase(Static514.aClass303_25.method7473(Static232.anInt4258)) ? local12.anInt8620 : local175, false, 0, (long) arg0.anInt2945, 0, local140[local150], local173);
					}
				}
			}
			if (local12.aByte122 == 1 && local140 != null) {
				for (local150 = 4; local150 >= 0; local150--) {
					if (local140[local150] != null && local140[local150].equalsIgnoreCase(Static514.aClass303_25.method7473(Static232.anInt4258))) {
						@Pc(301) short local301 = 0;
						if (arg0.anInt682 > Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt2995) {
							local301 = 2000;
						}
						@Pc(314) short local314 = 0;
						if (local150 == 0) {
							local314 = 25;
						}
						if (local150 == 1) {
							local314 = 44;
						}
						if (local150 == 2) {
							local314 = 10;
						}
						if (local150 == 3) {
							local314 = 16;
						}
						if (local150 == 4) {
							local314 = 58;
						}
						if (local314 != 0) {
							local314 += local301;
						}
						Static261.method3780((long) arg0.anInt2945, -1, true, "<col=ffff00>" + local15, false, local12.anInt8620, false, 0, (long) arg0.anInt2945, 0, local140[local150], local314);
					}
				}
			}
		}
		Static261.method3780((long) arg0.anInt2945, -1, true, "<col=ffff00>" + local15, arg1, Static30.anInt779, false, 0, (long) arg0.anInt2945, 0, Static514.aClass303_24.method7473(Static232.anInt4258), 1009);
	}
}
