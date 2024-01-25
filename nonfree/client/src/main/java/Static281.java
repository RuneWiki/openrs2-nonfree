import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!kt", name = "t", descriptor = "I")
	public static int anInt4929;

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "I")
	public static int anInt4916 = 0;

	@OriginalMember(owner = "client!kt", name = "m", descriptor = "I")
	public static int anInt4923 = 0;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)V")
	public static void method3941() {
		@Pc(9) int[] local9 = new int[Static175.aClass114_4.anInt2779];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < Static175.aClass114_4.anInt2779; local17++) {
			@Pc(26) Class245 local26 = Static175.aClass114_4.method2217(local17);
			if (local26.anInt6182 >= 0 || local26.anInt6200 >= 0) {
				local9[local15++] = local17;
			}
		}
		Static264.anIntArray368 = new int[local15];
		for (@Pc(54) int local54 = 0; local54 < local15; local54++) {
			Static264.anIntArray368[local54] = local9[local54];
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(BII)Z")
	public static boolean method3943(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static410.method5651(arg0, arg1) || Static330.method4520(arg1, arg0);
	}
}
