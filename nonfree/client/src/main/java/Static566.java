import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static566 {

	@OriginalMember(owner = "client!we", name = "c", descriptor = "I")
	public static int anInt9589;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "[I")
	public static final int[] anIntArray824 = new int[25];

	@OriginalMember(owner = "client!we", name = "e", descriptor = "I")
	public static int anInt9591 = 0;

	@OriginalMember(owner = "client!we", name = "m", descriptor = "I")
	public static int anInt9597 = 2;

	@OriginalMember(owner = "client!we", name = "o", descriptor = "[I")
	public static final int[] anIntArray825 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
	public static void method8000() {
		Static6.aBoolean17 = true;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IJ)V")
	public static void method8004(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static22.method868(arg0 - 1L);
			Static22.method868(1L);
		} else {
			Static22.method868(arg0);
		}
	}
}
