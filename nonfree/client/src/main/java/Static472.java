import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static472 {

	@OriginalMember(owner = "client!qk", name = "r", descriptor = "D")
	public static double aDouble17;

	@OriginalMember(owner = "client!qk", name = "h", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray6 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

	@OriginalMember(owner = "client!qk", name = "n", descriptor = "Lclient!tba;")
	public static final Class323 aClass323_28 = new Class323(512);

	@OriginalMember(owner = "client!qk", name = "o", descriptor = "Z")
	public static boolean aBoolean547 = false;

	@OriginalMember(owner = "client!qk", name = "p", descriptor = "Lclient!waa;")
	public static final Class373 aClass373_7 = new Class373("LOCAL", "", "local", 4);

	@OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
	public static int anInt7602 = 0;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ICI)I")
	public static int method6674(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		@Pc(7) int local7 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			@Pc(16) char local16 = Character.toLowerCase(arg1);
			local7 = (local16 << 4) + 1;
		}
		return local7;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZI)V")
	public static void method6681(@OriginalArg(0) boolean arg0) {
		Static626.aClass51_11.method6704(Static613.aClass13_82.method8119());
		@Pc(10) int[] local10 = Static613.aClass13_82.Y();
		Static81.anInt2136 = local10[2];
		Static557.anInt9209 = local10[0];
		Static454.anInt7421 = local10[1];
		Static234.anInt4271 = local10[3];
		if (arg0) {
			Static613.aClass13_82.DA(Static316.anInt5592, Static296.anInt5347, Static314.anInt5576, Static522.anInt8441);
			Static297.method4694(Static398.aDouble14);
		} else {
			Static613.aClass13_82.DA(Static303.anInt5455, Static521.anInt8405, Static462.anInt7475, Static452.anInt7371);
			Static297.method4694(aDouble17);
		}
	}
}
