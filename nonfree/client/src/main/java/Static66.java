import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!eb", name = "H", descriptor = "Lclient!bd;")
	public static Class18 aClass18_3;

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(IB)V")
	public static void method1390(@OriginalArg(0) int arg0) {
		Static124.anInt2606 = arg0;
		Static265.aClass66_101.method1933();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIBI)I")
	public static int method1393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static130.aClass3Array2 == null) {
			return 0;
		}
		@Pc(17) int local17 = arg2 >> 7;
		@Pc(21) int local21 = arg0 >> 7;
		if (local17 < 0 || local21 < 0 || local17 > Static266.anInt5101 - 1 || Static339.anInt6352 - 1 < local21) {
			return 0;
		}
		@Pc(39) int local39 = arg1;
		if (arg1 < 3 && (Static32.aByteArrayArrayArray4[1][local17][local21] & 0x2) != 0) {
			local39 = arg1 + 1;
		}
		return Static130.aClass3Array2[local39].method5639(arg2, arg0);
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V")
	public static void method1395() {
		Static268.aString379 = "Titelbild geöffnet.";
		Static276.aString310 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
		Static68.aString98 = "Verbindung abgebrochen.";
		Static312.aString340 = "lila:";
		Static162.aString200 = " zuerst von deiner Ignorieren-Liste!";
		Static25.aString38 = "rot:";
		Static64.aString92 = "Bitte entferne ";
		Static226.aString260 = "Schließen";
		Static59.aString83 = "Lade Standardeinstellungen - ";
		Static197.aString228 = "Abbrechen";
		Static341.aString366 = "Mechscape wird geladen - bitte warten...";
		Static261.aString297 = "Verbindung zum Update-Server hergestellt.";
		Static117.aString157 = "Update-Liste geladen.";
		Static133.aString380 = "Verbindung mit Update-Server...";
		Static261.aString296 = "Hierhin drehen";
		Static348.aString375 = "Zugewiesener Speicher.";
		Static285.aString334 = "Benutzeroberfläche geladen.";
		Static214.aString245 = "Bitte warte...";
		Static324.aString352 = "blinken1:";
		Static135.aString175 = "M";
		Static63.aString87 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
		Static314.aString341 = "Client-Variablen geladen";
		Static344.aString62 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
		Static243.aString275 = "Titelbild geladen.";
		Static290.aString323 = "T";
		Static260.aString370 = " weitere Optionen";
		Static211.aString243 = " loggt sich aus.";
		Static287.aString321 = "Lade Texturen - ";
		Static181.aString217 = "Bitte entferne ";
		Static47.aString65 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
		Static350.aString377 = " zuerst von deiner Freunde-Liste!";
		Static158.aString195 = "Lade Konfiguration - ";
		Static120.aString161 = "leuchten3:";
		Static64.aString93 = "Lade Titelbild - ";
		Static32.aString52 = "Fertigkeit: ";
		Static73.aString105 = "blaugrün:";
		Static202.aString232 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
		Static91.aString127 = " steht bereits auf deiner Freunde-Liste!";
		Static67.aString96 = "Eingabeprozedur geladen.";
		Static192.aString223 = "Spielwelt erstellt.";
		Static222.aString257 = "Konfig geladen.";
		Static136.aString177 = "Hierhin gehen";
		Static139.aString354 = "Untersuchen";
		Static183.aString219 = " loggt sich ein.";
		Static57.aString81 = "T";
		Static8.aString9 = "Standardeinstellungen geladen";
		Static20.aString33 = "blinken2:";
		Static122.aString169 = "3D-Softwarebibliothek gestartet.";
		Static121.aString166 = "Benutzen";
		Static251.aString289 = "Spieler kann nicht gefunden werden: ";
		Static180.aString212 = "Lade Sprites - ";
		Static121.aString167 = "Sprites geladen.";
		Static120.aString162 = "weiss:";
		Static118.aString158 = "Texturen geladen.";
		Static139.aString355 = "leuchten1:";
		Static273.aString307 = "Liste der Welten geladen";
		Static135.aString176 = "Speicher wird zugewiesen.";
		Static246.aString281 = "Lade Wordpack - ";
		Static103.aString140 = "Wähl eine Option";
		Static22.aString35 = "Auswählen";
		Static35.aString56 = "Gegenstand für Mitglieder";
		Static27.aString306 = "Stufe: ";
		Static240.aString268 = "gelb:";
		Static353.aString381 = "M";
		Static260.aString371 = "welle2:";
		Static283.aString315 = "scrollen:";
		Static334.aString363 = "Ladevorgang - bitte warte.";
		Static99.aString132 = "Okay";
		Static106.aString146 = "Fallen lassen";
		Static252.aString290 = "Starte 3D-Softwarebibliothek.";
		Static238.aString267 = "blinken3:";
		Static295.aString328 = "Lade Benutzeroberfläche - ";
		Static286.aString319 = "welle:";
		Static346.aString372 = "grün:";
		Static180.aString213 = "Schriftsätze geladen.";
		Static13.aString29 = "leuchten2:";
		Static231.aString264 = "Musik-Engine vorbereitet.";
		Static199.aString230 = "Lade Schriftsätze - ";
		Static83.aString122 = "Versteckt";
		Static216.aString250 = ": ";
		Static129.aString172 = "Ablegen";
		Static230.aString263 = "gleiten:";
		Static177.aString150 = "Nehmen";
		Static264.aString193 = "Weiter";
		Static248.aString284 = "Angreifen";
		Static145.aString359 = "schütteln:";
		Static4.aString1 = "Lade Liste der Welten";
		Static195.aString226 = "Kampfstufe: ";
		Static90.aString252 = " steht bereits auf deiner Ignorieren-Liste!";
		Static47.aString66 = "Lade...";
		Static38.aString59 = "Wordpack geladen.";
		Static35.aString55 = "RuneScape wird geladen - bitte warten...";
		Static336.aString312 = "Suche nach Updates - ";
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)V")
	public static void method1396() {
		Static105.aClipboard1 = null;
		Static55.aBooleanArray4 = null;
		Static218.aBoolean317 = false;
		Static196.anIntArray279 = null;
		Static274.anIntArray404 = null;
		Static9.anIntArray7 = null;
		Static241.method4110();
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(II)Lclient!f;")
	public static Class5_Sub9_Sub5 method1397(@OriginalArg(1) int arg0) {
		@Pc(16) Class5_Sub9_Sub5 local16 = (Class5_Sub9_Sub5) Static130.aClass215_3.method5683((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(30) byte[] local30 = Static214.aClass170_77.method4584(Static217.method3826(arg0), Static54.method1181(arg0));
		local16 = new Class5_Sub9_Sub5();
		if (local30 != null) {
			local16.method1763(new Class5_Sub1(local30));
		}
		Static130.aClass215_3.method5687(local16, (long) arg0);
		return local16;
	}
}
