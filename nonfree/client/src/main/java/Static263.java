import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!rj", name = "l", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!rj", name = "y", descriptor = "[Z")
	public static boolean[] aBooleanArray24;

	@OriginalMember(owner = "client!rj", name = "z", descriptor = "[[B")
	public static byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!rj", name = "G", descriptor = "[Lclient!ck;")
	public static Class12[] aClass12Array2;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method4737(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V")
	public static void method4739() {
		Static276.aString220 = "3D-Softwarebibliothek gestartet.";
		Static306.aString241 = "Auswählen";
		Static205.aString163 = "T";
		Static143.aString105 = "Weiter";
		Static245.aString37 = "Bitte entferne ";
		Static266.aString214 = "Standardeinstellungen geladen";
		Static105.aString79 = "Verbindung zum Update-Server hergestellt.";
		Static315.aString245 = "Schriftsätze geladen.";
		Static124.aString96 = "blinken2:";
		Static111.aString84 = "Spieler kann nicht gefunden werden: ";
		Static15.aString10 = "Mechscape wird geladen - bitte warten...";
		Static213.aString172 = "Ablegen";
		Static146.aString181 = "welle:";
		Static250.aString198 = "RuneScape wird geladen - bitte warten...";
		Static67.aString54 = "scrollen:";
		Static175.aString137 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
		Static340.aString261 = "Schließen";
		Static143.aString106 = " steht bereits auf deiner Freunde-Liste!";
		Static204.aString275 = " zuerst von deiner Freunde-Liste!";
		Static317.aString247 = "gelb:";
		Static96.aString74 = "Lade Benutzeroberfläche - ";
		Static131.aString101 = "Titelbild geladen.";
		Static19.aString13 = "Lade...";
		Static114.aString86 = "weiss:";
		Static339.aString259 = "rot:";
		Static207.aString165 = "Spielwelt erstellt.";
		Static22.aString15 = "Lade Standardeinstellungen - ";
		Static97.aString76 = "blinken3:";
		Static115.aString87 = "Speicher wird zugewiesen.";
		Static62.aString271 = "Hierhin gehen";
		Static51.aString44 = "grün:";
		Static56.aString47 = "Nehmen";
		Static59.aString50 = "blinken1:";
		Static289.aString227 = " zuerst von deiner Ignorieren-Liste!";
		Static161.aString123 = " loggt sich ein.";
		Static144.aString109 = " steht bereits auf deiner Ignorieren-Liste!";
		Static293.aString232 = "Lade Konfiguration - ";
		Static235.aString243 = "Texturen geladen.";
		Static295.aString236 = "Starte 3D-Softwarebibliothek.";
		Static130.aString185 = "Lade Texturen - ";
		Static77.aString60 = "Client-Variablen geladen";
		Static233.aString183 = "Fallen lassen";
		Static50.aString43 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
		Static79.aString272 = "T";
		Static144.aString110 = "Abbrechen";
		Static39.aString35 = "Versteckt";
		Static101.aString78 = "Ladevorgang - bitte warte.";
		Static256.aString202 = "Musik-Engine vorbereitet.";
		Static99.aString77 = "Untersuchen";
		Static351.aString151 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
		Static12.aString7 = "M";
		Static115.aString89 = "Liste der Welten geladen";
		Static340.aString260 = "Hierhin drehen";
		Static73.aString33 = "Benutzeroberfläche geladen.";
		Static329.aString252 = "leuchten1:";
		Static28.aString19 = "Eingabeprozedur geladen.";
		Static339.aString258 = "Zugewiesener Speicher.";
		Static352.aString274 = "Lade Schriftsätze - ";
		Static53.aString45 = "Lade Wordpack - ";
		Static82.aString61 = "gleiten:";
		Static29.aString20 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
		Static184.aString140 = "Suche nach Updates - ";
		Static144.aString108 = "Lade Titelbild - ";
		Static163.aString124 = " loggt sich aus.";
		Static208.aString167 = "Kampfstufe: ";
		Static259.aString206 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
		Static176.aString138 = "Titelbild geöffnet.";
		Static115.aString88 = "Lade Sprites - ";
		Static148.aString111 = "Wähl eine Option";
		Static41.aString40 = "Angreifen";
		Static230.aString182 = "Okay";
		Static170.aString129 = "Gegenstand für Mitglieder";
		Static166.aString127 = "M";
		Static1.aString1 = "lila:";
		Static194.aString155 = "Wordpack geladen.";
		Static89.aString68 = "Update-Liste geladen.";
		Static121.aString159 = "Bitte warte...";
		Static335.aString254 = "Fertigkeit: ";
		Static246.aString197 = "Stufe: ";
		Static204.aString276 = ": ";
		Static221.aString177 = " weitere Optionen";
		Static76.aString58 = "welle2:";
		Static4.aString2 = "schütteln:";
		Static201.aString269 = "leuchten3:";
		Static55.aString46 = "Lade Liste der Welten";
		Static178.aString139 = "Sprites geladen.";
		Static321.aString249 = "blaugrün:";
		Static306.aString242 = "Konfig geladen.";
		Static185.aString141 = "Bitte entferne ";
		Static29.aString21 = "leuchten2:";
		Static319.aString120 = "Benutzen";
		Static259.aString205 = "Verbindung abgebrochen.";
		Static92.aString69 = "Verbindung mit Update-Server...";
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZLjava/lang/String;ILclient!lm;)Lclient!le;")
	public static Class129 method4745(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class134 arg2) {
		@Pc(10) int local10 = arg2.method3018(arg1);
		if (local10 == -1) {
			return new Class129(0);
		}
		@Pc(23) int[] local23 = arg2.method3001(local10);
		@Pc(29) Class129 local29 = new Class129(local23.length);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		while (true) {
			while (local31 < local29.anInt3453) {
				@Pc(49) Class1_Sub21 local49 = new Class1_Sub21(arg2.method3009(local23[local33++], local10));
				@Pc(53) int local53 = local49.method5716();
				@Pc(57) int local57 = local49.method5715();
				@Pc(61) int local61 = local49.method5720();
				if (!arg0 && local61 == 1) {
					local29.anInt3453--;
				} else {
					local29.anIntArray337[local31] = local53;
					local29.anIntArray336[local31] = local57;
					local31++;
				}
			}
			return local29;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIC)C")
	public static char method4747(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		if (arg1 >= 'À' && arg1 <= 'ÿ') {
			if (arg1 >= 'À' && arg1 <= 'Æ') {
				return 'A';
			}
			if (arg1 == 'Ç') {
				return 'C';
			}
			if (arg1 >= 'È' && arg1 <= 'Ë') {
				return 'E';
			}
			if (arg1 >= 'Ì' && arg1 <= 'Ï') {
				return 'I';
			}
			if (arg1 == 'Ñ' && arg0 != 0) {
				return 'N';
			}
			if (arg1 >= 'Ò' && arg1 <= 'Ö') {
				return 'O';
			}
			if (arg1 >= 'Ù' && arg1 <= 'Ü') {
				return 'U';
			}
			if (arg1 == 'Ý') {
				return 'Y';
			}
			if (arg1 == 'ß') {
				return 's';
			}
			if (arg1 >= 'à' && arg1 <= 'æ') {
				return 'a';
			}
			if (arg1 == 'ç') {
				return 'c';
			}
			if (arg1 >= 'è' && arg1 <= 'ë') {
				return 'e';
			}
			if (arg1 >= 'ì' && arg1 <= 'ï') {
				return 'i';
			}
			if (arg1 == 'ñ' && arg0 != 0) {
				return 'n';
			}
			if (arg1 >= 'ò' && arg1 <= 'ö') {
				return 'o';
			}
			if (arg1 >= 'ù' && arg1 <= 'ü') {
				return 'u';
			}
			if (arg1 == 'ý' || arg1 == 'ÿ') {
				return 'y';
			}
		}
		if (arg1 == 'Œ') {
			return 'O';
		} else if (arg1 == 'œ') {
			return 'o';
		} else if (arg1 == 'Ÿ') {
			return 'Y';
		} else {
			return arg1;
		}
	}
}
