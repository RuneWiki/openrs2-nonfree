import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!ij", name = "F", descriptor = "Lclient!tq;")
	public static Class191 aClass191_88;

	@OriginalMember(owner = "client!ij", name = "w", descriptor = "[I")
	public static final int[] anIntArray241 = new int[50];

	@OriginalMember(owner = "client!ij", name = "A", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_55 = new Class93(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!uj;I)V")
	public static void method2721(@OriginalArg(0) Class197 arg0) {
		Static78.aClass197_1 = arg0;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB)V")
	public static void method2723() {
		@Pc(1) Class119 local1 = Static287.aClass119_173;
		synchronized (Static287.aClass119_173) {
			Static287.aClass119_173.method3315(5);
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILclient!tq;)V")
	public static void method2724(@OriginalArg(1) Class191 arg0) {
		Static79.aClass191_52 = arg0;
	}
}
