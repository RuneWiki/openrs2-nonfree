import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!c", name = "g", descriptor = "Lclient!ak;")
	public static Class14 aClass14_1;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "I")
	public static int anInt991;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "I")
	public static int anInt992;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V")
	public static void method830() {
		if (Static209.anInt3960 < 102) {
			Static209.anInt3960 += 6;
		}
		if (Static502.anInt8744 != 0) {
			Static446.anInt7893 -= Static502.anInt8744 * 5;
			if (Static446.anInt7893 >= Static112.anInt1887) {
				Static446.anInt7893 = Static112.anInt1887 - 1;
			}
			if (Static446.anInt7893 < 0) {
				Static446.anInt7893 = 0;
			}
			Static502.anInt8744 = 0;
		}
		for (@Pc(43) int local43 = 0; local43 < Static459.anInt8079; local43++) {
			@Pc(49) Interface5 local49 = Static80.anInterface5Array1[local43];
			@Pc(55) int local55 = local49.method6889();
			@Pc(59) char local59 = local49.method6890();
			@Pc(63) int local63 = local49.method6891();
			if (local55 == 84) {
				Static258.method3976(false);
			}
			if (local55 == 80) {
				Static258.method3976(true);
			} else if (local55 == 66 && (local63 & 0x4) != 0) {
				if (Static503.aClipboard1 != null) {
					@Pc(93) String local93 = "";
					for (@Pc(98) int local98 = Static415.aStringArray33.length - 1; local98 >= 0; local98--) {
						if (Static415.aStringArray33[local98] != null && Static415.aStringArray33[local98].length() > 0) {
							local93 = local93 + Static415.aStringArray33[local98] + '\n';
						}
					}
					Static503.aClipboard1.setContents(new StringSelection(local93), null);
				}
			} else if (local55 == 67 && (local63 & 0x4) != 0) {
				if (Static503.aClipboard1 != null) {
					@Pc(360) Transferable local360 = Static503.aClipboard1.getContents(null);
					if (local360 != null) {
						try {
							@Pc(367) String local367 = (String) local360.getTransferData(DataFlavor.stringFlavor);
							if (local367 != null) {
								@Pc(374) String[] local374 = Static395.method5728(local367, '\n');
								if (local374.length > 1) {
									for (@Pc(380) int local380 = 0; local380 < local374.length; local380++) {
										Static232.aString91 = local374[local380];
										Static258.method3976(false);
									}
								} else {
									Static232.aString91 = Static232.aString91 + local367;
								}
							}
						} catch (@Pc(411) Exception local411) {
						}
					}
				}
			} else if (local55 == 85 && Static116.anInt1995 > 0) {
				Static232.aString91 = Static232.aString91.substring(0, Static116.anInt1995 - 1) + Static232.aString91.substring(Static116.anInt1995);
				Static116.anInt1995--;
			} else if (local55 == 101 && Static116.anInt1995 < Static232.aString91.length()) {
				Static232.aString91 = Static232.aString91.substring(0, Static116.anInt1995) + Static232.aString91.substring(Static116.anInt1995 + 1);
			} else if (local55 == 96 && Static116.anInt1995 > 0) {
				Static116.anInt1995--;
			} else if (local55 == 97 && Static116.anInt1995 < Static232.aString91.length()) {
				Static116.anInt1995++;
			} else if (local55 == 102) {
				Static116.anInt1995 = 0;
			} else if (local55 == 103) {
				Static116.anInt1995 = Static232.aString91.length();
			} else if (local55 == 104 && Static568.anInt9823 < Static415.aStringArray33.length) {
				Static568.anInt9823++;
				Static346.method5047();
				Static116.anInt1995 = Static232.aString91.length();
			} else if (local55 == 105 && Static568.anInt9823 > 0) {
				Static568.anInt9823--;
				Static346.method5047();
				Static116.anInt1995 = Static232.aString91.length();
			} else if (Static524.method7200(local59) || local59 == ':' || local59 == ',' || local59 == ' ' || local59 == '_' || local59 == '-' || local59 == '+' || local59 == '[' || local59 == ']') {
				Static232.aString91 = Static232.aString91.substring(0, Static116.anInt1995) + Static80.anInterface5Array1[local43].method6890() + Static232.aString91.substring(Static116.anInt1995);
				Static116.anInt1995++;
			}
		}
		Static21.anInt380 = 0;
		Static459.anInt8079 = 0;
		Static39.method645();
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(BI)I")
	public static int method832(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
