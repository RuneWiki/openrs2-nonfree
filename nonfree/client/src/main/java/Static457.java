import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "Lclient!gk;")
	public static final Class112 aClass112_55 = new Class112();

	@OriginalMember(owner = "client!rf", name = "k", descriptor = "[C")
	public static final char[] aCharArray14 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)Z")
	public static boolean method6408(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)V")
	public static void method6409() {
		for (@Pc(7) int local7 = 0; local7 < Static145.anInt3113; local7++) {
			Static88.aClass308Array1[local7] = null;
		}
		Static145.anInt3113 = 0;
		@Pc(29) int local29;
		@Pc(33) int local33;
		for (@Pc(25) int local25 = 0; local25 < Static459.anInt7698; local25++) {
			for (local29 = 0; local29 < Static155.anInt3254; local29++) {
				for (local33 = 0; local33 < Static39.anInt747; local33++) {
					@Pc(43) Class299 local43 = Static309.aClass299ArrayArrayArray3[local25][local33][local29];
					if (local43 != null) {
						if (local43.aShort127 > 0) {
							local43.aShort127 = (short) (local43.aShort127 * -1);
						}
						if (local43.aShort125 > 0) {
							local43.aShort125 = (short) (local43.aShort125 * -1);
						}
					}
				}
			}
		}
		for (local29 = 0; local29 < Static459.anInt7698; local29++) {
			for (local33 = 0; local33 < Static155.anInt3254; local33++) {
				for (@Pc(103) int local103 = 0; local103 < Static39.anInt747; local103++) {
					@Pc(113) Class299 local113 = Static309.aClass299ArrayArrayArray3[local29][local103][local33];
					if (local113 != null) {
						@Pc(136) boolean local136 = Static309.aClass299ArrayArrayArray3[0][local103][local33] != null && Static309.aClass299ArrayArrayArray3[0][local103][local33].aClass299_1 != null;
						@Pc(144) int local144;
						@Pc(146) int local146;
						@Pc(148) int local148;
						@Pc(150) int local150;
						@Pc(160) Class299 local160;
						@Pc(168) int local168;
						@Pc(325) int local325;
						@Pc(463) int local463;
						@Pc(471) int local471;
						@Pc(487) int local487;
						@Pc(495) int local495;
						@Pc(499) int local499;
						@Pc(503) int local503;
						@Pc(509) int local509;
						@Pc(548) int local548;
						@Pc(552) int local552;
						if (local113.aShort127 < 0) {
							local144 = local33;
							local146 = local33;
							local148 = local29;
							local150 = local29;
							local160 = Static309.aClass299ArrayArrayArray3[local29][local103][local33 - 1];
							local168 = Static108.aClass34Array6[local29].method6525(local33, local103);
							while (local144 > 0 && local160 != null && local160.aShort127 < 0 && local160.aShort127 == local113.aShort127 && local113.aShort124 == local160.aShort124 && local168 == Static108.aClass34Array6[local29].method6525(local144 - 1, local103) && (local144 - 1 <= 0 || local168 == Static108.aClass34Array6[local29].method6525(local144 - 2, local103))) {
								local144--;
								local160 = Static309.aClass299ArrayArrayArray3[local29][local103][local144 - 1];
							}
							for (local160 = Static309.aClass299ArrayArrayArray3[local29][local103][local33 + 1]; local146 < Static39.anInt747 && local160 != null && local160.aShort127 < 0 && local160.aShort127 == local113.aShort127 && local113.aShort124 == local160.aShort124 && Static108.aClass34Array6[local29].method6525(local146 + 1, local103) == local168 && (local146 + 1 >= Static39.anInt747 || local168 == Static108.aClass34Array6[local29].method6525(local146 + 2, local103)); local160 = Static309.aClass299ArrayArrayArray3[local29][local103][local146 + 1]) {
								local146++;
							}
							label289: while (local148 > 0) {
								for (local325 = local144; local325 <= local146; local325++) {
									if (Static309.aClass299ArrayArrayArray3[local148 - 1][local103][local325] == null || Static309.aClass299ArrayArrayArray3[local148 - 1][local103][local325].aShort127 != local113.aShort127 || local113.aShort124 != Static309.aClass299ArrayArrayArray3[local148 - 1][local103][local325].aShort124) {
										break label289;
									}
								}
								local148--;
							}
							label306: while (local150 < Static459.anInt7698 - 1) {
								for (local325 = local144; local325 <= local146; local325++) {
									if (Static309.aClass299ArrayArrayArray3[local150 + 1][local103][local325] == null || Static309.aClass299ArrayArrayArray3[local150 + 1][local103][local325].aShort127 != local113.aShort127 || local113.aShort124 != Static309.aClass299ArrayArrayArray3[local150 + 1][local103][local325].aShort124) {
										break label306;
									}
								}
								local150++;
							}
							local325 = local150 + 1 - local148;
							local463 = Static108.aClass34Array6[local136 ? local148 + 1 : local148].method6525(local144, local103);
							local471 = local463 + local113.aShort127 * local325;
							local487 = Static108.aClass34Array6[local136 ? local148 + 1 : local148].method6525(local146 + 1, local103);
							local495 = local487 + local113.aShort127 * local325;
							local499 = local103 << Static315.anInt5369;
							local503 = local144 << Static315.anInt5369;
							local509 = (local146 << Static315.anInt5369) + Static467.anInt7776;
							Static88.aClass308Array1[Static145.anInt3113++] = new Class308(1, local150, local499 + local113.aShort124, local113.aShort124 + local499, local113.aShort124 + local499, local499 - -local113.aShort124, local463, local487, local495, local471, local503, local509, local509, local503);
							for (local548 = local148; local548 <= local150; local548++) {
								for (local552 = local144; local552 <= local146; local552++) {
									Static309.aClass299ArrayArrayArray3[local548][local103][local552].aShort127 = (short) (Static309.aClass299ArrayArrayArray3[local548][local103][local552].aShort127 * -1);
								}
							}
						}
						if (local113.aShort125 < 0) {
							local144 = local103;
							local146 = local103;
							local148 = local29;
							local150 = local29;
							local160 = Static309.aClass299ArrayArrayArray3[local29][local103 - 1][local33];
							local168 = Static108.aClass34Array6[local29].method6525(local33, local103);
							while (local144 > 0 && local160 != null && local160.aShort125 < 0 && local160.aShort125 == local113.aShort125 && local160.aShort126 == local113.aShort126 && Static108.aClass34Array6[local29].method6525(local33, local144 - 1) == local168 && (local144 - 1 <= 0 || local168 == Static108.aClass34Array6[local29].method6525(local33, local144 - 2))) {
								local144--;
								local160 = Static309.aClass299ArrayArrayArray3[local29][local144 - 1][local33];
							}
							for (local160 = Static309.aClass299ArrayArrayArray3[local29][local103 + 1][local33]; Static155.anInt3254 > local146 && local160 != null && local160.aShort125 < 0 && local160.aShort125 == local113.aShort125 && local160.aShort126 == local113.aShort126 && Static108.aClass34Array6[local29].method6525(local33, local146 + 1) == local168 && (local146 + 1 >= Static155.anInt3254 || Static108.aClass34Array6[local29].method6525(local33, local146 + 2) == local168); local160 = Static309.aClass299ArrayArrayArray3[local29][local146 + 1][local33]) {
								local146++;
							}
							label205: while (local148 > 0) {
								for (local325 = local144; local325 <= local146; local325++) {
									if (Static309.aClass299ArrayArrayArray3[local148 - 1][local325][local33] == null || local113.aShort125 != Static309.aClass299ArrayArrayArray3[local148 - 1][local325][local33].aShort125 || Static309.aClass299ArrayArrayArray3[local148 - 1][local325][local33].aShort126 != local113.aShort126) {
										break label205;
									}
								}
								local148--;
							}
							label190: while (local150 < Static459.anInt7698 - 1) {
								for (local325 = local144; local325 <= local146; local325++) {
									if (Static309.aClass299ArrayArrayArray3[local150 + 1][local325][local33] == null || local113.aShort125 != Static309.aClass299ArrayArrayArray3[local150 + 1][local325][local33].aShort125 || local113.aShort126 != Static309.aClass299ArrayArrayArray3[local150 + 1][local325][local33].aShort126) {
										break label190;
									}
								}
								local150++;
							}
							local325 = local150 + 1 - local148;
							local463 = Static108.aClass34Array6[local136 ? local148 + 1 : local148].method6525(local33, local144);
							local471 = local463 + local113.aShort125 * local325;
							local487 = Static108.aClass34Array6[local136 ? local148 + 1 : local148].method6525(local33, local146 + 1);
							local495 = local487 + local113.aShort125 * local325;
							local499 = local144 << Static315.anInt5369;
							local503 = (local146 << Static315.anInt5369) + Static467.anInt7776;
							local509 = local33 << Static315.anInt5369;
							Static88.aClass308Array1[Static145.anInt3113++] = new Class308(2, local150, local499, local503, local503, local499, local463, local487, local495, local471, local509 + local113.aShort126, local113.aShort126 + local509, local113.aShort126 + local509, local509 - -local113.aShort126);
							for (local548 = local148; local548 <= local150; local548++) {
								for (local552 = local144; local552 <= local146; local552++) {
									Static309.aClass299ArrayArrayArray3[local548][local552][local33].aShort125 = (short) (Static309.aClass299ArrayArrayArray3[local548][local552][local33].aShort125 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static442.aBoolean562 = true;
	}
}
