import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!li", name = "tb", descriptor = "J")
	public static long aLong161;

	@OriginalMember(owner = "client!li", name = "ub", descriptor = "Ljava/lang/Object;")
	public static Object anObject14;

	@OriginalMember(owner = "client!li", name = "wb", descriptor = "F")
	public static float aFloat117;

	@OriginalMember(owner = "client!li", name = "e", descriptor = "Lclient!li;")
	public static final Class192 aClass192_1 = new Class192("This is the developer console. To close, press the `, ² or § keys on your keyboard.", "Das ist die Entwicklerkonsole. Zum Schließen, die Tasten `, ² or § drücken.", "Ceci est la console de développement. Pour la fermer, appuyez sur les touches `, ² ou §.", "Este é o painel de controle do desenvolvedor. Para fechar, pressione `, ² ou §.");

	@OriginalMember(owner = "client!li", name = "j", descriptor = "Lclient!li;")
	public static final Class192 aClass192_2 = new Class192("There was an error executing the command.", "Es gab einen Fehler beim Ausführen des Befehls.", "Une erreur s'est produite lors de l'exécution de la commande.", "Houve um erro quando o comando foi executado.");

	@OriginalMember(owner = "client!li", name = "k", descriptor = "Lclient!li;")
	public static final Class192 aClass192_3 = new Class192("Unknown developer command: ", "Unbekannter Befehl: ", "Commande inconnue : ", "Comando desconhecido: ");

	@OriginalMember(owner = "client!li", name = "l", descriptor = "Lclient!li;")
	public static final Class192 aClass192_4 = new Class192("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!li", name = "m", descriptor = "Lclient!li;")
	public static final Class192 aClass192_5 = new Class192("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!li", name = "n", descriptor = "Lclient!li;")
	public static final Class192 aClass192_6 = new Class192("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!li", name = "o", descriptor = "Lclient!li;")
	public static final Class192 aClass192_7 = new Class192("Take", "Nehmen", "Prendre", "Pegar");

	@OriginalMember(owner = "client!li", name = "p", descriptor = "Lclient!li;")
	public static final Class192 aClass192_8 = new Class192("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!li", name = "q", descriptor = "Lclient!li;")
	public static final Class192 aClass192_9 = new Class192("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!li", name = "r", descriptor = "Lclient!li;")
	public static final Class192 aClass192_10 = new Class192("Your friends list is full, max of 200 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (200 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 200 para usuários não pagantes, e 200 para membros.");

	@OriginalMember(owner = "client!li", name = "s", descriptor = "Lclient!li;")
	public static final Class192 aClass192_11 = new Class192((String) null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 200.", (String) null, (String) null);

	@OriginalMember(owner = "client!li", name = "t", descriptor = "Lclient!li;")
	public static final Class192 aClass192_12 = new Class192("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!li", name = "u", descriptor = "Lclient!li;")
	public static final Class192 aClass192_13 = new Class192("Profiling...", "Profiling...", "Profilage...", "Profiling...");

	@OriginalMember(owner = "client!li", name = "v", descriptor = "Lclient!li;")
	public static final Class192 aClass192_14 = new Class192("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!li", name = "w", descriptor = "Lclient!li;")
	public static final Class192 aClass192_15 = new Class192("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!li", name = "x", descriptor = "Lclient!li;")
	public static final Class192 aClass192_16 = new Class192("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

	@OriginalMember(owner = "client!li", name = "y", descriptor = "Lclient!li;")
	public static final Class192 aClass192_17 = new Class192("Fetching Updates - ", "Lade Update - ", "Chargement des MAJ - ", "Carregando atualizações - ");

	@OriginalMember(owner = "client!li", name = "z", descriptor = "Lclient!li;")
	public static final Class192 aClass192_18 = new Class192("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

	@OriginalMember(owner = "client!li", name = "A", descriptor = "Lclient!li;")
	public static final Class192 aClass192_19 = new Class192(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

	@OriginalMember(owner = "client!li", name = "B", descriptor = "Lclient!li;")
	public static final Class192 aClass192_20 = new Class192(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!li", name = "C", descriptor = "Lclient!li;")
	public static final Class192 aClass192_21 = new Class192("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

	@OriginalMember(owner = "client!li", name = "D", descriptor = "Lclient!li;")
	public static final Class192 aClass192_22 = new Class192("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!li", name = "E", descriptor = "Lclient!li;")
	public static final Class192 aClass192_23 = new Class192("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!li", name = "F", descriptor = "Lclient!li;")
	public static final Class192 aClass192_24 = new Class192("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

	@OriginalMember(owner = "client!li", name = "G", descriptor = "Lclient!li;")
	public static final Class192 aClass192_25 = new Class192(" more options", " weitere Optionen", " autres options", " mais opções");

	@OriginalMember(owner = "client!li", name = "H", descriptor = "Lclient!li;")
	public static final Class192 aClass192_26 = new Class192("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!li", name = "I", descriptor = "Lclient!li;")
	public static final Class192 aClass192_27 = new Class192("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

	@OriginalMember(owner = "client!li", name = "J", descriptor = "Lclient!li;")
	public static final Class192 aClass192_28 = new Class192("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!li", name = "K", descriptor = "Lclient!li;")
	public static final Class192 aClass192_29 = new Class192("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!li", name = "L", descriptor = "Lclient!li;")
	public static final Class192 aClass192_30 = new Class192("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

	@OriginalMember(owner = "client!li", name = "M", descriptor = "Lclient!li;")
	public static final Class192 aClass192_31 = new Class192("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

	@OriginalMember(owner = "client!li", name = "N", descriptor = "Lclient!li;")
	public static final Class192 aClass192_32 = new Class192(" ", ": ", " ", " ");

	@OriginalMember(owner = "client!li", name = "O", descriptor = "Lclient!li;")
	public static final Class192 aClass192_33 = new Class192("M", "M", "M", "M");

	@OriginalMember(owner = "client!li", name = "P", descriptor = "Lclient!li;")
	public static final Class192 aClass192_34 = new Class192("M", "M", "M", "M");

	@OriginalMember(owner = "client!li", name = "Q", descriptor = "Lclient!li;")
	public static final Class192 aClass192_35 = new Class192("K", "T", "K", "K");

	@OriginalMember(owner = "client!li", name = "R", descriptor = "Lclient!li;")
	public static final Class192 aClass192_36 = new Class192("K", "T", "K", "K");

	@OriginalMember(owner = "client!li", name = "S", descriptor = "Lclient!li;")
	public static final Class192 aClass192_37 = new Class192("Self", "Mich", "Moi", "Eu");

	@OriginalMember(owner = "client!li", name = "T", descriptor = "Lclient!li;")
	public static final Class192 aClass192_38 = new Class192(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!li", name = "U", descriptor = "Lclient!li;")
	public static final Class192 aClass192_39 = new Class192("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");

	@OriginalMember(owner = "client!li", name = "V", descriptor = "Lclient!li;")
	public static final Class192 aClass192_40 = new Class192(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!li", name = "W", descriptor = "Lclient!li;")
	public static final Class192 aClass192_41 = new Class192("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

	@OriginalMember(owner = "client!li", name = "X", descriptor = "Lclient!li;")
	public static final Class192 aClass192_42 = new Class192("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!li", name = "Y", descriptor = "Lclient!li;")
	public static final Class192 aClass192_43 = new Class192("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!li", name = "Z", descriptor = "Lclient!li;")
	public static final Class192 aClass192_44 = new Class192(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

	@OriginalMember(owner = "client!li", name = "ab", descriptor = "Lclient!li;")
	public static final Class192 aClass192_45 = new Class192("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!li", name = "bb", descriptor = "Lclient!li;")
	public static final Class192 aClass192_46 = new Class192(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!li", name = "cb", descriptor = "Lclient!li;")
	public static final Class192 aClass192_47 = new Class192("yellow:", "gelb:", "jaune:", "amarelo:");

	@OriginalMember(owner = "client!li", name = "db", descriptor = "Lclient!li;")
	public static final Class192 aClass192_48 = new Class192("red:", "rot:", "rouge:", "vermelho:");

	@OriginalMember(owner = "client!li", name = "eb", descriptor = "Lclient!li;")
	public static final Class192 aClass192_49 = new Class192("green:", "grün:", "vert:", "verde:");

	@OriginalMember(owner = "client!li", name = "fb", descriptor = "Lclient!li;")
	public static final Class192 aClass192_50 = new Class192("cyan:", "blaugrün:", "cyan:", "cyan:");

	@OriginalMember(owner = "client!li", name = "gb", descriptor = "Lclient!li;")
	public static final Class192 aClass192_51 = new Class192("purple:", "lila:", "violet:", "roxo:");

	@OriginalMember(owner = "client!li", name = "hb", descriptor = "Lclient!li;")
	public static final Class192 aClass192_52 = new Class192("white:", "weiss:", "blanc:", "branco:");

	@OriginalMember(owner = "client!li", name = "ib", descriptor = "Lclient!li;")
	public static final Class192 aClass192_53 = new Class192("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!li", name = "jb", descriptor = "Lclient!li;")
	public static final Class192 aClass192_54 = new Class192("flash2:", "blinken2:", "clignotant2:", "flash2:");

	@OriginalMember(owner = "client!li", name = "kb", descriptor = "Lclient!li;")
	public static final Class192 aClass192_55 = new Class192("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!li", name = "mb", descriptor = "Lclient!li;")
	public static final Class192 aClass192_56 = new Class192("glow2:", "leuchten2:", "brillant2:", "brilho2:");

	@OriginalMember(owner = "client!li", name = "nb", descriptor = "Lclient!li;")
	public static final Class192 aClass192_57 = new Class192("glow3:", "leuchten3:", "brillant3:", "brilho3:");

	@OriginalMember(owner = "client!li", name = "ob", descriptor = "Lclient!li;")
	public static final Class192 aClass192_58 = new Class192("wave:", "welle:", "ondulation:", "onda:");

	@OriginalMember(owner = "client!li", name = "pb", descriptor = "Lclient!li;")
	public static final Class192 aClass192_59 = new Class192("wave2:", "welle2:", "ondulation2:", "onda2:");

	@OriginalMember(owner = "client!li", name = "qb", descriptor = "Lclient!li;")
	public static final Class192 aClass192_60 = new Class192("shake:", "schütteln:", "tremblement:", "tremor:");

	@OriginalMember(owner = "client!li", name = "rb", descriptor = "Lclient!li;")
	public static final Class192 aClass192_61 = new Class192("scroll:", "scrollen:", "déroulement:", "rolagem:");

	@OriginalMember(owner = "client!li", name = "sb", descriptor = "Lclient!li;")
	public static final Class192 aClass192_62 = new Class192("slide:", "gleiten:", "glissement:", "deslizamento:");

	@OriginalMember(owner = "client!li", name = "vb", descriptor = "[I")
	public static final int[] anIntArray361 = new int[5];

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILclient!rg;)Lclient!du;")
	public static Class69_Sub1 method5295(@OriginalArg(1) Class6_Sub40 arg0) {
		return new Class69_Sub1(arg0.method8615(), arg0.method8615(), arg0.method8615(), arg0.method8615(), arg0.method8606(), arg0.method8604());
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IBIIIII)V")
	public static void method5296(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static2.anInt6 = arg4;
		Static237.anInt4766 = arg5;
		Static23.anInt4149 = arg2;
		Static570.anInt9584 = arg3;
		Static621.anInt10238 = arg0;
		Static68.anInt1419 = arg1;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method5297(@OriginalArg(0) String arg0) {
		if (Static635.aClass17Array3 != null) {
			@Pc(15) Class6_Sub9 local15 = Static560.method8089(Static391.aClass126_1, Static307.aClass208_48);
			local15.aClass6_Sub40_Sub2_1.method8589(Static583.method8194(arg0));
			local15.aClass6_Sub40_Sub2_1.method8551(arg0);
			Static263.method4681(local15);
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Z")
	public static boolean method5298(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class local8 = (Class) Static419.aHashtable6.get(arg1);
		if (local8 != null) {
			return local8.getClassLoader() == arg0.getClassLoader();
		}
		@Pc(26) File local26 = null;
		if (local26 == null) {
			local26 = (File) Static51.aHashtable1.get(arg1);
		}
		if (local26 != null) {
			try {
				local26 = new File(local26.getCanonicalPath());
				@Pc(44) Class local44 = Class.forName("java.lang.Runtime");
				@Pc(47) Class local47 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(57) Method local57 = local47.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(73) Method local73 = local44.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local57.invoke(local73, Boolean.TRUE);
				local73.invoke(Runtime.getRuntime(), arg0, local26.getPath());
				local57.invoke(local73, Boolean.FALSE);
				Static419.aHashtable6.put(arg1, arg0);
				return true;
			} catch (@Pc(116) NoSuchMethodException local116) {
				System.load(local26.getPath());
				Static419.aHashtable6.put(arg1, qfa.class);
				return true;
			} catch (@Pc(134) Throwable local134) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method5301(@OriginalArg(1) String arg0) {
		@Pc(16) String local16 = Static86.method1738(Static345.method5595(arg0));
		if (local16 == null) {
			local16 = "";
		}
		return local16;
	}
}
