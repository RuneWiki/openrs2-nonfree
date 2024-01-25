import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!caa", name = "f", descriptor = "I")
	public static int anInt1441;

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "I")
	public static int anInt1437 = 0;

	@OriginalMember(owner = "client!caa", name = "e", descriptor = "I")
	public static final int anInt1440 = 52;

	@OriginalMember(owner = "client!caa", name = "k", descriptor = "[I")
	public static final int[] anIntArray54 = new int[6];

	@OriginalMember(owner = "client!caa", name = "l", descriptor = "Z")
	public static boolean aBoolean118 = false;

	@OriginalMember(owner = "client!caa", name = "n", descriptor = "[I")
	public static final int[] anIntArray55 = new int[] { 3500, 200 };

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(ZII)I")
	public static int method1272(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static447.anIntArray570[arg1 & 0x3] : Static291.anIntArray325[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIII)I")
	public static int method1273(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static142.anInt3092 < 100) {
			return -2;
		}
		@Pc(12) int local12 = -2;
		@Pc(14) int local14 = Integer.MAX_VALUE;
		@Pc(18) int local18 = arg2 - Static572.anInt10056;
		@Pc(23) int local23 = arg1 - Static572.anInt10059;
		for (@Pc(28) Class4_Sub20 local28 = (Class4_Sub20) Static572.aClass22_64.method895(); local28 != null; local28 = (Class4_Sub20) Static572.aClass22_64.method889()) {
			if (arg0 == local28.anInt3266) {
				@Pc(41) int local41 = local28.anInt3263;
				@Pc(44) int local44 = local28.anInt3264;
				@Pc(55) int local55 = local41 + Static572.anInt10056 << 14 | local44 + Static572.anInt10059;
				@Pc(74) int local74 = (local23 - local44) * (local23 - local44) + (local18 - local41) * (-local41 + local18);
				if (local12 < 0 || local74 < local14) {
					local12 = local55;
					local14 = local74;
				}
			}
		}
		return local12;
	}
}
