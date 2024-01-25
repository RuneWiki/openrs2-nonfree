import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_1 = new Class57("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BII)I")
	public static int method87(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static12.anIntArray21[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
	public static void method88() {
		if (Static115.anInt2219 != 0) {
			Static319.anInt5444 -= Static115.anInt2219 * 5;
			if (Static319.anInt5444 >= Static125.anInt2385) {
				Static319.anInt5444 = Static125.anInt2385 - 1;
			}
			if (Static319.anInt5444 < 0) {
				Static319.anInt5444 = 0;
			}
			Static115.anInt2219 = 0;
		}
		if (Static132.anInt2501 < 102) {
			Static132.anInt2501 += 6;
		}
		@Pc(50) int local50;
		for (@Pc(42) int local42 = 0; local42 < Static153.anInt2778; local42++) {
			local50 = Static251.aClass70Array1[local42].method1432();
			@Pc(56) char local56 = Static251.aClass70Array1[local42].method1431();
			if (local50 == 84) {
				Static331.method5051();
			} else if (Static322.aClass89_25.method1847(82) && local50 == 66) {
				if (Static28.aClipboard1 != null) {
					@Pc(341) String local341 = "";
					for (@Pc(346) int local346 = Static361.aStringArray42.length - 1; local346 >= 0; local346--) {
						if (Static361.aStringArray42[local346] != null && Static361.aStringArray42[local346].length() > 0) {
							local341 = local341 + Static361.aStringArray42[local346] + '\n';
						}
					}
					Static28.aClipboard1.setContents(new StringSelection(local341), null);
				}
			} else if (Static322.aClass89_25.method1847(82) && local50 == 67) {
				if (Static28.aClipboard1 != null) {
					@Pc(81) Transferable local81 = Static28.aClipboard1.getContents(null);
					if (local81 != null) {
						try {
							@Pc(88) String local88 = (String) local81.getTransferData(DataFlavor.stringFlavor);
							if (local88 != null) {
								@Pc(95) String[] local95 = Static63.method1103('\n', local88);
								if (local95.length > 1) {
									for (@Pc(103) int local103 = 0; local103 < local95.length; local103++) {
										Static204.aString52 = local95[local103];
										Static331.method5051();
									}
								} else {
									Static204.aString52 = Static204.aString52 + local88;
								}
							}
						} catch (@Pc(129) Exception local129) {
						}
					}
				}
			} else if (local50 == 85 && Static88.anInt1814 > 0) {
				Static204.aString52 = Static204.aString52.substring(0, Static88.anInt1814 - 1) + Static204.aString52.substring(Static88.anInt1814);
				Static88.anInt1814--;
			} else if (local50 == 101 && Static88.anInt1814 < Static204.aString52.length()) {
				Static204.aString52 = Static204.aString52.substring(0, Static88.anInt1814) + Static204.aString52.substring(Static88.anInt1814 + 1);
			} else if (local50 == 96 && Static88.anInt1814 > 0) {
				Static88.anInt1814--;
			} else if (local50 == 97 && Static88.anInt1814 < Static204.aString52.length()) {
				Static88.anInt1814++;
			} else if (local50 == 102) {
				Static88.anInt1814 = 0;
			} else if (local50 == 103) {
				Static88.anInt1814 = Static204.aString52.length();
			} else if (local50 == 104 && Static361.aStringArray42.length > Static316.anInt5438) {
				Static316.anInt5438++;
				Static371.method5535();
				Static88.anInt1814 = Static204.aString52.length();
			} else if (local50 == 105 && Static316.anInt5438 > 0) {
				Static316.anInt5438--;
				Static371.method5535();
				Static88.anInt1814 = Static204.aString52.length();
			} else if (Static340.method5151(local56) || local56 == ':' || local56 == ',' || local56 == ' ' || local56 == '_' || local56 == '-' || local56 == '+' || local56 == '[' || local56 == ']') {
				Static204.aString52 = Static204.aString52.substring(0, Static88.anInt1814) + Static251.aClass70Array1[local42].method1431() + Static204.aString52.substring(Static88.anInt1814);
				Static88.anInt1814++;
			}
		}
		Static153.anInt2778 = 0;
		for (local50 = 0; local50 < 100; local50++) {
			Static198.anIntArray385[local50] += Static242.anIntArray485[local50];
			if (Static198.anIntArray385[local50] >> 4 >= 350) {
				Static17.anIntArray23[local50] = (int) ((double) Static199.anInt3567 * Math.random()) << 4;
				Static198.anIntArray385[local50] = 0;
				Static345.anIntArray636[local50] = (int) (Math.random() * 102.0D) + 51;
				Static242.anIntArray485[local50] = (int) (Math.random() * 48.0D) + 8;
			}
		}
		Static71.method1197();
	}
}
