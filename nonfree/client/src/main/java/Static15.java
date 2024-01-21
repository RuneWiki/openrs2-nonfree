import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!be", name = "G", descriptor = "I")
	public static int anInt312;

	@OriginalMember(owner = "client!be", name = "E", descriptor = "[I")
	public static final int[] anIntArray21 = new int[128];

	@OriginalMember(owner = "client!be", name = "I", descriptor = "I")
	public static int anInt314 = 0;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)V")
	public static void method267(@OriginalArg(1) int arg0) {
		@Pc(9) Class15 local9 = Static30.aClass15_1;
		synchronized (Static30.aClass15_1) {
			Static82.anInt1814 = arg0;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZI)I")
	public static int method269(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
