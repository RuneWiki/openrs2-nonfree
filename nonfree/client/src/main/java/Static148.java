import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_139 = new Class158("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(III)V")
	public static void method4197(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class1_Sub1_Sub11 local13 = Static248.method3707(arg1, 12);
		local13.method2957();
		local13.anInt3820 = arg0;
	}
}
