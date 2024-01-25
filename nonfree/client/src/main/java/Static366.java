import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!sj", name = "L", descriptor = "I")
	public static int anInt6203;

	@OriginalMember(owner = "client!sj", name = "N", descriptor = "[I")
	public static int[] anIntArray375;

	@OriginalMember(owner = "client!sj", name = "S", descriptor = "[I")
	public static final int[] anIntArray376 = new int[25];

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(BZZ)V")
	public static void method4763(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static149.anInt7382--;
			if (Static149.anInt7382 == 0) {
				Static250.anIntArray40 = null;
			}
		}
		if (arg1) {
			Static182.anInt2949--;
			if (Static182.anInt2949 == 0) {
				Static55.anIntArray48 = null;
			}
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IB)V")
	public static void method4765(@OriginalArg(0) int arg0) {
		@Pc(16) Class1_Sub3_Sub13 local16 = Static397.method4998(2, arg0);
		local16.method3458();
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/lang/String;II)I")
	public static int method4766(@OriginalArg(0) String arg0) {
		return Static428.method5379(arg0, 16);
	}
}
