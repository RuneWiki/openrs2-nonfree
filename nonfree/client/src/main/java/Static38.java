import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!cg", name = "I", descriptor = "Lclient!bs;")
	public static Class26 aClass26_3;

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "(I)V")
	public static void method655() {
		if (Static214.anInt3932 < 102) {
			Static214.anInt3932 += 6;
		}
		@Pc(25) int local25;
		for (@Pc(14) int local14 = 0; local14 < Static210.anInt3833; local14++) {
			local25 = Static60.anIntArray125[local14];
			@Pc(30) char local30 = (char) Static323.anIntArray680[local14];
			if (local25 == 84) {
				Static124.method2455();
			} else if (Static354.aBooleanArray30[82] && local25 == 66) {
				if (Static204.aClipboard1 != null) {
					@Pc(200) String local200 = "";
					for (@Pc(205) int local205 = Static223.aStringArray29.length - 1; local205 >= 0; local205--) {
						if (Static223.aStringArray29[local205] != null && Static223.aStringArray29[local205].length() > 0) {
							local200 = local200 + Static223.aStringArray29[local205] + '\n';
						}
					}
					Static204.aClipboard1.setContents(new StringSelection(local200), null);
				}
			} else if (Static354.aBooleanArray30[82] && local25 == 67) {
				if (Static204.aClipboard1 != null) {
					@Pc(53) Transferable local53 = Static204.aClipboard1.getContents(null);
					if (local53 != null) {
						try {
							@Pc(60) String local60 = (String) local53.getTransferData(DataFlavor.stringFlavor);
							if (local60 != null) {
								@Pc(67) String[] local67 = Static194.method3611(local60, '\n');
								if (local67.length <= 1) {
									Static105.aString73 = Static105.aString73 + local60;
								} else {
									for (@Pc(86) int local86 = 0; local86 < local67.length; local86++) {
										Static105.aString73 = local67[local86];
										Static124.method2455();
									}
								}
							}
						} catch (@Pc(105) Exception local105) {
						}
					}
				}
			} else if (local25 == 85 && Static105.aString73.length() > 0) {
				Static105.aString73 = Static105.aString73.substring(0, Static105.aString73.length() - 1);
			} else if (local25 == 104 && Static292.anInt5503 < Static223.aStringArray29.length) {
				Static292.anInt5503++;
				Static216.method3850();
			} else if (local25 == 105 && Static292.anInt5503 > 0) {
				Static292.anInt5503--;
				Static216.method3850();
			} else if (Static28.method475(local30) || local30 == ',' || local30 == ' ' || local30 == '_' || local30 == '-' || local30 == '+') {
				Static105.aString73 = Static105.aString73 + (char) Static323.anIntArray680[local14];
			}
		}
		Static210.anInt3833 = 0;
		for (local25 = 0; local25 < 100; local25++) {
			@Pc(268) int local268;
			if (Static20.aBooleanArray3[local25]) {
				local268 = Static299.anIntArray639[local25]++;
				if (Static299.anIntArray639[local25] > 102) {
					Static20.aBooleanArray3[local25] = false;
				}
			} else {
				local268 = Static299.anIntArray639[local25]--;
				if (Static299.anIntArray639[local25] < 0) {
					Static98.anIntArray255[local25] = (int) ((double) Static209.anInt3815 * Math.random());
					Static241.anIntArray669[local25] = (int) (Math.random() * 350.0D);
					Static299.anIntArray639[local25] = 0;
					Static20.aBooleanArray3[local25] = true;
				}
			}
		}
		Static205.method5709();
	}

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "(I)V")
	public static void method663() {
		Static81.aClass132ArrayArray1 = new Class132[Static99.aClass53_153.method1003()][];
		Static69.aBooleanArray6 = new boolean[Static99.aClass53_153.method1003()];
	}
}
