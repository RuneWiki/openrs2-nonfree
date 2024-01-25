import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!eo", name = "f", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_27 = new Class46(52, 3);

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)V")
	public static void method1984() {
		Static550.aClass133_14.xa(((float) Static97.aClass5_Sub25_8.aClass6_Sub14_1.method4302() * 0.1F + 0.7F) * Static471.aFloat143);
		Static550.aClass133_14.ZA(Static257.anInt4680, Static418.aFloat135, Static556.aFloat178, (float) (Static446.anInt7613 << 2), (float) (Static237.anInt4363 << 2), (float) (Static278.anInt4932 << 2));
		Static550.aClass133_14.method7257(Static625.aClass130_4);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(FIFFB)F")
	public static float method1985(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(12) float[] local12 = Static47.aFloatArrayArray4[arg1];
		return local12[2] * arg2 + local12[0] * arg3 + local12[1] * arg0;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V")
	public static void method1987() {
		if (Static384.anInt6356 < 102) {
			Static384.anInt6356 += 6;
		}
		@Pc(24) int local24;
		if (Static85.anInt1718 != -1 && Static95.method1587() > Static268.aLong117) {
			for (local24 = Static85.anInt1718; local24 < Static483.aStringArray68.length; local24++) {
				if (Static483.aStringArray68[local24].startsWith("pause")) {
					@Pc(43) int local43 = 5;
					try {
						local43 = Integer.parseInt(Static483.aStringArray68[local24].substring(6));
					} catch (@Pc(52) Exception local52) {
					}
					Static83.method6024("Pausing for " + local43 + " seconds...");
					Static85.anInt1718 = local24 + 1;
					Static268.aLong117 = (long) (local43 * 1000) + Static95.method1587();
					return;
				}
				Static440.aString83 = Static483.aStringArray68[local24];
				Static336.method5069(false);
			}
			Static85.anInt1718 = -1;
		}
		if (Static236.anInt4330 != 0) {
			Static189.anInt10183 -= Static236.anInt4330 * 5;
			if (Static189.anInt10183 >= Static260.anInt4710) {
				Static189.anInt10183 = Static260.anInt4710 - 1;
			}
			if (Static189.anInt10183 < 0) {
				Static189.anInt10183 = 0;
			}
			Static236.anInt4330 = 0;
		}
		for (local24 = 0; local24 < Static61.anInt9889; local24++) {
			@Pc(119) Interface1 local119 = Static327.anInterface1Array2[local24];
			@Pc(123) int local123 = local119.method7651();
			@Pc(127) char local127 = local119.method7648();
			@Pc(131) int local131 = local119.method7649();
			if (local123 == 84) {
				Static336.method5069(false);
			}
			if (local123 == 80) {
				Static336.method5069(true);
			} else if (local123 == 66 && (local131 & 0x4) != 0) {
				if (Static166.aClipboard1 != null) {
					@Pc(421) String local421 = "";
					for (@Pc(426) int local426 = Static590.aStringArray77.length - 1; local426 >= 0; local426--) {
						if (Static590.aStringArray77[local426] != null && Static590.aStringArray77[local426].length() > 0) {
							local421 = local421 + Static590.aStringArray77[local426] + '\n';
						}
					}
					Static166.aClipboard1.setContents(new StringSelection(local421), null);
				}
			} else if (local123 == 67 && (local131 & 0x4) != 0) {
				if (Static166.aClipboard1 != null) {
					@Pc(396) Transferable local396 = Static166.aClipboard1.getContents(null);
					if (local396 != null) {
						try {
							@Pc(403) String local403 = (String) local396.getTransferData(DataFlavor.stringFlavor);
							if (local403 != null) {
								@Pc(410) String[] local410 = Static481.method7093(local403, '\n');
								Static132.method6368(local410);
							}
						} catch (@Pc(415) Exception local415) {
						}
					}
				}
			} else if (local123 == 85 && Static387.anInt6408 > 0) {
				Static440.aString83 = Static440.aString83.substring(0, Static387.anInt6408 - 1) + Static440.aString83.substring(Static387.anInt6408);
				Static387.anInt6408--;
			} else if (local123 == 101 && Static387.anInt6408 < Static440.aString83.length()) {
				Static440.aString83 = Static440.aString83.substring(0, Static387.anInt6408) + Static440.aString83.substring(Static387.anInt6408 + 1);
			} else if (local123 == 96 && Static387.anInt6408 > 0) {
				Static387.anInt6408--;
			} else if (local123 == 97 && Static387.anInt6408 < Static440.aString83.length()) {
				Static387.anInt6408++;
			} else if (local123 == 102) {
				Static387.anInt6408 = 0;
			} else if (local123 == 103) {
				Static387.anInt6408 = Static440.aString83.length();
			} else if (local123 == 104 && Static590.aStringArray77.length > Static567.anInt9577) {
				Static567.anInt9577++;
				Static346.method4219();
				Static387.anInt6408 = Static440.aString83.length();
			} else if (local123 == 105 && Static567.anInt9577 > 0) {
				Static567.anInt9577--;
				Static346.method4219();
				Static387.anInt6408 = Static440.aString83.length();
			} else if (Static178.method2714(local127) || local127 == '\' || local127 == '/' || local127 == '.' || local127 == ':' || local127 == ',' || local127 == ' ' || local127 == '_' || local127 == '-' || local127 == '+' || local127 == '[' || local127 == ']') {
				Static440.aString83 = Static440.aString83.substring(0, Static387.anInt6408) + Static327.anInterface1Array2[local24].method7648() + Static440.aString83.substring(Static387.anInt6408);
				Static387.anInt6408++;
			}
		}
		Static130.anInt2337 = 0;
		Static61.anInt9889 = 0;
		Static472.method6995();
	}
}
