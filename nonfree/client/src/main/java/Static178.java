import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!lh", name = "z", descriptor = "I")
	public static int anInt3664;

	@OriginalMember(owner = "client!lh", name = "A", descriptor = "Lclient!mo;")
	public static Class143 aClass143_73;

	@OriginalMember(owner = "client!lh", name = "B", descriptor = "I")
	public static int anInt3665;

	@OriginalMember(owner = "client!lh", name = "C", descriptor = "I")
	public static int anInt3666;

	@OriginalMember(owner = "client!lh", name = "y", descriptor = "Lclient!al;")
	public static final Class11 aClass11_79 = new Class11(64);

	@OriginalMember(owner = "client!lh", name = "D", descriptor = "[I")
	public static final int[] anIntArray316 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "(I)V")
	public static void method3460() {
		Static145.method5367(Static228.anInt4497);
		@Pc(17) int local17 = (Static124.anInt2717 >> 10) + (Static151.anInt3234 >> 3);
		@Pc(25) int local25 = (Static251.anInt3170 >> 3) + (Static141.anInt2986 >> 10);
		Static37.anIntArray55 = new int[18];
		Static196.aByteArrayArray14 = new byte[18][];
		Static334.aByteArrayArray26 = new byte[18][];
		Static167.anIntArray485 = new int[18];
		Static179.aByteArrayArray9 = new byte[18][];
		Static169.anIntArrayArray55 = new int[18][4];
		Static196.aByteArrayArray13 = new byte[18][];
		Static243.anIntArray430 = new int[18];
		Static88.anIntArray193 = new int[18];
		Static54.anIntArray80 = new int[18];
		Static8.anIntArray9 = new int[18];
		Static113.aByteArrayArray6 = new byte[18][];
		@Pc(77) int local77 = 0;
		@Pc(96) int local96;
		for (@Pc(86) int local86 = (local17 - (Static195.anInt3965 >> 4)) / 8; local86 <= (local17 + (Static195.anInt3965 >> 4)) / 8; local86++) {
			for (local96 = (local25 - (Static298.anInt5716 >> 4)) / 8; local96 <= (local25 + (Static298.anInt5716 >> 4)) / 8; local96++) {
				@Pc(104) int local104 = local96 + (local86 << 8);
				Static8.anIntArray9[local77] = local104;
				Static243.anIntArray430[local77] = Static231.aClass143_85.method3765("m" + local86 + "_" + local96);
				Static88.anIntArray193[local77] = Static231.aClass143_85.method3765("l" + local86 + "_" + local96);
				Static37.anIntArray55[local77] = Static231.aClass143_85.method3765("n" + local86 + "_" + local96);
				Static167.anIntArray485[local77] = Static231.aClass143_85.method3765("um" + local86 + "_" + local96);
				Static54.anIntArray80[local77] = Static231.aClass143_85.method3765("ul" + local86 + "_" + local96);
				if (Static37.anIntArray55[local77] == -1) {
					Static243.anIntArray430[local77] = -1;
					Static88.anIntArray193[local77] = -1;
					Static167.anIntArray485[local77] = -1;
					Static54.anIntArray80[local77] = -1;
				}
				local77++;
			}
		}
		for (local96 = local77; local96 < Static37.anIntArray55.length; local96++) {
			Static37.anIntArray55[local96] = -1;
			Static243.anIntArray430[local96] = -1;
			Static88.anIntArray193[local96] = -1;
			Static167.anIntArray485[local96] = -1;
			Static54.anIntArray80[local96] = -1;
		}
		Static63.method1496(true, 0, local17, false, 8, 8, local25);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZIIII)I")
	public static int method3461(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = arg3 & 0xF;
		@Pc(21) int local21 = local12 < 8 ? arg0 : arg1;
		@Pc(38) int local38 = local12 >= 4 ? (local12 == 12 || local12 == 14 ? arg0 : arg2) : arg1;
		return ((local12 & 0x1) == 0 ? local21 : -local21) + ((local12 & 0x2) == 0 ? local38 : -local38);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IBIIII)V")
	public static void method3463(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg2 + 1;
		Static27.method690(arg0, Static104.anIntArrayArray31[arg2], arg3, arg4);
		@Pc(18) int local18 = arg1 - 1;
		Static27.method690(arg0, Static104.anIntArrayArray31[arg1], arg3, arg4);
		for (@Pc(25) int local25 = local9; local25 <= local18; local25++) {
			@Pc(36) int[] local36 = Static104.anIntArrayArray31[local25];
			local36[arg4] = local36[arg0] = arg3;
		}
	}
}
