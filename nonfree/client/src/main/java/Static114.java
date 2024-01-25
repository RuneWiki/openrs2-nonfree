import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
	public static int anInt2420;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "[Lclient!oc;")
	public static final Class171[] aClass171Array1 = new Class171[2048];

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
	public static int anInt2419 = 0;

	@OriginalMember(owner = "client!fj", name = "m", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_33 = new Class242("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

	@OriginalMember(owner = "client!fj", name = "n", descriptor = "J")
	public static long aLong59 = 0L;

	@OriginalMember(owner = "client!fj", name = "o", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_58 = new Class36(35, 16);

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!jb;ZI)V")
	public static void method1812(@OriginalArg(0) Class126 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int local12 = arg0.anInt3391 == 0 ? arg0.anInt3421 : arg0.anInt3391;
		@Pc(21) int local21 = arg0.anInt3386 == 0 ? arg0.anInt3442 : arg0.anInt3386;
		Static17.method401(arg0.anInt3397, Static320.aClass126ArrayArray2[arg0.anInt3397 >> 16], local12, local21, arg1);
		if (arg0.aClass126Array3 != null) {
			Static17.method401(arg0.anInt3397, arg0.aClass126Array3, local12, local21, arg1);
		}
		@Pc(58) Class4_Sub4 local58 = (Class4_Sub4) Static391.aClass196_37.method4477((long) arg0.anInt3397);
		if (local58 != null) {
			Static13.method322(arg1, local21, local58.anInt573, local12);
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(BII)Z")
	public static boolean method1814(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}
}
