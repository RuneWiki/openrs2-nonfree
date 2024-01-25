import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_47 = new Class231("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

	@OriginalMember(owner = "client!jb", name = "V", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_53 = new Class186(38, 9);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLclient!gf;Lclient!od;Lclient!qq;)V")
	public static void method2790(@OriginalArg(1) Class94 arg0, @OriginalArg(2) Class6_Sub24 arg1, @OriginalArg(3) Class28 arg2) {
		@Pc(12) Class12 local12 = arg0.method2004(arg2);
		if (local12 == null) {
			return;
		}
		@Pc(18) int local18 = local12.method5672();
		if (local12.method5664() > local18) {
			local18 = local12.method5664();
		}
		@Pc(34) int local34 = arg1.anInt4801;
		@Pc(37) int local37 = arg1.anInt4808;
		@Pc(39) int local39 = 0;
		@Pc(49) int local49 = 0;
		@Pc(51) int local51 = 0;
		@Pc(65) int local65;
		@Pc(88) int local88;
		if (arg0.aString20 != null) {
			local39 = Static358.aClass201_7.method4458(Static122.aStringArray19, null, arg0.aString20, null);
			for (local65 = 0; local65 < local39; local65++) {
				@Pc(71) String local71 = Static122.aStringArray19[local65];
				if (local65 < local39 - 1) {
					local71 = local71.substring(0, local71.length() - 4);
				}
				local88 = Static165.aClass152_6.method3461(local71);
				if (local49 < local88) {
					local49 = local88;
				}
			}
			local51 = Static165.aClass152_6.method3463() * local39 + Static165.aClass152_6.method3459() / 2;
		}
		local65 = arg1.anInt4801 + local18 / 2;
		if (local34 < Static36.anInt2239 + local18) {
			local34 = Static36.anInt2239;
			local65 = local49 / 2 + Static36.anInt2239 + local18 / 2 + 10 + 5;
		} else if (local34 > Static36.anInt2249 - local18) {
			local65 = Static36.anInt2249 - local18 / 2 - local49 / 2 - 10 - 5;
			local34 = Static36.anInt2249 - local18;
		}
		@Pc(180) int local180 = arg1.anInt4808;
		if (local18 + Static36.anInt2244 > local37) {
			local37 = Static36.anInt2244;
			local180 = Static36.anInt2244 + local18 / 2 + 10;
		} else if (Static36.anInt2245 - local18 < local37) {
			local180 = Static36.anInt2245 - local18 / 2 - local51 - 10;
			local37 = Static36.anInt2245 - local18;
		}
		local88 = (int) (Math.atan2((double) (local34 - arg1.anInt4801), (double) (local37 - arg1.anInt4808)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local12.method5670((float) local34 + (float) local18 / 2.0F, (float) local18 / 2.0F + (float) local37, 4096, local88);
		@Pc(263) int local263 = -2;
		@Pc(265) int local265 = -2;
		@Pc(267) int local267 = -2;
		@Pc(269) int local269 = -2;
		if (arg0.aString20 != null) {
			local265 = local180;
			local263 = local65 - local49 / 2 - 5;
			local269 = local180 + Static165.aClass152_6.method3463() * local39 + 3;
			local267 = local49 + local263 + 10;
			if (arg0.anInt2181 != 0) {
				arg2.method3531(local263, arg0.anInt2181, local180, local269 - local180, -local263 + local267);
			}
			if (arg0.anInt2186 != 0) {
				arg2.method3508(local267 - local263, arg0.anInt2186, local263, local269 - local180, local180);
			}
			for (@Pc(339) int local339 = 0; local339 < local39; local339++) {
				@Pc(345) String local345 = Static122.aStringArray19[local339];
				if (local339 < local39 - 1) {
					local345 = local345.substring(0, local345.length() - 4);
				}
				Static165.aClass152_6.method3458(arg2, local345, local65, local180, arg0.anInt2169);
				local180 += Static165.aClass152_6.method3463();
			}
		}
		if (arg0.anInt2183 == -1 && arg0.aString20 == null) {
			return;
		}
		local18 >>= 0x1;
		@Pc(397) Class6_Sub31 local397 = new Class6_Sub31(arg1);
		local397.anInt5881 = local37 - local18;
		local397.anInt5886 = local18 + local34;
		local397.anInt5888 = local34 - local18;
		local397.anInt5878 = local18 + local37;
		local397.anInt5889 = local267;
		local397.anInt5882 = local263;
		local397.anInt5885 = local265;
		local397.anInt5877 = local269;
		Static200.aClass88_31.method1878(local397);
	}
}
