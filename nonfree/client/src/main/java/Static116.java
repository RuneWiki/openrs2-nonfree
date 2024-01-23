import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "[[S")
	public static short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!lj", name = "j", descriptor = "B")
	public static byte aByte9;

	@OriginalMember(owner = "client!lj", name = "n", descriptor = "Lclient!mc;")
	public static Class65 aClass65_4;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "Lclient!kh;")
	public static Class60 aClass60_873 = Static200.method3116("VOLL");

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "Lclient!ge;")
	public static Class39 aClass39_14 = new Class39(64);

	@OriginalMember(owner = "client!lj", name = "i", descriptor = "Lclient!kh;")
	public static Class60 aClass60_874 = Static200.method3116("Angreifen");

	@OriginalMember(owner = "client!lj", name = "l", descriptor = "Lclient!kh;")
	public static Class60 aClass60_875 = Static200.method3116("Zugewiesener Speicher)3");

	@OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
	public static int anInt2635 = 0;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "([BIZ)Ljava/lang/Object;")
	public static Object method1977(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static136.aBoolean165) {
			try {
				@Pc(20) Class54 local20 = (Class54) Class.forName("Class54_Sub1").getDeclaredConstructor().newInstance();
				local20.method2719(arg0);
				return local20;
			} catch (@Pc(27) Throwable local27) {
				Static136.aBoolean165 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIII[[[B[I[I[I[I[IIBII)V")
	public static void method1978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[][][] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(14) int arg12, @OriginalArg(15) int arg13) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static83.anInt1959 * 128) {
			arg0 = Static83.anInt1959 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static150.anInt3350 * 128) {
			arg2 = Static150.anInt3350 * 128 - 1;
		}
		Static143.anInt3207 = Class46.anIntArray226[arg3];
		Static39.anInt883 = Class46.anIntArray225[arg3];
		Static171.anInt3703 = Class46.anIntArray226[arg4];
		Static131.anInt2854 = Class46.anIntArray225[arg4];
		Static201.anInt4280 = arg0;
		Static105.anInt2387 = arg1;
		Static155.anInt3455 = arg2;
		Static36.anInt3886 = arg0 / 128;
		Static201.anInt4281 = arg2 / 128;
		Static69.anInt1709 = arg5;
		Static68.anInt1688 = Static36.anInt3886 - Static39.anInt884;
		if (Static68.anInt1688 < 0) {
			Static68.anInt1688 = 0;
		}
		Static140.anInt3131 = Static201.anInt4281 - Static39.anInt884;
		if (Static140.anInt3131 < 0) {
			Static140.anInt3131 = 0;
		}
		Static186.anInt3977 = Static36.anInt3886 + Static39.anInt884;
		if (Static186.anInt3977 > Static83.anInt1959) {
			Static186.anInt3977 = Static83.anInt1959;
		}
		Static12.anInt346 = Static201.anInt4281 + Static39.anInt884;
		if (Static12.anInt346 > Static150.anInt3350) {
			Static12.anInt346 = Static150.anInt3350;
		}
		@Pc(104) int local104;
		@Pc(115) int local115;
		for (@Pc(101) int local101 = 0; local101 < Static39.anInt884 + Static39.anInt884 + 2; local101++) {
			for (local104 = 0; local104 < Static39.anInt884 + Static39.anInt884 + 2; local104++) {
				local115 = (local101 - Static39.anInt884 << 7) - (Static201.anInt4280 & 0x7F);
				@Pc(125) int local125 = (local104 - Static39.anInt884 << 7) - (Static155.anInt3455 & 0x7F);
				@Pc(131) int local131 = Static36.anInt3886 + local101 - Static39.anInt884;
				@Pc(137) int local137 = Static201.anInt4281 + local104 - Static39.anInt884;
				if (local131 >= 0 && local137 >= 0 && local131 < Static83.anInt1959 && local137 < Static150.anInt3350) {
					@Pc(161) int local161;
					if (Static68.anIntArrayArrayArray10 == null) {
						local161 = Static130.anIntArrayArrayArray16[0][local131][local137] + 128 - Static105.anInt2387;
					} else {
						local161 = Static68.anIntArrayArrayArray10[0][local131][local137] + 128 - Static105.anInt2387;
					}
					@Pc(186) int local186 = Static130.anIntArrayArrayArray16[3][local131][local137] - Static105.anInt2387 - 1000;
					Static138.aBooleanArrayArray2[local101][local104] = Static198.method3097(local115, local186, local161, local125);
				} else {
					Static138.aBooleanArrayArray2[local101][local104] = false;
				}
			}
		}
		for (local104 = 0; local104 < Static39.anInt884 + Static39.anInt884 + 1; local104++) {
			for (local115 = 0; local115 < Static39.anInt884 + Static39.anInt884 + 1; local115++) {
				Static86.aBooleanArrayArray1[local104][local115] = Static138.aBooleanArrayArray2[local104][local115] || Static138.aBooleanArrayArray2[local104 + 1][local115] || Static138.aBooleanArrayArray2[local104][local115 + 1] || Static138.aBooleanArrayArray2[local104 + 1][local115 + 1];
			}
		}
		Static24.anIntArray95 = arg7;
		Static131.anIntArray368 = arg8;
		Static114.anIntArray330 = arg9;
		Static38.anIntArray130 = arg10;
		Static131.anIntArray367 = arg11;
		Static18.method330();
		Static114.method1969(arg0, arg1, arg2, arg6, arg12, arg13);
	}
}
