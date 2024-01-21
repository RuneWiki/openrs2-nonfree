import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "Lclient!r;")
	public static Class61 aClass61_661 = Static129.method2060("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "Lclient!r;")
	private static Class61 aClass61_662 = Static129.method2060("Free world");

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "[I")
	public static int[] anIntArray291 = new int[5];

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "Lclient!r;")
	public static Class61 aClass61_663 = Static129.method2060("");

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "Lclient!r;")
	public static Class61 aClass61_664 = aClass61_662;

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
	public static int anInt2294 = 0;

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "[I")
	public static int[] anIntArray292 = new int[256];

	@OriginalMember(owner = "client!gb", name = "B", descriptor = "Lclient!r;")
	public static Class61 aClass61_665 = Static129.method2060("gelb:");

	@OriginalMember(owner = "client!gb", name = "C", descriptor = "Z")
	public static boolean aBoolean80 = false;

	@OriginalMember(owner = "client!gb", name = "D", descriptor = "I")
	public static int anInt2301 = -1;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILclient!ke;I)I")
	public static int method1509(@OriginalArg(1) Class5_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anIntArrayArray18 == null || arg0.anIntArrayArray18.length <= arg1) {
			return -2;
		}
		try {
			@Pc(19) int local19 = 0;
			@Pc(24) int[] local24 = arg0.anIntArrayArray18[arg1];
			@Pc(26) int local26 = 0;
			@Pc(28) byte local28 = 0;
			while (true) {
				@Pc(33) int local33 = local24[local26++];
				@Pc(35) int local35 = 0;
				@Pc(37) byte local37 = 0;
				if (local33 == 0) {
					return local19;
				}
				if (local33 == 1) {
					local35 = Static118.anIntArray361[local24[local26++]];
				}
				if (local33 == 2) {
					local35 = Static23.anIntArray125[local24[local26++]];
				}
				if (local33 == 15) {
					local37 = 1;
				}
				if (local33 == 3) {
					local35 = Static100.anIntArray328[local24[local26++]];
				}
				if (local33 == 16) {
					local37 = 2;
				}
				@Pc(99) int local99;
				@Pc(112) Class5_Sub11 local112;
				@Pc(117) int local117;
				@Pc(130) int local130;
				if (local33 == 4) {
					local99 = local24[local26++] << 16;
					@Pc(106) int local106 = local99 + local24[local26++];
					local112 = Static88.method2191(local106);
					local117 = local24[local26++];
					if (local117 != -1 && (!Static111.method1830(local117).aBoolean74 || Static54.aBoolean49)) {
						for (local130 = 0; local130 < local112.anIntArray246.length; local130++) {
							if (local112.anIntArray246[local130] == local117 + 1) {
								local35 += local112.anIntArray241[local130];
							}
						}
					}
				}
				if (local33 == 17) {
					local37 = 3;
				}
				if (local33 == 5) {
					local35 = Static83.anIntArray289[local24[local26++]];
				}
				if (local33 == 6) {
					local35 = Class5_Sub2_Sub6.anIntArray179[Static23.anIntArray125[local24[local26++]] - 1];
				}
				if (local33 == 7) {
					local35 = Static83.anIntArray289[local24[local26++]] * 100 / 46875;
				}
				if (local33 == 8) {
					local35 = Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2934;
				}
				if (local33 == 9) {
					for (local99 = 0; local99 < 25; local99++) {
						if (Static133.aBooleanArray18[local99]) {
							local35 += Static23.anIntArray125[local99];
						}
					}
				}
				if (local33 == 10) {
					local99 = local24[local26++] << 16;
					local99 += local24[local26++];
					local112 = Static88.method2191(local99);
					local117 = local24[local26++];
					if (local117 != -1 && (!Static111.method1830(local117).aBoolean74 || Static54.aBoolean49)) {
						for (local130 = 0; local130 < local112.anIntArray246.length; local130++) {
							if (local112.anIntArray246[local130] == local117 + 1) {
								local35 = 999999999;
								break;
							}
						}
					}
				}
				if (local33 == 11) {
					local35 = Static28.anInt901;
				}
				if (local33 == 12) {
					local35 = Static102.anInt2696;
				}
				if (local33 == 13) {
					local99 = Static83.anIntArray289[local24[local26++]];
					@Pc(323) int local323 = local24[local26++];
					local35 = (local99 & 0x1 << local323) == 0 ? 0 : 1;
				}
				if (local33 == 14) {
					local99 = local24[local26++];
					local35 = Static111.method1829(local99);
				}
				if (local33 == 18) {
					local35 = Static19.anInt623 + (Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2912 >> 7);
				}
				if (local33 == 19) {
					local35 = (Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2875 >> 7) + Static25.anInt730;
				}
				if (local33 == 20) {
					local35 = local24[local26++];
				}
				if (local37 == 0) {
					if (local28 == 0) {
						local19 += local35;
					}
					if (local28 == 1) {
						local19 -= local35;
					}
					if (local28 == 2 && local35 != 0) {
						local19 /= local35;
					}
					if (local28 == 3) {
						local19 *= local35;
					}
					local28 = 0;
				} else {
					local28 = local37;
				}
			}
		} catch (@Pc(425) Exception local425) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BLclient!ea;)V")
	public static void method1515(@OriginalArg(1) Class5_Sub2_Sub2_Sub3 arg0) {
		if (arg0.anInt2888 == 0) {
			return;
		}
		@Pc(34) int local34;
		@Pc(40) int local40;
		if (arg0.anInt2890 != -1 && arg0.anInt2890 < 32768) {
			@Pc(25) Class5_Sub2_Sub2_Sub3_Sub1 local25 = Static67.aClass5_Sub2_Sub2_Sub3_Sub1Array1[arg0.anInt2890];
			if (local25 != null) {
				local34 = arg0.anInt2912 - local25.anInt2912;
				local40 = arg0.anInt2875 - local25.anInt2875;
				if (local34 != 0 || local40 != 0) {
					arg0.anInt2909 = (int) (Math.atan2((double) local34, (double) local40) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(68) int local68;
		if (arg0.anInt2890 >= 32768) {
			local68 = arg0.anInt2890 - 32768;
			if (Static85.anInt2316 == local68) {
				local68 = 2047;
			}
			@Pc(81) Class5_Sub2_Sub2_Sub3_Sub2 local81 = Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[local68];
			if (local81 != null) {
				local40 = arg0.anInt2912 - local81.anInt2912;
				@Pc(97) int local97 = arg0.anInt2875 - local81.anInt2875;
				if (local40 != 0 || local97 != 0) {
					arg0.anInt2909 = (int) (Math.atan2((double) local40, (double) local97) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt2930 != 0 || arg0.anInt2923 != 0) && (arg0.anInt2885 == 0 || arg0.anInt2894 > 0)) {
			local34 = arg0.anInt2875 - (arg0.anInt2923 - Static25.anInt730 - Static25.anInt730) * 64;
			local68 = arg0.anInt2912 - (arg0.anInt2930 - Static19.anInt623 - Static19.anInt623) * 64;
			if (local68 != 0 || local34 != 0) {
				arg0.anInt2909 = (int) (Math.atan2((double) local68, (double) local34) * 325.949D) & 0x7FF;
			}
			arg0.anInt2923 = 0;
			arg0.anInt2930 = 0;
		}
		local68 = arg0.anInt2909 - arg0.anInt2919 & 0x7FF;
		if (local68 == 0) {
			arg0.anInt2873 = 0;
			return;
		}
		arg0.anInt2873++;
		@Pc(231) boolean local231;
		if (local68 > 1024) {
			arg0.anInt2919 -= arg0.anInt2888;
			local231 = true;
			if (local68 < arg0.anInt2888 || 2048 - arg0.anInt2888 < local68) {
				local231 = false;
				arg0.anInt2919 = arg0.anInt2909;
			}
			if (arg0.anInt2916 == arg0.anInt2917 && (arg0.anInt2873 > 25 || local231)) {
				if (arg0.anInt2877 == -1) {
					arg0.anInt2916 = arg0.anInt2915;
				} else {
					arg0.anInt2916 = arg0.anInt2877;
				}
			}
		} else {
			arg0.anInt2919 += arg0.anInt2888;
			local231 = true;
			if (arg0.anInt2888 > local68 || local68 > 2048 - arg0.anInt2888) {
				arg0.anInt2919 = arg0.anInt2909;
				local231 = false;
			}
			if (arg0.anInt2917 == arg0.anInt2916 && (arg0.anInt2873 > 25 || local231)) {
				if (arg0.anInt2878 == -1) {
					arg0.anInt2916 = arg0.anInt2915;
				} else {
					arg0.anInt2916 = arg0.anInt2878;
				}
			}
		}
		arg0.anInt2919 &= 0x7FF;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILclient!vb;IIII)V")
	public static void method1520(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub2_Sub16 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(3) Class5_Sub3 local3 = new Class5_Sub3();
		local3.anInt219 = arg0 * 128;
		local3.anInt222 = arg3 * 128;
		local3.anIntArray51 = arg1.anIntArray376;
		local3.anInt224 = arg1.anInt3117 * 128;
		local3.anInt217 = arg1.anInt3148;
		local3.anInt216 = arg1.anInt3150;
		local3.anInt215 = arg1.anInt3136;
		local3.anInt214 = arg4;
		@Pc(45) int local45 = arg1.anInt3120;
		@Pc(48) int local48 = arg1.anInt3126;
		if (arg2 == 1 || arg2 == 3) {
			local48 = arg1.anInt3120;
			local45 = arg1.anInt3126;
		}
		local3.anInt218 = (arg3 + local48) * 128;
		local3.anInt226 = (arg0 + local45) * 128;
		if (arg1.anIntArray377 != null) {
			local3.aClass5_Sub2_Sub16_1 = arg1;
			local3.method185();
		}
		Static112.aClass58_64.method1663(local3);
		if (local3.anIntArray51 != null) {
			local3.anInt220 = local3.anInt216 + (int) (Math.random() * (double) (local3.anInt215 - local3.anInt216));
		}
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)V")
	public static void method1521() {
		aClass61_662 = null;
		aClass61_664 = null;
		aClass61_661 = null;
		aClass61_665 = null;
		anIntArray292 = null;
		aClass61_663 = null;
		anIntArray291 = null;
	}
}
