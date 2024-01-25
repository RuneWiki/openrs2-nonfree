import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!re", name = "g", descriptor = "[I")
	public static final int[] anIntArray681 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!re", name = "h", descriptor = "I")
	public static int anInt5321 = 0;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIII)I")
	public static int method4496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > arg1) {
			return arg2;
		} else if (arg1 > arg0) {
			return arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!pe;Lclient!hh;IIIII)V")
	public static void method4497(@OriginalArg(0) Class89 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static41.anInt1075) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static346.anInt6536) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static174.anInt3604 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class49 local62 = Static229.aClass49ArrayArrayArray6[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static331.aClass8Array5[local17].method4173(local23, local32) + Static331.aClass8Array5[local17].method4173(local23 + 1, local32) + Static331.aClass8Array5[local17].method4173(local23, local32 + 1) + Static331.aClass8Array5[local17].method4173(local23 + 1, local32 + 1)) / 4 - (Static331.aClass8Array5[arg2].method4173(arg3, arg4) + Static331.aClass8Array5[arg2].method4173(arg3 + 1, arg4) + Static331.aClass8Array5[arg2].method4173(arg3, arg4 + 1) + Static331.aClass8Array5[arg2].method4173(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class22_Sub4 local143 = local62.aClass22_Sub4_1;
									@Pc(146) Class22_Sub4 local146 = local62.aClass22_Sub4_2;
									if (local143 != null && local143.method5343()) {
										arg1.method5340(local1, local143, arg0, local140, (local23 - arg3) * 128 + (1 - arg5) * 64, (local32 - arg4) * 128 + (1 - arg6) * 64);
									}
									if (local146 != null && local146.method5343()) {
										arg1.method5340(local1, local146, arg0, local140, (local23 - arg3) * 128 + (1 - arg5) * 64, (local32 - arg4) * 128 + (1 - arg6) * 64);
									}
									for (@Pc(219) Class47 local219 = local62.aClass47_3; local219 != null; local219 = local219.aClass47_2) {
										@Pc(223) Class22_Sub2 local223 = local219.aClass22_Sub2_1;
										if (local223 != null && local223.method5343() && (local23 == local223.aShort83 || local23 == local3) && (local32 == local223.aShort81 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort82 + 1 - local223.aShort83;
											@Pc(260) int local260 = local223.aShort84 + 1 - local223.aShort81;
											arg1.method5340(local1, local223, arg0, local140, (local223.aShort83 - arg3) * 128 + (local252 - arg5) * 64, (local223.aShort81 - arg4) * 128 + (local260 - arg6) * 64);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIILclient!bd;II)Ljava/awt/Frame;")
	public static Frame method4498(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class21 arg2, @OriginalArg(4) int arg3) {
		if (!arg2.method373()) {
			return null;
		}
		@Pc(18) Class201[] local18 = Static237.method4091(arg2);
		if (local18 == null) {
			return null;
		}
		@Pc(24) boolean local24 = false;
		for (@Pc(26) int local26 = 0; local26 < local18.length; local26++) {
			if (arg3 == local18[local26].anInt6172 && local18[local26].anInt6174 == arg1 && (!local24 || arg0 < local18[local26].anInt6176)) {
				arg0 = local18[local26].anInt6176;
				local24 = true;
			}
		}
		if (!local24) {
			return null;
		}
		@Pc(94) Class99 local94 = arg2.method377(arg1, arg0, arg3);
		while (local94.anInt2836 == 0) {
			Static129.method2634(10L);
		}
		@Pc(110) Frame local110 = (Frame) local94.anObject2;
		if (local110 == null) {
			return null;
		} else if (local94.anInt2836 == 2) {
			Static234.method4076(arg2, local110);
			return null;
		} else {
			return local110;
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V")
	public static void method4500() {
		Static2.aString1 = "glissement:";
		Static251.aString414 = "Chargement en cours...";
		Static329.aString408 = "Liste des mises à jour chargée";
		Static8.aString11 = "Prendre";
		Static233.aString293 = "Textures chargées";
		Static203.aString262 = "Chargement de Mechscape en cours - veuillez patienter...";
		Static248.aString307 = "Mémoire en cours d'attribution";
		Static293.aString366 = "Écran-titre ouvert";
		Static193.aString248 = "brillant2:";
		Static33.aString65 = "vert:";
		Static237.aString296 = "Veuillez commencer par supprimer ";
		Static162.aString158 = "Moteur son préparé";
		Static337.aString419 = "Sélectionner";
		Static55.aString108 = "Connecté au serveur de mise à jour";
		Static211.aString274 = "déroulement:";
		Static271.aString337 = " s'est déconnecté.";
		Static34.aString70 = "Sprites chargés";
		Static135.aString197 = "Chargement des sprites - ";
		Static302.aString424 = "Chargement des fichiers config - ";
		Static329.aString409 = "rouge:";
		Static118.aString418 = "Chargement des textures - ";
		Static241.aString301 = "blanc:";
		Static286.aString356 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
		Static350.aString434 = "Veuillez patienter - tentative de rétablissement.";
		Static253.aString310 = "Connexion perdue.";
		Static262.aString322 = "jaune:";
		Static70.aString126 = "Chargement des paramètres par défaut - ";
		Static289.aString162 = "niveau ";
		Static160.aString218 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
		Static254.aString312 = "Choisir une option";
		Static49.aString95 = "clignotant2:";
		Static272.aString341 = "Atteindre";
		Static256.aString313 = "Utiliser";
		Static199.aString256 = "brillant1:";
		Static198.aString253 = "Variables du client chargées";
		Static323.aString400 = "Écran-titre chargé";
		Static279.aString438 = "Module texte chargé";
		Static240.aString420 = "Fermer";
		Static211.aString273 = "Chargement des polices - ";
		Static140.aString199 = "Chargement de RuneScape en cours - veuillez patienter...";
		Static261.aString320 = "ondulation:";
		Static169.aString231 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
		Static159.aString217 = "clignotant1:";
		Static266.aString332 = "M";
		Static293.aString365 = " s'est connecté.";
		Static249.aString100 = "Mémoire attribuée";
		Static314.aString387 = "Votre liste noire est pleine (100 noms maximum).";
		Static246.aString305 = "Caché";
		Static339.aString425 = "Annuler";
		Static66.aString121 = "Monde de jeu créé";
		Static21.aString32 = "Connexion au serveur de mise à jour en cours";
		Static160.aString219 = "Impossible de trouver ";
		Static309.aString381 = " ";
		Static28.aString59 = "violet:";
		Static98.aString90 = "Examiner";
		Static266.aString333 = " est déjà dans votre liste noire.";
		Static146.aString210 = "Veuillez patienter...";
		Static97.aString163 = "M";
		Static161.aString220 = "tremblement:";
		Static283.aString351 = "Chargement des interfaces - ";
		Static57.aString110 = " autres options";
		Static207.aString269 = "Continuer";
		Static263.aString326 = "OK";
		Static227.aString417 = " est déjà dans votre liste d'amis.";
		Static232.aString290 = "Veuillez commencer par supprimer ";
		Static125.aString191 = "Gestionnaire de saisie chargé";
		Static314.aString386 = "Fichiers config chargés";
		Static327.aString407 = " de votre liste noire.";
		Static263.aString327 = "Objet d'abonnés";
		Static117.aString185 = "Chargement de la liste des serveurs";
		Static8.aString12 = "Jeter";
		Static261.aString319 = "clignotant3:";
		Static35.aString79 = "Chargement en cours. Veuillez patienter.";
		Static88.aString260 = "Chargement du module texte - ";
		Static47.aString94 = "ondulation2:";
		Static184.aString244 = "K";
		Static267.aString334 = "Poser";
		Static47.aString93 = "Chargement de l'écran-titre - ";
		Static113.aString178 = "cyan:";
		Static66.aString120 = "Paramètres par défaut chargés";
		Static28.aString60 = "Librairie 3D démarrée";
		Static304.aString376 = "classement ";
		Static233.aString292 = "Liste des serveurs chargée";
		Static200.aString258 = " de votre liste d'amis.";
		Static102.aString166 = "compétence ";
		Static10.aString14 = "Interfaces chargées";
		Static240.aString421 = "Regarder dans cette direction";
		Static162.aString159 = "Polices chargées";
		Static54.aString104 = "Vérification des mises à jour - ";
		Static259.aString316 = "brillant3:";
		Static281.aString324 = "K";
		Static348.aString431 = "Démarrage de la librairie 3D";
		Static161.aString221 = "Attaquer";
	}
}
