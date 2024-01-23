import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!hg", name = "E", descriptor = "Z")
	public static boolean aBoolean157;

	@OriginalMember(owner = "client!hg", name = "F", descriptor = "I")
	public static int anInt1964;

	@OriginalMember(owner = "client!hg", name = "G", descriptor = "Lclient!rn;")
	public static Class155 aClass155_50;

	@OriginalMember(owner = "client!hg", name = "K", descriptor = "I")
	public static int anInt1966;

	@OriginalMember(owner = "client!hg", name = "A", descriptor = "[I")
	public static int[] anIntArray200 = new int[14];

	@OriginalMember(owner = "client!hg", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString78 = "Loaded defaults";

	@OriginalMember(owner = "client!hg", name = "N", descriptor = "I")
	public static int anInt1969 = 0;

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "(I)V")
	public static void method1712() {
		Static155.aClass56_10 = new Class56();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	public static void method1713(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(7) Class3_Sub1 local7 = new Class3_Sub1();
		local7.anInt54 = arg10;
		local7.anInt68 = arg9;
		local7.anInt57 = arg2;
		local7.anInt63 = arg4;
		local7.anInt55 = arg11;
		local7.anInt69 = arg6;
		local7.anInt67 = arg3;
		local7.anInt65 = arg0;
		local7.anInt62 = arg5;
		local7.anInt53 = arg7;
		local7.anInt50 = arg1;
		local7.anInt58 = arg8;
		Static307.aClass56_28.method1282(local7);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILclient!rg;IBI)V")
	public static void method1714(@OriginalArg(0) int arg0, @OriginalArg(1) Class151 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static174.method2872();
		if (Static283.aBoolean393) {
			Static234.method3975(arg0, arg3, arg1.anInt4773 + arg0, arg3 + arg1.anInt4751);
		} else {
			Static143.method2449(arg0, arg3, arg0 + arg1.anInt4773, arg3 + arg1.anInt4751);
		}
		if (Static230.anInt4489 != 2 && Static230.anInt4489 != 5 && Static98.aClass3_Sub4_Sub12_1 != null) {
			@Pc(87) int local87;
			@Pc(85) int local85;
			@Pc(89) int local89;
			@Pc(80) int local80;
			if (Static25.anInt467 == 4) {
				local80 = Static224.anInt6078;
				local85 = (int) Static84.aFloat21 & 0x7FF;
				local87 = Static306.anInt6010;
				local89 = 256;
			} else {
				local87 = Static136.aClass10_Sub5_Sub1_1.anInt5016;
				local80 = Static136.aClass10_Sub5_Sub1_1.anInt5073;
				local85 = (int) Static84.aFloat21 + Static241.anInt4889 & 0x7FF;
				local89 = Static125.anInt2421 + 256;
			}
			@Pc(117) int local117 = local80 / 32 + 48;
			@Pc(125) int local125 = 464 - local87 / 32;
			if (Static283.aBoolean393) {
				((Class3_Sub4_Sub12_Sub1) Static98.aClass3_Sub4_Sub12_1).method2280(arg0, arg3, arg1.anInt4773, arg1.anInt4751, local117, local125, local85, local89, (Class3_Sub4_Sub12_Sub1) arg1.method4000(false));
			} else {
				((Class3_Sub4_Sub12_Sub2) Static98.aClass3_Sub4_Sub12_1).method4713(arg0, arg3, arg1.anInt4773, arg1.anInt4751, local117, local125, local85, local89, arg1.anIntArray509, arg1.anIntArray523);
			}
			@Pc(204) int local204;
			@Pc(214) int local214;
			@Pc(244) int local244;
			@Pc(254) int local254;
			if (Static201.aClass43_3 != null) {
				for (@Pc(168) int local168 = 0; local168 < Static201.aClass43_3.anInt1243; local168++) {
					if (Static201.aClass43_3.aClass3_Sub4_Sub23Array1[local168] != null && Static201.aClass43_3.anIntArray112[local168] >> 28 == Static99.anInt1826) {
						local204 = (Static201.aClass43_3.anIntArray112[local168] >> 14 & 0x3FFF) - Static101.anInt1844;
						local214 = (Static201.aClass43_3.anIntArray112[local168] & 0x3FFF) - Static43.anInt798;
						if (local204 >= 0 && local204 < 104 && local214 >= 0 && local214 < 104) {
							local244 = local204 * 4 + 2 - local80 / 32;
							local254 = local214 * 4 + 2 - local87 / 32;
							Static120.method2006(local244, arg3, arg1, Static201.aClass43_3.aClass3_Sub4_Sub23Array1[local168].anInt5971, arg0, local254);
						}
					}
				}
			}
			for (local204 = 0; local204 < Static7.anInt166; local204++) {
				local214 = Static235.anIntArray506[local204] * 4 + 2 - local80 / 32;
				local244 = Static134.anIntArray481[local204] * 4 + 2 - local87 / 32;
				@Pc(309) Class49 local309 = Static175.method2874(Static209.anIntArray625[local204]);
				if (local309.anIntArray131 != null) {
					local309 = local309.method1112();
					if (local309 == null || local309.anInt1377 == -1) {
						continue;
					}
				}
				Static120.method2006(local214, arg3, arg1, local309.anInt1377, arg0, local244);
			}
			@Pc(383) int local383;
			for (local204 = 0; local204 < 104; local204++) {
				for (local214 = 0; local214 < 104; local214++) {
					@Pc(358) Class56 local358 = Static223.aClass56ArrayArrayArray1[Static99.anInt1826][local204][local214];
					if (local358 != null) {
						local254 = local204 * 4 + 2 - local80 / 32;
						local383 = local214 * 4 + 2 - local87 / 32;
						Static233.method3951(arg3, local254, arg0, arg1, Static161.aClass3_Sub4_Sub12Array4[0], local383);
					}
				}
			}
			for (local204 = 0; local204 < Static118.anInt2202; local204++) {
				@Pc(414) Class10_Sub5_Sub2 local414 = Static110.aClass10_Sub5_Sub2Array1[Static253.anIntArray547[local204]];
				if (local414 != null && local414.method4189()) {
					@Pc(423) Class124 local423 = local414.aClass124_1;
					if (local423 != null && local423.anIntArray432 != null) {
						local423 = local423.method3191();
					}
					if (local423 != null && local423.aBoolean270 && local423.aBoolean271) {
						local254 = local414.anInt5073 / 32 - local80 / 32;
						local383 = local414.anInt5016 / 32 - local87 / 32;
						if (local423.anInt3792 == -1) {
							Static233.method3951(arg3, local254, arg0, arg1, Static161.aClass3_Sub4_Sub12Array4[1], local383);
						} else {
							Static120.method2006(local254, arg3, arg1, local423.anInt3792, arg0, local383);
						}
					}
				}
			}
			@Pc(537) int local537;
			for (local204 = 0; local204 < Static152.anInt2869; local204++) {
				@Pc(505) Class10_Sub5_Sub1 local505 = Static52.aClass10_Sub5_Sub1Array1[Static102.anIntArray188[local204]];
				if (local505 != null && local505.method4189()) {
					local244 = local505.anInt5073 / 32 - local80 / 32;
					local254 = local505.anInt5016 / 32 - local87 / 32;
					@Pc(535) boolean local535 = false;
					for (local537 = 0; local537 < Static285.anInt5735; local537++) {
						if (local505.aString124.equals(Static286.aStringArray37[local537]) && Static139.anIntArray400[local537] != 0) {
							local535 = true;
							break;
						}
					}
					@Pc(568) boolean local568 = false;
					for (@Pc(570) int local570 = 0; local570 < Static200.anInt3909; local570++) {
						if (local505.aString124.equals(Static279.aClass187Array1[local570].aString222)) {
							local568 = true;
							break;
						}
					}
					@Pc(594) boolean local594 = false;
					if (Static136.aClass10_Sub5_Sub1_1.anInt3568 != 0 && local505.anInt3568 != 0 && Static136.aClass10_Sub5_Sub1_1.anInt3568 == local505.anInt3568) {
						local594 = true;
					}
					if (local535) {
						Static233.method3951(arg3, local244, arg0, arg1, Static161.aClass3_Sub4_Sub12Array4[3], local254);
					} else if (local568) {
						Static233.method3951(arg3, local244, arg0, arg1, Static161.aClass3_Sub4_Sub12Array4[5], local254);
					} else if (local594) {
						Static233.method3951(arg3, local244, arg0, arg1, Static161.aClass3_Sub4_Sub12Array4[4], local254);
					} else {
						Static233.method3951(arg3, local244, arg0, arg1, Static161.aClass3_Sub4_Sub12Array4[2], local254);
					}
				}
			}
			@Pc(670) Class121[] local670 = Static51.aClass121Array1;
			for (local214 = 0; local214 < local670.length; local214++) {
				@Pc(680) Class121 local680 = local670[local214];
				if (local680 != null && local680.anInt3691 != 0 && Static124.anInt2371 % 20 < 10) {
					if (local680.anInt3691 == 1 && local680.anInt3690 >= 0 && local680.anInt3690 < Static110.aClass10_Sub5_Sub2Array1.length) {
						@Pc(718) Class10_Sub5_Sub2 local718 = Static110.aClass10_Sub5_Sub2Array1[local680.anInt3690];
						if (local718 != null) {
							local383 = local718.anInt5073 / 32 - local80 / 32;
							local537 = local718.anInt5016 / 32 - local87 / 32;
							Static37.method551(local383, local680.anInt3699, 360000, arg0, arg3, local537, arg1);
						}
					}
					if (local680.anInt3691 == 2) {
						local254 = (local680.anInt3703 - Static101.anInt1844) * 4 + 2 - local80 / 32;
						local537 = local680.anInt3698 * 4;
						local383 = (local680.anInt3696 - Static43.anInt798) * 4 + 2 - local87 / 32;
						local537 *= local537;
						Static37.method551(local254, local680.anInt3699, local537, arg0, arg3, local383, arg1);
					}
					if (local680.anInt3691 == 10 && local680.anInt3690 >= 0 && Static52.aClass10_Sub5_Sub1Array1.length > local680.anInt3690) {
						@Pc(828) Class10_Sub5_Sub1 local828 = Static52.aClass10_Sub5_Sub1Array1[local680.anInt3690];
						if (local828 != null) {
							local383 = local828.anInt5073 / 32 - local80 / 32;
							local537 = local828.anInt5016 / 32 - local87 / 32;
							Static37.method551(local383, local680.anInt3699, 360000, arg0, arg3, local537, arg1);
						}
					}
				}
			}
			if (Static25.anInt467 != 4) {
				if (Static81.anInt1533 != 0) {
					local204 = Static81.anInt1533 * 4 + Static136.aClass10_Sub5_Sub1_1.method4186() * 2 + 2 - local80 / 32 - 2;
					local214 = Static247.anInt4992 * 4 + (Static136.aClass10_Sub5_Sub1_1.method4186() + -1) * 2 + 2 - local87 / 32;
					Static233.method3951(arg3, local204, arg0, arg1, Static237.aClass3_Sub4_Sub12Array9[Static6.aBoolean11 ? 1 : 0], local214);
				}
				if (Static283.aBoolean393) {
					Static234.method3973(arg1.anInt4773 / 2 + arg0 - 1, arg3 + -1 + arg1.anInt4751 / 2, 3, 3, 16777215);
				} else {
					Static143.method2462(arg1.anInt4773 / 2 + arg0 - 1, arg1.anInt4751 / 2 + -1 + arg3, 3, 3, 16777215);
				}
			}
		} else if (Static283.aBoolean393) {
			@Pc(56) Class3_Sub4_Sub12 local56 = arg1.method4000(false);
			if (local56 != null) {
				local56.method4697(arg0, arg3);
			}
		} else {
			Static143.method2463(arg0, arg3, arg1.anIntArray509, arg1.anIntArray523);
		}
		Static223.aBooleanArray102[arg2] = true;
	}
}
