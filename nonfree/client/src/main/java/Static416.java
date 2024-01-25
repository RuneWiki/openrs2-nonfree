import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!up", name = "I", descriptor = "[Z")
	public static boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!up", name = "N", descriptor = "Lclient!wm;")
	public static final Class267 aClass267_78 = new Class267(260);

	@OriginalMember(owner = "client!up", name = "d", descriptor = "(I)V")
	public static void method5470() {
		if (Static93.anInt7570 != 0) {
			Static302.anInt5234 -= Static93.anInt7570 * 5;
			if (Static302.anInt5234 >= Static250.anInt4507) {
				Static302.anInt5234 = Static250.anInt4507 - 1;
			}
			if (Static302.anInt5234 < 0) {
				Static302.anInt5234 = 0;
			}
			Static93.anInt7570 = 0;
		}
		if (Static187.anInt3754 < 102) {
			Static187.anInt3754 += 6;
		}
		for (@Pc(49) int local49 = 0; local49 < Static35.anInt574; local49++) {
			@Pc(57) int local57 = Static121.aClass3Array1[local49].method3434();
			@Pc(63) char local63 = Static121.aClass3Array1[local49].method3429();
			if (local57 == 84) {
				Static145.method2444(false);
			}
			if (local57 == 80) {
				Static145.method2444(true);
			} else if (Static197.aClass245_1.method5907(82) && local57 == 66) {
				if (Static83.aClipboard1 != null) {
					@Pc(368) String local368 = "";
					for (@Pc(373) int local373 = Static80.aStringArray13.length - 1; local373 >= 0; local373--) {
						if (Static80.aStringArray13[local373] != null && Static80.aStringArray13[local373].length() > 0) {
							local368 = local368 + Static80.aStringArray13[local373] + '\n';
						}
					}
					Static83.aClipboard1.setContents(new StringSelection(local368), null);
				}
			} else if (Static197.aClass245_1.method5907(82) && local57 == 67) {
				if (Static83.aClipboard1 != null) {
					@Pc(309) Transferable local309 = Static83.aClipboard1.getContents(null);
					if (local309 != null) {
						try {
							@Pc(316) String local316 = (String) local309.getTransferData(DataFlavor.stringFlavor);
							if (local316 != null) {
								@Pc(323) String[] local323 = Static253.method3686('\n', local316);
								if (local323.length <= 1) {
									Static168.aString26 = Static168.aString26 + local316;
								} else {
									for (@Pc(342) int local342 = 0; local342 < local323.length; local342++) {
										Static168.aString26 = local323[local342];
										Static145.method2444(false);
									}
								}
							}
						} catch (@Pc(362) Exception local362) {
						}
					}
				}
			} else if (local57 == 85 && Static360.anInt6139 > 0) {
				Static168.aString26 = Static168.aString26.substring(0, Static360.anInt6139 - 1) + Static168.aString26.substring(Static360.anInt6139);
				Static360.anInt6139--;
			} else if (local57 == 101 && Static360.anInt6139 < Static168.aString26.length()) {
				Static168.aString26 = Static168.aString26.substring(0, Static360.anInt6139) + Static168.aString26.substring(Static360.anInt6139 + 1);
			} else if (local57 == 96 && Static360.anInt6139 > 0) {
				Static360.anInt6139--;
			} else if (local57 == 97 && Static360.anInt6139 < Static168.aString26.length()) {
				Static360.anInt6139++;
			} else if (local57 == 102) {
				Static360.anInt6139 = 0;
			} else if (local57 == 103) {
				Static360.anInt6139 = Static168.aString26.length();
			} else if (local57 == 104 && Static80.aStringArray13.length > Static84.anInt1815) {
				Static84.anInt1815++;
				Static217.method3301();
				Static360.anInt6139 = Static168.aString26.length();
			} else if (local57 == 105 && Static84.anInt1815 > 0) {
				Static84.anInt1815--;
				Static217.method3301();
				Static360.anInt6139 = Static168.aString26.length();
			} else if (Static70.method1359(local63) || local63 == ':' || local63 == ',' || local63 == ' ' || local63 == '_' || local63 == '-' || local63 == '+' || local63 == '[' || local63 == ']') {
				Static168.aString26 = Static168.aString26.substring(0, Static360.anInt6139) + Static121.aClass3Array1[local49].method3429() + Static168.aString26.substring(Static360.anInt6139);
				Static360.anInt6139++;
			}
		}
		Static35.anInt574 = 0;
		Static448.method5473();
	}
}
