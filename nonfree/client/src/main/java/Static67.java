import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!ck", name = "G", descriptor = "[I")
	public static int[] anIntArray106;

	@OriginalMember(owner = "client!ck", name = "Q", descriptor = "I")
	public static int anInt1577;

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(IIII)V")
	public static void method1399(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(7) int local7 = arg1 << 3;
		@Pc(16) int local16 = arg0 << 3;
		if (Static84.anInt1994 == 2) {
			Static268.anInt9015 = 0;
			Static393.anInt7341 = local7;
			Static348.anInt6726 = local16;
		}
		Static200.aFloat100 = local16;
		Static412.aFloat175 = local7;
		Static562.method7979();
		Static399.aBoolean713 = true;
	}
}
