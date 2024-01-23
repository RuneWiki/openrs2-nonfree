import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
	public static int anInt485;

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString15 = "";

	@OriginalMember(owner = "client!bm", name = "f", descriptor = "I")
	public static int anInt489 = 0;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(BIZI)V")
	public static void method426(@OriginalArg(2) boolean arg0) {
		Static83.anInt1562 = 2;
		Static105.aBoolean156 = arg0;
		Static155.anInt2915 = 22050;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIII)I")
	public static int method427(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg2 & 0x3;
		if (local12 == 0) {
			return arg0;
		} else if (local12 == 1) {
			return arg1;
		} else if (local12 == 2) {
			return 1023 - arg0;
		} else {
			return 1023 - arg1;
		}
	}
}
