import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bn", name = "G", descriptor = "Lclient!ga;")
	public static Class57 aClass57_7;

	@OriginalMember(owner = "client!bn", name = "I", descriptor = "[I")
	public static int[] anIntArray526 = new int[25];

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(III)Lclient!nk;")
	public static Class122 method4363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub13 local7 = Static52.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass122_1;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "([SZ[Ljava/lang/String;)V")
	public static void method4366(@OriginalArg(0) short[] arg0, @OriginalArg(2) String[] arg1) {
		Static205.method3475(arg0, arg1, 0, arg1.length - 1);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZIIZIZI)V")
	public static void method4369(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg0) {
			Static116.method1937();
		}
		if (Static127.aFrame2 != null && (arg2 != 3 || Static248.anInt2151 != arg3 || Static202.anInt2813 != arg1)) {
			Static249.method3916(Static164.aClass102_2, Static127.aFrame2);
			Static127.aFrame2 = null;
		}
		if (arg2 == 3 && Static127.aFrame2 == null) {
			Static127.aFrame2 = Static56.method1107(Static164.aClass102_2, arg1, 0, arg3);
			if (Static127.aFrame2 != null) {
				Static202.anInt2813 = arg1;
				Static248.anInt2151 = arg3;
				Static108.method1847(Static164.aClass102_2);
			}
		}
		if (arg2 == 3 && Static127.aFrame2 == null) {
			method4369(true, -1, Static119.anInt5242, -1, true, arg5);
			return;
		}
		@Pc(78) Container local78;
		if (Static127.aFrame2 != null) {
			local78 = Static127.aFrame2;
		} else if (Static72.aFrame1 == null) {
			local78 = Static164.aClass102_2.anApplet1;
		} else {
			local78 = Static72.aFrame1;
		}
		Static32.anInt875 = local78.getSize().width;
		Static237.anInt4775 = local78.getSize().height;
		@Pc(100) Insets local100;
		if (Static72.aFrame1 == local78) {
			local100 = Static72.aFrame1.getInsets();
			Static237.anInt4775 -= local100.top + local100.bottom;
			Static32.anInt875 -= local100.left + local100.right;
		}
		if (arg2 < 2) {
			Static237.anInt4772 = (Static32.anInt875 - 765) / 2;
			Static60.anInt1510 = 765;
			Static120.anInt2649 = 503;
			Static14.anInt276 = 0;
		} else {
			Static60.anInt1510 = Static32.anInt875;
			Static14.anInt276 = 0;
			Static237.anInt4772 = 0;
			Static120.anInt2649 = Static237.anInt4775;
		}
		if (arg4) {
			Static142.method2540(Static227.aCanvas1);
			Static184.method3262(Static227.aCanvas1);
			if (Static179.aClass5_1 != null) {
				Static179.aClass5_1.method3848(Static227.aCanvas1);
			}
			Static243.aClient1.method792();
			Static311.method4692(Static227.aCanvas1);
			Static261.method4095(Static227.aCanvas1);
			if (Static179.aClass5_1 != null) {
				Static179.aClass5_1.method3847(Static227.aCanvas1);
			}
		} else {
			if (Static116.aBoolean184) {
				Static116.method1966(Static60.anInt1510, Static120.anInt2649);
			}
			Static227.aCanvas1.setSize(Static60.anInt1510, Static120.anInt2649);
			if (local78 == Static72.aFrame1) {
				local100 = Static72.aFrame1.getInsets();
				Static227.aCanvas1.setLocation(Static237.anInt4772 + local100.left, local100.top + Static14.anInt276);
			} else {
				Static227.aCanvas1.setLocation(Static237.anInt4772, Static14.anInt276);
			}
		}
		if (arg2 == 0 && arg5 > 0) {
			Static116.method1970(Static227.aCanvas1);
		}
		if (arg0 && arg2 > 0) {
			Static227.aCanvas1.setIgnoreRepaint(true);
			if (!Static259.aBoolean342) {
				Static110.method1876();
				Static179.aClass3_1 = null;
				Static179.aClass3_1 = Static255.method4022(Static120.anInt2649, Static60.anInt1510, Static227.aCanvas1);
				Static77.method1441();
				if (Static64.anInt1561 == 5) {
					Static270.method3459(Static237.aClass2_Sub8_Sub5_5, true);
				} else {
					Static63.method1183(Static269.aString179, false);
				}
				try {
					@Pc(253) Graphics local253 = Static227.aCanvas1.getGraphics();
					Static179.aClass3_1.method4440(local253);
				} catch (@Pc(261) Exception local261) {
				}
				Static30.method577();
				if (arg5 == 0) {
					Static179.aClass3_1 = Static255.method4022(503, 765, Static227.aCanvas1);
				} else {
					Static179.aClass3_1 = null;
				}
				@Pc(284) Class111 local284 = Static164.aClass102_2.method2872(Static243.aClient1.getClass());
				while (local284.anInt3788 == 0) {
					Static138.method2475(100L);
				}
				if (local284.anInt3788 == 1) {
					Static259.aBoolean342 = true;
				}
			}
			if (Static259.aBoolean342) {
				Static116.method1978(Static227.aCanvas1, Static214.anInt4370 * 2);
			}
		}
		if (!Static116.aBoolean184 && arg2 > 0) {
			method4369(true, -1, 0, -1, true, arg5);
			return;
		}
		if (arg2 > 0 && arg5 == 0) {
			Static184.aThread3.setPriority(5);
			Static179.aClass3_1 = null;
			Static125.method2266();
			((Class104_Sub1) Static1.anInterface3_1).method4151(200);
			if (Static265.aBoolean348) {
				Static1.method7(0.7F);
			}
			if (Static90.aClass100ArrayArray1 == null) {
				Static90.aClass100ArrayArray1 = new Class100[13][13];
			}
			Static212.method3537();
			Static266.method4175();
			Static76.method1434();
		} else if (arg2 == 0 && arg5 > 0) {
			Static184.aThread3.setPriority(1);
			Static179.aClass3_1 = Static255.method4022(503, 765, Static227.aCanvas1);
			Static125.method2263();
			Static97.method1698();
			((Class104_Sub1) Static1.anInterface3_1).method4151(20);
			if (Static265.aBoolean348) {
				if (Static178.anInt5291 == 1) {
					Static1.method7(0.9F);
				}
				if (Static178.anInt5291 == 2) {
					Static1.method7(0.8F);
				}
				if (Static178.anInt5291 == 3) {
					Static1.method7(0.7F);
				}
				if (Static178.anInt5291 == 4) {
					Static1.method7(0.6F);
				}
			}
			Static314.method4746();
			Static76.method1434();
		}
		Static272.aBoolean360 = !Static69.method2440();
		Static97.method1689(Static60.anInt1510, Static120.anInt2649);
		if (arg0) {
			Static281.method4394();
		}
		if (arg2 < 2) {
			Static194.aBoolean279 = false;
		} else {
			Static194.aBoolean279 = true;
		}
		if (Static303.anInt5868 != -1) {
			Static130.method2397(true);
		}
		if (Static253.aClass34_3 != null && (Static64.anInt1561 == 30 || Static64.anInt1561 == 25)) {
			Static258.method4049();
		}
		for (@Pc(471) int local471 = 0; local471 < 100; local471++) {
			Static293.aBooleanArray23[local471] = true;
		}
		Static218.aBoolean298 = true;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!la;I)V")
	public static void method4370(@OriginalArg(0) Class102 arg0) {
		Static178.anInt5291 = 3;
		@Pc(9) Class110 local9 = null;
		Static253.method3985(true);
		Static201.anInt4203 = 127;
		Static74.aBoolean118 = true;
		Static154.aBoolean236 = true;
		Static265.aBoolean348 = true;
		Static214.anInt4370 = 0;
		Static287.anInt5651 = 255;
		Static262.anInt5150 = 0;
		Static49.aBoolean87 = true;
		Static40.aBoolean64 = true;
		Static206.aBoolean292 = true;
		Static19.aBoolean30 = true;
		Static3.aBoolean8 = true;
		Static185.aBoolean365 = true;
		Static248.anInt2151 = 0;
		Static99.anInt2343 = 127;
		Static202.anInt2813 = 0;
		Static243.anInt4839 = 2;
		Static191.aBoolean276 = true;
		Static226.aBoolean403 = true;
		if (Static167.anInt3694 >= 96) {
			Static97.method1696(2);
		} else {
			Static97.method1696(0);
		}
		Static60.aBoolean96 = false;
		Static261.aBoolean343 = true;
		Static119.anInt5242 = 0;
		Static272.anInt5414 = 0;
		Static215.anInt4387 = 0;
		Static41.aBoolean65 = false;
		Static128.aBoolean205 = false;
		try {
			@Pc(84) Class111 local84 = arg0.method2891("runescape");
			while (local84.anInt3788 == 0) {
				Static138.method2475(1L);
			}
			if (local84.anInt3788 == 1) {
				local9 = (Class110) local84.anObject4;
				@Pc(111) byte[] local111 = new byte[(int) local9.method3096()];
				@Pc(128) int local128;
				for (@Pc(113) int local113 = 0; local113 < local111.length; local113 += local128) {
					local128 = local9.method3097(local113, local111, local111.length - local113);
					if (local128 == -1) {
						throw new IOException("EOF");
					}
				}
				Static273.method4314(new Class2_Sub16(local111));
			}
		} catch (@Pc(151) Exception local151) {
		}
		try {
			if (local9 != null) {
				local9.method3098();
			}
		} catch (@Pc(159) Exception local159) {
		}
	}

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "(B)V")
	public static void method4372() {
		for (@Pc(3) int local3 = 0; local3 < Static222.anInt4523; local3++) {
			@Pc(22) int local22 = Static132.anIntArray303[local3];
			@Pc(26) Class15_Sub2_Sub2 local26 = Static188.aClass15_Sub2_Sub2Array41[local22];
			@Pc(30) int local30 = Static91.aClass2_Sub16_Sub1_1.method2146();
			if ((local30 & 0x2) != 0) {
				local30 += Static91.aClass2_Sub16_Sub1_1.method2146() << 8;
			}
			Static210.method3510(local22, local30, local26);
		}
	}

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "(I)V")
	public static void method4373() {
		Static21.aString22 = "Benutzen";
		Static174.aString129 = "Spielwelt erstellt.";
		Static50.aString48 = "leuchten2:";
		Static108.aString89 = "Mechscape wird geladen - bitte warten...";
		Static92.aString80 = "Weiter";
		Static85.aString68 = "Update-Liste geladen.";
		Static268.aString178 = "Sprites geladen.";
		Static30.aString28 = "Lade Benutzeroberfläche - ";
		Static234.aString161 = "Untersuchen";
		Static131.aString101 = "Lade...";
		Static82.aString67 = "Hierhin gehen";
		Static190.aString135 = "T";
		Static42.aString46 = "Lade Titelbild - ";
		Static33.aString37 = " weitere Optionen";
		Static282.aString198 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
		Static183.aString131 = "blinken3:";
		Static52.aString49 = "Angreifen";
		Static277.aString190 = "rot:";
		Static4.aString2 = "schütteln:";
		Static242.aString164 = "Texturen geladen.";
		Static230.aString159 = "Fallen lassen";
		Static151.aString114 = "Starte 3D-Softwarebibliothek.";
		Static270.aString143 = "Kampfstufe: ";
		Static243.aString166 = " zuerst von deiner Freunde-Liste!";
		Static78.aString19 = "Lade Konfiguration - ";
		Static278.aString191 = "welle2:";
		Static148.aString112 = "Lade Sprites - ";
		Static155.aString116 = "lila:";
		Static54.aString50 = "3D-Softwarebibliothek gestartet.";
		Static257.aString169 = "Suche nach Updates - ";
		Static58.aString52 = " steht bereits auf deiner Ignorieren-Liste!";
		Static280.aString195 = "Bitte entferne ";
		Static285.aString199 = " zuerst von deiner Ignorieren-Liste!";
		Static193.aString138 = "M";
		Static251.aString168 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
		Static10.aString11 = "gleiten:";
		Static61.aString55 = "Versteckt";
		Static277.aString189 = " loggt sich ein.";
		Static148.aString111 = "Lade Texturen - ";
		Static164.aString126 = "weiss:";
		Static197.aString139 = "Spieler kann nicht gefunden werden: ";
		Static29.aString27 = "Verbindung zum Update-Server hergestellt.";
		Static173.aString127 = "Auswählen";
		Static192.aString136 = "Nehmen";
		Static37.aString42 = "Wordpack geladen.";
		Static220.aString154 = "Konfig geladen.";
		Static29.aString26 = "Hierhin drehen";
		Static153.aString115 = "Okay";
		Static193.aString137 = "Fertigkeit: ";
		Static131.aString103 = "leuchten1:";
		Static312.aString171 = "Musik-Engine vorbereitet.";
		Static228.aString157 = "blinken2:";
		Static42.aString45 = "scrollen:";
		Static226.aString208 = "M";
		Static89.aString77 = "Speicher wird zugewiesen.";
		Static274.aString187 = "Stufe: ";
		Static130.aString100 = " loggt sich aus.";
		Static63.aString57 = "gelb:";
		Static269.aString179 = "Ladevorgang - bitte warte.";
		Static213.aString148 = "Lade Standardeinstellungen - ";
		Static237.aString163 = "Ablegen";
		Static160.aString173 = "Liste der Welten geladen";
		Static189.aString133 = "RuneScape wird geladen - bitte warten...";
		Static151.aString113 = "Eingabeprozedur geladen.";
		Static68.aString64 = "Schließen";
		Static304.aString205 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
		Static275.aString188 = "T";
		Static203.aString144 = "Lade Wordpack - ";
		Static57.aString51 = "blinken1:";
		Static18.aString17 = "Lade Liste der Welten";
		Static68.aString65 = "Abbrechen";
		Static25.aString23 = "leuchten3:";
		Static61.aString54 = "Bitte entferne ";
		Static107.aString87 = "Schriftsätze geladen.";
		Static131.aString102 = "Standardeinstellungen geladen";
		Static64.aString58 = "Titelbild geöffnet.";
		Static95.aString82 = "blaugrün:";
		Static3.aString1 = "Titelbild geladen.";
		Static178.aString180 = "Lade Schriftsätze - ";
		Static225.aString183 = "Verbindung abgebrochen.";
		Static287.aString200 = "Bitte warte...";
		Static34.aString38 = "Benutzeroberfläche geladen.";
		Static134.aString108 = "Verbindung mit Update-Server...";
		Static225.aString182 = "welle:";
		Static260.aString172 = ": ";
		Static9.aString106 = " steht bereits auf deiner Freunde-Liste!";
		Static180.aString130 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
		Static280.aString193 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
		Static131.aString104 = "Gegenstand für Mitglieder";
		Static206.aString147 = "Zugewiesener Speicher.";
		Static295.aString203 = "grün:";
		Static204.aString145 = "Wähl eine Option";
	}
}
