import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!dm", name = "o", descriptor = "Lclient!kh;")
	public static Class54 aClass54_3;

	@OriginalMember(owner = "client!dm", name = "k", descriptor = "Lclient!vn;")
	public static final Class211 aClass211_3 = new Class211();

	@OriginalMember(owner = "client!dm", name = "n", descriptor = "Lclient!vn;")
	public static final Class211 aClass211_4 = new Class211();

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)Z")
	public static boolean method1248() {
		try {
			if (Static200.anInt5712 == 2) {
				if (Static83.aClass5_Sub20_1 == null) {
					Static83.aClass5_Sub20_1 = Static362.method2193(Static110.aClass170_48, Static27.anInt5261, Static52.anInt1325);
					if (Static83.aClass5_Sub20_1 == null) {
						return false;
					}
				}
				if (Static50.aClass50_1 == null) {
					Static50.aClass50_1 = new Class50(Static244.aClass170_84, Static250.aClass170_88);
				}
				if (Static352.aClass5_Sub17_Sub2_3.method3194(Static83.aClass5_Sub20_1, Static86.aClass170_38, Static50.aClass50_1)) {
					Static352.aClass5_Sub17_Sub2_3.method3217();
					Static352.aClass5_Sub17_Sub2_3.method3205(Static249.anInt4841);
					Static352.aClass5_Sub17_Sub2_3.method3218(Static147.aBoolean216, Static83.aClass5_Sub20_1);
					Static110.aClass170_48 = null;
					Static50.aClass50_1 = null;
					Static83.aClass5_Sub20_1 = null;
					Static200.anInt5712 = 0;
					return true;
				}
			}
		} catch (@Pc(61) Exception local61) {
			local61.printStackTrace();
			Static352.aClass5_Sub17_Sub2_3.method3181();
			Static200.anInt5712 = 0;
			Static83.aClass5_Sub20_1 = null;
			Static50.aClass50_1 = null;
			Static110.aClass170_48 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)I")
	public static int method1249(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local12 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local12 == 19 || local12 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIII)V")
	public static void method1250(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static138.aClass51ArrayArrayArray1 == null) {
			return;
		}
		@Pc(19) long local19 = (long) (arg2 | arg1 << 14 | arg0 << 28);
		@Pc(25) Class5_Sub16 local25 = (Class5_Sub16) Static3.aClass42_56.method1052(local19);
		if (local25 == null) {
			Static311.method5714(arg0, arg2, arg1);
			return;
		}
		@Pc(39) Class5_Sub36 local39 = (Class5_Sub36) local25.aClass211_7.method5608();
		if (local39 == null) {
			Static311.method5714(arg0, arg2, arg1);
			return;
		}
		@Pc(53) Class25_Sub5_Sub1 local53 = (Class25_Sub5_Sub1) Static311.method5714(arg0, arg2, arg1);
		if (local53 == null) {
			local53 = new Class25_Sub5_Sub1();
		} else {
			local53.anInt6321 = local53.anInt6319 = -1;
		}
		local53.anInt6310 = local39.anInt5029;
		local53.anInt6316 = local39.anInt5028;
		label44: while (true) {
			@Pc(89) Class5_Sub36 local89 = (Class5_Sub36) local25.aClass211_7.method5603();
			if (local89 == null) {
				break;
			}
			if (local53.anInt6310 != local89.anInt5029) {
				local53.anInt6314 = local89.anInt5028;
				local53.anInt6321 = local89.anInt5029;
				while (true) {
					@Pc(114) Class5_Sub36 local114 = (Class5_Sub36) local25.aClass211_7.method5603();
					if (local114 == null) {
						break label44;
					}
					if (local53.anInt6310 != local114.anInt5029 && local53.anInt6321 != local114.anInt5029) {
						local53.anInt6318 = local114.anInt5028;
						local53.anInt6319 = local114.anInt5029;
					}
				}
			}
		}
		@Pc(158) int local158 = Static66.method1393((arg1 << 7) + 64, arg0, (arg2 << 7) + 64);
		Static129.method2468(arg0, arg2, arg1, local158, local53);
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V")
	public static void method1252() {
		if (Static15.aClass59_1 == null) {
			return;
		}
		Static161.aClass24_1.method625();
		Static70.method1548();
		Static211.method3742();
		Static77.method1710();
		Static355.method5834();
		Static302.method5136();
		if (Static34.aClass129_1 != null) {
			Static34.aClass129_1.method3487();
		}
		Static36.method859();
		Static123.method2410();
		Static312.method5289();
		Static287.method4912(false);
		Static68.method1521();
		for (@Pc(42) int local42 = 0; local42 < 2048; local42++) {
			@Pc(48) Class25_Sub1_Sub1_Sub1 local48 = Static312.aClass25_Sub1_Sub1_Sub1Array1[local42];
			if (local48 != null) {
				local48.anInterface8_3 = null;
				for (@Pc(55) int local55 = 0; local55 < local48.aClass101Array3.length; local55++) {
					local48.aClass101Array3[local55] = null;
				}
			}
		}
		for (@Pc(76) int local76 = 0; local76 < Static188.aClass25_Sub1_Sub1_Sub2Array1.length; local76++) {
			@Pc(82) Class25_Sub1_Sub1_Sub2 local82 = Static188.aClass25_Sub1_Sub1_Sub2Array1[local76];
			if (local82 != null) {
				for (@Pc(86) int local86 = 0; local86 < local82.aClass101Array3.length; local86++) {
					local82.aClass101Array3[local86] = null;
				}
			}
		}
		Static15.aClass59_1.method4857();
		Static15.aClass59_1 = null;
	}
}
