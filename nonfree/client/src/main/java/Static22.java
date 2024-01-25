import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!bf", name = "C", descriptor = "I")
	public static int anInt358;

	@OriginalMember(owner = "client!bf", name = "D", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray1 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
	public static int anInt360 = 0;

	@OriginalMember(owner = "client!bf", name = "K", descriptor = "[I")
	public static int[] anIntArray36 = new int[2];

	@OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
	public static int anInt363 = 0;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB[Lclient!mb;)V")
	public static void method338(@OriginalArg(0) int arg0, @OriginalArg(2) Class132[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class132 local9 = arg1[local3];
			if (local9 != null && arg0 == local9.anInt3500 && (!local9.aBoolean261 || !Static43.method759(local9))) {
				if (local9.anInt3524 == 0) {
					if (!local9.aBoolean261 && Static43.method759(local9) && local9 != Static153.aClass132_11) {
						continue;
					}
					method338(local9.anInt3551, arg1);
					if (local9.aClass132Array2 != null) {
						method338(local9.anInt3551, local9.aClass132Array2);
					}
					@Pc(62) Class6_Sub30 local62 = (Class6_Sub30) Static197.aClass108_30.method2900((long) local9.anInt3551);
					if (local62 != null) {
						Static172.method3366(local62.anInt4313);
					}
				}
				if (local9.anInt3524 == 6) {
					@Pc(95) int local95;
					if (local9.anInt3541 != -1 || local9.anInt3521 != -1) {
						@Pc(90) boolean local90 = Static237.method4197(local9);
						if (local90) {
							local95 = local9.anInt3521;
						} else {
							local95 = local9.anInt3541;
						}
						if (local95 != -1) {
							@Pc(107) Class24 local107 = Static209.method3737(local95);
							if (local107 != null) {
								local9.anInt3573 += Static133.anInt2448;
								while (local9.anInt3573 > local107.anIntArray66[local9.anInt3534]) {
									local9.anInt3573 -= local107.anIntArray66[local9.anInt3534];
									local9.anInt3534++;
									if (local107.anIntArray64.length <= local9.anInt3534) {
										local9.anInt3534 -= local107.anInt586;
										if (local9.anInt3534 < 0 || local107.anIntArray64.length <= local9.anInt3534) {
											local9.anInt3534 = 0;
										}
									}
									local9.anInt3487 = local9.anInt3534 + 1;
									if (local9.anInt3487 >= local107.anIntArray64.length) {
										local9.anInt3487 -= local107.anInt586;
										if (local9.anInt3487 < 0 || local9.anInt3487 >= local107.anIntArray64.length) {
											local9.anInt3487 = -1;
										}
									}
									Static298.method5108(local9);
								}
							}
						}
					}
					if (local9.anInt3529 != 0 && !local9.aBoolean261) {
						@Pc(232) int local232 = local9.anInt3529 >> 16;
						local95 = local9.anInt3529 << 16 >> 16;
						@Pc(243) int local243 = local232 * Static133.anInt2448;
						local95 *= Static133.anInt2448;
						local9.anInt3512 = local243 + local9.anInt3512 & 0x3FFF;
						local9.anInt3570 = local9.anInt3570 + local95 & 0x3FFF;
						Static298.method5108(local9);
					}
				}
			}
		}
	}
}
