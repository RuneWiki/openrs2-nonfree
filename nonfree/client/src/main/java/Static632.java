import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static632 {

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
	public static int anInt10143;

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "Lclient!wu;")
	public static Class380 aClass380_134;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "Lclient!vfa;")
	public static final Class361 aClass361_13 = new Class361();

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(III)Z")
	public static boolean method8447(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static244.method8151(arg1, arg0) | (arg1 & 0x800) != 0 || Static279.method3860(arg0, arg1);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
	public static void method8448() {
		Static183.anIntArray211 = null;
		Static85.aBoolean498 = false;
		Static32.anIntArray67 = null;
		Static535.anIntArray593 = null;
		Static562.anIntArray628 = null;
		Static594.anIntArray659 = null;
	}
}
