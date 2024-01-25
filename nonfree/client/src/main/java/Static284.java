import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!lu", name = "x", descriptor = "[B")
	public static byte[] aByteArray74;

	@OriginalMember(owner = "client!lu", name = "W", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_81 = new Class252(42, 16);

	@OriginalMember(owner = "client!lu", name = "Db", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_83 = new Class45("green:", "grün:", "vert:", "verde:");

	@OriginalMember(owner = "client!lu", name = "Eb", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_269 = new Class305(22, -1);

	@OriginalMember(owner = "client!lu", name = "Fb", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_82 = new Class252(44, 2);

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)V")
	public static void method4982() {
		if (Static143.anInt2848 < 102) {
			Static143.anInt2848 += 6;
		}
		if (Static372.anInt6690 != 0) {
			Static30.anInt788 -= Static372.anInt6690 * 5;
			if (Static151.anInt5204 <= Static30.anInt788) {
				Static30.anInt788 = Static151.anInt5204 - 1;
			}
			if (Static30.anInt788 < 0) {
				Static30.anInt788 = 0;
			}
			Static372.anInt6690 = 0;
		}
		for (@Pc(51) int local51 = 0; local51 < Static354.anInt6464; local51++) {
			@Pc(57) Interface18 local57 = Static463.anInterface18Array2[local51];
			@Pc(61) int local61 = local57.method3596();
			@Pc(65) char local65 = local57.method3594();
			@Pc(69) int local69 = local57.method3597();
			if (local61 == 84) {
				Static523.method7973(false);
			}
			if (local61 == 80) {
				Static523.method7973(true);
			} else if (local61 == 66 && (local69 & 0x4) != 0) {
				if (Static305.aClipboard1 != null) {
					@Pc(367) String local367 = "";
					for (@Pc(372) int local372 = Static379.aStringArray32.length - 1; local372 >= 0; local372--) {
						if (Static379.aStringArray32[local372] != null && Static379.aStringArray32[local372].length() > 0) {
							local367 = local367 + Static379.aStringArray32[local372] + '\n';
						}
					}
					Static305.aClipboard1.setContents(new StringSelection(local367), null);
				}
			} else if (local61 == 67 && (local69 & 0x4) != 0) {
				if (Static305.aClipboard1 != null) {
					@Pc(308) Transferable local308 = Static305.aClipboard1.getContents(null);
					if (local308 != null) {
						try {
							@Pc(315) String local315 = (String) local308.getTransferData(DataFlavor.stringFlavor);
							if (local315 != null) {
								@Pc(322) String[] local322 = Static340.method5715(local315, '\n');
								if (local322.length <= 1) {
									Static231.aString101 = Static231.aString101 + local315;
								} else {
									for (@Pc(341) int local341 = 0; local341 < local322.length; local341++) {
										Static231.aString101 = local322[local341];
										Static523.method7973(false);
									}
								}
							}
						} catch (@Pc(361) Exception local361) {
						}
					}
				}
			} else if (local61 == 85 && Static140.anInt2804 > 0) {
				Static231.aString101 = Static231.aString101.substring(0, Static140.anInt2804 - 1) + Static231.aString101.substring(Static140.anInt2804);
				Static140.anInt2804--;
			} else if (local61 == 101 && Static140.anInt2804 < Static231.aString101.length()) {
				Static231.aString101 = Static231.aString101.substring(0, Static140.anInt2804) + Static231.aString101.substring(Static140.anInt2804 + 1);
			} else if (local61 == 96 && Static140.anInt2804 > 0) {
				Static140.anInt2804--;
			} else if (local61 == 97 && Static140.anInt2804 < Static231.aString101.length()) {
				Static140.anInt2804++;
			} else if (local61 == 102) {
				Static140.anInt2804 = 0;
			} else if (local61 == 103) {
				Static140.anInt2804 = Static231.aString101.length();
			} else if (local61 == 104 && Static379.aStringArray32.length > Static441.anInt7708) {
				Static441.anInt7708++;
				Static516.method7898();
				Static140.anInt2804 = Static231.aString101.length();
			} else if (local61 == 105 && Static441.anInt7708 > 0) {
				Static441.anInt7708--;
				Static516.method7898();
				Static140.anInt2804 = Static231.aString101.length();
			} else if (Static141.method2642(local65) || local65 == ':' || local65 == ',' || local65 == ' ' || local65 == '_' || local65 == '-' || local65 == '+' || local65 == '[' || local65 == ']') {
				Static231.aString101 = Static231.aString101.substring(0, Static140.anInt2804) + Static463.anInterface18Array2[local51].method3594() + Static231.aString101.substring(Static140.anInt2804);
				Static140.anInt2804++;
			}
		}
		Static354.anInt6464 = 0;
		Static402.method6385();
	}
}
