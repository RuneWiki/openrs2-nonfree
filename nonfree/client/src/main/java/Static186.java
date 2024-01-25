import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!gm", name = "v", descriptor = "Lclient!gaa;")
	public static Class108 aClass108_6;

	@OriginalMember(owner = "client!gm", name = "m", descriptor = "I")
	public static int anInt4404 = 0;

	@OriginalMember(owner = "client!gm", name = "r", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray17 = new String[8];

	@OriginalMember(owner = "client!gm", name = "x", descriptor = "I")
	public static int anInt4413 = 0;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(BI)V")
	public static void method3746(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static251.anInt5581 = arg0;
		Static425.aClass2_Sub2Array3 = new Class2_Sub2[Static394.anIntArray467[Static251.anInt5581] + 1];
		Static206.anInt6643 = 0;
		Static224.anInt5126 = 0;
	}

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "(I)V")
	public static void method3749() {
		if (Static149.anInt3689 < 102) {
			Static149.anInt3689 += 6;
		}
		@Pc(24) int local24;
		if (Static257.anInt5674 != -1 && Static444.method6719() > Static297.aLong143) {
			for (local24 = Static257.anInt5674; local24 < Static306.aStringArray23.length; local24++) {
				if (Static306.aStringArray23[local24].startsWith("pause")) {
					@Pc(43) int local43 = 5;
					try {
						local43 = Integer.parseInt(Static306.aStringArray23[local24].substring(6));
					} catch (@Pc(52) Exception local52) {
					}
					Static117.method2792("Pausing for " + local43 + " seconds...");
					Static257.anInt5674 = local24 + 1;
					Static297.aLong143 = Static444.method6719() + (long) (local43 * 1000);
					return;
				}
				Static197.aString45 = Static306.aStringArray23[local24];
				Static200.method3947(false);
			}
			Static257.anInt5674 = -1;
		}
		if (Static305.anInt6116 != 0) {
			Static558.anInt9506 -= Static305.anInt6116 * 5;
			if (Static558.anInt9506 >= Static30.anInt576) {
				Static558.anInt9506 = Static30.anInt576 - 1;
			}
			Static305.anInt6116 = 0;
			if (Static558.anInt9506 < 0) {
				Static558.anInt9506 = 0;
			}
		}
		for (local24 = 0; local24 < Static343.anInt6755; local24++) {
			@Pc(124) Interface13 local124 = Static124.anInterface13Array1[local24];
			@Pc(128) int local128 = local124.method749();
			@Pc(132) char local132 = local124.method745();
			@Pc(136) int local136 = local124.method747();
			if (local128 == 84) {
				Static200.method3947(false);
			}
			if (local128 == 80) {
				Static200.method3947(true);
			} else if (local128 == 66 && (local136 & 0x4) != 0) {
				if (Static425.aClipboard3 != null) {
					@Pc(424) String local424 = "";
					for (@Pc(429) int local429 = Static457.aStringArray34.length - 1; local429 >= 0; local429--) {
						if (Static457.aStringArray34[local429] != null && Static457.aStringArray34[local429].length() > 0) {
							local424 = local424 + Static457.aStringArray34[local429] + '\n';
						}
					}
					Static425.aClipboard3.setContents(new StringSelection(local424), null);
				}
			} else if (local128 == 67 && (local136 & 0x4) != 0) {
				if (Static425.aClipboard3 != null) {
					@Pc(172) Transferable local172 = Static425.aClipboard3.getContents(null);
					if (local172 != null) {
						try {
							@Pc(179) String local179 = (String) local172.getTransferData(DataFlavor.stringFlavor);
							if (local179 != null) {
								@Pc(186) String[] local186 = Static107.method2685('\n', local179);
								Static497.method7262(local186);
							}
						} catch (@Pc(191) Exception local191) {
						}
					}
				}
			} else if (local128 == 85 && Static230.anInt5186 > 0) {
				Static197.aString45 = Static197.aString45.substring(0, Static230.anInt5186 - 1) + Static197.aString45.substring(Static230.anInt5186);
				Static230.anInt5186--;
			} else if (local128 == 101 && Static230.anInt5186 < Static197.aString45.length()) {
				Static197.aString45 = Static197.aString45.substring(0, Static230.anInt5186) + Static197.aString45.substring(Static230.anInt5186 + 1);
			} else if (local128 == 96 && Static230.anInt5186 > 0) {
				Static230.anInt5186--;
			} else if (local128 == 97 && Static230.anInt5186 < Static197.aString45.length()) {
				Static230.anInt5186++;
			} else if (local128 == 102) {
				Static230.anInt5186 = 0;
			} else if (local128 == 103) {
				Static230.anInt5186 = Static197.aString45.length();
			} else if (local128 == 104 && anInt4413 < Static457.aStringArray34.length) {
				anInt4413++;
				Static644.method8651();
				Static230.anInt5186 = Static197.aString45.length();
			} else if (local128 == 105 && anInt4413 > 0) {
				anInt4413--;
				Static644.method8651();
				Static230.anInt5186 = Static197.aString45.length();
			} else if (Static127.method2908(local132) || local132 == '\\' || local132 == '/' || local132 == '.' || local132 == ':' || local132 == ',' || local132 == ' ' || local132 == '_' || local132 == '-' || local132 == '+' || local132 == '[' || local132 == ']') {
				Static197.aString45 = Static197.aString45.substring(0, Static230.anInt5186) + Static124.anInterface13Array1[local24].method745() + Static197.aString45.substring(Static230.anInt5186);
				Static230.anInt5186++;
			}
		}
		Static324.anInt6510 = 0;
		Static343.anInt6755 = 0;
		Static594.method8139();
	}
}
