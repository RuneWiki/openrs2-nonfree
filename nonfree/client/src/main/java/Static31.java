import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!be", name = "e", descriptor = "Lclient!xa;")
	public static Class66 aClass66_6;

	@OriginalMember(owner = "client!be", name = "h", descriptor = "I")
	public static int anInt1034;

	@OriginalMember(owner = "client!be", name = "b", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_8 = new Class181(71, 3);

	@OriginalMember(owner = "client!be", name = "g", descriptor = "I")
	public static int anInt1033 = 0;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IJ)V")
	public static void method1001(@OriginalArg(1) long arg0) {
		@Pc(10) int local10 = Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7347 + Static379.anInt7108;
		@Pc(15) int local15 = Static433.anInt7916 + Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7351;
		if (Static357.anInt6870 - local10 < -2000 || Static357.anInt6870 - local10 > 2000 || Static252.anInt5119 - local15 < -2000 || Static252.anInt5119 - local15 > 2000) {
			Static357.anInt6870 = local10;
			Static252.anInt5119 = local15;
		}
		@Pc(59) int local59;
		@Pc(67) int local67;
		if (Static357.anInt6870 != local10) {
			local59 = local10 - Static357.anInt6870;
			local67 = (int) ((long) local59 * arg0 / 320L);
			if (local59 > 0) {
				if (local67 == 0) {
					local67 = 1;
				} else if (local67 > local59) {
					local67 = local59;
				}
			} else if (local67 == 0) {
				local67 = -1;
			} else if (local67 < local59) {
				local67 = local59;
			}
			Static357.anInt6870 += local67;
		}
		if (!Static104.aClass6_Sub6_Sub1_4.aBoolean137) {
			Static200.aFloat100 += (float) arg0 * Static342.aFloat131 / 6.0F;
			Static412.aFloat175 += (float) arg0 * Static471.aFloat184 / 6.0F;
		}
		if (local15 != Static252.anInt5119) {
			local59 = local15 - Static252.anInt5119;
			local67 = (int) ((long) local59 * arg0 / 320L);
			if (local59 > 0) {
				if (local67 == 0) {
					local67 = 1;
				} else if (local59 < local67) {
					local67 = local59;
				}
			} else if (local67 == 0) {
				local67 = -1;
			} else if (local67 < local59) {
				local67 = local59;
			}
			Static252.anInt5119 += local67;
		}
		Static562.method7979();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(III)I")
	public static int method1002(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static287.anIntArray408[arg0 & 0x3] : Static546.anIntArray811[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)V")
	public static void method1003(@OriginalArg(1) int arg0) {
		Static567.anInt7671 = arg0;
		Static427.anInt9633 = -1;
		Static427.anInt9633 = -1;
		Static41.method1128();
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(II)[B")
	public static synchronized byte[] method1004(@OriginalArg(1) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static252.anInt5122 > 0) {
			local21 = Static36.aByteArrayArray2[--Static252.anInt5122];
			Static36.aByteArrayArray2[Static252.anInt5122] = null;
			return local21;
		} else if (arg0 == 5000 && Static267.anInt5280 > 0) {
			local21 = Static528.aByteArrayArray32[--Static267.anInt5280];
			Static528.aByteArrayArray32[Static267.anInt5280] = null;
			return local21;
		} else if (arg0 == 30000 && Static572.anInt9654 > 0) {
			local21 = Static579.aByteArrayArray27[--Static572.anInt9654];
			Static579.aByteArrayArray27[Static572.anInt9654] = null;
			return local21;
		} else {
			if (Static423.aByteArrayArrayArray18 != null) {
				for (@Pc(77) int local77 = 0; local77 < Static578.anIntArray845.length; local77++) {
					if (Static578.anIntArray845[local77] == arg0 && Static322.anIntArray443[local77] > 0) {
						@Pc(104) byte[] local104 = Static423.aByteArrayArrayArray18[local77][--Static322.anIntArray443[local77]];
						Static423.aByteArrayArrayArray18[local77][Static322.anIntArray443[local77]] = null;
						return local104;
					}
				}
			}
			return new byte[arg0];
		}
	}
}
