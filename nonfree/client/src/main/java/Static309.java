import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!kha", name = "h", descriptor = "I")
	public static int anInt5138;

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(Z)I")
	public static int method4729() {
		return Static76.anInt1404 == 1 ? Static561.anInt9112 : Static617.anInt9892;
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(III)V")
	public static void method4730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class164 local7 = Static15.aClass164ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 != null) {
			Static346.method5177(local7.aClass28_Sub1_Sub3_1);
			if (local7.aClass28_Sub1_Sub3_1 != null) {
				local7.aClass28_Sub1_Sub3_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(I)V")
	public static void method4731() {
		for (@Pc(3) int local3 = 0; local3 < Static569.anInt9199; local3++) {
			Static412.aClass60Array7[local3] = null;
		}
		Static569.anInt9199 = 0;
		@Pc(29) int local29;
		@Pc(33) int local33;
		for (@Pc(25) int local25 = 0; local25 < Static183.anInt3720; local25++) {
			for (local29 = 0; local29 < Static146.anInt2951; local29++) {
				for (local33 = 0; local33 < Static602.anInt9668; local33++) {
					@Pc(43) Class164 local43 = Static15.aClass164ArrayArrayArray5[local25][local33][local29];
					if (local43 != null) {
						if (local43.aShort46 > 0) {
							local43.aShort46 = (short) (local43.aShort46 * -1);
						}
						if (local43.aShort48 > 0) {
							local43.aShort48 = (short) (local43.aShort48 * -1);
						}
					}
				}
			}
		}
		for (local29 = 0; local29 < Static183.anInt3720; local29++) {
			for (local33 = 0; local33 < Static146.anInt2951; local33++) {
				for (@Pc(90) int local90 = 0; local90 < Static602.anInt9668; local90++) {
					@Pc(100) Class164 local100 = Static15.aClass164ArrayArrayArray5[local29][local90][local33];
					if (local100 != null) {
						@Pc(123) boolean local123 = Static15.aClass164ArrayArrayArray5[0][local90][local33] != null && Static15.aClass164ArrayArrayArray5[0][local90][local33].aClass164_1 != null;
						@Pc(131) int local131;
						@Pc(133) int local133;
						@Pc(147) Class164 local147;
						@Pc(155) int local155;
						@Pc(307) int local307;
						@Pc(321) int local321;
						@Pc(328) int local328;
						@Pc(344) int local344;
						@Pc(351) int local351;
						@Pc(355) int local355;
						@Pc(359) int local359;
						@Pc(366) int local366;
						@Pc(405) int local405;
						@Pc(409) int local409;
						if (local100.aShort46 < 0) {
							local131 = local33;
							local133 = local33;
							local147 = Static15.aClass164ArrayArrayArray5[local29][local90][local33 - 1];
							local155 = Static582.aClass21Array3[local29].method7973(local90, local33);
							while (local131 > 0 && local147 != null && local147.aShort46 < 0 && local100.aShort46 == local147.aShort46 && local100.aShort47 == local147.aShort47 && Static582.aClass21Array3[local29].method7973(local90, local131 - 1) == local155 && (local131 - 1 <= 0 || Static582.aClass21Array3[local29].method7973(local90, local131 - 2) == local155)) {
								local131--;
								local147 = Static15.aClass164ArrayArrayArray5[local29][local90][local131 - 1];
							}
							for (local147 = Static15.aClass164ArrayArrayArray5[local29][local90][local33 + 1]; local133 < Static602.anInt9668 && local147 != null && local147.aShort46 < 0 && local100.aShort46 == local147.aShort46 && local100.aShort47 == local147.aShort47 && Static582.aClass21Array3[local29].method7973(local90, local133 + 1) == local155 && (local133 + 1 >= Static602.anInt9668 || Static582.aClass21Array3[local29].method7973(local90, local133 + 2) == local155); local147 = Static15.aClass164ArrayArrayArray5[local29][local90][local133 + 1]) {
								local133++;
							}
							local307 = local29 + 1 - local29;
							local321 = Static582.aClass21Array3[local123 ? local29 + 1 : local29].method7973(local90, local131);
							local328 = local100.aShort46 * local307 + local321;
							local344 = Static582.aClass21Array3[local123 ? local29 + 1 : local29].method7973(local90, local133 + 1);
							local351 = local307 * local100.aShort46 + local344;
							local355 = local90 << Static391.anInt10262;
							local359 = local131 << Static391.anInt10262;
							local366 = (local133 << Static391.anInt10262) + Static207.anInt4003;
							Static412.aClass60Array7[Static569.anInt9199++] = new Class60(1, local29, local355 + local100.aShort47, local100.aShort47 + local355, local100.aShort47 + local355, local100.aShort47 + local355, local321, local344, local351, local328, local359, local366, local366, local359);
							for (local405 = local29; local405 <= local29; local405++) {
								for (local409 = local131; local409 <= local133; local409++) {
									Static15.aClass164ArrayArrayArray5[local405][local90][local409].aShort46 = (short) (Static15.aClass164ArrayArrayArray5[local405][local90][local409].aShort46 * -1);
								}
							}
						}
						if (local100.aShort48 < 0) {
							local131 = local90;
							local133 = local90;
							local147 = Static15.aClass164ArrayArrayArray5[local29][local90 - 1][local33];
							local155 = Static582.aClass21Array3[local29].method7973(local90, local33);
							while (local131 > 0 && local147 != null && local147.aShort48 < 0 && local100.aShort48 == local147.aShort48 && local100.aShort49 == local147.aShort49 && Static582.aClass21Array3[local29].method7973(local131 - 1, local33) == local155 && (local131 - 1 <= 0 || Static582.aClass21Array3[local29].method7973(local131 - 2, local33) == local155)) {
								local131--;
								local147 = Static15.aClass164ArrayArrayArray5[local29][local131 - 1][local33];
							}
							for (local147 = Static15.aClass164ArrayArrayArray5[local29][local90 + 1][local33]; Static146.anInt2951 > local133 && local147 != null && local147.aShort48 < 0 && local100.aShort48 == local147.aShort48 && local147.aShort49 == local100.aShort49 && Static582.aClass21Array3[local29].method7973(local133 + 1, local33) == local155 && (Static146.anInt2951 <= local133 + 1 || local155 == Static582.aClass21Array3[local29].method7973(local133 + 2, local33)); local147 = Static15.aClass164ArrayArrayArray5[local29][local133 + 1][local33]) {
								local133++;
							}
							local307 = local29 + 1 - local29;
							local321 = Static582.aClass21Array3[local123 ? local29 + 1 : local29].method7973(local131, local33);
							local328 = local321 + local307 * local100.aShort48;
							local344 = Static582.aClass21Array3[local123 ? local29 + 1 : local29].method7973(local133 + 1, local33);
							local351 = local100.aShort48 * local307 + local344;
							local355 = local131 << Static391.anInt10262;
							local359 = Static207.anInt4003 + (local133 << Static391.anInt10262);
							local366 = local33 << Static391.anInt10262;
							Static412.aClass60Array7[Static569.anInt9199++] = new Class60(2, local29, local355, local359, local359, local355, local321, local344, local351, local328, local366 + local100.aShort49, local100.aShort49 + local366, local366 + local100.aShort49, local100.aShort49 + local366);
							for (local405 = local29; local405 <= local29; local405++) {
								for (local409 = local131; local409 <= local133; local409++) {
									Static15.aClass164ArrayArrayArray5[local405][local409][local33].aShort48 = (short) (Static15.aClass164ArrayArrayArray5[local405][local409][local33].aShort48 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static66.aBoolean90 = true;
	}
}
