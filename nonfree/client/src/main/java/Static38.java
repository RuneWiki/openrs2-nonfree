import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bca", name = "p", descriptor = "[C")
	public static final char[] aCharArray1 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method562(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static299.anInt6884 >= 100) {
			Static332.method4975(Static476.aClass279_39.method6992(Static141.anInt2658));
			return;
		}
		@Pc(27) String local27 = Static282.method4264(arg1);
		if (local27 == null) {
			return;
		}
		@Pc(81) String local81;
		for (@Pc(33) int local33 = 0; local33 < Static299.anInt6884; local33++) {
			@Pc(45) String local45 = Static282.method4264(Static383.aStringArray25[local33]);
			if (local45 != null && local45.equals(local27)) {
				Static332.method4975(arg1 + Static476.aClass279_40.method6992(Static141.anInt2658));
				return;
			}
			if (Static301.aStringArray17[local33] != null) {
				local81 = Static282.method4264(Static301.aStringArray17[local33]);
				if (local81 != null && local81.equals(local27)) {
					Static332.method4975(arg1 + Static476.aClass279_40.method6992(Static141.anInt2658));
					return;
				}
			}
		}
		for (@Pc(119) int local119 = 0; local119 < Static22.anInt373; local119++) {
			local81 = Static282.method4264(Static432.aStringArray29[local119]);
			if (local81 != null && local81.equals(local27)) {
				Static332.method4975(Static476.aClass279_45.method6992(Static141.anInt2658) + arg1 + Class279.lb.method6992(Static141.anInt2658));
				return;
			}
			if (Static604.aStringArray38[local119] != null) {
				@Pc(170) String local170 = Static282.method4264(Static604.aStringArray38[local119]);
				if (local170 != null && local170.equals(local27)) {
					Static332.method4975(Static476.aClass279_45.method6992(Static141.anInt2658) + arg1 + Class279.lb.method6992(Static141.anInt2658));
					return;
				}
			}
		}
		if (Static282.method4264(Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aString109).equals(local27)) {
			Static332.method4975(Static476.aClass279_42.method6992(Static141.anInt2658));
			return;
		}
		@Pc(232) Class400 local232 = Static81.method1057();
		@Pc(238) Class3_Sub48 local238 = Static89.method1200(Static599.aClass286_106, local232.aClass399_2);
		local238.aClass3_Sub28_Sub2_1.method5329(Static605.method8305(arg1) + 1);
		local238.aClass3_Sub28_Sub2_1.method5283(arg1);
		local238.aClass3_Sub28_Sub2_1.method5329(arg0 ? 1 : 0);
		local232.method9223(local238);
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(IILclient!av;ILclient!aa;Lclient!bka;II)V")
	public static void method564(@OriginalArg(1) int arg0, @OriginalArg(2) Class20 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1 arg3, @OriginalArg(5) Class9 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(19) int local19;
		if (Static175.anInt10579 == 4) {
			local19 = (int) Static658.aFloat196 & 0x3FFF;
		} else {
			local19 = (int) Static658.aFloat196 + Static543.anInt9108 & 0x3FFF;
		}
		@Pc(45) int local45 = Math.max(arg1.anInt509 / 2, arg1.anInt569 / 2) + 10;
		@Pc(53) int local53 = arg6 * arg6 + arg0 * arg0;
		if (local53 > local45 * local45) {
			return;
		}
		@Pc(64) int local64 = Class3_Sub2_Sub21.anIntArray358[local19];
		@Pc(68) int local68 = Class3_Sub2_Sub21.anIntArray356[local19];
		if (Static175.anInt10579 != 4) {
			local64 = local64 * 256 / (Static61.anInt953 + 256);
			local68 = local68 * 256 / (Static61.anInt953 + 256);
		}
		@Pc(97) int local97 = local68 * arg0 + arg6 * local64 >> 14;
		@Pc(108) int local108 = local68 * arg6 - local64 * arg0 >> 14;
		arg4.method8615(arg2 + arg1.anInt509 / 2 + local97 - arg4.method8619() / 2, -local108 + arg1.anInt569 / 2 + (arg5 - arg4.method8613() / 2), arg3, arg2, arg5);
	}
}
