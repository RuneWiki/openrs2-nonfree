import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!on", name = "g", descriptor = "Lclient!rh;")
	public static Class6_Sub18_Sub4 aClass6_Sub18_Sub4_2;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_101 = new Class47(68, -1);

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V")
	public static void method5573() {
		if (Static330.anInt6006 != 0) {
			Static259.anInt5052 -= Static330.anInt6006 * 5;
			if (Static351.anInt9535 <= Static259.anInt5052) {
				Static259.anInt5052 = Static351.anInt9535 - 1;
			}
			if (Static259.anInt5052 < 0) {
				Static259.anInt5052 = 0;
			}
			Static330.anInt6006 = 0;
		}
		if (Static61.anInt1278 < 102) {
			Static61.anInt1278 += 6;
		}
		for (@Pc(49) int local49 = 0; local49 < Static21.anInt685; local49++) {
			@Pc(55) Interface8 local55 = Static551.anInterface8Array2[local49];
			@Pc(59) int local59 = local55.method1038();
			@Pc(65) char local65 = local55.method1040();
			@Pc(69) int local69 = local55.method1041();
			if (local59 == 84) {
				Static514.method7115(false);
			}
			if (local59 == 80) {
				Static514.method7115(true);
			} else if (local59 == 66 && (local69 & 0x4) != 0) {
				if (Static249.aClipboard1 != null) {
					@Pc(96) String local96 = "";
					for (@Pc(101) int local101 = Static272.aStringArray17.length - 1; local101 >= 0; local101--) {
						if (Static272.aStringArray17[local101] != null && Static272.aStringArray17[local101].length() > 0) {
							local96 = local96 + Static272.aStringArray17[local101] + '\n';
						}
					}
					Static249.aClipboard1.setContents(new StringSelection(local96), null);
				}
			} else if (local59 == 67 && (local69 & 0x4) != 0) {
				if (Static249.aClipboard1 != null) {
					@Pc(357) Transferable local357 = Static249.aClipboard1.getContents(null);
					if (local357 != null) {
						try {
							@Pc(364) String local364 = (String) local357.getTransferData(DataFlavor.stringFlavor);
							if (local364 != null) {
								@Pc(371) String[] local371 = Static115.method2011('\n', local364);
								if (local371.length > 1) {
									for (@Pc(377) int local377 = 0; local377 < local371.length; local377++) {
										Static342.aString46 = local371[local377];
										Static514.method7115(false);
									}
								} else {
									Static342.aString46 = Static342.aString46 + local364;
								}
							}
						} catch (@Pc(404) Exception local404) {
						}
					}
				}
			} else if (local59 == 85 && Static400.anInt7014 > 0) {
				Static342.aString46 = Static342.aString46.substring(0, Static400.anInt7014 - 1) + Static342.aString46.substring(Static400.anInt7014);
				Static400.anInt7014--;
			} else if (local59 == 101 && Static400.anInt7014 < Static342.aString46.length()) {
				Static342.aString46 = Static342.aString46.substring(0, Static400.anInt7014) + Static342.aString46.substring(Static400.anInt7014 + 1);
			} else if (local59 == 96 && Static400.anInt7014 > 0) {
				Static400.anInt7014--;
			} else if (local59 == 97 && Static400.anInt7014 < Static342.aString46.length()) {
				Static400.anInt7014++;
			} else if (local59 == 102) {
				Static400.anInt7014 = 0;
			} else if (local59 == 103) {
				Static400.anInt7014 = Static342.aString46.length();
			} else if (local59 == 104 && Static162.anInt3371 < Static272.aStringArray17.length) {
				Static162.anInt3371++;
				Static109.method1943();
				Static400.anInt7014 = Static342.aString46.length();
			} else if (local59 == 105 && Static162.anInt3371 > 0) {
				Static162.anInt3371--;
				Static109.method1943();
				Static400.anInt7014 = Static342.aString46.length();
			} else if (Static503.method6799(local65) || local65 == ':' || local65 == ',' || local65 == ' ' || local65 == '_' || local65 == '-' || local65 == '+' || local65 == '[' || local65 == ']') {
				Static342.aString46 = Static342.aString46.substring(0, Static400.anInt7014) + Static551.anInterface8Array2[local49].method1040() + Static342.aString46.substring(Static400.anInt7014);
				Static400.anInt7014++;
			}
		}
		Static21.anInt685 = 0;
		Static86.anInt1717 = 0;
		Static415.method7746();
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(II)I")
	public static int method5575(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)V")
	public static void method5576() {
		Static228.aClass94_3.method2646();
	}
}
