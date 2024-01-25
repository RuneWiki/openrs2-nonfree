import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
	public static int anInt3210 = 0;

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "[Lclient!fk;")
	public static final Class85[] aClass85Array1 = new Class85[30];

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
	public static int anInt3216 = -1;

	@OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
	public static int anInt3219 = 16777215;

	@OriginalMember(owner = "client!ib", name = "q", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_44 = new Class44(43, 18);

	@OriginalMember(owner = "client!ib", name = "s", descriptor = "[C")
	public static final char[] aCharArray4 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
	public static void method2606() {
		if (!Static345.aBoolean338) {
			return;
		}
		while (true) {
			while (Static393.aClass23_Sub1Array2.length > Static340.anInt5989) {
				@Pc(26) Class23_Sub1 local26 = Static393.aClass23_Sub1Array2[Static340.anInt5989];
				if (local26 != null && local26.anInt3277 == -1) {
					if (Static128.aClass2_Sub29_1 == null) {
						Static128.aClass2_Sub29_1 = Static316.aClass153_1.method3557(local26.aString21);
					}
					@Pc(49) int local49 = Static128.aClass2_Sub29_1.anInt4816;
					if (local49 == -1) {
						return;
					}
					Static340.anInt5989++;
					local26.anInt3277 = local49;
					Static128.aClass2_Sub29_1 = null;
				} else {
					Static340.anInt5989++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)V")
	public static void method2608() {
		Static179.anIntArray432 = Static204.method3166(0.4F);
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)Lclient!ms;")
	public static Class138 method2609() {
		try {
			return (Class138) Class.forName("Class138_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIBIII)V")
	public static void method2610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = arg3;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21 = arg6 - arg5;
		@Pc(26) int local26 = arg3 - arg5;
		@Pc(30) int local30 = arg6 * arg6;
		@Pc(34) int local34 = arg3 * arg3;
		@Pc(38) int local38 = local21 * local21;
		@Pc(42) int local42 = local26 * local26;
		@Pc(46) int local46 = local34 << 1;
		@Pc(50) int local50 = local30 << 1;
		@Pc(54) int local54 = local42 << 1;
		@Pc(58) int local58 = local38 << 1;
		@Pc(62) int local62 = arg3 << 1;
		@Pc(66) int local66 = local26 << 1;
		@Pc(75) int local75 = local46 + local30 * (1 - local62);
		@Pc(84) int local84 = local34 - local50 * (local62 - 1);
		@Pc(92) int local92 = (1 - local66) * local38 + local54;
		@Pc(100) int local100 = local42 - (local66 - 1) * local58;
		@Pc(104) int local104 = local30 << 2;
		@Pc(108) int local108 = local34 << 2;
		@Pc(112) int local112 = local38 << 2;
		@Pc(116) int local116 = local42 << 2;
		@Pc(120) int local120 = local46 * 3;
		@Pc(126) int local126 = (local62 - 3) * local50;
		@Pc(130) int local130 = local54 * 3;
		@Pc(136) int local136 = (local66 - 3) * local58;
		@Pc(138) int local138 = local108;
		@Pc(144) int local144 = (arg3 - 1) * local104;
		@Pc(146) int local146 = local116;
		@Pc(152) int local152 = (local26 - 1) * local112;
		@Pc(156) int[] local156 = Static277.anIntArrayArray40[arg4];
		Static49.method990(local156, arg1 - local21, arg1 + -arg6, arg2);
		Static49.method990(local156, arg1 + local21, arg1 + -local21, arg0);
		Static49.method990(local156, arg6 + arg1, arg1 - -local21, arg2);
		while (local14 > 0) {
			@Pc(200) boolean local200 = local26 >= local14;
			if (local75 < 0) {
				while (local75 < 0) {
					local75 += local120;
					local84 += local138;
					local120 += local108;
					local12++;
					local138 += local108;
				}
			}
			if (local200) {
				if (local92 < 0) {
					while (local92 < 0) {
						local92 += local130;
						local100 += local146;
						local130 += local116;
						local146 += local116;
						local16++;
					}
				}
				if (local100 < 0) {
					local92 += local130;
					local100 += local146;
					local130 += local116;
					local16++;
					local146 += local116;
				}
				local100 += -local136;
				local92 += -local152;
				local136 -= local112;
				local152 -= local112;
			}
			if (local84 < 0) {
				local84 += local138;
				local75 += local120;
				local138 += local108;
				local120 += local108;
				local12++;
			}
			local84 += -local126;
			local75 += -local144;
			local14--;
			local144 -= local104;
			local126 -= local104;
			@Pc(334) int local334 = arg4 - local14;
			@Pc(338) int local338 = local14 + arg4;
			@Pc(342) int local342 = arg1 + local12;
			@Pc(347) int local347 = arg1 - local12;
			if (local200) {
				@Pc(371) int local371 = local16 + arg1;
				@Pc(376) int local376 = arg1 - local16;
				Static49.method990(Static277.anIntArrayArray40[local334], local376, local347, arg2);
				Static49.method990(Static277.anIntArrayArray40[local334], local371, local376, arg0);
				Static49.method990(Static277.anIntArrayArray40[local334], local342, local371, arg2);
				Static49.method990(Static277.anIntArrayArray40[local338], local376, local347, arg2);
				Static49.method990(Static277.anIntArrayArray40[local338], local371, local376, arg0);
				Static49.method990(Static277.anIntArrayArray40[local338], local342, local371, arg2);
			} else {
				Static49.method990(Static277.anIntArrayArray40[local334], local342, local347, arg2);
				Static49.method990(Static277.anIntArrayArray40[local338], local342, local347, arg2);
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)I")
	public static int method2611(@OriginalArg(0) int arg0) {
		@Pc(18) int local18 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (arg0 * local24 >> 12) + 40960;
		return local32 * local18 >> 12;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIILclient!qa;III)Lclient!c;")
	public static Class32 method2612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class26 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg2;
		@Pc(12) Class32 local12 = (Class32) Static277.aClass129_48.method3023(local6);
		if (local12 == null) {
			@Pc(22) Class266 local22 = Static92.method1558(Static155.aClass188_43, arg2);
			if (local22 == null) {
				return null;
			}
			if (local22.anInt7819 < 13) {
				local22.method6061();
			}
			local12 = arg3.method2227(local22, 2055, Static393.anInt6882, 64, 768);
			Static277.aClass129_48.method3029(local12, local6);
		}
		local12 = local12.method5678((byte) 2, 2055, true);
		if (arg1 != 0) {
			local12.k(arg1);
		}
		if (arg0 != 0) {
			local12.WA(arg0);
		}
		if (arg5 != 0) {
			local12.o(arg5);
		}
		if (arg4 != 0) {
			local12.ja(0, arg4, 0);
		}
		return local12;
	}
}
