import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!rn", name = "i", descriptor = "[I")
	public static final int[] anIntArray581 = new int[1];

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(B)V")
	public static void method7640() {
		if (Static240.aClass150_2 != null) {
			Static240.aClass150_2.method5500();
		}
		if (Static35.aClass150_1 != null) {
			Static35.aClass150_1.method5500();
		}
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)I")
	public static int method7641() {
		return Static470.anInt8041;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IB)V")
	public static void method7642(@OriginalArg(0) int arg0) {
		@Pc(14) Class6_Sub2_Sub4 local14 = Static602.method8315((long) arg0, 7);
		local14.method2038();
	}
}
