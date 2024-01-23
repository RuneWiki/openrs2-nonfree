import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!um", name = "T", descriptor = "[I")
	public static int[] anIntArray585;

	@OriginalMember(owner = "client!um", name = "Y", descriptor = "Lclient!bi;")
	public static Class9 aClass9_2;

	@OriginalMember(owner = "client!um", name = "Z", descriptor = "F")
	public static float aFloat193;

	@OriginalMember(owner = "client!um", name = "cb", descriptor = "Z")
	public static boolean aBoolean312 = false;

	@OriginalMember(owner = "client!um", name = "e", descriptor = "(B)I")
	public static int method4571() {
		try {
			if (Static70.anInt1763 == 0) {
				if (Static138.aLong105 > Static294.method4792() - 5000L) {
					return 0;
				}
				Static36.aClass43_1 = Static43.aClass66_1.method1616(Static23.anInt486, Static34.aString31);
				Static158.aLong127 = Static294.method4792();
				Static70.anInt1763 = 1;
			}
			if (Static158.aLong127 + 30000L < Static294.method4792()) {
				return Static272.method4543(1000);
			}
			@Pc(83) int local83;
			@Pc(132) int local132;
			if (Static70.anInt1763 == 1) {
				if (Static36.aClass43_1.anInt1456 == 2) {
					return Static272.method4543(1001);
				}
				if (Static36.aClass43_1.anInt1456 != 1) {
					return -1;
				}
				local83 = 0;
				Static22.aClass41_1 = new Class41((Socket) Static36.aClass43_1.anObject3, Static43.aClass66_1);
				if (Static36.aBoolean66) {
					local83 = Static129.anInt2870;
				}
				Static36.aClass43_1 = null;
				Static81.aClass1_Sub16_Sub1_1.anInt3328 = 0;
				Static81.aClass1_Sub16_Sub1_1.method2621(23);
				Static81.aClass1_Sub16_Sub1_1.method2606(local83);
				Static22.aClass41_1.method1068(Static81.aClass1_Sub16_Sub1_1.aByteArray39, Static81.aClass1_Sub16_Sub1_1.anInt3328);
				if (aClass9_2 != null) {
					aClass9_2.method4341();
				}
				if (Static264.aClass9_1 != null) {
					Static264.aClass9_1.method4341();
				}
				local132 = Static22.aClass41_1.method1066();
				if (aClass9_2 != null) {
					aClass9_2.method4341();
				}
				if (Static264.aClass9_1 != null) {
					Static264.aClass9_1.method4341();
				}
				if (local132 != 0) {
					return Static272.method4543(local132);
				}
				Static70.anInt1763 = 2;
			}
			if (Static70.anInt1763 == 2) {
				if (Static22.aClass41_1.method1067() < 2) {
					return -1;
				}
				Static90.anInt2098 = Static22.aClass41_1.method1066();
				Static90.anInt2098 <<= 0x8;
				Static90.anInt2098 += Static22.aClass41_1.method1066();
				Static138.aByteArray37 = new byte[Static90.anInt2098];
				Static202.anInt4504 = 0;
				Static70.anInt1763 = 3;
			}
			if (Static70.anInt1763 != 3) {
				return -1;
			}
			local83 = Static22.aClass41_1.method1067();
			if (local83 < 1) {
				return -1;
			}
			if (local83 > Static90.anInt2098 - Static202.anInt4504) {
				local83 = Static90.anInt2098 - Static202.anInt4504;
			}
			Static22.aClass41_1.method1059(local83, Static138.aByteArray37, Static202.anInt4504);
			Static202.anInt4504 += local83;
			if (Static90.anInt2098 > Static202.anInt4504) {
				return -1;
			} else if (Static138.method2380(Static138.aByteArray37)) {
				Static160.aClass140_Sub1Array2 = new Class140_Sub1[Static205.anInt4565];
				local132 = 0;
				for (@Pc(257) int local257 = Static299.anInt6238; local257 <= Static177.anInt3990; local257++) {
					@Pc(264) Class140_Sub1 local264 = Static65.method323(local257);
					if (local264 != null) {
						Static160.aClass140_Sub1Array2[local132++] = local264;
					}
				}
				Static22.aClass41_1.method1062();
				Static70.anInt1763 = 0;
				Static22.aClass41_1 = null;
				Static138.aByteArray37 = null;
				Static83.anInt1982 = 0;
				Static138.aLong105 = Static294.method4792();
				return 0;
			} else {
				return Static272.method4543(1002);
			}
		} catch (@Pc(296) IOException local296) {
			return Static272.method4543(1003);
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method4572(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(4) Class1_Sub2_Sub6 local4 = Static104.method831(arg1, 3);
		local4.method1192();
		local4.aString50 = arg0;
	}

	@OriginalMember(owner = "client!um", name = "h", descriptor = "(I)V")
	public static void method4575() {
		Static106.aClass155_18.method4362();
	}

	@OriginalMember(owner = "client!um", name = "f", descriptor = "(B)V")
	public static void method4577() {
		Static190.aString125 = "rot:";
		Static250.aString55 = "Update-Liste geladen.";
		Static271.aString191 = "T";
		Static77.aString60 = "Lade Konfiguration - ";
		Static258.aString183 = "Konfig geladen.";
		Static285.aString195 = "blinken3:";
		Static257.aString182 = "grün:";
		Static56.aString47 = "Versteckt";
		Static133.aString82 = "Hierhin gehen";
		Static254.aString170 = "Schließen";
		Static141.aString94 = "Wähl eine Option";
		Static56.aString48 = " weitere Optionen";
		Static190.aString124 = " steht bereits auf deiner Ignorieren-Liste!";
		Static141.aString93 = " zuerst von deiner Ignorieren-Liste!";
		Static44.aString44 = "Bitte warte...";
		Static143.aString96 = "gelb:";
		Static115.aString77 = "Lade Texturen - ";
		Static181.aString120 = "gleiten:";
		Static140.aString92 = "Untersuchen";
		Static205.aString146 = "Starte 3D-Softwarebibliothek.";
		Static234.aString163 = "Kampfstufe: ";
		Static267.aString100 = "M";
		Static61.aString49 = "Lade Liste der Welten";
		Static173.aString113 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
		Static209.aString148 = "Verbindung abgebrochen.";
		Static227.aString158 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
		Static19.aString12 = "Ladevorgang - bitte warte.";
		Static252.aString177 = "Lade...";
		Static140.aString91 = "Auswählen";
		Static134.aString83 = " steht bereits auf deiner Freunde-Liste!";
		Static10.aString8 = "3D-Softwarebibliothek gestartet.";
		Static219.aString152 = "Gegenstand für Mitglieder";
		Static84.aString57 = "Benutzeroberfläche geladen.";
		Static87.aString59 = "Lade Benutzeroberfläche - ";
		Static5.aString3 = "Benutzen";
		Static102.aString73 = "Lade Titelbild - ";
		Static86.aString58 = "Bitte entferne ";
		Static181.aString119 = "Wordpack geladen.";
		Static167.aString111 = "Angreifen";
		Static268.aString190 = "Musik-Engine vorbereitet.";
		Static160.aString109 = "welle2:";
		Static177.aString116 = "Standardinstellungen geladen";
		Static6.aString75 = "RuneScape wird geladen - bitte warten...";
		Static199.aString141 = "Lade Schriftsätze - ";
		Static251.aString174 = "Okay";
		Static4.aString2 = "leuchten3:";
		Static31.aString29 = "weiss:";
		Static266.aString188 = "Spielwelt erstellt.";
		Static156.aString105 = "blinken1:";
		Static266.aString189 = "Abbrechen";
		Static39.aString41 = "Suche nach Updates - ";
		Static20.aString181 = "Lade Wordpack - ";
		Static50.aString46 = "Weiter";
		Static254.aString171 = "Verbindung zum Update-Server hergestellt.";
		Static256.aString179 = "scrollen:";
		Static158.aString107 = "Texturen geladen.";
		Static255.aString178 = "lila:";
		Static171.aString112 = "leuchten2:";
		Static194.aString137 = "leuchten1:";
		Static150.aString53 = "T";
		Static247.aString172 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
		Static202.aString142 = "Ablegen";
		Static39.aString40 = "blaugrün:";
		Static188.aString122 = "Speicher wird zugewiesen.";
		Static180.aString118 = "Fertigkeit: ";
		Static94.aString198 = "Schriftsätze geladen.";
		Static175.aString115 = "Nehmen";
		Static224.aString153 = "Liste der Welten geladen";
		Static245.aString168 = "Fallen lassen";
		Static282.aString194 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
		Static19.aString13 = "Sprites geladen.";
		Static231.aString173 = " loggt sich ein.";
		Static226.aString155 = "Stufe: ";
		Static232.aString161 = " loggt sich aus.";
		Static186.aString121 = "Lade Standardeinstellungen - ";
		Static174.aString114 = "Bitte entferne ";
		Static254.aString169 = "Zugewiesener Speicher.";
		Static295.aString90 = "blinken2:";
		Static36.aString38 = "welle:";
		Static110.aString76 = "möchte mit dir handeln.";
		Static287.aString196 = "Titelbild geöffnet.";
		Static217.aString150 = "Eingabeprozedur geladen.";
		Static147.aString101 = "schütteln:";
		Static23.aString14 = "Titelbild geladen.";
		Static159.aString108 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
		Static200.aString104 = "Lade Sprites - ";
		Static265.aString186 = "Hierhin drehen";
		Static115.aString78 = ": ";
		Static245.aString167 = " zuerst von deiner Freunde-Liste!";
		Static204.aString144 = "Spieler kann nicht gefunden werden: ";
		Static199.aString140 = "Verbindung mit Update-Server...";
		Static25.aString18 = "M";
	}
}
