import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "[Lclient!o;")
	public static Class85[] aClass85Array12;

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
	public static int anInt6066;

	@OriginalMember(owner = "client!sj", name = "j", descriptor = "Lclient!oi;")
	public static Class185 aClass185_99;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "[I")
	public static final int[] anIntArray456 = new int[25];

	@OriginalMember(owner = "client!sj", name = "k", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_96 = new Class142("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

	@OriginalMember(owner = "client!sj", name = "l", descriptor = "Lclient!rm;")
	public static final Class184 aClass184_1 = Static460.method5928();

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
	public static void method4867() {
		Static155.aBoolean247 = true;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZI)Lclient!ui;")
	public static Class250 method4868(@OriginalArg(1) int arg0) {
		@Pc(10) Class250 local10 = (Class250) Static111.aClass77_18.method1387((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static277.aClass185_73.method4002(0, arg0);
		local10 = new Class250();
		if (local20 != null) {
			local10.method5271(new Class1_Sub19(local20));
		}
		local10.method5269();
		Static111.aClass77_18.method1396(local10, (long) arg0);
		return local10;
	}
}
