import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!hp", name = "f", descriptor = "F")
	public static float aFloat59;

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "[I")
	public static final int[] anIntArray302 = new int[14];

	@OriginalMember(owner = "client!hp", name = "e", descriptor = "Lclient!vq;")
	public static final Class211 aClass211_20 = new Class211();

	@OriginalMember(owner = "client!hp", name = "g", descriptor = "Lclient!ce;")
	public static final Class31 aClass31_7 = new Class31(64);

	@OriginalMember(owner = "client!hp", name = "h", descriptor = "Z")
	public static boolean aBoolean191 = false;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!ec;B)V")
	public static void method2428(@OriginalArg(0) Class6_Sub10 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static354.anInt6364; local7++) {
			@Pc(13) int local13 = arg0.method4017();
			@Pc(17) int local17 = arg0.method4021();
			if (local17 == 65535) {
				local17 = -1;
			}
			if (Static233.aClass64_Sub1Array2[local13] != null) {
				Static233.aClass64_Sub1Array2[local13].anInt2852 = local17;
			}
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method2429(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < local8; local20++) {
			local18 = (local18 << 5) + arg0.charAt(local20) - local18;
		}
		return local18;
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)V")
	public static void method2431() {
		Static334.aString295 = "Chargement de RuneScape en cours - veuillez patienter...";
		Static271.aString214 = "Chargement des textures - ";
		Static256.aString200 = "Monde de jeu créé";
		Static12.aString13 = "brillant2:";
		Static108.aString78 = "Chargement des interfaces - ";
		Static88.aString59 = "rouge:";
		Static142.aString112 = "Démarrage de la librairie 3D";
		Static277.aString226 = "Chargement du module texte - ";
		Static288.aString237 = "Votre liste noire est pleine (100 noms maximum).";
		Static323.aString277 = "Écran-titre ouvert";
		Static180.aString166 = "jaune:";
		Static299.aString255 = "niveau ";
		Static95.aString63 = "Prendre";
		Static275.aString221 = "clignotant3:";
		Static120.aString92 = "Moteur son préparé";
		Static255.aString199 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
		Static17.aString299 = " de votre liste d'amis.";
		Static309.aString268 = "Caché";
		Static125.aString93 = "Connexion perdue.";
		Static110.aString81 = "Chargement en cours...";
		Static174.aString138 = "Connecté au serveur de mise à jour";
		Static3.aString3 = "Connexion au serveur de mise à jour en cours";
		Static80.aString259 = "cyan:";
		Static76.aString123 = "Librairie 3D démarrée";
		Static153.aString126 = "Examiner";
		Static108.aString77 = "Attaquer";
		Static47.aString37 = "Mémoire attribuée";
		Static291.aString241 = "Gestionnaire de saisie chargé";
		Static1.aString1 = "Regarder dans cette direction";
		Static217.aString171 = "M";
		Static40.aString32 = "Annuler";
		Static117.aString89 = "Vérification des mises à jour - ";
		Static204.aString160 = "clignotant2:";
		Static59.aString45 = "blanc:";
		Static41.aString308 = "Veuillez patienter - tentative de rétablissement.";
		Static218.aString173 = "OK";
		Static141.aString109 = "Sprites chargés";
		Static312.aString269 = "Chargement de Mechscape en cours - veuillez patienter...";
		Static184.aString142 = " ";
		Static171.aString133 = "Chargement en cours. Veuillez patienter.";
		Static338.aString298 = "K";
		Static292.aString244 = "Textures chargées";
		Static351.aString303 = "Sélectionner";
		Static239.aString306 = "compétence ";
		Static209.aString165 = " s'est connecté.";
		Static209.aString164 = "Mémoire en cours d'attribution";
		Static155.aString236 = "brillant3:";
		Static43.aString35 = "Interfaces chargées";
		Static306.aString265 = "violet:";
		Static113.aString84 = "brillant1:";
		Static337.aString297 = "Veuillez commencer par supprimer ";
		Static165.aString287 = "Utiliser";
		Static283.aString227 = "Chargement des fichiers config - ";
		Static354.aString307 = "Chargement de la liste des serveurs";
		Static5.aString8 = "ondulation2:";
		Static318.aString273 = "clignotant1:";
		Static294.aString248 = "Variables du client chargées";
		Static141.aString106 = "déroulement:";
		Static164.aString128 = " est déjà dans votre liste d'amis.";
		Static294.aString247 = "K";
		Static241.aString274 = "Impossible de trouver ";
		Static141.aString107 = "Paramètres par défaut chargés";
		Static316.aString271 = "Veuillez patienter...";
		Static267.aString211 = "Poser";
		Static239.aString305 = "Fermer";
		Static127.aString182 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
		Static284.aString230 = "M";
		Static186.aString143 = "Liste des serveurs chargée";
		Static269.aString215 = "glissement:";
		Static68.aString179 = " de votre liste noire.";
		Static84.aString55 = "classement ";
		Static82.aString54 = "Veuillez commencer par supprimer ";
		Static141.aString108 = " est déjà dans votre liste noire.";
		Static217.aString172 = " s'est déconnecté.";
		Static86.aString57 = "Polices chargées";
		Static340.aString26 = "Objet d'abonnés";
		Static275.aString222 = " autres options";
		Static128.aString97 = "Chargement de l'écran-titre - ";
		Static150.aString121 = "Choisir une option";
		Static54.aString43 = "Fichiers config chargés";
		Static295.aString252 = "Atteindre";
		Static200.aString157 = "Chargement des sprites - ";
		Static273.aString296 = "Écran-titre chargé";
		Static296.aString279 = "tremblement:";
		Static301.aString260 = "Chargement des paramètres par défaut - ";
		Static189.aString152 = "Liste des mises à jour chargée";
		Static44.aString36 = "vert:";
		Static252.aString198 = "Module texte chargé";
		Static302.aString263 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
		Static286.aString232 = "Continuer";
		Static196.aString156 = "ondulation:";
		Static40.aString33 = "Jeter";
		Static275.aString223 = "Chargement des polices - ";
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIIZZ)V")
	public static void method2432(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4) {
		Static310.anInt5828 = arg0;
		Static163.anInt3084 = arg1;
		Static30.anInt573 = arg2;
		Static321.aClass187ArrayArrayArray3 = new Class187[4][Static310.anInt5828][Static163.anInt3084];
		Static99.aClass106Array4 = new Class106[4];
		if (arg3) {
			Static287.aClass187ArrayArrayArray2 = new Class187[1][Static310.anInt5828][Static163.anInt3084];
			Static291.anIntArrayArray183 = new int[Static310.anInt5828][Static163.anInt3084];
			Static84.aClass106Array1 = new Class106[1];
		} else {
			Static287.aClass187ArrayArrayArray2 = null;
			Static291.anIntArrayArray183 = null;
			Static84.aClass106Array1 = null;
		}
		if (arg4) {
			Static174.anIntArrayArrayArray4 = new int[4][arg0][arg1];
			Static240.aClass6_Sub17_Sub1Array4 = new Class6_Sub17_Sub1[255];
			Static29.aBooleanArray9 = new boolean[255];
			Static105.anInt1943 = 0;
		} else {
			Static174.anIntArrayArrayArray4 = null;
			Static240.aClass6_Sub17_Sub1Array4 = null;
			Static29.aBooleanArray9 = null;
			Static105.anInt1943 = 0;
		}
		Static44.method762(false);
		Static52.aClass151Array1 = new Class151[500];
		Static192.anInt3644 = 0;
		Static351.aClass151Array2 = new Class151[500];
		Static235.anInt4393 = 0;
		Static90.anIntArrayArrayArray2 = new int[4][Static310.anInt5828 + 1][Static163.anInt3084 + 1];
		Static9.aClass44_Sub4Array1 = new Class44_Sub4[5000];
		Static113.anInt2094 = 0;
		Static258.aBooleanArrayArray5 = new boolean[Static30.anInt573 + Static30.anInt573 + 1][Static30.anInt573 + Static30.anInt573 + 1];
		Static266.aBooleanArrayArray6 = new boolean[Static30.anInt573 + Static30.anInt573 + 2][Static30.anInt573 + Static30.anInt573 + 2];
		Static59.aClass155_1 = null;
	}
}
