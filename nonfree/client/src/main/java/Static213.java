import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!kp", name = "H", descriptor = "I")
	public static int anInt3954;

	@OriginalMember(owner = "client!kp", name = "J", descriptor = "I")
	public static int anInt3956 = 0;

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "(B)V")
	public static void method3223() {
		if (Static259.anInt4882 < 102) {
			Static259.anInt4882 += 6;
		}
		if (Static430.anInt3862 != 0) {
			Static167.anInt3231 -= Static430.anInt3862 * 5;
			if (Static93.anInt1881 <= Static167.anInt3231) {
				Static167.anInt3231 = Static93.anInt1881 - 1;
			}
			Static430.anInt3862 = 0;
			if (Static167.anInt3231 < 0) {
				Static167.anInt3231 = 0;
			}
		}
		for (@Pc(44) int local44 = 0; local44 < Static190.anInt3602; local44++) {
			@Pc(52) int local52 = Static164.aClass30Array4[local44].method746();
			@Pc(58) char local58 = Static164.aClass30Array4[local44].method749();
			if (local52 == 84) {
				Static62.method997();
			} else if (Static384.aClass244_1.method5489(82) && local52 == 66) {
				if (Static348.aClipboard1 != null) {
					@Pc(73) String local73 = "";
					for (@Pc(78) int local78 = Static102.aStringArray8.length - 1; local78 >= 0; local78--) {
						if (Static102.aStringArray8[local78] != null && Static102.aStringArray8[local78].length() > 0) {
							local73 = local73 + Static102.aStringArray8[local78] + '\n';
						}
					}
					Static348.aClipboard1.setContents(new StringSelection(local73), null);
				}
			} else if (Static384.aClass244_1.method5489(82) && local52 == 67) {
				if (Static348.aClipboard1 != null) {
					@Pc(343) Transferable local343 = Static348.aClipboard1.getContents(null);
					if (local343 != null) {
						try {
							@Pc(350) String local350 = (String) local343.getTransferData(DataFlavor.stringFlavor);
							if (local350 != null) {
								@Pc(357) String[] local357 = Static113.method2058(local350, '\n');
								if (local357.length <= 1) {
									Static117.aString29 = Static117.aString29 + local350;
								} else {
									for (@Pc(374) int local374 = 0; local374 < local357.length; local374++) {
										Static117.aString29 = local357[local374];
										Static62.method997();
									}
								}
							}
						} catch (@Pc(393) Exception local393) {
						}
					}
				}
			} else if (local52 == 85 && Static238.anInt4511 > 0) {
				Static117.aString29 = Static117.aString29.substring(0, Static238.anInt4511 - 1) + Static117.aString29.substring(Static238.anInt4511);
				Static238.anInt4511--;
			} else if (local52 == 101 && Static238.anInt4511 < Static117.aString29.length()) {
				Static117.aString29 = Static117.aString29.substring(0, Static238.anInt4511) + Static117.aString29.substring(Static238.anInt4511 + 1);
			} else if (local52 == 96 && Static238.anInt4511 > 0) {
				Static238.anInt4511--;
			} else if (local52 == 97 && Static238.anInt4511 < Static117.aString29.length()) {
				Static238.anInt4511++;
			} else if (local52 == 102) {
				Static238.anInt4511 = 0;
			} else if (local52 == 103) {
				Static238.anInt4511 = Static117.aString29.length();
			} else if (local52 == 104 && Static109.anInt6887 < Static102.aStringArray8.length) {
				Static109.anInt6887++;
				Static455.method4270();
				Static238.anInt4511 = Static117.aString29.length();
			} else if (local52 == 105 && Static109.anInt6887 > 0) {
				Static109.anInt6887--;
				Static455.method4270();
				Static238.anInt4511 = Static117.aString29.length();
			} else if (Static218.method3280(local58) || local58 == ':' || local58 == ',' || local58 == ' ' || local58 == '_' || local58 == '-' || local58 == '+' || local58 == '[' || local58 == ']') {
				Static117.aString29 = Static117.aString29.substring(0, Static238.anInt4511) + Static164.aClass30Array4[local44].method749() + Static117.aString29.substring(Static238.anInt4511);
				Static238.anInt4511++;
			}
		}
		Static190.anInt3602 = 0;
		Static369.method4940();
	}
}
