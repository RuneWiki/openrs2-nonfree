import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray11 = new String[100];

	@OriginalMember(owner = "client!hga", name = "f", descriptor = "[I")
	public static int[] anIntArray195 = null;

	@OriginalMember(owner = "client!hga", name = "h", descriptor = "[I")
	public static int[] anIntArray196 = new int[1];

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(II[ILclient!hm;)Lclient!rj;")
	public static Class308 method3127(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class156 arg2) {
		@Pc(7) int[] local7 = null;
		@Pc(9) int[] local9 = null;
		@Pc(16) int[] local16 = null;
		@Pc(18) float[][] local18 = null;
		if (arg2.aByteArray36 != null) {
			@Pc(24) int local24 = arg2.anInt3700;
			@Pc(27) int[] local27 = new int[local24];
			@Pc(30) int[] local30 = new int[local24];
			@Pc(33) int[] local33 = new int[local24];
			@Pc(36) int[] local36 = new int[local24];
			@Pc(39) int[] local39 = new int[local24];
			@Pc(42) int[] local42 = new int[local24];
			for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
				local27[local44] = Integer.MAX_VALUE;
				local30[local44] = -2147483647;
				local33[local44] = Integer.MAX_VALUE;
				local36[local44] = -2147483647;
				local39[local44] = Integer.MAX_VALUE;
				local42[local44] = -2147483647;
			}
			local9 = new int[local24];
			local16 = new int[local24];
			local7 = new int[local24];
			local18 = new float[local24][];
			@Pc(94) int local94;
			@Pc(149) int local149;
			for (@Pc(88) int local88 = 0; local88 < arg0; local88++) {
				local94 = arg1[local88];
				if (arg2.aByteArray36[local94] != -1) {
					@Pc(108) int local108 = arg2.aByteArray36[local94] & 0xFF;
					for (@Pc(110) int local110 = 0; local110 < 3; local110++) {
						@Pc(125) short local125;
						if (local110 == 0) {
							local125 = arg2.aShortArray56[local94];
						} else if (local110 == 1) {
							local125 = arg2.aShortArray57[local94];
						} else {
							local125 = arg2.aShortArray51[local94];
						}
						@Pc(144) int local144 = arg2.anIntArray227[local125];
						local149 = arg2.anIntArray231[local125];
						@Pc(154) int local154 = arg2.anIntArray223[local125];
						if (local144 < local27[local108]) {
							local27[local108] = local144;
						}
						if (local144 > local30[local108]) {
							local30[local108] = local144;
						}
						if (local33[local108] > local149) {
							local33[local108] = local149;
						}
						if (local149 > local36[local108]) {
							local36[local108] = local149;
						}
						if (local154 < local39[local108]) {
							local39[local108] = local154;
						}
						if (local42[local108] < local154) {
							local42[local108] = local154;
						}
					}
				}
			}
			for (local94 = 0; local94 < local24; local94++) {
				@Pc(241) byte local241 = arg2.aByteArray33[local94];
				if (local241 > 0) {
					local7[local94] = (local27[local94] + local30[local94]) / 2;
					local9[local94] = (local33[local94] + local36[local94]) / 2;
					local16[local94] = (local39[local94] + local42[local94]) / 2;
					@Pc(297) float local297;
					@Pc(299) float local299;
					@Pc(328) float local328;
					if (local241 == 1) {
						local149 = arg2.anIntArray229[local94];
						if (local149 == 0) {
							local297 = 1.0F;
							local299 = 1.0F;
						} else if (local149 <= 0) {
							local299 = 1.0F;
							local297 = (float) -local149 / 1024.0F;
						} else {
							local299 = (float) local149 / 1024.0F;
							local297 = 1.0F;
						}
						local328 = 64.0F / (float) arg2.anIntArray230[local94];
					} else if (local241 == 2) {
						local297 = 64.0F / (float) arg2.anIntArray229[local94];
						local299 = 64.0F / (float) arg2.anIntArray224[local94];
						local328 = 64.0F / (float) arg2.anIntArray230[local94];
					} else {
						local299 = (float) arg2.anIntArray224[local94] / 1024.0F;
						local328 = (float) arg2.anIntArray230[local94] / 1024.0F;
						local297 = (float) arg2.anIntArray229[local94] / 1024.0F;
					}
					local18[local94] = Static314.method4801(local299, local297, arg2.aShortArray54[local94], arg2.aShortArray53[local94], arg2.aShortArray50[local94], local328, arg2.aByteArray38[local94] & 0xFF);
				}
			}
		}
		return new Class308(local7, local9, local16, local18);
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(I)V")
	public static void method3128() {
		Static287.method3971();
		Static338.method7924(Static655.aClass5_Sub36_29.aClass2_Sub2_1.method969() == 1);
		Static549.aClass107_3 = Static80.method1216(0, Static105.aCanvas2, 22050, Static150.aClass202_2);
		Static192.method2759(Static373.method5519((Class5_Sub14_Sub4) null));
		Static373.aClass107_1 = Static80.method1216(1, Static105.aCanvas2, 2048, Static150.aClass202_2);
		Static373.aClass107_1.method8604(Static229.aClass5_Sub14_Sub3_1);
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(Z)V")
	public static void method3130() {
		@Pc(5) short local5 = 1024;
		@Pc(7) short local7 = 3072;
		if (Static426.aBoolean555) {
			local7 = 4096;
			if (Static656.aBoolean750) {
				local5 = 2048;
			}
		}
		if ((float) local5 > Static329.aFloat117) {
			Static329.aFloat117 = (float) local5;
		}
		if ((float) local7 < Static329.aFloat117) {
			Static329.aFloat117 = (float) local7;
		}
		while (Static495.aFloat161 >= 16384.0F) {
			Static495.aFloat161 -= 16384.0F;
		}
		while (Static495.aFloat161 < 0.0F) {
			Static495.aFloat161 += 16384.0F;
		}
		@Pc(58) int local58 = Static171.anInt2825 >> 9;
		@Pc(62) int local62 = Static602.anInt9872 >> 9;
		@Pc(68) int local68 = Static161.method1246(Static458.anInt7955, Static602.anInt9872, Static171.anInt2825);
		@Pc(70) int local70 = 0;
		@Pc(92) int local92;
		if (local58 > 3 && local62 > 3 && local58 < Static124.anInt2150 - 4 && local62 < Static64.anInt1015 - 4) {
			for (local92 = local58 - 4; local92 <= local58 + 4; local92++) {
				for (@Pc(97) int local97 = local62 - 4; local97 <= local62 + 4; local97++) {
					@Pc(100) int local100 = Static458.anInt7955;
					if (local100 < 3 && Static488.method7149(local92, local97)) {
						local100++;
					}
					@Pc(111) int local111 = 0;
					if (Static652.aClass34_Sub1_2.aByteArrayArrayArray11 != null && Static652.aClass34_Sub1_2.aByteArrayArrayArray11[local100] != null) {
						local111 = (Static652.aClass34_Sub1_2.aByteArrayArrayArray11[local100][local92][local97] & 0xFF) * 8 << 2;
					}
					if (Static298.aClass88Array3 != null && Static298.aClass88Array3[local100] != null) {
						@Pc(154) int local154 = local68 + local111 - Static298.aClass88Array3[local100].method8749(local92, local97);
						if (local154 > local70) {
							local70 = local154;
						}
					}
				}
			}
		}
		local92 = (local70 >> 2) * 1536;
		if (local92 > 786432) {
			local92 = 786432;
		}
		if (local92 < 262144) {
			local92 = 262144;
		}
		if (local92 > Static609.anInt9838) {
			Static609.anInt9838 += (local92 - Static609.anInt9838) / 24;
		} else if (Static609.anInt9838 > local92) {
			Static609.anInt9838 += (local92 - Static609.anInt9838) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(III)Z")
	public static boolean method3131(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
