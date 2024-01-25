import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static369 {

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "J")
	public static long aLong219;

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray54 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "[I")
	public static final int[] anIntArray664 = new int[1024];

	@OriginalMember(owner = "client!vj", name = "l", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_95 = new Class57("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)Lclient!jd;")
	public static Class3_Sub1 method5525(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class3_Sub1_Sub29();
		} else if (arg0 == 1) {
			return new Class3_Sub1_Sub8();
		} else if (arg0 == 2) {
			return new Class3_Sub1_Sub11();
		} else if (arg0 == 3) {
			return new Class3_Sub1_Sub14();
		} else if (arg0 == 4) {
			return new Class3_Sub1_Sub6();
		} else if (arg0 == 5) {
			return new Class3_Sub1_Sub35();
		} else if (arg0 == 6) {
			return new Class3_Sub1_Sub39();
		} else if (arg0 == 7) {
			return new Class3_Sub1_Sub7();
		} else if (arg0 == 8) {
			return new Class3_Sub1_Sub25();
		} else if (arg0 == 9) {
			return new Class3_Sub1_Sub9();
		} else if (arg0 == 10) {
			return new Class3_Sub1_Sub17();
		} else if (arg0 == 11) {
			return new Class3_Sub1_Sub18();
		} else if (arg0 == 12) {
			return new Class3_Sub1_Sub30();
		} else if (arg0 == 13) {
			return new Class3_Sub1_Sub26();
		} else if (arg0 == 14) {
			return new Class3_Sub1_Sub21();
		} else if (arg0 == 15) {
			return new Class3_Sub1_Sub10();
		} else if (arg0 == 16) {
			return new Class3_Sub1_Sub15();
		} else if (arg0 == 17) {
			return new Class3_Sub1_Sub16();
		} else if (arg0 == 18) {
			return new Class3_Sub1_Sub12_Sub1();
		} else if (arg0 == 19) {
			return new Class3_Sub1_Sub37();
		} else if (arg0 == 20) {
			return new Class3_Sub1_Sub33();
		} else if (arg0 == 21) {
			return new Class3_Sub1_Sub23();
		} else if (arg0 == 22) {
			return new Class3_Sub1_Sub20();
		} else if (arg0 == 23) {
			return new Class3_Sub1_Sub38();
		} else if (arg0 == 24) {
			return new Class3_Sub1_Sub32();
		} else if (arg0 == 25) {
			return new Class3_Sub1_Sub3();
		} else if (arg0 == 26) {
			return new Class3_Sub1_Sub34();
		} else if (arg0 == 27) {
			return new Class3_Sub1_Sub22();
		} else if (arg0 == 28) {
			return new Class3_Sub1_Sub24();
		} else if (arg0 == 29) {
			return new Class3_Sub1_Sub36();
		} else if (arg0 == 30) {
			return new Class3_Sub1_Sub2();
		} else if (arg0 == 31) {
			return new Class3_Sub1_Sub4();
		} else if (arg0 == 32) {
			return new Class3_Sub1_Sub5();
		} else if (arg0 == 33) {
			return new Class3_Sub1_Sub19();
		} else if (arg0 == 34) {
			return new Class3_Sub1_Sub1();
		} else if (arg0 == 35) {
			return new Class3_Sub1_Sub13();
		} else if (arg0 == 36) {
			return new Class3_Sub1_Sub31();
		} else if (arg0 == 37) {
			return new Class3_Sub1_Sub28();
		} else if (arg0 == 38) {
			return new Class3_Sub1_Sub27();
		} else if (arg0 == 39) {
			return new Class3_Sub1_Sub12();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BI)I")
	public static int method5526(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(II)I")
	public static int method5527(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}
}
