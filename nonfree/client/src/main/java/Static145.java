import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!jj", name = "w", descriptor = "Lclient!um;")
	public static final Class204 aClass204_7 = new Class204();

	@OriginalMember(owner = "client!jj", name = "E", descriptor = "I")
	public static int anInt3255 = 0;

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V")
	public static void method2844() {
		if (Static154.method2989() != 2) {
			return;
		}
		@Pc(19) byte local19 = (byte) (Static230.anInt4802 - 4 & 0xFF);
		@Pc(23) int local23 = Static230.anInt4802 % Static92.anInt2048;
		@Pc(29) int local29;
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			for (local29 = 0; local29 < Static290.anInt5893; local29++) {
				Static173.aByteArrayArrayArray6[local25][local23][local29] = local19;
			}
		}
		if (Static279.anInt5645 == 3) {
			return;
		}
		for (local29 = 0; local29 < 2; local29++) {
			Static238.anIntArray408[local29] = -1000000;
			Static8.anIntArray41[local29] = 1000000;
			Static44.anIntArray119[local29] = 0;
			Static211.anIntArray367[local29] = 1000000;
			Static200.anIntArray364[local29] = 0;
		}
		@Pc(128) int local128;
		if (Static303.anInt3065 != 1) {
			local128 = Static119.method2125(Static230.anInt4796, Static133.anInt3056, Static279.anInt5645);
			if (local128 - Static105.anInt6098 >= 800 || (Static348.aByteArrayArrayArray11[Static279.anInt5645][Static230.anInt4796 >> 7][Static133.anInt3056 >> 7] & 0x4) == 0) {
				return;
			}
			Static284.method4847(false, Static133.anInt3056 >> 7, 1, Static18.aClass57ArrayArrayArray1, Static230.anInt4796 >> 7);
			return;
		}
		if ((Static348.aByteArrayArrayArray11[Static279.anInt5645][Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6465 >> 7][Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6466 >> 7] & 0x4) != 0) {
			Static284.method4847(false, Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6466 >> 7, 0, Static18.aClass57ArrayArrayArray1, Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6465 >> 7);
		}
		if (Static288.anInt5845 >= 2560) {
			return;
		}
		local128 = Static230.anInt4796 >> 7;
		@Pc(132) int local132 = Static133.anInt3056 >> 7;
		@Pc(137) int local137 = Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6465 >> 7;
		@Pc(142) int local142 = Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6466 >> 7;
		@Pc(150) int local150;
		if (local137 > local128) {
			local150 = local137 - local128;
		} else {
			local150 = local128 - local137;
		}
		@Pc(168) int local168;
		if (local132 < local142) {
			local168 = local142 - local132;
		} else {
			local168 = local132 - local142;
		}
		if ((local150 != 0 || local168 != 0) && (-Static92.anInt2048) < local150 && Static92.anInt2048 > local150 && local168 > -Static290.anInt5893 && Static290.anInt5893 > local168) {
			@Pc(248) int local248;
			@Pc(250) int local250;
			if (local168 >= local150) {
				local248 = local150 * 65536 / local168;
				local250 = 32768;
				while (local132 != local142) {
					if (local142 > local132) {
						local132++;
					} else if (local132 > local142) {
						local132--;
					}
					if ((Static348.aByteArrayArrayArray11[Static279.anInt5645][local128][local132] & 0x4) != 0) {
						Static284.method4847(false, local132, 1, Static18.aClass57ArrayArrayArray1, local128);
						return;
					}
					local250 += local248;
					if (local250 >= 65536) {
						if (local137 > local128) {
							local128++;
						} else if (local137 < local128) {
							local128--;
						}
						local250 -= 65536;
						if ((Static348.aByteArrayArrayArray11[Static279.anInt5645][local128][local132] & 0x4) != 0) {
							Static284.method4847(false, local132, 1, Static18.aClass57ArrayArrayArray1, local128);
							return;
						}
					}
				}
				return;
			}
			local248 = local168 * 65536 / local150;
			local250 = 32768;
			while (local128 != local137) {
				if (local128 < local137) {
					local128++;
				} else if (local128 > local137) {
					local128--;
				}
				if ((Static348.aByteArrayArrayArray11[Static279.anInt5645][local128][local132] & 0x4) != 0) {
					Static284.method4847(false, local132, 1, Static18.aClass57ArrayArrayArray1, local128);
					return;
				}
				local250 += local248;
				if (local250 >= 65536) {
					if (local142 > local132) {
						local132++;
					} else if (local132 > local142) {
						local132--;
					}
					local250 -= 65536;
					if ((Static348.aByteArrayArrayArray11[Static279.anInt5645][local128][local132] & 0x4) != 0) {
						Static284.method4847(false, local132, 1, Static18.aClass57ArrayArrayArray1, local128);
						return;
					}
				}
			}
			return;
		}
		Static103.method2841(null, "RC: " + local128 + "," + local132 + " " + local137 + "," + local142 + " " + Static10.anInt231 + "," + Static81.anInt1732);
		return;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!fc;ILclient!vm;)I")
	public static int method2845(@OriginalArg(0) Class71 arg0, @OriginalArg(2) Class92 arg1) {
		if (arg0.anInt1789 != -1) {
			return arg0.anInt1789;
		}
		if (arg0.anInt1788 != -1) {
			@Pc(31) Class135 local31 = Static156.anInterface1_3.method5634(arg1.method4463() ? arg0.anInt1788 : arg0.anInt1784);
			if (!local31.aBoolean359) {
				return local31.aShort57;
			}
		}
		return arg0.anInt1792;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)Z")
	public static boolean method2847(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static173.aBoolean319) {
			return false;
		}
		@Pc(13) int local13 = arg1 >> 16;
		@Pc(17) int local17 = arg1 & 0xFFFF;
		if (Static158.aClass72ArrayArray1[local13] == null || Static158.aClass72ArrayArray1[local13][local17] == null) {
			return false;
		}
		@Pc(40) Class72 local40 = Static158.aClass72ArrayArray1[local13][local17];
		@Pc(51) Class4_Sub18 local51;
		if (arg0 == -1 && local40.anInt1825 == 0) {
			for (local51 = (Class4_Sub18) Static248.aClass130_112.method3499(); local51 != null; local51 = (Class4_Sub18) Static248.aClass130_112.method3512()) {
				if (local51.anInt2905 == 18 || local51.anInt2905 == 1006 || local51.anInt2905 == 4 || local51.anInt2905 == 45 || local51.anInt2905 == 44) {
					for (@Pc(135) Class72 local135 = Static66.method1243(local51.anInt2906); local135 != null; local135 = Static319.method5289(local135)) {
						if (local40.anInt1830 == local135.anInt1830) {
							return true;
						}
					}
				}
			}
		} else {
			for (local51 = (Class4_Sub18) Static248.aClass130_112.method3499(); local51 != null; local51 = (Class4_Sub18) Static248.aClass130_112.method3512()) {
				if (local51.anInt2907 == arg0 && local40.anInt1830 == local51.anInt2906 && (local51.anInt2905 == 18 || local51.anInt2905 == 1006 || local51.anInt2905 == 4 || local51.anInt2905 == 45 || local51.anInt2905 == 44)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILclient!lo;I)V")
	public static void method2848(@OriginalArg(1) Class2_Sub2_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = 0;
		if (Static342.anInt6706 < arg0.anInt6484) {
			Static104.method5669(arg0);
		} else if (arg0.anInt6491 < Static342.anInt6706) {
			Static343.method5587(arg0, false);
			local13 = Static50.anInt1103;
			local11 = Static134.anInt3070;
		} else {
			Static264.method2931(arg0);
		}
		if (arg0.anInt6465 < 128 || arg0.anInt6466 < 128 || arg0.anInt6465 >= (Static92.anInt2048 - 1) * 128 || arg0.anInt6466 >= Static290.anInt5893 * 128 - 128) {
			arg0.anInt6491 = 0;
			arg0.anInt6482 = -1;
			arg0.anInt6484 = 0;
			arg0.anInt6517 = -1;
			arg0.anInt6465 = arg0.anIntArray518[0] * 128 + arg0.method5425() * 64;
			arg0.anInt6466 = arg0.anIntArray517[0] * 128 + arg0.method5425() * 64;
			arg0.method5439();
		}
		if (Static110.aClass2_Sub2_Sub1_Sub1_1 == arg0 && (arg0.anInt6465 < 1536 || arg0.anInt6466 < 1536 || Static92.anInt2048 * 128 - 1536 <= arg0.anInt6465 || Static290.anInt5893 * 128 - 1536 <= arg0.anInt6466)) {
			arg0.anInt6484 = 0;
			arg0.anInt6491 = 0;
			arg0.anInt6517 = -1;
			arg0.anInt6482 = -1;
			arg0.anInt6465 = arg0.anIntArray518[0] * 128 + arg0.method5425() * 64;
			arg0.anInt6466 = arg0.anIntArray517[0] * 128 + arg0.method5425() * 64;
			arg0.method5439();
		}
		@Pc(208) int local208 = Static206.method3642(arg0);
		Static287.method4921(local208, local11, local13, arg0);
		Static343.method5589(arg0);
	}
}
