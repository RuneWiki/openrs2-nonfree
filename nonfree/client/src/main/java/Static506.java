import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static506 {

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
	public static int anInt8995;

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
	public static int anInt9000 = 1;

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILjava/lang/String;ZLjava/lang/String;I)V")
	public static void method7897(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		Static105.method1887(arg0, arg2, -1, arg3, true, arg1);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIII)V")
	public static void method7900(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) int local5 = Static383.anInt7257;
		@Pc(7) int local7 = Static369.anInt11005;
		if (Static450.aBoolean606) {
			local5 += Static106.method1934();
			local7 += Static207.method3926();
		}
		@Pc(30) Class71 local30;
		if (Static481.anInt8660 == 1) {
			local30 = Static638.aClass71Array44[Static136.anInt2586 / 100];
			local30.method7703(local5 - 8, local7 - 8);
			Static220.method4070(local7 + local30.method7711() - 8, local7 + -8, local5 - 8, local30.method7709() + -8 + local5);
		}
		if (Static481.anInt8660 == 2) {
			local30 = Static638.aClass71Array44[Static136.anInt2586 / 100 + 4];
			local30.method7703(local5 - 8, local7 + -8);
			Static220.method4070(local7 + local30.method7711() - 8, local7 + -8, local5 - 8, local30.method7709() + -8 + local5);
		}
		Static282.method4741();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
	public static void method7901() {
		while (true) {
			if (Static206.aClass2_Sub8_Sub2_1.method5240(Static538.anInt9383) >= 15) {
				@Pc(27) int local27 = Static206.aClass2_Sub8_Sub2_1.method5233(15);
				if (local27 != 32767) {
					@Pc(32) boolean local32 = false;
					@Pc(39) Class2_Sub6 local39 = (Class2_Sub6) Static630.aClass335_29.method8357((long) local27);
					@Pc(45) Class15_Sub3_Sub3_Sub1_Sub2 local45;
					if (local39 == null) {
						local45 = new Class15_Sub3_Sub3_Sub1_Sub2();
						local45.anInt3977 = local27;
						local39 = new Class2_Sub6(local45);
						Static630.aClass335_29.method8356(local39, (long) local27);
						local32 = true;
						Static275.aClass2_Sub6Array1[Static487.anInt8726++] = local39;
					}
					local45 = local39.aClass15_Sub3_Sub3_Sub1_Sub2_1;
					Static84.anIntArray73[Static532.anInt9330++] = local27;
					local45.anInt3999 = Static634.anInt10948;
					if (local45.aClass312_1 != null && local45.aClass312_1.method7946()) {
						Static656.method9621(local45);
					}
					@Pc(103) int local103 = Static206.aClass2_Sub8_Sub2_1.method5233(2);
					@Pc(108) int local108 = Static206.aClass2_Sub8_Sub2_1.method5233(1);
					@Pc(113) int local113 = Static206.aClass2_Sub8_Sub2_1.method5233(1);
					if (local113 == 1) {
						Static288.anIntArray268[Static56.anInt1101++] = local27;
					}
					@Pc(129) int local129 = Static206.aClass2_Sub8_Sub2_1.method5233(5);
					local45.method3698(Static522.aClass272_2.method7200(Static206.aClass2_Sub8_Sub2_1.method5233(14)));
					if (local129 > 15) {
						local129 -= 32;
					}
					@Pc(154) int local154 = (Static206.aClass2_Sub8_Sub2_1.method5233(3) + 4 & 0x36200007) << 11;
					@Pc(159) int local159 = Static206.aClass2_Sub8_Sub2_1.method5233(5);
					if (local159 > 15) {
						local159 -= 32;
					}
					local45.method3689(local45.aClass312_1.anInt9095);
					local45.anInt4024 = local45.aClass312_1.anInt9063 << 3;
					if (local32) {
						local45.method3686(local154, true);
					}
					local45.method3695(local103, local159 + Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anIntArray189[0], Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anIntArray188[0] + local129, local45.method3690(), local108 == 1);
					if (local45.aClass312_1.method7946()) {
						Static225.method4155(local45, (Class15_Sub3_Sub3_Sub1_Sub1) null, 0, local45.anIntArray188[0], (Class331) null, local45.aByte142, local45.anIntArray189[0]);
					}
					continue;
				}
			}
			Static206.aClass2_Sub8_Sub2_1.method5234();
			return;
		}
	}
}
