import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!lf", name = "G", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
	public static int anInt3750 = 0;

	@OriginalMember(owner = "client!lf", name = "W", descriptor = "Ljava/lang/String;")
	public static String aString244 = "K";

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!ao;II)V")
	public static void method3377(@OriginalArg(0) Class14 arg0, @OriginalArg(2) int arg1) {
		if (Static196.aBoolean300) {
			Static196.aBoolean300 = false;
			arg1 = 0;
		}
		if (Static241.aClass14_1 != null && Static241.aClass14_1.method212(arg0)) {
			return;
		}
		Static241.aClass14_1 = arg0;
		Static241.aLong158 = Static335.method5308();
		Static240.anInt6391 = arg1;
		Static161.anInt3339 = arg1;
		if (Static161.anInt3339 == 0) {
			Static263.method4424();
			return;
		}
		Static252.anInt6121 = Static42.anInt1094;
		Static87.aFloat74 = Static320.aFloat75;
		Static159.anInt3299 = Static316.anInt6073;
		Static289.aFloat16 = Static287.aFloat72;
		Static326.aFloat77 = Static243.aFloat68;
		Static173.aFloat51 = Static186.aFloat52;
		Static65.aFloat13 = Static151.aFloat45;
		Static244.anInt4838 = Static68.anInt1706;
		Static92.aFloat15 = Static258.aFloat69;
		Static142.aClass17_3 = Static114.aClass17_2;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(CI)Z")
	public static boolean method3378(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static125.method2598(arg0)) {
			return true;
		} else {
			@Pc(21) char[] local21 = Static211.aCharArray7;
			for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
				@Pc(28) char local28 = local21[local23];
				if (arg0 == local28) {
					return true;
				}
			}
			@Pc(40) char[] local40 = Static46.aCharArray3;
			for (@Pc(42) int local42 = 0; local42 < local40.length; local42++) {
				@Pc(47) char local47 = local40[local42];
				if (local47 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BZILclient!rk;III)V")
	public static void method3379(@OriginalArg(2) int arg0, @OriginalArg(3) Class180 arg1, @OriginalArg(4) int arg2) {
		Static98.aClass180_12 = arg1;
		Static286.anInt5630 = 2;
		Static250.anInt4908 = 0;
		Static129.anInt2826 = 1;
		Static301.aBoolean425 = false;
		Static61.anInt1532 = arg2;
		Static254.anInt4944 = arg0;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)Lclient!ca;")
	public static Class36_Sub1 method3381(@OriginalArg(1) int arg0) {
		@Pc(10) Class191[] local10 = Class125.aClass191Array1;
		synchronized (Class125.aClass191Array1) {
			@Pc(26) Class36_Sub1 local26;
			if (arg0 >= Class125.aClass191Array1.length || Class125.aClass191Array1[arg0].method4870()) {
				local26 = new Class36_Sub1();
				local26.aClass36_Sub6Array1 = new Class36_Sub6[arg0];
				for (@Pc(32) int local32 = 0; local32 < arg0; local32++) {
					local26.aClass36_Sub6Array1[local32] = new Class36_Sub6();
				}
			} else {
				local26 = (Class36_Sub1) Class125.aClass191Array1[arg0].method4863();
				local26.method5317();
				@Pc(63) int local63 = Static325.anIntArray783[arg0]--;
			}
			return local26;
		}
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(II)V")
	public static void method3382(@OriginalArg(0) int arg0) {
		@Pc(8) Class7_Sub1_Sub15 local8 = Static315.method5104(11, arg0);
		local8.method4788();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLclient!sb;ILclient!sb;IIIIII)V")
	public static void method3383(@OriginalArg(1) Class22_Sub2_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class22_Sub2_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg2.method4410();
		if (local7 == -1) {
			return;
		}
		@Pc(23) Class52 local23 = (Class52) Static171.aClass103_28.method2682((long) local7);
		if (local23 == null) {
			@Pc(30) Class56[] local30 = Static358.method1303(Static312.aClass180_89, local7);
			if (local30 == null) {
				return;
			}
			local23 = Static128.aClass89_3.method5411(local30[0]);
			Static171.aClass103_28.method2687(local23, (long) local7);
		}
		Static342.method5549(arg0.anInt5967, arg0.anInt5973, arg4 >> 1, 0, arg0.method4421() * 64, arg1 >> 1);
		@Pc(74) int local74 = arg5 + Static157.anIntArray430[0] - 18;
		@Pc(85) int local85 = arg6 + Static157.anIntArray430[1] - 16 - 54;
		@Pc(93) int local93 = local74 + arg3 / 4 * 18;
		@Pc(101) int local101 = local85 + arg3 % 4 * 18;
		local23.method4123(local93, local101);
		if (arg0 == arg2) {
			Static128.aClass89_3.method5454(local93 - 1, local101 - 1, -256, 18, 18);
		}
		@Pc(128) Class36_Sub8 local128 = Static64.method1299();
		local128.aClass22_Sub2_Sub1_1 = arg2;
		local128.anInt5443 = local93;
		local128.anInt5442 = local101 + 16;
		local128.anInt5439 = local101;
		local128.anInt5444 = local93 + 16;
		Static13.aClass191_1.method4872(local128);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILclient!cc;)I")
	public static int method3384(@OriginalArg(1) Class22_Sub2_Sub1_Sub1 arg0) {
		@Pc(11) int local11 = arg0.anInt1012;
		@Pc(15) Class79 local15 = arg0.method4417();
		if (arg0.aBoolean378) {
			local11 = arg0.anInt1003;
		} else if (local15.anInt2385 == arg0.anInt5100 || arg0.anInt5100 == local15.anInt2351 || local15.anInt2376 == arg0.anInt5100 || local15.anInt2357 == arg0.anInt5100) {
			local11 = arg0.anInt1023;
		} else if (local15.anInt2374 == arg0.anInt5100 || arg0.anInt5100 == local15.anInt2356 || arg0.anInt5100 == local15.anInt2372 || arg0.anInt5100 == local15.anInt2390) {
			local11 = arg0.anInt1010;
		}
		return local11;
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V")
	public static void method3385() {
		if (Static276.anInt5461 < 102) {
			Static276.anInt5461 += 6;
		}
		@Pc(20) int local20;
		for (@Pc(14) int local14 = 0; local14 < Static126.anInt2794; local14++) {
			local20 = Static175.anIntArray492[local14];
			@Pc(25) char local25 = (char) Static286.anIntArray713[local14];
			if (local20 == 84) {
				Static121.method2565();
			} else if (Static17.aBooleanArray24[82] && local20 == 66) {
				if (Static152.aClipboard1 != null) {
					@Pc(43) String local43 = "";
					for (@Pc(48) int local48 = Static353.aStringArray27.length - 1; local48 >= 0; local48--) {
						if (Static353.aStringArray27[local48] != null && Static353.aStringArray27[local48].length() > 0) {
							local43 = local43 + Static353.aStringArray27[local48] + '\n';
						}
					}
					Static152.aClipboard1.setContents(new StringSelection(local43), null);
				}
			} else if (Static17.aBooleanArray24[82] && local20 == 67) {
				if (Static152.aClipboard1 != null) {
					@Pc(100) Transferable local100 = Static152.aClipboard1.getContents(null);
					if (local100 != null) {
						try {
							@Pc(107) String local107 = (String) local100.getTransferData(DataFlavor.stringFlavor);
							if (local107 != null) {
								@Pc(114) String[] local114 = Static201.method3708('\n', local107);
								if (local114.length <= 1) {
									Static125.aString190 = Static125.aString190 + local107;
								} else {
									for (@Pc(131) int local131 = 0; local131 < local114.length; local131++) {
										Static125.aString190 = local114[local131];
										Static121.method2565();
									}
								}
							}
						} catch (@Pc(146) Exception local146) {
						}
					}
				}
			} else if (local20 == 85 && Static125.aString190.length() > 0) {
				Static125.aString190 = Static125.aString190.substring(0, Static125.aString190.length() - 1);
			} else if (local20 == 104 && Static353.aStringArray27.length > Static254.anInt4935) {
				Static254.anInt4935++;
				Static221.method3906();
			} else if (local20 == 105 && Static254.anInt4935 > 0) {
				Static254.anInt4935--;
				Static221.method3906();
			} else if (Static125.method2598(local25) || local25 == ',' || local25 == ' ' || local25 == '_' || local25 == '-' || local25 == '+') {
				Static125.aString190 = Static125.aString190 + (char) Static286.anIntArray713[local14];
			}
		}
		Static126.anInt2794 = 0;
		for (local20 = 0; local20 < 100; local20++) {
			@Pc(270) int local270;
			if (Static5.aBooleanArray1[local20]) {
				local270 = Static122.anIntArray367[local20]++;
				if (Static122.anIntArray367[local20] > 102) {
					Static5.aBooleanArray1[local20] = false;
				}
			} else {
				local270 = Static122.anIntArray367[local20]--;
				if (Static122.anIntArray367[local20] < 0) {
					Static338.anIntArray816[local20] = (int) ((double) Static128.anInt2823 * Math.random());
					Static107.anIntArray224[local20] = (int) (Math.random() * 350.0D);
					Static122.anIntArray367[local20] = 0;
					Static5.aBooleanArray1[local20] = true;
				}
			}
		}
		Static183.method3347();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIBIIII)V")
	public static void method3387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg3 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(31) int local31 = Static33.aShort19 + local7 * (Static92.aShort41 - Static33.aShort19) / 100;
		@Pc(37) int local37 = arg1 * local31 >> 8;
		@Pc(44) int local44 = 16384 - arg0 & 0x3FFF;
		@Pc(51) int local51 = 16384 - arg2 & 0x3FFF;
		@Pc(58) int local58 = 0;
		@Pc(60) int local60 = 0;
		@Pc(62) int local62 = local37;
		if (local44 != 0) {
			local60 = -local37 * Class147.anIntArray604[local44] >> 15;
			local62 = Class147.anIntArray603[local44] * local37 >> 15;
		}
		if (local51 != 0) {
			local58 = local62 * Class147.anIntArray604[local51] >> 15;
			local62 = Class147.anIntArray603[local51] * local62 >> 15;
		}
		Static271.anInt5361 = arg5 - local60;
		Static138.anInt3022 = arg2;
		Static203.anInt4014 = arg4 - local58;
		Static24.anInt478 = arg6 - local62;
		Static179.anInt3660 = arg0;
	}
}
