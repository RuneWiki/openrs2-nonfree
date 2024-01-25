import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "Lclient!qj;")
	public static final Class277 aClass277_9 = new Class277(5, 16);

	@OriginalMember(owner = "client!jaa", name = "f", descriptor = "I")
	public static int anInt4898 = 0;

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(III)Z")
	public static boolean method3760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static235.method3839(arg1, arg0) | Static186.method3074(arg0, arg1) | Static105.method6898(arg0, arg1)) & Static436.method6473(arg0, arg1);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(II)I")
	public static int method3761(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILclient!jda;II)Lclient!vfa;")
	public static Class4_Sub6_Sub19 method3763(@OriginalArg(0) int arg0, @OriginalArg(1) Class162 arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = arg1.anInt4953 | arg0 << 10;
		@Pc(19) Class4_Sub6_Sub19 local19 = (Class4_Sub6_Sub19) Static365.aClass340_3.method7723((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(31) byte[] local31 = Static75.aClass348_26.method7969(Static75.aClass348_26.method7953(local10));
		if (local31 == null) {
			local10 = arg2 + 65536 << 10 | arg1.anInt4953;
			local19 = (Class4_Sub6_Sub19) Static365.aClass340_3.method7723((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local31 = Static75.aClass348_26.method7969(Static75.aClass348_26.method7953(local10));
			if (local31 == null) {
				local10 = arg1.anInt4953 | 0x3FFFC00;
				local19 = (Class4_Sub6_Sub19) Static365.aClass340_3.method7723((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local31 = Static75.aClass348_26.method7969(Static75.aClass348_26.method7953(local10));
				if (local31 == null) {
					return null;
				} else if (local31.length <= 1) {
					return null;
				} else {
					try {
						local19 = Static218.method3528(local31);
					} catch (@Pc(198) Exception local198) {
						throw new RuntimeException(local198.getMessage() + " S: " + local10);
					}
					local19.aClass162_11 = arg1;
					Static365.aClass340_3.method7724((long) local10 << 16, local19);
					return local19;
				}
			} else if (local31.length <= 1) {
				return null;
			} else {
				try {
					local19 = Static218.method3528(local31);
				} catch (@Pc(126) Exception local126) {
					throw new RuntimeException(local126.getMessage() + " S: " + local10);
				}
				local19.aClass162_11 = arg1;
				Static365.aClass340_3.method7724((long) local10 << 16, local19);
				return local19;
			}
		} else if (local31.length <= 1) {
			return null;
		} else {
			try {
				local19 = Static218.method3528(local31);
			} catch (@Pc(47) Exception local47) {
				throw new RuntimeException(local47.getMessage() + " S: " + local10);
			}
			local19.aClass162_11 = arg1;
			Static365.aClass340_3.method7724((long) local10 << 16, local19);
			return local19;
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)V")
	public static void method3764() {
		for (@Pc(8) int local8 = 0; local8 < Static123.anInt9178; local8++) {
			Static542.aClass262Array3[local8] = null;
		}
		Static123.anInt9178 = 0;
		@Pc(30) int local30;
		@Pc(34) int local34;
		for (@Pc(26) int local26 = 0; local26 < Static218.anInt4559; local26++) {
			for (local30 = 0; local30 < Static10.anInt812; local30++) {
				for (local34 = 0; local34 < Static255.anInt5209; local34++) {
					@Pc(44) Class182 local44 = Static571.aClass182ArrayArrayArray3[local26][local34][local30];
					if (local44 != null) {
						if (local44.aShort77 > 0) {
							local44.aShort77 = (short) (local44.aShort77 * -1);
						}
						if (local44.aShort78 > 0) {
							local44.aShort78 = (short) (local44.aShort78 * -1);
						}
					}
				}
			}
		}
		for (local30 = 0; local30 < Static218.anInt4559; local30++) {
			for (local34 = 0; local34 < Static10.anInt812; local34++) {
				for (@Pc(102) int local102 = 0; local102 < Static255.anInt5209; local102++) {
					@Pc(112) Class182 local112 = Static571.aClass182ArrayArrayArray3[local30][local102][local34];
					if (local112 != null) {
						@Pc(135) boolean local135 = Static571.aClass182ArrayArrayArray3[0][local102][local34] != null && Static571.aClass182ArrayArrayArray3[0][local102][local34].aClass182_1 != null;
						@Pc(140) int local140;
						@Pc(142) int local142;
						@Pc(156) Class182 local156;
						@Pc(164) int local164;
						@Pc(328) int local328;
						@Pc(342) int local342;
						@Pc(350) int local350;
						@Pc(366) int local366;
						@Pc(373) int local373;
						@Pc(377) int local377;
						@Pc(381) int local381;
						@Pc(387) int local387;
						@Pc(426) int local426;
						@Pc(430) int local430;
						if (local112.aShort77 < 0) {
							local140 = local34;
							local142 = local34;
							local156 = Static571.aClass182ArrayArrayArray3[local30][local102][local34 - 1];
							local164 = Static432.aClass115Array3[local30].method8055(local34, local102);
							while (local140 > 0 && local156 != null && local156.aShort77 < 0 && local112.aShort77 == local156.aShort77 && local112.aShort79 == local156.aShort79 && Static432.aClass115Array3[local30].method8055(local140 - 1, local102) == local164 && (local140 - 1 <= 0 || Static432.aClass115Array3[local30].method8055(local140 - 2, local102) == local164)) {
								local140--;
								local156 = Static571.aClass182ArrayArrayArray3[local30][local102][local140 - 1];
							}
							for (local156 = Static571.aClass182ArrayArrayArray3[local30][local102][local34 + 1]; local142 < Static255.anInt5209 && local156 != null && local156.aShort77 < 0 && local112.aShort77 == local156.aShort77 && local156.aShort79 == local112.aShort79 && local164 == Static432.aClass115Array3[local30].method8055(local142 + 1, local102) && (Static255.anInt5209 <= local142 + 1 || local164 == Static432.aClass115Array3[local30].method8055(local142 + 2, local102)); local156 = Static571.aClass182ArrayArrayArray3[local30][local102][local142 + 1]) {
								local142++;
							}
							local328 = local30 + 1 - local30;
							local342 = Static432.aClass115Array3[local135 ? local30 + 1 : local30].method8055(local140, local102);
							local350 = local342 + local112.aShort77 * local328;
							local366 = Static432.aClass115Array3[local135 ? local30 + 1 : local30].method8055(local142 + 1, local102);
							local373 = local366 + local112.aShort77 * local328;
							local377 = local102 << Static392.anInt3635;
							local381 = local140 << Static392.anInt3635;
							local387 = (local142 << Static392.anInt3635) + Static168.anInt3487;
							Static542.aClass262Array3[Static123.anInt9178++] = new Class262(1, local30, local112.aShort79 + local377, local112.aShort79 + local377, local377 + local112.aShort79, local377 + local112.aShort79, local342, local366, local373, local350, local381, local387, local387, local381);
							for (local426 = local30; local426 <= local30; local426++) {
								for (local430 = local140; local430 <= local142; local430++) {
									Static571.aClass182ArrayArrayArray3[local426][local102][local430].aShort77 = (short) (Static571.aClass182ArrayArrayArray3[local426][local102][local430].aShort77 * -1);
								}
							}
						}
						if (local112.aShort78 < 0) {
							local140 = local102;
							local142 = local102;
							local156 = Static571.aClass182ArrayArrayArray3[local30][local102 - 1][local34];
							local164 = Static432.aClass115Array3[local30].method8055(local34, local102);
							while (local140 > 0 && local156 != null && local156.aShort78 < 0 && local156.aShort78 == local112.aShort78 && local156.aShort76 == local112.aShort76 && local164 == Static432.aClass115Array3[local30].method8055(local34, local140 - 1) && (local140 - 1 <= 0 || local164 == Static432.aClass115Array3[local30].method8055(local34, local140 - 2))) {
								local140--;
								local156 = Static571.aClass182ArrayArrayArray3[local30][local140 - 1][local34];
							}
							for (local156 = Static571.aClass182ArrayArrayArray3[local30][local102 + 1][local34]; Static10.anInt812 > local142 && local156 != null && local156.aShort78 < 0 && local156.aShort78 == local112.aShort78 && local156.aShort76 == local112.aShort76 && Static432.aClass115Array3[local30].method8055(local34, local142 + 1) == local164 && (Static10.anInt812 <= local142 + 1 || Static432.aClass115Array3[local30].method8055(local34, local142 + 2) == local164); local156 = Static571.aClass182ArrayArrayArray3[local30][local142 + 1][local34]) {
								local142++;
							}
							local328 = local30 + 1 - local30;
							local342 = Static432.aClass115Array3[local135 ? local30 + 1 : local30].method8055(local34, local140);
							local350 = local342 + local112.aShort78 * local328;
							local366 = Static432.aClass115Array3[local135 ? local30 + 1 : local30].method8055(local34, local142 + 1);
							local373 = local366 + local112.aShort78 * local328;
							local377 = local140 << Static392.anInt3635;
							local381 = Static168.anInt3487 + (local142 << Static392.anInt3635);
							local387 = local34 << Static392.anInt3635;
							Static542.aClass262Array3[Static123.anInt9178++] = new Class262(2, local30, local377, local381, local381, local377, local342, local366, local373, local350, local112.aShort76 + local387, local387 + local112.aShort76, local387 + local112.aShort76, local387 + local112.aShort76);
							for (local426 = local30; local426 <= local30; local426++) {
								for (local430 = local140; local430 <= local142; local430++) {
									Static571.aClass182ArrayArrayArray3[local426][local430][local34].aShort78 = (short) (Static571.aClass182ArrayArrayArray3[local426][local430][local34].aShort78 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static595.aBoolean721 = true;
	}
}
