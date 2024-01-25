import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static605 {

	@OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
	public static int anInt9912;

	@OriginalMember(owner = "client!vi", name = "l", descriptor = "[I")
	public static int[] anIntArray802;

	@OriginalMember(owner = "client!vi", name = "f", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_187 = new Class136(74, 6);

	@OriginalMember(owner = "client!vi", name = "j", descriptor = "[C")
	public static final char[] aCharArray8 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!vi", name = "k", descriptor = "Z")
	public static boolean aBoolean812 = false;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I[I)Ljava/lang/String;")
	public static String method8431(@OriginalArg(1) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static81.anInt1374;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(22) Class217 local22 = Static472.aClass317_1.method7543(arg0[local13]);
			if (local22.anInt5795 != -1) {
				@Pc(37) Class44 local37 = (Class44) Static186.aClass293_20.method6921((long) local22.anInt5795);
				if (local37 == null) {
					@Pc(45) Class176 local45 = Static654.method4046(Static488.aClass384_112, local22.anInt5795, 0);
					if (local45 != null) {
						local37 = Static485.aClass126_17.method6994(local45, true);
						Static186.aClass293_20.method6925((long) local22.anInt5795, local37);
					}
				}
				if (local37 != null) {
					Static158.aClass44Array7[local11] = local37;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)Lclient!ft;")
	public static Class5_Sub16_Sub1 method8432() {
		return Static275.aClass5_Sub16_Sub1_5;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)V")
	public static void method8435(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = Static457.aClass298_11.method6965(Static76.aClass58_25.method1237(Static321.anInt5554));
		@Pc(58) int local58;
		@Pc(28) int local28;
		if (Static585.aBoolean771) {
			for (@Pc(66) Class5_Sub4_Sub6 local66 = (Class5_Sub4_Sub6) Static616.aClass80_12.method1538(); local66 != null; local66 = (Class5_Sub4_Sub6) Static616.aClass80_12.method1536()) {
				if (local66.anInt2325 == 1) {
					local28 = Static481.method6954((Class5_Sub4_Sub14) local66.aClass80_3.aClass5_Sub4_14.aClass5_Sub4_67);
				} else {
					local28 = Static429.method6451(local66);
				}
				if (local28 > local15) {
					local15 = local28;
				}
			}
			local58 = Static198.anInt3547 * 16 + 21;
			Static334.anInt5796 = Static198.anInt3547 * 16 + (Static405.aBoolean578 ? 26 : 22);
			local15 += 8;
		} else {
			for (@Pc(22) Class5_Sub4_Sub14 local22 = (Class5_Sub4_Sub14) Static607.aClass306_63.method7313(); local22 != null; local22 = (Class5_Sub4_Sub14) Static607.aClass306_63.method7301()) {
				local28 = Static481.method6954(local22);
				if (local28 > local15) {
					local15 = local28;
				}
			}
			Static334.anInt5796 = (Static405.aBoolean578 ? 26 : 22) + Static642.anInt10370 * 16;
			local58 = Static642.anInt10370 * 16 + 21;
			local15 += 8;
		}
		@Pc(128) int local128 = arg0 - local15 / 2;
		if (local15 + local128 > Static254.anInt4283) {
			local128 = Static254.anInt4283 - local15;
		}
		if (local128 < 0) {
			local128 = 0;
		}
		local28 = arg1;
		if (arg1 + local58 > Static438.anInt7403) {
			local28 = Static438.anInt7403 - local58;
		}
		if (local28 < 0) {
			local28 = 0;
		}
		Static403.anInt6941 = local128;
		Static251.aBoolean343 = true;
		Static649.anInt10496 = local28;
		Static42.anInt712 = local15;
	}
}
