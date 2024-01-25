import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!ef", name = "w", descriptor = "Z")
	public static boolean aBoolean316;

	@OriginalMember(owner = "client!ef", name = "nb", descriptor = "I")
	public static int anInt3608;

	@OriginalMember(owner = "client!ef", name = "Bb", descriptor = "I")
	public static int anInt3621;

	@OriginalMember(owner = "client!ef", name = "qb", descriptor = "S")
	public static short aShort63 = 256;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z[[I)V")
	public static void method3128(@OriginalArg(1) int[][] arg0) {
		Static364.anIntArrayArray57 = arg0;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(B[[BLclient!dr;[[B[[BZLclient!s;[[IILclient!s;II[[B)V")
	public static void method3136(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class37 arg1, @OriginalArg(3) byte[][] arg2, @OriginalArg(4) byte[][] arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class105 arg5, @OriginalArg(7) int[][] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class105 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) byte[][] arg11) {
		for (@Pc(9) int local9 = 0; local9 < arg10; local9++) {
			for (@Pc(13) int local13 = 0; local13 < arg9; local13++) {
				if (Static230.method4872() || Static32.method438(local9, local13, Static30.anInt483, arg7)) {
					@Pc(33) byte local33 = arg11[local9][local13];
					@Pc(39) byte local39 = arg0[local9][local13];
					@Pc(47) int local47 = arg3[local9][local13] & 0xFF;
					@Pc(55) int local55 = arg2[local9][local13] & 0xFF;
					@Pc(65) Class63 local65 = local47 == 0 ? null : Static364.method5843(local47 - 1);
					@Pc(78) Class121 local78 = local55 == 0 ? null : Static229.method4237(local55 - 1);
					@Pc(80) int local80 = 0;
					@Pc(82) int local82 = 0;
					if (local33 != 0) {
						local82 = local65 == null ? 0 : Static223.anIntArray359[local33];
						local80 = local78 == null ? 0 : Static345.anIntArray513[local33];
					} else if (local65 != null) {
						local82 = Static223.anIntArray359[local33];
					} else if (local78 != null) {
						local80 = Static223.anIntArray359[local33];
					}
					@Pc(123) int local123 = local80 + local82;
					@Pc(125) int local125 = 0;
					if (local123 != 0) {
						@Pc(133) int[] local133 = new int[local123];
						@Pc(136) int[] local136 = new int[local123];
						@Pc(139) int[] local139 = new int[local123];
						@Pc(142) int[] local142 = new int[local123];
						@Pc(144) boolean local144 = false;
						@Pc(162) int local162;
						@Pc(194) int local194;
						if (local65 == null || local65.anInt1560 == -1 && local65.anInt1569 == -1 && local65.anInt1559 == -1) {
							for (local162 = 0; local162 < local82; local162++) {
								local133[local125] = -1;
								local125++;
							}
						} else {
							local162 = arg1.method3738() ? local65.anInt1559 : local65.anInt1570;
							if (!Static219.aBoolean425) {
								local162 = -1;
							}
							for (local194 = 0; local194 < local82; local194++) {
								local139[local125] = local162;
								local142[local125] = local65.anInt1558;
								if (local65.anInt1560 == -1) {
									local133[local125] = -1;
								} else {
									local133[local125] = local65.anInt1560;
								}
								if (local65.anInt1569 == -1) {
									local136[local125] = -1;
								} else {
									local144 = true;
									local136[local125] = local65.anInt1569;
								}
								local125++;
							}
							if (!arg4 && arg7 == 0) {
								Static295.method4933(local9, local13, local65.anInt1563, local65.anInt1564 * 8);
							}
						}
						if (!local144) {
							local136 = null;
						}
						if (local78 == null) {
							for (local162 = 0; local162 < local80; local162++) {
								local133[local125] = -1;
								local125++;
							}
						} else {
							local162 = local78.anInt3852;
							if (!Static219.aBoolean425) {
								local162 = -1;
							}
							for (local194 = 0; local194 < local80; local194++) {
								local139[local125] = local162;
								local142[local125] = local78.anInt3862;
								local133[local125] = arg6[local9][local13];
								if (local136 != null) {
									local136[local125] = -1;
								}
								local125++;
							}
						}
						local162 = Static164.anIntArray289.length;
						@Pc(329) int[] local329 = arg4 ? new int[local162] : null;
						@Pc(332) int[] local332 = new int[local162];
						@Pc(335) int[] local335 = new int[local162];
						@Pc(343) int local343;
						@Pc(347) int local347;
						@Pc(433) int local433;
						@Pc(441) int local441;
						for (@Pc(337) int local337 = 0; local337 < local162; local337++) {
							local343 = Static164.anIntArray289[local337];
							local347 = Static171.anIntArray293[local337];
							if (local39 == 0) {
								local332[local337] = local343;
								local335[local337] = local347;
							} else if (local39 == 1) {
								local332[local337] = local347;
								local335[local337] = 128 - local343;
							} else if (local39 == 2) {
								local332[local337] = 128 - local343;
								local335[local337] = 128 - local347;
							} else if (local39 == 3) {
								local332[local337] = 128 - local347;
								local335[local337] = local343;
							}
							if (arg4 && Static70.aBooleanArrayArray2[local33][local337]) {
								local433 = (local9 << 7) + local332[local337];
								local441 = (local13 << 7) + local335[local337];
								local329[local337] = arg8.method4452(local433, local441) - arg5.method4452(local433, local441);
							}
						}
						local343 = arg5.method4453(local9, local13);
						local347 = arg5.method4453(local9 + 1, local13);
						local433 = arg5.method4453(local9 + 1, local13 + 1);
						local441 = arg5.method4453(local9, local13 + 1);
						if (arg7 > 0) {
							@Pc(493) boolean local493 = true;
							if (local55 == 0 && local33 != 0) {
								local493 = false;
							}
							if (local47 > 0 && local65 != null && !local65.aBoolean141) {
								local493 = false;
							}
							if (local493 && local347 == local343 && local343 == local433 && local441 == local343) {
								Static314.aByteArrayArrayArray11[arg7][local9][local13] = (byte) (Static314.aByteArrayArrayArray11[arg7][local9][local13] | 0x4);
							}
						}
						@Pc(559) int local559 = 0;
						@Pc(561) int local561 = 0;
						if (arg4) {
							local559 = Static366.method3921(local9, local13);
							local561 = Static273.method4728(local9, local13);
						}
						arg5.method4443(local9, local13, local332, local329, local335, Static36.anIntArrayArray12[local33], Static85.anIntArrayArray20[local33], Static327.anIntArrayArray54[local33], local133, local136, local139, local142, local559, local561);
						Static211.method5300(arg7, local9, local13);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BLclient!iq;)V")
	public static void method3143(@OriginalArg(1) Class104 arg0) {
		Static307.aClass104_161 = arg0;
	}
}
