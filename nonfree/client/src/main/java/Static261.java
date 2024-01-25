import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static261 {

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "I")
	public static int anInt5100;

	@OriginalMember(owner = "client!jfa", name = "c", descriptor = "F")
	public static float aFloat121;

	@OriginalMember(owner = "client!jfa", name = "d", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_51 = new Class269(16, 3);

	@OriginalMember(owner = "client!jfa", name = "f", descriptor = "Lclient!nt;")
	public static final Class238 aClass238_28 = new Class238();

	@OriginalMember(owner = "client!jfa", name = "g", descriptor = "Lclient!cv;")
	public static final Class62 aClass62_1 = new Class62();

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ILclient!taa;)I")
	public static int method4254(@OriginalArg(1) Class315 arg0) {
		if (Static516.aClass315_3 == arg0) {
			return 5890;
		} else if (arg0 == Static572.aClass315_4) {
			return 34167;
		} else if (arg0 == Static508.aClass315_2) {
			return 34168;
		} else if (arg0 == Static358.aClass315_1) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ZII)Z")
	public static boolean method4255(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 1000 && arg1 < 1000) {
			return true;
		} else if (arg0 >= 1000 || arg1 >= 1000) {
			return arg0 >= 1000 && arg1 >= 1000;
		} else if (Static30.method5638(arg0)) {
			return false;
		} else {
			return Static30.method5638(arg1);
		}
	}
}
