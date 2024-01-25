import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
	public static int anInt5698;

	@OriginalMember(owner = "client!sn", name = "o", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!sn", name = "p", descriptor = "Lclient!mo;")
	public static Class143 aClass143_103;

	@OriginalMember(owner = "client!sn", name = "x", descriptor = "I")
	public static int anInt5710;

	@OriginalMember(owner = "client!sn", name = "z", descriptor = "Z")
	public static boolean aBoolean374 = false;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
	public static void method5070() {
		if (Static17.anInt345 < 102) {
			Static17.anInt345 += 6;
		}
		if (Static5.anInt4507 != 0) {
			Static274.anInt5227 -= Static5.anInt4507 * 5;
			if (Static274.anInt5227 >= Static354.anInt6718) {
				Static274.anInt5227 = Static354.anInt6718 - 1;
			} else if (Static274.anInt5227 < 0) {
				Static274.anInt5227 = 0;
			}
			Static5.anInt4507 = 0;
		}
		@Pc(55) int local55;
		for (@Pc(49) int local49 = 0; local49 < Static38.anInt907; local49++) {
			local55 = Static347.anIntArray640[local49];
			@Pc(60) char local60 = (char) Static331.anIntArray609[local49];
			if (local55 == 84) {
				Static171.method3333();
			} else if (Static345.aBooleanArray30[82] && local55 == 66) {
				if (aClipboard1 != null) {
					@Pc(342) String local342 = "";
					for (@Pc(347) int local347 = Static21.aStringArray23.length - 1; local347 >= 0; local347--) {
						if (Static21.aStringArray23[local347] != null && Static21.aStringArray23[local347].length() > 0) {
							local342 = local342 + Static21.aStringArray23[local347] + '\n';
						}
					}
					aClipboard1.setContents(new StringSelection(local342), null);
				}
			} else if (Static345.aBooleanArray30[82] && local55 == 67) {
				if (aClipboard1 != null) {
					@Pc(286) Transferable local286 = aClipboard1.getContents(null);
					if (local286 != null) {
						try {
							@Pc(293) String local293 = (String) local286.getTransferData(DataFlavor.stringFlavor);
							if (local293 != null) {
								@Pc(302) String[] local302 = Static105.method2289(local293, '\n');
								if (local302.length > 1) {
									for (@Pc(310) int local310 = 0; local310 < local302.length; local310++) {
										Static78.aString72 = local302[local310];
										Static171.method3333();
									}
								} else {
									Static78.aString72 = Static78.aString72 + local293;
								}
							}
						} catch (@Pc(336) Exception local336) {
						}
					}
				}
			} else if (local55 == 85 && Static67.anInt1609 > 0) {
				Static78.aString72 = Static78.aString72.substring(0, Static67.anInt1609 - 1) + Static78.aString72.substring(Static67.anInt1609);
				Static67.anInt1609--;
			} else if (local55 == 101 && Static67.anInt1609 < Static78.aString72.length()) {
				Static78.aString72 = Static78.aString72.substring(0, Static67.anInt1609) + Static78.aString72.substring(Static67.anInt1609 + 1);
			} else if (local55 == 96 && Static67.anInt1609 > 0) {
				Static67.anInt1609--;
			} else if (local55 == 97 && Static67.anInt1609 < Static78.aString72.length()) {
				Static67.anInt1609++;
			} else if (local55 == 102) {
				Static67.anInt1609 = 0;
			} else if (local55 == 103) {
				Static67.anInt1609 = Static78.aString72.length();
			} else if (local55 == 104 && Static237.anInt4633 < Static21.aStringArray23.length) {
				Static237.anInt4633++;
				Static137.method2762();
				Static67.anInt1609 = Static78.aString72.length();
			} else if (local55 == 105 && Static237.anInt4633 > 0) {
				Static237.anInt4633--;
				Static137.method2762();
				Static67.anInt1609 = Static78.aString72.length();
			} else if (Static2.method101(local60) || local60 == ':' || local60 == ',' || local60 == ' ' || local60 == '_' || local60 == '-' || local60 == '+') {
				Static78.aString72 = Static78.aString72.substring(0, Static67.anInt1609) + (char) Static331.anIntArray609[local49] + Static78.aString72.substring(Static67.anInt1609);
				Static67.anInt1609++;
			}
		}
		Static38.anInt907 = 0;
		for (local55 = 0; local55 < 100; local55++) {
			@Pc(408) int local408;
			if (Static174.aBooleanArray15[local55]) {
				local408 = Static83.anIntArray618[local55]++;
				if (Static83.anIntArray618[local55] > 102) {
					Static174.aBooleanArray15[local55] = false;
				}
			} else {
				local408 = Static83.anIntArray618[local55]--;
				if (Static83.anIntArray618[local55] < 0) {
					Static9.anIntArray11[local55] = (int) (Math.random() * (double) Static294.anInt5659);
					Static220.anIntArray394[local55] = (int) (Math.random() * 350.0D);
					Static83.anIntArray618[local55] = 0;
					Static174.aBooleanArray15[local55] = true;
				}
			}
		}
		Static7.method206();
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(III)I")
	public static int method5072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local12 *= arg1;
			}
			arg1 *= arg1;
			arg0 >>= 0x1;
		}
		if (arg0 == 1) {
			return local12 * arg1;
		} else {
			return local12;
		}
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(B)V")
	public static void method5073() {
		@Pc(13) Class14_Sub2_Sub13 local13 = Static1.method5711(15, 0);
		local13.method3539();
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZ)V")
	public static void method5075(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static241.aClass14_Sub2_Sub14_3 != null) {
			Static213.anInt4255 = Static241.aClass14_Sub2_Sub14_3.anInt4460;
		} else {
			Static213.anInt4255 = -1;
		}
		Static315.anInt6452 = 0;
		Static241.aClass14_Sub2_Sub14_3 = null;
		Static326.aClass18_44 = null;
		Static206.aClass146_60 = null;
		Static241.method5046();
		Static241.aClass18_35.method461();
		Static241.aClass163_3 = null;
		Static90.aClass212_3 = null;
		Static195.anInt3964 = -1;
		Static319.aClass212_16 = null;
		Static156.aClass212_15 = null;
		Static255.aClass212_13 = null;
		Static307.aClass212_7 = null;
		Static108.aClass212_4 = null;
		Static121.aClass212_5 = null;
		Static68.aClass2_3 = null;
		Static273.anInt5198 = -1;
		Static222.aClass212_12 = null;
		Static338.method5820();
		Static147.method2549(64, 128);
		Static65.method5169(64, 64);
		Static231.method4076(64);
		Static273.method4633(64);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(BI)V")
	public static void method5077(@OriginalArg(1) int arg0) {
		Static17.anInt347 = arg0;
		Static118.anInt2594 = -1;
		Static331.anInt6398 = 100;
		Static28.anInt659 = 3;
	}
}
