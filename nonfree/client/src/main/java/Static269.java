import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
	public static int anInt4853;

	@OriginalMember(owner = "client!ni", name = "n", descriptor = "[B")
	public static final byte[] aByteArray56 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)V")
	public static void method3794(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class109 local9 = Static383.aClass109ArrayArray1[arg0][arg1];
		if (local9 != null) {
			Static297.anInt5870 = local9.anInt2749;
			Static267.anInt4827 = local9.anInt2748;
			Static99.anInt1779 = local9.anInt2751;
		}
		Static31.method399();
	}
}
