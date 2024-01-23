import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!fo", name = "i", descriptor = "[I")
	public static int[] anIntArray122 = new int[14];

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(B)V")
	public static void method1223() {
		Static286.aString180 = "Objet d'abonnés";
		Static87.aString55 = "brillant3:";
		Static279.aString174 = "ondulation:";
		Static258.aString166 = "Chargement des textures - ";
		Static286.aString181 = "Poser";
		Static84.aString51 = "M";
		Static89.aString58 = "Interfaces chargées";
		Static274.aString171 = "vert:";
		Static105.aString77 = "Chargement de RuneScape en cours - veuillez patienter...";
		Static188.aString124 = "Veuillez patienter...";
		Static189.aString125 = "Monde de jeu créé";
		Static131.aString93 = "rouge:";
		Static281.aString176 = "Chargement en cours...";
		Static202.aString136 = "Fichiers config chargés";
		Static132.aString96 = "Connexion au serveur de mise à jour en cours";
		Static289.aString183 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
		Static235.aString158 = "Chargement des interfaces - ";
		Static253.aString156 = "Mémoire attribuée";
		Static309.aString194 = "Continuer";
		Static253.aString155 = "Chargement de Mechscape en cours - veuillez patienter...";
		Static249.aString163 = "Utiliser";
		Static252.aString164 = "tremblement:";
		Static171.aString110 = "Écran-titre ouvert";
		Static177.aString81 = "M";
		Static77.aString177 = "brillant2:";
		Static142.aString97 = "glissement:";
		Static175.aString111 = "Paramètres par défaut chargés";
		Static81.aString48 = "Chargement des fichiers config - ";
		Static297.aString190 = "compétence ";
		Static10.aString6 = "blanc:";
		Static15.aString10 = "classement ";
		Static269.aString15 = "Atteindre";
		Static208.aString137 = "Chargement du module texte - ";
		Static169.aString109 = "Attaquer";
		Static94.aString64 = "Mémoire en cours d'attribution";
		Static300.aString191 = "Examiner";
		Static88.aString57 = " ";
		Static118.aString87 = "clignotant1:";
		Static84.aString52 = "Fermer";
		Static304.aString192 = "clignotant2:";
		Static15.aString11 = "Sprites chargés";
		Static144.aString99 = "K";
		Static101.aString67 = "Veuillez commencer par supprimer ";
		Static6.aString3 = "Vérification des mises à jour - ";
		Static212.aString138 = "Gestionnaire de saisie chargé";
		Static130.aString92 = "Liste des mises à jour chargée";
		Static257.aString165 = "Chargement des polices - ";
		Static158.aString69 = "jaune:";
		Static165.aString106 = "Chargement en cours. Veuillez patienter.";
		Static189.aString126 = "Jeter";
		Static132.aString95 = "ondulation2:";
		Static192.aString132 = "K";
		Static234.aString154 = "niveau ";
		Static167.aString107 = "Moteur son préparé";
		Static77.aString178 = "Librairie 3D démarrée";
		Static202.aString135 = "Chargement des paramètres par défaut - ";
		Static66.aString39 = " s'est connecté.";
		Static4.aString1 = "Veuillez commencer par supprimer ";
		Static172.aString5 = "Chargement de l'écran-titre - ";
		Static285.aString179 = "Liste des serveurs chargée";
		Static177.aString82 = "OK";
		Static310.aString41 = "Textures chargées";
		Static14.aString8 = "violet:";
		Static88.aString56 = "Chargement de la liste des serveurs";
		Static278.aString173 = " de votre liste d'amis.";
		Static52.aString31 = "Prendre";
		Static253.aString157 = "Caché";
		Static81.aString49 = "Impossible de trouver ";
		Static175.aString112 = "Veuillez patienter - tentative de rétablissement.";
		Static269.aString16 = "Annuler";
		Static190.aString131 = "Sélectionner";
		Static39.aString23 = "Connexion perdue.";
		Static57.aString33 = "brillant1:";
		Static145.aString100 = "Polices chargées";
		Static131.aString94 = "Écran-titre chargé";
		Static288.aString182 = "cyan:";
		Static106.aString83 = " est déjà dans votre liste d'amis.";
		Static236.aString160 = "Chargement des sprites - ";
		Static128.aString90 = "Regarder dans cette direction";
		Static97.aString65 = "Connecté au serveur de mise à jour";
		Static69.aString44 = "Votre liste noire est pleine (100 noms maximum).";
		Static161.aString105 = " est déjà dans votre liste noire.";
		Static143.aString98 = "Choisir une option";
		Static59.aString34 = "clignotant3:";
		Static68.aString42 = "déroulement:";
		Static292.aString187 = " autres options";
		Static152.aString102 = " s'est déconnecté.";
		Static33.aString22 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
		Static238.aString161 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
		Static5.aString2 = " de votre liste noire.";
		Static129.aString91 = "Module texte chargé";
		Static152.aString101 = "Démarrage de la librairie 3D";
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!nf;Z)V")
	public static void method1224(@OriginalArg(0) Class117 arg0) {
		@Pc(10) Class126 local10 = null;
		try {
			@Pc(15) Class10 local15 = arg0.method3009("runescape");
			while (local15.anInt151 == 0) {
				Static202.method3246(1L);
			}
			if (local15.anInt151 == 1) {
				local10 = (Class126) local15.anObject1;
				@Pc(36) Class1_Sub14 local36 = Static56.method973();
				local10.method3182(local36.aByteArray34, local36.anInt3290, 0);
			}
		} catch (@Pc(46) Exception local46) {
		}
		try {
			if (local10 != null) {
				local10.method3181();
			}
		} catch (@Pc(55) Exception local55) {
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIII)V")
	public static void method1226(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static240.anInt1319 = 0;
		Static214.anInt4216 = arg0;
		Static312.anInt5850 = 0;
		Static59.anInt1155 = arg1;
	}
}
