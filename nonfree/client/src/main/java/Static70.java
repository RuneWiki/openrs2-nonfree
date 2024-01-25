import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!co", name = "B", descriptor = "F")
	public static float aFloat78;

	@OriginalMember(owner = "client!co", name = "G", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_58;

	@OriginalMember(owner = "client!co", name = "H", descriptor = "[J")
	public static long[] aLongArray10;

	@OriginalMember(owner = "client!co", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString27 = null;

	@OriginalMember(owner = "client!co", name = "J", descriptor = "I")
	public static int anInt4047 = 0;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "([[[Lclient!qs;ZIIII)Z")
	public static boolean method3540(@OriginalArg(0) Class276[][][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(14) byte local14 = arg1 ? 1 : (byte) (Static534.anInt8855 & 0xFF);
		if (Static273.aByteArrayArrayArray19[Static97.anInt1863][arg3][arg4] == local14) {
			return false;
		} else if ((Static154.aByteArrayArrayArray4[Static97.anInt1863][arg3][arg4] & 0x4) == 0) {
			return false;
		} else {
			@Pc(42) byte local42 = 0;
			@Pc(44) int local44 = 0;
			Static29.anIntArray42[0] = arg3;
			@Pc(51) int local51 = local42 + 1;
			Static422.anIntArray532[0] = arg4;
			Static273.aByteArrayArrayArray19[Static97.anInt1863][arg3][arg4] = local14;
			while (local51 != local44) {
				@Pc(69) int local69 = Static29.anIntArray42[local44] & 0xFFFF;
				@Pc(77) int local77 = Static29.anIntArray42[local44] >> 16 & 0xFF;
				@Pc(85) int local85 = Static29.anIntArray42[local44] >> 24 & 0xFF;
				@Pc(91) int local91 = Static422.anIntArray532[local44] & 0xFFFF;
				@Pc(99) int local99 = Static422.anIntArray532[local44] >> 16 & 0xFF;
				local44 = local44 + 1 & 0xFFF;
				@Pc(107) boolean local107 = false;
				if ((Static154.aByteArrayArrayArray4[Static97.anInt1863][local69][local91] & 0x4) == 0) {
					local107 = true;
				}
				@Pc(121) boolean local121 = false;
				@Pc(162) int local162;
				@Pc(201) int local201;
				label231: for (@Pc(125) int local125 = Static97.anInt1863 + 1; local125 <= 3; local125++) {
					if ((Static154.aByteArrayArrayArray4[local125][local69][local91] & 0x8) == 0) {
						@Pc(299) Class4_Sub1 local299;
						@Pc(309) int local309;
						@Pc(288) Class276 local288;
						@Pc(294) Class267 local294;
						if (local107 && arg0[local125][local69][local91] != null) {
							if (arg0[local125][local69][local91].aClass4_Sub5_2 != null) {
								local162 = Static15.method327(local77);
								if (local162 == arg0[local125][local69][local91].aClass4_Sub5_2.anInt7598 || arg0[local125][local69][local91].aClass4_Sub5_3 != null && arg0[local125][local69][local91].aClass4_Sub5_3.anInt7598 == local162) {
									continue;
								}
								if (local85 != 0) {
									local201 = Static15.method327(local85);
									if (arg0[local125][local69][local91].aClass4_Sub5_2.anInt7598 == local201 || arg0[local125][local69][local91].aClass4_Sub5_3 != null && local201 == arg0[local125][local69][local91].aClass4_Sub5_3.anInt7598) {
										continue;
									}
								}
								if (local99 != 0) {
									local201 = Static15.method327(local99);
									if (arg0[local125][local69][local91].aClass4_Sub5_2.anInt7598 == local201 || arg0[local125][local69][local91].aClass4_Sub5_3 != null && arg0[local125][local69][local91].aClass4_Sub5_3.anInt7598 == local201) {
										continue;
									}
								}
							}
							local288 = arg0[local125][local69][local91];
							if (local288.aClass267_3 != null) {
								for (local294 = local288.aClass267_3; local294 != null; local294 = local294.aClass267_2) {
									local299 = local294.aClass4_Sub1_2;
									if (local299 instanceof Interface18) {
										@Pc(305) Interface18 local305 = (Interface18) local299;
										local309 = local305.method6268();
										if (local309 == 21) {
											local309 = 19;
										}
										@Pc(318) int local318 = local305.method6272();
										@Pc(324) int local324 = local309 | local318 << 6;
										if (local324 == local77 || local85 != 0 && local85 == local324 || local99 != 0 && local99 == local324) {
											continue label231;
										}
									}
								}
							}
						}
						local288 = arg0[local125][local69][local91];
						if (local288 != null && local288.aClass267_3 != null) {
							for (local294 = local288.aClass267_3; local294 != null; local294 = local294.aClass267_2) {
								local299 = local294.aClass4_Sub1_2;
								if (local299.aShort123 != local299.aShort126 || local299.aShort125 != local299.aShort124) {
									for (@Pc(389) int local389 = local299.aShort126; local389 <= local299.aShort123; local389++) {
										for (local309 = local299.aShort125; local309 <= local299.aShort124; local309++) {
											Static273.aByteArrayArrayArray19[local125][local389][local309] = local14;
										}
									}
								}
							}
						}
						local121 = true;
						Static273.aByteArrayArrayArray19[local125][local69][local91] = local14;
					}
				}
				if (local121) {
					local162 = Static133.aClass59Array3[Static97.anInt1863 + 1].JA(local69, local91);
					if (local162 > Static238.anIntArray561[arg2]) {
						Static238.anIntArray561[arg2] = local162;
					}
					local201 = local69 << 9;
					if (local201 < Static319.anIntArray434[arg2]) {
						Static319.anIntArray434[arg2] = local201;
					} else if (Static42.anIntArray47[arg2] < local201) {
						Static42.anIntArray47[arg2] = local201;
					}
					@Pc(489) int local489 = local91 << 9;
					if (Static357.anIntArray471[arg2] > local489) {
						Static357.anIntArray471[arg2] = local489;
					} else if (local489 > Static206.anIntArray263[arg2]) {
						Static206.anIntArray263[arg2] = local489;
					}
				}
				if (!local107) {
					if (local69 >= 1 && local14 != Static273.aByteArrayArrayArray19[Static97.anInt1863][local69 - 1][local91]) {
						Static29.anIntArray42[local51] = local69 - 1 | 0xD3000000 | 0x120000;
						Static422.anIntArray532[local51] = local91 | 0x130000;
						Static273.aByteArrayArrayArray19[Static97.anInt1863][local69 - 1][local91] = local14;
						local51 = local51 + 1 & 0xFFF;
					}
					local91++;
					if (local91 < Static165.anInt6749) {
						if (local69 - 1 >= 0 && local14 != Static273.aByteArrayArrayArray19[Static97.anInt1863][local69 - 1][local91] && (Static154.aByteArrayArrayArray4[Static97.anInt1863][local69][local91] & 0x4) == 0 && (Static154.aByteArrayArrayArray4[Static97.anInt1863][local69 - 1][local91 - 1] & 0x4) == 0) {
							Static29.anIntArray42[local51] = local69 - 1 | 0x52000000 | 0x120000;
							Static422.anIntArray532[local51] = local91 | 0x130000;
							Static273.aByteArrayArrayArray19[Static97.anInt1863][local69 - 1][local91] = local14;
							local51 = local51 + 1 & 0xFFF;
						}
						if (local14 != Static273.aByteArrayArrayArray19[Static97.anInt1863][local69][local91]) {
							Static29.anIntArray42[local51] = local69 | 0x520000 | 0x13000000;
							Static422.anIntArray532[local51] = local91 | 0x530000;
							Static273.aByteArrayArrayArray19[Static97.anInt1863][local69][local91] = local14;
							local51 = local51 + 1 & 0xFFF;
						}
						if (Static473.anInt8075 > local69 + 1 && Static273.aByteArrayArrayArray19[Static97.anInt1863][local69 + 1][local91] != local14 && (Static154.aByteArrayArrayArray4[Static97.anInt1863][local69][local91] & 0x4) == 0 && (Static154.aByteArrayArrayArray4[Static97.anInt1863][local69 + 1][local91 - 1] & 0x4) == 0) {
							Static29.anIntArray42[local51] = local69 + 1 | 0x92000000 | 0x520000;
							Static422.anIntArray532[local51] = local91 | 0x530000;
							local51 = local51 + 1 & 0xFFF;
							Static273.aByteArrayArrayArray19[Static97.anInt1863][local69 + 1][local91] = local14;
						}
					}
					local91--;
					if (local69 + 1 < Static473.anInt8075 && Static273.aByteArrayArrayArray19[Static97.anInt1863][local69 + 1][local91] != local14) {
						Static29.anIntArray42[local51] = local69 + 1 | 0x920000 | 0x53000000;
						Static422.anIntArray532[local51] = local91 | 0x930000;
						Static273.aByteArrayArrayArray19[Static97.anInt1863][local69 + 1][local91] = local14;
						local51 = local51 + 1 & 0xFFF;
					}
					local91--;
					if (local91 >= 0) {
						if (local69 - 1 >= 0 && Static273.aByteArrayArrayArray19[Static97.anInt1863][local69 - 1][local91] != local14 && (Static154.aByteArrayArrayArray4[Static97.anInt1863][local69][local91] & 0x4) == 0 && (Static154.aByteArrayArrayArray4[Static97.anInt1863][local69 - 1][local91 + 1] & 0x4) == 0) {
							Static29.anIntArray42[local51] = local69 - 1 | 0xD20000 | 0x12000000;
							Static422.anIntArray532[local51] = local91 | 0xD30000;
							Static273.aByteArrayArrayArray19[Static97.anInt1863][local69 - 1][local91] = local14;
							local51 = local51 + 1 & 0xFFF;
						}
						if (local14 != Static273.aByteArrayArrayArray19[Static97.anInt1863][local69][local91]) {
							Static29.anIntArray42[local51] = local69 | 0xD20000 | 0x93000000;
							Static422.anIntArray532[local51] = local91 | 0xD30000;
							Static273.aByteArrayArrayArray19[Static97.anInt1863][local69][local91] = local14;
							local51 = local51 + 1 & 0xFFF;
						}
						if (local69 + 1 < Static473.anInt8075 && local14 != Static273.aByteArrayArrayArray19[Static97.anInt1863][local69 + 1][local91] && (Static154.aByteArrayArrayArray4[Static97.anInt1863][local69][local91] & 0x4) == 0 && (Static154.aByteArrayArrayArray4[Static97.anInt1863][local69 + 1][local91 + 1] & 0x4) == 0) {
							Static29.anIntArray42[local51] = local69 + 1 | 0x920000 | 0xD2000000;
							Static422.anIntArray532[local51] = local91 | 0x930000;
							Static273.aByteArrayArrayArray19[Static97.anInt1863][local69 + 1][local91] = local14;
							local51 = local51 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static238.anIntArray561[arg2] != -1000000) {
				Static238.anIntArray561[arg2] += 10;
				Static319.anIntArray434[arg2] -= 50;
				Static42.anIntArray47[arg2] += 50;
				Static206.anIntArray263[arg2] += 50;
				Static357.anIntArray471[arg2] -= 50;
			}
			return true;
		}
	}
}
