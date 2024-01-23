import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
	public static int anInt1827;

	@OriginalMember(owner = "client!ia", name = "W", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!ia", name = "Y", descriptor = "I")
	public static int anInt1852;

	@OriginalMember(owner = "client!ia", name = "kb", descriptor = "[I")
	public static int[] anIntArray115;

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "Lclient!ia;")
	public static Class51 aClass51_608 = Static64.method1101("Nehmen");

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "Lclient!ia;")
	public static Class51 aClass51_609 = Static64.method1101("Texturen geladen)3");

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "Z")
	public static boolean aBoolean82 = false;

	@OriginalMember(owner = "client!ia", name = "eb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_610 = Static64.method1101("(Z");

	@OriginalMember(owner = "client!ia", name = "nb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_611 = Static64.method1101(":trade:");

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg7 == arg5 && arg8 == arg1 && arg6 == arg2 && arg4 == arg0) {
			Static80.method1383(arg7, arg3, arg2, arg4, arg8);
			return;
		}
		@Pc(39) int local39 = arg7;
		@Pc(43) int local43 = arg7 * 3;
		@Pc(45) int local45 = arg8;
		@Pc(49) int local49 = arg8 * 3;
		@Pc(53) int local53 = arg5 * 3;
		@Pc(57) int local57 = arg1 * 3;
		@Pc(61) int local61 = arg0 * 3;
		@Pc(65) int local65 = arg6 * 3;
		@Pc(74) int local74 = local57 + arg4 - local61 - arg8;
		@Pc(84) int local84 = local53 + arg2 - arg7 - local65;
		@Pc(94) int local94 = local65 + local43 - local53 - local53;
		@Pc(104) int local104 = local61 + local49 - local57 - local57;
		@Pc(109) int local109 = local53 - local43;
		@Pc(114) int local114 = local57 - local49;
		for (@Pc(116) int local116 = 128; local116 <= 4096; local116 += 128) {
			@Pc(124) int local124 = local116 * local116 >> 12;
			@Pc(128) int local128 = local124 * local94;
			@Pc(132) int local132 = local116 * local109;
			@Pc(138) int local138 = local124 * local116 >> 12;
			@Pc(142) int local142 = local74 * local138;
			@Pc(146) int local146 = local104 * local124;
			@Pc(150) int local150 = local114 * local116;
			@Pc(154) int local154 = local138 * local84;
			@Pc(164) int local164 = arg8 + (local150 + local142 + local146 >> 12);
			@Pc(175) int local175 = arg7 + (local128 + local154 + local132 >> 12);
			Static80.method1383(local39, arg3, local175, local164, local45);
			local45 = local164;
			local39 = local175;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!k;Lclient!ia;)I")
	public static int method1397(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) Class51 arg1) {
		@Pc(2) int local2 = arg0.anInt4860;
		arg0.method3775(arg1.anInt1858);
		arg0.anInt4860 += Static48.aClass98_1.method2992(arg1.aByteArray17, arg0.aByteArray62, arg1.anInt1858, 0, arg0.anInt4860);
		return arg0.anInt4860 - local2;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!qe;I)V")
	public static void method1410(@OriginalArg(0) Class5_Sub1_Sub2 arg0) {
		for (@Pc(12) Class1_Sub18 local12 = (Class1_Sub18) Static150.aClass105_16.method3120(); local12 != null; local12 = (Class1_Sub18) Static150.aClass105_16.method3109()) {
			if (local12.aClass5_Sub1_Sub2_1 == arg0) {
				if (local12.aClass1_Sub4_Sub4_2 != null) {
					Static111.aClass1_Sub4_Sub3_2.method2304(local12.aClass1_Sub4_Sub4_2);
					local12.aClass1_Sub4_Sub4_2 = null;
				}
				local12.method3758();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZLclient!me;)V")
	public static void method1438(@OriginalArg(1) Class71 arg0) {
		if (arg0.anInt2817 == Static66.anInt1481) {
			Static73.aBooleanArray10[arg0.anInt2832] = true;
		}
	}
}
