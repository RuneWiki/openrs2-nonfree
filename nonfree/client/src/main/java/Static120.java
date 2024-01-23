import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!li", name = "F", descriptor = "Lclient!bh;")
	public static Class1_Sub4_Sub1 aClass1_Sub4_Sub1_2;

	@OriginalMember(owner = "client!li", name = "H", descriptor = "I")
	public static int anInt2656;

	@OriginalMember(owner = "client!li", name = "v", descriptor = "Lclient!sc;")
	public static Class102 aClass102_14 = new Class102(8);

	@OriginalMember(owner = "client!li", name = "z", descriptor = "Lclient!bd;")
	public static Interface1 anInterface1_1 = null;

	@OriginalMember(owner = "client!li", name = "E", descriptor = "Lclient!ia;")
	public static Class51 aClass51_946 = Static64.method1101(")1p");

	@OriginalMember(owner = "client!li", name = "I", descriptor = "Lclient!ia;")
	private static Class51 aClass51_948 = Static64.method1101("Your ignore list is full)3 Max of 100 users)3");

	@OriginalMember(owner = "client!li", name = "G", descriptor = "Lclient!ia;")
	public static Class51 aClass51_947 = aClass51_948;

	@OriginalMember(owner = "client!li", name = "J", descriptor = "Lclient!ia;")
	public static Class51 aClass51_949 = Static64.method1101("Null");

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I[B)V")
	public static void method2106(@OriginalArg(1) byte[] arg0) {
		@Pc(12) int local12 = 0;
		while (true) {
			while (arg0.length > local12) {
				@Pc(23) int local23 = arg0[local12++] * 64 - Static200.anInt4248;
				@Pc(33) int local33 = arg0[local12++] * 64 - Static108.anInt2405;
				@Pc(51) int local51;
				@Pc(59) int local59;
				if (local23 > 0 && local33 > 0 && Static3.anInt75 > local23 + 64 && Static87.anInt2017 > local33 + 64) {
					local51 = local23 >> 6;
					local59 = Static87.anInt2017 - local33 - 1 >> 6;
					for (@Pc(61) int local61 = 0; local61 < 64; local61++) {
						for (@Pc(65) int local65 = -64; local65 < 0; local65++) {
							@Pc(72) byte local72 = arg0[local12++];
							if (local72 != 0) {
								@Pc(87) byte local87;
								if ((local72 & 0x1) == 1) {
									local87 = arg0[local12++];
									if (Static50.aByteArrayArrayArray5[local51][local59] == null) {
										Static50.aByteArrayArrayArray5[local51][local59] = new byte[4096];
									}
									Static50.aByteArrayArrayArray5[local51][local59][(-(local65 + 1) << 6) + local61] = (byte) local87;
								}
								if ((local72 & 0x2) == 2) {
									local87 = arg0[local12++];
									if (Static201.aByteArrayArrayArray12[local51][local59] == null) {
										Static201.aByteArrayArrayArray12[local51][local59] = new byte[4096];
									}
									Static201.aByteArrayArrayArray12[local51][local59][(-(local65 + 1) << 6) + local61] = (byte) (local87 - 28);
								}
								if ((local72 & 0x4) == 4) {
									local12 += 3;
									@Pc(195) int local195 = ((arg0[local12 - 3] & 0xFF) << 16) + ((arg0[local12 - 2] & 0xFF) << 8) + (arg0[local12 + -1] & 0xFF);
									if (Static82.anIntArrayArrayArray3[local51][local59] == null) {
										Static82.anIntArrayArrayArray3[local51][local59] = new int[4096];
									}
									local195--;
									@Pc(213) Class82 local213 = Static9.method132(local195);
									if (local213.anIntArray221 != null) {
										local213 = local213.method2583();
										if (local213 == null || local213.anInt3274 == -1) {
											continue;
										}
									}
									Static82.anIntArrayArrayArray3[local51][local59][(-(local65 + 1) << 6) + local61] = local213.anInt3296 + 1;
									@Pc(252) Class1_Sub23 local252 = new Class1_Sub23();
									local252.anInt3913 = local23;
									local252.anInt3915 = local213.anInt3274;
									local252.anInt3914 = Static87.anInt2017 - local33;
									Static5.aClass105_18.method3119(local252);
								}
							}
						}
					}
				} else {
					for (local51 = 0; local51 < 64; local51++) {
						for (local59 = -64; local59 < 0; local59++) {
							@Pc(291) byte local291 = arg0[local12++];
							if (local291 != 0) {
								if ((local291 & 0x1) == 1) {
									local12++;
								}
								if ((local291 & 0x2) == 2) {
									local12++;
								}
								if ((local291 & 0x4) == 4) {
									local12 += 3;
								}
							}
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(II[BB)Z")
	public static boolean method2107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class1_Sub16 local12 = new Class1_Sub16(arg2);
		@Pc(22) int local22 = -1;
		label68: while (true) {
			@Pc(26) int local26 = local12.method3795();
			if (local26 == 0) {
				return local7;
			}
			@Pc(33) boolean local33 = false;
			local22 += local26;
			@Pc(39) int local39 = 0;
			while (true) {
				@Pc(72) int local72;
				@Pc(101) Class82 local101;
				do {
					@Pc(76) int local76;
					@Pc(80) int local80;
					do {
						do {
							do {
								do {
									@Pc(45) int local45;
									while (local33) {
										local45 = local12.method3797();
										if (local45 == 0) {
											continue label68;
										}
										local12.method3793();
									}
									local45 = local12.method3797();
									if (local45 == 0) {
										continue label68;
									}
									local39 += local45 - 1;
									@Pc(60) int local60 = local39 & 0x3F;
									@Pc(66) int local66 = local39 >> 6 & 0x3F;
									local72 = local12.method3793() >> 2;
									local76 = local66 + arg0;
									local80 = arg1 + local60;
								} while (local76 <= 0);
							} while (local80 <= 0);
						} while (local76 >= 103);
					} while (local80 >= 103);
					local101 = Static9.method132(local22);
				} while (local72 == 22 && !Static107.aBoolean98 && local101.anInt3288 == 0 && local101.anInt3294 != 1 && !local101.aBoolean148);
				local33 = true;
				if (!local101.method2571()) {
					Static98.anInt2136++;
					local7 = false;
				}
			}
		}
	}
}
