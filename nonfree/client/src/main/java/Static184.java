import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "I")
	public static int anInt3902;

	@OriginalMember(owner = "client!kp", name = "A", descriptor = "I")
	public static int anInt3912;

	@OriginalMember(owner = "client!kp", name = "E", descriptor = "Z")
	public static boolean aBoolean280 = false;

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method3406(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static139.anInt2976 >= 100 && !Static294.aBoolean401 || Static139.anInt2976 >= 200) {
			Static79.method1369(Static231.aClass62_163.method1389(Static200.anInt4144));
			return;
		}
		@Pc(33) String local33 = Static287.method4731(arg0);
		if (local33 == null) {
			return;
		}
		@Pc(76) String local76;
		for (@Pc(38) int local38 = 0; local38 < Static139.anInt2976; local38++) {
			@Pc(46) String local46 = Static287.method4731(Static30.aStringArray6[local38]);
			if (local46 != null && local46.equals(local33)) {
				Static79.method1369(arg0 + Static84.aClass62_57.method1389(Static200.anInt4144));
				return;
			}
			if (Static288.aStringArray29[local38] != null) {
				local76 = Static287.method4731(Static288.aStringArray29[local38]);
				if (local76 != null && local76.equals(local33)) {
					Static79.method1369(arg0 + Static84.aClass62_57.method1389(Static200.anInt4144));
					return;
				}
			}
		}
		for (@Pc(102) int local102 = 0; local102 < Static158.anInt3256; local102++) {
			local76 = Static287.method4731(Static45.aStringArray37[local102]);
			if (local76 != null && local76.equals(local33)) {
				Static79.method1369(Static80.aClass62_54.method1389(Static200.anInt4144) + arg0 + Static125.aClass62_93.method1389(Static200.anInt4144));
				return;
			}
			if (Static134.aStringArray14[local102] != null) {
				@Pc(145) String local145 = Static287.method4731(Static134.aStringArray14[local102]);
				if (local145 != null && local145.equals(local33)) {
					Static79.method1369(Static80.aClass62_54.method1389(Static200.anInt4144) + arg0 + Static125.aClass62_93.method1389(Static200.anInt4144));
					return;
				}
			}
		}
		if (Static287.method4731(Static182.aClass1_Sub2_Sub1_Sub1_1.aString12).equals(local33)) {
			Static79.method1369(Static63.aClass62_43.method1389(Static200.anInt4144));
		} else {
			Static77.method1332(Static89.aClass183_25);
			Static76.aClass2_Sub24_Sub2_7.method5746(Static305.method6026(arg0));
			Static76.aClass2_Sub24_Sub2_7.method5772(arg0);
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Z)V")
	public static void method3413() {
		if (Static64.anInt1440 < 102) {
			Static64.anInt1440 += 6;
		}
		if (Static256.anInt4912 != 0) {
			Static372.anInt6826 -= Static256.anInt4912 * 5;
			if (Static372.anInt6826 >= Static195.anInt4058) {
				Static372.anInt6826 = Static195.anInt4058 - 1;
			}
			if (Static372.anInt6826 < 0) {
				Static372.anInt6826 = 0;
			}
			Static256.anInt4912 = 0;
		}
		@Pc(54) int local54;
		for (@Pc(46) int local46 = 0; local46 < Static154.anInt3218; local46++) {
			local54 = Static286.aClass13Array1[local46].method122();
			@Pc(60) char local60 = Static286.aClass13Array1[local46].method120();
			if (local54 == 84) {
				Static336.method5411();
			} else if (Static68.aClass98_1.method4517(82) && local54 == 66) {
				if (Static42.aClipboard1 != null) {
					@Pc(83) String local83 = "";
					for (@Pc(88) int local88 = Static389.aStringArray45.length - 1; local88 >= 0; local88--) {
						if (Static389.aStringArray45[local88] != null && Static389.aStringArray45[local88].length() > 0) {
							local83 = local83 + Static389.aStringArray45[local88] + '\n';
						}
					}
					Static42.aClipboard1.setContents(new StringSelection(local83), null);
				}
			} else if (Static68.aClass98_1.method4517(82) && local54 == 67) {
				if (Static42.aClipboard1 != null) {
					@Pc(143) Transferable local143 = Static42.aClipboard1.getContents(null);
					if (local143 != null) {
						try {
							@Pc(150) String local150 = (String) local143.getTransferData(DataFlavor.stringFlavor);
							if (local150 != null) {
								@Pc(157) String[] local157 = Static71.method1265(local150, '\n');
								if (local157.length <= 1) {
									Static231.aString41 = Static231.aString41 + local150;
								} else {
									for (@Pc(176) int local176 = 0; local176 < local157.length; local176++) {
										Static231.aString41 = local157[local176];
										Static336.method5411();
									}
								}
							}
						} catch (@Pc(191) Exception local191) {
						}
					}
				}
			} else if (local54 == 85 && Static174.anInt3548 > 0) {
				Static231.aString41 = Static231.aString41.substring(0, Static174.anInt3548 - 1) + Static231.aString41.substring(Static174.anInt3548);
				Static174.anInt3548--;
			} else if (local54 == 101 && Static174.anInt3548 < Static231.aString41.length()) {
				Static231.aString41 = Static231.aString41.substring(0, Static174.anInt3548) + Static231.aString41.substring(Static174.anInt3548 + 1);
			} else if (local54 == 96 && Static174.anInt3548 > 0) {
				Static174.anInt3548--;
			} else if (local54 == 97 && Static174.anInt3548 < Static231.aString41.length()) {
				Static174.anInt3548++;
			} else if (local54 == 102) {
				Static174.anInt3548 = 0;
			} else if (local54 == 103) {
				Static174.anInt3548 = Static231.aString41.length();
			} else if (local54 == 104 && Static389.aStringArray45.length > Static329.anInt6063) {
				Static329.anInt6063++;
				Static261.method4484();
				Static174.anInt3548 = Static231.aString41.length();
			} else if (local54 == 105 && Static329.anInt6063 > 0) {
				Static329.anInt6063--;
				Static261.method4484();
				Static174.anInt3548 = Static231.aString41.length();
			} else if (Static212.method3827(local60) || local60 == ':' || local60 == ',' || local60 == ' ' || local60 == '_' || local60 == '-' || local60 == '+' || local60 == '[' || local60 == ']') {
				Static231.aString41 = Static231.aString41.substring(0, Static174.anInt3548) + Static286.aClass13Array1[local46].method120() + Static231.aString41.substring(Static174.anInt3548);
				Static174.anInt3548++;
			}
		}
		Static154.anInt3218 = 0;
		for (local54 = 0; local54 < 100; local54++) {
			@Pc(415) int local415;
			if (Static97.aBooleanArray11[local54]) {
				local415 = Static183.anIntArray292[local54]++;
				if (Static183.anIntArray292[local54] > 102) {
					Static97.aBooleanArray11[local54] = false;
				}
			} else {
				local415 = Static183.anIntArray292[local54]--;
				if (Static183.anIntArray292[local54] < 0) {
					Static313.anIntArray502[local54] = (int) (Math.random() * (double) Static7.anInt157);
					Static212.anIntArray312[local54] = (int) (Math.random() * 350.0D);
					Static183.anIntArray292[local54] = 0;
					Static97.aBooleanArray11[local54] = true;
				}
			}
		}
		Static59.method899();
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method3416(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
