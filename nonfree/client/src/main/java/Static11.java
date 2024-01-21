import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
	public static int anInt249 = 0;

	@OriginalMember(owner = "client!ba", name = "A", descriptor = "Lclient!sg;")
	public static final Class91 aClass91_1 = new Class91();

	@OriginalMember(owner = "client!ba", name = "D", descriptor = "Lclient!sg;")
	public static final Class91 aClass91_2 = new Class91();

	@OriginalMember(owner = "client!ba", name = "F", descriptor = "[I")
	public static final int[] anIntArray18 = new int[128];

	@OriginalMember(owner = "client!ba", name = "G", descriptor = "I")
	public static int anInt258 = 0;

	@OriginalMember(owner = "client!ba", name = "H", descriptor = "Z")
	public static boolean aBoolean11 = false;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILclient!mf;)I")
	public static int method226(@OriginalArg(1) int arg0, @OriginalArg(2) Class69 arg1) {
		if (arg1.anIntArrayArray26 == null || arg0 >= arg1.anIntArrayArray26.length) {
			return -2;
		}
		try {
			@Pc(22) int local22 = 0;
			@Pc(27) int[] local27 = arg1.anIntArrayArray26[arg0];
			@Pc(29) byte local29 = 0;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(36) int local36 = local27[local31++];
				@Pc(38) int local38 = 0;
				@Pc(40) byte local40 = 0;
				if (local36 == 0) {
					return local22;
				}
				if (local36 == 1) {
					local38 = Static41.anIntArray89[local27[local31++]];
				}
				if (local36 == 2) {
					local38 = Static218.anIntArray431[local27[local31++]];
				}
				if (local36 == 3) {
					local38 = Static101.anIntArray213[local27[local31++]];
				}
				@Pc(93) int local93;
				@Pc(104) Class69 local104;
				@Pc(109) int local109;
				@Pc(121) int local121;
				if (local36 == 4) {
					local93 = local27[local31++] << 16;
					@Pc(100) int local100 = local93 + local27[local31++];
					local104 = Static157.method2392(local100);
					local109 = local27[local31++];
					if (local109 != -1 && (!Static196.method2908(local109).aBoolean99 || Static148.aBoolean131)) {
						for (local121 = 0; local121 < local104.anIntArray277.length; local121++) {
							if (local109 + 1 == local104.anIntArray277[local121]) {
								local38 += local104.anIntArray286[local121];
							}
						}
					}
				}
				if (local36 == 15) {
					local40 = 1;
				}
				if (local36 == 5) {
					local38 = Static139.anIntArray309[local27[local31++]];
				}
				if (local36 == 16) {
					local40 = 2;
				}
				if (local36 == 6) {
					local38 = Class41.anIntArray146[Static218.anIntArray431[local27[local31++]] - 1];
				}
				if (local36 == 17) {
					local40 = 3;
				}
				if (local36 == 7) {
					local38 = Static139.anIntArray309[local27[local31++]] * 100 / 46875;
				}
				if (local36 == 8) {
					local38 = Static210.aClass1_Sub2_Sub2_2.anInt2275;
				}
				if (local36 == 9) {
					for (local93 = 0; local93 < 25; local93++) {
						if (Static49.aBooleanArray13[local93]) {
							local38 += Static218.anIntArray431[local93];
						}
					}
				}
				if (local36 == 10) {
					local93 = local27[local31++] << 16;
					local93 += local27[local31++];
					local104 = Static157.method2392(local93);
					local109 = local27[local31++];
					if (local109 != -1 && (!Static196.method2908(local109).aBoolean99 || Static148.aBoolean131)) {
						for (local121 = 0; local121 < local104.anIntArray277.length; local121++) {
							if (local104.anIntArray277[local121] == local109 + 1) {
								local38 = 999999999;
								break;
							}
						}
					}
				}
				if (local36 == 11) {
					local38 = Static166.anInt3315;
				}
				if (local36 == 12) {
					local38 = Static75.anInt1622;
				}
				if (local36 == 13) {
					local93 = Static139.anIntArray309[local27[local31++]];
					@Pc(330) int local330 = local27[local31++];
					local38 = (0x1 << local330 & local93) == 0 ? 0 : 1;
				}
				if (local36 == 14) {
					local93 = local27[local31++];
					local38 = Static208.method3105(local93);
				}
				if (local36 == 18) {
					local38 = Static86.anInt1895 + (Static210.aClass1_Sub2_Sub2_2.anInt2241 >> 7);
				}
				if (local36 == 19) {
					local38 = Static110.anInt2295 + (Static210.aClass1_Sub2_Sub2_2.anInt2234 >> 7);
				}
				if (local36 == 20) {
					local38 = local27[local31++];
				}
				if (local40 == 0) {
					if (local29 == 0) {
						local22 += local38;
					}
					if (local29 == 1) {
						local22 -= local38;
					}
					if (local29 == 2 && local38 != 0) {
						local22 /= local38;
					}
					if (local29 == 3) {
						local22 *= local38;
					}
					local29 = 0;
				} else {
					local29 = local40;
				}
			}
		} catch (@Pc(439) Exception local439) {
			return -1;
		}
	}
}
