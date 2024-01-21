import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
	public static int anInt825 = 0;

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "Lclient!sd;")
	public static Class73 aClass73_483 = Static122.method531(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!dh", name = "m", descriptor = "Lclient!sd;")
	private static Class73 aClass73_487 = Static122.method531("Unable to connect)3");

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "Lclient!sd;")
	public static Class73 aClass73_484 = aClass73_487;

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "Lclient!b;")
	public static Class7 aClass7_7 = new Class7(64);

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "Lclient!sd;")
	public static Class73 aClass73_485 = aClass73_487;

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
	public static int anInt828 = 0;

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
	public static int anInt830 = 0;

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "Lclient!sd;")
	public static Class73 aClass73_486 = Static122.method531(")2");

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
	public static void method609() {
		Static96.aClass7_13.method190();
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(B[Lclient!vd;I)V")
	public static void method610(@OriginalArg(1) Class83[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(18) Class83 local18 = arg0[local7];
			if (local18 != null && local18.anInt3702 == arg1 && (!local18.aBoolean257 || !Static11.method184(local18))) {
				if (local18.anInt3722 == 0) {
					if (!local18.aBoolean257 && Static11.method184(local18) && local18 != Static142.aClass83_14) {
						continue;
					}
					method610(arg0, local18.anInt3676);
					if (local18.aClass83Array2 != null) {
						method610(local18.aClass83Array2, local18.anInt3676);
					}
					@Pc(70) Class3_Sub13 local70 = (Class3_Sub13) Static91.aClass16_9.method554((long) local18.anInt3676);
					if (local70 != null) {
						Static87.method1529(local70.anInt1133);
					}
				}
				if (local18.anInt3722 == 6) {
					@Pc(98) int local98;
					if (local18.anInt3725 != -1 || local18.anInt3724 != -1) {
						@Pc(93) boolean local93 = Static150.method2584(local18);
						if (local93) {
							local98 = local18.anInt3724;
						} else {
							local98 = local18.anInt3725;
						}
						if (local98 != -1) {
							@Pc(110) Class3_Sub1_Sub8 local110 = Static98.method1697(local98);
							local18.anInt3688 += Static165.anInt320;
							while (local110.anIntArray136[local18.anInt3693] < local18.anInt3688) {
								local18.anInt3688 -= local110.anIntArray136[local18.anInt3693];
								local18.anInt3693++;
								if (local18.anInt3693 >= local110.anIntArray138.length) {
									local18.anInt3693 -= local110.anInt1316;
									if (local18.anInt3693 < 0 || local18.anInt3693 >= local110.anIntArray138.length) {
										local18.anInt3693 = 0;
									}
								}
								Static60.method1104(local18);
							}
						}
					}
					if (local18.anInt3703 != 0 && !local18.aBoolean257) {
						local98 = local18.anInt3703 << 16 >> 16;
						@Pc(195) int local195 = local18.anInt3703 >> 16;
						local98 *= Static165.anInt320;
						local18.anInt3704 = local18.anInt3704 + local98 & 0x7FF;
						@Pc(212) int local212 = local195 * Static165.anInt320;
						local18.anInt3672 = local18.anInt3672 + local212 & 0x7FF;
						Static60.method1104(local18);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
	public static void method611() {
		aClass73_486 = null;
		aClass73_485 = null;
		aClass73_483 = null;
		aClass73_484 = null;
		aClass73_487 = null;
		aClass7_7 = null;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)V")
	public static void method612() {
		Static104.aClass7_17.method190();
		Static5.aClass7_2.method190();
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!vd;II)I")
	public static int method613(@OriginalArg(0) Class83 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anIntArrayArray38 == null || arg0.anIntArrayArray38.length <= arg1) {
			return -2;
		}
		try {
			@Pc(24) int[] local24 = arg0.anIntArrayArray38[arg1];
			@Pc(26) byte local26 = 0;
			@Pc(36) int local36 = 0;
			@Pc(38) int local38 = 0;
			while (true) {
				@Pc(43) int local43 = local24[local36++];
				@Pc(45) int local45 = 0;
				@Pc(47) byte local47 = 0;
				if (local43 == 0) {
					return local38;
				}
				if (local43 == 1) {
					local45 = Static122.anIntArray70[local24[local36++]];
				}
				if (local43 == 15) {
					local47 = 1;
				}
				if (local43 == 2) {
					local45 = Static54.anIntArray133[local24[local36++]];
				}
				if (local43 == 16) {
					local47 = 2;
				}
				if (local43 == 17) {
					local47 = 3;
				}
				if (local43 == 3) {
					local45 = Static12.anIntArray15[local24[local36++]];
				}
				@Pc(108) int local108;
				@Pc(119) Class83 local119;
				@Pc(124) int local124;
				@Pc(137) int local137;
				if (local43 == 4) {
					local108 = local24[local36++] << 16;
					@Pc(115) int local115 = local108 + local24[local36++];
					local119 = Static80.method1396(local115);
					local124 = local24[local36++];
					if (local124 != -1 && (!Static3.method42(local124).aBoolean83 || Static109.aBoolean173)) {
						for (local137 = 0; local137 < local119.anIntArray388.length; local137++) {
							if (local124 + 1 == local119.anIntArray388[local137]) {
								local45 += local119.anIntArray389[local137];
							}
						}
					}
				}
				if (local43 == 5) {
					local45 = Static81.anIntArray186[local24[local36++]];
				}
				if (local43 == 6) {
					local45 = Class3_Sub2_Sub4.anIntArray48[Static54.anIntArray133[local24[local36++]] - 1];
				}
				if (local43 == 7) {
					local45 = Static81.anIntArray186[local24[local36++]] * 100 / 46875;
				}
				if (local43 == 8) {
					local45 = Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt2712;
				}
				if (local43 == 9) {
					for (local108 = 0; local108 < 25; local108++) {
						if (Static66.aBooleanArray6[local108]) {
							local45 += Static54.anIntArray133[local108];
						}
					}
				}
				if (local43 == 10) {
					local108 = local24[local36++] << 16;
					local108 += local24[local36++];
					local119 = Static80.method1396(local108);
					local124 = local24[local36++];
					if (local124 != -1 && (!Static3.method42(local124).aBoolean83 || Static109.aBoolean173)) {
						for (local137 = 0; local137 < local119.anIntArray388.length; local137++) {
							if (local124 + 1 == local119.anIntArray388[local137]) {
								local45 = 999999999;
								break;
							}
						}
					}
				}
				if (local43 == 11) {
					local45 = Static10.anInt277;
				}
				if (local43 == 12) {
					local45 = Static38.anInt3121;
				}
				if (local43 == 13) {
					local108 = Static81.anIntArray186[local24[local36++]];
					@Pc(324) int local324 = local24[local36++];
					local45 = (0x1 << local324 & local108) == 0 ? 0 : 1;
				}
				if (local43 == 14) {
					local108 = local24[local36++];
					local45 = Static78.method1323(local108);
				}
				if (local43 == 18) {
					local45 = Static151.anInt3389 + (Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3169 >> 7);
				}
				if (local43 == 19) {
					local45 = (Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3159 >> 7) + Static134.anInt3066;
				}
				if (local43 == 20) {
					local45 = local24[local36++];
				}
				if (local47 == 0) {
					if (local26 == 0) {
						local38 += local45;
					}
					if (local26 == 1) {
						local38 -= local45;
					}
					if (local26 == 2 && local45 != 0) {
						local38 /= local45;
					}
					if (local26 == 3) {
						local38 *= local45;
					}
					local26 = 0;
				} else {
					local26 = local47;
				}
			}
		} catch (@Pc(421) Exception local421) {
			return -1;
		}
	}
}
