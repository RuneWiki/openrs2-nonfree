import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(B[BIIII)V")
	public static void method6948(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		arg2 += arg3;
		@Pc(20) int local20 = arg1 - arg3 >> 2;
		while (true) {
			local20--;
			if (local20 < 0) {
				local20 = arg1 - arg3 & 0x3;
				while (true) {
					local20--;
					if (local20 < 0) {
						return;
					}
					arg0[arg2++] = 1;
				}
			}
			@Pc(25) int local25 = arg2 + 1;
			arg0[arg2] = 1;
			@Pc(30) int local30 = local25 + 1;
			arg0[local25] = 1;
			@Pc(35) int local35 = local30 + 1;
			arg0[local30] = 1;
			arg2 = local35 + 1;
			arg0[local35] = 1;
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "([BIILjava/io/File;)V")
	public static void method6949(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) File arg2) throws IOException {
		@Pc(19) DataInputStream local19 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));
		try {
			local19.readFully(arg0, 0, arg1);
		} catch (@Pc(26) EOFException local26) {
		}
		local19.close();
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)V")
	public static void method6950() {
		if (Static234.anInt5224 < 102) {
			Static234.anInt5224 += 6;
		}
		@Pc(27) int local27;
		if (Static315.anInt6315 != -1 && Static582.method8056() > Static364.aLong190) {
			for (local27 = Static315.anInt6315; local27 < Static285.aStringArray17.length; local27++) {
				if (Static285.aStringArray17[local27].startsWith("pause")) {
					@Pc(46) int local46 = 5;
					try {
						local46 = Integer.parseInt(Static285.aStringArray17[local27].substring(6));
					} catch (@Pc(55) Exception local55) {
					}
					Static552.method7749("Pausing for " + local46 + " seconds...");
					Static315.anInt6315 = local27 + 1;
					Static364.aLong190 = Static582.method8056() + (long) (local46 * 1000);
					return;
				}
				Static91.aString16 = Static285.aStringArray17[local27];
				Static515.method7371(false);
			}
			Static315.anInt6315 = -1;
		}
		if (Static551.anInt9470 != 0) {
			Static107.anInt2893 -= Static551.anInt9470 * 5;
			if (Static107.anInt2893 >= Static310.anInt1854) {
				Static107.anInt2893 = Static310.anInt1854 - 1;
			}
			if (Static107.anInt2893 < 0) {
				Static107.anInt2893 = 0;
			}
			Static551.anInt9470 = 0;
		}
		for (local27 = 0; local27 < Static564.anInt9701; local27++) {
			@Pc(126) Interface8 local126 = Static37.anInterface8Array1[local27];
			@Pc(130) int local130 = local126.method2085();
			@Pc(134) char local134 = local126.method2083();
			@Pc(138) int local138 = local126.method2084();
			if (local130 == 84) {
				Static515.method7371(false);
			}
			if (local130 == 80) {
				Static515.method7371(true);
			} else if (local130 == 66 && (local138 & 0x4) != 0) {
				if (Static15.aClipboard1 != null) {
					@Pc(413) String local413 = "";
					for (@Pc(418) int local418 = Static363.aStringArray36.length - 1; local418 >= 0; local418--) {
						if (Static363.aStringArray36[local418] != null && Static363.aStringArray36[local418].length() > 0) {
							local413 = local413 + Static363.aStringArray36[local418] + '\n';
						}
					}
					Static15.aClipboard1.setContents(new StringSelection(local413), (ClipboardOwner) null);
				}
			} else if (local130 == 67 && (local138 & 0x4) != 0) {
				if (Static15.aClipboard1 != null) {
					@Pc(388) Transferable local388 = Static15.aClipboard1.getContents((Object) null);
					if (local388 != null) {
						try {
							@Pc(395) String local395 = (String) local388.getTransferData(DataFlavor.stringFlavor);
							if (local395 != null) {
								@Pc(402) String[] local402 = Static206.method3730(local395, '\n');
								Static203.method3703(local402);
							}
						} catch (@Pc(407) Exception local407) {
						}
					}
				}
			} else if (local130 == 85 && Static364.anInt7027 > 0) {
				Static91.aString16 = Static91.aString16.substring(0, Static364.anInt7027 - 1) + Static91.aString16.substring(Static364.anInt7027);
				Static364.anInt7027--;
			} else if (local130 == 101 && Static364.anInt7027 < Static91.aString16.length()) {
				Static91.aString16 = Static91.aString16.substring(0, Static364.anInt7027) + Static91.aString16.substring(Static364.anInt7027 + 1);
			} else if (local130 == 96 && Static364.anInt7027 > 0) {
				Static364.anInt7027--;
			} else if (local130 == 97 && Static364.anInt7027 < Static91.aString16.length()) {
				Static364.anInt7027++;
			} else if (local130 == 102) {
				Static364.anInt7027 = 0;
			} else if (local130 == 103) {
				Static364.anInt7027 = Static91.aString16.length();
			} else if (local130 == 104 && Static266.anInt5702 < Static363.aStringArray36.length) {
				Static266.anInt5702++;
				Static374.method7974();
				Static364.anInt7027 = Static91.aString16.length();
			} else if (local130 == 105 && Static266.anInt5702 > 0) {
				Static266.anInt5702--;
				Static374.method7974();
				Static364.anInt7027 = Static91.aString16.length();
			} else if (Static212.method3800(local134) || local134 == '\' || local134 == '/' || local134 == '.' || local134 == ':' || local134 == ',' || local134 == ' ' || local134 == '_' || local134 == '-' || local134 == '+' || local134 == '[' || local134 == ']') {
				Static91.aString16 = Static91.aString16.substring(0, Static364.anInt7027) + Static37.anInterface8Array1[local27].method2083() + Static91.aString16.substring(Static364.anInt7027);
				Static364.anInt7027++;
			}
		}
		Static26.anInt772 = 0;
		Static564.anInt9701 = 0;
		Static486.method8547();
	}
}
