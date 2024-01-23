import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!km", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!km", name = "h", descriptor = "[I")
	public static int[] anIntArray238;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString100 = "Walk here";

	@OriginalMember(owner = "client!km", name = "c", descriptor = "I")
	public static int anInt2911 = 0;

	@OriginalMember(owner = "client!km", name = "j", descriptor = "J")
	public static long aLong109 = 0L;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method2344(@OriginalArg(0) String arg0) {
		for (@Pc(17) int local17 = 0; local17 < Static267.aStringArray34.length; local17++) {
			if (Static267.aStringArray34[local17].equalsIgnoreCase(arg0)) {
				return local17;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIIIZIIIII)V")
	public static void method2345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) boolean arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) int arg7, @OriginalArg(11) int arg8) {
		@Pc(15) int local15 = arg2 - arg8;
		@Pc(17) int local17 = -1;
		if (Static64.anInt1391 > 0) {
			if (Static115.anInt2343 > 10) {
				local17 = (10 + 10 - Static115.anInt2343) * 5;
			} else {
				local17 = Static115.anInt2343 * 5;
			}
		}
		@Pc(44) int local44 = arg6 - arg7;
		@Pc(48) int local48 = 983040 / arg1;
		@Pc(52) int local52 = 983040 / arg0;
		for (@Pc(55) int local55 = -local48; local55 < local48 + local15; local55++) {
			@Pc(70) int local70 = arg1 * (local55 + 1) >> 16;
			@Pc(78) int local78 = arg1 * local55 >> 16;
			@Pc(83) int local83 = local70 - local78;
			if (local83 > 0) {
				@Pc(96) int local96 = local55 + arg8 >> 6;
				local78 += arg3;
				if (local96 >= 0 && Static243.anIntArrayArrayArray13.length - 1 >= local96) {
					@Pc(116) int[][] local116 = Static243.anIntArrayArrayArray13[local96];
					for (@Pc(119) int local119 = -local52; local119 < local44 + local52; local119++) {
						@Pc(140) int local140 = (local119 + 1) * arg0 >> 16;
						@Pc(148) int local148 = arg0 * local119 >> 16;
						@Pc(153) int local153 = local140 - local148;
						if (local153 > 0) {
							@Pc(162) int local162 = local119 + arg7 >> 6;
							local148 += arg5;
							if (local162 >= 0 && local162 <= local116.length - 1 && local116[local162] != null) {
								@Pc(209) int local209 = (arg8 + local55 & 0x3F) + ((local119 + arg7 & 0x3F) << 6);
								@Pc(215) int local215 = local116[local162][local209];
								if (local215 != 0) {
									@Pc(226) Class73 local226 = Static296.method4591(local215 - 1);
									if (!Static213.aBooleanArray29[local226.anInt2265]) {
										if (local17 != -1 && Static236.anInt4701 == local226.anInt2265) {
											@Pc(261) Class4_Sub16 local261 = new Class4_Sub16();
											local261.anInt1898 = local148;
											local261.anInt1900 = local78;
											local261.anInt1897 = local226.anInt2265;
											Static16.aClass17_1.method619(local261);
										} else {
											Static126.aClass4_Sub2_Sub4_Sub2Array2[local226.anInt2265].method4142(local78 - 7, local148 + -7);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		for (@Pc(288) Class4_Sub16 local288 = (Class4_Sub16) Static16.aClass17_1.method613(); local288 != null; local288 = (Class4_Sub16) Static16.aClass17_1.method607()) {
			Static258.method4027(local288.anInt1900, local288.anInt1898, 15, 16776960, local17);
			Static258.method4027(local288.anInt1900, local288.anInt1898, 13, 16776960, local17);
			Static258.method4027(local288.anInt1900, local288.anInt1898, 11, 16776960, local17);
			Static258.method4027(local288.anInt1900, local288.anInt1898, 9, 16776960, local17);
			Static126.aClass4_Sub2_Sub4_Sub2Array2[local288.anInt1897].method4142(local288.anInt1900 - 7, local288.anInt1898 - 7);
		}
		Static16.aClass17_1.method618();
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(BLclient!cg;)V")
	public static void method2346(@OriginalArg(1) Class22 arg0) {
		Static214.aClass22_98 = arg0;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method2347(@OriginalArg(0) int arg0) {
		return Static156.aStringArray21[arg0].length() <= 0 ? Static52.aStringArray6[arg0] : Static52.aStringArray6[arg0] + Static169.aString120 + Static156.aStringArray21[arg0];
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ZJI[I)Ljava/lang/String;")
	public static String method2349(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (Static113.anInterface3_1 != null) {
			@Pc(13) String local13 = Static113.anInterface3_1.method236(arg1, arg2, arg0);
			if (local13 != null) {
				return local13;
			}
		}
		return Long.toString(arg0);
	}
}
