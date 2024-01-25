import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!kaa", name = "f", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_106 = new Class136(97, 20);

	@OriginalMember(owner = "client!kaa", name = "h", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_107 = new Class136(64, 6);

	@OriginalMember(owner = "client!kaa", name = "i", descriptor = "I")
	public static int anInt4536 = 0;

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "(I)V")
	public static void method4155() {
		if (Static109.anInt1732 < 102) {
			Static109.anInt1732 += 6;
		}
		@Pc(26) int local26;
		if (Static227.anInt3951 != -1 && Static205.method3179() > Static88.aLong56) {
			for (local26 = Static227.anInt3951; local26 < Static318.aStringArray21.length; local26++) {
				if (Static318.aStringArray21[local26].startsWith("pause")) {
					@Pc(36) int local36 = 5;
					try {
						local36 = Integer.parseInt(Static318.aStringArray21[local26].substring(6));
					} catch (@Pc(45) Exception local45) {
					}
					Static177.method2690("Pausing for " + local36 + " seconds...");
					Static227.anInt3951 = local26 + 1;
					Static88.aLong56 = (long) (local36 * 1000) + Static205.method3179();
					return;
				}
				Static1.aString102 = Static318.aStringArray21[local26];
				Static204.method3173(false);
			}
			Static227.anInt3951 = -1;
		}
		if (Static565.anInt9287 != 0) {
			Static64.anInt1040 -= Static565.anInt9287 * 5;
			if (Static496.anInt8473 <= Static64.anInt1040) {
				Static64.anInt1040 = Static496.anInt8473 - 1;
			}
			Static565.anInt9287 = 0;
			if (Static64.anInt1040 < 0) {
				Static64.anInt1040 = 0;
			}
		}
		for (local26 = 0; local26 < Static451.anInt7590; local26++) {
			@Pc(128) Interface24 local128 = Static451.anInterface24Array4[local26];
			@Pc(134) int local134 = local128.method5143();
			@Pc(138) char local138 = local128.method5144();
			@Pc(142) int local142 = local128.method5142();
			if (local134 == 84) {
				Static204.method3173(false);
			}
			if (local134 == 80) {
				Static204.method3173(true);
			} else if (local134 == 66 && (local142 & 0x4) != 0) {
				if (Static177.aClipboard1 != null) {
					@Pc(414) String local414 = "";
					for (@Pc(419) int local419 = Static276.aStringArray39.length - 1; local419 >= 0; local419--) {
						if (Static276.aStringArray39[local419] != null && Static276.aStringArray39[local419].length() > 0) {
							local414 = local414 + Static276.aStringArray39[local419] + '\n';
						}
					}
					Static177.aClipboard1.setContents(new StringSelection(local414), (ClipboardOwner) null);
				}
			} else if (local134 == 67 && (local142 & 0x4) != 0) {
				if (Static177.aClipboard1 != null) {
					@Pc(387) Transferable local387 = Static177.aClipboard1.getContents((Object) null);
					if (local387 != null) {
						try {
							@Pc(394) String local394 = (String) local387.getTransferData(DataFlavor.stringFlavor);
							if (local394 != null) {
								@Pc(403) String[] local403 = Static132.method1987(local394, '\n');
								Static205.method3177(local403);
							}
						} catch (@Pc(408) Exception local408) {
						}
					}
				}
			} else if (local134 == 85 && Static237.anInt4012 > 0) {
				Static1.aString102 = Static1.aString102.substring(0, Static237.anInt4012 - 1) + Static1.aString102.substring(Static237.anInt4012);
				Static237.anInt4012--;
			} else if (local134 == 101 && Static237.anInt4012 < Static1.aString102.length()) {
				Static1.aString102 = Static1.aString102.substring(0, Static237.anInt4012) + Static1.aString102.substring(Static237.anInt4012 + 1);
			} else if (local134 == 96 && Static237.anInt4012 > 0) {
				Static237.anInt4012--;
			} else if (local134 == 97 && Static237.anInt4012 < Static1.aString102.length()) {
				Static237.anInt4012++;
			} else if (local134 == 102) {
				Static237.anInt4012 = 0;
			} else if (local134 == 103) {
				Static237.anInt4012 = Static1.aString102.length();
			} else if (local134 == 104 && Static214.anInt3694 < Static276.aStringArray39.length) {
				Static214.anInt3694++;
				Static444.method6595();
				Static237.anInt4012 = Static1.aString102.length();
			} else if (local134 == 105 && Static214.anInt3694 > 0) {
				Static214.anInt3694--;
				Static444.method6595();
				Static237.anInt4012 = Static1.aString102.length();
			} else if (Static233.method6787(local138) || local138 == '\\' || local138 == '/' || local138 == '.' || local138 == ':' || local138 == ',' || local138 == ' ' || local138 == '_' || local138 == '-' || local138 == '+' || local138 == '[' || local138 == ']') {
				Static1.aString102 = Static1.aString102.substring(0, Static237.anInt4012) + Static451.anInterface24Array4[local26].method5144() + Static1.aString102.substring(Static237.anInt4012);
				Static237.anInt4012++;
			}
		}
		Static626.anInt10210 = 0;
		Static451.anInt7590 = 0;
		Static101.method1476();
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(B)Z")
	public static boolean method4156() {
		try {
			return Static322.method4996();
		} catch (@Pc(15) IOException local15) {
			Static18.method449();
			return true;
		} catch (@Pc(20) Exception local20) {
			@Pc(78) String local78 = "T2 - " + (Static86.aClass136_37 == null ? -1 : Static86.aClass136_37.method3174()) + "," + (Static102.aClass136_43 == null ? -1 : Static102.aClass136_43.method3174()) + "," + (Static612.aClass136_191 == null ? -1 : Static612.aClass136_191.method3174()) + " - " + Static60.anInt3115 + "," + (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anIntArray253[0] + Static113.anInt1785) + "," + (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anIntArray252[0] + Static622.anInt10087) + " - ";
			for (@Pc(80) int local80 = 0; local80 < Static60.anInt3115 && local80 < 50; local80++) {
				local78 = local78 + Static167.aClass5_Sub12_Sub2_1.aByteArray104[local80] + ",";
			}
			Static280.method4194(local78, local20);
			Static268.method4076(false);
			return true;
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ILclient!wu;II)Lclient!ur;")
	public static Class349 method4157(@OriginalArg(1) Class384 arg0, @OriginalArg(3) int arg1) {
		@Pc(9) byte[] local9 = arg0.method8885(arg1, 0);
		return local9 == null ? null : new Class349(local9);
	}
}
