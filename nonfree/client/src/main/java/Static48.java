import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
	public static int anInt1073;

	@OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
	public static int anInt1076 = 0;

	@OriginalMember(owner = "client!dd", name = "o", descriptor = "[Z")
	public static boolean[] aBooleanArray14 = new boolean[100];

	@OriginalMember(owner = "client!dd", name = "u", descriptor = "Lclient!lg;")
	public static Class97 aClass97_7 = null;

	@OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
	public static int anInt1081 = -1;

	@OriginalMember(owner = "client!dd", name = "B", descriptor = "[I")
	public static int[] anIntArray116 = new int[1000];

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)I")
	public static int method942() {
		return Static201.anInt4016;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
	public static void method943() {
		if (Static228.anInt4576 == 0) {
			return;
		}
		try {
			if (++Static195.anInt3936 > 2000) {
				if (Static261.aClass91_3 != null) {
					Static261.aClass91_3.method2302();
					Static261.aClass91_3 = null;
				}
				if (Static238.anInt3859 >= 1) {
					Static170.anInt3406 = -5;
					Static228.anInt4576 = 0;
					return;
				}
				Static195.anInt3936 = 0;
				Static238.anInt3859++;
				Static228.anInt4576 = 1;
				if (Static140.anInt2772 == Static17.anInt387) {
					Static140.anInt2772 = Static9.anInt185;
				} else {
					Static140.anInt2772 = Static17.anInt387;
				}
			}
			if (Static228.anInt4576 == 1) {
				Static21.aClass119_1 = Static95.aClass184_3.method4611(Static140.anInt2772, Static253.aString168);
				Static228.anInt4576 = 2;
			}
			@Pc(134) int local134;
			if (Static228.anInt4576 == 2) {
				if (Static21.aClass119_1.anInt3695 == 2) {
					throw new IOException();
				}
				if (Static21.aClass119_1.anInt3695 != 1) {
					return;
				}
				Static261.aClass91_3 = new Class91((Socket) Static21.aClass119_1.anObject4, Static95.aClass184_3);
				Static21.aClass119_1 = null;
				Static261.aClass91_3.method2303(Static175.aClass4_Sub24_Sub1_1.anInt3822, Static175.aClass4_Sub24_Sub1_1.aByteArray47);
				if (Static100.aClass112_44 != null) {
					Static100.aClass112_44.method4464();
				}
				if (Static260.aClass112_115 != null) {
					Static260.aClass112_115.method4464();
				}
				local134 = Static261.aClass91_3.method2305();
				if (Static100.aClass112_44 != null) {
					Static100.aClass112_44.method4464();
				}
				if (Static260.aClass112_115 != null) {
					Static260.aClass112_115.method4464();
				}
				if (local134 != 21) {
					Static228.anInt4576 = 0;
					Static170.anInt3406 = local134;
					Static261.aClass91_3.method2302();
					Static261.aClass91_3 = null;
					return;
				}
				Static228.anInt4576 = 3;
			}
			if (Static228.anInt4576 == 3) {
				if (Static261.aClass91_3.method2300() < 1) {
					return;
				}
				Static59.aStringArray7 = new String[Static261.aClass91_3.method2305()];
				Static228.anInt4576 = 4;
			}
			if (Static228.anInt4576 == 4) {
				if (Static261.aClass91_3.method2300() < Static59.aStringArray7.length * 8) {
					return;
				}
				Static256.aClass4_Sub24_Sub1_3.anInt3822 = 0;
				Static261.aClass91_3.method2304(Static256.aClass4_Sub24_Sub1_3.aByteArray47, 0, Static59.aStringArray7.length * 8);
				for (local134 = 0; local134 < Static59.aStringArray7.length; local134++) {
					Static59.aStringArray7[local134] = Static114.method1915(Static256.aClass4_Sub24_Sub1_3.method3113());
				}
				Static228.anInt4576 = 0;
				Static170.anInt3406 = 21;
				Static261.aClass91_3.method2302();
				Static261.aClass91_3 = null;
				return;
			}
		} catch (@Pc(239) IOException local239) {
			if (Static261.aClass91_3 != null) {
				Static261.aClass91_3.method2302();
				Static261.aClass91_3 = null;
			}
			if (Static238.anInt3859 < 1) {
				Static228.anInt4576 = 1;
				if (Static17.anInt387 == Static140.anInt2772) {
					Static140.anInt2772 = Static9.anInt185;
				} else {
					Static140.anInt2772 = Static17.anInt387;
				}
				Static195.anInt3936 = 0;
				Static238.anInt3859++;
			} else {
				Static228.anInt4576 = 0;
				Static170.anInt3406 = -4;
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)I")
	public static int method945(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return arg0 + local5;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLclient!we;)[Lclient!wm;")
	public static Class188[] method947(@OriginalArg(1) Class184 arg0) {
		if (!arg0.method4603()) {
			return new Class188[0];
		}
		@Pc(16) Class119 local16 = arg0.method4606();
		while (local16.anInt3695 == 0) {
			Static193.method3169(10L);
		}
		if (local16.anInt3695 == 2) {
			return new Class188[0];
		}
		@Pc(40) int[] local40 = (int[]) local16.anObject4;
		@Pc(46) Class188[] local46 = new Class188[local40.length >> 2];
		for (@Pc(56) int local56 = 0; local56 < local46.length; local56++) {
			@Pc(64) Class188 local64 = new Class188();
			local46[local56] = local64;
			local64.anInt5872 = local40[local56 << 2];
			local64.anInt5873 = local40[(local56 << 2) + 1];
			local64.anInt5866 = local40[(local56 << 2) + 2];
			local64.anInt5867 = local40[(local56 << 2) + 3];
		}
		return local46;
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V")
	public static void method949() {
		try {
			if (Static55.anInt1252 == 1) {
				@Pc(11) int local11 = Static228.aClass4_Sub6_Sub2_2.method839();
				if (local11 > 0 && Static228.aClass4_Sub6_Sub2_2.method843()) {
					local11 -= Static99.anInt1951;
					if (local11 < 0) {
						local11 = 0;
					}
					Static228.aClass4_Sub6_Sub2_2.method825(local11);
					return;
				}
				Static228.aClass4_Sub6_Sub2_2.method852();
				Static228.aClass4_Sub6_Sub2_2.method842();
				if (Static127.aClass22_43 == null) {
					Static55.anInt1252 = 0;
				} else {
					Static55.anInt1252 = 2;
				}
				Static89.aClass20_1 = null;
				Static287.aClass4_Sub14_2 = null;
			}
		} catch (@Pc(53) Exception local53) {
			local53.printStackTrace();
			Static228.aClass4_Sub6_Sub2_2.method852();
			Static89.aClass20_1 = null;
			Static55.anInt1252 = 0;
			Static127.aClass22_43 = null;
			Static287.aClass4_Sub14_2 = null;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)Z")
	public static boolean method951(@OriginalArg(1) int arg0) {
		if (Static21.aBooleanArray7[arg0]) {
			return true;
		} else if (Static279.aClass22_97.method672(arg0)) {
			@Pc(31) int local31 = Static279.aClass22_97.method679(arg0);
			if (local31 == 0) {
				Static21.aBooleanArray7[arg0] = true;
				return true;
			}
			if (Static217.aClass97ArrayArray1[arg0] == null) {
				Static217.aClass97ArrayArray1[arg0] = new Class97[local31];
			}
			for (@Pc(51) int local51 = 0; local51 < local31; local51++) {
				if (Static217.aClass97ArrayArray1[arg0][local51] == null) {
					@Pc(71) byte[] local71 = Static279.aClass22_97.method665(arg0, local51);
					if (local71 != null) {
						@Pc(84) Class97 local84 = Static217.aClass97ArrayArray1[arg0][local51] = new Class97();
						local84.anInt3162 = (arg0 << 16) + local51;
						if (local71[0] == -1) {
							local84.method2527(new Class4_Sub24(local71));
						} else {
							local84.method2524(new Class4_Sub24(local71));
						}
					}
				}
			}
			Static21.aBooleanArray7[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!wc;BI)V")
	public static void method954(@OriginalArg(0) Class13_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (Static50.anInt1118 < arg0.anInt5285) {
			Static214.method4436(arg0);
		} else if (Static50.anInt1118 > arg0.anInt5265) {
			Static299.method4598(arg0);
		} else {
			Static16.method286(arg0);
		}
		if (arg0.anInt5334 < 128 || arg0.anInt5294 < 128 || arg0.anInt5334 >= 13184 || arg0.anInt5294 >= 13184) {
			arg0.anInt5285 = 0;
			arg0.anInt5305 = -1;
			arg0.anInt5291 = -1;
			arg0.anInt5265 = 0;
			arg0.anInt5334 = arg0.anIntArray411[0] * 128 + arg0.method4219() * 64;
			arg0.anInt5294 = arg0.anIntArray418[0] * 128 + arg0.method4219() * 64;
			arg0.method4215();
		}
		if (arg0 == Static72.aClass13_Sub5_Sub1_1 && (arg0.anInt5334 < 1536 || arg0.anInt5294 < 1536 || arg0.anInt5334 >= 11776 || arg0.anInt5294 >= 11776)) {
			arg0.anInt5291 = -1;
			arg0.anInt5305 = -1;
			arg0.anInt5265 = 0;
			arg0.anInt5285 = 0;
			arg0.anInt5334 = arg0.anIntArray411[0] * 128 + arg0.method4219() * 64;
			arg0.anInt5294 = arg0.anIntArray418[0] * 128 + arg0.method4219() * 64;
			arg0.method4215();
		}
		Static104.method1785(arg0);
		Static233.method3637(arg0);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!cg;B)V")
	public static void method956(@OriginalArg(0) Class22 arg0) {
		Static11.aClass58_Sub2Array1 = Static120.method2495(arg0, Static266.anInt5236);
		Static104.anIntArray185 = new int[256];
		@Pc(15) int local15;
		for (local15 = 0; local15 < 3; local15++) {
			@Pc(29) float local29 = (float) (Static250.anIntArray388[local15] >> 16 & 0xFF);
			@Pc(39) int local39 = Static250.anIntArray388[local15 + 1] >> 16 & 0xFF;
			@Pc(47) float local47 = ((float) local39 - local29) / 64.0F;
			@Pc(54) float local54 = (float) (Static250.anIntArray388[local15] & 0xFF);
			@Pc(64) int local64 = Static250.anIntArray388[local15 + 1] >> 8 & 0xFF;
			@Pc(72) int local72 = Static250.anIntArray388[local15 + 1] & 0xFF;
			@Pc(81) float local81 = (float) (Static250.anIntArray388[local15] >> 8 & 0xFF);
			@Pc(89) float local89 = ((float) local72 - local54) / 64.0F;
			@Pc(96) float local96 = ((float) local64 - local81) / 64.0F;
			for (@Pc(98) int local98 = 0; local98 < 64; local98++) {
				Static104.anIntArray185[local15 * 64 + local98] = (int) local81 << 8 | (int) local29 << 16 | (int) local54;
				local81 += local96;
				local29 += local47;
				local54 += local89;
			}
		}
		for (local15 = 192; local15 < 255; local15++) {
			Static104.anIntArray185[local15] = Static250.anIntArray388[3];
		}
		Static298.anIntArray417 = new int[32768];
		Static286.anIntArray450 = new int[32768];
		Static293.method4563(null);
		Static49.anIntArray120 = new int[32768];
		Static240.anIntArray220 = new int[32768];
		Static273.aClass4_Sub2_Sub4_Sub2_9 = new Class4_Sub2_Sub4_Sub2(128, 254);
	}
}
