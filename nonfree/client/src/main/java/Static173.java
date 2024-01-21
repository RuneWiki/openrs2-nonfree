import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!va", name = "h", descriptor = "[Lclient!oe;")
	public static Class1_Sub2_Sub2_Sub3[] aClass1_Sub2_Sub2_Sub3Array11;

	@OriginalMember(owner = "client!va", name = "c", descriptor = "Lclient!tg;")
	private static Class81 aClass81_1395 = Static120.method2057("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!va", name = "d", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1396 = Static120.method2057("huffman");

	@OriginalMember(owner = "client!va", name = "e", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1397 = Static120.method2057("<col=00ffff>");

	@OriginalMember(owner = "client!va", name = "g", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1398 = aClass81_1395;

	@OriginalMember(owner = "client!va", name = "i", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1399 = Static120.method2057(":trade:");

	@OriginalMember(owner = "client!va", name = "l", descriptor = "I")
	public static int anInt4002 = 0;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II)Z")
	public static boolean method3039(@OriginalArg(0) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(II)Z")
	public static boolean method3040(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)V")
	public static void method3041(@OriginalArg(0) boolean arg0) {
		Static81.method1360();
		Static52.anInt1279++;
		if (Static52.anInt1279 < 50 && !arg0) {
			return;
		}
		Static52.anInt1279 = 0;
		if (Static94.aBoolean89 || Static158.aClass41_3 == null) {
			return;
		}
		Static104.aClass1_Sub8_Sub1_2.method366(33);
		try {
			Static158.aClass41_3.method1339(Static104.aClass1_Sub8_Sub1_2.anInt446, Static104.aClass1_Sub8_Sub1_2.aByteArray3);
			Static104.aClass1_Sub8_Sub1_2.anInt446 = 0;
		} catch (@Pc(54) IOException local54) {
			Static94.aBoolean89 = true;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIZILclient!vb;I)V")
	public static void method3042(@OriginalArg(3) int arg0, @OriginalArg(4) Class82 arg1, @OriginalArg(5) int arg2) {
		Static100.anInt2177 = 10000;
		Static153.anInt3499 = arg2;
		Static98.anInt2160 = arg0;
		Static108.aClass82_40 = arg1;
		Static131.aBoolean115 = false;
		Static89.anInt4032 = 1;
		Static184.anInt4115 = 0;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIII)V")
	public static void method3043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class1_Sub17 local7 = Static167.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class62 local13 = local7.aClass62_1;
		if (local13 != null) {
			local13.anInt2637 = local13.anInt2637 * arg3 / 16;
			local13.anInt2636 = local13.anInt2636 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "([IIIIIII)V")
	public static void method3044(@OriginalArg(0) int[] arg0) {
		Static63.anInt1552 = 25;
		Static156.aBooleanArrayArrayArrayArray1 = new boolean[8][32][Static63.anInt1552 + Static63.anInt1552 + 1][Static63.anInt1552 + Static63.anInt1552 + 1];
		Static77.anInt1823 = 0;
		Static149.anInt3337 = 0;
		Static179.anInt4046 = 512;
		Static52.anInt1280 = 334;
		Static163.anInt3736 = 256;
		Static12.anInt4139 = 167;
		@Pc(45) boolean[][][][] local45 = new boolean[9][32][Static63.anInt1552 + Static63.anInt1552 + 3][Static63.anInt1552 + Static63.anInt1552 + 3];
		@Pc(50) int local50;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(93) int local93;
		@Pc(97) int local97;
		for (@Pc(47) int local47 = 128; local47 <= 384; local47 += 32) {
			for (local50 = 0; local50 < 2048; local50 += 64) {
				Static119.anInt2638 = Class1_Sub2_Sub2_Sub1.anIntArray30[local47];
				Static120.anInt2663 = Class1_Sub2_Sub2_Sub1.anIntArray33[local47];
				Static56.anInt1357 = Class1_Sub2_Sub2_Sub1.anIntArray30[local50];
				Static33.anInt927 = Class1_Sub2_Sub2_Sub1.anIntArray33[local50];
				local73 = (local47 - 128) / 32;
				local77 = local50 / 64;
				for (local82 = -(Static63.anInt1552 + 1); local82 <= Static63.anInt1552 + 1; local82++) {
					for (@Pc(88) int local88 = -(Static63.anInt1552 + 1); local88 <= Static63.anInt1552 + 1; local88++) {
						local93 = local82 * 128;
						local97 = local88 * 128;
						@Pc(99) boolean local99 = false;
						for (@Pc(102) int local102 = -500; local102 <= 800; local102 += 128) {
							if (Static180.method3084(local93, arg0[local73] + local102, local97)) {
								local99 = true;
								break;
							}
						}
						local45[local73][local77][local82 + Static63.anInt1552 + 1][local88 + Static63.anInt1552 + 1] = local99;
					}
				}
			}
		}
		for (local50 = 0; local50 < 8; local50++) {
			for (local73 = 0; local73 < 32; local73++) {
				for (local77 = -Static63.anInt1552; local77 < Static63.anInt1552; local77++) {
					for (local82 = -Static63.anInt1552; local82 < Static63.anInt1552; local82++) {
						@Pc(174) boolean local174 = false;
						label76: for (local93 = -1; local93 <= 1; local93++) {
							for (local97 = -1; local97 <= 1; local97++) {
								if (local45[local50][local73][local77 + local93 + Static63.anInt1552 + 1][local82 + local97 + Static63.anInt1552 + 1]) {
									local174 = true;
									break label76;
								}
								if (local45[local50][(local73 + 1) % 31][local77 + local93 + Static63.anInt1552 + 1][local82 + local97 + Static63.anInt1552 + 1]) {
									local174 = true;
									break label76;
								}
								if (local45[local50 + 1][local73][local77 + local93 + Static63.anInt1552 + 1][local82 + local97 + Static63.anInt1552 + 1]) {
									local174 = true;
									break label76;
								}
								if (local45[local50 + 1][(local73 + 1) % 31][local77 + local93 + Static63.anInt1552 + 1][local82 + local97 + Static63.anInt1552 + 1]) {
									local174 = true;
									break label76;
								}
							}
						}
						Static156.aBooleanArrayArrayArrayArray1[local50][local73][local77 + Static63.anInt1552][local82 + Static63.anInt1552] = local174;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
	public static void method3045() {
		aClass1_Sub2_Sub2_Sub3Array11 = null;
		aClass81_1396 = null;
		aClass81_1395 = null;
		aClass81_1398 = null;
		aClass81_1397 = null;
		aClass81_1399 = null;
	}
}
