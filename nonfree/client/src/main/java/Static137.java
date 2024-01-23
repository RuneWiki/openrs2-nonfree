import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!k", name = "c", descriptor = "[I")
	public static int[] anIntArray227;

	@OriginalMember(owner = "client!k", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray23;

	@OriginalMember(owner = "client!k", name = "f", descriptor = "[I")
	public static int[] anIntArray228 = new int[32];

	@OriginalMember(owner = "client!k", name = "h", descriptor = "I")
	public static int anInt2297 = 0;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIII)V")
	public static void method1693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static222.anInt4708 = arg1;
		Static186.anInt4094 = arg3;
		Static100.anInt2282 = arg0;
		Static121.anInt2627 = arg2;
		Static49.anInt1170 = arg4;
		if (Static121.anInt2627 >= 100) {
			@Pc(29) int local29 = Static49.anInt1170 * 128 + 64;
			@Pc(35) int local35 = Static222.anInt4708 * 128 + 64;
			@Pc(43) int local43 = Static93.method1576(local35, local29, Static185.anInt4085) - Static100.anInt2282;
			@Pc(48) int local48 = local43 - Static315.anInt6297;
			@Pc(53) int local53 = local35 - Static94.anInt2161;
			@Pc(58) int local58 = local29 - Static58.anInt1269;
			@Pc(69) int local69 = (int) Math.sqrt((double) (local53 * local53 + local58 * local58));
			Static44.anInt1071 = (int) (Math.atan2((double) local48, (double) local69) * 325.949D) & 0x7FF;
			Static120.anInt6251 = (int) (-325.949D * Math.atan2((double) local58, (double) local53)) & 0x7FF;
			if (Static44.anInt1071 < 128) {
				Static44.anInt1071 = 128;
			}
			if (Static44.anInt1071 > 383) {
				Static44.anInt1071 = 383;
			}
		}
		Static106.anInt2378 = 2;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!qm;Z)Ljava/lang/String;")
	public static String method1696(@OriginalArg(1) Class1_Sub14 arg0) {
		try {
			@Pc(7) int local7 = arg0.method2187();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(19) byte[] local19 = new byte[local7];
			arg0.anInt3000 += Static12.aClass70_2.method1731(local7, arg0.aByteArray55, local19, arg0.anInt3000, 0);
			return Static166.method2722(0, local19, local7);
		} catch (@Pc(49) Exception local49) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIZIIB)V")
	public static void method1698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static232.anInt4886 = arg5;
		Static211.anInt4570 = arg1;
		Static206.anInt4454 = arg0;
		Static130.anInt2879 = arg4;
		Static82.anInt1930 = arg2;
		if (arg3 && Static211.anInt4570 >= 100) {
			Static58.anInt1269 = Static82.anInt1930 * 128 + 64;
			Static94.anInt2161 = Static206.anInt4454 * 128 + 64;
			Static315.anInt6297 = Static93.method1576(Static94.anInt2161, Static58.anInt1269, Static185.anInt4085) - Static232.anInt4886;
		}
		Static106.anInt2378 = 2;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
	public static void method1700() {
		Static230.aClass89_16.method2266();
	}
}
