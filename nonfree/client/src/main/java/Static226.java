import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!hja", name = "C", descriptor = "I")
	public static int anInt6457;

	@OriginalMember(owner = "client!hja", name = "s", descriptor = "Z")
	public static boolean aBoolean494 = true;

	@OriginalMember(owner = "client!hja", name = "A", descriptor = "Lclient!am;")
	public static final Class20 aClass20_7 = new Class20();

	@OriginalMember(owner = "client!hja", name = "D", descriptor = "[I")
	public static final int[] anIntArray405 = new int[4];

	@OriginalMember(owner = "client!hja", name = "F", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_125 = new Class126(117, 1);

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(II)Z")
	public static boolean method5412(@OriginalArg(1) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(IIIB)I")
	public static int method5413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 4095 - arg0;
		} else {
			return 4095 - arg2;
		}
	}
}
