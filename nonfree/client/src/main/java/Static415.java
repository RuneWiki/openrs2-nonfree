import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
	public static int anInt7715;

	@OriginalMember(owner = "client!rf", name = "k", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_214 = new Class202("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!rf", name = "n", descriptor = "Z")
	public static boolean aBoolean571 = false;

	@OriginalMember(owner = "client!rf", name = "p", descriptor = "[I")
	public static int[] anIntArray592 = new int[2];

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)V")
	public static void method6468(@OriginalArg(0) int arg0) {
		Static86.anInt1765 = 2;
		Static456.anInt8316 = arg0;
		if (Static302.aString124 == null) {
			Static468.method7051(35);
		} else {
			@Pc(30) Class2_Sub29 local30 = new Class2_Sub29(Static328.method5240(Static290.method4606(Static302.aString124)));
			@Pc(34) long local34 = local30.method5218();
			Static205.aLong104 = local30.method5218();
			Static430.method6614(true, Static404.method6383(local34), "");
		}
	}
}
