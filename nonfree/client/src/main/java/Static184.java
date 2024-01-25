import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!gha", name = "c", descriptor = "F")
	public static float aFloat50;

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "Lclient!jf;")
	public static final Class168 aClass168_4 = new Class168(7, 19);

	@OriginalMember(owner = "client!gha", name = "e", descriptor = "Lclient!jf;")
	public static final Class168 aClass168_5 = new Class168(2, 3);

	@OriginalMember(owner = "client!gha", name = "f", descriptor = "I")
	public static final int anInt3169 = Static418.method5598(1600);

	@OriginalMember(owner = "client!gha", name = "h", descriptor = "Z")
	public static boolean aBoolean231 = true;

	@OriginalMember(owner = "client!gha", name = "c", descriptor = "(I)V")
	public static void method2684() {
		if (Static617.anInt9937 < 102) {
			Static617.anInt9937 += 6;
		}
		@Pc(29) int local29;
		if (Static610.anInt9840 != -1 && Static476.method6413() > Static289.aLong129) {
			for (local29 = Static610.anInt9840; local29 < Static230.aStringArray19.length; local29++) {
				if (Static230.aStringArray19[local29].startsWith("pause")) {
					@Pc(39) int local39 = 5;
					try {
						local39 = Integer.parseInt(Static230.aStringArray19[local29].substring(6));
					} catch (@Pc(48) Exception local48) {
					}
					Static338.method4547("Pausing for " + local39 + " seconds...");
					Static610.anInt9840 = local29 + 1;
					Static289.aLong129 = (long) (local39 * 1000) + Static476.method6413();
					return;
				}
				Static61.aString13 = Static230.aStringArray19[local29];
				Static490.method6839(false);
			}
			Static610.anInt9840 = -1;
		}
		if (Static487.anInt8042 != 0) {
			Static16.anInt222 -= Static487.anInt8042 * 5;
			if (Static16.anInt222 >= Static294.anInt4813) {
				Static16.anInt222 = Static294.anInt4813 - 1;
			}
			Static487.anInt8042 = 0;
			if (Static16.anInt222 < 0) {
				Static16.anInt222 = 0;
			}
		}
		for (local29 = 0; local29 < Static427.anInt6728; local29++) {
			@Pc(127) Interface22 local127 = Static587.anInterface22Array1[local29];
			@Pc(133) int local133 = local127.method5223();
			@Pc(137) char local137 = local127.method5226();
			@Pc(141) int local141 = local127.method5227();
			if (local133 == 84) {
				Static490.method6839(false);
			}
			if (local133 == 80) {
				Static490.method6839(true);
			} else if (local133 == 66 && (local141 & 0x4) != 0) {
				if (Static486.aClipboard1 != null) {
					@Pc(170) String local170 = "";
					for (@Pc(175) int local175 = Static397.aStringArray34.length - 1; local175 >= 0; local175--) {
						if (Static397.aStringArray34[local175] != null && Static397.aStringArray34[local175].length() > 0) {
							local170 = local170 + Static397.aStringArray34[local175] + '\n';
						}
					}
					Static486.aClipboard1.setContents(new StringSelection(local170), null);
				}
			} else if (local133 == 67 && (local141 & 0x4) != 0) {
				if (Static486.aClipboard1 != null) {
					@Pc(428) Transferable local428 = Static486.aClipboard1.getContents(null);
					if (local428 != null) {
						try {
							@Pc(435) String local435 = (String) local428.getTransferData(DataFlavor.stringFlavor);
							if (local435 != null) {
								@Pc(442) String[] local442 = Static17.method249(local435, '\n');
								Static71.method1000(local442);
							}
						} catch (@Pc(447) Exception local447) {
						}
					}
				}
			} else if (local133 == 85 && Static553.anInt9045 > 0) {
				Static61.aString13 = Static61.aString13.substring(0, Static553.anInt9045 - 1) + Static61.aString13.substring(Static553.anInt9045);
				Static553.anInt9045--;
			} else if (local133 == 101 && Static553.anInt9045 < Static61.aString13.length()) {
				Static61.aString13 = Static61.aString13.substring(0, Static553.anInt9045) + Static61.aString13.substring(Static553.anInt9045 + 1);
			} else if (local133 == 96 && Static553.anInt9045 > 0) {
				Static553.anInt9045--;
			} else if (local133 == 97 && Static553.anInt9045 < Static61.aString13.length()) {
				Static553.anInt9045++;
			} else if (local133 == 102) {
				Static553.anInt9045 = 0;
			} else if (local133 == 103) {
				Static553.anInt9045 = Static61.aString13.length();
			} else if (local133 == 104 && Static397.aStringArray34.length > Static329.anInt5228) {
				Static329.anInt5228++;
				Static255.method3527();
				Static553.anInt9045 = Static61.aString13.length();
			} else if (local133 == 105 && Static329.anInt5228 > 0) {
				Static329.anInt5228--;
				Static255.method3527();
				Static553.anInt9045 = Static61.aString13.length();
			} else if (Static644.method8649(local137) || local137 == '\\' || local137 == '/' || local137 == '.' || local137 == ':' || local137 == ',' || local137 == ' ' || local137 == '_' || local137 == '-' || local137 == '+' || local137 == '[' || local137 == ']') {
				Static61.aString13 = Static61.aString13.substring(0, Static553.anInt9045) + Static587.anInterface22Array1[local29].method5226() + Static61.aString13.substring(Static553.anInt9045);
				Static553.anInt9045++;
			}
		}
		Static427.anInt6728 = 0;
		Static131.anInt10170 = 0;
		Static32.method574();
	}
}
