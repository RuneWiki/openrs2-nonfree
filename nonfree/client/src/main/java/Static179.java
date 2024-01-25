import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
	public static int anInt3567;

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "Lclient!tq;")
	public static Class191 aClass191_112;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_69 = new Class93("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_70 = new Class93("cyan:", "blaugrün:", "cyan:", "cyan:");

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "[I")
	public static final int[] anIntArray293 = new int[13];

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "Lclient!va;")
	public static final Class199 aClass199_18 = new Class199(512);

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
	public static int anInt3568 = 0;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)V")
	public static void method3266() {
		@Pc(5) Class119 local5 = Static322.aClass119_196;
		synchronized (Static322.aClass119_196) {
			Static322.aClass119_196.method3315(5);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!tq;B)V")
	public static void method3267(@OriginalArg(0) Class191 arg0) {
		Static301.anInt5012 = arg0.method5446("titlebg");
		Static340.anInt6746 = arg0.method5446("logo");
	}
}
