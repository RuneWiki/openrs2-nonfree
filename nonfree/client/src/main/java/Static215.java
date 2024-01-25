import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!me", name = "P", descriptor = "I")
	public static int anInt3982;

	@OriginalMember(owner = "client!me", name = "X", descriptor = "[I")
	public static int[] anIntArray491;

	@OriginalMember(owner = "client!me", name = "Q", descriptor = "Lclient!lm;")
	public static final Class144 aClass144_7 = new Class144("", 16);

	@OriginalMember(owner = "client!me", name = "S", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_136 = new Class221("M", "M", "M", "M");

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
	public static void method3629() {
		if (Static40.anInt6590 < 102) {
			Static40.anInt6590 += 6;
		}
		if (Static32.anInt6038 != 0) {
			Static154.anInt2771 -= Static32.anInt6038 * 5;
			if (Static214.anInt3953 <= Static154.anInt2771) {
				Static154.anInt2771 = Static214.anInt3953 - 1;
			}
			Static32.anInt6038 = 0;
			if (Static154.anInt2771 < 0) {
				Static154.anInt2771 = 0;
			}
		}
		@Pc(55) int local55;
		for (@Pc(47) int local47 = 0; local47 < Static267.anInt4715; local47++) {
			local55 = Static93.aClass15Array1[local47].method3594();
			@Pc(61) char local61 = Static93.aClass15Array1[local47].method3593();
			if (local55 == 84) {
				Static183.method2982();
			} else if (Static129.aClass149_1.method3685(82) && local55 == 66) {
				if (Static120.aClipboard1 != null) {
					@Pc(354) String local354 = "";
					for (@Pc(359) int local359 = Static98.aStringArray12.length - 1; local359 >= 0; local359--) {
						if (Static98.aStringArray12[local359] != null && Static98.aStringArray12[local359].length() > 0) {
							local354 = local354 + Static98.aStringArray12[local359] + '\n';
						}
					}
					Static120.aClipboard1.setContents(new StringSelection(local354), null);
				}
			} else if (Static129.aClass149_1.method3685(82) && local55 == 67) {
				if (Static120.aClipboard1 != null) {
					@Pc(94) Transferable local94 = Static120.aClipboard1.getContents(null);
					if (local94 != null) {
						try {
							@Pc(101) String local101 = (String) local94.getTransferData(DataFlavor.stringFlavor);
							if (local101 != null) {
								@Pc(108) String[] local108 = Static29.method705(local101, '\n');
								if (local108.length > 1) {
									for (@Pc(114) int local114 = 0; local114 < local108.length; local114++) {
										Static251.aString44 = local108[local114];
										Static183.method2982();
									}
								} else {
									Static251.aString44 = Static251.aString44 + local101;
								}
							}
						} catch (@Pc(140) Exception local140) {
						}
					}
				}
			} else if (local55 == 85 && Static194.anInt3430 > 0) {
				Static251.aString44 = Static251.aString44.substring(0, Static194.anInt3430 - 1) + Static251.aString44.substring(Static194.anInt3430);
				Static194.anInt3430--;
			} else if (local55 == 101 && Static194.anInt3430 < Static251.aString44.length()) {
				Static251.aString44 = Static251.aString44.substring(0, Static194.anInt3430) + Static251.aString44.substring(Static194.anInt3430 + 1);
			} else if (local55 == 96 && Static194.anInt3430 > 0) {
				Static194.anInt3430--;
			} else if (local55 == 97 && Static194.anInt3430 < Static251.aString44.length()) {
				Static194.anInt3430++;
			} else if (local55 == 102) {
				Static194.anInt3430 = 0;
			} else if (local55 == 103) {
				Static194.anInt3430 = Static251.aString44.length();
			} else if (local55 == 104 && Static319.anInt5631 < Static98.aStringArray12.length) {
				Static319.anInt5631++;
				Static346.method5276();
				Static194.anInt3430 = Static251.aString44.length();
			} else if (local55 == 105 && Static319.anInt5631 > 0) {
				Static319.anInt5631--;
				Static346.method5276();
				Static194.anInt3430 = Static251.aString44.length();
			} else if (Static389.method5717(local61) || local61 == ':' || local61 == ',' || local61 == ' ' || local61 == '_' || local61 == '-' || local61 == '+' || local61 == '[' || local61 == ']') {
				Static251.aString44 = Static251.aString44.substring(0, Static194.anInt3430) + Static93.aClass15Array1[local47].method3593() + Static251.aString44.substring(Static194.anInt3430);
				Static194.anInt3430++;
			}
		}
		Static267.anInt4715 = 0;
		for (local55 = 0; local55 < 100; local55++) {
			@Pc(421) int local421;
			if (Static104.aBooleanArray45[local55]) {
				local421 = Static165.anIntArray330[local55]++;
				if (Static165.anIntArray330[local55] > 102) {
					Static104.aBooleanArray45[local55] = false;
				}
			} else {
				local421 = Static165.anIntArray330[local55]--;
				if (Static165.anIntArray330[local55] < 0) {
					Static388.anIntArray496[local55] = (int) ((double) Static335.anInt5875 * Math.random());
					Static166.anIntArray331[local55] = (int) (Math.random() * 350.0D);
					Static165.anIntArray330[local55] = 0;
					Static104.aBooleanArray45[local55] = true;
				}
			}
		}
		Static303.method4753();
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!sm;IIILclient!km;)V")
	public static void method3630(@OriginalArg(0) Class210 arg0, @OriginalArg(4) Class82 arg1) {
		Static100.aClass210_16.method5043();
		if (Static327.aBoolean446) {
			return;
		}
		for (@Pc(21) Class2_Sub20 local21 = (Class2_Sub20) arg0.method5035(); local21 != null; local21 = (Class2_Sub20) arg0.method5037()) {
			@Pc(29) Class80 local29 = Static302.aClass211_2.method5049(local21.anInt3000);
			if (Static376.method5643(local29)) {
				@Pc(41) boolean local41 = Static130.method2304(local29, local21, arg1);
				if (local41) {
					Static146.method2506(local21, local29, arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!wj;Lclient!wj;IZI)I")
	public static int method3632(@OriginalArg(0) Class141_Sub1 arg0, @OriginalArg(1) Class141_Sub1 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg3 == 1) {
			local9 = arg1.anInt6662;
			local12 = arg0.anInt6662;
			if (!arg2) {
				if (local12 == -1) {
					local12 = 2001;
				}
				if (local9 == -1) {
					local9 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg3 == 2) {
			return Static196.method3284(arg0.method5706().aString61, arg1.method5706().aString61, Static189.anInt5185);
		} else if (arg3 == 3) {
			if (arg1.aString62.equals("-")) {
				if (arg0.aString62.equals("-")) {
					return 0;
				} else if (arg2) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg0.aString62.equals("-")) {
				return arg2 ? 1 : -1;
			} else {
				return Static196.method3284(arg0.aString62, arg1.aString62, Static189.anInt5185);
			}
		} else if (arg3 == 4) {
			if (arg1.method5698()) {
				return arg0.method5698() ? 0 : 1;
			} else if (arg0.method5698()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 5) {
			if (arg1.method5697()) {
				return arg0.method5697() ? 0 : 1;
			} else if (arg0.method5697()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 6) {
			if (arg1.method5700()) {
				return arg0.method5700() ? 0 : 1;
			} else if (arg0.method5700()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 7) {
			if (arg1.method5699()) {
				return arg0.method5699() ? 0 : 1;
			} else if (arg0.method5699()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 8) {
			local9 = arg1.anInt6673;
			local12 = arg0.anInt6673;
			if (arg2) {
				if (local9 == 1000) {
					local9 = -1;
				}
				if (local12 == 1000) {
					local12 = -1;
				}
			} else {
				if (local9 == -1) {
					local9 = 1000;
				}
				if (local12 == -1) {
					local12 = 1000;
				}
			}
			return local9 - local12;
		} else {
			return arg1.anInt6672 - arg0.anInt6672;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILclient!ld;[I[I[I)V")
	public static void method3635(@OriginalArg(1) Class12_Sub1_Sub2_Sub1 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(8) int local8 = 0; local8 < arg2.length; local8++) {
			@Pc(14) int local14 = arg2[local8];
			@Pc(18) int local18 = arg3[local8];
			@Pc(22) int local22 = arg1[local8];
			@Pc(24) int local24 = 0;
			while (local18 != 0 && arg0.aClass95Array3.length > local24) {
				if ((local18 & 0x1) != 0) {
					if (local14 == -1) {
						arg0.aClass95Array3[local24] = null;
					} else {
						@Pc(48) Class189 local48 = Static351.aClass175_3.method4107(local14);
						@Pc(51) int local51 = local48.anInt5165;
						@Pc(56) Class95 local56 = arg0.aClass95Array3[local24];
						if (local56 != null) {
							if (local56.anInt2400 == local14) {
								if (local51 == 0) {
									local56 = arg0.aClass95Array3[local24] = null;
								} else if (local51 == 1) {
									local56.anInt2399 = 0;
									local56.anInt2397 = 0;
									local56.anInt2394 = 0;
									local56.anInt2392 = local22;
									local56.anInt2398 = 1;
									Static369.method5563(arg0.aByte74, local48, false, arg0.anInt6328, arg0.anInt6317, 0);
								} else if (local51 == 2) {
									local56.anInt2394 = 0;
								}
							} else if (local48.anInt5157 >= Static351.aClass175_3.method4107(local56.anInt2400).anInt5157) {
								local56 = arg0.aClass95Array3[local24] = null;
							}
						}
						if (local56 == null) {
							local56 = arg0.aClass95Array3[local24] = new Class95();
							local56.anInt2392 = local22;
							local56.anInt2397 = 0;
							local56.anInt2398 = 1;
							local56.anInt2399 = 0;
							local56.anInt2400 = local14;
							local56.anInt2394 = 0;
							Static369.method5563(arg0.aByte74, local48, false, arg0.anInt6328, arg0.anInt6317, 0);
						}
					}
				}
				local24++;
				local18 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(Z)V")
	public static void method3636() {
		if (Static304.aClass82_4.method4550()) {
			Static260.method4047();
			Static304.aClass82_4.method4468(Static170.aCanvas4);
			Static303.method4753();
		} else {
			Static200.method3348(Static123.anInt2363);
		}
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(I)Lclient!s;")
	public static Class103 method3638() {
		try {
			return new Class103_Sub2();
		} catch (@Pc(13) Throwable local13) {
			try {
				return (Class103) Class.forName("Class103_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class103_Sub3();
			}
		}
	}
}
