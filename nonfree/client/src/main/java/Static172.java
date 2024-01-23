import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "Lclient!jd;")
	public static Class84 aClass84_69;

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "[Lclient!rg;")
	public static Class63_Sub1[] aClass63_Sub1Array2 = new Class63_Sub1[29];

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(CI)Z")
	public static boolean method2957(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZ)V")
	public static void method2958(@OriginalArg(1) boolean arg0) {
		@Pc(12) int[] local12 = null;
		@Pc(20) byte local20;
		@Pc(18) byte[][] local18;
		if (Static60.aBoolean106 && arg0) {
			local18 = Static155.aByteArrayArray126;
			local20 = 1;
		} else {
			local20 = 4;
			local18 = Static275.aByteArrayArray117;
		}
		for (@Pc(28) int local28 = 0; local28 < local20; local28++) {
			Static203.method3422();
			for (@Pc(35) int local35 = 0; local35 < 13; local35++) {
				for (@Pc(40) int local40 = 0; local40 < 13; local40++) {
					@Pc(45) boolean local45 = false;
					@Pc(53) int local53 = Static173.anIntArrayArrayArray8[local28][local35][local40];
					if (local53 != -1) {
						@Pc(64) int local64 = local53 >> 24 & 0x3;
						if (!arg0 || local64 == 0) {
							@Pc(78) int local78 = local53 >> 1 & 0x3;
							@Pc(84) int local84 = local53 >> 14 & 0x3FF;
							@Pc(90) int local90 = local53 >> 3 & 0x7FF;
							@Pc(100) int local100 = (local84 / 8 << 8) + local90 / 8;
							for (@Pc(102) int local102 = 0; local102 < Static63.anIntArray105.length; local102++) {
								if (local100 == Static63.anIntArray105[local102] && local18[local102] != null) {
									@Pc(143) int[] local143 = Static145.method2556(local84, local78, local18[local102], local35 * 8, Static98.aClass52Array1, local28, arg0, local40 * 8, local90, local64);
									local45 = true;
									if (local12 == null && local143 != null) {
										local12 = local143;
									}
									break;
								}
							}
						}
					}
					if (!local45) {
						Static237.method3916(local28, 8, 8, local35 * 8, local40 * 8);
					}
				}
			}
		}
		if (local12 == null) {
			Static200.anInt4150 = -1;
			return;
		}
		Static173.anInt3685 = local12[2];
		Static180.anInt3867 = local12[4];
		Static200.anInt4150 = local12[0];
		Static266.anInt5528 = local12[3];
		Static79.anInt1756 = local12[1];
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)V")
	public static void method2960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static116.aBoolean191 = true;
		Static192.anInt3987 = arg0;
		Static144.anInt3120 = arg1;
		Static279.anInt5823 = arg2;
		Static217.anInt4542 = -1;
		Static201.anInt4207 = -1;
	}
}
