import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_1 = new Class43("This is the developer console. To close, press the `, ² or § keys on your keyboard.", "Das ist die Entwicklerkonsole. Zum Schließen, die Tasten `, ² or § drücken.", "Ceci est la console de développement. Pour la fermer, appuyez sur les touches `, ² ou §.", "Este é o painel de controle do desenvolvedor. Para fechar, pressione `, ² ou §.");

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_2 = new Class43("There was an error executing the command.", "Es gab einen Fehler beim Ausführen des Befehls.", "Une erreur s'est produite lors de l'exécution de la commande.", "Houve um erro quando o comando foi executado.");

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_3 = new Class43("Unknown developer command: ", "Unbekannter Befehl: ", "Commande inconnue : ", "Comando desconhecido: ");

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_4 = new Class43("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!ca", name = "i", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_5 = new Class43("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_6 = new Class43("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_7 = new Class43("Take", "Nehmen", "Prendre", "Pegar");

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_8 = new Class43("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_9 = new Class43("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_10 = new Class43("Your friends list is full, max of 200 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (200 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 200 para usuários não pagantes, e 200 para membros.");

	@OriginalMember(owner = "client!ca", name = "o", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_11 = new Class43(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 200.", null, null);

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_12 = new Class43("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!ca", name = "q", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_13 = new Class43("Profiling...", "Profiling...", "Profilage...", "Profiling...");

	@OriginalMember(owner = "client!ca", name = "r", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_14 = new Class43("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!ca", name = "s", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_15 = new Class43("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!ca", name = "t", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_16 = new Class43("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

	@OriginalMember(owner = "client!ca", name = "u", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_17 = new Class43("Fetching Updates - ", "Lade Update - ", "Chargement des MAJ - ", "Carregando atualizações - ");

	@OriginalMember(owner = "client!ca", name = "v", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_18 = new Class43("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

	@OriginalMember(owner = "client!ca", name = "w", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_19 = new Class43(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

	@OriginalMember(owner = "client!ca", name = "x", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_20 = new Class43(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!ca", name = "y", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_21 = new Class43("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

	@OriginalMember(owner = "client!ca", name = "z", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_22 = new Class43("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!ca", name = "A", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_23 = new Class43("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!ca", name = "B", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_24 = new Class43("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

	@OriginalMember(owner = "client!ca", name = "C", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_25 = new Class43(" more options", " weitere Optionen", " autres options", " mais opções");

	@OriginalMember(owner = "client!ca", name = "D", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_26 = new Class43("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!ca", name = "E", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_27 = new Class43("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

	@OriginalMember(owner = "client!ca", name = "F", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_28 = new Class43("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!ca", name = "G", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_29 = new Class43("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!ca", name = "H", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_30 = new Class43("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

	@OriginalMember(owner = "client!ca", name = "I", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_31 = new Class43("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

	@OriginalMember(owner = "client!ca", name = "J", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_32 = new Class43(" ", ": ", " ", " ");

	@OriginalMember(owner = "client!ca", name = "K", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_33 = new Class43("M", "M", "M", "M");

	@OriginalMember(owner = "client!ca", name = "L", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_34 = new Class43("M", "M", "M", "M");

	@OriginalMember(owner = "client!ca", name = "M", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_35 = new Class43("K", "T", "K", "K");

	@OriginalMember(owner = "client!ca", name = "N", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_36 = new Class43("K", "T", "K", "K");

	@OriginalMember(owner = "client!ca", name = "O", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_37 = new Class43("Self", "Mich", "Moi", "Eu");

	@OriginalMember(owner = "client!ca", name = "P", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_38 = new Class43(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!ca", name = "Q", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_39 = new Class43("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");

	@OriginalMember(owner = "client!ca", name = "R", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_40 = new Class43(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!ca", name = "S", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_41 = new Class43("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

	@OriginalMember(owner = "client!ca", name = "U", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_42 = new Class43("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!ca", name = "V", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_43 = new Class43("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!ca", name = "W", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_44 = new Class43(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

	@OriginalMember(owner = "client!ca", name = "X", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_45 = new Class43("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!ca", name = "Y", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_46 = new Class43(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!ca", name = "Z", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_47 = new Class43("yellow:", "gelb:", "jaune:", "amarelo:");

	@OriginalMember(owner = "client!ca", name = "ab", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_48 = new Class43("red:", "rot:", "rouge:", "vermelho:");

	@OriginalMember(owner = "client!ca", name = "bb", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_49 = new Class43("green:", "grün:", "vert:", "verde:");

	@OriginalMember(owner = "client!ca", name = "cb", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_50 = new Class43("cyan:", "blaugrün:", "cyan:", "cyan:");

	@OriginalMember(owner = "client!ca", name = "db", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_51 = new Class43("purple:", "lila:", "violet:", "roxo:");

	@OriginalMember(owner = "client!ca", name = "eb", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_52 = new Class43("white:", "weiss:", "blanc:", "branco:");

	@OriginalMember(owner = "client!ca", name = "fb", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_53 = new Class43("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!ca", name = "gb", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_54 = new Class43("flash2:", "blinken2:", "clignotant2:", "flash2:");

	@OriginalMember(owner = "client!ca", name = "hb", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_55 = new Class43("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!ca", name = "ib", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_56 = new Class43("glow1:", "leuchten1:", "brillant1:", "brilho1:");

	@OriginalMember(owner = "client!ca", name = "jb", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_57 = new Class43("glow2:", "leuchten2:", "brillant2:", "brilho2:");

	@OriginalMember(owner = "client!ca", name = "kb", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_58 = new Class43("glow3:", "leuchten3:", "brillant3:", "brilho3:");

	@OriginalMember(owner = "client!ca", name = "mb", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_59 = new Class43("wave2:", "welle2:", "ondulation2:", "onda2:");

	@OriginalMember(owner = "client!ca", name = "nb", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_60 = new Class43("shake:", "schütteln:", "tremblement:", "tremor:");

	@OriginalMember(owner = "client!ca", name = "ob", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_61 = new Class43("scroll:", "scrollen:", "déroulement:", "rolagem:");

	@OriginalMember(owner = "client!ca", name = "pb", descriptor = "Lclient!ca;")
	public static final Class43 aClass43_62 = new Class43("slide:", "gleiten:", "glissement:", "deslizamento:");

	@OriginalMember(owner = "client!ca", name = "qb", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger3 = new BigInteger("8c773b88b103581e2ef6e9f6156240d7d5a4fa25755dbbd58b21dbb76c5f370dd5c2a4feab6914264b7bf349f23a670711455e757ce33606ebbb45aeb649383a6fe026af5018b9c3523ccba256708e63ec0a06d4f121968f0c6adbd786382a9d54592b0df6f6ec5c6ff1480df17f0d613f806a4d06579f18194d5acd388f133114be91a1f786c99622fe88c51b228dc4164ea578e3b8cb2caffeff2dcb01cf10f337922306505ac62bf07049f3408afcfd64fbd3a43a7f507da34b72f73019eabe4c736a3d4249e97c560ba121c036f9871c770e06afdc0fc320cfedea27137a1b44c0c7543628f5159181f1aa68e894ba819af0d4ca41512e1d7b19a675f6584fc6f9471ab74392e378d19d48e3686e3e5da0c61aa33a40d26312815c90008ac768d17cc178e359b5f6369e2f27d9e15f958a7351ddfc408954456165ed464152ea27d4a3291bb2415d1699a987256895a2dfcb88d05b0a5613cb21d7bd91d06dfd5654ba0d5dc6078ad8abd16333b852597a602c21472d6367756b6356b64d02985240e71817c6da2b66dddcda0f4d83591fbbd5ad243a2da2a94352853d15bfef7cf6c96bc49d82b75779253016ff2e04e53d33285b0ce4747f07731ecb8b32afc57bd1f5baf64193a830befc5042795b2cb129e001344e3c5fcb0badc02c193f0cd2bd329f04c23ee03b1b17fc3be2c193093ad607faa955b317f951154f", 16);

	@OriginalMember(owner = "client!ca", name = "rb", descriptor = "[[I")
	public static final int[][] anIntArrayArray8 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IBIIII)V")
	public static void method1597(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg0 + 1;
		Static611.method8472(arg2, arg3, Static460.anIntArrayArray53[arg0], arg4);
		@Pc(19) int local19 = arg1 - 1;
		Static611.method8472(arg2, arg3, Static460.anIntArrayArray53[arg1], arg4);
		for (@Pc(33) int local33 = local10; local33 <= local19; local33++) {
			@Pc(39) int[] local39 = Static460.anIntArrayArray53[local33];
			local39[arg3] = local39[arg2] = arg4;
		}
	}
}
