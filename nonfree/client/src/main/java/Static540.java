import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!up", name = "e", descriptor = "I")
	public static int anInt8891;

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ILclient!he;)V")
	public static void method7337(@OriginalArg(1) Class20_Sub2_Sub4_Sub1 arg0) {
		@Pc(9) int local9 = arg0.anInt6429 - Static81.anInt1910;
		@Pc(20) int local20 = arg0.anInt6440 * 512 + arg0.method5349() * 256;
		@Pc(31) int local31 = arg0.anInt6449 * 512 + arg0.method5349() * 256;
		arg0.anInt8796 += (local20 - arg0.anInt8796) / local9;
		arg0.anInt8795 += (local31 - arg0.anInt8795) / local9;
		arg0.anInt6467 = 0;
		if (arg0.anInt6456 == 0) {
			arg0.method5341(8192);
		}
		if (arg0.anInt6456 == 1) {
			arg0.method5341(12288);
		}
		if (arg0.anInt6456 == 2) {
			arg0.method5341(0);
		}
		if (arg0.anInt6456 == 3) {
			arg0.method5341(4096);
		}
	}
}
