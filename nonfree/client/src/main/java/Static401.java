import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
	public static int anInt3622;

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "[Lclient!fc;")
	public static Class76[] aClass76Array2;

	@OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
	public static int anInt3623;

	@OriginalMember(owner = "client!ub", name = "q", descriptor = "Z")
	public static boolean aBoolean287 = false;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	public static void method2973() {
		if (Static55.anIntArray48 != null) {
			return;
		}
		Static55.anIntArray48 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(22) int local22 = 0; local22 < 65536; local22++) {
			@Pc(41) double local41 = (double) (local22 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(52) double local52 = (double) (local22 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(59) double local59 = (double) (local22 & 0x7F) / 128.0D;
			@Pc(61) double local61 = local59;
			@Pc(63) double local63 = local59;
			@Pc(65) double local65 = local59;
			if (local52 != 0.0D) {
				@Pc(82) double local82;
				if (local59 < 0.5D) {
					local82 = local59 * (local52 + 1.0D);
				} else {
					local82 = local52 + local59 - local52 * local59;
				}
				@Pc(97) double local97 = local59 * 2.0D - local82;
				@Pc(101) double local101 = local41 + 0.3333333333333333D;
				if (local101 > 1.0D) {
					local101--;
				}
				@Pc(115) double local115 = local41 - 0.3333333333333333D;
				if (local41 * 6.0D < 1.0D) {
					local63 = local97 + local41 * 6.0D * (local82 - local97);
				} else if (local41 * 2.0D < 1.0D) {
					local63 = local82;
				} else if (local41 * 3.0D < 2.0D) {
					local63 = local97 + (local82 - local97) * 6.0D * (0.6666666666666666D - local41);
				} else {
					local63 = local97;
				}
				if (local115 < 0.0D) {
					local115++;
				}
				if (local101 * 6.0D < 1.0D) {
					local61 = local97 + (local82 - local97) * 6.0D * local101;
				} else if (local101 * 2.0D < 1.0D) {
					local61 = local82;
				} else if (local101 * 3.0D < 2.0D) {
					local61 = (0.6666666666666666D - local101) * (-local97 + local82) * 6.0D + local97;
				} else {
					local61 = local97;
				}
				if (local115 * 6.0D < 1.0D) {
					local65 = local97 + (local82 - local97) * 6.0D * local115;
				} else if (local115 * 2.0D < 1.0D) {
					local65 = local82;
				} else if (local115 * 3.0D < 2.0D) {
					local65 = local97 + (0.6666666666666666D - local115) * (-local97 + local82) * 6.0D;
				} else {
					local65 = local97;
				}
			}
			local61 = Math.pow(local61, local20);
			local63 = Math.pow(local63, local20);
			local65 = Math.pow(local65, local20);
			@Pc(296) int local296 = (int) (local61 * 256.0D);
			@Pc(301) int local301 = (int) (local63 * 256.0D);
			@Pc(306) int local306 = (int) (local65 * 256.0D);
			@Pc(318) int local318 = (local296 << 16) + (local301 << 8) + local306;
			Static55.anIntArray48[local22] = local318;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)Z")
	public static boolean method2974(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZ)Lclient!cv;")
	public static Class44 method2976(@OriginalArg(0) int arg0) {
		@Pc(13) Class44[] local13 = Static111.method4266();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class44 local21 = local13[local15];
			if (arg0 == local21.anInt1088) {
				return local21;
			}
		}
		return null;
	}
}
