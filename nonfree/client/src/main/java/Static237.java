import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!pr", name = "m", descriptor = "Lclient!cq;")
	public static Class8 aClass8_22;

	@OriginalMember(owner = "client!pr", name = "x", descriptor = "Lclient!lm;")
	public static Class134 aClass134_112;

	@OriginalMember(owner = "client!pr", name = "n", descriptor = "I")
	public static int anInt4904 = 0;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)V")
	public static void method4320() {
		for (@Pc(11) int local11 = 0; local11 < Static62.anInt6674; local11++) {
			@Pc(17) int local17 = Static312.anIntArray623[local11];
			@Pc(21) Class10_Sub1_Sub2_Sub2 local21 = Static202.aClass10_Sub1_Sub2_Sub2Array1[local17];
			@Pc(25) int local25 = Static142.aClass1_Sub21_Sub2_1.method5720();
			if ((local25 & 0x2) != 0) {
				local25 += Static142.aClass1_Sub21_Sub2_1.method5720() << 8;
			}
			Static74.method1294(local25, local21, local17);
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)V")
	public static void method4322(@OriginalArg(0) int arg0) {
		@Pc(5) Class220 local5 = Static112.aClass220_1;
		synchronized (Static112.aClass220_1) {
			Static134.anInt2646 = arg0;
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)V")
	public static void method4323() {
		Static269.aClass37_88.method919();
		Static44.aClass37_21.method919();
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!ps;IIB)V")
	public static void method4325(@OriginalArg(0) Class163 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static116.anInt2236 = arg2;
		Static137.anInt5688 = arg1;
		Static284.aClass163_18 = arg0;
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(B)V")
	public static void method4326() {
		Static130.aString185 = "Chargement des textures - ";
		Static111.aString84 = "Impossible de trouver ";
		Static144.aString109 = " est déjà dans votre liste noire.";
		Static105.aString79 = "Connecté au serveur de mise à jour";
		Static213.aString172 = "Jeter";
		Static1.aString1 = "violet:";
		Static201.aString269 = "brillant3:";
		Static92.aString69 = "Connexion au serveur de mise à jour en cours";
		Static176.aString138 = "Écran-titre ouvert";
		Static115.aString88 = "Chargement des sprites - ";
		Static175.aString137 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
		Static161.aString123 = " s'est connecté.";
		Static115.aString89 = "Liste des serveurs chargée";
		Static329.aString252 = "brillant1:";
		Static319.aString120 = "Utiliser";
		Static28.aString19 = "Gestionnaire de saisie chargé";
		Static131.aString101 = "Écran-titre chargé";
		Static12.aString7 = "M";
		Static15.aString10 = "Chargement de Mechscape en cours - veuillez patienter...";
		Static317.aString247 = "jaune:";
		Static73.aString33 = "Interfaces chargées";
		Static79.aString272 = "K";
		Static50.aString43 = "Veuillez patienter - tentative de rétablissement.";
		Static352.aString274 = "Chargement des polices - ";
		Static19.aString13 = "Chargement en cours...";
		Static115.aString87 = "Mémoire en cours d'attribution";
		Static144.aString108 = "Chargement de l'écran-titre - ";
		Static76.aString58 = "ondulation2:";
		Static144.aString110 = "Annuler";
		Static56.aString47 = "Prendre";
		Static148.aString111 = "Choisir une option";
		Static351.aString151 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
		Static67.aString54 = "déroulement:";
		Static29.aString21 = "brillant2:";
		Static340.aString261 = "Fermer";
		Static259.aString205 = "Connexion perdue.";
		Static29.aString20 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
		Static339.aString259 = "rouge:";
		Static89.aString68 = "Liste des mises à jour chargée";
		Static339.aString258 = "Mémoire attribuée";
		Static163.aString124 = " s'est déconnecté.";
		Static41.aString40 = "Attaquer";
		Static194.aString155 = "Module texte chargé";
		Static59.aString50 = "clignotant1:";
		Static4.aString2 = "tremblement:";
		Static170.aString129 = "Objet d'abonnés";
		Static233.aString183 = "Poser";
		Static178.aString139 = "Sprites chargés";
		Static295.aString236 = "Démarrage de la librairie 3D";
		Static256.aString202 = "Moteur son préparé";
		Static230.aString182 = "OK";
		Static121.aString159 = "Veuillez patienter...";
		Static205.aString163 = "K";
		Static207.aString165 = "Monde de jeu créé";
		Static96.aString74 = "Chargement des interfaces - ";
		Static293.aString232 = "Chargement des fichiers config - ";
		Static204.aString275 = " de votre liste d'amis.";
		Static82.aString61 = "glissement:";
		Static51.aString44 = "vert:";
		Static77.aString60 = "Variables du client chargées";
		Static184.aString140 = "Vérification des mises à jour - ";
		Static39.aString35 = "Caché";
		Static22.aString15 = "Chargement des paramètres par défaut - ";
		Static259.aString206 = "Votre liste noire est pleine (100 noms maximum).";
		Static114.aString86 = "blanc:";
		Static315.aString245 = "Polices chargées";
		Static143.aString105 = "Continuer";
		Static250.aString198 = "Chargement de RuneScape en cours - veuillez patienter...";
		Static124.aString96 = "clignotant2:";
		Static306.aString241 = "Sélectionner";
		Static204.aString276 = " ";
		Static289.aString227 = " de votre liste noire.";
		Static101.aString78 = "Chargement en cours. Veuillez patienter.";
		Static166.aString127 = "M";
		Static335.aString254 = "compétence ";
		Static53.aString45 = "Chargement du module texte - ";
		Static97.aString76 = "clignotant3:";
		Static99.aString77 = "Examiner";
		Static143.aString106 = " est déjà dans votre liste d'amis.";
		Static221.aString177 = " autres options";
		Static235.aString243 = "Textures chargées";
		Static321.aString249 = "cyan:";
		Static185.aString141 = "Veuillez commencer par supprimer ";
		Static266.aString214 = "Paramètres par défaut chargés";
		Static62.aString271 = "Atteindre";
		Static306.aString242 = "Fichiers config chargés";
		Static246.aString197 = "niveau ";
		Static276.aString220 = "Librairie 3D démarrée";
		Static245.aString37 = "Veuillez commencer par supprimer ";
		Static340.aString260 = "Regarder dans cette direction";
		Static146.aString181 = "ondulation:";
		Static55.aString46 = "Chargement de la liste des serveurs";
		Static208.aString167 = "classement ";
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIIIIII)V")
	public static void method4327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static178.anInt3756 = arg5;
		Static187.anInt3910 = arg2;
		Static332.anInt6446 = arg0;
		Static303.anInt6075 = arg3;
		Static350.anInt4390 = arg1;
		Static130.anInt4852 = arg4;
	}
}
