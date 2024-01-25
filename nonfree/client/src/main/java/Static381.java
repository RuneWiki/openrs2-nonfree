import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "Lclient!qs;")
	public static Class211 aClass211_84;

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
	public static int anInt7477;

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "Lclient!pu;")
	public static final Class203 aClass203_50 = new Class203();

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "Z")
	public static boolean aBoolean481 = false;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BBLclient!ch;II)V")
	public static void method5709(@OriginalArg(2) Class30_Sub1_Sub1_Sub2 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(8) int local8 = arg0.anIntArray130[0];
		@Pc(13) int local13 = arg0.anIntArray129[0];
		if (local8 < 0 || Static209.anInt4283 <= local8 || local13 < 0 || Static211.anInt4295 <= local13 || (arg2 < 0 || arg2 >= Static209.anInt4283 || arg1 < 0 || Static211.anInt4295 <= arg1)) {
			return;
		}
		@Pc(72) int local72 = Static267.method3957(0, arg1, -4, arg2, Static114.anIntArray278, Static19.aClass120Array1[arg0.aByte102], local8, local13, 0, arg0.method944(), 0, true, Static313.anIntArray547, 0);
		if (local72 >= 1 && local72 <= 3) {
			for (@Pc(82) int local82 = 0; local82 < local72 - 1; local82++) {
				arg0.method966((byte) 2, Static313.anIntArray547[local82], Static114.anIntArray278[local82]);
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V")
	public static void method5711() {
		if (Static333.anInt6107 < 102) {
			Static333.anInt6107 += 6;
		}
		if (Static24.anInt605 != 0) {
			Static32.anInt888 -= Static24.anInt605 * 5;
			if (Static453.anInt7924 <= Static32.anInt888) {
				Static32.anInt888 = Static453.anInt7924 - 1;
			}
			Static24.anInt605 = 0;
			if (Static32.anInt888 < 0) {
				Static32.anInt888 = 0;
			}
		}
		for (@Pc(41) int local41 = 0; local41 < Static119.anInt2647; local41++) {
			@Pc(49) int local49 = Static400.aClass113Array1[local41].method5051();
			@Pc(55) char local55 = Static400.aClass113Array1[local41].method5049();
			if (local49 == 84) {
				Static359.method5067(false);
			}
			if (local49 == 80) {
				Static359.method5067(true);
			} else if (Static414.aClass48_1.method1119(82) && local49 == 66) {
				if (Static431.aClipboard1 != null) {
					@Pc(76) String local76 = "";
					for (@Pc(81) int local81 = Static38.aStringArray6.length - 1; local81 >= 0; local81--) {
						if (Static38.aStringArray6[local81] != null && Static38.aStringArray6[local81].length() > 0) {
							local76 = local76 + Static38.aStringArray6[local81] + '\n';
						}
					}
					Static431.aClipboard1.setContents(new StringSelection(local76), null);
				}
			} else if (Static414.aClass48_1.method1119(82) && local49 == 67) {
				if (Static431.aClipboard1 != null) {
					@Pc(134) Transferable local134 = Static431.aClipboard1.getContents(null);
					if (local134 != null) {
						try {
							@Pc(141) String local141 = (String) local134.getTransferData(DataFlavor.stringFlavor);
							if (local141 != null) {
								@Pc(148) String[] local148 = Static117.method1928('\n', local141);
								if (local148.length <= 1) {
									Static72.aString16 = Static72.aString16 + local141;
								} else {
									for (@Pc(167) int local167 = 0; local167 < local148.length; local167++) {
										Static72.aString16 = local148[local167];
										Static359.method5067(false);
									}
								}
							}
						} catch (@Pc(183) Exception local183) {
						}
					}
				}
			} else if (local49 == 85 && Static392.anInt7118 > 0) {
				Static72.aString16 = Static72.aString16.substring(0, Static392.anInt7118 - 1) + Static72.aString16.substring(Static392.anInt7118);
				Static392.anInt7118--;
			} else if (local49 == 101 && Static392.anInt7118 < Static72.aString16.length()) {
				Static72.aString16 = Static72.aString16.substring(0, Static392.anInt7118) + Static72.aString16.substring(Static392.anInt7118 + 1);
			} else if (local49 == 96 && Static392.anInt7118 > 0) {
				Static392.anInt7118--;
			} else if (local49 == 97 && Static392.anInt7118 < Static72.aString16.length()) {
				Static392.anInt7118++;
			} else if (local49 == 102) {
				Static392.anInt7118 = 0;
			} else if (local49 == 103) {
				Static392.anInt7118 = Static72.aString16.length();
			} else if (local49 == 104 && Static257.anInt5000 < Static38.aStringArray6.length) {
				Static257.anInt5000++;
				Static392.method5434();
				Static392.anInt7118 = Static72.aString16.length();
			} else if (local49 == 105 && Static257.anInt5000 > 0) {
				Static257.anInt5000--;
				Static392.method5434();
				Static392.anInt7118 = Static72.aString16.length();
			} else if (Static267.method3958(local55) || local55 == ':' || local55 == ',' || local55 == ' ' || local55 == '_' || local55 == '-' || local55 == '+' || local55 == '[' || local55 == ']') {
				Static72.aString16 = Static72.aString16.substring(0, Static392.anInt7118) + Static400.aClass113Array1[local41].method5049() + Static72.aString16.substring(Static392.anInt7118);
				Static392.anInt7118++;
			}
		}
		Static119.anInt2647 = 0;
		Static179.method3014();
	}
}
