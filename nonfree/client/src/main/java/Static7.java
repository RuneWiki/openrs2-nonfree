import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
	public static int anInt84;

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_5 = new Class225(125, 9);

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
	public static int anInt82 = 0;

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
	public static int anInt83 = -1;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_6 = new Class225(127, 6);

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V")
	public static void method97() {
		for (@Pc(10) Class2_Sub44 local10 = (Class2_Sub44) Static426.aClass218_29.method5092(); local10 != null; local10 = (Class2_Sub44) Static426.aClass218_29.method5096()) {
			Static581.method8086(local10.anInt7300);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)V")
	public static void method98(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 != Static301.anInt10214) {
			Static523.anIntArray461 = new int[arg1];
			for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
				Static523.anIntArray461[local9] = (local9 << 12) / arg1;
			}
			Static381.anInt6082 = arg1 * 32;
			Static78.anInt1356 = arg1 - 1;
			Static301.anInt10214 = arg1;
		}
		if (arg0 == Static609.anInt9448) {
			return;
		}
		if (arg0 == Static301.anInt10214) {
			Static137.anIntArray170 = Static523.anIntArray461;
		} else {
			Static137.anIntArray170 = new int[arg0];
			for (@Pc(72) int local72 = 0; local72 < arg0; local72++) {
				Static137.anIntArray170[local72] = (local72 << 12) / arg0;
			}
		}
		Static332.anInt5074 = arg0 - 1;
		Static609.anInt9448 = arg0;
	}
}
