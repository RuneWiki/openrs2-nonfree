import java.awt.Component;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "Ljava/awt/Image;")
	public static Image anImage1;

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
	public static int anInt1920 = 0;

	@OriginalMember(owner = "client!gl", name = "e", descriptor = "J")
	public static long aLong66 = 0L;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
	public static void method2109() {
		if (Static44.method763() != 2) {
			return;
		}
		@Pc(19) byte local19 = (byte) (Static138.anInt4577 - 4 & 0xFF);
		@Pc(23) int local23 = Static138.anInt4577 % Static153.anInt2883;
		@Pc(29) int local29;
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			for (local29 = 0; local29 < Static246.anInt4606; local29++) {
				Static37.aByteArrayArrayArray2[local25][local23][local29] = local19;
			}
		}
		if (Static343.anInt6225 == 3) {
			return;
		}
		for (local29 = 0; local29 < 2; local29++) {
			Static326.anIntArray687[local29] = -1000000;
			Static102.anIntArray566[local29] = 1000000;
			Static22.anIntArray36[local29] = 0;
			Static247.anIntArray485[local29] = 1000000;
			Static36.anIntArray86[local29] = 0;
		}
		@Pc(135) int local135;
		if (Static334.anInt6112 != 1) {
			local135 = Static306.method5249(Static11.anInt197, Static287.anInt5405, Static343.anInt6225);
			if (local135 - Static217.anInt4016 >= 800 || (Static265.aByteArrayArrayArray11[Static343.anInt6225][Static287.anInt5405 >> 7][Static11.anInt197 >> 7] & 0x4) == 0) {
				return;
			}
			Static329.method5490(Static287.anInt5405 >> 7, Static11.anInt197 >> 7, Static39.aClass187ArrayArrayArray1, false, 1);
			return;
		}
		if ((Static265.aByteArrayArrayArray11[Static343.anInt6225][Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6340 >> 7][Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6339 >> 7] & 0x4) != 0) {
			Static329.method5490(Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6340 >> 7, Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6339 >> 7, Static39.aClass187ArrayArrayArray1, false, 0);
		}
		if (Static110.anInt2047 >= 2560) {
			return;
		}
		local135 = Static287.anInt5405 >> 7;
		@Pc(139) int local139 = Static11.anInt197 >> 7;
		@Pc(144) int local144 = Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6340 >> 7;
		@Pc(149) int local149 = Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6339 >> 7;
		@Pc(157) int local157;
		if (local135 < local144) {
			local157 = local144 - local135;
		} else {
			local157 = local135 - local144;
		}
		@Pc(175) int local175;
		if (local139 < local149) {
			local175 = local149 - local139;
		} else {
			local175 = local139 - local149;
		}
		if ((local157 != 0 || local175 != 0) && (-Static153.anInt2883) < local157 && local157 < Static153.anInt2883 && local175 > -Static246.anInt4606 && Static246.anInt4606 > local175) {
			@Pc(248) int local248;
			@Pc(250) int local250;
			if (local157 > local175) {
				local248 = local175 * 65536 / local157;
				local250 = 32768;
				while (local135 != local144) {
					if (local135 < local144) {
						local135++;
					} else if (local135 > local144) {
						local135--;
					}
					if ((Static265.aByteArrayArrayArray11[Static343.anInt6225][local135][local139] & 0x4) != 0) {
						Static329.method5490(local135, local139, Static39.aClass187ArrayArrayArray1, false, 1);
						return;
					}
					local250 += local248;
					if (local250 >= 65536) {
						if (local139 < local149) {
							local139++;
						} else if (local149 < local139) {
							local139--;
						}
						local250 -= 65536;
						if ((Static265.aByteArrayArrayArray11[Static343.anInt6225][local135][local139] & 0x4) != 0) {
							Static329.method5490(local135, local139, Static39.aClass187ArrayArrayArray1, false, 1);
							return;
						}
					}
				}
				return;
			}
			local248 = local157 * 65536 / local175;
			local250 = 32768;
			while (local139 != local149) {
				if (local139 < local149) {
					local139++;
				} else if (local149 < local139) {
					local139--;
				}
				if ((Static265.aByteArrayArrayArray11[Static343.anInt6225][local135][local139] & 0x4) != 0) {
					Static329.method5490(local135, local139, Static39.aClass187ArrayArrayArray1, false, 1);
					return;
				}
				local250 += local248;
				if (local250 >= 65536) {
					local250 -= 65536;
					if (local144 > local135) {
						local135++;
					} else if (local135 > local144) {
						local135--;
					}
					if ((Static265.aByteArrayArrayArray11[Static343.anInt6225][local135][local139] & 0x4) != 0) {
						Static329.method5490(local135, local139, Static39.aClass187ArrayArrayArray1, false, 1);
						return;
					}
				}
			}
			return;
		}
		Static346.method5707("RC: " + local135 + "," + local139 + " " + local144 + "," + local149 + " " + Static44.anInt881 + "," + Static300.anInt5672, null);
		return;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lclient!br;IIIII)V")
	public static void method2110(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt4728 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass6_Sub17_Sub1Array5[local4] != null) {
				arg0.anInt4728++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt4728; local22++) {
			@Pc(31) int local31 = Static174.anIntArrayArrayArray4[arg1][arg2][arg3];
			@Pc(40) Class6_Sub17_Sub1 local40;
			while (local31 != 0) {
				local40 = Static240.aClass6_Sub17_Sub1Array4[(local31 & 0xFF) - 1];
				local31 >>>= 0x8;
				if (local40 == arg0.aClass6_Sub17_Sub1Array5[local22]) {
					continue label51;
				}
			}
			local31 = Static174.anIntArrayArrayArray4[arg1][arg4][arg5];
			while (local31 != 0) {
				local40 = Static240.aClass6_Sub17_Sub1Array4[(local31 & 0xFF) - 1];
				local31 >>>= 0x8;
				if (local40 == arg0.aClass6_Sub17_Sub1Array5[local22]) {
					continue label51;
				}
			}
			for (@Pc(85) int local85 = local22; local85 < arg0.anInt4728 - 1; local85++) {
				arg0.aClass6_Sub17_Sub1Array5[local85] = arg0.aClass6_Sub17_Sub1Array5[local85 + 1];
			}
			arg0.anInt4728--;
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method2112(@OriginalArg(0) Component arg0) {
		arg0.removeMouseListener(Static88.aClass48_1);
		arg0.removeMouseMotionListener(Static88.aClass48_1);
		arg0.removeFocusListener(Static88.aClass48_1);
		Static319.anInt5900 = 0;
	}
}
