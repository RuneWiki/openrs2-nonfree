import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!ri", name = "O", descriptor = "Lclient!ak;")
	public static Class7 aClass7_187;

	@OriginalMember(owner = "client!ri", name = "bb", descriptor = "I")
	public static int anInt4836;

	@OriginalMember(owner = "client!ri", name = "T", descriptor = "[I")
	public static int[] anIntArray566 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ri", name = "X", descriptor = "[I")
	public static int[] anIntArray567 = new int[128];

	@OriginalMember(owner = "client!ri", name = "Z", descriptor = "I")
	public static int anInt4834 = 0;

	@OriginalMember(owner = "client!ri", name = "fb", descriptor = "Ljava/lang/String;")
	public static String aString155 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)Lclient!lf;")
	public static Class105 method3689(@OriginalArg(1) int arg0) {
		@Pc(11) Class105 local11 = (Class105) Static285.aClass31_44.method852((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(29) byte[] local29 = Static167.aClass7_137.method253(arg0, 34);
		local11 = new Class105();
		if (local29 != null) {
			local11.method2363(arg0, new Class1_Sub18(local29));
		}
		Static285.aClass31_44.method851(local11, (long) arg0);
		return local11;
	}

	@OriginalMember(owner = "client!ri", name = "k", descriptor = "(I)V")
	public static void method3690() {
		Static288.aString186 = "Objet d'abonnés";
		Static102.aString60 = "compétence ";
		Static290.aString189 = "violet:";
		Static10.aString13 = "Module texte chargé";
		Static3.aString2 = "Liste des mises à jour chargée";
		Static89.aString48 = "Gestionnaire de saisie chargé";
		Static137.aString136 = " autres options";
		Static192.aString181 = "Vérification des mises à jour - ";
		Static289.aString187 = "Jeter";
		Static125.aString75 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
		Static45.aString26 = "Chargement en cours...";
		Static4.aString5 = "Fichiers config chargés";
		Static179.aString114 = "Examiner";
		Static10.aString12 = "Paramètres par défaut chargés";
		Static182.aString117 = "Impossible de trouver ";
		Static14.aString15 = "Veuillez patienter - tentative de rétablissement.";
		Static219.aString144 = "jaune:";
		Static220.aString146 = "Textures chargées";
		Static145.aString93 = "Atteindre";
		Static89.aString49 = "niveau ";
		Static1.aString1 = "ondulation:";
		aString155 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
		Static167.aString104 = "Choisir une option";
		Static149.aString96 = "Utiliser";
		Static131.aString87 = "Écran-titre ouvert";
		Static167.aString105 = " est déjà dans votre liste noire.";
		Static122.aString73 = "Interfaces chargées";
		Static68.aString153 = "rouge:";
		Static169.aString106 = "Chargement de l'écran-titre - ";
		Static126.aString76 = "Connexion perdue.";
		Static9.aString11 = "Caché";
		Static128.aString85 = "ondulation2:";
		Static123.aString74 = "Monde de jeu créé";
		Static90.aString152 = "vert:";
		Static100.aString56 = "Votre liste noire est pleine (100 noms maximum).";
		Static189.aString120 = "Chargement des polices - ";
		Static37.aString102 = " de votre liste noire.";
		Static291.aString190 = "blanc:";
		Static103.aString62 = " s'est connecté.";
		Static29.aString20 = "Chargement des sprites - ";
		Static5.aString7 = "glissement:";
		Static277.aString185 = "cyan:";
		Static246.aString116 = "déroulement:";
		Static38.aString23 = "Regarder dans cette direction";
		Static174.aString110 = "Annuler";
		Static294.aString191 = "clignotant3:";
		Static101.aString58 = "M";
		Static260.aString178 = "Sprites chargés";
		Static62.aString33 = "tremblement:";
		Static103.aString61 = "Librairie 3D démarrée";
		Static145.aString94 = "Chargement des interfaces - ";
		Static233.aString158 = "Démarrage de la librairie 3D";
		Static203.aString138 = "brillant1:";
		Static71.aString40 = "Connecté au serveur de mise à jour";
		Static46.aString27 = "Chargement des paramètres par défaut - ";
		Static73.aString41 = "voudrait faire un échange avec vous.";
		Static163.aString151 = " s'est déconnecté.";
		Static268.aString180 = "Veuillez commencer par supprimer ";
		Static12.aString14 = "clignotant1:";
		Static16.aString16 = "Continuer";
		Static126.aString77 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
		Static189.aString121 = " est déjà dans votre liste d'amis.";
		Static152.aString98 = "classement ";
		Static221.aString148 = " ";
		Static247.aString166 = "Chargement des textures - ";
		Static100.aString57 = " de votre liste d'amis.";
		Static260.aString177 = "brillant2:";
		Static22.aString173 = "Poser";
		Static131.aString86 = "Chargement des fichiers config - ";
		Static191.aString131 = "K";
		Static260.aString176 = "Prendre";
		Static234.aString160 = "Sélectionner";
		Static86.aString45 = "Écran-titre chargé";
		Static53.aString29 = "Chargement de la liste des serveurs";
		Static95.aString54 = "Polices chargées";
		Static64.aString35 = "Fermer";
		Static139.aString90 = "Moteur son préparé";
		Static175.aString111 = "Chargement du module texte - ";
		Static52.aString28 = "M";
		Static73.aString42 = "Attaquer";
		Static251.aString174 = "Chargement de RuneScape en cours - veuillez patienter...";
		Static4.aString6 = "Chargement en cours. Veuillez patienter.";
		Static290.aString188 = "Veuillez commencer par supprimer ";
		Static3.aString3 = "Connexion au serveur de mise à jour en cours";
		Static109.aString63 = "OK";
		Static177.aString112 = "K";
		Static143.aString92 = "Liste des serveurs chargée";
		Static9.aString10 = "Mémoire attribuée";
		Static79.aString101 = "clignotant2:";
		Static140.aString91 = "Mémoire en cours d'attribution";
		Static211.aString25 = "Veuillez patienter...";
		Static139.aString89 = "brillant3:";
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method3691(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static179.aClass112_1);
		arg0.addMouseMotionListener(Static179.aClass112_1);
		arg0.addFocusListener(Static179.aClass112_1);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method3693(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = Static12.method240(arg0);
		if (local7 != -1) {
			@Pc(47) int[] local47 = Static188.aClass1_Sub2_Sub13_2.method2813(Static166.aClass50_2.anIntArray169[local7] >> 14 & 0x3FFF, Static166.aClass50_2.anIntArray169[local7] >> 28 & 0x3, Static166.aClass50_2.anIntArray169[local7] & 0x3FFF);
			Static222.method3551(local47[2], local47[1]);
		}
	}
}
