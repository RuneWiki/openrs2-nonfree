import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!dv", name = "i", descriptor = "I")
	public static int anInt2408 = 0;

	@OriginalMember(owner = "client!dv", name = "p", descriptor = "I")
	public static int anInt2415 = 0;

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)V")
	public static void method2146() {
		if (Static554.anInt9953 != 0) {
			Static86.anInt1983 -= Static554.anInt9953 * 5;
			if (Static413.anInt8076 <= Static86.anInt1983) {
				Static86.anInt1983 = Static413.anInt8076 - 1;
			}
			Static554.anInt9953 = 0;
			if (Static86.anInt1983 < 0) {
				Static86.anInt1983 = 0;
			}
		}
		if (Static368.anInt7250 < 102) {
			Static368.anInt7250 += 6;
		}
		for (@Pc(43) int local43 = 0; local43 < Static110.anInt2599; local43++) {
			@Pc(49) Interface23 local49 = Static348.anInterface23Array3[local43];
			@Pc(53) int local53 = local49.method5041();
			@Pc(57) char local57 = local49.method5038();
			@Pc(61) int local61 = local49.method5040();
			if (local53 == 84) {
				Static524.method7760(false);
			}
			if (local53 == 80) {
				Static524.method7760(true);
			} else if (local53 == 66 && (local61 & 0x4) != 0) {
				if (Static93.aClipboard1 != null) {
					@Pc(88) String local88 = "";
					for (@Pc(93) int local93 = Static171.aStringArray14.length - 1; local93 >= 0; local93--) {
						if (Static171.aStringArray14[local93] != null && Static171.aStringArray14[local93].length() > 0) {
							local88 = local88 + Static171.aStringArray14[local93] + '\n';
						}
					}
					Static93.aClipboard1.setContents(new StringSelection(local88), null);
				}
			} else if (local53 == 67 && (local61 & 0x4) != 0) {
				if (Static93.aClipboard1 != null) {
					@Pc(144) Transferable local144 = Static93.aClipboard1.getContents(null);
					if (local144 != null) {
						try {
							@Pc(151) String local151 = (String) local144.getTransferData(DataFlavor.stringFlavor);
							if (local151 != null) {
								@Pc(158) String[] local158 = Static335.method5785('\n', local151);
								if (local158.length > 1) {
									for (@Pc(164) int local164 = 0; local164 < local158.length; local164++) {
										Static387.aString90 = local158[local164];
										Static524.method7760(false);
									}
								} else {
									Static387.aString90 = Static387.aString90 + local151;
								}
							}
						} catch (@Pc(195) Exception local195) {
						}
					}
				}
			} else if (local53 == 85 && Static427.anInt9474 > 0) {
				Static387.aString90 = Static387.aString90.substring(0, Static427.anInt9474 - 1) + Static387.aString90.substring(Static427.anInt9474);
				Static427.anInt9474--;
			} else if (local53 == 101 && Static427.anInt9474 < Static387.aString90.length()) {
				Static387.aString90 = Static387.aString90.substring(0, Static427.anInt9474) + Static387.aString90.substring(Static427.anInt9474 + 1);
			} else if (local53 == 96 && Static427.anInt9474 > 0) {
				Static427.anInt9474--;
			} else if (local53 == 97 && Static427.anInt9474 < Static387.aString90.length()) {
				Static427.anInt9474++;
			} else if (local53 == 102) {
				Static427.anInt9474 = 0;
			} else if (local53 == 103) {
				Static427.anInt9474 = Static387.aString90.length();
			} else if (local53 == 104 && Static171.aStringArray14.length > Static333.anInt6934) {
				Static333.anInt6934++;
				Static17.method5002();
				Static427.anInt9474 = Static387.aString90.length();
			} else if (local53 == 105 && Static333.anInt6934 > 0) {
				Static333.anInt6934--;
				Static17.method5002();
				Static427.anInt9474 = Static387.aString90.length();
			} else if (Static146.method8075(local57) || local57 == ':' || local57 == ',' || local57 == ' ' || local57 == '_' || local57 == '-' || local57 == '+' || local57 == '[' || local57 == ']') {
				Static387.aString90 = Static387.aString90.substring(0, Static427.anInt9474) + Static348.anInterface23Array3[local43].method5038() + Static387.aString90.substring(Static427.anInt9474);
				Static427.anInt9474++;
			}
		}
		Static280.anInt9834 = 0;
		Static110.anInt2599 = 0;
		Static210.method3686();
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IB)V")
	public static void method2147(@OriginalArg(0) int arg0) {
		if (Static402.method8391(arg0)) {
			Static260.method4599(Static108.aClass305ArrayArray1[arg0], -1);
		}
	}
}
