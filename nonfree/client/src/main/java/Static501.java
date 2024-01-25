import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static501 {

	@OriginalMember(owner = "client!tda", name = "pb", descriptor = "[I")
	public static int[] anIntArray637;

	@OriginalMember(owner = "client!tda", name = "fb", descriptor = "I")
	public static int anInt8346 = 1;

	@OriginalMember(owner = "client!tda", name = "jb", descriptor = "I")
	public static int anInt8347 = -1;

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(BLclient!wv;)V")
	public static void method6776(@OriginalArg(1) Class4_Sub1_Sub1 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt7084 == Static312.anInt5688 || arg0.anInt7085 == -1 || arg0.anInt7107 != 0) {
			local5 = true;
		} else {
			@Pc(29) Class57 local29 = Static78.aClass298_2.method6521(arg0.anInt7085);
			if (local29.aBoolean114 || arg0.anInt7054 + 1 > local29.anIntArray130[arg0.anInt7112]) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(57) int local57 = arg0.anInt7084 - arg0.anInt7105;
			@Pc(63) int local63 = Static312.anInt5688 - arg0.anInt7105;
			@Pc(74) int local74 = arg0.anInt7091 * 512 + arg0.method5892() * 256;
			@Pc(86) int local86 = arg0.anInt7086 * 512 + arg0.method5892() * 256;
			@Pc(97) int local97 = arg0.anInt7076 * 512 + arg0.method5892() * 256;
			@Pc(108) int local108 = arg0.anInt7057 * 512 + arg0.method5892() * 256;
			arg0.anInt9542 = (local74 * (local57 - local63) + local97 * local63) / local57;
			arg0.anInt9540 = ((local57 - local63) * local86 + local63 * local108) / local57;
		}
		arg0.anInt7134 = 0;
		if (arg0.anInt7056 == 0) {
			arg0.method5903(false, 8192);
		}
		if (arg0.anInt7056 == 1) {
			arg0.method5903(false, 12288);
		}
		if (arg0.anInt7056 == 2) {
			arg0.method5903(false, 0);
		}
		if (arg0.anInt7056 == 3) {
			arg0.method5903(false, 4096);
		}
	}

	@OriginalMember(owner = "client!tda", name = "c", descriptor = "(I)V")
	public static void method6777() {
		@Pc(9) int local9 = Static282.aClass6_Sub21_Sub2_1.method6026();
		@Pc(13) int local13 = Static282.aClass6_Sub21_Sub2_1.method6048();
		Static367.anInt6493 = Static282.aClass6_Sub21_Sub2_1.method6035();
		@Pc(21) int local21 = Static282.aClass6_Sub21_Sub2_1.method6068();
		@Pc(30) boolean local30 = Static282.aClass6_Sub21_Sub2_1.method6035() == 1;
		Static265.method4443();
		Static361.method6651(local13);
		Static282.aClass6_Sub21_Sub2_1.method6082();
		@Pc(48) int local48;
		@Pc(52) int local52;
		@Pc(59) int local59;
		for (@Pc(44) int local44 = 0; local44 < 4; local44++) {
			for (local48 = 0; local48 < Static473.anInt8075 >> 3; local48++) {
				for (local52 = 0; local52 < Static165.anInt6749 >> 3; local52++) {
					local59 = Static282.aClass6_Sub21_Sub2_1.method6078(1);
					if (local59 == 1) {
						Static553.anIntArrayArrayArray20[local44][local48][local52] = Static282.aClass6_Sub21_Sub2_1.method6078(26);
					} else {
						Static553.anIntArrayArrayArray20[local44][local48][local52] = -1;
					}
				}
			}
		}
		Static282.aClass6_Sub21_Sub2_1.method6076();
		local48 = (Static177.anInt3710 - Static282.aClass6_Sub21_Sub2_1.anInt7338) / 16;
		Static486.anIntArrayArray73 = new int[local48][4];
		for (local52 = 0; local52 < local48; local52++) {
			for (local59 = 0; local59 < 4; local59++) {
				Static486.anIntArrayArray73[local52][local59] = Static282.aClass6_Sub21_Sub2_1.method6036();
			}
		}
		Static334.aByteArrayArray19 = new byte[local48][];
		Static347.anIntArray461 = new int[local48];
		Static30.aByteArrayArray2 = new byte[local48][];
		Static365.anIntArray477 = new int[local48];
		Static380.aByteArrayArray22 = new byte[local48][];
		Static542.aByteArrayArray30 = null;
		Static228.anIntArray281 = new int[local48];
		Static98.anIntArray154 = new int[local48];
		Static64.aByteArrayArray18 = new byte[local48][];
		Static378.anIntArray493 = null;
		Static220.anIntArray273 = new int[local48];
		local48 = 0;
		for (local59 = 0; local59 < 4; local59++) {
			for (@Pc(183) int local183 = 0; local183 < Static473.anInt8075 >> 3; local183++) {
				for (@Pc(187) int local187 = 0; local187 < Static165.anInt6749 >> 3; local187++) {
					@Pc(197) int local197 = Static553.anIntArrayArrayArray20[local59][local183][local187];
					if (local197 != -1) {
						@Pc(206) int local206 = local197 >> 14 & 0x3FF;
						@Pc(212) int local212 = local197 >> 3 & 0x7FF;
						@Pc(223) int local223 = (local206 / 8 << 8) + (local212 / 8);
						for (@Pc(225) int local225 = 0; local225 < local48; local225++) {
							if (local223 == Static365.anIntArray477[local225]) {
								local223 = -1;
								break;
							}
						}
						if (local223 != -1) {
							Static365.anIntArray477[local48] = local223;
							@Pc(257) int local257 = local223 >> 8 & 0xFF;
							@Pc(261) int local261 = local223 & 0xFF;
							Static220.anIntArray273[local48] = Static70.aClass251_58.method5764("m" + local257 + "_" + local261);
							Static228.anIntArray281[local48] = Static70.aClass251_58.method5764("l" + local257 + "_" + local261);
							Static98.anIntArray154[local48] = Static70.aClass251_58.method5764("um" + local257 + "_" + local261);
							Static347.anIntArray461[local48] = Static70.aClass251_58.method5764("ul" + local257 + "_" + local261);
							local48++;
						}
					}
				}
			}
		}
		Static66.method1315(local30, 11, local9, local21);
	}
}
