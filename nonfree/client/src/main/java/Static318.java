import java.awt.Canvas;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
	public static int anInt3229;

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "[I")
	public static final int[] anIntArray243 = new int[4];

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "[I")
	public static final int[] anIntArray244 = new int[100];

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)Lclient!lk;")
	public static Class145_Sub1 method2568(@OriginalArg(1) int arg0) {
		return Static24.aBoolean41 && arg0 >= Static177.anInt3619 && Static178.anInt3627 >= arg0 ? Static35.aClass145_Sub1Array7[arg0 - Static177.anInt3619] : null;
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
	public static void method2574() {
		if (Static78.anInt1703 < 102) {
			Static78.anInt1703 += 6;
		}
		if (Static226.anInt4383 != 0) {
			Static120.anInt2614 -= Static226.anInt4383 * 5;
			if (Static120.anInt2614 >= Static296.anInt5416) {
				Static120.anInt2614 = Static296.anInt5416 - 1;
			}
			if (Static120.anInt2614 < 0) {
				Static120.anInt2614 = 0;
			}
			Static226.anInt4383 = 0;
		}
		for (@Pc(49) int local49 = 0; local49 < Static269.anInt5026; local49++) {
			@Pc(57) int local57 = Static389.aClass19Array1[local49].method735();
			@Pc(63) char local63 = Static389.aClass19Array1[local49].method732();
			if (local57 == 84) {
				Static45.method999();
			} else if (Static19.aClass16_1.method580(82) && local57 == 66) {
				if (Static258.aClipboard4 != null) {
					@Pc(84) String local84 = "";
					for (@Pc(89) int local89 = Static230.aStringArray101.length - 1; local89 >= 0; local89--) {
						if (Static230.aStringArray101[local89] != null && Static230.aStringArray101[local89].length() > 0) {
							local84 = local84 + Static230.aStringArray101[local89] + '\n';
						}
					}
					Static258.aClipboard4.setContents(new StringSelection(local84), null);
				}
			} else if (Static19.aClass16_1.method580(82) && local57 == 67) {
				if (Static258.aClipboard4 != null) {
					@Pc(351) Transferable local351 = Static258.aClipboard4.getContents(null);
					if (local351 != null) {
						try {
							@Pc(358) String local358 = (String) local351.getTransferData(DataFlavor.stringFlavor);
							if (local358 != null) {
								@Pc(365) String[] local365 = Static365.method5139('\n', local358);
								if (local365.length <= 1) {
									Static155.aString32 = Static155.aString32 + local358;
								} else {
									for (@Pc(384) int local384 = 0; local384 < local365.length; local384++) {
										Static155.aString32 = local365[local384];
										Static45.method999();
									}
								}
							}
						} catch (@Pc(399) Exception local399) {
						}
					}
				}
			} else if (local57 == 85 && Static364.anInt6527 > 0) {
				Static155.aString32 = Static155.aString32.substring(0, Static364.anInt6527 - 1) + Static155.aString32.substring(Static364.anInt6527);
				Static364.anInt6527--;
			} else if (local57 == 101 && Static364.anInt6527 < Static155.aString32.length()) {
				Static155.aString32 = Static155.aString32.substring(0, Static364.anInt6527) + Static155.aString32.substring(Static364.anInt6527 + 1);
			} else if (local57 == 96 && Static364.anInt6527 > 0) {
				Static364.anInt6527--;
			} else if (local57 == 97 && Static364.anInt6527 < Static155.aString32.length()) {
				Static364.anInt6527++;
			} else if (local57 == 102) {
				Static364.anInt6527 = 0;
			} else if (local57 == 103) {
				Static364.anInt6527 = Static155.aString32.length();
			} else if (local57 == 104 && Static333.anInt6155 < Static230.aStringArray101.length) {
				Static333.anInt6155++;
				Static16.method510();
				Static364.anInt6527 = Static155.aString32.length();
			} else if (local57 == 105 && Static333.anInt6155 > 0) {
				Static333.anInt6155--;
				Static16.method510();
				Static364.anInt6527 = Static155.aString32.length();
			} else if (Static353.method5000(local63) || local63 == ':' || local63 == ',' || local63 == ' ' || local63 == '_' || local63 == '-' || local63 == '+' || local63 == '[' || local63 == ']') {
				Static155.aString32 = Static155.aString32.substring(0, Static364.anInt6527) + Static389.aClass19Array1[local49].method732() + Static155.aString32.substring(Static364.anInt6527);
				Static364.anInt6527++;
			}
		}
		Static269.anInt5026 = 0;
		Static357.method5085();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!hs;Ljava/awt/Canvas;Lclient!m;IIB)Lclient!qa;")
	public static synchronized Class75 method2582(@OriginalArg(0) Class103 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface7 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = -1;
		for (@Pc(12) int local12 = 0; local12 < 8; local12++) {
			if (!Static292.aBooleanArray17[local12]) {
				local5 = local12;
				break;
			}
		}
		if (local5 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(51) Class75 local51;
		if (arg4 == 0) {
			local51 = Static313.method4575(arg1, arg2, local5);
		} else if (arg4 == 1) {
			local51 = Static255.method3880(arg2, local5, arg3, arg1, arg0);
		} else if (arg4 == 2) {
			local51 = Static455.method4732(arg2, arg0, local5, arg1);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static292.aBooleanArray17[local5] = true;
		return local51;
	}

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
	public static void method2629() {
		if (Static266.aClass75_7 == null) {
			return;
		}
		Static201.aClass40_4.method1194();
		Static139.method2521();
		Static338.method1145();
		Static356.method5054();
		Static294.method4290();
		Static161.method2809();
		if (Static5.aClass29_1 != null) {
			Static5.aClass29_1.method927();
		}
		Static148.method2670();
		Static245.method3782();
		Static372.method1268();
		Static164.method2884(false);
		Static234.method3682();
		for (@Pc(36) int local36 = 0; local36 < 2048; local36++) {
			@Pc(41) Class1_Sub3_Sub3_Sub1 local41 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local36];
			if (local41 != null) {
				local41.aClass3_Sub11_3 = null;
				for (@Pc(48) int local48 = 0; local48 < local41.aClass31Array3.length; local48++) {
					local41.aClass31Array3[local48] = null;
				}
			}
		}
		for (@Pc(72) int local72 = 0; local72 < Static451.aClass1_Sub3_Sub3_Sub2Array1.length; local72++) {
			@Pc(77) Class1_Sub3_Sub3_Sub2 local77 = Static451.aClass1_Sub3_Sub3_Sub2Array1[local72];
			if (local77 != null) {
				for (@Pc(81) int local81 = 0; local81 < local77.aClass31Array3.length; local81++) {
					local77.aClass31Array3[local81] = null;
				}
			}
		}
		Static266.aClass75_7.method2608();
		Static266.aClass75_7 = null;
	}
}
