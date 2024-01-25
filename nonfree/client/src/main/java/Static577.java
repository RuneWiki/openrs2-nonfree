import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!wb", name = "Lb", descriptor = "I")
	public static int anInt9986;

	@OriginalMember(owner = "client!wb", name = "Pb", descriptor = "I")
	public static int anInt9990;

	@OriginalMember(owner = "client!wb", name = "ub", descriptor = "Z")
	public static boolean aBoolean689 = false;

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(B)V")
	public static void method7832() {
		if (Static324.anInt5928 < 102) {
			Static324.anInt5928 += 6;
		}
		@Pc(26) int local26;
		if (Static510.anInt8803 != -1 && Static224.aLong106 < Static96.method2000()) {
			for (local26 = Static510.anInt8803; local26 < Static368.aStringArray30.length; local26++) {
				if (Static368.aStringArray30[local26].startsWith("pause")) {
					@Pc(36) int local36 = 5;
					try {
						local36 = Integer.parseInt(Static368.aStringArray30[local26].substring(6));
					} catch (@Pc(45) Exception local45) {
					}
					Static196.method3426("Pausing for " + local36 + " seconds...");
					Static510.anInt8803 = local26 + 1;
					Static224.aLong106 = Static96.method2000() + (long) (local36 * 1000);
					return;
				}
				Static527.aString267 = Static368.aStringArray30[local26];
				Static492.method6623(false);
			}
			Static510.anInt8803 = -1;
		}
		if (Static492.anInt8441 != 0) {
			Static298.anInt5568 -= Static492.anInt8441 * 5;
			if (Static298.anInt5568 >= Static340.anInt6134) {
				Static298.anInt5568 = Static340.anInt6134 - 1;
			}
			if (Static298.anInt5568 < 0) {
				Static298.anInt5568 = 0;
			}
			Static492.anInt8441 = 0;
		}
		for (local26 = 0; local26 < Static294.anInt5507; local26++) {
			@Pc(116) Interface21 local116 = Static487.anInterface21Array2[local26];
			@Pc(120) int local120 = local116.method5127();
			@Pc(124) char local124 = local116.method5125();
			@Pc(128) int local128 = local116.method5124();
			if (local120 == 84) {
				Static492.method6623(false);
			}
			if (local120 == 80) {
				Static492.method6623(true);
			} else if (local120 == 66 && (local128 & 0x4) != 0) {
				if (Static454.aClipboard1 != null) {
					@Pc(399) String local399 = "";
					for (@Pc(404) int local404 = Static495.aStringArray41.length - 1; local404 >= 0; local404--) {
						if (Static495.aStringArray41[local404] != null && Static495.aStringArray41[local404].length() > 0) {
							local399 = local399 + Static495.aStringArray41[local404] + '\n';
						}
					}
					Static454.aClipboard1.setContents(new StringSelection(local399), null);
				}
			} else if (local120 == 67 && (local128 & 0x4) != 0) {
				if (Static454.aClipboard1 != null) {
					@Pc(374) Transferable local374 = Static454.aClipboard1.getContents(null);
					if (local374 != null) {
						try {
							@Pc(381) String local381 = (String) local374.getTransferData(DataFlavor.stringFlavor);
							if (local381 != null) {
								@Pc(388) String[] local388 = Static317.method4706('\n', local381);
								Static228.method3731(local388);
							}
						} catch (@Pc(393) Exception local393) {
						}
					}
				}
			} else if (local120 == 85 && Static329.anInt5996 > 0) {
				Static527.aString267 = Static527.aString267.substring(0, Static329.anInt5996 - 1) + Static527.aString267.substring(Static329.anInt5996);
				Static329.anInt5996--;
			} else if (local120 == 101 && Static329.anInt5996 < Static527.aString267.length()) {
				Static527.aString267 = Static527.aString267.substring(0, Static329.anInt5996) + Static527.aString267.substring(Static329.anInt5996 + 1);
			} else if (local120 == 96 && Static329.anInt5996 > 0) {
				Static329.anInt5996--;
			} else if (local120 == 97 && Static329.anInt5996 < Static527.aString267.length()) {
				Static329.anInt5996++;
			} else if (local120 == 102) {
				Static329.anInt5996 = 0;
			} else if (local120 == 103) {
				Static329.anInt5996 = Static527.aString267.length();
			} else if (local120 == 104 && Static478.anInt8321 < Static495.aStringArray41.length) {
				Static478.anInt8321++;
				Static462.method6359();
				Static329.anInt5996 = Static527.aString267.length();
			} else if (local120 == 105 && Static478.anInt8321 > 0) {
				Static478.anInt8321--;
				Static462.method6359();
				Static329.anInt5996 = Static527.aString267.length();
			} else if (Static228.method3730(local124) || local124 == '\\' || local124 == '/' || local124 == '.' || local124 == ':' || local124 == ',' || local124 == ' ' || local124 == '_' || local124 == '-' || local124 == '+' || local124 == '[' || local124 == ']') {
				Static527.aString267 = Static527.aString267.substring(0, Static329.anInt5996) + Static487.anInterface21Array2[local26].method5125() + Static527.aString267.substring(Static329.anInt5996);
				Static329.anInt5996++;
			}
		}
		Static294.anInt5507 = 0;
		Static522.anInt9178 = 0;
		Static246.method3899();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)Z")
	public static boolean method7841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x70000) != 0 | Static216.method3595(arg0, arg1) || Static295.method4420(arg1, arg0);
	}
}
