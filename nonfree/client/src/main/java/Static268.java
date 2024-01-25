import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!mw", name = "w", descriptor = "Lclient!pw;")
	public static final Class194 aClass194_6 = new Class194();

	@OriginalMember(owner = "client!mw", name = "y", descriptor = "Lclient!of;")
	public static final Class174 aClass174_129 = new Class174("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!mw", name = "f", descriptor = "(I)V")
	public static void method3724() {
		if (Static189.anInt3452 < 102) {
			Static189.anInt3452 += 6;
		}
		if (Static461.anInt7758 != 0) {
			Static22.anInt381 -= Static461.anInt7758 * 5;
			if (Static458.anInt7716 <= Static22.anInt381) {
				Static22.anInt381 = Static458.anInt7716 - 1;
			}
			if (Static22.anInt381 < 0) {
				Static22.anInt381 = 0;
			}
			Static461.anInt7758 = 0;
		}
		for (@Pc(44) int local44 = 0; local44 < Static179.anInt3325; local44++) {
			@Pc(50) Interface3 local50 = Static37.anInterface3Array1[local44];
			@Pc(54) int local54 = local50.method418();
			@Pc(58) char local58 = local50.method417();
			@Pc(62) int local62 = local50.method415();
			if (local54 == 84) {
				Static131.method2038(false);
			}
			if (local54 == 80) {
				Static131.method2038(true);
			} else if (local54 == 66 && (local62 & 0x4) != 0) {
				if (Static249.aClipboard1 != null) {
					@Pc(89) String local89 = "";
					for (@Pc(94) int local94 = Static363.aStringArray39.length - 1; local94 >= 0; local94--) {
						if (Static363.aStringArray39[local94] != null && Static363.aStringArray39[local94].length() > 0) {
							local89 = local89 + Static363.aStringArray39[local94] + '\n';
						}
					}
					Static249.aClipboard1.setContents(new StringSelection(local89), null);
				}
			} else if (local54 == 67 && (local62 & 0x4) != 0) {
				if (Static249.aClipboard1 != null) {
					@Pc(351) Transferable local351 = Static249.aClipboard1.getContents(null);
					if (local351 != null) {
						try {
							@Pc(358) String local358 = (String) local351.getTransferData(DataFlavor.stringFlavor);
							if (local358 != null) {
								@Pc(365) String[] local365 = Static403.method5514(local358, '\n');
								if (local365.length > 1) {
									for (@Pc(371) int local371 = 0; local371 < local365.length; local371++) {
										Static121.aString29 = local365[local371];
										Static131.method2038(false);
									}
								} else {
									Static121.aString29 = Static121.aString29 + local358;
								}
							}
						} catch (@Pc(402) Exception local402) {
						}
					}
				}
			} else if (local54 == 85 && Static73.anInt1339 > 0) {
				Static121.aString29 = Static121.aString29.substring(0, Static73.anInt1339 - 1) + Static121.aString29.substring(Static73.anInt1339);
				Static73.anInt1339--;
			} else if (local54 == 101 && Static73.anInt1339 < Static121.aString29.length()) {
				Static121.aString29 = Static121.aString29.substring(0, Static73.anInt1339) + Static121.aString29.substring(Static73.anInt1339 + 1);
			} else if (local54 == 96 && Static73.anInt1339 > 0) {
				Static73.anInt1339--;
			} else if (local54 == 97 && Static73.anInt1339 < Static121.aString29.length()) {
				Static73.anInt1339++;
			} else if (local54 == 102) {
				Static73.anInt1339 = 0;
			} else if (local54 == 103) {
				Static73.anInt1339 = Static121.aString29.length();
			} else if (local54 == 104 && Static363.aStringArray39.length > Static367.anInt6206) {
				Static367.anInt6206++;
				Static60.method1138();
				Static73.anInt1339 = Static121.aString29.length();
			} else if (local54 == 105 && Static367.anInt6206 > 0) {
				Static367.anInt6206--;
				Static60.method1138();
				Static73.anInt1339 = Static121.aString29.length();
			} else if (Static375.method5236(local58) || local58 == ':' || local58 == ',' || local58 == ' ' || local58 == '_' || local58 == '-' || local58 == '+' || local58 == '[' || local58 == ']') {
				Static121.aString29 = Static121.aString29.substring(0, Static73.anInt1339) + Static37.anInterface3Array1[local44].method417() + Static121.aString29.substring(Static73.anInt1339);
				Static73.anInt1339++;
			}
		}
		Static179.anInt3325 = 0;
		Static174.method2784();
	}
}
