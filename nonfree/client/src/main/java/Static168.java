import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!ie", name = "r", descriptor = "Lclient!o;")
	public static Class6 aClass6_31;

	@OriginalMember(owner = "client!ie", name = "s", descriptor = "Lclient!fo;")
	public static Class82 aClass82_44;

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
	public static int anInt2746 = -1;

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "Lclient!wq;")
	public static final Class269 aClass269_19 = new Class269(2, 14);

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_87 = new Class12(38, 10);

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
	public static void method2385() {
		if (Static61.anInt1467 < 102) {
			Static61.anInt1467 += 6;
		}
		if (Static208.anInt3611 != 0) {
			Static119.anInt2216 -= Static208.anInt3611 * 5;
			if (Static188.anInt3240 <= Static119.anInt2216) {
				Static119.anInt2216 = Static188.anInt3240 - 1;
			}
			Static208.anInt3611 = 0;
			if (Static119.anInt2216 < 0) {
				Static119.anInt2216 = 0;
			}
		}
		for (@Pc(47) int local47 = 0; local47 < Static324.anInt5556; local47++) {
			@Pc(55) int local55 = Static94.aClass128Array1[local47].method4778();
			@Pc(61) char local61 = Static94.aClass128Array1[local47].method4780();
			if (local55 == 84) {
				Static234.method3370(false);
			}
			if (local55 == 80) {
				Static234.method3370(true);
			} else if (Static160.aClass123_1.method2750(82) && local55 == 66) {
				if (Static187.aClipboard1 != null) {
					@Pc(86) String local86 = "";
					for (@Pc(91) int local91 = Static54.aStringArray8.length - 1; local91 >= 0; local91--) {
						if (Static54.aStringArray8[local91] != null && Static54.aStringArray8[local91].length() > 0) {
							local86 = local86 + Static54.aStringArray8[local91] + '\n';
						}
					}
					Static187.aClipboard1.setContents(new StringSelection(local86), null);
				}
			} else if (Static160.aClass123_1.method2750(82) && local55 == 67) {
				if (Static187.aClipboard1 != null) {
					@Pc(346) Transferable local346 = Static187.aClipboard1.getContents(null);
					if (local346 != null) {
						try {
							@Pc(353) String local353 = (String) local346.getTransferData(DataFlavor.stringFlavor);
							if (local353 != null) {
								@Pc(360) String[] local360 = Static192.method2761('\n', local353);
								if (local360.length > 1) {
									for (@Pc(368) int local368 = 0; local368 < local360.length; local368++) {
										Static335.aString64 = local360[local368];
										Static234.method3370(false);
									}
								} else {
									Static335.aString64 = Static335.aString64 + local353;
								}
							}
						} catch (@Pc(395) Exception local395) {
						}
					}
				}
			} else if (local55 == 85 && Static373.anInt6278 > 0) {
				Static335.aString64 = Static335.aString64.substring(0, Static373.anInt6278 - 1) + Static335.aString64.substring(Static373.anInt6278);
				Static373.anInt6278--;
			} else if (local55 == 101 && Static373.anInt6278 < Static335.aString64.length()) {
				Static335.aString64 = Static335.aString64.substring(0, Static373.anInt6278) + Static335.aString64.substring(Static373.anInt6278 + 1);
			} else if (local55 == 96 && Static373.anInt6278 > 0) {
				Static373.anInt6278--;
			} else if (local55 == 97 && Static373.anInt6278 < Static335.aString64.length()) {
				Static373.anInt6278++;
			} else if (local55 == 102) {
				Static373.anInt6278 = 0;
			} else if (local55 == 103) {
				Static373.anInt6278 = Static335.aString64.length();
			} else if (local55 == 104 && Static54.aStringArray8.length > Static38.anInt681) {
				Static38.anInt681++;
				Static364.method2859();
				Static373.anInt6278 = Static335.aString64.length();
			} else if (local55 == 105 && Static38.anInt681 > 0) {
				Static38.anInt681--;
				Static364.method2859();
				Static373.anInt6278 = Static335.aString64.length();
			} else if (Static257.method3680(local61) || local61 == ':' || local61 == ',' || local61 == ' ' || local61 == '_' || local61 == '-' || local61 == '+' || local61 == '[' || local61 == ']') {
				Static335.aString64 = Static335.aString64.substring(0, Static373.anInt6278) + Static94.aClass128Array1[local47].method4780() + Static335.aString64.substring(Static373.anInt6278);
				Static373.anInt6278++;
			}
		}
		Static324.anInt5556 = 0;
		Static65.method1072();
	}
}
