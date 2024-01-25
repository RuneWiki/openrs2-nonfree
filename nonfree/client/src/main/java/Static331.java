import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
	public static int anInt6459;

	@OriginalMember(owner = "client!vi", name = "z", descriptor = "I")
	public static int anInt6460;

	@OriginalMember(owner = "client!vi", name = "v", descriptor = "Lclient!bo;")
	public static final Class24 aClass24_32 = new Class24(16);

	@OriginalMember(owner = "client!vi", name = "y", descriptor = "[I")
	public static final int[] anIntArray539 = new int[13];

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)Z")
	public static boolean method5461() {
		@Pc(16) Class3_Sub26 local16 = (Class3_Sub26) Static116.aClass127_12.aClass3_156.aClass3_247;
		if (local16 == null || local16 == Static116.aClass127_12.aClass3_156) {
			return false;
		} else {
			if (local16.anInt2734 >= 2000) {
				local16.anInt2734 -= 2000;
			}
			return local16.anInt2734 == 1008;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IC)Z")
	public static boolean method5463(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(Z)V")
	public static void method5464() {
		for (@Pc(14) int local14 = 0; local14 < Static283.anInt4489; local14++) {
			@Pc(20) int local20 = Static303.anIntArray447[local14];
			@Pc(24) Class5_Sub4_Sub4_Sub2 local24 = Static244.aClass5_Sub4_Sub4_Sub2Array1[local20];
			@Pc(28) int local28 = Static20.aClass3_Sub4_Sub2_1.method3643();
			if ((local28 & 0x8) != 0) {
				local28 += Static20.aClass3_Sub4_Sub2_1.method3643() << 8;
			}
			@Pc(54) int local54;
			@Pc(65) int local65;
			if ((local28 & 0x10) != 0) {
				local54 = Static20.aClass3_Sub4_Sub2_1.method3675();
				if (local54 == 65535) {
					local54 = -1;
				}
				local65 = Static20.aClass3_Sub4_Sub2_1.method3672();
				Static126.method3741(local24, local54, local65);
			}
			if ((local28 & 0x20) != 0) {
				if (local24.aClass119_1.method2881()) {
					Static323.method5292(local24);
				}
				local24.method4223(Static339.method4911(Static20.aClass3_Sub4_Sub2_1.method3640()));
				local24.method4205(local24.aClass119_1.anInt3645);
				local24.anInt4931 = local24.aClass119_1.anInt3659 << 3;
				if (local24.aClass119_1.method2881()) {
					Static118.method2064(local24.anIntArray404[0], local24, 0, local24.anIntArray405[0], null, Static163.anInt3184, null);
				}
			}
			@Pc(220) int local220;
			if ((local28 & 0x1) != 0) {
				local54 = Static20.aClass3_Sub4_Sub2_1.method3675();
				local65 = Static20.aClass3_Sub4_Sub2_1.method3636();
				if (local54 == 65535) {
					local54 = -1;
				}
				@Pc(145) boolean local145 = true;
				@Pc(217) Class131 local217;
				if (local54 != -1 && local24.anInt4910 != -1) {
					@Pc(162) Class2 local162;
					if (local54 == local24.anInt4910) {
						local162 = Static155.method1566(local54);
						if (local162.aBoolean5 && local162.anInt22 != -1) {
							local217 = Static343.method5604(local162.anInt22);
							local220 = local217.anInt3986;
							if (local220 == 0) {
								local145 = false;
							} else if (local220 == 1) {
								local145 = true;
							} else if (local220 == 2) {
								local24.anInt4937 = 0;
								local145 = false;
							}
						}
					} else {
						local162 = Static155.method1566(local54);
						@Pc(167) Class2 local167 = Static155.method1566(local24.anInt4910);
						if (local162.anInt22 != -1 && local167.anInt22 != -1) {
							@Pc(182) Class131 local182 = Static343.method5604(local162.anInt22);
							@Pc(187) Class131 local187 = Static343.method5604(local167.anInt22);
							if (local182.anInt3993 < local187.anInt3993) {
								local145 = false;
							}
						}
					}
				}
				if (local145) {
					local24.anInt4910 = local54;
					local24.anInt4906 = local65 >> 16;
					local24.anInt4930 = 1;
					local24.anInt4926 = Static51.anInt1101 + (local65 & 0xFFFF);
					local24.anInt4891 = 0;
					local24.anInt4887 = 0;
					if (Static51.anInt1101 < local24.anInt4926) {
						local24.anInt4887 = -1;
					}
					if (local24.anInt4910 != -1 && Static51.anInt1101 == local24.anInt4926) {
						@Pc(302) int local302 = Static155.method1566(local24.anInt4910).anInt22;
						if (local302 != -1) {
							local217 = Static343.method5604(local302);
							if (local217 != null && local217.anIntArray335 != null) {
								Static161.method2570(0, false, local24.anInt5905, local217, local24.anInt5901);
							}
						}
					}
				}
			}
			if ((local28 & 0x80) != 0) {
				local24.anInt4942 = Static20.aClass3_Sub4_Sub2_1.method3640();
				if (local24.anInt4942 == 65535) {
					local24.anInt4942 = -1;
				}
			}
			if ((local28 & 0x200) != 0) {
				local54 = Static20.aClass3_Sub4_Sub2_1.method3643();
				@Pc(350) int[] local350 = new int[local54];
				@Pc(353) int[] local353 = new int[local54];
				@Pc(356) int[] local356 = new int[local54];
				for (@Pc(358) int local358 = 0; local358 < local54; local358++) {
					local220 = Static20.aClass3_Sub4_Sub2_1.method3649();
					if (local220 == 65535) {
						local220 = -1;
					}
					local350[local358] = local220;
					local353[local358] = Static20.aClass3_Sub4_Sub2_1.method3648();
					local356[local358] = Static20.aClass3_Sub4_Sub2_1.method3640();
				}
				Static168.method2719(local356, local353, local24, local350);
			}
			if ((local28 & 0x40) != 0) {
				local24.aString180 = Static20.aClass3_Sub4_Sub2_1.method3671();
				local24.anInt4900 = 100;
			}
			if ((local28 & 0x2) != 0) {
				local54 = Static20.aClass3_Sub4_Sub2_1.method3633();
				local65 = Static20.aClass3_Sub4_Sub2_1.method3648();
				local24.method4207(local65, Static51.anInt1101, local54);
				local24.anInt4938 = Static51.anInt1101 + 300;
				local24.anInt4945 = Static20.aClass3_Sub4_Sub2_1.method3617();
			}
			if ((local28 & 0x100) != 0) {
				local54 = Static20.aClass3_Sub4_Sub2_1.method3638();
				local24.anInt4894 = Static20.aClass3_Sub4_Sub2_1.method3643();
				local24.anInt4886 = Static20.aClass3_Sub4_Sub2_1.method3643();
				local24.anInt4909 = local54 & 0x7FFF;
				local24.aBoolean283 = (local54 & 0x8000) != 0;
				local24.anInt4940 = local24.anInt4894 + local24.anInt4909 + Static51.anInt1101;
			}
			if ((local28 & 0x400) != 0) {
				local24.anInt4904 = Static20.aClass3_Sub4_Sub2_1.method3638();
				local24.anInt4882 = Static20.aClass3_Sub4_Sub2_1.method3649();
			}
			if ((local28 & 0x4) != 0) {
				local54 = Static20.aClass3_Sub4_Sub2_1.method3633();
				local65 = Static20.aClass3_Sub4_Sub2_1.method3672();
				local24.method4207(local65, Static51.anInt1101, local54);
			}
		}
	}
}
