import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "[C")
	public static final char[] aCharArray4 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!qa;)V")
	public static void method5333(@OriginalArg(0) Class121 arg0) {
		for (@Pc(1) int local1 = Static360.anInt6590; local1 < Static29.anInt482; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static251.anInt4344; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static219.anInt3872; local7++) {
					@Pc(16) Class137 local16 = Static131.aClass137ArrayArrayArray2[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class47_Sub2 local21 = local16.aClass47_Sub2_1;
						@Pc(24) Class47_Sub2 local24 = local16.aClass47_Sub2_2;
						if (local21 != null && local21.method5725()) {
							Static21.method248(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5725()) {
								Static21.method248(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5733(0, 0, arg0, false, local21, 0);
								local24.method5723();
							}
							local21.method5723();
						}
						for (@Pc(70) Class167 local70 = local16.aClass167_1; local70 != null; local70 = local70.aClass167_2) {
							@Pc(74) Class47_Sub1 local74 = local70.aClass47_Sub1_2;
							if (local74 != null && local74.method5725()) {
								Static21.method248(arg0, local74, local1, local4, local7, local74.aShort107 + 1 - local74.aShort104, local74.aShort106 - local74.aShort105 + 1);
								local74.method5723();
							}
						}
						@Pc(111) Class47_Sub5 local111 = local16.aClass47_Sub5_1;
						if (local111 != null && local111.method5725()) {
							Static253.method847(arg0, local111, local1, local4, local7);
							local111.method5723();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(III)V")
	public static void method5337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = Static126.aClass62_6.method1157(Static357.aClass96_98.method1935(Static389.anInt7061));
		@Pc(24) int local24;
		for (@Pc(18) Class1_Sub3 local18 = (Class1_Sub3) Static251.aClass142_26.method3199(); local18 != null; local18 = (Class1_Sub3) Static251.aClass142_26.method3198()) {
			local24 = Static19.method244(local18);
			if (local24 > local13) {
				local13 = local24;
			}
		}
		local13 += 8;
		local24 = Static119.anInt2296 * 16 + 21;
		@Pc(54) int local54 = arg1 - local13 / 2;
		if (Static403.anInt7142 < local13 + local54) {
			local54 = Static403.anInt7142 - local13;
		}
		if (local54 < 0) {
			local54 = 0;
		}
		@Pc(78) int local78 = arg0;
		if (Static324.anInt5725 < arg0 + local24) {
			local78 = Static324.anInt5725 - local24;
		}
		if (local78 < 0) {
			local78 = 0;
		}
		Static256.anInt4398 = local54;
		Static369.anInt6690 = Static119.anInt2296 * 16 + (Static264.aBoolean355 ? 26 : 22);
		Static378.aBoolean549 = true;
		Static102.anInt1978 = local13;
		Static423.anInt7379 = local78;
	}
}
