import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!lh", name = "X", descriptor = "[I")
	public static int[] anIntArray299;

	@OriginalMember(owner = "client!lh", name = "Q", descriptor = "Lclient!ob;")
	public static Class70 aClass70_8 = new Class70(8);

	@OriginalMember(owner = "client!lh", name = "V", descriptor = "Lclient!i;")
	public static Class41 aClass41_783 = Static184.method2923(":assist:");

	@OriginalMember(owner = "client!lh", name = "gb", descriptor = "Lclient!i;")
	private static Class41 aClass41_785 = Static184.method2923("Members only world");

	@OriginalMember(owner = "client!lh", name = "Z", descriptor = "Lclient!i;")
	public static Class41 aClass41_784 = aClass41_785;

	@OriginalMember(owner = "client!lh", name = "db", descriptor = "I")
	public static int anInt2749 = 0;

	@OriginalMember(owner = "client!lh", name = "hb", descriptor = "Lclient!i;")
	public static Class41 aClass41_786 = Static184.method2923("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)V")
	public static void method1933() {
		Static78.aClass108_7 = new Class108();
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIZIII)V")
	public static void method1935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) long local6 = Static142.method2228(arg2, arg4, arg0);
		@Pc(26) int local26;
		@Pc(33) int local33;
		@Pc(35) int local35;
		@Pc(51) int local51;
		@Pc(58) int local58;
		if (local6 != 0L) {
			local26 = (int) local6 >> 20 & 0x3;
			local33 = (int) local6 >> 14 & 0x1F;
			local35 = arg3;
			@Pc(37) int[] local37 = Static64.anIntArray163;
			local51 = arg4 * 4 + (52736 - arg0 * 512) * 4 + 24624;
			local58 = (int) (local6 >>> 32) & Integer.MAX_VALUE;
			if (local6 > 0L) {
				local35 = arg1;
			}
			@Pc(70) Class2_Sub2_Sub14 local70 = Static168.method2705(local58);
			if (local70.anInt3076 == -1) {
				if (local33 == 0 || local33 == 2) {
					if (local26 == 0) {
						local37[local51] = local35;
						local37[local51 + 512] = local35;
						local37[local51 + 1024] = local35;
						local37[local51 + 1536] = local35;
					} else if (local26 == 1) {
						local37[local51] = local35;
						local37[local51 + 1] = local35;
						local37[local51 + 2] = local35;
						local37[local51 + 3] = local35;
					} else if (local26 == 2) {
						local37[local51 + 3] = local35;
						local37[local51 + 515] = local35;
						local37[local51 + 1024 + 3] = local35;
						local37[local51 + 3 + 1536] = local35;
					} else if (local26 == 3) {
						local37[local51 + 1536] = local35;
						local37[local51 + 1 + 1536] = local35;
						local37[local51 + 2 + 1536] = local35;
						local37[local51 + 1536 + 3] = local35;
					}
				}
				if (local33 == 3) {
					if (local26 == 0) {
						local37[local51] = local35;
					} else if (local26 == 1) {
						local37[local51 + 3] = local35;
					} else if (local26 == 2) {
						local37[local51 + 1536 + 3] = local35;
					} else if (local26 == 3) {
						local37[local51 + 1536] = local35;
					}
				}
				if (local33 == 2) {
					if (local26 == 3) {
						local37[local51] = local35;
						local37[local51 + 512] = local35;
						local37[local51 + 1024] = local35;
						local37[local51 + 1536] = local35;
					} else if (local26 == 0) {
						local37[local51] = local35;
						local37[local51 + 1] = local35;
						local37[local51 + 2] = local35;
						local37[local51 + 3] = local35;
					} else if (local26 == 1) {
						local37[local51 + 3] = local35;
						local37[local51 + 512 + 3] = local35;
						local37[local51 + 3 + 1024] = local35;
						local37[local51 + 1536 + 3] = local35;
					} else if (local26 == 2) {
						local37[local51 + 1536] = local35;
						local37[local51 + 1536 + 1] = local35;
						local37[local51 + 1538] = local35;
						local37[local51 + 3 + 1536] = local35;
					}
				}
			} else {
				@Pc(392) Class60_Sub1 local392 = Static213.aClass60_Sub1Array2[local70.anInt3076];
				if (local392 != null) {
					@Pc(405) int local405 = (local70.anInt3040 * 4 - local392.anInt3991) / 2;
					@Pc(416) int local416 = (local70.anInt3050 * 4 - local392.anInt3993) / 2;
					local392.method2740(arg4 * 4 + local405 + 48, 48 - -((104 - (arg0 - -local70.anInt3050)) * 4) + local416);
				}
			}
		}
		local6 = Static98.method1688(arg2, arg4, arg0);
		if (local6 != 0L) {
			local26 = (int) local6 >> 20 & 0x3;
			local33 = (int) local6 >> 14 & 0x1F;
			local35 = Integer.MAX_VALUE & (int) (local6 >>> 32);
			@Pc(476) Class2_Sub2_Sub14 local476 = Static168.method2705(local35);
			@Pc(508) int local508;
			if (local476.anInt3076 != -1) {
				@Pc(486) Class60_Sub1 local486 = Static213.aClass60_Sub1Array2[local476.anInt3076];
				if (local486 != null) {
					local58 = (local476.anInt3040 * 4 - local486.anInt3991) / 2;
					local508 = (local476.anInt3050 * 4 - local486.anInt3993) / 2;
					local486.method2740(arg4 * 4 + local58 + 48, local508 + (-local476.anInt3050 + -arg0 + 104) * 4 + 48);
				}
			} else if (local33 == 9) {
				local51 = 15658734;
				@Pc(541) int[] local541 = Static64.anIntArray163;
				if (local6 > 0L) {
					local51 = 15597568;
				}
				local508 = arg4 * 4 + (103 - arg0) * 512 * 4 + 24624;
				if (local26 == 0 || local26 == 2) {
					local541[local508 + 1536] = local51;
					local541[local508 + 1025] = local51;
					local541[local508 + 514] = local51;
					local541[local508 + 3] = local51;
				} else {
					local541[local508] = local51;
					local541[local508 + 1 + 512] = local51;
					local541[local508 + 1024 + 2] = local51;
					local541[local508 + 1539] = local51;
				}
			}
		}
		local6 = Static65.method1200(arg2, arg4, arg0);
		if (local6 == 0L) {
			return;
		}
		local26 = Integer.MAX_VALUE & (int) (local6 >>> 32);
		@Pc(643) Class2_Sub2_Sub14 local643 = Static168.method2705(local26);
		if (local643.anInt3076 == -1) {
			return;
		}
		@Pc(653) Class60_Sub1 local653 = Static213.aClass60_Sub1Array2[local643.anInt3076];
		if (local653 != null) {
			@Pc(665) int local665 = (local643.anInt3040 * 4 - local653.anInt3991) / 2;
			local51 = (local643.anInt3050 * 4 - local653.anInt3993) / 2;
			local653.method2740(local665 + arg4 * 4 + 48, (-arg0 + 104 + -local643.anInt3050) * 4 + 48 - -local51);
			return;
		}
	}
}
