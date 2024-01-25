import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "Lclient!fo;")
	public static Class82 aClass82_8;

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "Lclient!ke;")
	public static Class131 aClass131_1;

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "Lclient!l;")
	public static Interface6 anInterface6_1;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "[[Lclient!jk;")
	public static Class124[][] aClass124ArrayArray1;

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_19 = new Class119("Your friends list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V")
	public static void method622(@OriginalArg(0) int arg0) {
		if (!Static453.aClass136_Sub1_1.aBoolean507) {
			arg0 = -1;
		}
		if (arg0 == Static168.anInt2746) {
			return;
		}
		if (arg0 != -1) {
			@Pc(28) Class81 local28 = Static95.aClass163_1.method3752(arg0);
			@Pc(32) Class72 local32 = local28.method1809();
			if (local32 == null) {
				arg0 = -1;
			} else {
				Static183.aClass83_2.method1867(new Point(local28.anInt2152, local28.anInt2145), local32.method1565(), local32.method1578(), Static392.aCanvas5, local32.method1577());
				Static168.anInt2746 = arg0;
			}
		}
		if (arg0 == -1 && Static168.anInt2746 != -1) {
			Static183.aClass83_2.method1867(new Point(), null, -1, Static392.aCanvas5, -1);
			Static168.anInt2746 = -1;
		}
	}
}
