import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ac", name = "C", descriptor = "Lclient!ud;")
	public static final Class239 aClass239_1 = new Class239("WTI", 5);

	@OriginalMember(owner = "client!ac", name = "G", descriptor = "I")
	public static int anInt139 = 0;

	@OriginalMember(owner = "client!ac", name = "P", descriptor = "[B")
	public static final byte[] aByteArray2 = new byte[2048];

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)Lclient!mj;")
	public static Class6_Sub1 method104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class53 local7 = Static40.aClass53ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass6_Sub1_2;
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
	public static void method105() {
		@Pc(8) int local8 = Static288.aByteArrayArray13.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static288.aByteArrayArray13[local10] != null) {
				@Pc(23) int local23 = -1;
				for (@Pc(25) int local25 = 0; local25 < Static16.anInt6116; local25++) {
					if (Static100.anIntArray134[local10] == Static431.anIntArray633[local25]) {
						local23 = local25;
						break;
					}
				}
				if (local23 == -1) {
					Static431.anIntArray633[Static16.anInt6116] = Static100.anIntArray134[local10];
					local23 = Static16.anInt6116++;
				}
				@Pc(65) Class4_Sub30 local65 = new Class4_Sub30(Static288.aByteArrayArray13[local10]);
				@Pc(67) int local67 = 0;
				while (Static288.aByteArrayArray13[local10].length > local65.anInt6244 && local67 < 511 && Static249.anInt4520 < 1023) {
					@Pc(86) int local86 = local23 | local67++ << 6;
					@Pc(90) int local90 = local65.method4877();
					@Pc(94) int local94 = local90 >> 14;
					@Pc(100) int local100 = local90 >> 7 & 0x3F;
					@Pc(104) int local104 = local90 & 0x3F;
					@Pc(117) int local117 = local100 + (Static100.anIntArray134[local10] >> 8) * 64 - Static381.anInt6688;
					@Pc(130) int local130 = local104 + (Static100.anIntArray134[local10] & 0xFF) * 64 - Static285.anInt5187;
					@Pc(139) Class243 local139 = Static388.aClass211_1.method4931(local65.method4877());
					if (Static176.aClass6_Sub2_Sub1_Sub2Array1[local86] == null && (local139.aByte105 & 0x1) > 0 && local94 == Static107.anInt2257 && local117 >= 0 && Static126.anInt2569 > local117 + local139.anInt6902 && local130 >= 0 && local130 + local139.anInt6902 < Static190.anInt3697) {
						Static176.aClass6_Sub2_Sub1_Sub2Array1[local86] = new Class6_Sub2_Sub1_Sub2();
						Static176.aClass6_Sub2_Sub1_Sub2Array1[local86].anInt6078 = local86;
						@Pc(189) Class6_Sub2_Sub1_Sub2 local189 = Static176.aClass6_Sub2_Sub1_Sub2Array1[local86];
						Static128.anIntArray171[Static249.anInt4520++] = local86;
						local189.anInt6142 = Static175.anInt3261;
						local189.method4770(local139);
						local189.method4761(local189.aClass243_1.anInt6902);
						local189.anInt6071 = local189.aClass243_1.anInt6913 << 3;
						if (local189.anInt6071 == 0) {
							local189.method4766(0);
						} else {
							local189.method4766((local189.aClass243_1.aByte104 + 4 & 0x7DA00007) << 11);
						}
						local189.method4772(local189.method4763(), local94, local130, local117, true);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(FIIIIFIFFI[BFLclient!ut;)V")
	public static void method106(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(5) float arg2, @OriginalArg(7) float arg3, @OriginalArg(8) float arg4, @OriginalArg(10) byte[] arg5, @OriginalArg(11) float arg6, @OriginalArg(12) Class238 arg7) {
		for (@Pc(3) int local3 = 0; local3 < 16; local3++) {
			Static7.method259(arg7, arg1, arg2, arg5, arg4, arg0, arg3, arg6, local3);
			arg1 += 16384;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ICI)C")
	public static char method107(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		if (arg1 >= 'À' && arg1 <= 'ÿ') {
			if (arg1 >= 'À' && arg1 <= 'Æ') {
				return 'A';
			}
			if (arg1 == 'Ç') {
				return 'C';
			}
			if (arg1 >= 'È' && arg1 <= 'Ë') {
				return 'E';
			}
			if (arg1 >= 'Ì' && arg1 <= 'Ï') {
				return 'I';
			}
			if (arg1 == 'Ñ' && arg0 != 0) {
				return 'N';
			}
			if (arg1 >= 'Ò' && arg1 <= 'Ö') {
				return 'O';
			}
			if (arg1 >= 'Ù' && arg1 <= 'Ü') {
				return 'U';
			}
			if (arg1 == 'Ý') {
				return 'Y';
			}
			if (arg1 == 'ß') {
				return 's';
			}
			if (arg1 >= 'à' && arg1 <= 'æ') {
				return 'a';
			}
			if (arg1 == 'ç') {
				return 'c';
			}
			if (arg1 >= 'è' && arg1 <= 'ë') {
				return 'e';
			}
			if (arg1 >= 'ì' && arg1 <= 'ï') {
				return 'i';
			}
			if (arg1 == 'ñ' && arg0 != 0) {
				return 'n';
			}
			if (arg1 >= 'ò' && arg1 <= 'ö') {
				return 'o';
			}
			if (arg1 >= 'ù' && arg1 <= 'ü') {
				return 'u';
			}
			if (arg1 == 'ý' || arg1 == 'ÿ') {
				return 'y';
			}
		}
		if (arg1 == 'Œ') {
			return 'O';
		} else if (arg1 == 'œ') {
			return 'o';
		} else if (arg1 == 'Ÿ') {
			return 'Y';
		} else {
			return arg1;
		}
	}
}
