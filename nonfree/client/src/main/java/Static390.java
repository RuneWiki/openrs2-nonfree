import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!tq", name = "g", descriptor = "Lclient!ya;")
	public static Class19 aClass19_37;

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "Z")
	public static boolean aBoolean584 = false;

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_292 = new Class22(11, -2);

	@OriginalMember(owner = "client!tq", name = "h", descriptor = "[I")
	public static final int[] anIntArray486 = new int[5];

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!wn;[[BB)V")
	public static void method4993(@OriginalArg(0) Class266_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.anInt7302; local3++) {
			Static159.method2701();
			for (@Pc(9) int local9 = 0; local9 < Static326.anInt5666 >> 3; local9++) {
				for (@Pc(13) int local13 = 0; local13 < Static283.anInt5187 >> 3; local13++) {
					@Pc(23) int local23 = Static313.anIntArrayArrayArray12[local3][local9][local13];
					if (local23 != -1) {
						@Pc(33) int local33 = local23 >> 24 & 0x3;
						if (!arg0.aBoolean687 || local33 == 0) {
							@Pc(47) int local47 = local23 >> 1 & 0x3;
							@Pc(53) int local53 = local23 >> 14 & 0x3FF;
							@Pc(59) int local59 = local23 >> 3 & 0x7FF;
							@Pc(70) int local70 = (local53 / 8 << 8) + (local59 / 8);
							for (@Pc(72) int local72 = 0; local72 < Static308.anIntArray372.length; local72++) {
								if (Static308.anIntArray372[local72] == local70 && arg1[local72] != null) {
									arg0.method5648(arg1[local72], local9 * 8, (local53 & 0x7) * 8, local47, local13 * 8, local3, Static122.aClass19_16, (local59 & 0x7) * 8, Static175.aClass213Array1, local33);
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}
