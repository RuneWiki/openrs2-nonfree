import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!nv", name = "q", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!nv", name = "k", descriptor = "[S")
	public static short[] aShortArray80 = new short[256];

	@OriginalMember(owner = "client!nv", name = "l", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_177 = new Class67(6, -1);

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IILclient!mn;I)V")
	public static void method3889(@OriginalArg(0) int arg0, @OriginalArg(2) Class160 arg1, @OriginalArg(3) int arg2) {
		Static369.aClass160ArrayArray1[arg0][arg2] = arg1;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(II)V")
	public static void method3890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class216 local7 = Static259.aClass216ArrayArrayArray3[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class216 local28 = Static259.aClass216ArrayArrayArray3[local9][arg0][arg1] = Static259.aClass216ArrayArrayArray3[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte81--;
				for (@Pc(40) Class259 local40 = local28.aClass259_1; local40 != null; local40 = local40.aClass259_4) {
					@Pc(44) Class11_Sub1 local44 = local40.aClass11_Sub1_2;
					if (local44.aShort103 == arg0 && local44.aShort101 == arg1) {
						local44.aByte90--;
					}
				}
			}
		}
		if (Static259.aClass216ArrayArrayArray3[0][arg0][arg1] == null) {
			Static259.aClass216ArrayArrayArray3[0][arg0][arg1] = new Class216(0, arg0, arg1);
			Static259.aClass216ArrayArrayArray3[0][arg0][arg1].aByte79 = 1;
		}
		Static259.aClass216ArrayArrayArray3[0][arg0][arg1].aClass216_1 = local7;
		Static259.aClass216ArrayArrayArray3[3][arg0][arg1] = null;
	}
}
