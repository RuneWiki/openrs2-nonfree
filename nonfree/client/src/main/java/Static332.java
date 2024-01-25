import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!us", name = "a", descriptor = "I")
	public static int anInt6250 = 0;

	@OriginalMember(owner = "client!us", name = "c", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_219 = new Class106("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

	@OriginalMember(owner = "client!us", name = "d", descriptor = "F")
	public static float aFloat62 = 1024.0F;

	@OriginalMember(owner = "client!us", name = "e", descriptor = "Z")
	public static boolean aBoolean467 = false;

	@OriginalMember(owner = "client!us", name = "f", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_220 = new Class106("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(II)V")
	public static void method5579(@OriginalArg(0) int arg0) {
		@Pc(15) Class1_Sub4_Sub17 local15 = Static132.method2717(arg0, 6);
		local15.method3481();
	}
}
