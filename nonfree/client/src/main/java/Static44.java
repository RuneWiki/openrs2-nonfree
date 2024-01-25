import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!cn", name = "z", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger3 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!cn", name = "O", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray25 = new String[100];

	@OriginalMember(owner = "client!cn", name = "P", descriptor = "I")
	public static int anInt3898 = 20;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIIII)V")
	public static void method3563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static133.method5819(Static334.anInt6315, arg3, Static314.anInt6018);
		@Pc(17) int local17 = Static133.method5819(Static334.anInt6315, arg2, Static314.anInt6018);
		@Pc(23) int local23 = Static133.method5819(Static80.anInt4809, arg4, Static184.anInt6250);
		@Pc(37) int local37 = Static133.method5819(Static80.anInt4809, arg1, Static184.anInt6250);
		@Pc(45) int local45 = Static133.method5819(Static334.anInt6315, arg5 + arg3, Static314.anInt6018);
		@Pc(53) int local53 = Static133.method5819(Static334.anInt6315, arg2 - arg5, Static314.anInt6018);
		for (@Pc(55) int local55 = local11; local55 < local45; local55++) {
			Static247.method3552(arg0, local23, Static332.anIntArrayArray56[local55], local37);
		}
		for (@Pc(71) int local71 = local17; local71 > local53; local71--) {
			Static247.method3552(arg0, local23, Static332.anIntArrayArray56[local71], local37);
		}
		@Pc(97) int local97 = Static133.method5819(Static80.anInt4809, arg5 + arg4, Static184.anInt6250);
		@Pc(106) int local106 = Static133.method5819(Static80.anInt4809, arg1 - arg5, Static184.anInt6250);
		for (@Pc(108) int local108 = local45; local108 <= local53; local108++) {
			@Pc(114) int[] local114 = Static332.anIntArrayArray56[local108];
			Static247.method3552(arg0, local23, local114, local97);
			Static247.method3552(arg0, local106, local114, local37);
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILclient!bo;)I")
	public static int method3564(@OriginalArg(1) Class25_Sub1_Sub1 arg0) {
		if (arg0.anInt5308 == 0) {
			return 0;
		}
		@Pc(37) int local37;
		@Pc(44) int local44;
		if (arg0.anInt5332 != -1 && arg0.anInt5332 < 32768) {
			@Pc(28) Class25_Sub1_Sub1_Sub2 local28 = Static188.aClass25_Sub1_Sub1_Sub2Array1[arg0.anInt5332];
			if (local28 != null) {
				local37 = arg0.anInt5769 - local28.anInt5769;
				local44 = arg0.anInt5773 - local28.anInt5773;
				if (local37 != 0 || local44 != 0) {
					arg0.method4653((int) (Math.atan2((double) local37, (double) local44) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		@Pc(75) int local75;
		if (arg0.anInt5332 >= 32768) {
			local75 = arg0.anInt5332 - 32768;
			if (local75 == Static99.anInt2186) {
				local75 = 2047;
			}
			@Pc(84) Class25_Sub1_Sub1_Sub1 local84 = Static312.aClass25_Sub1_Sub1_Sub1Array1[local75];
			if (local84 != null) {
				local44 = arg0.anInt5769 - local84.anInt5769;
				@Pc(100) int local100 = arg0.anInt5773 - local84.anInt5773;
				if (local44 != 0 || local100 != 0) {
					arg0.method4653((int) (Math.atan2((double) local44, (double) local100) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if ((arg0.anInt5295 != 0 || arg0.anInt5309 != 0) && (arg0.anInt5337 == 0 || arg0.anInt5334 > 0)) {
			local75 = arg0.anInt5769 - (arg0.anInt5295 - Static263.anInt5063 - Static263.anInt5063) * 64;
			local37 = arg0.anInt5773 - (arg0.anInt5309 - Static28.anInt773 - Static28.anInt773) * 64;
			if (local75 != 0 || local37 != 0) {
				arg0.method4653((int) (Math.atan2((double) local75, (double) local37) * 2607.5945876176133D) & 0x3FFF);
			}
			arg0.anInt5309 = 0;
			arg0.anInt5295 = 0;
		}
		return arg0.method4651();
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method3566(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - arg1;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!cn", name = "e", descriptor = "(I)V")
	public static void method3567() {
		Static260.aString370 = " autres options";
		Static139.aString355 = "brillant1:";
		Static344.aString62 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
		Static118.aString158 = "Textures chargées";
		Static4.aString1 = "Chargement de la liste des serveurs";
		Static67.aString96 = "Gestionnaire de saisie chargé";
		Static314.aString341 = "Variables du client chargées";
		Static226.aString260 = "Fermer";
		Static283.aString315 = "déroulement:";
		Static90.aString252 = " est déjà dans votre liste noire.";
		Static47.aString65 = "Votre liste noire est pleine (100 noms maximum).";
		Static251.aString289 = "Impossible de trouver ";
		Static122.aString169 = "Librairie 3D démarrée";
		Static350.aString377 = " de votre liste d'amis.";
		Static181.aString217 = "Veuillez commencer par supprimer ";
		Static139.aString354 = "Examiner";
		Static91.aString127 = " est déjà dans votre liste d'amis.";
		Static145.aString359 = "tremblement:";
		Static261.aString297 = "Connecté au serveur de mise à jour";
		Static197.aString228 = "Annuler";
		Static286.aString319 = "ondulation:";
		Static106.aString146 = "Poser";
		Static290.aString323 = "K";
		Static243.aString275 = "Écran-titre chargé";
		Static248.aString284 = "Attaquer";
		Static38.aString59 = "Module texte chargé";
		Static64.aString93 = "Chargement de l'écran-titre - ";
		Static99.aString132 = "OK";
		Static135.aString176 = "Mémoire en cours d'attribution";
		Static35.aString55 = "Chargement de RuneScape en cours - veuillez patienter...";
		Static276.aString310 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
		Static295.aString328 = "Chargement des interfaces - ";
		Static129.aString172 = "Jeter";
		Static348.aString375 = "Mémoire attribuée";
		Static25.aString38 = "rouge:";
		Static73.aString105 = "cyan:";
		Static135.aString175 = "M";
		Static133.aString380 = "Connexion au serveur de mise à jour en cours";
		Static57.aString81 = "K";
		Static59.aString83 = "Chargement des paramètres par défaut - ";
		Static68.aString98 = "Connexion perdue.";
		Static120.aString162 = "blanc:";
		Static8.aString9 = "Paramètres par défaut chargés";
		Static211.aString243 = " s'est déconnecté.";
		Static20.aString33 = "clignotant2:";
		Static183.aString219 = " s'est connecté.";
		Static214.aString245 = "Veuillez patienter...";
		Static231.aString264 = "Moteur son préparé";
		Static230.aString263 = "glissement:";
		Static180.aString213 = "Polices chargées";
		Static64.aString92 = "Veuillez commencer par supprimer ";
		Static268.aString379 = "Écran-titre ouvert";
		Static136.aString177 = "Atteindre";
		Static199.aString230 = "Chargement des polices - ";
		Static336.aString312 = "Vérification des mises à jour - ";
		Static117.aString157 = "Liste des mises à jour chargée";
		Static47.aString66 = "Chargement en cours...";
		Static103.aString140 = "Choisir une option";
		Static195.aString226 = "classement ";
		Static246.aString281 = "Chargement du module texte - ";
		Static240.aString268 = "jaune:";
		Static22.aString35 = "Sélectionner";
		Static192.aString223 = "Monde de jeu créé";
		Static120.aString161 = "brillant3:";
		Static27.aString306 = "niveau ";
		Static180.aString212 = "Chargement des sprites - ";
		Static13.aString29 = "brillant2:";
		Static285.aString334 = "Interfaces chargées";
		Static260.aString371 = "ondulation2:";
		Static216.aString250 = " ";
		Static287.aString321 = "Chargement des textures - ";
		Static121.aString166 = "Utiliser";
		Static158.aString195 = "Chargement des fichiers config - ";
		Static324.aString352 = "clignotant1:";
		Static353.aString381 = "M";
		Static83.aString122 = "Caché";
		Static63.aString87 = "Veuillez patienter - tentative de rétablissement.";
		Static32.aString52 = "compétence ";
		Static35.aString56 = "Objet d'abonnés";
		Static261.aString296 = "Regarder dans cette direction";
		Static252.aString290 = "Démarrage de la librairie 3D";
		Static334.aString363 = "Chargement en cours. Veuillez patienter.";
		Static177.aString150 = "Prendre";
		Static238.aString267 = "clignotant3:";
		Static312.aString340 = "violet:";
		Static202.aString232 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
		Static273.aString307 = "Liste des serveurs chargée";
		Static222.aString257 = "Fichiers config chargés";
		Static121.aString167 = "Sprites chargés";
		Static341.aString366 = "Chargement de Mechscape en cours - veuillez patienter...";
		Static264.aString193 = "Continuer";
		Static162.aString200 = " de votre liste noire.";
		Static346.aString372 = "vert:";
	}
}
