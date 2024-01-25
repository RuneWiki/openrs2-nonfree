import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!aca", name = "P", descriptor = "Lclient!ae;")
	public static Class8 aClass8_1;

	@OriginalMember(owner = "client!aca", name = "S", descriptor = "I")
	public static int anInt161 = 0;

	@OriginalMember(owner = "client!aca", name = "g", descriptor = "(I)V")
	public static void method173() {
		Static552.anInt9275 = -1;
		Static566.anInt9418 = -1;
		Static426.anInt7557 = 0;
		Static508.anInt9992 = -1;
	}

	@OriginalMember(owner = "client!aca", name = "b", descriptor = "(ZII)Z")
	public static boolean method174(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) boolean local22 = (arg0 & 0x37) == 0 ? Static454.method6568(arg1, arg0) : Static385.method5488(arg1, arg0);
		return local22 | Static76.method1319(arg1, arg0) | (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!aca", name = "f", descriptor = "(B)V")
	public static void method175() {
		if (anInt161 < 102) {
			anInt161 += 6;
		}
		@Pc(29) int local29;
		if (Static418.anInt7264 != -1 && Static566.method7936() > Static666.aLong308) {
			for (local29 = Static418.anInt7264; local29 < Static61.aStringArray11.length; local29++) {
				if (Static61.aStringArray11[local29].startsWith("pause")) {
					@Pc(39) int local39 = 5;
					try {
						local39 = Integer.parseInt(Static61.aStringArray11[local29].substring(6));
					} catch (@Pc(48) Exception local48) {
					}
					Static67.method1187("Pausing for " + local39 + " seconds...");
					Static418.anInt7264 = local29 + 1;
					Static666.aLong308 = Static566.method7936() + (long) (local39 * 1000);
					return;
				}
				Static330.aString6 = Static61.aStringArray11[local29];
				Static52.method1006(false);
			}
			Static418.anInt7264 = -1;
		}
		if (Static551.anInt8500 != 0) {
			Static22.anInt521 -= Static551.anInt8500 * 5;
			if (Static22.anInt521 >= Static567.anInt9420) {
				Static22.anInt521 = Static567.anInt9420 - 1;
			}
			Static551.anInt8500 = 0;
			if (Static22.anInt521 < 0) {
				Static22.anInt521 = 0;
			}
		}
		for (local29 = 0; local29 < Static473.anInt8160; local29++) {
			@Pc(124) Interface20 local124 = Static649.anInterface20Array2[local29];
			@Pc(128) int local128 = local124.method1560();
			@Pc(132) char local132 = local124.method1557();
			@Pc(136) int local136 = local124.method1556();
			if (local128 == 84) {
				Static52.method1006(false);
			}
			if (local128 == 80) {
				Static52.method1006(true);
			} else if (local128 == 66 && (local136 & 0x4) != 0) {
				if (Static280.aClipboard1 != null) {
					@Pc(419) String local419 = "";
					for (@Pc(424) int local424 = Static241.aStringArray30.length - 1; local424 >= 0; local424--) {
						if (Static241.aStringArray30[local424] != null && Static241.aStringArray30[local424].length() > 0) {
							local419 = local419 + Static241.aStringArray30[local424] + '\n';
						}
					}
					Static280.aClipboard1.setContents(new StringSelection(local419), (ClipboardOwner) null);
				}
			} else if (local128 == 67 && (local136 & 0x4) != 0) {
				if (Static280.aClipboard1 != null) {
					@Pc(175) Transferable local175 = Static280.aClipboard1.getContents((Object) null);
					if (local175 != null) {
						try {
							@Pc(182) String local182 = (String) local175.getTransferData(DataFlavor.stringFlavor);
							if (local182 != null) {
								@Pc(189) String[] local189 = Static635.method8720(local182, '\n');
								Static596.method8231(local189);
							}
						} catch (@Pc(194) Exception local194) {
						}
					}
				}
			} else if (local128 == 85 && Static241.anInt4292 > 0) {
				Static330.aString6 = Static330.aString6.substring(0, Static241.anInt4292 - 1) + Static330.aString6.substring(Static241.anInt4292);
				Static241.anInt4292--;
			} else if (local128 == 101 && Static241.anInt4292 < Static330.aString6.length()) {
				Static330.aString6 = Static330.aString6.substring(0, Static241.anInt4292) + Static330.aString6.substring(Static241.anInt4292 + 1);
			} else if (local128 == 96 && Static241.anInt4292 > 0) {
				Static241.anInt4292--;
			} else if (local128 == 97 && Static241.anInt4292 < Static330.aString6.length()) {
				Static241.anInt4292++;
			} else if (local128 == 102) {
				Static241.anInt4292 = 0;
			} else if (local128 == 103) {
				Static241.anInt4292 = Static330.aString6.length();
			} else if (local128 == 104 && Static241.aStringArray30.length > Static145.anInt2483) {
				Static145.anInt2483++;
				Static378.method6994();
				Static241.anInt4292 = Static330.aString6.length();
			} else if (local128 == 105 && Static145.anInt2483 > 0) {
				Static145.anInt2483--;
				Static378.method6994();
				Static241.anInt4292 = Static330.aString6.length();
			} else if (Static418.method6243(local132) || local132 == '\' || local132 == '/' || local132 == '.' || local132 == ':' || local132 == ',' || local132 == ' ' || local132 == '_' || local132 == '-' || local132 == '+' || local132 == '[' || local132 == ']') {
				Static330.aString6 = Static330.aString6.substring(0, Static241.anInt4292) + Static649.anInterface20Array2[local29].method1557() + Static330.aString6.substring(Static241.anInt4292);
				Static241.anInt4292++;
			}
		}
		Static482.anInt8256 = 0;
		Static473.anInt8160 = 0;
		Static509.method7248();
	}
}
