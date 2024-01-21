import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
	public static int anInt748;

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "Lclient!na;")
	public static Class56 aClass56_13;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "[I")
	public static int[] anIntArray94 = new int[4000];

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
	public static int anInt743 = 0;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "Lclient!bc;")
	public static Class8 aClass8_19 = new Class8(20);

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "Lclient!pe;")
	public static Class65 aClass65_346 = Static119.method1462("null");

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "[J")
	public static long[] aLongArray1 = new long[100];

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!re;BIBIIZ)V")
	public static void method603(@OriginalArg(0) Class56_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) long local10 = (long) (arg4 + (arg3 << 16));
		@Pc(16) Class2_Sub1_Sub16 local16 = (Class2_Sub1_Sub16) Static68.aClass40_23.method851(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class2_Sub1_Sub16) Static34.aClass40_9.method851(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class2_Sub1_Sub16) Static7.aClass40_3.method851(local10);
		if (local16 == null) {
			if (!arg5) {
				local16 = (Class2_Sub1_Sub16) Static81.aClass40_15.method851(local10);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class2_Sub1_Sub16();
			local16.aByte5 = arg2;
			local16.anInt2747 = arg1;
			local16.aClass56_Sub1_30 = arg0;
			if (arg5) {
				Static68.aClass40_23.method849(local16, local10);
				Static7.anInt224++;
			} else {
				Static39.aClass74_2.method1827(local16);
				Static7.aClass40_3.method849(local16, local10);
				Static34.anInt787++;
			}
		} else if (arg5) {
			local16.method2057();
			Static68.aClass40_23.method849(local16, local10);
			Static34.anInt787--;
			Static7.anInt224++;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIII)I")
	public static int method604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if ((arg0 & 0x1) == 1) {
			@Pc(12) int local12 = arg5;
			arg5 = arg3;
			arg3 = local12;
		}
		@Pc(20) int local20 = arg1 & 0x3;
		if (local20 == 0) {
			return arg2;
		} else if (local20 == 1) {
			return 8 - arg4 - arg5;
		} else if (local20 == 2) {
			return 7 + 1 - arg2 - arg3;
		} else {
			return arg4;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z[Lclient!wa;I)V")
	public static void method606(@OriginalArg(1) Class2_Sub22[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class2_Sub22 local9 = arg0[local3];
			if (local9 != null && arg1 == local9.anInt2800 && (!local9.aBoolean124 || !Static129.method1958(local9))) {
				if (local9.anInt2813 == 0) {
					if (!local9.aBoolean124 && Static129.method1958(local9) && Static4.aClass2_Sub22_5 != local9) {
						continue;
					}
					method606(arg0, local9.anInt2835);
					if (local9.aClass2_Sub22Array2 != null) {
						method606(local9.aClass2_Sub22Array2, local9.anInt2835);
					}
					@Pc(64) Class2_Sub7 local64 = (Class2_Sub7) Static112.aClass40_21.method851((long) local9.anInt2835);
					if (local64 != null) {
						Static40.method673(local64.anInt1527);
					}
				}
				if (local9.anInt2813 == 6) {
					@Pc(94) int local94;
					if (local9.anInt2815 != -1 || local9.anInt2816 != -1) {
						@Pc(89) boolean local89 = Static18.method279(local9);
						if (local89) {
							local94 = local9.anInt2816;
						} else {
							local94 = local9.anInt2815;
						}
						if (local94 != -1) {
							@Pc(106) Class2_Sub1_Sub2 local106 = Static23.method1313(local94);
							local9.anInt2771 += Static117.anInt2579;
							while (local9.anInt2771 > local106.anIntArray21[local9.anInt2830]) {
								local9.anInt2771 -= local106.anIntArray21[local9.anInt2830];
								local9.anInt2830++;
								if (local9.anInt2830 >= local106.anIntArray19.length) {
									local9.anInt2830 -= local106.anInt160;
									if (local9.anInt2830 < 0 || local9.anInt2830 >= local106.anIntArray19.length) {
										local9.anInt2830 = 0;
									}
								}
								Static116.method1853(local9);
							}
						}
					}
					if (local9.anInt2803 != 0 && !local9.aBoolean124) {
						@Pc(180) int local180 = local9.anInt2803 >> 16;
						local94 = local9.anInt2803 << 16 >> 16;
						@Pc(191) int local191 = local180 * Static117.anInt2579;
						local94 *= Static117.anInt2579;
						local9.anInt2829 = local191 + local9.anInt2829 & 0x7FF;
						local9.anInt2812 = local94 + local9.anInt2812 & 0x7FF;
						Static116.method1853(local9);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)V")
	public static void method607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static94.method1566(arg1)) {
			Static13.method1867(Static95.aClass2_Sub22ArrayArray1[arg1], arg0);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
	public static void method610() {
		aLongArray1 = null;
		aClass8_19 = null;
		aClass56_13 = null;
		aClass65_346 = null;
		anIntArray94 = null;
	}
}
