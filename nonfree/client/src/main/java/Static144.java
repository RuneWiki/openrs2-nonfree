import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!fn", name = "k", descriptor = "[I")
	public static final int[] anIntArray142 = new int[1];

	@OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
	public static int anInt3006 = -1;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!ha;III[Z)V")
	public static void method2749(@OriginalArg(0) Class4_Sub5_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static499.aClass83Array3 == Static183.aClass83Array6) {
			return;
		}
		@Pc(10) int local10 = Static444.aClass83Array7[arg1].method7213(arg2, arg3);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(23) Class83 local23 = Static444.aClass83Array7[local12];
				if (local23 != null) {
					local23.DA(arg0, arg2, local10 - local23.method7213(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}
}
