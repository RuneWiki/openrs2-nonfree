import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "Lclient!ak;")
	public static Class7 aClass7_39;

	@OriginalMember(owner = "client!ci", name = "h", descriptor = "Lclient!cd;")
	public static Class22 aClass22_2 = new Class22(32);

	@OriginalMember(owner = "client!ci", name = "j", descriptor = "[I")
	public static int[] anIntArray119 = new int[2000];

	@OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
	public static int anInt853 = 0;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILclient!jj;I)Ljava/lang/String;")
	public static String method714(@OriginalArg(1) Class1_Sub18 arg0) {
		try {
			@Pc(7) int local7 = arg0.method3117();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(20) byte[] local20 = new byte[local7];
			arg0.anInt3911 += Static235.aClass99_1.method2273(local7, arg0.anInt3911, 0, arg0.aByteArray71, local20);
			return Static296.method4532(local7, 0, local20);
		} catch (@Pc(44) Exception local44) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method715(@OriginalArg(1) int arg0) {
		@Pc(23) byte[] local23;
		if (arg0 == 100 && Static261.anInt5258 > 0) {
			local23 = Static205.aByteArrayArray8[--Static261.anInt5258];
			Static205.aByteArrayArray8[Static261.anInt5258] = null;
			return local23;
		} else if (arg0 == 5000 && Static91.anInt1711 > 0) {
			local23 = Static90.aByteArrayArray10[--Static91.anInt1711];
			Static90.aByteArrayArray10[Static91.anInt1711] = null;
			return local23;
		} else if (arg0 == 30000 && Static237.anInt2926 > 0) {
			local23 = Static256.aByteArrayArray13[--Static237.anInt2926];
			Static256.aByteArrayArray13[Static237.anInt2926] = null;
			return local23;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
	public static void method716() {
		if (Static159.aClass24_2 != null) {
			Static159.aClass24_2.method2455();
		}
		if (Static72.aClass24_1 != null) {
			Static72.aClass24_1.method2455();
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
	public static void method717() {
		Static79.aString101 = "blinken2:";
		Static163.aString151 = " loggt sich aus.";
		Static45.aString26 = "Lade...";
		Static291.aString190 = "weiss:";
		Static100.aString57 = " zuerst von deiner Freunde-Liste!";
		Static219.aString144 = "gelb:";
		Static71.aString40 = "Verbindung zum Update-Server hergestellt.";
		Static203.aString138 = "leuchten1:";
		Static289.aString187 = "Ablegen";
		Static95.aString54 = "Schriftsätze geladen.";
		Static175.aString111 = "Lade Wordpack - ";
		Static246.aString116 = "scrollen:";
		Static260.aString176 = "Nehmen";
		Static131.aString87 = "Titelbild geöffnet.";
		Static10.aString12 = "Standardinstellungen geladen";
		Static100.aString56 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
		Static137.aString136 = " weitere Optionen";
		Static174.aString110 = "Abbrechen";
		Static221.aString148 = ": ";
		Static68.aString153 = "rot:";
		Static37.aString102 = " zuerst von deiner Ignorieren-Liste!";
		Static3.aString2 = "Update-Liste geladen.";
		Static16.aString16 = "Weiter";
		Static89.aString49 = "Stufe: ";
		Static145.aString94 = "Lade Benutzeroberfläche - ";
		Static288.aString186 = "Gegenstand für Mitglieder";
		Static9.aString10 = "Zugewiesener Speicher.";
		Static90.aString152 = "grün:";
		Static182.aString117 = "Spieler kann nicht gefunden werden: ";
		Static73.aString42 = "Angreifen";
		Static3.aString3 = "Verbindung mit Update-Server...";
		Static177.aString112 = "T";
		Static1.aString1 = "welle:";
		Static167.aString104 = "Wähl eine Option";
		Static53.aString29 = "Lade Liste der Welten";
		Static14.aString15 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
		Static62.aString33 = "schütteln:";
		Static89.aString48 = "Eingabeprozedur geladen.";
		Static290.aString189 = "lila:";
		Static143.aString92 = "Liste der Welten geladen";
		Static152.aString98 = "Kampfstufe: ";
		Static211.aString25 = "Bitte warte...";
		Static103.aString62 = " loggt sich ein.";
		Static260.aString178 = "Sprites geladen.";
		Static169.aString106 = "Lade Titelbild - ";
		Static125.aString75 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
		Static22.aString173 = "Fallen lassen";
		Static52.aString28 = "M";
		Static220.aString146 = "Texturen geladen.";
		Static101.aString58 = "M";
		Static9.aString11 = "Versteckt";
		Static10.aString13 = "Wordpack geladen.";
		Static139.aString89 = "leuchten3:";
		Static230.aString155 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
		Static4.aString5 = "Konfig geladen.";
		Static123.aString74 = "Spielwelt erstellt.";
		Static145.aString93 = "Hierhin gehen";
		Static251.aString174 = "RuneScape wird geladen - bitte warten...";
		Static5.aString7 = "gleiten:";
		Static268.aString180 = "Bitte entferne ";
		Static128.aString85 = "welle2:";
		Static140.aString91 = "Speicher wird zugewiesen.";
		Static167.aString105 = " steht bereits auf deiner Ignorieren-Liste!";
		Static46.aString27 = "Lade Standardeinstellungen - ";
		Static294.aString191 = "blinken3:";
		Static126.aString77 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
		Static122.aString73 = "Benutzeroberfläche geladen.";
		Static12.aString14 = "blinken1:";
		Static233.aString158 = "Starte 3D-Softwarebibliothek.";
		Static277.aString185 = "blaugrün:";
		Static139.aString90 = "Musik-Engine vorbereitet.";
		Static64.aString35 = "Schließen";
		Static131.aString86 = "Lade Konfiguration - ";
		Static192.aString181 = "Suche nach Updates - ";
		Static290.aString188 = "Bitte entferne ";
		Static191.aString131 = "T";
		Static149.aString96 = "Benutzen";
		Static4.aString6 = "Ladevorgang - bitte warte.";
		Static73.aString41 = "möchte mit dir handeln.";
		Static247.aString166 = "Lade Texturen - ";
		Static86.aString45 = "Titelbild geladen.";
		Static189.aString120 = "Lade Schriftsätze - ";
		Static103.aString61 = "3D-Softwarebibliothek gestartet.";
		Static109.aString63 = "Okay";
		Static189.aString121 = " steht bereits auf deiner Freunde-Liste!";
		Static126.aString76 = "Verbindung abgebrochen.";
		Static38.aString23 = "Hierhin drehen";
		Static234.aString160 = "Auswählen";
		Static29.aString20 = "Lade Sprites - ";
		Static260.aString177 = "leuchten2:";
		Static102.aString60 = "Fertigkeit: ";
		Static179.aString114 = "Untersuchen";
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)Z")
	public static boolean method718() {
		return Static240.aBoolean369 ? true : Static13.aBoolean247;
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)V")
	public static void method719(@OriginalArg(0) int arg0) {
		if (Static228.method3502(arg0)) {
			Static37.method2466(-1, Static86.aClass127ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIIIBII)V")
	public static void method721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(14) Class1_Sub24 local14 = (Class1_Sub24) Static16.aClass69_2.method1636();
		@Pc(16) Class1_Sub24 local16 = null;
		while (local14 != null) {
			if (arg2 == local14.anInt4104 && arg5 == local14.anInt4112 && local14.anInt4100 == arg3 && arg0 == local14.anInt4110) {
				local16 = local14;
				break;
			}
			local14 = (Class1_Sub24) Static16.aClass69_2.method1631();
		}
		if (local16 == null) {
			local16 = new Class1_Sub24();
			local16.anInt4100 = arg3;
			local16.anInt4104 = arg2;
			local16.anInt4110 = arg0;
			local16.anInt4112 = arg5;
			Static191.method2912(local16);
			Static16.aClass69_2.method1628(local16);
		}
		local16.anInt4114 = arg1;
		local16.anInt4107 = arg8;
		local16.anInt4099 = arg4;
		local16.anInt4102 = arg7;
		local16.anInt4108 = arg6;
	}
}
