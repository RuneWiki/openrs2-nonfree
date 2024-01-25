import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!jha", name = "q", descriptor = "I")
	public static int anInt4848;

	@OriginalMember(owner = "client!jha", name = "n", descriptor = "Lclient!mr;")
	public static final Class223 aClass223_21 = new Class223();

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "([[BLclient!du;B)V")
	public static void method4359(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class81_Sub1 arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.anInt2418; local3++) {
			Static1.method8294();
			for (@Pc(9) int local9 = 0; local9 < Static634.anInt10129 >> 3; local9++) {
				for (@Pc(13) int local13 = 0; local13 < Static638.anInt10172 >> 3; local13++) {
					@Pc(23) int local23 = Static193.anIntArrayArrayArray10[local3][local9][local13];
					if (local23 != -1) {
						@Pc(33) int local33 = local23 >> 24 & 0x3;
						if (!arg1.aBoolean164 || local33 == 0) {
							@Pc(47) int local47 = local23 >> 1 & 0x3;
							@Pc(53) int local53 = local23 >> 14 & 0x3FF;
							@Pc(59) int local59 = local23 >> 3 & 0x7FF;
							@Pc(69) int local69 = local59 / 8 + (local53 / 8 << 8);
							for (@Pc(71) int local71 = 0; local71 < Static351.anIntArray405.length; local71++) {
								if (Static351.anIntArray405[local71] == local69 && arg0[local71] != null) {
									arg1.method2289(Static323.aClass5_9, Static271.aClass105Array1, local13 * 8, (local59 & 0x7) * 8, (local53 & 0x7) * 8, local33, local47, local9 * 8, local3, arg0[local71]);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(ILclient!hga;)[Lclient!uv;")
	public static Class347[] method4360(@OriginalArg(1) Class138 arg0) {
		if (!arg0.method3571()) {
			return new Class347[0];
		}
		@Pc(16) Class304 local16 = arg0.method3583();
		while (local16.anInt8838 == 0) {
			Static258.method4293(10L);
		}
		if (local16.anInt8838 == 2) {
			return new Class347[0];
		}
		@Pc(37) int[] local37 = (int[]) local16.anObject16;
		@Pc(43) Class347[] local43 = new Class347[local37.length >> 2];
		for (@Pc(45) int local45 = 0; local45 < local43.length; local45++) {
			@Pc(51) Class347 local51 = new Class347();
			local43[local45] = local51;
			local51.anInt9596 = local37[local45 << 2];
			local51.anInt9597 = local37[(local45 << 2) + 1];
			local51.anInt9593 = local37[(local45 << 2) + 2];
			local51.anInt9595 = local37[(local45 << 2) + 3];
		}
		return local43;
	}
}
