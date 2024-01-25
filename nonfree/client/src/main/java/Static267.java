import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!rn", name = "l", descriptor = "I")
	public static int anInt5492 = 64;

	@OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
	public static int anInt5493 = 0;

	@OriginalMember(owner = "client!rn", name = "o", descriptor = "I")
	public static int anInt5495 = 0;

	@OriginalMember(owner = "client!rn", name = "q", descriptor = "[I")
	public static final int[] anIntArray536 = new int[14];

	@OriginalMember(owner = "client!rn", name = "r", descriptor = "[I")
	public static final int[] anIntArray537 = new int[6];

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)V")
	public static void method4811(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub2_Sub15 local12 = Static17.method307(14, arg0);
		local12.method4782();
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(BI)V")
	public static void method4813(@OriginalArg(1) int arg0) {
		Static288.anInt5766 = -1;
		if (arg0 == 37) {
			Static150.aFloat20 = 3.0F;
		} else if (arg0 == 50) {
			Static150.aFloat20 = 4.0F;
		} else if (arg0 == 75) {
			Static150.aFloat20 = 6.0F;
		} else if (arg0 == 100) {
			Static150.aFloat20 = 8.0F;
		} else if (arg0 == 200) {
			Static150.aFloat20 = 16.0F;
		}
		Static288.anInt5766 = -1;
	}
}
