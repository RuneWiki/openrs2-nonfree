import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "Lclient!pk;")
	public static Class132 aClass132_40;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "[S")
	public static short[] aShortArray22 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
	public static int anInt2268 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
	public static int anInt2270 = 0;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static253.anInt4996 <= arg0 && Static52.anInt1146 >= arg0 && Static253.anInt4996 <= arg8 && Static52.anInt1146 >= arg8 && Static253.anInt4996 <= arg1 && Static52.anInt1146 >= arg1 && arg6 >= Static253.anInt4996 && arg6 <= Static52.anInt1146 && arg7 >= Static228.anInt4643 && arg7 <= Static244.anInt4872 && arg3 >= Static228.anInt4643 && arg3 <= Static244.anInt4872 && arg5 >= Static228.anInt4643 && arg5 <= Static244.anInt4872 && Static228.anInt4643 <= arg4 && Static244.anInt4872 >= arg4) {
			Static221.method3454(arg2, arg6, arg7, arg3, arg8, arg5, arg1, arg4, arg0);
		} else {
			Static207.method3294(arg7, arg0, arg6, arg8, arg3, arg2, arg4, arg1, arg5);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
	public static void method1772(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 8) {
			arg0 = 4;
		}
		if (arg0 == 4 && !Static273.aBoolean455) {
			arg1 = 2;
			arg0 = 2;
		}
		if (arg0 != Static87.anInt1862) {
			if (Static248.aBoolean395) {
				return;
			}
			if (Static87.anInt1862 != 0) {
				Static246.anInterface5Array1[Static87.anInt1862].method4315();
			}
			if (arg0 != 0) {
				@Pc(49) Interface5 local49 = Static246.anInterface5Array1[arg0];
				local49.method4313();
				local49.method4314(arg1);
			}
			Static60.anInt1300 = arg1;
			Static87.anInt1862 = arg0;
		} else if (arg0 != 0 && Static60.anInt1300 != arg1) {
			Static246.anInterface5Array1[arg0].method4314(arg1);
			Static60.anInt1300 = arg1;
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(III)V")
	public static void method1773(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static271.anInt5345 > 0) {
			Static92.method1481(Static271.anInt5345);
			Static271.anInt5345 = 0;
		}
		@Pc(16) int local16 = Static103.anInt2161 * arg0;
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 0;
		for (@Pc(32) int local32 = 1; local32 < 255; local32++) {
			@Pc(52) int local52 = (256 - local32) * Static211.anIntArray331[local32] / 256;
			if (local52 < 0) {
				local52 = 0;
			}
			local18 += local52;
			@Pc(64) int local64;
			for (local64 = local52; local64 < 128; local64++) {
				@Pc(72) int local72 = Static38.anIntArray59[local18++];
				@Pc(79) int local79 = Static103.anIntArray155[local16++ + arg1];
				if (local72 == 0) {
					Static167.aClass8_Sub1_Sub7_Sub1_5.anIntArray150[local20++] = local79;
				} else {
					@Pc(96) int local96 = local72 + 18;
					if (local96 > 255) {
						local96 = 255;
					}
					@Pc(110) int local110 = 256 - local72 - 18;
					local72 = Static99.anIntArray147[local72];
					if (local110 > 255) {
						local110 = 255;
					}
					Static167.aClass8_Sub1_Sub7_Sub1_5.anIntArray150[local20++] = ((local79 & 0xFF00) * local110 + (local72 & 0xFF00) * local96 & 0xFF0000) + (local110 * (local79 & 0xFF00FF) + (local72 & 0xFF00FF) * local96 & 0xFF00FF00) >> 8;
				}
			}
			for (local64 = 0; local64 < local52; local64++) {
				Static167.aClass8_Sub1_Sub7_Sub1_5.anIntArray150[local20++] = Static103.anIntArray155[arg1 + local16++];
			}
			local16 += Static103.anInt2161 - 128;
		}
		if (Static116.aBoolean188) {
			Static126.method1998(Static167.aClass8_Sub1_Sub7_Sub1_5.anIntArray150, arg1, arg0, Static167.aClass8_Sub1_Sub7_Sub1_5.anInt3602, Static167.aClass8_Sub1_Sub7_Sub1_5.anInt3603);
		} else {
			Static167.aClass8_Sub1_Sub7_Sub1_5.method2806(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!vd;)V")
	public static void method1774(@OriginalArg(0) Class170 arg0) {
		for (@Pc(2) int local2 = arg0.anInt5463; local2 <= arg0.anInt5455; local2++) {
			for (@Pc(9) int local9 = arg0.anInt5460; local9 <= arg0.anInt5458; local9++) {
				@Pc(22) Class8_Sub27 local22 = Static178.aClass8_Sub27ArrayArrayArray1[arg0.anInt5454][local2][local9];
				if (local22 != null) {
					@Pc(26) int local26;
					for (local26 = 0; local26 < local22.anInt4857; local26++) {
						if (local22.aClass170Array3[local26] == arg0) {
							local22.anInt4857--;
							for (@Pc(44) int local44 = local26; local44 < local22.anInt4857; local44++) {
								local22.aClass170Array3[local44] = local22.aClass170Array3[local44 + 1];
								local22.anIntArray367[local44] = local22.anIntArray367[local44 + 1];
							}
							local22.aClass170Array3[local22.anInt4857] = null;
							break;
						}
					}
					local22.anInt4849 = 0;
					for (local26 = 0; local26 < local22.anInt4857; local26++) {
						local22.anInt4849 |= local22.anIntArray367[local26];
					}
				}
			}
		}
	}
}
