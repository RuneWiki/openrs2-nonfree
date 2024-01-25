import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!br", name = "e", descriptor = "Lclient!f;")
	public static Class76 aClass76_4;

	@OriginalMember(owner = "client!br", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray1 = new String[8];

	@OriginalMember(owner = "client!br", name = "h", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_16 = new Class81(37, 5);

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method723(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static220.anInt4206 >= 100) {
			Static165.method4929(Static375.aClass256_137.method5720(Static272.anInt7537));
			return;
		}
		@Pc(24) String local24 = Static384.method5331(arg0);
		if (local24 == null) {
			return;
		}
		@Pc(69) String local69;
		for (@Pc(29) int local29 = 0; local29 < Static220.anInt4206; local29++) {
			@Pc(37) String local37 = Static384.method5331(Static74.aStringArray8[local29]);
			if (local37 != null && local37.equals(local24)) {
				Static165.method4929(arg0 + Static441.aClass256_163.method5720(Static272.anInt7537));
				return;
			}
			if (Static203.aStringArray17[local29] != null) {
				local69 = Static384.method5331(Static203.aStringArray17[local29]);
				if (local69 != null && local69.equals(local24)) {
					Static165.method4929(arg0 + Static441.aClass256_163.method5720(Static272.anInt7537));
					return;
				}
			}
		}
		for (@Pc(95) int local95 = 0; local95 < Static304.anInt5397; local95++) {
			local69 = Static384.method5331(Static371.aStringArray36[local95]);
			if (local69 != null && local69.equals(local24)) {
				Static165.method4929(Static28.aClass256_14.method5720(Static272.anInt7537) + arg0 + Static265.aClass256_150.method5720(Static272.anInt7537));
				return;
			}
			if (Static351.aStringArray32[local95] != null) {
				@Pc(140) String local140 = Static384.method5331(Static351.aStringArray32[local95]);
				if (local140 != null && local140.equals(local24)) {
					Static165.method4929(Static28.aClass256_14.method5720(Static272.anInt7537) + arg0 + Static265.aClass256_150.method5720(Static272.anInt7537));
					return;
				}
			}
		}
		if (Static384.method5331(Static231.aClass4_Sub2_Sub2_Sub1_2.aString48).equals(local24)) {
			Static165.method4929(Static31.aClass256_57.method5720(Static272.anInt7537));
		} else {
			Static448.method6059(Static345.aClass44_53);
			Static98.aClass2_Sub20_Sub1_1.method3699(Static209.method3225(arg0) + 1);
			Static98.aClass2_Sub20_Sub1_1.method3715(arg0);
			Static98.aClass2_Sub20_Sub1_1.method3699(arg1 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V")
	public static void method724() {
		Static20.aClass245_1.method5496();
		Static400.aClass239_5.method5404();
		Static10.aClass61_1.method1478();
		Static406.aClass150_3.method3515();
		Static417.aClass234_2.method5358();
		Static350.aClass149_2.method3488();
		Static9.aClass194_1.method4374();
		Static137.aClass16_2.method253();
		Static363.aClass165_1.method3910();
		Static417.aClass237_1.method5381();
		Static4.aClass136_1.method3179();
		Static304.aClass173_4.method4019();
		Static325.aClass221_4.method5013();
		Static150.aClass43_1.method1213();
		Static31.aClass93_2.method1862();
		Static303.aClass35_1.method993();
		Static148.aClass123_1.method2825();
		Static48.aClass97_1.method1992();
		Static164.aClass246_2.method5507();
		Static56.aClass252_1.method5644();
		Static176.method2777();
		Static171.method2645();
		Static359.method3806();
		Static246.method3810();
		Static356.aClass129_54.method3028(5);
		Static342.aClass129_53.method3028(5);
		Static190.aClass129_30.method3028(5);
		Static173.aClass129_27.method3028(5);
		Static290.aClass129_49.method3028(5);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IBII)V")
	public static void method725(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg1 + "," + (arg2 >> 6) + "," + (arg0 >> 6) + "," + (arg2 & 0x3F) + "," + (arg0 & 0x3F);
		System.out.println(local35);
		Static176.method2774(local35, true);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 == arg7 && arg2 == arg8 && arg0 == arg3 && arg1 == arg6) {
			Static419.method5687(arg5, arg1, arg0, arg8, arg4);
			return;
		}
		@Pc(28) int local28 = arg5;
		@Pc(30) int local30 = arg8;
		@Pc(34) int local34 = arg5 * 3;
		@Pc(38) int local38 = arg8 * 3;
		@Pc(42) int local42 = arg7 * 3;
		@Pc(46) int local46 = arg2 * 3;
		@Pc(50) int local50 = arg3 * 3;
		@Pc(54) int local54 = arg6 * 3;
		@Pc(63) int local63 = local42 + arg0 - arg5 - local50;
		@Pc(73) int local73 = arg1 + local46 - local54 - arg8;
		@Pc(81) int local81 = local50 + local34 - local42 - local42;
		@Pc(90) int local90 = local38 + local54 - local46 - local46;
		@Pc(94) int local94 = local42 - local34;
		@Pc(99) int local99 = local46 - local38;
		for (@Pc(101) int local101 = 128; local101 <= 4096; local101 += 128) {
			@Pc(109) int local109 = local101 * local101 >> 12;
			@Pc(115) int local115 = local101 * local109 >> 12;
			@Pc(119) int local119 = local115 * local63;
			@Pc(123) int local123 = local73 * local115;
			@Pc(127) int local127 = local109 * local81;
			@Pc(131) int local131 = local109 * local90;
			@Pc(135) int local135 = local101 * local94;
			@Pc(139) int local139 = local101 * local99;
			@Pc(149) int local149 = arg5 + (local135 + local127 + local119 >> 12);
			@Pc(160) int local160 = (local131 + local123 + local139 >> 12) + arg8;
			Static419.method5687(local28, local160, local149, local30, arg4);
			local30 = local160;
			local28 = local149;
		}
	}

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(I)V")
	public static void method728() {
		if (Static67.anInt1777 < 0) {
			Static168.anInt3256 = -1;
			Static67.anInt1777 = 0;
			Static452.anInt7845 = -1;
		}
		if (Static169.anInt3168 < Static67.anInt1777) {
			Static67.anInt1777 = Static169.anInt3168;
			Static452.anInt7845 = -1;
			Static168.anInt3256 = -1;
		}
		if (Static393.anInt6878 < 0) {
			Static393.anInt6878 = 0;
			Static452.anInt7845 = -1;
			Static168.anInt3256 = -1;
		}
		if (Static393.anInt6878 > Static169.anInt3160) {
			Static393.anInt6878 = Static169.anInt3160;
			Static168.anInt3256 = -1;
			Static452.anInt7845 = -1;
		}
	}
}
