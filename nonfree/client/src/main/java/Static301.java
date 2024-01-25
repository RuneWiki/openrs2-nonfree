import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "Lclient!hp;")
	public static final Class125 aClass125_40 = new Class125(8);

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
	public static final int anInt5963 = 0;

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_91 = new Class67("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_92 = new Class67("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_93 = new Class67("Take", "Nehmen", "Prendre", "Pegar");

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIII)I")
	public static int method4970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg1 / arg2;
		@Pc(13) int local13 = arg1 & arg2 - 1;
		@Pc(17) int local17 = arg0 / arg2;
		@Pc(28) int local28 = arg2 - 1 & arg0;
		@Pc(33) int local33 = Static154.method2646(local17, local7);
		@Pc(40) int local40 = Static154.method2646(local17, local7 + 1);
		@Pc(47) int local47 = Static154.method2646(local17 + 1, local7);
		@Pc(56) int local56 = Static154.method2646(local17 + 1, local7 + 1);
		@Pc(63) int local63 = Static278.method4792(local13, local40, arg2, local33);
		@Pc(70) int local70 = Static278.method4792(local13, local56, arg2, local47);
		return Static278.method4792(local28, local70, arg2, local63);
	}
}
