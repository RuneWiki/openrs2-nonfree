import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static615 {

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "F")
	public static float aFloat209;

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "[I")
	public static final int[] anIntArray662 = new int[8];

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IBI)Z")
	public static boolean method8045(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V")
	public static void method8046() {
		Static486.method6644();
		Static449.aClass33_11 = null;
		Static412.aClass68_4 = null;
		Static322.aClass68_3 = null;
		Static258.aClass113ArrayArray1 = null;
		Static198.aClass68_2 = null;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "([[BZLclient!er;)V")
	public static void method8047(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class100_Sub1 arg1) {
		@Pc(17) int[] local17 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(20) int local20 = arg0.length;
		@Pc(41) int local41;
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(28) byte[] local28 = arg0[local22];
			if (local28 != null) {
				@Pc(35) Class4_Sub11 local35 = new Class4_Sub11(local28);
				local41 = Static472.anIntArray505[local22] >> 8;
				@Pc(47) int local47 = Static472.anIntArray505[local22] & 0xFF;
				@Pc(53) int local53 = local41 * 64 - Static445.anInt6949;
				@Pc(59) int local59 = local47 * 64 - Static321.anInt5000;
				Static253.method3677();
				arg1.method2453(local59, Static263.aClass389Array1, local35, Static445.anInt6949, local53, Static321.anInt5000);
				arg1.method2467(Static582.aClass33_13, local53, local59, local17, local35);
				if (!arg1.aBoolean182 && Static564.anInt8658 / 8 == local41 && Static390.anInt5705 / 8 == local47 && local17[0] != -1) {
					Static596.aClass332_1 = Static153.aClass344_1.method7526(local17[3], local17[2], local17[1], local17[0], Static422.aClass273_1);
					Static31.anInt9748 = local17[4];
				}
			}
		}
		for (@Pc(135) int local135 = 0; local135 < local20; local135++) {
			@Pc(148) int local148 = (Static472.anIntArray505[local135] >> 8) * 64 - Static445.anInt6949;
			local41 = (Static472.anIntArray505[local135] & 0xFF) * 64 - Static321.anInt5000;
			@Pc(162) byte[] local162 = arg0[local135];
			if (local162 == null && Static390.anInt5705 < 800) {
				Static253.method3677();
				arg1.method2457(local41, local148);
			}
		}
	}
}
