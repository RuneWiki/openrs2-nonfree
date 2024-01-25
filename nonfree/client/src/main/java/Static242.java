import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!pi", name = "I", descriptor = "I")
	public static int anInt4948;

	@OriginalMember(owner = "client!pi", name = "F", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_170 = new Class106("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!pi", name = "G", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_171 = new Class106("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

	@OriginalMember(owner = "client!pi", name = "H", descriptor = "[Lclient!at;")
	public static final Class1_Sub7[] aClass1_Sub7Array1 = new Class1_Sub7[2048];

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(II)Lclient!po;")
	public static Class1_Sub1 method4515(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class1_Sub1_Sub36();
		} else if (arg0 == 1) {
			return new Class1_Sub1_Sub16();
		} else if (arg0 == 2) {
			return new Class1_Sub1_Sub5();
		} else if (arg0 == 3) {
			return new Class1_Sub1_Sub15();
		} else if (arg0 == 4) {
			return new Class1_Sub1_Sub30();
		} else if (arg0 == 5) {
			return new Class1_Sub1_Sub1();
		} else if (arg0 == 6) {
			return new Class1_Sub1_Sub11();
		} else if (arg0 == 7) {
			return new Class1_Sub1_Sub39();
		} else if (arg0 == 8) {
			return new Class1_Sub1_Sub8();
		} else if (arg0 == 9) {
			return new Class1_Sub1_Sub24();
		} else if (arg0 == 10) {
			return new Class1_Sub1_Sub21();
		} else if (arg0 == 11) {
			return new Class1_Sub1_Sub7();
		} else if (arg0 == 12) {
			return new Class1_Sub1_Sub9();
		} else if (arg0 == 13) {
			return new Class1_Sub1_Sub25();
		} else if (arg0 == 14) {
			return new Class1_Sub1_Sub23();
		} else if (arg0 == 15) {
			return new Class1_Sub1_Sub26();
		} else if (arg0 == 16) {
			return new Class1_Sub1_Sub3();
		} else if (arg0 == 17) {
			return new Class1_Sub1_Sub34();
		} else if (arg0 == 18) {
			return new Class1_Sub1_Sub2_Sub1();
		} else if (arg0 == 19) {
			return new Class1_Sub1_Sub29();
		} else if (arg0 == 20) {
			return new Class1_Sub1_Sub20();
		} else if (arg0 == 21) {
			return new Class1_Sub1_Sub22();
		} else if (arg0 == 22) {
			return new Class1_Sub1_Sub13();
		} else if (arg0 == 23) {
			return new Class1_Sub1_Sub14();
		} else if (arg0 == 24) {
			return new Class1_Sub1_Sub6();
		} else if (arg0 == 25) {
			return new Class1_Sub1_Sub33();
		} else if (arg0 == 26) {
			return new Class1_Sub1_Sub19();
		} else if (arg0 == 27) {
			return new Class1_Sub1_Sub38();
		} else if (arg0 == 28) {
			return new Class1_Sub1_Sub28();
		} else if (arg0 == 29) {
			return new Class1_Sub1_Sub10();
		} else if (arg0 == 30) {
			return new Class1_Sub1_Sub31();
		} else if (arg0 == 31) {
			return new Class1_Sub1_Sub37();
		} else if (arg0 == 32) {
			return new Class1_Sub1_Sub32();
		} else if (arg0 == 33) {
			return new Class1_Sub1_Sub35();
		} else if (arg0 == 34) {
			return new Class1_Sub1_Sub4();
		} else if (arg0 == 35) {
			return new Class1_Sub1_Sub18();
		} else if (arg0 == 36) {
			return new Class1_Sub1_Sub17();
		} else if (arg0 == 37) {
			return new Class1_Sub1_Sub27();
		} else if (arg0 == 38) {
			return new Class1_Sub1_Sub12();
		} else if (arg0 == 39) {
			return new Class1_Sub1_Sub2();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!ct;ILclient!fp;)V")
	public static void method4517(@OriginalArg(0) Class30 arg0, @OriginalArg(2) Class63 arg1) {
		if (Static359.aBoolean505) {
			return;
		}
		arg1.method4627(0);
		Static355.aClass4_25 = arg1.method4589(Static382.method5435(arg0, Static109.anInt2443));
		Static355.aClass4_25.method5948((Static213.anInt4274 - Static355.aClass4_25.method5961()) / 2, (Static130.anInt2825 - Static355.aClass4_25.method5963()) / 2);
		Static214.aClass4_16 = arg1.method4589(Static382.method5435(arg0, Static287.anInt5569));
		Static214.aClass4_16.method5948((Static213.anInt4274 - Static214.aClass4_16.method5961()) / 2, 18);
		Static359.aBoolean505 = true;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)Lclient!ds;")
	public static Class11_Sub4 method4518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class155 local7 = Static105.aClass155ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass11_Sub4_2;
	}
}
