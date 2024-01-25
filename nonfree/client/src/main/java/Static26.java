import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!baa", name = "l", descriptor = "[I")
	public static int[] anIntArray39;

	@OriginalMember(owner = "client!baa", name = "d", descriptor = "I")
	public static int anInt651 = 765;

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)V")
	public static void method447() {
		if (Static250.anIntArray314 != null) {
			return;
		}
		Static250.anIntArray314 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(22) int local22 = 0; local22 < 65536; local22++) {
			@Pc(42) double local42 = (double) (local22 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(53) double local53 = (double) (local22 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(60) double local60 = (double) (local22 & 0x7F) / 128.0D;
			@Pc(62) double local62 = local60;
			@Pc(64) double local64 = local60;
			@Pc(66) double local66 = local60;
			if (local53 != 0.0D) {
				@Pc(82) double local82;
				if (local60 < 0.5D) {
					local82 = (local53 + 1.0D) * local60;
				} else {
					local82 = local60 + local53 - local53 * local60;
				}
				@Pc(97) double local97 = local60 * 2.0D - local82;
				@Pc(101) double local101 = local42 + 0.3333333333333333D;
				if (local101 > 1.0D) {
					local101--;
				}
				@Pc(115) double local115 = local42 - 0.3333333333333333D;
				if (local115 < 0.0D) {
					local115++;
				}
				if (local101 * 6.0D < 1.0D) {
					local62 = local97 + local101 * 6.0D * (local82 - local97);
				} else if (local101 * 2.0D < 1.0D) {
					local62 = local82;
				} else if (local101 * 3.0D < 2.0D) {
					local62 = local97 + (0.6666666666666666D - local101) * (-local97 + local82) * 6.0D;
				} else {
					local62 = local97;
				}
				if (local42 * 6.0D < 1.0D) {
					local64 = local97 + (local82 - local97) * 6.0D * local42;
				} else if (local42 * 2.0D < 1.0D) {
					local64 = local82;
				} else if (local42 * 3.0D < 2.0D) {
					local64 = (0.6666666666666666D - local42) * 6.0D * (local82 - local97) + local97;
				} else {
					local64 = local97;
				}
				if (local115 * 6.0D < 1.0D) {
					local66 = local97 + local115 * (local82 - local97) * 6.0D;
				} else if (local115 * 2.0D < 1.0D) {
					local66 = local82;
				} else if (local115 * 3.0D < 2.0D) {
					local66 = (local82 - local97) * (0.6666666666666666D - local115) * 6.0D + local97;
				} else {
					local66 = local97;
				}
			}
			local62 = Math.pow(local62, local20);
			local64 = Math.pow(local64, local20);
			local66 = Math.pow(local66, local20);
			@Pc(293) int local293 = (int) (local62 * 256.0D);
			@Pc(298) int local298 = (int) (local64 * 256.0D);
			@Pc(303) int local303 = (int) (local66 * 256.0D);
			@Pc(314) int local314 = local303 + (local293 << 16) + (local298 << 8);
			Static250.anIntArray314[local22] = local314;
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(BI)V")
	public static void method448(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub3_Sub13 local8 = Static382.method5650(16, arg0);
		local8.method6095();
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(Lclient!fga;Lclient!fga;I)V")
	public static void method449(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class6 arg1) {
		if (arg0.aClass6_68 != null) {
			arg0.method7989();
		}
		arg0.aClass6_67 = arg1;
		arg0.aClass6_68 = arg1.aClass6_68;
		arg0.aClass6_68.aClass6_67 = arg0;
		arg0.aClass6_67.aClass6_68 = arg0;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(BZI)Ljava/lang/String;")
	public static String method450(@OriginalArg(2) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static369.method5492(arg0);
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(III)Z")
	public static boolean method452(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 | Static274.method4152(arg1, arg0) || Static263.method4046(arg0, arg1);
	}
}
