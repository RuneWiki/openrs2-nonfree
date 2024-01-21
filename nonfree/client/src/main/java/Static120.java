import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!of", name = "s", descriptor = "Lclient!fc;")
	public static Class21 aClass21_1;

	@OriginalMember(owner = "client!of", name = "t", descriptor = "I")
	public static int anInt2868 = 0;

	@OriginalMember(owner = "client!of", name = "C", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1682 = Static107.method1838("Please remove ");

	@OriginalMember(owner = "client!of", name = "u", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1678 = aClass28_1682;

	@OriginalMember(owner = "client!of", name = "v", descriptor = "I")
	public static int anInt2869 = 0;

	@OriginalMember(owner = "client!of", name = "x", descriptor = "I")
	public static int anInt2871 = -1;

	@OriginalMember(owner = "client!of", name = "y", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1679 = aClass28_1682;

	@OriginalMember(owner = "client!of", name = "A", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1680 = Static107.method1838("p11_full");

	@OriginalMember(owner = "client!of", name = "B", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1681 = Static107.method1838("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(II)V")
	public static void method1975(@OriginalArg(0) int arg0) {
		@Pc(4) int[] local4 = Static94.aClass2_Sub4_Sub3_Sub4_4.anIntArray366;
		@Pc(11) int local11 = local4.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local4[local13] = 1;
		}
		@Pc(38) int local38;
		@Pc(40) int local40;
		for (@Pc(25) int local25 = 1; local25 < 103; local25++) {
			local38 = (103 - local25) * 512 * 4 + 24628;
			for (local40 = 1; local40 < 103; local40++) {
				if ((Static49.aByteArrayArrayArray4[arg0][local40][local25] & 0x18) == 0) {
					Static122.method2005(local4, local38, arg0, local40, local25);
				}
				if (arg0 < 3 && (Static49.aByteArrayArrayArray4[arg0 + 1][local40][local25] & 0x8) != 0) {
					Static122.method2005(local4, local38, arg0 + 1, local40, local25);
				}
				local38 += 4;
			}
		}
		Static94.aClass2_Sub4_Sub3_Sub4_4.method2836();
		local38 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (-10 + 238 + (int) (Math.random() * 20.0D) << 16) + 228;
		local40 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		@Pc(145) int local145;
		for (@Pc(141) int local141 = 1; local141 < 103; local141++) {
			for (local145 = 1; local145 < 103; local145++) {
				if ((Static49.aByteArrayArrayArray4[arg0][local145][local141] & 0x18) == 0) {
					Static59.method1059(local40, local145, local141, local38, arg0);
				}
				if (arg0 < 3 && (Static49.aByteArrayArrayArray4[arg0 + 1][local145][local141] & 0x8) != 0) {
					Static59.method1059(local40, local145, local141, local38, arg0 + 1);
				}
			}
		}
		Static14.anInt600 = 0;
		for (local145 = 0; local145 < 104; local145++) {
			for (@Pc(211) int local211 = 0; local211 < 104; local211++) {
				@Pc(218) long local218 = Static21.method469(Static103.anInt2568, local145, local211);
				if (local218 != 0L) {
					@Pc(234) int local234 = Static151.method2339((int) (local218 >>> 32) & Integer.MAX_VALUE).anInt1052;
					if (local234 >= 0) {
						@Pc(241) int local241 = local145;
						@Pc(243) int local243 = local211;
						if (local234 != 22 && local234 != 29 && local234 != 34 && local234 != 36 && local234 != 46 && local234 != 47 && local234 != 48) {
							@Pc(273) int[][] local273 = Static141.aClass36Array1[Static103.anInt2568].anIntArrayArray15;
							for (@Pc(275) int local275 = 0; local275 < 10; local275++) {
								@Pc(282) int local282 = (int) (Math.random() * 4.0D);
								if (local282 == 0 && local241 > 0 && local241 > local145 - 3 && (local273[local241 - 1][local243] & 0x12C0108) == 0) {
									local241--;
								}
								if (local282 == 1 && local241 < 103 && local241 < local145 + 3 && (local273[local241 + 1][local243] & 0x12C0180) == 0) {
									local241++;
								}
								if (local282 == 2 && local243 > 0 && local243 > local211 - 3 && (local273[local241][local243 - 1] & 0x12C0102) == 0) {
									local243--;
								}
								if (local282 == 3 && local243 < 103 && local243 < local211 + 3 && (local273[local241][local243 + 1] & 0x12C0120) == 0) {
									local243++;
								}
							}
						}
						Static150.aClass2_Sub4_Sub3_Sub4Array11[Static14.anInt600] = Static8.aClass2_Sub4_Sub3_Sub4Array4[local234];
						Static147.anIntArray313[Static14.anInt600] = local241;
						Static56.anIntArray133[Static14.anInt600] = local243;
						Static14.anInt600++;
					}
				}
			}
		}
		Static62.aClass8_1.method2593();
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(Z)V")
	public static void method1976() {
		aClass28_1680 = null;
		aClass28_1681 = null;
		aClass28_1682 = null;
		aClass21_1 = null;
		aClass28_1679 = null;
		aClass28_1678 = null;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIII)V")
	public static void method1977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static178.anInt3959 * 128) {
			arg0 = Static178.anInt3959 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static13.anInt587 * 128) {
			arg2 = Static13.anInt587 * 128 - 1;
		}
		Static140.anInt3211++;
		Static112.anInt2717 = Class2_Sub4_Sub3_Sub1.anIntArray58[arg3];
		Static175.anInt3887 = Class2_Sub4_Sub3_Sub1.anIntArray60[arg3];
		Static22.anInt738 = Class2_Sub4_Sub3_Sub1.anIntArray58[arg4];
		Static66.anInt1786 = Class2_Sub4_Sub3_Sub1.anIntArray60[arg4];
		Static13.aBooleanArrayArray1 = Static126.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static125.anInt2954 = arg0;
		Static95.anInt2362 = arg1;
		Static14.anInt612 = arg2;
		Static30.anInt927 = arg0 / 128;
		Static72.anInt1868 = arg2 / 128;
		Static48.anInt1256 = arg5;
		Static117.anInt2840 = Static30.anInt927 - Static91.anInt2325;
		if (Static117.anInt2840 < 0) {
			Static117.anInt2840 = 0;
		}
		Static167.anInt3743 = Static72.anInt1868 - Static91.anInt2325;
		if (Static167.anInt3743 < 0) {
			Static167.anInt3743 = 0;
		}
		Static150.anInt3362 = Static30.anInt927 + Static91.anInt2325;
		if (Static150.anInt3362 > Static178.anInt3959) {
			Static150.anInt3362 = Static178.anInt3959;
		}
		Static129.anInt3029 = Static72.anInt1868 + Static91.anInt2325;
		if (Static129.anInt3029 > Static13.anInt587) {
			Static129.anInt3029 = Static13.anInt587;
		}
		Static180.method2862();
		Static159.anInt4048 = 0;
		@Pc(125) int local125;
		@Pc(128) int local128;
		for (@Pc(118) int local118 = Static33.anInt946; local118 < Static152.anInt3423; local118++) {
			@Pc(123) Class2_Sub14[][] local123 = Static133.aClass2_Sub14ArrayArrayArray1[local118];
			for (local125 = Static117.anInt2840; local125 < Static150.anInt3362; local125++) {
				for (local128 = Static167.anInt3743; local128 < Static129.anInt3029; local128++) {
					@Pc(135) Class2_Sub14 local135 = local123[local125][local128];
					if (local135 != null) {
						if (local135.anInt2268 <= arg5 && (Static13.aBooleanArrayArray1[local125 + Static91.anInt2325 - Static30.anInt927][local128 + Static91.anInt2325 - Static72.anInt1868] || Static90.anIntArrayArrayArray7[local118][local125][local128] - arg1 >= 2000)) {
							local135.aBoolean111 = true;
							local135.aBoolean113 = true;
							if (local135.anInt2269 > 0) {
								local135.aBoolean112 = true;
							} else {
								local135.aBoolean112 = false;
							}
							Static159.anInt4048++;
						} else {
							local135.aBoolean111 = false;
							local135.aBoolean113 = false;
							local135.anInt2275 = 0;
						}
					}
				}
			}
		}
		@Pc(227) int local227;
		@Pc(236) int local236;
		@Pc(241) int local241;
		@Pc(245) int local245;
		@Pc(223) int local223;
		for (@Pc(210) int local210 = Static33.anInt946; local210 < Static152.anInt3423; local210++) {
			@Pc(215) Class2_Sub14[][] local215 = Static133.aClass2_Sub14ArrayArrayArray1[local210];
			for (local128 = -Static91.anInt2325; local128 <= 0; local128++) {
				local223 = Static30.anInt927 + local128;
				local227 = Static30.anInt927 - local128;
				if (local223 >= Static117.anInt2840 || local227 < Static150.anInt3362) {
					for (local236 = -Static91.anInt2325; local236 <= 0; local236++) {
						local241 = Static72.anInt1868 + local236;
						local245 = Static72.anInt1868 - local236;
						@Pc(257) Class2_Sub14 local257;
						if (local223 >= Static117.anInt2840) {
							if (local241 >= Static167.anInt3743) {
								local257 = local215[local223][local241];
								if (local257 != null && local257.aBoolean111) {
									Static44.method802(local257, true);
								}
							}
							if (local245 < Static129.anInt3029) {
								local257 = local215[local223][local245];
								if (local257 != null && local257.aBoolean111) {
									Static44.method802(local257, true);
								}
							}
						}
						if (local227 < Static150.anInt3362) {
							if (local241 >= Static167.anInt3743) {
								local257 = local215[local227][local241];
								if (local257 != null && local257.aBoolean111) {
									Static44.method802(local257, true);
								}
							}
							if (local245 < Static129.anInt3029) {
								local257 = local215[local227][local245];
								if (local257 != null && local257.aBoolean111) {
									Static44.method802(local257, true);
								}
							}
						}
						if (Static159.anInt4048 == 0) {
							Static126.aBoolean134 = false;
							return;
						}
					}
				}
			}
		}
		for (local125 = Static33.anInt946; local125 < Static152.anInt3423; local125++) {
			@Pc(341) Class2_Sub14[][] local341 = Static133.aClass2_Sub14ArrayArrayArray1[local125];
			for (local223 = -Static91.anInt2325; local223 <= 0; local223++) {
				local227 = Static30.anInt927 + local223;
				local236 = Static30.anInt927 - local223;
				if (local227 >= Static117.anInt2840 || local236 < Static150.anInt3362) {
					for (local241 = -Static91.anInt2325; local241 <= 0; local241++) {
						local245 = Static72.anInt1868 + local241;
						@Pc(371) int local371 = Static72.anInt1868 - local241;
						@Pc(383) Class2_Sub14 local383;
						if (local227 >= Static117.anInt2840) {
							if (local245 >= Static167.anInt3743) {
								local383 = local341[local227][local245];
								if (local383 != null && local383.aBoolean111) {
									Static44.method802(local383, false);
								}
							}
							if (local371 < Static129.anInt3029) {
								local383 = local341[local227][local371];
								if (local383 != null && local383.aBoolean111) {
									Static44.method802(local383, false);
								}
							}
						}
						if (local236 < Static150.anInt3362) {
							if (local245 >= Static167.anInt3743) {
								local383 = local341[local236][local245];
								if (local383 != null && local383.aBoolean111) {
									Static44.method802(local383, false);
								}
							}
							if (local371 < Static129.anInt3029) {
								local383 = local341[local236][local371];
								if (local383 != null && local383.aBoolean111) {
									Static44.method802(local383, false);
								}
							}
						}
						if (Static159.anInt4048 == 0) {
							Static126.aBoolean134 = false;
							return;
						}
					}
				}
			}
		}
		Static126.aBoolean134 = false;
	}
}
