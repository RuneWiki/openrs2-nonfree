import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static567 {

	@OriginalMember(owner = "client!tca", name = "u", descriptor = "I")
	public static int anInt5908 = 0;

	@OriginalMember(owner = "client!tca", name = "v", descriptor = "I")
	public static int anInt5909 = 0;

	@OriginalMember(owner = "client!tca", name = "w", descriptor = "[I")
	public static final int[] anIntArray520 = new int[5];

	@OriginalMember(owner = "client!tca", name = "z", descriptor = "I")
	public static int anInt5912 = 0;

	@OriginalMember(owner = "client!tca", name = "A", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_90 = new Class218(57, -1);

	@OriginalMember(owner = "client!tca", name = "C", descriptor = "I")
	public static final int anInt5914 = 0;

	@OriginalMember(owner = "client!tca", name = "L", descriptor = "I")
	public static int anInt5923 = -1;

	@OriginalMember(owner = "client!tca", name = "M", descriptor = "I")
	public static int anInt5924 = 0;

	@OriginalMember(owner = "client!tca", name = "g", descriptor = "(B)V")
	public static void method5367() {
		if (Static165.anInt10047 < 102) {
			Static165.anInt10047 += 6;
		}
		@Pc(47) int local47;
		if (Static438.anInt6924 != -1 && Static524.method7320() > Static657.aLong305) {
			for (@Pc(28) int local28 = Static438.anInt6924; local28 < Static216.aStringArray11.length; local28++) {
				if (Static216.aStringArray11[local28].startsWith("pause")) {
					local47 = 5;
					try {
						local47 = Integer.parseInt(Static216.aStringArray11[local28].substring(6));
					} catch (@Pc(56) Exception local56) {
					}
					Static238.method4024("Pausing for " + local47 + " seconds...");
					Static438.anInt6924 = local28 + 1;
					Static657.aLong305 = (long) (local47 * 1000) + Static524.method7320();
					return;
				}
				Static153.aString28 = Static216.aStringArray11[local28];
				Static462.method6720(false);
			}
			Static438.anInt6924 = -1;
		}
		if (Static71.anInt1338 != 0) {
			Static449.anInt7419 -= Static71.anInt1338 * 5;
			if (Static643.anInt10191 <= Static449.anInt7419) {
				Static449.anInt7419 = Static643.anInt10191 - 1;
			}
			Static71.anInt1338 = 0;
			if (Static449.anInt7419 < 0) {
				Static449.anInt7419 = 0;
			}
		}
		for (local47 = 0; local47 < Static434.anInt6889; local47++) {
			@Pc(131) Interface22 local131 = Static198.anInterface22Array34[local47];
			@Pc(135) int local135 = local131.method7005();
			@Pc(139) char local139 = local131.method7006();
			@Pc(143) int local143 = local131.method7003();
			if (local135 == 84) {
				Static462.method6720(false);
			}
			if (local135 == 80) {
				Static462.method6720(true);
			} else if (local135 == 66 && (local143 & 0x4) != 0) {
				if (Static611.aClipboard1 != null) {
					@Pc(172) String local172 = "";
					for (@Pc(177) int local177 = Static605.aStringArray33.length - 1; local177 >= 0; local177--) {
						if (Static605.aStringArray33[local177] != null && Static605.aStringArray33[local177].length() > 0) {
							local172 = local172 + Static605.aStringArray33[local177] + '\n';
						}
					}
					Static611.aClipboard1.setContents(new StringSelection(local172), (ClipboardOwner) null);
				}
			} else if (local135 == 67 && (local143 & 0x4) != 0) {
				if (Static611.aClipboard1 != null) {
					@Pc(408) Transferable local408 = Static611.aClipboard1.getContents((Object) null);
					if (local408 != null) {
						try {
							@Pc(415) String local415 = (String) local408.getTransferData(DataFlavor.stringFlavor);
							if (local415 != null) {
								@Pc(422) String[] local422 = Static644.method8957(local415, '\n');
								Static451.method6589(local422);
							}
						} catch (@Pc(427) Exception local427) {
						}
					}
				}
			} else if (local135 == 85 && Static369.anInt5956 > 0) {
				Static153.aString28 = Static153.aString28.substring(0, Static369.anInt5956 - 1) + Static153.aString28.substring(Static369.anInt5956);
				Static369.anInt5956--;
			} else if (local135 == 101 && Static369.anInt5956 < Static153.aString28.length()) {
				Static153.aString28 = Static153.aString28.substring(0, Static369.anInt5956) + Static153.aString28.substring(Static369.anInt5956 + 1);
			} else if (local135 == 96 && Static369.anInt5956 > 0) {
				Static369.anInt5956--;
			} else if (local135 == 97 && Static369.anInt5956 < Static153.aString28.length()) {
				Static369.anInt5956++;
			} else if (local135 == 102) {
				Static369.anInt5956 = 0;
			} else if (local135 == 103) {
				Static369.anInt5956 = Static153.aString28.length();
			} else if (local135 == 104 && Static66.anInt1306 < Static605.aStringArray33.length) {
				Static66.anInt1306++;
				Static246.method4105();
				Static369.anInt5956 = Static153.aString28.length();
			} else if (local135 == 105 && Static66.anInt1306 > 0) {
				Static66.anInt1306--;
				Static246.method4105();
				Static369.anInt5956 = Static153.aString28.length();
			} else if (Static460.method6705(local139) || "\\/.:, _-+[]~@".indexOf(local139) != -1) {
				Static153.aString28 = Static153.aString28.substring(0, Static369.anInt5956) + Static198.anInterface22Array34[local47].method7006() + Static153.aString28.substring(Static369.anInt5956);
				Static369.anInt5956++;
			}
		}
		Static434.anInt6889 = 0;
		Static664.anInt10591 = 0;
		Static540.method7765();
	}

	@OriginalMember(owner = "client!tca", name = "h", descriptor = "(B)V")
	public static void method5369() throws Exception_Sub1 {
		if (Static76.anInt1404 == 1) {
			Static316.aClass13_10.method8484(Static125.anInt2572, Static485.anInt8031);
		} else {
			Static316.aClass13_10.method8484(0, 0);
		}
	}
}
