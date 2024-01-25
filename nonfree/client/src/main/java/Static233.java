import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!hk", name = "G", descriptor = "I")
	public static int anInt4238;

	@OriginalMember(owner = "client!hk", name = "J", descriptor = "Lclient!wm;")
	public static Class390 aClass390_54;

	@OriginalMember(owner = "client!hk", name = "K", descriptor = "I")
	public static int anInt4241;

	@OriginalMember(owner = "client!hk", name = "F", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_78 = new Class359(56, 10);

	@OriginalMember(owner = "client!hk", name = "L", descriptor = "Lclient!uaa;")
	public static Class345 aClass345_4 = null;

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "(I)V")
	public static void method3598() {
		if (Static262.anInt4858 < 102) {
			Static262.anInt4858 += 6;
		}
		@Pc(25) int local25;
		if (Static175.anInt3416 != -1 && Static547.method7619() > Static170.aLong67) {
			for (local25 = Static175.anInt3416; local25 < Static584.aStringArray53.length; local25++) {
				if (Static584.aStringArray53[local25].startsWith("pause")) {
					@Pc(44) int local44 = 5;
					try {
						local44 = Integer.parseInt(Static584.aStringArray53[local25].substring(6));
					} catch (@Pc(53) Exception local53) {
					}
					Static574.method7927("Pausing for " + local44 + " seconds...");
					Static175.anInt3416 = local25 + 1;
					Static170.aLong67 = Static547.method7619() + (long) (local44 * 1000);
					return;
				}
				Static390.aString58 = Static584.aStringArray53[local25];
				Static127.method2321(false);
			}
			Static175.anInt3416 = -1;
		}
		if (Static133.anInt2650 != 0) {
			Static151.anInt3096 -= Static133.anInt2650 * 5;
			if (Static6.anInt66 <= Static151.anInt3096) {
				Static151.anInt3096 = Static6.anInt66 - 1;
			}
			if (Static151.anInt3096 < 0) {
				Static151.anInt3096 = 0;
			}
			Static133.anInt2650 = 0;
		}
		for (local25 = 0; local25 < Static276.anInt10228; local25++) {
			@Pc(121) Interface16 local121 = Static340.anInterface16Array2[local25];
			@Pc(125) int local125 = local121.method7500();
			@Pc(129) char local129 = local121.method7501();
			@Pc(133) int local133 = local121.method7503();
			if (local125 == 84) {
				Static127.method2321(false);
			}
			if (local125 == 80) {
				Static127.method2321(true);
			} else if (local125 == 66 && (local133 & 0x4) != 0) {
				if (Static458.aClipboard1 != null) {
					@Pc(408) String local408 = "";
					for (@Pc(413) int local413 = Static352.aStringArray61.length - 1; local413 >= 0; local413--) {
						if (Static352.aStringArray61[local413] != null && Static352.aStringArray61[local413].length() > 0) {
							local408 = local408 + Static352.aStringArray61[local413] + '\n';
						}
					}
					Static458.aClipboard1.setContents(new StringSelection(local408), (ClipboardOwner) null);
				}
			} else if (local125 == 67 && (local133 & 0x4) != 0) {
				if (Static458.aClipboard1 != null) {
					@Pc(383) Transferable local383 = Static458.aClipboard1.getContents((Object) null);
					if (local383 != null) {
						try {
							@Pc(390) String local390 = (String) local383.getTransferData(DataFlavor.stringFlavor);
							if (local390 != null) {
								@Pc(397) String[] local397 = Static147.method2668('\n', local390);
								Static102.method1990(local397);
							}
						} catch (@Pc(402) Exception local402) {
						}
					}
				}
			} else if (local125 == 85 && Static576.anInt9395 > 0) {
				Static390.aString58 = Static390.aString58.substring(0, Static576.anInt9395 - 1) + Static390.aString58.substring(Static576.anInt9395);
				Static576.anInt9395--;
			} else if (local125 == 101 && Static576.anInt9395 < Static390.aString58.length()) {
				Static390.aString58 = Static390.aString58.substring(0, Static576.anInt9395) + Static390.aString58.substring(Static576.anInt9395 + 1);
			} else if (local125 == 96 && Static576.anInt9395 > 0) {
				Static576.anInt9395--;
			} else if (local125 == 97 && Static576.anInt9395 < Static390.aString58.length()) {
				Static576.anInt9395++;
			} else if (local125 == 102) {
				Static576.anInt9395 = 0;
			} else if (local125 == 103) {
				Static576.anInt9395 = Static390.aString58.length();
			} else if (local125 == 104 && Static78.anInt1119 < Static352.aStringArray61.length) {
				Static78.anInt1119++;
				Static55.method732();
				Static576.anInt9395 = Static390.aString58.length();
			} else if (local125 == 105 && Static78.anInt1119 > 0) {
				Static78.anInt1119--;
				Static55.method732();
				Static576.anInt9395 = Static390.aString58.length();
			} else if (Static243.method3798(local129) || local129 == '\' || local129 == '/' || local129 == '.' || local129 == ':' || local129 == ',' || local129 == ' ' || local129 == '_' || local129 == '-' || local129 == '+' || local129 == '[' || local129 == ']') {
				Static390.aString58 = Static390.aString58.substring(0, Static576.anInt9395) + Static340.anInterface16Array2[local25].method7501() + Static390.aString58.substring(Static576.anInt9395);
				Static576.anInt9395++;
			}
		}
		Static276.anInt10228 = 0;
		Static676.anInt10853 = 0;
		Static283.method4543();
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZ)Z")
	public static boolean method3599(@OriginalArg(0) int arg0) {
		return arg0 == 7 || arg0 == 9;
	}
}
