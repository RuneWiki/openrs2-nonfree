import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!j", name = "y", descriptor = "I")
	public static int anInt2421;

	@OriginalMember(owner = "client!j", name = "A", descriptor = "I")
	public static int anInt2423;

	@OriginalMember(owner = "client!j", name = "t", descriptor = "Lclient!ec;")
	public static Class46 aClass46_17 = new Class46(64);

	@OriginalMember(owner = "client!j", name = "x", descriptor = "[I")
	public static int[] anIntArray165 = new int[2];

	@OriginalMember(owner = "client!j", name = "B", descriptor = "[Z")
	public static boolean[] aBooleanArray11 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!jd;I)V")
	public static void method2080(@OriginalArg(0) Class84 arg0) {
		Static97.aClass84_42 = arg0;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II)Lclient!cm;")
	public static Class33 method2081(@OriginalArg(0) int arg0) {
		@Pc(10) Class33 local10 = (Class33) Static299.aClass46_19.method1074((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(33) byte[] local33 = Static11.aClass84_7.method2127(Static274.method4582(arg0), Static65.method1256(arg0));
		local10 = new Class33();
		local10.anInt868 = arg0;
		if (local33 != null) {
			local10.method720(new Class2_Sub26(local33));
		}
		local10.method710();
		Static299.aClass46_19.method1071(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(B)V")
	public static void method2083() {
		Static162.aString165 = "Eingabeprozedur geladen.";
		Static87.aString95 = "Fertigkeit: ";
		Static198.aString207 = "Schriftsätze geladen.";
		Static273.aString268 = "T";
		Static296.aString300 = "Verbindung mit Update-Server...";
		Static216.aString226 = "Update-Liste geladen.";
		Static109.aString121 = "Hierhin gehen";
		Static149.aString152 = "Lade Schriftsätze - ";
		Static101.aString293 = "blinken3:";
		Static299.aString131 = " loggt sich ein.";
		Static37.aString46 = "Lade Wordpack - ";
		Static275.aString272 = "leuchten2:";
		Static152.aString154 = "gleiten:";
		Static30.aString42 = "grün:";
		Static164.aString167 = " zuerst von deiner Ignorieren-Liste!";
		Static90.aString100 = "Zugewiesener Speicher.";
		Static17.aString26 = "Okay";
		Static242.aString243 = "blaugrün:";
		Static53.aString60 = "schütteln:";
		Static76.aString83 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
		Static14.aString21 = "Konfig geladen.";
		Static245.aString256 = "Ladevorgang - bitte warte.";
		Static230.aString192 = "Starte 3D-Softwarebibliothek.";
		Static47.aString54 = "Texturen geladen.";
		Static55.aString63 = "Lade Sprites - ";
		Static155.aString301 = "Versteckt";
		Static267.aString204 = "Benutzeroberfläche geladen.";
		Static185.aString196 = "Spielwelt erstellt.";
		Static264.aString257 = "gelb:";
		Static52.aString59 = "möchte mit dir handeln.";
		Static243.aString187 = "Verbindung zum Update-Server hergestellt.";
		Static136.aString138 = "Auswählen";
		Static205.aString214 = "M";
		Static62.aString71 = "blinken1:";
		Static47.aString55 = "Nehmen";
		Static88.aString235 = "Suche nach Updates - ";
		Static100.aString112 = "Lade Benutzeroberfläche - ";
		Static293.aString295 = "Stufe: ";
		Static238.aString238 = "Fallen lassen";
		Static65.aString76 = "scrollen:";
		Static205.aString212 = "Speicher wird zugewiesen.";
		Static8.aString12 = "welle:";
		Static208.aString217 = ": ";
		Static105.aString115 = "Musik-Engine vorbereitet.";
		Static221.aString230 = "Titelbild geladen.";
		Static19.aString29 = "M";
		Static110.aString123 = "Kampfstufe: ";
		Static217.aString228 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
		Static148.aString151 = "Bitte warte...";
		Static279.aString278 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
		Static55.aString64 = "lila:";
		Static91.aString102 = "Schließen";
		Static230.aString191 = "Lade Texturen - ";
		Static50.aString57 = "Ablegen";
		Static156.aString259 = "Hierhin drehen";
		Static192.aString199 = " zuerst von deiner Freunde-Liste!";
		Static212.aString224 = "Benutzen";
		Static5.aString7 = "Wordpack geladen.";
		Static37.aString47 = "leuchten3:";
		Static191.aString41 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
		Static58.aString67 = "RuneScape wird geladen - bitte warten...";
		Static142.aString147 = "Lade Liste der Welten";
		Static63.aString74 = " steht bereits auf deiner Freunde-Liste!";
		Static224.aString233 = "Abbrechen";
		Static202.aString208 = "leuchten1:";
		Static44.aString53 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
		Static17.aString25 = "Liste der Welten geladen";
		Static293.aString296 = "Lade Konfiguration - ";
		Static36.aString45 = "welle2:";
		Static289.aString292 = "Bitte entferne ";
		Static99.aString108 = "Gegenstand für Mitglieder";
		Static106.aString120 = "Titelbild geöffnet.";
		Static213.aString225 = "T";
		Static100.aString110 = "Lade...";
		Static12.aString17 = "blinken2:";
		Static212.aString223 = "Weiter";
		Static165.aString169 = " steht bereits auf deiner Ignorieren-Liste!";
		Static30.aString43 = "Untersuchen";
		Static205.aString213 = "Lade Titelbild - ";
		Static53.aString61 = " weitere Optionen";
		Static279.aString277 = "Bitte entferne ";
		Static22.aString19 = "Spieler kann nicht gefunden werden: ";
		Static154.aString158 = "rot:";
		Static285.aString287 = "weiss:";
		Static241.aString241 = "Lade Standardeinstellungen - ";
		Static121.aString130 = "Sprites geladen.";
		Static246.aString247 = "Verbindung abgebrochen.";
		Static139.aString140 = " loggt sich aus.";
		Static203.aString210 = "Angreifen";
		Static169.aString178 = "Wähl eine Option";
		Static11.aString15 = "3D-Softwarebibliothek gestartet.";
		Static11.aString14 = "Standardinstellungen geladen";
	}
}
