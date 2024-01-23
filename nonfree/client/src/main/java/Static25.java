import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
	public static int anInt5780;

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "Z")
	public static boolean aBoolean467;

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
	public static int anInt5783;

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "I")
	public static int anInt5784;

	@OriginalMember(owner = "client!bo", name = "j", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/lang/String;II)I")
	public static int method4636(@OriginalArg(0) String arg0) {
		return Static257.method4289(16, arg0);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(III)V")
	public static void method4637(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static249.anIntArray446[arg0] = arg1;
		@Pc(14) Class2_Sub17 local14 = (Class2_Sub17) Static9.aClass79_1.method2002((long) arg0);
		if (local14 == null) {
			local14 = new Class2_Sub17(Static6.method126() + 500L);
			Static9.aClass79_1.method1994((long) arg0, local14);
		} else {
			local14.aLong175 = Static6.method126() + 500L;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IBII)I")
	public static int method4638(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = Static93.anIntArray152[Static228.method3865(arg0, arg1)];
		if (arg2 > 0) {
			@Pc(23) int local23 = Static93.anInterface5_1.method3514(arg2 & 0xFFFF);
			@Pc(36) int local36;
			@Pc(57) int local57;
			if (local23 != 0) {
				if (arg1 < 0) {
					local36 = 0;
				} else if (arg1 > 127) {
					local36 = 16777215;
				} else {
					local36 = arg1 * 131586;
				}
				if (local23 == 256) {
					local11 = local36;
				} else {
					local57 = 256 - local23;
					local11 = (local57 * (local11 & 0xFF00) + (local36 & 0xFF00) * local23 & 0xFF0000) + ((local36 & 0xFF00FF) * local23 + (local11 & 0xFF00FF) * local57 & 0xFF00FF00) >> 8;
				}
			}
			local36 = Static93.anInterface5_1.method3511(arg2 & 0xFFFF);
			if (local36 != 0) {
				local36 += 256;
				@Pc(111) int local111 = local36 * (local11 >> 16 & 0xFF);
				local57 = (local11 >> 8 & 0xFF) * local36;
				if (local111 > 65535) {
					local111 = 65535;
				}
				if (local57 > 65535) {
					local57 = 65535;
				}
				@Pc(139) int local139 = (local11 & 0xFF) * local36;
				if (local139 > 65535) {
					local139 = 65535;
				}
				local11 = (local139 >> 8) + (local111 << 8 & 0xFF00D0) + (local57 & 0xFF00);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILclient!wm;I)Ljava/lang/String;")
	public static String method4641(@OriginalArg(1) Class2_Sub26 arg0) {
		try {
			@Pc(7) int local7 = arg0.method4217();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(15) byte[] local15 = new byte[local7];
			arg0.anInt5328 += Static183.aClass124_1.method3174(local15, arg0.aByteArray72, arg0.anInt5328, local7, 0);
			return Static236.method3911(local15, local7, 0);
		} catch (@Pc(47) Exception local47) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZI)V")
	public static void method4642() {
		Static237.aClass46_32.method1068(5);
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V")
	public static void method4645() {
		Static100.aString112 = "Chargement des interfaces - ";
		Static105.aString115 = "Moteur son préparé";
		Static30.aString43 = "Examiner";
		Static216.aString226 = "Liste des mises à jour chargée";
		Static264.aString257 = "jaune:";
		Static50.aString57 = "Jeter";
		Static279.aString277 = "Veuillez commencer par supprimer ";
		Static267.aString204 = "Interfaces chargées";
		Static47.aString55 = "Prendre";
		Static273.aString268 = "K";
		Static136.aString138 = "Sélectionner";
		Static212.aString224 = "Utiliser";
		Static17.aString26 = "OK";
		Static101.aString293 = "clignotant3:";
		Static37.aString46 = "Chargement du module texte - ";
		Static52.aString59 = "voudrait faire un échange avec vous.";
		Static12.aString17 = "clignotant2:";
		Static58.aString67 = "Chargement de RuneScape en cours - veuillez patienter...";
		Static148.aString151 = "Veuillez patienter...";
		Static198.aString207 = "Polices chargées";
		Static192.aString199 = " de votre liste d'amis.";
		Static221.aString230 = "Écran-titre chargé";
		Static139.aString140 = " s'est déconnecté.";
		Static191.aString41 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
		Static65.aString76 = "déroulement:";
		Static165.aString169 = " est déjà dans votre liste noire.";
		Static37.aString47 = "brillant3:";
		Static87.aString95 = "compétence ";
		Static142.aString147 = "Chargement de la liste des serveurs";
		Static217.aString228 = "Veuillez patienter - tentative de rétablissement.";
		Static90.aString100 = "Mémoire attribuée";
		Static149.aString152 = "Chargement des polices - ";
		Static44.aString53 = "Votre liste noire est pleine (100 noms maximum).";
		Static164.aString167 = " de votre liste noire.";
		Static205.aString214 = "M";
		Static110.aString123 = "classement ";
		Static208.aString217 = " ";
		Static289.aString292 = "Veuillez commencer par supprimer ";
		Static205.aString213 = "Chargement de l'écran-titre - ";
		Static246.aString247 = "Connexion perdue.";
		Static63.aString74 = " est déjà dans votre liste d'amis.";
		Static14.aString21 = "Fichiers config chargés";
		Static19.aString29 = "M";
		Static36.aString45 = "ondulation2:";
		Static53.aString60 = "tremblement:";
		Static53.aString61 = " autres options";
		Static205.aString212 = "Mémoire en cours d'attribution";
		Static100.aString110 = "Chargement en cours...";
		Static285.aString287 = "blanc:";
		Static293.aString295 = "niveau ";
		Static242.aString243 = "cyan:";
		Static213.aString225 = "K";
		Static8.aString12 = "ondulation:";
		Static203.aString210 = "Attaquer";
		Static55.aString63 = "Chargement des sprites - ";
		Static299.aString131 = " s'est connecté.";
		Static22.aString19 = "Impossible de trouver ";
		Static47.aString54 = "Textures chargées";
		Static296.aString300 = "Connexion au serveur de mise à jour en cours";
		Static169.aString178 = "Choisir une option";
		Static55.aString64 = "violet:";
		Static245.aString256 = "Chargement en cours. Veuillez patienter.";
		Static99.aString108 = "Objet d'abonnés";
		Static17.aString25 = "Liste des serveurs chargée";
		Static30.aString42 = "vert:";
		Static88.aString235 = "Vérification des mises à jour - ";
		Static241.aString241 = "Chargement des paramètres par défaut - ";
		Static154.aString158 = "rouge:";
		Static224.aString233 = "Annuler";
		Static11.aString15 = "Librairie 3D démarrée";
		Static238.aString238 = "Poser";
		Static91.aString102 = "Fermer";
		Static109.aString121 = "Atteindre";
		Static202.aString208 = "brillant1:";
		Static152.aString154 = "glissement:";
		Static275.aString272 = "brillant2:";
		Static243.aString187 = "Connecté au serveur de mise à jour";
		Static230.aString191 = "Chargement des textures - ";
		Static185.aString196 = "Monde de jeu créé";
		Static156.aString259 = "Regarder dans cette direction";
		Static106.aString120 = "Écran-titre ouvert";
		Static155.aString301 = "Caché";
		Static230.aString192 = "Démarrage de la librairie 3D";
		Static62.aString71 = "clignotant1:";
		Static5.aString7 = "Module texte chargé";
		Static121.aString130 = "Sprites chargés";
		Static293.aString296 = "Chargement des fichiers config - ";
		Static11.aString14 = "Paramètres par défaut chargés";
		Static279.aString278 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
		Static212.aString223 = "Continuer";
		Static76.aString83 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
		Static162.aString165 = "Gestionnaire de saisie chargé";
	}
}
