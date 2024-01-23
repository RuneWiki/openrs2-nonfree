import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!il", name = "o", descriptor = "Lclient!fm;")
	public static Class57 aClass57_2;

	@OriginalMember(owner = "client!il", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString87 = "level: ";

	@OriginalMember(owner = "client!il", name = "e", descriptor = "I")
	public static int anInt2342 = -1;

	@OriginalMember(owner = "client!il", name = "p", descriptor = "I")
	public static int anInt2352 = 0;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1853(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg6 + arg1;
		@Pc(13) int local13 = arg0 + arg6;
		@Pc(18) int local18 = arg3 - arg6;
		@Pc(20) int local20;
		for (local20 = arg1; local20 < local9; local20++) {
			Static19.method343(arg0, arg4, Static181.anIntArrayArray19[local20], arg3);
		}
		@Pc(45) int local45 = arg2 - arg6;
		for (local20 = arg2; local20 > local45; local20--) {
			Static19.method343(arg0, arg4, Static181.anIntArrayArray19[local20], arg3);
		}
		for (local20 = local9; local20 <= local45; local20++) {
			@Pc(70) int[] local70 = Static181.anIntArrayArray19[local20];
			Static19.method343(arg0, arg4, local70, local13);
			Static19.method343(local13, arg5, local70, local18);
			Static19.method343(local18, arg4, local70, arg3);
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(II)Lclient!pi;")
	public static Class8_Sub1_Sub12 method1854(@OriginalArg(1) int arg0) {
		@Pc(6) Class8_Sub1_Sub12 local6 = (Class8_Sub1_Sub12) Static264.aClass125_53.method2957((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(29) byte[] local29;
		if (arg0 >= 32768) {
			local29 = Static76.aClass132_28.method3194(1, arg0 & 0x7FFF);
		} else {
			local29 = Static4.aClass132_3.method3194(1, arg0);
		}
		local6 = new Class8_Sub1_Sub12();
		if (local29 != null) {
			local6.method3128(new Class8_Sub2(local29));
		}
		if (arg0 >= 32768) {
			local6.method3138();
		}
		Static264.aClass125_53.method2956((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IB)Lclient!hn;")
	public static Class76 method1855(@OriginalArg(0) int arg0) {
		@Pc(10) Class76 local10 = (Class76) Static180.aClass61_30.method1384((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static75.aClass132_27.method3194(Static86.method1404(arg0), Static45.method4135(arg0));
		local10 = new Class76();
		local10.anInt2219 = arg0;
		if (local25 != null) {
			local10.method1713(new Class8_Sub2(local25));
		}
		local10.method1720();
		Static180.aClass61_30.method1377((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIZ)V")
	public static void method1856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class182 local13 = Static124.aClass182ArrayArrayArray1[Static34.anInt770][arg1][arg0];
		if (local13 == null) {
			Static181.method2777(Static34.anInt770, arg1, arg0);
			return;
		}
		@Pc(36) int local36 = -99999999;
		@Pc(38) Class8_Sub1_Sub15 local38 = null;
		@Pc(43) Class8_Sub1_Sub15 local43;
		for (local43 = (Class8_Sub1_Sub15) local13.method4319(); local43 != null; local43 = (Class8_Sub1_Sub15) local13.method4329()) {
			@Pc(52) Class10 local52 = Static140.method2222(local43.aClass36_Sub1_1.anInt1114);
			@Pc(55) int local55 = local52.anInt120;
			if (local52.anInt147 == 1) {
				local55 *= local43.aClass36_Sub1_1.anInt1113 + 1;
			}
			if (local36 < local55) {
				local38 = local43;
				local36 = local55;
			}
		}
		if (local38 == null) {
			Static181.method2777(Static34.anInt770, arg1, arg0);
			return;
		}
		@Pc(96) Class36_Sub1 local96 = null;
		local13.method4325(local38);
		local43 = (Class8_Sub1_Sub15) local13.method4319();
		@Pc(107) Class36_Sub1 local107 = null;
		while (local43 != null) {
			@Pc(112) Class36_Sub1 local112 = local43.aClass36_Sub1_1;
			if (local112.anInt1114 != local38.aClass36_Sub1_1.anInt1114) {
				if (local107 == null) {
					local107 = local112;
				}
				if (local112.anInt1114 != local107.anInt1114 && local96 == null) {
					local96 = local112;
				}
			}
			local43 = (Class8_Sub1_Sub15) local13.method4329();
		}
		@Pc(153) long local153 = (long) ((arg0 << 7) + arg1 + 1610612736);
		Static188.method2944(Static34.anInt770, arg1, arg0, Static59.method927(arg1 * 128 + 64, arg0 * 128 + 64, Static34.anInt770), local38.aClass36_Sub1_1, local153, local107, local96);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IZII)I")
	public static int method1858(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class8_Sub23 local8 = (Class8_Sub23) Static188.aClass129_20.method3043((long) arg0);
		if (local8 == null) {
			return 0;
		}
		@Pc(19) int local19 = 0;
		for (@Pc(26) int local26 = 0; local26 < local8.anIntArray270.length; local26++) {
			if (local8.anIntArray270[local26] >= 0 && local8.anIntArray270[local26] < Static200.anInt4048) {
				@Pc(54) Class10 local54 = Static140.method2222(local8.anIntArray270[local26]);
				if (local54.aClass129_1 != null) {
					@Pc(66) Class8_Sub28 local66 = (Class8_Sub28) local54.aClass129_1.method3043((long) arg2);
					if (local66 != null) {
						if (arg1) {
							local19 += local8.anIntArray268[local26] * local66.anInt4870;
						} else {
							local19 += local66.anInt4870;
						}
					}
				}
			}
		}
		return local19;
	}
}
