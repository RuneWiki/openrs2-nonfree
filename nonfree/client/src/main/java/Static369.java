import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "[Lclient!ui;")
	public static Class333[] aClass333Array8;

	@OriginalMember(owner = "client!oe", name = "q", descriptor = "[I")
	public static int[] anIntArray565;

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "Z")
	public static boolean aBoolean674 = false;

	@OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
	public static int anInt9005 = 2;

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(Z)V")
	public static void method7305() {
		@Pc(10) Class207 local10 = Static580.aClass207_60;
		synchronized (Static580.aClass207_60) {
			Static580.aClass207_60.method4398();
		}
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)V")
	public static void method7309() {
		if (Static166.anInt7795 < 102) {
			Static166.anInt7795 += 6;
		}
		@Pc(22) int local22;
		if (Static174.anInt3255 != -1 && Static480.method6650() > Static78.aLong46) {
			for (local22 = Static174.anInt3255; local22 < Static401.aStringArray25.length; local22++) {
				if (Static401.aStringArray25[local22].startsWith("pause")) {
					@Pc(41) int local41 = 5;
					try {
						local41 = Integer.parseInt(Static401.aStringArray25[local22].substring(6));
					} catch (@Pc(50) Exception local50) {
					}
					Static415.method5896("Pausing for " + local41 + " seconds...");
					Static174.anInt3255 = local22 + 1;
					Static78.aLong46 = (long) (local41 * 1000) + Static480.method6650();
					return;
				}
				Static366.aString75 = Static401.aStringArray25[local22];
				Static253.method3715(false);
			}
			Static174.anInt3255 = -1;
		}
		if (Static415.anInt7330 != 0) {
			Static232.anInt4308 -= Static415.anInt7330 * 5;
			if (Static296.anInt5348 <= Static232.anInt4308) {
				Static232.anInt4308 = Static296.anInt5348 - 1;
			}
			if (Static232.anInt4308 < 0) {
				Static232.anInt4308 = 0;
			}
			Static415.anInt7330 = 0;
		}
		for (local22 = 0; local22 < Static149.anInt2839; local22++) {
			@Pc(117) Interface14 local117 = Static294.anInterface14Array2[local22];
			@Pc(121) int local121 = local117.method6440();
			@Pc(127) char local127 = local117.method6441();
			@Pc(131) int local131 = local117.method6442();
			if (local121 == 84) {
				Static253.method3715(false);
			}
			if (local121 == 80) {
				Static253.method3715(true);
			} else if (local121 == 66 && (local131 & 0x4) != 0) {
				if (Static375.aClipboard1 != null) {
					@Pc(158) String local158 = "";
					for (@Pc(163) int local163 = Static425.aStringArray26.length - 1; local163 >= 0; local163--) {
						if (Static425.aStringArray26[local163] != null && Static425.aStringArray26[local163].length() > 0) {
							local158 = local158 + Static425.aStringArray26[local163] + '\n';
						}
					}
					Static375.aClipboard1.setContents(new StringSelection(local158), null);
				}
			} else if (local121 == 67 && (local131 & 0x4) != 0) {
				if (Static375.aClipboard1 != null) {
					@Pc(435) Transferable local435 = Static375.aClipboard1.getContents(null);
					if (local435 != null) {
						try {
							@Pc(442) String local442 = (String) local435.getTransferData(DataFlavor.stringFlavor);
							if (local442 != null) {
								@Pc(449) String[] local449 = Static95.method1438(local442, '\n');
								Static94.method5764(local449);
							}
						} catch (@Pc(454) Exception local454) {
						}
					}
				}
			} else if (local121 == 85 && Static305.anInt5674 > 0) {
				Static366.aString75 = Static366.aString75.substring(0, Static305.anInt5674 - 1) + Static366.aString75.substring(Static305.anInt5674);
				Static305.anInt5674--;
			} else if (local121 == 101 && Static305.anInt5674 < Static366.aString75.length()) {
				Static366.aString75 = Static366.aString75.substring(0, Static305.anInt5674) + Static366.aString75.substring(Static305.anInt5674 + 1);
			} else if (local121 == 96 && Static305.anInt5674 > 0) {
				Static305.anInt5674--;
			} else if (local121 == 97 && Static305.anInt5674 < Static366.aString75.length()) {
				Static305.anInt5674++;
			} else if (local121 == 102) {
				Static305.anInt5674 = 0;
			} else if (local121 == 103) {
				Static305.anInt5674 = Static366.aString75.length();
			} else if (local121 == 104 && Static276.anInt5043 < Static425.aStringArray26.length) {
				Static276.anInt5043++;
				Static501.method7056();
				Static305.anInt5674 = Static366.aString75.length();
			} else if (local121 == 105 && Static276.anInt5043 > 0) {
				Static276.anInt5043--;
				Static501.method7056();
				Static305.anInt5674 = Static366.aString75.length();
			} else if (Static178.method2822(local127) || local127 == '\\' || local127 == '/' || local127 == '.' || local127 == ':' || local127 == ',' || local127 == ' ' || local127 == '_' || local127 == '-' || local127 == '+' || local127 == '[' || local127 == ']') {
				Static366.aString75 = Static366.aString75.substring(0, Static305.anInt5674) + Static294.anInterface14Array2[local22].method6441() + Static366.aString75.substring(Static305.anInt5674);
				Static305.anInt5674++;
			}
		}
		Static149.anInt2839 = 0;
		Static582.anInt9584 = 0;
		Static506.method7088();
	}
}
