import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!od", name = "ib", descriptor = "F")
	public static float aFloat172;

	@OriginalMember(owner = "client!od", name = "j", descriptor = "(I)V")
	public static void method6210() {
		if (Static258.anInt5553 < 102) {
			Static258.anInt5553 += 6;
		}
		@Pc(22) int local22;
		if (Static74.anInt2290 != -1 && Static342.method5463() > Static13.aLong235) {
			for (local22 = Static74.anInt2290; local22 < Static442.aStringArray24.length; local22++) {
				if (Static442.aStringArray24[local22].startsWith("pause")) {
					@Pc(32) int local32 = 5;
					try {
						local32 = Integer.parseInt(Static442.aStringArray24[local22].substring(6));
					} catch (@Pc(41) Exception local41) {
					}
					Static481.method7139("Pausing for " + local32 + " seconds...");
					Static74.anInt2290 = local22 + 1;
					Static13.aLong235 = Static342.method5463() + (long) (local32 * 1000);
					return;
				}
				Static378.aString72 = Static442.aStringArray24[local22];
				Static238.method4376(false);
			}
			Static74.anInt2290 = -1;
		}
		if (Static92.anInt2553 != 0) {
			Static150.anInt3709 -= Static92.anInt2553 * 5;
			if (Static183.anInt4304 <= Static150.anInt3709) {
				Static150.anInt3709 = Static183.anInt4304 - 1;
			}
			Static92.anInt2553 = 0;
			if (Static150.anInt3709 < 0) {
				Static150.anInt3709 = 0;
			}
		}
		for (local22 = 0; local22 < Static122.anInt3320; local22++) {
			@Pc(116) Interface21 local116 = Static547.anInterface21Array2[local22];
			@Pc(120) int local120 = local116.method3240();
			@Pc(124) char local124 = local116.method3239();
			@Pc(128) int local128 = local116.method3238();
			if (local120 == 84) {
				Static238.method4376(false);
			}
			if (local120 == 80) {
				Static238.method4376(true);
			} else if (local120 == 66 && (local128 & 0x4) != 0) {
				if (Static3.aClipboard1 != null) {
					@Pc(410) String local410 = "";
					for (@Pc(415) int local415 = Static281.aStringArray16.length - 1; local415 >= 0; local415--) {
						if (Static281.aStringArray16[local415] != null && Static281.aStringArray16[local415].length() > 0) {
							local410 = local410 + Static281.aStringArray16[local415] + '\n';
						}
					}
					Static3.aClipboard1.setContents(new StringSelection(local410), null);
				}
			} else if (local120 == 67 && (local128 & 0x4) != 0) {
				if (Static3.aClipboard1 != null) {
					@Pc(385) Transferable local385 = Static3.aClipboard1.getContents(null);
					if (local385 != null) {
						try {
							@Pc(392) String local392 = (String) local385.getTransferData(DataFlavor.stringFlavor);
							if (local392 != null) {
								@Pc(399) String[] local399 = Static403.method6410(local392, '\n');
								Static259.method4571(local399);
							}
						} catch (@Pc(404) Exception local404) {
						}
					}
				}
			} else if (local120 == 85 && Static419.anInt7930 > 0) {
				Static378.aString72 = Static378.aString72.substring(0, Static419.anInt7930 - 1) + Static378.aString72.substring(Static419.anInt7930);
				Static419.anInt7930--;
			} else if (local120 == 101 && Static419.anInt7930 < Static378.aString72.length()) {
				Static378.aString72 = Static378.aString72.substring(0, Static419.anInt7930) + Static378.aString72.substring(Static419.anInt7930 + 1);
			} else if (local120 == 96 && Static419.anInt7930 > 0) {
				Static419.anInt7930--;
			} else if (local120 == 97 && Static419.anInt7930 < Static378.aString72.length()) {
				Static419.anInt7930++;
			} else if (local120 == 102) {
				Static419.anInt7930 = 0;
			} else if (local120 == 103) {
				Static419.anInt7930 = Static378.aString72.length();
			} else if (local120 == 104 && Static112.anInt2926 < Static281.aStringArray16.length) {
				Static112.anInt2926++;
				Static365.method5689();
				Static419.anInt7930 = Static378.aString72.length();
			} else if (local120 == 105 && Static112.anInt2926 > 0) {
				Static112.anInt2926--;
				Static365.method5689();
				Static419.anInt7930 = Static378.aString72.length();
			} else if (Static308.method5079(local124) || local124 == '\' || local124 == '/' || local124 == '.' || local124 == ':' || local124 == ',' || local124 == ' ' || local124 == '_' || local124 == '-' || local124 == '+' || local124 == '[' || local124 == ']') {
				Static378.aString72 = Static378.aString72.substring(0, Static419.anInt7930) + Static547.anInterface21Array2[local22].method3239() + Static378.aString72.substring(Static419.anInt7930);
				Static419.anInt7930++;
			}
		}
		Static349.anInt6741 = 0;
		Static122.anInt3320 = 0;
		Static121.method2707();
	}
}
