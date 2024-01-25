import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!jba", name = "I", descriptor = "[[Lclient!gfa;")
	public static Class9_Sub1[][] aClass9_Sub1ArrayArray2;

	@OriginalMember(owner = "client!jba", name = "z", descriptor = "Lclient!ju;")
	public static final Class173 aClass173_4 = new Class173("WTI", 5);

	@OriginalMember(owner = "client!jba", name = "C", descriptor = "[I")
	public static final int[] anIntArray362 = new int[500];

	@OriginalMember(owner = "client!jba", name = "D", descriptor = "[[I")
	public static final int[][] anIntArrayArray35 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!jba", name = "F", descriptor = "I")
	public static int anInt4498 = 0;

	@OriginalMember(owner = "client!jba", name = "H", descriptor = "Z")
	public static boolean aBoolean347 = false;

	@OriginalMember(owner = "client!jba", name = "f", descriptor = "(I)V")
	public static void method3993() {
		if (Static470.anInt7686 < 102) {
			Static470.anInt7686 += 6;
		}
		@Pc(30) int local30;
		if (Static49.anInt1062 != -1 && Static587.method7753() > Static79.aLong51) {
			for (local30 = Static49.anInt1062; local30 < Static155.aStringArray19.length; local30++) {
				if (Static155.aStringArray19[local30].startsWith("pause")) {
					@Pc(40) int local40 = 5;
					try {
						local40 = Integer.parseInt(Static155.aStringArray19[local30].substring(6));
					} catch (@Pc(49) Exception local49) {
					}
					Static369.method5492("Pausing for " + local40 + " seconds...");
					Static49.anInt1062 = local30 + 1;
					Static79.aLong51 = Static587.method7753() + (long) (local40 * 1000);
					return;
				}
				Static6.aString2 = Static155.aStringArray19[local30];
				Static30.method551(false);
			}
			Static49.anInt1062 = -1;
		}
		if (Static400.anInt6813 != 0) {
			Static442.anInt8541 -= Static400.anInt6813 * 5;
			if (Static536.anInt8399 <= Static442.anInt8541) {
				Static442.anInt8541 = Static536.anInt8399 - 1;
			}
			if (Static442.anInt8541 < 0) {
				Static442.anInt8541 = 0;
			}
			Static400.anInt6813 = 0;
		}
		for (local30 = 0; local30 < Static187.anInt3653; local30++) {
			@Pc(126) Interface16 local126 = Static400.anInterface16Array2[local30];
			@Pc(130) int local130 = local126.method5163();
			@Pc(134) char local134 = local126.method5162();
			@Pc(138) int local138 = local126.method5160();
			if (local130 == 84) {
				Static30.method551(false);
			}
			if (local130 == 80) {
				Static30.method551(true);
			} else if (local130 == 66 && (local138 & 0x4) != 0) {
				if (Static414.aClipboard1 != null) {
					@Pc(158) String local158 = "";
					for (@Pc(163) int local163 = Static190.aStringArray24.length - 1; local163 >= 0; local163--) {
						if (Static190.aStringArray24[local163] != null && Static190.aStringArray24[local163].length() > 0) {
							local158 = local158 + Static190.aStringArray24[local163] + '\n';
						}
					}
					Static414.aClipboard1.setContents(new StringSelection(local158), null);
				}
			} else if (local130 == 67 && (local138 & 0x4) != 0) {
				if (Static414.aClipboard1 != null) {
					@Pc(220) Transferable local220 = Static414.aClipboard1.getContents(null);
					if (local220 != null) {
						try {
							@Pc(227) String local227 = (String) local220.getTransferData(DataFlavor.stringFlavor);
							if (local227 != null) {
								@Pc(234) String[] local234 = Static583.method7710('\n', local227);
								if (local234.length > 1) {
									for (@Pc(242) int local242 = 0; local242 < local234.length; local242++) {
										if (local234[local242].startsWith("pause")) {
											@Pc(252) int local252 = 5;
											try {
												local252 = Integer.parseInt(local234[local242].substring(6));
											} catch (@Pc(261) Exception local261) {
											}
											Static369.method5492("Pausing for " + local252 + " seconds...");
											Static49.anInt1062 = local242 + 1;
											Static155.aStringArray19 = local234;
											Static79.aLong51 = Static587.method7753() + (long) (local252 * 1000);
											return;
										}
										Static6.aString2 = local234[local242];
										Static30.method551(false);
									}
								} else {
									Static6.aString2 = Static6.aString2 + local227;
								}
							}
						} catch (@Pc(319) Exception local319) {
						}
					}
				}
			} else if (local130 == 85 && Static186.anInt3605 > 0) {
				Static6.aString2 = Static6.aString2.substring(0, Static186.anInt3605 - 1) + Static6.aString2.substring(Static186.anInt3605);
				Static186.anInt3605--;
			} else if (local130 == 101 && Static186.anInt3605 < Static6.aString2.length()) {
				Static6.aString2 = Static6.aString2.substring(0, Static186.anInt3605) + Static6.aString2.substring(Static186.anInt3605 + 1);
			} else if (local130 == 96 && Static186.anInt3605 > 0) {
				Static186.anInt3605--;
			} else if (local130 == 97 && Static186.anInt3605 < Static6.aString2.length()) {
				Static186.anInt3605++;
			} else if (local130 == 102) {
				Static186.anInt3605 = 0;
			} else if (local130 == 103) {
				Static186.anInt3605 = Static6.aString2.length();
			} else if (local130 == 104 && Static190.aStringArray24.length > Static93.anInt2298) {
				Static93.anInt2298++;
				Static450.method6276();
				Static186.anInt3605 = Static6.aString2.length();
			} else if (local130 == 105 && Static93.anInt2298 > 0) {
				Static93.anInt2298--;
				Static450.method6276();
				Static186.anInt3605 = Static6.aString2.length();
			} else if (Static260.method4319(local134) || local134 == ':' || local134 == ',' || local134 == ' ' || local134 == '_' || local134 == '-' || local134 == '+' || local134 == '[' || local134 == ']') {
				Static6.aString2 = Static6.aString2.substring(0, Static186.anInt3605) + Static400.anInterface16Array2[local30].method5162() + Static6.aString2.substring(Static186.anInt3605);
				Static186.anInt3605++;
			}
		}
		Static187.anInt3653 = 0;
		Static235.anInt4454 = 0;
		Static121.method2508();
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Z)Z")
	public static boolean method3994() {
		@Pc(7) boolean local7 = true;
		if (Static515.aClass355_2 == null) {
			if (Static171.aClass246_84.method5667(Static310.anInt5605)) {
				Static515.aClass355_2 = Static606.method7597(Static171.aClass246_84, Static310.anInt5605);
			} else {
				local7 = false;
			}
		}
		if (Static293.aClass355_3 == null) {
			if (Static171.aClass246_84.method5667(Static58.anInt1410)) {
				Static293.aClass355_3 = Static606.method7597(Static171.aClass246_84, Static58.anInt1410);
			} else {
				local7 = false;
			}
		}
		if (Static332.aClass355_4 == null) {
			if (Static171.aClass246_84.method5667(Static2.anInt13)) {
				Static332.aClass355_4 = Static606.method7597(Static171.aClass246_84, Static2.anInt13);
			} else {
				local7 = false;
			}
		}
		if (Static228.aClass58_5 == null) {
			if (Static467.aClass246_221.method5667(Static334.anInt5950)) {
				Static228.aClass58_5 = Static213.method3761(Static334.anInt5950, Static467.aClass246_221);
			} else {
				local7 = false;
			}
		}
		if (Static349.aClass355Array1 == null) {
			if (Static171.aClass246_84.method5667(Static334.anInt5950)) {
				Static349.aClass355Array1 = Static606.method7589(Static171.aClass246_84, Static334.anInt5950);
			} else {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!jba", name = "g", descriptor = "(I)V")
	public static void method3995() {
		Static476.anInt8277 = 0;
		for (@Pc(14) int local14 = 0; local14 < 2048; local14++) {
			Static375.aClass3_Sub11Array1[local14] = null;
			Static203.aByteArray38[local14] = 1;
			Static250.aClass74Array1[local14] = null;
		}
	}
}
