import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!jca", name = "f", descriptor = "Lclient!ae;")
	public static Class5 aClass5_7;

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_66 = new Class349(68, 12);

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(III)Z")
	public static boolean method3480(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IBLclient!rg;)V")
	public static void method3481(@OriginalArg(0) int arg0, @OriginalArg(2) Class12_Sub2_Sub1_Sub4 arg1) {
		if (arg1.anIntArray558 == null) {
			return;
		}
		@Pc(13) int local13 = arg1.anIntArray558[arg0 + 1];
		if (arg1.anInt8394 == local13) {
			return;
		}
		arg1.anInt8420 = 0;
		arg1.anInt8394 = local13;
		arg1.anInt8379 = 1;
		arg1.anInt8430 = arg1.anInt8431;
		arg1.anInt8357 = 0;
		arg1.anInt8396 = 0;
		if (arg1.anInt8394 != -1) {
			Static543.method7102(arg1, arg1.anInt8420, Static117.aClass18_1.method296(arg1.anInt8394));
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(FFFIIIIIBII[FI)V")
	public static void method3483(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float[] arg10, @OriginalArg(12) int arg11) {
		@Pc(5) int local5 = arg11 - arg7;
		@Pc(13) int local13 = arg9 - arg5;
		@Pc(17) int local17 = arg8 - arg6;
		@Pc(38) float local38 = arg10[2] * (float) local5 + arg10[0] * (float) local17 + (float) local13 * arg10[1];
		@Pc(59) float local59 = (float) local5 * arg10[5] + (float) local13 * arg10[4] + arg10[3] * (float) local17;
		@Pc(80) float local80 = arg10[8] * (float) local5 + arg10[7] * (float) local13 + (float) local17 * arg10[6];
		@Pc(100) float local100;
		@Pc(94) float local94;
		if (arg3 == 0) {
			local100 = local38 + arg2 + 0.5F;
			local94 = arg0 + 0.5F - local80;
		} else if (arg3 == 1) {
			local94 = arg0 + local80 + 0.5F;
			local100 = local38 + arg2 + 0.5F;
		} else if (arg3 == 2) {
			local94 = arg1 + 0.5F - local59;
			local100 = arg2 + 0.5F - local38;
		} else if (arg3 == 3) {
			local100 = arg2 + local38 + 0.5F;
			local94 = arg1 + 0.5F - local59;
		} else if (arg3 == 4) {
			local100 = local80 + arg0 + 0.5F;
			local94 = arg1 + 0.5F - local59;
		} else {
			local100 = arg0 + 0.5F - local80;
			local94 = arg1 + 0.5F - local59;
		}
		@Pc(195) float local195;
		if (arg4 == 1) {
			local195 = local100;
			local100 = -local94;
			local94 = local195;
		} else if (arg4 == 2) {
			local94 = -local94;
			local100 = -local100;
		} else if (arg4 == 3) {
			local195 = local100;
			local100 = local94;
			local94 = -local195;
		}
		Static511.aFloat237 = local94;
		Static488.aFloat203 = local100;
	}

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(B)V")
	public static void method3484() {
		@Pc(9) int local9 = Static361.aClass2_Sub7_Sub2_1.method4518();
		@Pc(13) int local13 = Static361.aClass2_Sub7_Sub2_1.method4517();
		Static386.anInt6384 = Static361.aClass2_Sub7_Sub2_1.method4488();
		@Pc(21) int local21 = Static361.aClass2_Sub7_Sub2_1.method4515();
		@Pc(32) boolean local32 = Static361.aClass2_Sub7_Sub2_1.method4515() == 1;
		Static489.method6264();
		Static589.method7515(local21);
		Static361.aClass2_Sub7_Sub2_1.method4530();
		@Pc(46) int local46;
		@Pc(50) int local50;
		@Pc(57) int local57;
		for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
			for (local46 = 0; local46 < Static281.anInt4822 >> 3; local46++) {
				for (local50 = 0; local50 < Static29.anInt491 >> 3; local50++) {
					local57 = Static361.aClass2_Sub7_Sub2_1.method4535(1);
					if (local57 == 1) {
						Static55.anIntArrayArrayArray1[local42][local46][local50] = Static361.aClass2_Sub7_Sub2_1.method4535(26);
					} else {
						Static55.anIntArrayArrayArray1[local42][local46][local50] = -1;
					}
				}
			}
		}
		Static361.aClass2_Sub7_Sub2_1.method4524();
		local46 = (Static528.anInt8479 - Static361.aClass2_Sub7_Sub2_1.anInt5186) / 16;
		Static378.anIntArrayArray44 = new int[local46][4];
		for (local50 = 0; local50 < local46; local50++) {
			for (local57 = 0; local57 < 4; local57++) {
				Static378.anIntArrayArray44[local50][local57] = Static361.aClass2_Sub7_Sub2_1.method4509();
			}
		}
		Static210.aByteArrayArray9 = new byte[local46][];
		Static336.anIntArray377 = null;
		Static571.aByteArrayArray23 = new byte[local46][];
		Static301.anIntArray349 = new int[local46];
		Static491.anIntArray519 = new int[local46];
		Static327.anIntArray374 = new int[local46];
		Static26.aByteArrayArray1 = null;
		Static396.aByteArrayArray15 = new byte[local46][];
		Static420.anIntArray479 = new int[local46];
		Static196.anIntArray240 = new int[local46];
		Static418.aByteArrayArray17 = new byte[local46][];
		local46 = 0;
		for (local57 = 0; local57 < 4; local57++) {
			for (@Pc(195) int local195 = 0; local195 < Static281.anInt4822 >> 3; local195++) {
				for (@Pc(199) int local199 = 0; local199 < Static29.anInt491 >> 3; local199++) {
					@Pc(209) int local209 = Static55.anIntArrayArrayArray1[local57][local195][local199];
					if (local209 != -1) {
						@Pc(219) int local219 = local209 >> 14 & 0x3FF;
						@Pc(225) int local225 = local209 >> 3 & 0x7FF;
						@Pc(235) int local235 = local225 / 8 + (local219 / 8 << 8);
						for (@Pc(237) int local237 = 0; local237 < local46; local237++) {
							if (Static301.anIntArray349[local237] == local235) {
								local235 = -1;
								break;
							}
						}
						if (local235 != -1) {
							Static301.anIntArray349[local46] = local235;
							@Pc(269) int local269 = local235 >> 8 & 0xFF;
							@Pc(273) int local273 = local235 & 0xFF;
							Static327.anIntArray374[local46] = Static372.aClass229_89.method4955("m" + local269 + "_" + local273);
							Static196.anIntArray240[local46] = Static372.aClass229_89.method4955("l" + local269 + "_" + local273);
							Static420.anIntArray479[local46] = Static372.aClass229_89.method4955("um" + local269 + "_" + local273);
							Static491.anIntArray519[local46] = Static372.aClass229_89.method4955("ul" + local269 + "_" + local273);
							local46++;
						}
					}
				}
			}
		}
		Static412.method5556(local13, 11, local9, local32);
	}
}
