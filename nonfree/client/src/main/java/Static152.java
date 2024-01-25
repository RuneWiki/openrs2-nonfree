import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "Lclient!lm;")
	public static final Class124 aClass124_6 = new Class124(16);

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "[I")
	public static final int[] anIntArray284 = new int[1000];

	@OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
	public static int anInt3325 = 0;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZZ)Z")
	public static boolean method3019(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)Z")
	public static boolean method3020(@OriginalArg(1) int arg0) {
		if (arg0 == 15 || arg0 == 12 || arg0 == 60 || arg0 == 2 || arg0 == 46) {
			return true;
		} else {
			return arg0 == 30 || arg0 == 1007;
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V")
	public static void method3021() {
		@Pc(1) Class198 local1 = Static91.aClass198_215;
		synchronized (Static91.aClass198_215) {
			Static91.aClass198_215.method5213();
		}
		local1 = Static334.aClass198_141;
		synchronized (Static334.aClass198_141) {
			Static334.aClass198_141.method5213();
		}
		@Pc(36) Class103 local36 = Static160.aClass103_1;
		synchronized (Static160.aClass103_1) {
			Static160.aClass103_1.method2973();
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V")
	public static void method3022() {
		@Pc(8) int local8 = Static261.aByteArrayArray20.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static261.aByteArrayArray20[local10] != null) {
				@Pc(18) int local18 = -1;
				for (@Pc(20) int local20 = 0; local20 < Static328.anInt6276; local20++) {
					if (Static155.anIntArray297[local10] == Static11.anIntArray7[local20]) {
						local18 = local20;
						break;
					}
				}
				if (local18 == -1) {
					Static11.anIntArray7[Static328.anInt6276] = Static155.anIntArray297[local10];
					local18 = Static328.anInt6276++;
				}
				@Pc(67) Class4_Sub11 local67 = new Class4_Sub11(Static261.aByteArrayArray20[local10]);
				@Pc(69) int local69 = 0;
				while (Static261.aByteArrayArray20[local10].length > local67.anInt3768 && local69 < 511 && Static145.anInt3273 < 1023) {
					@Pc(88) int local88 = local18 | local69++ << 6;
					@Pc(92) int local92 = local67.method3401();
					@Pc(96) int local96 = local92 >> 14;
					@Pc(102) int local102 = local92 >> 7 & 0x3F;
					@Pc(106) int local106 = local92 & 0x3F;
					@Pc(120) int local120 = (Static155.anIntArray297[local10] >> 8) * 64 + local102 - Static286.anInt6699;
					@Pc(133) int local133 = local106 + (Static155.anIntArray297[local10] & 0xFF) * 64 - Static136.anInt3193;
					@Pc(139) Class141 local139 = Static36.method744(local67.method3401());
					if (Static169.aClass8_Sub1_Sub2_Sub2Array1[local88] == null && (local139.aByte57 & 0x1) > 0 && local96 == Static263.anInt6816 && local120 >= 0 && Static350.anInt6637 > local139.anInt4382 + local120 && local133 >= 0 && Static105.anInt2647 > local139.anInt4382 + local133) {
						Static169.aClass8_Sub1_Sub2_Sub2Array1[local88] = new Class8_Sub1_Sub2_Sub2();
						Static169.aClass8_Sub1_Sub2_Sub2Array1[local88].anInt4916 = local88;
						@Pc(190) Class8_Sub1_Sub2_Sub2 local190 = Static169.aClass8_Sub1_Sub2_Sub2Array1[local88];
						Static354.anIntArray510[Static145.anInt3273++] = local88;
						local190.anInt4940 = Static199.anInt4137;
						local190.method4356(local139);
						local190.method4350(local190.aClass141_1.anInt4382);
						local190.anInt4963 = local190.aClass141_1.anInt4398 << 3;
						if (local190.anInt4963 == 0) {
							local190.method4346(0);
						} else {
							local190.method4346((local190.aClass141_1.aByte54 + 4 & 0xE6E00007) << 11);
						}
						local190.method4340(local120, local96, true, local190.method4349(), local133);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(B)Z")
	public static boolean method3024() {
		return Static80.anInt2116 != 0 || Static23.anInt452 >= 2;
	}
}
