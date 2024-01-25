import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!el", name = "l", descriptor = "[I")
	public static int[] anIntArray218;

	@OriginalMember(owner = "client!el", name = "m", descriptor = "[I")
	public static int[] anIntArray219;

	@OriginalMember(owner = "client!el", name = "o", descriptor = "Lclient!ua;")
	public static Class287 aClass287_1;

	@OriginalMember(owner = "client!el", name = "j", descriptor = "Lclient!hca;")
	public static final Class125 aClass125_2 = new Class125("LIVE", 0);

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BI)I")
	public static int method2265(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(II)V")
	public static void method2266() {
		Static481.aClass288_65.method6735(50);
		Static291.aClass288_41.method6735(50);
		Static420.aClass288_72.method6735(50);
		Static144.aClass288_21.method6735(50);
		Static92.aClass288_7.method6735(50);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(CI)Z")
	public static boolean method2267(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
	public static void method2269() {
		if (Static435.anInt7668 < 0) {
			Static435.anInt7668 = 0;
			Static201.anInt3833 = -1;
			Static107.anInt2341 = -1;
		}
		if (Static245.anInt7316 < Static435.anInt7668) {
			Static201.anInt3833 = -1;
			Static435.anInt7668 = Static245.anInt7316;
			Static107.anInt2341 = -1;
		}
		if (Static489.anInt8411 < 0) {
			Static107.anInt2341 = -1;
			Static201.anInt3833 = -1;
			Static489.anInt8411 = 0;
		}
		if (Static245.anInt7313 < Static489.anInt8411) {
			Static201.anInt3833 = -1;
			Static107.anInt2341 = -1;
			Static489.anInt8411 = Static245.anInt7313;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V")
	public static void method2273() {
		if (Static444.anIntArray587 != null) {
			return;
		}
		Static444.anIntArray587 = new int[65536];
		@Pc(24) double local24 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(26) int local26 = 0; local26 < 65536; local26++) {
			@Pc(39) double local39 = (double) (local26 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(50) double local50 = (double) (local26 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(57) double local57 = (double) (local26 & 0x7F) / 128.0D;
			@Pc(59) double local59 = local57;
			@Pc(61) double local61 = local57;
			@Pc(63) double local63 = local57;
			if (local50 != 0.0D) {
				@Pc(80) double local80;
				if (local57 < 0.5D) {
					local80 = (local50 + 1.0D) * local57;
				} else {
					local80 = local57 + local50 - local57 * local50;
				}
				@Pc(95) double local95 = local57 * 2.0D - local80;
				@Pc(99) double local99 = local39 + 0.3333333333333333D;
				if (local99 > 1.0D) {
					local99--;
				}
				@Pc(113) double local113 = local39 - 0.3333333333333333D;
				if (local99 * 6.0D < 1.0D) {
					local59 = (local80 - local95) * 6.0D * local99 + local95;
				} else if (local99 * 2.0D < 1.0D) {
					local59 = local80;
				} else if (local99 * 3.0D < 2.0D) {
					local59 = (local80 - local95) * 6.0D * (0.6666666666666666D - local99) + local95;
				} else {
					local59 = local95;
				}
				if (local113 < 0.0D) {
					local113++;
				}
				if (local39 * 6.0D < 1.0D) {
					local61 = local95 + local39 * 6.0D * (local80 - local95);
				} else if (local39 * 2.0D < 1.0D) {
					local61 = local80;
				} else if (local39 * 3.0D < 2.0D) {
					local61 = local95 + (local80 - local95) * (-local39 + 0.6666666666666666D) * 6.0D;
				} else {
					local61 = local95;
				}
				if (local113 * 6.0D < 1.0D) {
					local63 = local95 + (local80 - local95) * 6.0D * local113;
				} else if (local113 * 2.0D < 1.0D) {
					local63 = local80;
				} else if (local113 * 3.0D < 2.0D) {
					local63 = local95 + (0.6666666666666666D - local113) * 6.0D * (local80 - local95);
				} else {
					local63 = local95;
				}
			}
			local59 = Math.pow(local59, local24);
			local61 = Math.pow(local61, local24);
			local63 = Math.pow(local63, local24);
			@Pc(293) int local293 = (int) (local59 * 256.0D);
			@Pc(298) int local298 = (int) (local61 * 256.0D);
			@Pc(303) int local303 = (int) (local63 * 256.0D);
			@Pc(313) int local313 = (local298 << 8) + (local293 << 16) + local303;
			Static444.anIntArray587[local26] = local313;
		}
	}
}
