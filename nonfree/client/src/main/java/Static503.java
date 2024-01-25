import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static503 {

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "Lclient!aba;")
	public static final Class4 aClass4_8 = new Class4();

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)V")
	public static void method7465() {
		if (Static61.anInt1462 < 102) {
			Static61.anInt1462 += 6;
		}
		if (Static157.anInt3415 != 0) {
			Static380.anInt7651 -= Static157.anInt3415 * 5;
			if (Static380.anInt7651 >= Static118.anInt2734) {
				Static380.anInt7651 = Static118.anInt2734 - 1;
			}
			Static157.anInt3415 = 0;
			if (Static380.anInt7651 < 0) {
				Static380.anInt7651 = 0;
			}
		}
		for (@Pc(40) int local40 = 0; local40 < Static162.anInt3760; local40++) {
			@Pc(46) Interface1 local46 = Static259.anInterface1Array2[local40];
			@Pc(50) int local50 = local46.method6638();
			@Pc(54) char local54 = local46.method6642();
			@Pc(60) int local60 = local46.method6641();
			if (local50 == 84) {
				Static279.method4637(false);
			}
			if (local50 == 80) {
				Static279.method4637(true);
			} else if (local50 == 66 && (local60 & 0x4) != 0) {
				if (Static178.aClipboard1 != null) {
					@Pc(82) String local82 = "";
					for (@Pc(87) int local87 = Static255.aStringArray29.length - 1; local87 >= 0; local87--) {
						if (Static255.aStringArray29[local87] != null && Static255.aStringArray29[local87].length() > 0) {
							local82 = local82 + Static255.aStringArray29[local87] + '\n';
						}
					}
					Static178.aClipboard1.setContents(new StringSelection(local82), null);
				}
			} else if (local50 == 67 && (local60 & 0x4) != 0) {
				if (Static178.aClipboard1 != null) {
					@Pc(347) Transferable local347 = Static178.aClipboard1.getContents(null);
					if (local347 != null) {
						try {
							@Pc(354) String local354 = (String) local347.getTransferData(DataFlavor.stringFlavor);
							if (local354 != null) {
								@Pc(361) String[] local361 = Static434.method6610(local354, '\n');
								if (local361.length <= 1) {
									Static21.aString93 = Static21.aString93 + local354;
								} else {
									for (@Pc(378) int local378 = 0; local378 < local361.length; local378++) {
										Static21.aString93 = local361[local378];
										Static279.method4637(false);
									}
								}
							}
						} catch (@Pc(400) Exception local400) {
						}
					}
				}
			} else if (local50 == 85 && Static465.anInt8475 > 0) {
				Static21.aString93 = Static21.aString93.substring(0, Static465.anInt8475 - 1) + Static21.aString93.substring(Static465.anInt8475);
				Static465.anInt8475--;
			} else if (local50 == 101 && Static465.anInt8475 < Static21.aString93.length()) {
				Static21.aString93 = Static21.aString93.substring(0, Static465.anInt8475) + Static21.aString93.substring(Static465.anInt8475 + 1);
			} else if (local50 == 96 && Static465.anInt8475 > 0) {
				Static465.anInt8475--;
			} else if (local50 == 97 && Static465.anInt8475 < Static21.aString93.length()) {
				Static465.anInt8475++;
			} else if (local50 == 102) {
				Static465.anInt8475 = 0;
			} else if (local50 == 103) {
				Static465.anInt8475 = Static21.aString93.length();
			} else if (local50 == 104 && Static255.aStringArray29.length > Static535.anInt9522) {
				Static535.anInt9522++;
				Static485.method7248();
				Static465.anInt8475 = Static21.aString93.length();
			} else if (local50 == 105 && Static535.anInt9522 > 0) {
				Static535.anInt9522--;
				Static485.method7248();
				Static465.anInt8475 = Static21.aString93.length();
			} else if (Static153.method3044(local54) || local54 == ':' || local54 == ',' || local54 == ' ' || local54 == '_' || local54 == '-' || local54 == '+' || local54 == '[' || local54 == ']') {
				Static21.aString93 = Static21.aString93.substring(0, Static465.anInt8475) + Static259.anInterface1Array2[local40].method6642() + Static21.aString93.substring(Static465.anInt8475);
				Static465.anInt8475++;
			}
		}
		Static162.anInt3760 = 0;
		Static445.method6725();
	}
}
