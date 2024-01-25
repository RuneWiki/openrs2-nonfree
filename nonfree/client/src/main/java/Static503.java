import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static503 {

	@OriginalMember(owner = "client!rl", name = "de", descriptor = "Lclient!iea;")
	public static Class31 aClass31_34;

	@OriginalMember(owner = "client!rl", name = "m", descriptor = "(I)V")
	public static void method7022() {
		if (Static243.anInt7075 < 102) {
			Static243.anInt7075 += 6;
		}
		@Pc(31) int local31;
		if (Static507.anInt10231 != -1 && Static48.method1203() > Static228.aLong106) {
			for (local31 = Static507.anInt10231; local31 < Static66.aStringArray4.length; local31++) {
				if (Static66.aStringArray4[local31].startsWith("pause")) {
					@Pc(50) int local50 = 5;
					try {
						local50 = Integer.parseInt(Static66.aStringArray4[local31].substring(6));
					} catch (@Pc(59) Exception local59) {
					}
					Static575.method7997("Pausing for " + local50 + " seconds...");
					Static507.anInt10231 = local31 + 1;
					Static228.aLong106 = (long) (local50 * 1000) + Static48.method1203();
					return;
				}
				Static143.aString27 = Static66.aStringArray4[local31];
				Static561.method7865(false);
			}
			Static507.anInt10231 = -1;
		}
		if (Static617.anInt10101 != 0) {
			Static523.anInt8450 -= Static617.anInt10101 * 5;
			if (Static523.anInt8450 >= Static91.anInt2239) {
				Static523.anInt8450 = Static91.anInt2239 - 1;
			}
			if (Static523.anInt8450 < 0) {
				Static523.anInt8450 = 0;
			}
			Static617.anInt10101 = 0;
		}
		for (local31 = 0; local31 < Static206.anInt3998; local31++) {
			@Pc(129) Interface20 local129 = Static248.anInterface20Array3[local31];
			@Pc(133) int local133 = local129.method7060();
			@Pc(137) char local137 = local129.method7056();
			@Pc(141) int local141 = local129.method7059();
			if (local133 == 84) {
				Static561.method7865(false);
			}
			if (local133 == 80) {
				Static561.method7865(true);
			} else if (local133 == 66 && (local141 & 0x4) != 0) {
				if (Static79.aClipboard1 != null) {
					@Pc(430) String local430 = "";
					for (@Pc(435) int local435 = Static97.aStringArray10.length - 1; local435 >= 0; local435--) {
						if (Static97.aStringArray10[local435] != null && Static97.aStringArray10[local435].length() > 0) {
							local430 = local430 + Static97.aStringArray10[local435] + '\n';
						}
					}
					Static79.aClipboard1.setContents(new StringSelection(local430), (ClipboardOwner) null);
				}
			} else if (local133 == 67 && (local141 & 0x4) != 0) {
				if (Static79.aClipboard1 != null) {
					@Pc(178) Transferable local178 = Static79.aClipboard1.getContents((Object) null);
					if (local178 != null) {
						try {
							@Pc(185) String local185 = (String) local178.getTransferData(DataFlavor.stringFlavor);
							if (local185 != null) {
								@Pc(192) String[] local192 = Static386.method5691('\n', local185);
								Static170.method2961(local192);
							}
						} catch (@Pc(197) Exception local197) {
						}
					}
				}
			} else if (local133 == 85 && Static545.anInt8786 > 0) {
				Static143.aString27 = Static143.aString27.substring(0, Static545.anInt8786 - 1) + Static143.aString27.substring(Static545.anInt8786);
				Static545.anInt8786--;
			} else if (local133 == 101 && Static545.anInt8786 < Static143.aString27.length()) {
				Static143.aString27 = Static143.aString27.substring(0, Static545.anInt8786) + Static143.aString27.substring(Static545.anInt8786 + 1);
			} else if (local133 == 96 && Static545.anInt8786 > 0) {
				Static545.anInt8786--;
			} else if (local133 == 97 && Static545.anInt8786 < Static143.aString27.length()) {
				Static545.anInt8786++;
			} else if (local133 == 102) {
				Static545.anInt8786 = 0;
			} else if (local133 == 103) {
				Static545.anInt8786 = Static143.aString27.length();
			} else if (local133 == 104 && Static230.anInt4239 < Static97.aStringArray10.length) {
				Static230.anInt4239++;
				Static196.method3386();
				Static545.anInt8786 = Static143.aString27.length();
			} else if (local133 == 105 && Static230.anInt4239 > 0) {
				Static230.anInt4239--;
				Static196.method3386();
				Static545.anInt8786 = Static143.aString27.length();
			} else if (Static152.method2683(local137) || local137 == '\\' || local137 == '/' || local137 == '.' || local137 == ':' || local137 == ',' || local137 == ' ' || local137 == '_' || local137 == '-' || local137 == '+' || local137 == '[' || local137 == ']') {
				Static143.aString27 = Static143.aString27.substring(0, Static545.anInt8786) + Static248.anInterface20Array3[local31].method7056() + Static143.aString27.substring(Static545.anInt8786);
				Static545.anInt8786++;
			}
		}
		Static413.anInt6940 = 0;
		Static206.anInt3998 = 0;
		Static569.method7932();
	}
}
